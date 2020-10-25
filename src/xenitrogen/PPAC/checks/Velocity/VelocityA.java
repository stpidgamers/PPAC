package xenitrogen.PPAC.checks.Velocity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import xenitrogen.PPAC.Main;
import xenitrogen.PPAC.PlayerData;
import xenitrogen.PPAC.utils.MathUtil;

public class VelocityA implements Listener {
    public PlayerData playerData = new PlayerData();
    public int vl = 0;

    @EventHandler
    public void velo(PlayerMoveEvent e){
        if (this.playerData.getVelocityY() > 0.0 && !this.playerData.isUnderBlock() && !this.playerData.isInLiquid()) {
            final int threshold = 12 + MathUtil.pingFormula(this.playerData.getPing()) * 2;
            this.playerData.setVelocityY(0.0);
            vl++;
        }

        if (vl > 5){
            Main.ban(e.getPlayer(), "&cPPAC &4CHEAT &cDETECTION");
        }
    }
}
