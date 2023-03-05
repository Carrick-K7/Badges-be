package com.badges.badges.mapper;

import com.badges.badges.pojo.DTO.UserRequestDto;
import com.badges.badges.pojo.VO.TagVo;
import com.badges.badges.pojo.PO.User;
import com.badges.badges.pojo.VO.ProjectVo;
import com.badges.badges.pojo.VO.UserInfoVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper extends BaseMapper<User> {

    User findUserByUsername(String username);

    UserInfoVo getUserInfo(UserRequestDto dto);
    long getIdByUsername(UserRequestDto dto);
    List<ProjectVo> getProjectByUserId(long userId);
    List<TagVo> getTagByUserId(long userId);
}
