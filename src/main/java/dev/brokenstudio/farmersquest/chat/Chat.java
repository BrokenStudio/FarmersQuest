package dev.brokenstudio.farmersquest.chat;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/*
    Project: FarmersQuest
    File: Chat
    Created by: Jan Z.
    Created at: 08.08.2022
     
    © 2022 BrokenStudio x Jan
*/
public class Chat {

    //✔✗!»

    public static void info(Player player, String message) {
        player.sendMessage("§8[§7»§8] §7" + message);
    }

    public static void error(Player player, String message) {
        player.sendMessage("§8[§c✗§8] §c" + message);
    }

    public static void debug(String message) {
        Bukkit.getConsoleSender().sendMessage("§8[§cDEBUG§8] §c" + message);
    }

    public static void warn(Player player, String message) {
        player.sendMessage("§8[§e!§8] §e" + message);
    }

    public static void success(Player player, String message) {
        player.sendMessage("§8[§e✔§8] §e" + message);
    }

    public static void info(Player player, String message, Object... args) {
        player.sendMessage("§8[§7»§8] §7" + String.format(message, args));
    }

    public static void error(Player player, String message, Object... args) {
        player.sendMessage("§8[§c✗§8] §c" + String.format(message, args));
    }

    public static void debug(Player player, String message, Object... args) {
        player.sendMessage("§8[§cDEBUG§8] §c" + String.format(message, args));
    }

    public static void warn(Player player, String message, Object... args) {
        player.sendMessage("§8[§e!§8] §e" + String.format(message, args));
    }

    public static void success(Player player, String message, Object... args) {
        player.sendMessage("§8[§e✔§8] §e" + String.format(message, args));
    }

}
