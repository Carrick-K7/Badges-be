package com.badges.badges.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserController {
    @PostMapping("/user/search")
    public String getUserDetail(@RequestBody String id){
        return "用户详情:" + id;
    }
}
