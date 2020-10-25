package xenitrogen.PPAC.checks.AimAssist;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import xenitrogen.PPAC.Main;

public class AimB implements Listener {

    private float suspiciousYaw;
    public int vl = 0;

    @EventHandler
    public void move(PlayerMoveEvent event){
        final float diff = Math.abs(event.getTo().getYaw() - event.getFrom().getYaw()) % 360.0f;
        if (diff > 1.0f && Math.round(diff * 10.0f) * 0.1f == diff && Math.round(diff) != diff) {
            if (diff == this.suspiciousYaw) {
                vl++;
                event.getPlayer().sendMessage("(Experimental) AimB Detection yawChange = " + Math.abs(event.getTo().getYaw() - event.getFrom().getYaw()) % 360.0f + " suspiciousYaw = " + suspiciousYaw);
            }
            this.suspiciousYaw = Math.round(diff * 10.0f) * 0.1f;
        }
        else {
            this.suspiciousYaw = 0.0f;
        }

        if (vl > 5){
            Main.ban(event.getPlayer(), "&cPPAC &4CHEAT &cDETECTION");
        }
    }
}
