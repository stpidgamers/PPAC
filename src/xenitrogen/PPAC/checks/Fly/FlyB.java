package xenitrogen.PPAC.checks.Fly;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import xenitrogen.PPAC.PlayerData;

public class FlyB implements Listener {
    public int vl = 0;

    PlayerData playerData = new PlayerData();
    @EventHandler
    public void fly(PlayerMoveEvent event){
        Player player = event.getPlayer();
        if (!player.getAllowFlight() && !player.isInsideVehicle() && !this.playerData.isInLiquid() && !this.playerData.isOnGround()) {
            double offsetH = Math.hypot(event.getTo().getX() - event.getFrom().getX(), event.getTo().getZ() - event.getFrom().getZ());
            double offsetY = event.getTo().getY() - event.getFrom().getY();
            if (offsetH > 0.0D && offsetY == 0.0D) {
                ++vl;
                event.getPlayer().sendMessage("(Experimental) " + player.getName() + " has failed FlyB");
            }
        }
    }
}
