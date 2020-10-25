package xenitrogen.PPAC.checks.Reach;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerVelocityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import xenitrogen.PPAC.PlayerData;

public class ReachA implements Listener {
    public PlayerData playerData = new PlayerData();

    @EventHandler
    public void sex(PlayerMoveEvent event){
        Player player = event.getPlayer();
        if (!player.getAllowFlight() && !player.isInsideVehicle() && !player.isOnGround() && playerData.getVelocityV() == 0 && event.getTo().getY() > event.getFrom().getY()) {
            final double distance = event.getTo().getY() - playerData.getVelocityV();
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

            }
        }
    }
}
