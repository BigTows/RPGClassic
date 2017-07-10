package ru.rpgc;

import net.minecraft.server.v1_11_R1.EntityTypes;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.java.JavaPlugin;
import ru.rpgc.listener.command.BranchCommandListener;
import ru.rpgc.listener.command.CoverageCommandListener;
import ru.rpgc.listener.command.GeneralCommandListener;
import ru.rpgc.listener.event.player.MobDiedEvent;
import ru.rpgc.listener.event.player.MobSpawnEvent;
import ru.rpgc.listener.event.player.PlayerPickRole;
import ru.rpgc.setting.RPGZombie;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;


public final class RPGC extends JavaPlugin {


    public static HashMap<Entity, Integer> entityHashMap = new HashMap<>();

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new PlayerPickRole(this), this);
        this.getServer().getPluginManager().registerEvents(new MobSpawnEvent(), this);
        this.getServer().getPluginManager().registerEvents(new MobDiedEvent(), this);
        this.getCommand("create").setExecutor(new GeneralCommandListener());
        this.getCommand("branch").setExecutor(new BranchCommandListener(this));
        this.getCommand("coverage").setExecutor(new CoverageCommandListener(this));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
