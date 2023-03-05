package com.badges.badges.pojo;

import com.badges.badges.pojo.ENUM.RoleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private RoleType roleType;
}
