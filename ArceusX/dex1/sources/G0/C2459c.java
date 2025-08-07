package g0;

import java.lang.reflect.Array;

class C2459c {
    static <T> T[] a(T[] tArr, int i7) {
        if (tArr.length < i7) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i7));
        }
        if (tArr.length > i7) {
            tArr[i7] = null;
        }
        return tArr;
    }
}
