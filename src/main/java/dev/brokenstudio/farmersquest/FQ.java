package dev.brokenstudio.farmersquest;

import org.bukkit.plugin.java.JavaPlugin;

/*
    Project: FarmersQuest
    File: FQ
    Created by: Jan Z.
    Created at: 08.08.2022
     
    © 2022 BrokenStudio x Jan
*/
public class FQ extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("---------------[FarmersQuest]---------------");
        getLogger().info("The main plugin for the FarmersQuest server.");
        getLogger().info("---------------------------------------------");
        getLogger().info("Version: " + Data.VERSION);
        getLogger().info("Author: " + Data.AUTHOR);
        getLogger().info("Author-Email: " + Data.AUTHOR_EMAIL);
        getLogger().info("Author-Website: " + Data.AUTHOR_WEBSITE);
        getLogger().info("Author-Github: " + Data.AUTHOR_GITHUB);
        getLogger().info("---------------[FarmersQuest]---------------");
    }

    @Override
    public void onDisable() {

    }
}
