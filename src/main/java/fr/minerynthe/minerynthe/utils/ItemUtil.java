package fr.minerynthe.minerynthe.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemUtil {

    public static ItemStack createItemStack(Material type, int amount, String name, List<String> lore) {
        ItemStack item = new ItemStack(type, amount);
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            meta.setDisplayName(name);
            meta.setLore(lore);
            item.setItemMeta(meta);
        }

        return item;
    }

    public static ItemStack createItemStack(Material type, int amount, String name, List<String> lore, Enchantment enchantement, int levelEnchantement) {
        ItemStack item = new ItemStack(type, amount);
        item.addUnsafeEnchantment(enchantement, levelEnchantement);
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            meta.setDisplayName(name);
            meta.setLore(lore);
            item.setItemMeta(meta);
        }


        return item;
    }
}
