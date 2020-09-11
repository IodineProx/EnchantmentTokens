package com.iodineprox.enchantmenttokens;

import com.iodineprox.enchantmenttokens.commands.Commands;
import com.iodineprox.enchantmenttokens.commands.RainbowCommand;
import com.iodineprox.enchantmenttokens.commands.UltraCommand;
import com.iodineprox.enchantmenttokens.items.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;

public class EnchantmentTokens extends JavaPlugin {

    @Override
    public void onEnable() {
        ItemManager.init();
        getCommand("enchantmenttoken").setExecutor(new Commands());
        getCommand("ultraenchantmenttoken").setExecutor(new UltraCommand());
        getCommand("rainbowenchantmenttoken").setExecutor(new RainbowCommand());
        getServer().getConsoleSender().sendMessage("§a[EnchantmentTokens] Plugin is ENABLED");
    }

    @Override
    public void onDisable() {

    }

}
