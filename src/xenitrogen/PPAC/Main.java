package xenitrogen.PPAC;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("[!] Enabled ppAntiCheat v1.2.0!");
    }

    @Override
    public void onDisable() {
        getLogger().info("[!] Disabled ppAntiCheat v1.2.0!");
    }

    public static void ban(Player p, String reason){
        p.kickPlayer("&cYou Have Been &4Banned! &cReason : \n\n" + reason);
        p.setBanned(true);
    }
}
