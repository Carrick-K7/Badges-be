package com.badges.badges.service;

import com.badges.badges.mapper.UserMapper;
import com.badges.badges.pojo.DTO.LoginDto;
import com.badges.badges.pojo.DTO.UserRequestDto;
import com.badges.badges.pojo.VO.TagVo;
import com.badges.badges.pojo.PO.User;
import com.badges.badges.pojo.VO.ProjectVo;
import com.badges.badges.pojo.VO.UserInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserMapper userMapper;

    public int register(LoginDto loginDto) {
        Map<String, Object> map = new HashMap<>();
        map.put("username", loginDto.getUsername());
        if(userMapper.selectByMap(map).size() == 0) {
            User user = new User();
            user.setUsername(loginDto.getUsername());
            user.setPassword(passwordEncoder.encode(loginDto.getPassword()));
            user.setRoles(List.of("user"));
            user.setEnabled(true);
            return userMapper.insert(user);
        }
        return 0;
    }

    @Override
    public User findUserByName(String username) {
        return userMapper.findUserByUsername(username);
    }

    @Override
    public UserInfoVo findUserInfoByName(UserRequestDto dto) {
        UserInfoVo userInfoVo = userMapper.getUserInfo(dto);
        long userId = userInfoVo.getUserId();
        List<ProjectVo> projectList = userMapper.getProjectByUserId(userId);
        List<TagVo> tagList = userMapper.getTagByUserId(userId);
        userInfoVo.setProjectList(projectList);
        userInfoVo.setTagList(tagList);
        return userInfoVo;
    }


}
