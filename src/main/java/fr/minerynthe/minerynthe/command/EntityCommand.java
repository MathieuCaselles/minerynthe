package fr.minerynthe.minerynthe.command;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class EntityCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        ItemStack drop = new ItemStack(Material.EGG, 1);
            World world = ((Entity) player).getWorld();
            ((World) world).dropItem(((Entity) player).getLocation(), drop);


        return false;
    }
}
