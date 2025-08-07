package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class G3 {

    private static volatile G3 f14765b;

    private static volatile G3 f14766c;

    static final G3 f14767d = new G3(true);

    private final Map<F3, S3<?, ?>> f14768a;

    G3() {
        this.f14768a = new HashMap();
    }

    public static G3 a() {
        G3 g32 = f14765b;
        if (g32 == null) {
            synchronized (G3.class) {
                try {
                    g32 = f14765b;
                    if (g32 == null) {
                        g32 = f14767d;
                        f14765b = g32;
                    }
                } finally {
                }
            }
        }
        return g32;
    }

    public static G3 b() {
        G3 g32 = f14766c;
        if (g32 != null) {
            return g32;
        }
        synchronized (G3.class) {
            try {
                G3 g33 = f14766c;
                if (g33 != null) {
                    return g33;
                }
                G3 g3B = O3.b(G3.class);
                f14766c = g3B;
                return g3B;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <ContainingType extends InterfaceC2021y4> S3<ContainingType, ?> c(ContainingType containingtype, int i7) {
        return (S3) this.f14768a.get(new F3(containingtype, i7));
    }

    G3(boolean z7) {
        this.f14768a = Collections.emptyMap();
    }
}
