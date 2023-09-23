package io.curiositycore.roles.model.factories;

import org.apache.commons.lang3.NotImplementedException;
import org.bukkit.configuration.ConfigurationSection;

public class PermssionFactory implements Factory{
    private ConfigurationSection permissionSection;

    @Override
    public void setConfigSection(ConfigurationSection sectionToSet) {
        this.permissionSection = sectionToSet;
    }

    @Override
    public void build() {
        throw new NotImplementedException("Not implemented permission build yet");
    }
}
