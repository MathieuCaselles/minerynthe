package fr.minerynthe.minerynthe.command;

import fr.minerynthe.minerynthe.utils.ItemUtil;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class YoloCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Location location = player.getLocation();

        spawnItemRandom(location);

        return false;
    }


    private void spawnItemRandom(Location centreDeLaZone) {
        ArrayList<Block> listeBlocks = new ArrayList<Block>();

        Random rand = new Random();
        int radius = 150;  // distance de la zone de détection
        World world = centreDeLaZone.getWorld();

        ItemStack stack = ItemUtil.createItemStack(Material.DIAMOND_SWORD, 1, ChatColor.DARK_RED + "§kEpee magique", Arrays.asList("§aLourd", "§6§lToujours plus"), Enchantment.KNOCKBACK, 6);

        for (int x = -radius; x < radius; x++) {
            for (int y = -radius; y < radius; y++) {
                for (int z = -radius; z < radius; z++) {
                    Block block = world.getBlockAt(centreDeLaZone.getBlockX() + x, centreDeLaZone.getBlockY() + y, centreDeLaZone.getBlockZ() + z);
                    if (block.getType() == Material.EMERALD_BLOCK) {
                        listeBlocks.add(block);
                    }
                }
            }
        }

        int nombreAleatoire = rand.nextInt(listeBlocks.size()) + 1;

        for (int i = 0; i < nombreAleatoire; i++) {
            int randomIndex = rand.nextInt(listeBlocks.size());
            listeBlocks.remove(randomIndex);
        }

        for (Block block : listeBlocks) {
            world.dropItem((block).getLocation().add(0, 1, 0), stack);
        }

    }
}
