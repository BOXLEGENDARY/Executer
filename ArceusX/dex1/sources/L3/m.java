package L3;

import com.appsflyer.R;

public final class m {

    private static final byte[] f2051a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    private static final int[] f2052b = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    private static final int[] f2053c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    private static final int[] f2054d = {1, 1, 2, 6, 24, R.styleable.AppCompatTheme_windowFixedHeightMajor, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    private static int[] f2055e = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static int a(int i7, int i8) {
        long j7 = i7 << 1;
        if (j7 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j7 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j7;
    }
}
