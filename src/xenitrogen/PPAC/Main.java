package xenitrogen.PPAC;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import xenitrogen.PPAC.checks.Speed.*;
import xenitrogen.PPAC.checks.AimAssist.*;
import xenitrogen.PPAC.checks.Fly.*;
import xenitrogen.PPAC.checks.Reach.*;
import xenitrogen.PPAC.event.PlayerDataEvent;


public class Main extends JavaPlugin {
    public static String ez;

    @Override
    public void onEnable() {
        getLogger().info("[!] Enabled ppAntiCheat v1.2.0!");
        getLogger().info("[!] Loading Checks...");
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents((Listener)new SpeedA(), (Plugin)this);
        pm.registerEvents((Listener)new SpeedB(), (Plugin)this);
        pm.registerEvents((Listener)new AimA(), (Plugin)this);
        pm.registerEvents((Listener)new AimB(), (Plugin)this);
        pm.registerEvents((Listener)new AimC(), (Plugin)this);
        pm.registerEvents((Listener)new FlyA(), (Plugin)this);
        pm.registerEvents((Listener)new FlyB(), (Plugin)this);
        pm.registerEvents((Listener)new ReachA(), (Plugin)this);
        pm.registerEvents((Listener)new PlayerDataEvent(), (Plugin)this);


        getLogger().info("[!] Registered All Checks!");
    }

    @Override
    public void onDisable() {
        getLogger().info("[!] Disabled ppAntiCheat v1.2.0!");
        getLogger().info("[!] Disabled All Checks!");
    }

    public static void ban(Player p, String reason){
        PlayerData playerData = new PlayerData();
        ez = reason;
        Bukkit.getConsoleSender().sendMessage("/ban " + p.getName() + "&cYou Have Been &4Banned! &cReason : \n\n" + reason);
        p.setBanned(true);
        playerData.setBanned(true);

    }
}
