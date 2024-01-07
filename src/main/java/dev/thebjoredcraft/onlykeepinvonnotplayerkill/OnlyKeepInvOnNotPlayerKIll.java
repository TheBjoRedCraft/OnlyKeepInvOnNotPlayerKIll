package dev.thebjoredcraft.onlykeepinvonnotplayerkill;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class OnlyKeepInvOnNotPlayerKIll extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new EventManager(), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
