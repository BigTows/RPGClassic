package ru.rpgc.listener.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import ru.rpgc.RPGC;
import ru.rpgc.debug.Log;

/**
 * Created by bigtows on 10/07/2017.
 */
public class BranchCommandListener implements CommandExecutor {
    private RPGC plugin;
    private BranchCommandHelper helper = new BranchCommandHelper();

    public BranchCommandListener(RPGC plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length > 0) {
            Log.c(sender, "|" + args[0] + "|");
        } else {
            helper.writeHelpList(sender);
        }

        return true;
    }
}

class BranchCommandHelper implements CommandUtilis {

    @Override
    public void writeHelpList(CommandSender sender) {
        Log.c(sender, "§2----------------[Branch HELP]----------------");
        Log.c(sender, "§a|  /branch create [NAME_BRANCH] [TYPE_MOB]  |");
        Log.c(sender, "§a|      /branch set [PROPERTY] [VALUE]       |");
        Log.c(sender, "§2---------------------------------------------");
    }
}