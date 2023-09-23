package io.curiositycore.roles.model.factories;

import org.bukkit.configuration.ConfigurationSection;

public interface Factory {
    void setConfigSection(ConfigurationSection sectionToSet);
    void build();
}
