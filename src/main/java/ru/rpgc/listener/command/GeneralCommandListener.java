package ru.rpgc.listener.command;

import net.minecraft.server.v1_11_R1.World;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_11_R1.CraftWorld;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import ru.rpgc.CustomZombie;
import ru.rpgc.RPGC;

/**
 * Created by bigtows on 10/07/2017.
 */
public class GeneralCommandListener implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;
        Location locationPlayer = player.getLocation();

        RPGC.entityHashMap.put(locationPlayer.getWorld().spawnEntity(locationPlayer, EntityType.ZOMBIE), 1);


        return true;
    }
}
