package io.curiositycore.roles.model.users;

import io.curiositycore.roles.model.permissions.Permission;
import org.apache.commons.lang3.NotImplementedException;

import java.util.UUID;

public class PlayerUser implements User<UUID> {
    private UUID playerId;
    private String[] playersRoleIds;
    public PlayerUser(UUID playerId){
        this.playerId = playerId;
        this.playersRoleIds = initPermissionIds();
    }
    @Override
    public UUID getId() {
        return this.playerId;
    }

    @Override
    public void applyPermission(Permission<?> permissionToApply) {
        //TODO logic to apply permission here
        throw new NotImplementedException("Not currently implemented");
    }

    @Override
    public String[] getPermissionIds() {
        return this.playersRoleIds;
    }

    private String[] initPermissionIds(){
        //TODO logic for getting the players current luck perms permissions here
        throw new NotImplementedException("Not currently implemented");

    }
}
