package L4;

import java.lang.reflect.Array;
import java.util.Arrays;

final class g {
    static <T> T[] a(Object[] objArr, int i7, int i8, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i7, i8, tArr.getClass());
    }

    static <T> T[] b(T[] tArr, int i7) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i7));
    }
}
