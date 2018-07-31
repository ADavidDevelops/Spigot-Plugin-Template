package me.nethergoblin;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class Events implements Listener {

	MainPluginName plugin;

	public Events(MainPluginName plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void EventName(BlockBreakEvent event) {
		Block b = event.getBlock();
		int amountToBreak = 5;
		for(int broken = 0; broken < amountToBreak; broken++){
			Player player = event.getPlayer();
			Location loc = event.getBlock().getLocation();
			int limit = 10;
			for(int i = 0; i <= limit; i++){
		        loc.add(i, 0, i);
		        Block block = loc.getBlock();
		        if(block != null) block.setMaterial(Material.AIR);
		    }
		}
	}
}
