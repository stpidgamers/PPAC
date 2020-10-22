package xenitrogen.PPAC.checks.Speed;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffectType;
import xenitrogen.PPAC.Main;
import xenitrogen.PPAC.playerData;

public class SpeedB implements Listener {

    @EventHandler
    public void speedB(PlayerMoveEvent e){
        if (e.getPlayer().hasPotionEffect(PotionEffectType.SPEED) && e.getPlayer().getWalkSpeed() > playerData.MAX_XZ_SPEED){
            Main.ban(e.getPlayer(), "&cPPAC &4CHEAT &cDETECTION ");
        }
    }
}
