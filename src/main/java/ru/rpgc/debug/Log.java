package ru.rpgc.debug;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

/**
 * Created by bigtows on 01/07/2017.
 */
public class Log {
    private static ConsoleCommandSender sender = Bukkit.getServer().getConsoleSender();

    public static void e(String errorText) {
        sender.sendMessage("§c" + errorText);
    }


    public static void i(String infoText) {
        sender.sendMessage("§e" + infoText);
    }

    /**
     * To chat
     */
    public static void c(CommandSender sender, String text) {
        sender.sendMessage(text);
    }
}
