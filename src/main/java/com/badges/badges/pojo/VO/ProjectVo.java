package com.badges.badges.pojo.VO;

import lombok.Data;

import java.util.List;

@Data
public class ProjectVo {
    private String name;
    private int idx;
    private List<TagVo> tagList;
    private int progress;
    private String pattern;
    private String bgColor;
    private List<KrVo> krList;
}
