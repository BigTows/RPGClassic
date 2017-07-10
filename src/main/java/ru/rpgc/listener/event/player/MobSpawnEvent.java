package ru.rpgc.listener.event.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import ru.rpgc.debug.Log;

/**
 * Created by bigtows on 04/07/2017.
 */
public class MobSpawnEvent implements Listener {

    public MobSpawnEvent() {

    }

    @EventHandler
    public void onSpawn(CreatureSpawnEvent event) {
        event.setCancelled(isDisabledSpawnReason(event.getSpawnReason()));
        if (!event.isCancelled())
            Log.i("Spawn reason: " + event.getSpawnReason().toString());
    }

    boolean isDisabledSpawnReason(CreatureSpawnEvent.SpawnReason spawnReason) {
        switch (spawnReason) {
            case NATURAL:
            case OCELOT_BABY:
            case MOUNT:
            case JOCKEY:
            case CHUNK_GEN:
            case DEFAULT:
                return true;
            default:
                return false;
        }
    }
}
