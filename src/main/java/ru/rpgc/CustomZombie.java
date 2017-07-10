package ru.rpgc;

import net.minecraft.server.v1_11_R1.EntityZombie;
import net.minecraft.server.v1_11_R1.GenericAttributes;
import net.minecraft.server.v1_11_R1.World;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Created by bigtows on 10/07/2017.
 */
public class CustomZombie extends EntityZombie {
    public CustomZombie(World world) {
        super(world);
        this.getAttributeInstance(GenericAttributes.maxHealth).setValue(100); //Max Health
        this.setHealth(100);
        this.fireProof = true;
    }

    @Override
    public String getName() //This will change the name in death messages along with other things
    {
        return "Tough Zombie";
    }

    @Override
    public void dropDeathLoot(boolean flag, int i) {
        this.world.getWorld().dropItem(this.getBukkitEntity().getLocation(), new ItemStack(Material.DIAMOND));
    }
}
