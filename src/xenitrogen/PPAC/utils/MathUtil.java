package xenitrogen.PPAC.utils;

public class MathUtil {
    public static double getDistanceBetweenAngles(final float angle1, final float angle2) {
        float distance = Math.abs(angle1 - angle2) % 360.0f;
        if (distance > 180.0f) {
            distance = 360.0f - distance;
        }
        return distance;
    }

    public static int pingFormula(final long ping) {
        return (int)Math.ceil(ping / 50.0);
    }
}
