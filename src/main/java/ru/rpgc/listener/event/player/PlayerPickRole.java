package ru.rpgc.listener.event.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import ru.rpgc.RPGC;

/**
 * Created by bigtows on 01/07/2017.
 */
public class PlayerPickRole implements Listener {

    private RPGC rpgClassic;

    public PlayerPickRole(RPGC plugin) {
        this.rpgClassic = plugin;
    }

    @EventHandler
    public void onMove(PlayerJoinEvent event) {


    }


}
