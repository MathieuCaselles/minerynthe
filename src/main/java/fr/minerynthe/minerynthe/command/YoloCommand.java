package fr.minerynthe.minerynthe.command;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Random;


public class YoloCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        ArrayList<Block> listeBlocks;
        Random rand = new Random();

        Player player = (Player) sender;
        Location loc = player.getLocation();
        int radius = 150;
        World world = loc.getWorld();
        ItemStack drop = new ItemStack(Material.EGG, 1);
        listeBlocks = new ArrayList<Block>();

        for (int x = -radius; x < radius; x++) {
            for (int y = -radius; y < radius; y++) {
                for (int z = -radius; z < radius; z++) {
                    Block block = world.getBlockAt(loc.getBlockX() + x, loc.getBlockY() + y, loc.getBlockZ() + z);
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
            world.dropItem((block).getLocation().add(0, 1, 0), drop);
        }

        return false;
    }
}
