package net.otfeg.easyspawnplus.commandhandlers;

import net.otfeg.easyspawnplus.EasySpawnPlus;
import net.otfeg.easyspawnplus.TeleportDelay;
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
		if(sender instanceof Player) {
			Player player = (Player) sender;
			new TeleportDelay(plugin, player , player.getWorld().getSpawnLocation(), plugin.getDelay(), plugin.getRadius(), "You have been teleported to spawn.");
		}
		return true;
		
	}
	
}
