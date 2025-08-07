package v3;

import java.lang.reflect.Array;
import java.util.Arrays;
import n3.C2649g;

public final class b {
    public static <T> T[] a(T[]... tArr) {
        if (tArr.length == 0) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass(), 0));
        }
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        T[] tArr3 = (T[]) Arrays.copyOf(tArr[0], length);
        int length2 = tArr[0].length;
        for (int i7 = 1; i7 < tArr.length; i7++) {
            T[] tArr4 = tArr[i7];
            int length3 = tArr4.length;
            System.arraycopy(tArr4, 0, tArr3, length2, length3);
            length2 += length3;
        }
        return tArr3;
    }

    public static boolean b(int[] iArr, int i7) {
        if (iArr != null) {
            for (int i8 : iArr) {
                if (i8 == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> boolean c(T[] tArr, T t7) {
        int length = tArr != null ? tArr.length : 0;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            if (!C2649g.b(tArr[i7], t7)) {
                i7++;
            } else if (i7 >= 0) {
                return true;
            }
        }
        return false;
    }
}
