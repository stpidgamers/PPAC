package xenitrogen.PPAC.checks.Fly;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerVelocityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import xenitrogen.PPAC.PlayerData;

public class FlyA implements Listener {
    public int vl = 0;
    public PlayerData playerData = new PlayerData();


    @EventHandler
    public void fly(PlayerMoveEvent event){
        Player player = event.getPlayer();
        if (!player.getAllowFlight() && !player.isInsideVehicle() && !playerData.isOnGround() && !playerData.isInLiquid() && playerData.getVelocityV() == 0 && event.getTo().getY() > event.getFrom().getY()) {
            final double distance = event.getTo().getY() - playerData.getLastGroundY();
            double limit = 2.0;
            if (player.hasPotionEffect(PotionEffectType.JUMP)) {
                for (final PotionEffect effect : player.getActivePotionEffects()) {
                    if (effect.getType().equals((Object)PotionEffectType.JUMP)) {
                        final int level = effect.getAmplifier() + 1;
                        limit += Math.pow(level + 4.2, 2.0) / 16.0;
                        break;
                    }
                }
            }
            if (distance > limit) {
                vl++;
                event.getPlayer().sendMessage("(Experimental) " + player.getName() + " has failed FlyA");
            }
        }
    }
}
