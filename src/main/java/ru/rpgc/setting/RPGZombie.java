package ru.rpgc.setting;


import net.minecraft.server.v1_11_R1.EntityZombie;
import org.bukkit.craftbukkit.v1_11_R1.CraftServer;
import org.bukkit.craftbukkit.v1_11_R1.entity.CraftZombie;
import org.bukkit.entity.Entity;

/**
 * Created by bigtows on 10/07/2017.
 */
public abstract class RPGZombie extends CraftZombie implements Entity {


    public RPGZombie(CraftServer server, EntityZombie entity) {
        super(server, entity);
    }

    public String getMessage() {
        return "NOOOOO!";
    }
}
