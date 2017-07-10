package ru.rpgc.listener.event.player;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import ru.rpgc.RPGC;
import ru.rpgc.setting.RPGZombie;

/**
 * Created by bigtows on 10/07/2017.
 */
public class MobDiedEvent implements Listener {
    public MobDiedEvent() {

    }

    @EventHandler
    public void onMobDied(EntityDeathEvent entityDeathEvent) {
        if (entityDeathEvent.getEntity() instanceof Zombie) {
            Entity zombie = (Entity) entityDeathEvent.getEntity();
            int idZombie = RPGC.entityHashMap.get(zombie);
            if (idZombie > 0) {
                entityDeathEvent.getEntity().getKiller().sendMessage("Yes " + idZombie);
            }
        }
    }
}
