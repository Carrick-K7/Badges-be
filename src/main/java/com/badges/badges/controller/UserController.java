package com.badges.badges.controller;

import com.badges.badges.pojo.DTO.UserRequestDto;
import com.badges.badges.pojo.VO.UserInfoVo;
import com.badges.badges.service.UserServiceImpl;
import com.badges.badges.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/search")
    public BaseResult<UserInfoVo> getUserInfo(@RequestBody UserRequestDto dto){
        try {
            return BaseResult.success(userService.findUserInfoByName(dto));
        } catch (Exception e) {
            return BaseResult.error(e.getMessage());
        }
    }
}
