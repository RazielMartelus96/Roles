package io.curiositycore.roles.model.users;

import io.curiositycore.roles.model.permissions.Permission;
import org.apache.commons.lang3.NotImplementedException;

public class DiscordUser implements User<String> {
    String discordId;
    String[] discordRoleIds;
    @Override
    public String getId() {
        return this.discordId;
    }

    @Override
    public void applyPermission(Permission<?> permissionToApply) {
        //TODO logic to apply permission here
        throw new NotImplementedException("Not currently implemented");
    }

    @Override
    public String[] getPermissionIds() {
        return new String[0];
    }

    private String[] initDiscordRoleIds(){
        //TODO do logic to init the discord roles for this user here.
        throw new NotImplementedException("Not currently implemented");
        //TODO logic to apply permission here
    }
}
