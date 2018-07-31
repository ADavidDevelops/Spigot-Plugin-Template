package me.nethergoblin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor {
	
	MainPluginName plugin;
	public Commands(MainPluginName plugin) {
		this.plugin = plugin;
	}
	
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
//    	Player player = (Player) sender;
    	if(command.getName().equalsIgnoreCase("command")) {
    		
    	}
        return true;
    }
	
}
