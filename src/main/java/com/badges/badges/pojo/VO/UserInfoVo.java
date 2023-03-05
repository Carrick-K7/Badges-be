package com.badges.badges.pojo.VO;

import lombok.Data;

import java.util.List;

@Data
public class UserInfoVo {
    private long userId;
    private String userName;
    private String avatar;
    private String email;
    private List<ProjectVo> projectList;
    private List<TagVo> tagList;
}
