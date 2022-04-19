package ua.abcik.nomoreore;

import java.util.SplittableRandom;

public class Utils {

    private static final SplittableRandom random = new SplittableRandom();

    public static boolean getRandom(double chance) {
        return random.nextDouble(0, 101) <= chance;
    }

    public static int getRandom(int lower, int upper) {
        return random.nextInt(lower, upper+1);
    }
}