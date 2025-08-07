package backtraceio.library.common;

import java.util.Random;

public class BacktraceMathHelper {
    public static double clamp(double d7, double d8, double d9) {
        return Math.max(d8, Math.min(d9, d7));
    }

    public static double uniform(double d7, double d8) {
        return (new Random().nextDouble() * (d8 - d7)) + d7;
    }
}
