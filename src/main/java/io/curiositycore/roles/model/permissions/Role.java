package io.curiositycore.roles.model.permissions;

import org.apache.commons.lang3.NotImplementedException;

public class Role implements Permission<Group>{
    @Override
    public String getId() {
        //TODO implement this
        throw new NotImplementedException("Getting the discord role's id is not yet implemented");
    }

    @Override
    public int getPriority() {
        //TODO implement this
        throw new NotImplementedException("Priority selection for discord roles not yet implemented");
    }

    @Override
    public Group[] getLinkedPermissions() {
        //TODO implement this
        throw new NotImplementedException("Getting all the Groups linked to this discord role is not yet implemented");
    }
}
