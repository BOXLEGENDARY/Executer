package Y;

import C.InterfaceC0336k0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import x0.g;
import z.C3070z;

public class b {

    public static final Map<Integer, Set<Integer>> f8002a;

    public static final Map<Integer, Set<Integer>> f8003b;

    public static final Map<Integer, Integer> f8004c;

    public static final Map<Integer, Integer> f8005d;

    private static final Map<String, Map<C3070z, Integer>> f8006e;

    static {
        HashMap map = new HashMap();
        f8002a = map;
        HashMap map2 = new HashMap();
        f8003b = map2;
        HashMap map3 = new HashMap();
        f8004c = map3;
        HashMap map4 = new HashMap();
        f8005d = map4;
        HashMap map5 = new HashMap();
        f8006e = map5;
        map.put(8, new HashSet(Collections.singletonList(8)));
        map.put(10, new HashSet(Collections.singletonList(10)));
        map.put(0, new HashSet(Arrays.asList(8, 10)));
        map2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        map2.put(1, new HashSet(Collections.singletonList(0)));
        map2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        map2.put(3, new HashSet(Collections.singletonList(1)));
        map2.put(4, new HashSet(Collections.singletonList(2)));
        map2.put(5, new HashSet(Collections.singletonList(3)));
        map2.put(6, new HashSet(Collections.singletonList(4)));
        map3.put(8, 8);
        map3.put(10, 10);
        map4.put(0, 1);
        map4.put(1, 3);
        map4.put(2, 4);
        map4.put(3, 5);
        map4.put(4, 6);
        HashMap map6 = new HashMap();
        C3070z c3070z = C3070z.f24773d;
        map6.put(c3070z, 1);
        C3070z c3070z2 = C3070z.f24775f;
        map6.put(c3070z2, 2);
        C3070z c3070z3 = C3070z.f24776g;
        map6.put(c3070z3, 4096);
        C3070z c3070z4 = C3070z.f24777h;
        map6.put(c3070z4, 8192);
        HashMap map7 = new HashMap();
        map7.put(c3070z, 1);
        map7.put(c3070z2, 2);
        map7.put(c3070z3, 4096);
        map7.put(c3070z4, 8192);
        HashMap map8 = new HashMap();
        map8.put(c3070z, 1);
        map8.put(c3070z2, 4);
        map8.put(c3070z3, 4096);
        map8.put(c3070z4, 16384);
        HashMap map9 = new HashMap();
        map9.put(C3070z.f24778i, 256);
        map9.put(C3070z.f24779j, 512);
        map5.put("video/hevc", map6);
        map5.put("video/av01", map7);
        map5.put("video/x-vnd.on2.vp9", map8);
        map5.put("video/dolby-vision", map9);
    }

    public static int a(String str, C3070z c3070z) {
        Integer num;
        Map<C3070z, Integer> map = f8006e.get(str);
        if (map == null || (num = map.get(c3070z)) == null) {
            return -1;
        }
        return num.intValue();
    }

    public static Set<Integer> b(C3070z c3070z) {
        Set<Integer> set = f8002a.get(Integer.valueOf(c3070z.a()));
        return set == null ? Collections.emptySet() : set;
    }

    public static Set<Integer> c(C3070z c3070z) {
        Set<Integer> set = f8003b.get(Integer.valueOf(c3070z.b()));
        return set == null ? Collections.emptySet() : set;
    }

    private static boolean d(int i7, C3070z c3070z) {
        Set<Integer> set = f8002a.get(Integer.valueOf(c3070z.a()));
        return set != null && set.contains(Integer.valueOf(i7));
    }

    private static boolean e(int i7, C3070z c3070z) {
        Set<Integer> set = f8003b.get(Integer.valueOf(c3070z.b()));
        return set != null && set.contains(Integer.valueOf(i7));
    }

    public static boolean f(InterfaceC0336k0.c cVar, C3070z c3070z) {
        return d(cVar.b(), c3070z) && e(cVar.g(), c3070z);
    }

    public static int g(int i7) {
        Map<Integer, Integer> map = f8004c;
        g.a(map.containsKey(Integer.valueOf(i7)));
        Integer num = map.get(Integer.valueOf(i7));
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public static int h(int i7) {
        Map<Integer, Integer> map = f8005d;
        g.a(map.containsKey(Integer.valueOf(i7)));
        Integer num = map.get(Integer.valueOf(i7));
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
