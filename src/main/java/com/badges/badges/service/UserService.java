package com.badges.badges.service;

import com.badges.badges.pojo.DTO.UserRequestDto;
import com.badges.badges.pojo.PO.User;
import com.badges.badges.pojo.VO.UserInfoVo;

public interface UserService {
    User findUserByName(String username);
    UserInfoVo findUserInfoByName(UserRequestDto dto);
}
