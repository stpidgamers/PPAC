package xenitrogen.PPAC.checks.Speed;

import net.minecraft.server.v1_8_R3.Packet;
import net.minecraft.server.v1_8_R3.PacketPlayInUseEntity;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffectType;
import xenitrogen.PPAC.Main;
import xenitrogen.PPAC.playerData;

public class SpeedB implements Listener {

    public double threshold = 1.0D;
    public int violations = 0;

    @EventHandler
    public void speedB(PlayerMoveEvent e){
        Player p = e.getPlayer();


        if (e.getFrom().distanceSquared(e.getTo()) > 0.8 && (p.getGameMode() != GameMode.CREATIVE)){
            Main.ban(e.getPlayer(), "&cPPAC &4CHEAT &cDETECTION  ");
        }
    }
}
