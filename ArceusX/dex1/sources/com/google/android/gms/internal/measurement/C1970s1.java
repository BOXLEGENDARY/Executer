package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

public final class C1970s1 {

    final C2024z f15307a;

    final T1 f15308b;

    final T1 f15309c;

    final C2004w3 f15310d;

    public C1970s1() {
        C2024z c2024z = new C2024z();
        this.f15307a = c2024z;
        T1 t1 = new T1(null, c2024z);
        this.f15309c = t1;
        this.f15308b = t1.a();
        C2004w3 c2004w3 = new C2004w3();
        this.f15310d = c2004w3;
        t1.g("require", new i7(c2004w3));
        c2004w3.a("internal.platform", new Callable() {
            @Override
            public final Object call() {
                return new k7();
            }
        });
        t1.g("runtime.counter", new C1897j(Double.valueOf(0.0d)));
    }

    public final r a(T1 t1, C1932n2... c1932n2Arr) {
        r rVarA = r.f15282g;
        for (C1932n2 c1932n2 : c1932n2Arr) {
            rVarA = V2.a(c1932n2);
            C1987u2.c(this.f15309c);
            if ((rVarA instanceof C1968s) || (rVarA instanceof C1953q)) {
                rVarA = this.f15307a.a(t1, rVarA);
            }
        }
        return rVarA;
    }
}
