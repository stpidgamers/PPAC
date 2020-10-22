package xenitrogen.PPAC.server;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import xenitrogen.PPAC.Main;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        if (e.getPlayer().isBanned()){
            e.getPlayer().kickPlayer("&cYou Have Been &4Banned! &cReason : \n\n" + Main.ez);
        }
    }
}
