package xenitrogen.PPAC.checks.Speed;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import xenitrogen.PPAC.Main;

public class SpeedB implements Listener {

    public double threshold = 1.0D;
    public int vl = 0;

    @EventHandler
    public void speedB(PlayerMoveEvent e){
        Player p = e.getPlayer();


        if (e.getFrom().distanceSquared(e.getTo()) > 0.8 && (p.getGameMode() != GameMode.CREATIVE)){
            vl++;
            e.getPlayer().sendMessage("(Experimental) " + e.getPlayer().getName() + " has failed SpeedB");
        }
        if (vl > 5){
            Main.ban(e.getPlayer(), "&cPPAC &4CHEAT &cDETECTION  ");
        }
    }
}
