package u;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import u.C2926g;
import z.C3070z;

class h implements C2926g.a {

    private final DynamicRangeProfiles f23850a;

    h(Object obj) {
        this.f23850a = (DynamicRangeProfiles) obj;
    }

    private Long d(C3070z c3070z) {
        return C2923d.a(c3070z, this.f23850a);
    }

    private static Set<C3070z> e(Set<Long> set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator<Long> it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(f(it.next().longValue()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static C3070z f(long j7) {
        return (C3070z) x0.g.h(C2923d.b(j7), "Dynamic range profile cannot be converted to a DynamicRange object: " + j7);
    }

    @Override
    public DynamicRangeProfiles a() {
        return this.f23850a;
    }

    @Override
    public Set<C3070z> b() {
        return e(this.f23850a.getSupportedProfiles());
    }

    @Override
    public Set<C3070z> c(C3070z c3070z) {
        Long lD = d(c3070z);
        x0.g.b(lD != null, "DynamicRange is not supported: " + c3070z);
        return e(this.f23850a.getProfileCaptureRequestConstraints(lD.longValue()));
    }
}
