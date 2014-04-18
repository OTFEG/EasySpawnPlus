package net.otfeg.easyspawnplus.commandhandlers;

import java.util.List;

import net.otfeg.easyspawnplus.EasySpawnPlus;
import net.otfeg.easyspawnplus.TeleportDelay;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Spawn implements CommandExecutor{
	private  EasySpawnPlus plugin;
	public Spawn(EasySpawnPlus plugin) {
		this.plugin = plugin;
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if(!(sender instanceof Player)) return true;
		Player player = (Player) sender;
		// /spawn
		if(args.length == 0){
			new TeleportDelay(plugin, player , player.getWorld().getSpawnLocation(),
					plugin.getDelay(), plugin.getRadius(),
					"You have been teleported to spawn.");
			return true;
		}
		if(args.length == 1){
			if(args[0].equalsIgnoreCase("list")){ // /spawn list
				List<World> worlds = plugin.getServer().getWorlds();
				for(World world:worlds){
					player.sendMessage(world.getName());
				}
			}else{ // /spawn <world>
				World world = plugin.getServer().getWorld(args[0]);
				if(world == null){ // check if work exist
					player.sendMessage("World not found.");
					player.sendMessage("Use /spawn list to show available worlds.");
					return true;
				}
				new TeleportDelay(plugin, player, world.getSpawnLocation(),
						plugin.getDelay(), plugin.getRadius(),
						"You have been teleported to " + world.getName() + " spawn.");
			}
		}
		return true;
		
	}
	
}
