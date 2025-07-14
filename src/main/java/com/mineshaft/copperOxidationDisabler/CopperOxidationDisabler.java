package com.mineshaft.copperOxidationDisabler;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CopperOxidationDisabler extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        LogInfo("");
        LogInfo("The \"Copper Oxidation Disabler\" by SF-24 has been enabled.");
        LogInfo("Please report bugs at github.com/SF-24");
        LogInfo("");
    }

    public static void LogInfo(String message) {
        Bukkit.getServer().getLogger().info(message);
    }
}
