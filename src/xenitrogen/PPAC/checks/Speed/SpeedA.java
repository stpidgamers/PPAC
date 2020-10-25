package xenitrogen.PPAC.checks.Speed;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffectType;
import xenitrogen.PPAC.Main;
import xenitrogen.PPAC.playerData;

public class SpeedA implements Listener {
    public int vl = 0;

    @EventHandler
    public void speedA(PlayerMoveEvent e){
        Player p = e.getPlayer();
        double angle = Math.toDegrees(-Math.atan2(e.getTo().getX() - e.getFrom().getX(), e.getTo().getZ() - e.getFrom().getZ()));

        if (e.getFrom().getDirection().getX() > playerData.MAX_XZ_SPEED && !p.isSprinting() && !p.isOp() && p.isOnGround()){
            if (angle > 47.5D) {
                if (!p.hasPotionEffect(PotionEffectType.SPEED)){
                    vl++;
                }
            }

        }
        if (vl > 5){
            Main.ban(p, "&cPPAC &4CHEAT &cDETECTION");
        }
    }
}
