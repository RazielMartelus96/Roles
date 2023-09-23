package io.curiositycore.roles.model.factories;

import org.apache.commons.lang3.NotImplementedException;
import org.bukkit.configuration.ConfigurationSection;

public class PermissionFactory implements Factory{
    private ConfigurationSection permissionSection;

    @Override
    public void setConfigSection(ConfigurationSection sectionToSet) {
        this.permissionSection = sectionToSet;
    }

    @Override
    public void build() {
        //TODO implement the build (which will involve the adding of all the permissions to the PermissionManager)
        throw new NotImplementedException("Not implemented permission build yet");
    }
}
