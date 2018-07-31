package me.nethergoblin;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

public class MainPluginName extends JavaPlugin {

	public void onEnable() {
		getServer().getPluginManager().registerEvents(new Events(this), this);
		this.getCommand("backpack").setExecutor(new Commands(this));
		createConfig();
	}

	public void onDisable() {
		saveConfig();
	}

	private void createConfig() {
		try {
			if (!getDataFolder().exists()) {
				getDataFolder().mkdirs();
			}
			File file = new File(getDataFolder(), "config.yml");
			if (!file.exists()) {
				getLogger().info("Config.yml not found, creating!");
				saveDefaultConfig();
			} else {
				getLogger().info("Config.yml found, loading!");
			}
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
