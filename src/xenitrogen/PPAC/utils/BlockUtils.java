package xenitrogen.PPAC.utils;

import org.bukkit.Location;
import org.bukkit.World;

import java.util.Set;

public class BlockUtils {
    private static boolean isUnderBlock(Location location, Set<Byte> itemIDs, int down) {
        double posX = location.getX();
        double posZ = location.getZ();
        double fracX = posX % 1.0D > 0.0D ? Math.abs(posX % 1.0D) : 1.0D - Math.abs(posX % 1.0D);
        double fracZ = posZ % 1.0D > 0.0D ? Math.abs(posZ % 1.0D) : 1.0D - Math.abs(posZ % 1.0D);
        int blockX = location.getBlockX();
        int blockY = location.getBlockY() - down;
        int blockZ = location.getBlockZ();
        World world = location.getWorld();
        if (itemIDs.contains((byte)world.getBlockAt(blockX, blockY, blockZ).getTypeId())) {
            return true;
        } else {
            if (fracX < 0.3D) {
                if (itemIDs.contains((byte)world.getBlockAt(blockX - 1, blockY, blockZ).getTypeId())) {
                    return true;
                }

                if (fracZ < 0.3D) {
                    if (itemIDs.contains((byte)world.getBlockAt(blockX - 1, blockY, blockZ - 1).getTypeId())) {
                        return true;
                    }

                    if (itemIDs.contains((byte)world.getBlockAt(blockX, blockY, blockZ - 1).getTypeId())) {
                        return true;
                    }

                    if (itemIDs.contains((byte)world.getBlockAt(blockX + 1, blockY, blockZ - 1).getTypeId())) {
                        return true;
                    }
                } else if (fracZ > 0.7D) {
                    if (itemIDs.contains((byte)world.getBlockAt(blockX - 1, blockY, blockZ + 1).getTypeId())) {
                        return true;
                    }

                    if (itemIDs.contains((byte)world.getBlockAt(blockX, blockY, blockZ + 1).getTypeId())) {
                        return true;
                    }

                    if (itemIDs.contains((byte)world.getBlockAt(blockX + 1, blockY, blockZ + 1).getTypeId())) {
                        return true;
                    }
                }
            } else if (fracX > 0.7D) {
                if (itemIDs.contains((byte)world.getBlockAt(blockX + 1, blockY, blockZ).getTypeId())) {
                    return true;
                }

                if (fracZ < 0.3D) {
                    if (itemIDs.contains((byte)world.getBlockAt(blockX - 1, blockY, blockZ - 1).getTypeId())) {
                        return true;
                    }

                    if (itemIDs.contains((byte)world.getBlockAt(blockX, blockY, blockZ - 1).getTypeId())) {
                        return true;
                    }

                    if (itemIDs.contains((byte)world.getBlockAt(blockX + 1, blockY, blockZ - 1).getTypeId())) {
                        return true;
                    }
                } else if (fracZ > 0.7D) {
                    if (itemIDs.contains((byte)world.getBlockAt(blockX - 1, blockY, blockZ + 1).getTypeId())) {
                        return true;
                    }

                    if (itemIDs.contains((byte)world.getBlockAt(blockX, blockY, blockZ + 1).getTypeId())) {
                        return true;
                    }

                    if (itemIDs.contains((byte)world.getBlockAt(blockX + 1, blockY, blockZ + 1).getTypeId())) {
                        return true;
                    }
                }
            } else if (fracZ < 0.3D) {
                if (itemIDs.contains((byte)world.getBlockAt(blockX, blockY, blockZ - 1).getTypeId())) {
                    return true;
                }
            } else if (fracZ > 0.7D && itemIDs.contains((byte)world.getBlockAt(blockX, blockY, blockZ + 1).getTypeId())) {
                return true;
            }

            return false;
        }
    }
}
