package ru.rpgc.listener.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import ru.rpgc.RPGC;
import ru.rpgc.debug.Log;

/**
 * Created by bigtows on 10/07/2017.
 */
public class CoverageCommandListener implements CommandExecutor {
    private RPGC plugin;
    private CoverageCommandHelper helper = new CoverageCommandHelper();

    public CoverageCommandListener(RPGC rpgc) {
        this.plugin = rpgc;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length > 0) {
            if (args[0].equalsIgnoreCase("set")) {

            }
        } else {
            helper.writeHelpList(sender);
        }
        return false;
    }
}

class CoverageCommandHelper implements CommandUtilis {

    @Override
    public void writeHelpList(CommandSender sender) {
        Log.c(sender, "§2----------------[Coverage HELP]----------------");
        Log.c(sender, "§a|      /coverage create [NAME_BRANCH]     |");
        Log.c(sender, "§a|      /coverage set [PROPERTY] [VALUE]     |");
        Log.c(sender, "§2---------------------------------------------");
    }
}
