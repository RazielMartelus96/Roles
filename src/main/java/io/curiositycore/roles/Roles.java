package io.curiositycore.roles;

import io.curiositycore.roles.listeners.UserListener;
import io.curiositycore.roles.model.factories.PermssionFactory;
import org.bukkit.plugin.java.JavaPlugin;

public final class Roles extends JavaPlugin {

    @Override
    public void onEnable() {
        initPermissions();
        initialiseListeners();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void initPermissions(){
        PermssionFactory permssionFactory = new PermssionFactory();
        permssionFactory.setConfigSection(this.getConfig().getConfigurationSection("spigot-discord"));
        permssionFactory.build();
    }

    private void initialiseListeners(){
        this.getServer().getPluginManager().registerEvents(new UserListener(),this);
    }
}
