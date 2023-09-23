package io.curiositycore.roles.model.users;

import io.curiositycore.roles.model.permissions.Permission;

public interface User<T> {
    T getId();
    void applyPermission(Permission<?> permissionToApply);
    String[] getPermissionIds();
}
