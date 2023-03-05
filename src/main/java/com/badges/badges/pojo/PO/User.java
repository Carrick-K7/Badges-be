package com.badges.badges.pojo.PO;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @TableId
    private String id;
    private String username;
    private String password;

    @TableField(typeHandler = JacksonTypeHandler.class)
    private List<String> roles;
    private boolean enabled;
}
