package Classes;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Classes extends JavaPlugin implements Listener {
	
	public void onEnable(){
		getLogger().info("Plugin was actived");
		getServer().getPluginManager().registerEvents(this, this);
		
	}
	
	public void onDisable(){
		getLogger().info("Plugin was disactived");
		
		
	}
	@EventHandler
	public void onJoin(PlayerJoinEvent join){
		join.getPlayer().setLevel(10);
		join.getPlayer().sendMessage("Hello my friend");
		join.getPlayer().setMaxHealth(400);
		join.getPlayer().setWalkSpeed(4);
		join.setJoinMessage("Player connected");
	}

}
//yml
/*   
name: namehere
main: Classes.Classes
description: simple
version: 0.1
*/
