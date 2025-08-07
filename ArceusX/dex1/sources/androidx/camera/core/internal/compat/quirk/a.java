package androidx.camera.core.internal.compat.quirk;

import C.N0;
import C.O0;
import C.P0;
import C.R0;
import x0.InterfaceC2984a;
import z.C3043d0;

public class a {

    private static volatile R0 f9483a;

    static {
        P0.b().c(F.a.a(), new InterfaceC2984a() {
            @Override
            public final void accept(Object obj) {
                androidx.camera.core.internal.compat.quirk.a.d((O0) obj);
            }
        });
    }

    public static <T extends N0> T b(Class<T> cls) {
        return (T) f9483a.b(cls);
    }

    public static R0 c() {
        return f9483a;
    }

    public static void d(O0 o02) {
        f9483a = new R0(b.a(o02));
        C3043d0.a("DeviceQuirks", "core DeviceQuirks = " + R0.d(f9483a));
    }
}
