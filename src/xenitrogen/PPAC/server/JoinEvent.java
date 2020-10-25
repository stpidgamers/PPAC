package xenitrogen.PPAC.server;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import xenitrogen.PPAC.Main;
import xenitrogen.PPAC.PlayerData;

public class JoinEvent implements Listener {

    public PlayerData playerData = new PlayerData();

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        if (playerData.isBanned()){
            e.getPlayer().kickPlayer("&cYou Have Been &4Banned! &cReason : \n\n" + Main.ez);
        }
    }
}
