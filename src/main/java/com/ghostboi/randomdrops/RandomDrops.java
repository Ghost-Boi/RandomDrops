package com.ghostboi.randomdrops;

import org.bukkit.plugin.java.JavaPlugin;

public final class RandomDrops extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin Loaded!");

        getServer().getPluginManager().registerEvents(new BreakBlock(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
