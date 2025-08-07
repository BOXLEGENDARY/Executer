package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class C2 {

    private static volatile C2 f15777b;

    static final C2 f15778c = new C2(true);

    private final Map f15779a;

    C2() {
        this.f15779a = new HashMap();
    }

    public static C2 a() {
        C2 c2 = f15777b;
        if (c2 != null) {
            return c2;
        }
        synchronized (C2.class) {
            try {
                C2 c22 = f15777b;
                if (c22 != null) {
                    return c22;
                }
                int i7 = C3.f15781d;
                C2 c2B = L2.b(C2.class);
                f15777b = c2B;
                return c2B;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Q2 b(InterfaceC2155u3 interfaceC2155u3, int i7) {
        return (Q2) this.f15779a.get(new B2(interfaceC2155u3, i7));
    }

    C2(boolean z7) {
        this.f15779a = Collections.emptyMap();
    }
}
