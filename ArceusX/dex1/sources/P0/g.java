package p0;

import java.lang.reflect.Array;

final class g {
    public static int[] a(int[] iArr, int i7, int i8) {
        if (i7 + 1 > iArr.length) {
            int[] iArr2 = new int[c(i7)];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            iArr = iArr2;
        }
        iArr[i7] = i8;
        return iArr;
    }

    public static <T> T[] b(T[] tArr, int i7, T t7) {
        if (i7 + 1 > tArr.length) {
            ?? r02 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), c(i7));
            System.arraycopy(tArr, 0, r02, 0, i7);
            tArr = r02;
        }
        tArr[i7] = t7;
        return tArr;
    }

    public static int c(int i7) {
        if (i7 <= 4) {
            return 8;
        }
        return i7 * 2;
    }
}
