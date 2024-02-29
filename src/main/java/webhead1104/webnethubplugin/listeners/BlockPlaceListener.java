package webhead1104.webnethubplugin.listeners;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import webhead1104.webnethubplugin.WebNetHubPlugin;

public class BlockPlaceListener implements Listener {

    WebNetHubPlugin plugin;

    public BlockPlaceListener(WebNetHubPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    private void onPlace(BlockPlaceEvent event) {
        event.setCancelled(!event.getPlayer().getGameMode().equals(GameMode.CREATIVE));
    }
}
