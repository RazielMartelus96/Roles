package io.curiositycore.roles.model.permissions;

public class Role implements Permission<Group>{
    @Override
    public String getId() {
        return null;
    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public Group[] getLinkedPermissions() {
        return new Group[0];
    }
}
