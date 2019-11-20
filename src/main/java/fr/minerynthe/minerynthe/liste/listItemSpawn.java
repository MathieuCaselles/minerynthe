package fr.minerynthe.minerynthe.liste;

import fr.minerynthe.minerynthe.utils.ItemUtil;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;

public class listItemSpawn {


    public static ArrayList<ItemStack> getListeItem() {
        ArrayList<ItemStack> listeItem = new ArrayList<ItemStack>();

        listeItem.add(ItemUtil.createItemStack(Material.DIAMOND_SWORD, 1, ChatColor.DARK_RED + "§kEpee magique", Arrays.asList("§aLourd", "§6§lToujours plus"), Enchantment.KNOCKBACK, 6));
        listeItem.add(ItemUtil.createItemStack(Material.DIAMOND_CHESTPLATE, 1, ChatColor.DARK_RED + "§kPlastron magique", Arrays.asList("§aLourd", "§6§lToujours plus"), Enchantment.PROTECTION_ENVIRONMENTAL, 2));
        listeItem.add(ItemUtil.createItemStack(Material.BREAD, 1, ChatColor.DARK_GREEN + "§kMeilleur pain du monde", Arrays.asList("§aExcellent", "§6§lEt même jouissif")));

        return listeItem;
    }

}
