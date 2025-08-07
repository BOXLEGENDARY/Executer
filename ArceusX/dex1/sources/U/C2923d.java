package u;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z.C3070z;

public final class C2923d {

    private static final Map<Long, C3070z> f23847a;

    private static final Map<C3070z, List<Long>> f23848b;

    static {
        HashMap map = new HashMap();
        f23847a = map;
        HashMap map2 = new HashMap();
        f23848b = map2;
        C3070z c3070z = C3070z.f24773d;
        map.put(1L, c3070z);
        map2.put(c3070z, Collections.singletonList(1L));
        map.put(2L, C3070z.f24775f);
        map2.put((C3070z) map.get(2L), Collections.singletonList(2L));
        C3070z c3070z2 = C3070z.f24776g;
        map.put(4L, c3070z2);
        map2.put(c3070z2, Collections.singletonList(4L));
        C3070z c3070z3 = C3070z.f24777h;
        map.put(8L, c3070z3);
        map2.put(c3070z3, Collections.singletonList(8L));
        List<Long> listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator<Long> it = listAsList.iterator();
        while (it.hasNext()) {
            f23847a.put(it.next(), C3070z.f24778i);
        }
        f23848b.put(C3070z.f24778i, listAsList);
        List<Long> listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator<Long> it2 = listAsList2.iterator();
        while (it2.hasNext()) {
            f23847a.put(it2.next(), C3070z.f24779j);
        }
        f23848b.put(C3070z.f24779j, listAsList2);
    }

    public static Long a(C3070z c3070z, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = f23848b.get(c3070z);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l7 : list) {
            if (supportedProfiles.contains(l7)) {
                return l7;
            }
        }
        return null;
    }

    public static C3070z b(long j7) {
        return f23847a.get(Long.valueOf(j7));
    }
}
