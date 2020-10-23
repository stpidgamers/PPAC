package xenitrogen.PPAC.checks.AimAssist;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import xenitrogen.PPAC.Main;

public class AimA implements Listener {

    public int violations = 0;

    @EventHandler
    public void aim(PlayerMoveEvent e){
        Player p = e.getPlayer();

        float yawChange = Math.abs(e.getTo().getYaw() - e.getFrom().getYaw());
        float pitchChange = Math.abs(e.getTo().getPitch() - e.getFrom().getPitch());

        if (yawChange > 0.0f && (double)yawChange < 0.01 && (double)pitchChange > 0.2) {
            violations++;

            "".length();
            if (3 == 1) {
                throw null;
            }
        }
        if (violations > 5){
            Main.ban(p, "&cPPAC &4CHEAT &cDETECTION");
        }
    }
}
