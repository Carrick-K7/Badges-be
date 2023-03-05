package com.badges.badges.pojo.VO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class TagVo {
    private String name;
    @JsonIgnore
    private String projectId;
}
