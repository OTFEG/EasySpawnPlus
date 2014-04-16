package net.otfeg.easyspawnplus;

import net.otfeg.easyspawnplus.commandhandlers.Bed;
import net.otfeg.easyspawnplus.commandhandlers.SetSpawn;
import net.otfeg.easyspawnplus.commandhandlers.Spawn;

import org.bukkit.plugin.java.JavaPlugin;

public class EasySpawnPlus extends JavaPlugin{
	public int delay, radius;
	@Override
	public void onEnable() {
		getCommand("spawn").setExecutor(new Spawn(this));
		getCommand("setspawn").setExecutor(new SetSpawn());
		getCommand("bed").setExecutor(new Bed(this));
		saveDefaultConfig();
	}
	public int getDelay() {
		return getConfig().getInt("delay");
		
	}
	public int getRadius() {
		return getConfig().getInt("radius");
	}
}
