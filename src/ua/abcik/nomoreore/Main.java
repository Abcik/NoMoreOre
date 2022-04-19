package ua.abcik.nomoreore;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Main extends JavaPlugin {

    public OreManager oreManager;

    @Override
    public void onEnable() {
        prepareConfig();
        oreManager = new OreManager(this);
        this.getServer().getPluginManager().registerEvents(new Events(this), this);
        getServer().getConsoleSender().sendMessage("§6NoMoreOre §aEnabled! §7(Version: 1.1; Author: Abcik)");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("§6NoMoreOre §cDisabled! §7(Version: 1.1; Author: Abcik)");
    }

    private void prepareConfig() {
        File configFile = new File(getDataFolder() + File.separator + "config.yml");
        if (!configFile.exists()) {
            getConfig().options().copyDefaults(true);
        }
        saveDefaultConfig();
    }

}