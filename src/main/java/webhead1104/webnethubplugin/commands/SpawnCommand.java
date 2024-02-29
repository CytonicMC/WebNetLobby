package webhead1104.webnethubplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import webhead1104.webnethubplugin.WebNetHubPlugin;

public class SpawnCommand implements CommandExecutor {
    WebNetHubPlugin plugin;
    public SpawnCommand(WebNetHubPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        Player player = (Player) sender;
        player.teleport(plugin.getSpawnLocation());
        player.sendMessage(ChatColor.GREEN + "Teleported successfully!");
        return true;
    }
}