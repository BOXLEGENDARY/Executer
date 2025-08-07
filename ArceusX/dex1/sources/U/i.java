package u;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;
import u.C2926g;
import z.C3070z;

class i implements C2926g.a {

    static final C2926g f23851a = new C2926g(new i());

    private static final Set<C3070z> f23852b = Collections.singleton(C3070z.f24773d);

    i() {
    }

    @Override
    public DynamicRangeProfiles a() {
        return null;
    }

    @Override
    public Set<C3070z> b() {
        return f23852b;
    }

    @Override
    public Set<C3070z> c(C3070z c3070z) {
        x0.g.b(C3070z.f24773d.equals(c3070z), "DynamicRange is not supported: " + c3070z);
        return f23852b;
    }
}
