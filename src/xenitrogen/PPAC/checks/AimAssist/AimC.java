package xenitrogen.PPAC.checks.AimAssist;

import javafx.scene.input.RotateEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import xenitrogen.PPAC.utils.MathUtil;

public class AimC implements Listener {
    public int vl = 0;

    @EventHandler
    public void aim(PlayerMoveEvent event){
        final double diff = MathUtil.getDistanceBetweenAngles(event.getTo().getYaw(), event.getFrom().getYaw());
        if (event.getFrom().getPitch() == event.getTo().getPitch() && diff >= 3.0 && event.getFrom().getPitch() != 90.0f && event.getTo().getPitch() != 90.0f) {
            vl++;
            event.getPlayer().sendMessage("(Experimental) AimC Detection Has Been Failed On " + event.getPlayer().getName().toLowerCase());
        }
    }
}
