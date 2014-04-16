package net.otfeg.easyspawnplus.commandhandlers;

import net.otfeg.easyspawnplus.EasySpawnPlus;
import net.otfeg.easyspawnplus.TeleportDelay;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Bed implements CommandExecutor {

	private EasySpawnPlus plugin;

	public Bed(EasySpawnPlus plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command arg1, String arg2,
			String[] arg3) {
		if(sender instanceof Player){
			Player player = (Player)sender;
			if(player.getBedSpawnLocation()!=null){
				new TeleportDelay(plugin, player, player.getBedSpawnLocation(),
						plugin.getDelay(), plugin.getRadius() ,
						"You have been teleported to your bed.");
			}else sender.sendMessage("Your bed cannot be found.");
		}
		return true;
	}

}
