package com.badges.badges.service;

import com.badges.badges.pojo.PO.User;

public interface UserService {
    User findUserByName(String username);
}
