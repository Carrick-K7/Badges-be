package com.badges.badges.controller;

import cn.hutool.jwt.JWT;
import com.badges.badges.pojo.DTO.LoginDto;
import com.badges.badges.service.UserServiceImpl;
import com.badges.badges.utils.JWTConstant;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.Date;

@RestController
@RequestMapping()
public class AuthController {
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public String login(@RequestBody LoginDto loginDto){
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword());
        authenticationManager.authenticate(authenticationToken);
        return JWT.create()
                .setExpiresAt(new Date(System.currentTimeMillis() + (1000 * 30)))
                .setPayload("username", loginDto.getUsername())
                .setKey(JWTConstant.JWT_SIGN_KEY.getBytes(StandardCharsets
                        .UTF_8))
                .sign();
    }

    @PostMapping("/register")
    public String register(@RequestBody LoginDto loginDto) {
        return userService.register(loginDto) > 0 ? "注册成功" : "用户已存在";
    }
}
