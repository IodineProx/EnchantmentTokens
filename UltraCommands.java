package com.iodineprox.enchantmenttokens.commands;

import com.iodineprox.enchantmenttokens.items.ItemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("You don't have access to that command");
            return true;
        }
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("enchantmenttoken")) {
            player.getInventory().addItem(ItemManager.enchantmenttoken);
        }
        return true;
    }
}
