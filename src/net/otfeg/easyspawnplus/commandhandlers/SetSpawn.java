package net.otfeg.easyspawnplus.commandhandlers;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawn implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if(sender instanceof Player){
			Player player = (Player) sender;
			Location location = player.getLocation();
			player.getWorld().setSpawnLocation(location.getBlockX(),
					location.getBlockY(),location.getBlockZ());
			player.sendMessage("Spawn set.");
		}
		return false;
	}
	
}
