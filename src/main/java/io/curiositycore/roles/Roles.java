package io.curiositycore.roles;

import io.curiositycore.roles.listeners.UserListener;
import io.curiositycore.roles.model.factories.PermissionFactory;
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
        PermissionFactory permissionFactory = new PermissionFactory();
        permissionFactory.setConfigSection(this.getConfig().getConfigurationSection("spigot-discord"));
        permissionFactory.build();
    }

    private void initialiseListeners(){
        this.getServer().getPluginManager().registerEvents(new UserListener(),this);
    }
}
