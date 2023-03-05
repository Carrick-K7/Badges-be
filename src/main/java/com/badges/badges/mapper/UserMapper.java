package com.badges.badges.mapper;

import com.badges.badges.pojo.PO.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper extends BaseMapper<User> {

    User findUserByUsername(String username);
}
