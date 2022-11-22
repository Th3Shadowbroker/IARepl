package org.th3shadowbroker.repl;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class IARepl extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        // Change type of block
        event.getBlock().setType(Material.AIR);

        // Cancel original event
        event.setCancelled(true);
        getLogger().info("Block break cancelled!");
    }

}
