package com.iodineprox.enchantmenttokens.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack enchantmenttoken;
    public static ItemStack ultraenchantmenttoken;
    public static ItemStack rainbowenchantmenttoken;

    public static void init() {
        createEnchantmentToken();
        createUltraEnchantmentToken();
        createRainbowEnchantmentToken();
    }


    private static void createEnchantmentToken() {
        ItemStack item = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§d§k§l|§r§e§lEnchantment §f§lToken§d§k§l|");
        List<String> lore = new ArrayList<>();
        lore.add("§2Enchantment Tokens can be used to trade");
        lore.add("§2for awesome enchanted gear at an §eEnchanter");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        enchantmenttoken = item;
    }

    private static void createUltraEnchantmentToken() {
        ItemStack item = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§d§k§l||§r§c§lUltra §e§lEnchantment §f§lToken§d§k§l||");
        List<String> lore = new ArrayList<>();
        lore.add("§cUltra §2Enchantment Tokens can be used to trade");
        lore.add("§2for awesome enchanted gear at an §cUltra §eEnchanter");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        ultraenchantmenttoken = item;
    }

    private static void createRainbowEnchantmentToken() {
        ItemStack item = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§d§k§l|||§r§c§lR§d§la§e§li§a§ln§b§lb§9§lo§5§lw§e§lEnchantment §f§lToken§d§k§l|||");
        List<String> lore = new ArrayList<>();
        lore.add("§cR§da§ei§an§bb§9o§5w §2Enchantment Tokens can be used to trade");
        lore.add("§2for awesome enchanted gear at an §cR§da§ei§an§bb§9o§5w Enchanter");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        rainbowenchantmenttoken = item;
    }
}
