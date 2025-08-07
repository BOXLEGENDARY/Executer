package s;

import C.AbstractC0315a;
import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Pair;
import android.util.Size;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class C2769F0 implements C.G {

    private final Map<String, O1> f22954a;

    private final InterfaceC2807f f22955b;

    class a implements InterfaceC2807f {
        a() {
        }

        @Override
        public CamcorderProfile a(int i7, int i8) {
            return CamcorderProfile.get(i7, i8);
        }

        @Override
        public boolean b(int i7, int i8) {
            return CamcorderProfile.hasProfile(i7, i8);
        }
    }

    public C2769F0(Context context, Object obj, Set<String> set) throws z.r {
        this(context, new a(), obj, set);
    }

    private void c(Context context, t.O o2, Set<String> set) throws z.r {
        x0.g.g(context);
        for (String str : set) {
            this.f22954a.put(str, new O1(context, str, o2, this.f22955b));
        }
    }

    @Override
    public C.e1 a(int i7, String str, int i8, Size size) {
        O1 o1 = this.f22954a.get(str);
        if (o1 != null) {
            return o1.M(i7, i8, size);
        }
        return null;
    }

    @Override
    public Pair<Map<C.o1<?>, C.c1>, Map<AbstractC0315a, C.c1>> b(int i7, String str, List<AbstractC0315a> list, Map<C.o1<?>, List<Size>> map, boolean z7, boolean z8) {
        x0.g.b(!map.isEmpty(), "No new use cases to be bound.");
        O1 o1 = this.f22954a.get(str);
        if (o1 != null) {
            return o1.A(i7, list, map, z7, z8);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    C2769F0(Context context, InterfaceC2807f interfaceC2807f, Object obj, Set<String> set) throws z.r {
        this.f22954a = new HashMap();
        x0.g.g(interfaceC2807f);
        this.f22955b = interfaceC2807f;
        c(context, obj instanceof t.O ? (t.O) obj : t.O.a(context), set);
    }
}
