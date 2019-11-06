package fr.minerynthe.minerynthe;

import fr.minerynthe.minerynthe.command.YoloCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("test");
        getLogger().info("Plugin démarré !");
        getCommand("yolo").setExecutor(new YoloCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
