package io.curiositycore.roles.model.users;

import io.curiositycore.roles.model.permissions.Permission;
import org.apache.commons.lang3.NotImplementedException;

public class DiscordUser implements User<String> {
    private String discordId;
    private String[] discordRoleIds;

    public DiscordUser(String discordId){
        this.discordId = discordId;
        this.discordRoleIds = initDiscordRoleIds();
    }
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
        return this.discordRoleIds;
    }

    private String[] initDiscordRoleIds(){
        //TODO do logic to init the discord roles for this user here.
        throw new NotImplementedException("Not currently implemented");
        //TODO logic to apply permission here
    }
}
