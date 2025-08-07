package C9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public final class b {
    private static int a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    static <T> HashSet<T> b(int i) {
        return new HashSet<>(a(i));
    }

    public static <K, V> LinkedHashMap<K, V> c(int i) {
        return new LinkedHashMap<>(a(i));
    }

    public static <T> List<T> d(int i) {
        return i == 0 ? Collections.emptyList() : new ArrayList(i);
    }
}
