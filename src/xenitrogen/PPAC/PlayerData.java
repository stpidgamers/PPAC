package xenitrogen.PPAC;

public class PlayerData {
    public static Double MAX_XZ_SPEED = 066D;
    private boolean isOnGround;
    private boolean isInLiquid;
    private boolean isBanned;
    private int velocityV;
    private int velocityH;
    private double lastGroundY;
    private double velocityY;
    private long ping;
    private boolean underBlock;


    public boolean isOnGround() {
        return isOnGround;
    }

    public void setOnGround(boolean onGround) {
        isOnGround = onGround;
    }

    public boolean isInLiquid() {
        return isInLiquid;
    }

    public void setInLiquid(boolean inLiquid) {
        isInLiquid = inLiquid;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned(boolean banned) {
        isBanned = banned;
    }

    public int getVelocityV() {
        return velocityV;
    }

    public void setVelocityV(int velocityV) {
        this.velocityV = velocityV;
    }

    public int getVelocityH() {
        return velocityH;
    }

    public void setVelocityH(int velocityH) {
        this.velocityH = velocityH;
    }

    public double getLastGroundY() {
        return lastGroundY;
    }

    public void setLastGroundY(double lastGroundY) {
        this.lastGroundY = lastGroundY;
    }

    public double getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(double velocityY) {
        this.velocityY = velocityY;
    }

    public long getPing() {
        return ping;
    }

    public void setPing(long ping) {
        this.ping = ping;
    }

    public boolean isUnderBlock() {
        return underBlock;
    }

    public void setUnderBlock(boolean underBlock) {
        this.underBlock = underBlock;
    }
}
