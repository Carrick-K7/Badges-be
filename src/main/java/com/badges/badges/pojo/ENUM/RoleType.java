package com.badges.badges.pojo.ENUM;

public enum RoleType {
    ADMIN("admin"),
    USER("user");

    private final String roleName;

    RoleType(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
