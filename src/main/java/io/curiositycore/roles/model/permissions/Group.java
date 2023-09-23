package io.curiositycore.roles.model.permissions;

import org.apache.commons.lang3.NotImplementedException;

public class Group implements Permission<Role> {

    @Override
    public String getId() {
       throw new NotImplementedException("Getting id of a LP group is not currently implemented");
    }

    @Override
    public int getPriority() {
        throw new NotImplementedException("Getting the priority of a LP group is not currently implemented");
    }

    @Override
    public Role[] getLinkedPermissions() {
        throw new NotImplementedException("Getting the linked discord roles of a LP group is not currently implemented");
    }
}
