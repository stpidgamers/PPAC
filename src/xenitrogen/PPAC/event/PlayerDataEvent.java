package xenitrogen.PPAC.event;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerVelocityEvent;
import xenitrogen.PPAC.PlayerData;

public class PlayerDataEvent implements Listener {
    PlayerData playerData = new PlayerData();

    @EventHandler
    public void groundEvent(PlayerMoveEvent e){
        if (e.getPlayer().isOnGround()){
            playerData.setOnGround(true);
        }else{
            playerData.setOnGround(false);
        }
    }

    @EventHandler
    public void liquidEvent(PlayerMoveEvent e){
        Location loc = e.getPlayer().getLocation();
        loc.setY(loc.getY() - 1.0);
        Block block = e.getPlayer().getWorld().getBlockAt(loc);

        if (block.isLiquid()){
            playerData.setInLiquid(true);
        }else{
            playerData.setInLiquid(false);
        }
    }

    @EventHandler
    public void bannedEvent(PlayerJoinEvent e){
        if (e.getPlayer().isBanned()){
            playerData.setBanned(true);
        }else{
            playerData.setBanned(false);
        }
    }

    @EventHandler
    public void velocityVEvent(PlayerVelocityEvent e){
        playerData.setVelocityV((int) e.getVelocity().getY());
    }

    @EventHandler
    public void velocityHEvent(PlayerVelocityEvent e){
        playerData.setVelocityH((int) e.getVelocity().getZ());
    }

    @EventHandler
    public void getLastGroundYEvent(PlayerMoveEvent e){
        playerData.setLastGroundY((double) e.getFrom().getBlockY());
    }
}
