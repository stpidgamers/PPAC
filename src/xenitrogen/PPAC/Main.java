package xenitrogen.PPAC;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import xenitrogen.PPAC.checks.Speed.SpeedA;
import xenitrogen.PPAC.checks.Speed.SpeedB;

public class Main extends JavaPlugin {
    public static String ez;

    @Override
    public void onEnable() {
        getLogger().info("[!] Enabled ppAntiCheat v1.2.0!");
        getLogger().info("[!] Loading Checks...");
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents((Listener)new SpeedA(), (Plugin)this);
        pm.registerEvents((Listener)new SpeedB(), (Plugin)this);
        getLogger().info("[!] Registered All Checks!");
    }

    @Override
    public void onDisable() {
        getLogger().info("[!] Disabled ppAntiCheat v1.2.0!");
        getLogger().info("[!] Disabled All Checks!");
    }

    public static void ban(Player p, String reason){
        ez = reason;
        Bukkit.getConsoleSender().sendMessage("/ban " + p.getName() + "&cYou Have Been &4Banned! &cReason : \n\n" + reason);
        p.setBanned(true);
    }
}
