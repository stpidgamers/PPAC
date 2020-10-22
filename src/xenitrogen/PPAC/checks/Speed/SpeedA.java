package xenitrogen.PPAC.checks.Speed;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import xenitrogen.PPAC.Main;
import xenitrogen.PPAC.playerData;

public class SpeedA implements Listener {
    public int viloations = 0;

    @EventHandler
    public void speedA(PlayerMoveEvent e){
        Player p = e.getPlayer();


        if (p.getWalkSpeed() > playerData.MAX_XZ_SPEED){
            viloations++;
        }
        if (viloations > 5){
            Main.ban(p, "&cPPAC &4CHEAT &cDETECTION");
        }
    }
}
