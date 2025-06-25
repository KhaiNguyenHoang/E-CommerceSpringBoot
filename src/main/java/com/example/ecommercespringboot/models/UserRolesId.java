package com.example.ecommercespringboot.models;

import java.io.Serializable;
import java.util.Objects;

public class UserRolesId implements Serializable {

    private String userId;
    private String roleId;

    public UserRolesId() {}

    public UserRolesId(String userId, String roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserRolesId)) return false;
        UserRolesId that = (UserRolesId) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(roleId, that.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, roleId);
    }
}
