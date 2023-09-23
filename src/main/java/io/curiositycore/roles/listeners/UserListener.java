package io.curiositycore.roles.listeners;

import io.curiositycore.roles.model.UserManager;
import io.curiositycore.roles.model.users.PlayerUser;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class UserListener implements Listener {
    private UserManager userManager = UserManager.getInstance();

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent playerJoinEvent){
        PlayerUser playerUser = new PlayerUser(playerJoinEvent.getPlayer().getUniqueId());
        userManager.registerUser(playerUser);
    }
}
