package com.badges.badges.pojo.VO;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("dbtest")
public class TestVo {
    private Long id;
    private String user;
    private String mobile;
}