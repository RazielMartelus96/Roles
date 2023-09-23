package io.curiositycore.roles.model.permissions;

public class Group implements Permission<Role> {

    @Override
    public String getId() {
        return null;
    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public Role[] getLinkedPermissions() {
        return new Role[0];
    }
}
