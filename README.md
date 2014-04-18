EasySpawnPlus
=============

EasySpawnPlus is an extension of [EasySpawn](http://dev.bukkit.org/bukkit-plugins/easy-spawn/) 
giving more advanced teleportion features.
This plugin is currently under development and new features will be added. 
Feel free to request features and we will see what we can do to add them.

Usage
------
/spawn

	Teleports player to the spawn of the world they are in.

/spawn list

	List available spawns.
	
/spawn <world>
 
	Teleports player to the spawn of the given world.
	 
/setspawn

	Sets spawn location.

/bed 
	
	Teleports player to their bed
	
Permissions
-----------

/spawn

	easyspawn.spawn

	by default this works for non-opped players 

/setspawn

	easyspawn.setspawn
	
	works if opped
 
/bed

    easyspawn.bed
    
    by default this works for non-opped players

Configuration
-------------

delay: 
	
	The time delay between issuing a teleportation command and being teleported.
	Set to 0 disable.
	
radius:
    
    Radius player must stay within, if they fail to do so teleport will fail.
    If delay is disabled the radius check is not done.


Source code be found [here](https://github.com/OTFEG/EasySpawnPlus) on github.