package com.google.android.gms.internal.measurement;

import g1.kQwt.YGBtcyQ;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class C1858e0 {

    final C1970s1 f15127a;

    T1 f15128b;

    final C1841c f15129c;

    private final l7 f15130d;

    public C1858e0() {
        C1970s1 c1970s1 = new C1970s1();
        this.f15127a = c1970s1;
        this.f15128b = c1970s1.f15308b.a();
        this.f15129c = new C1841c();
        this.f15130d = new l7();
        c1970s1.f15310d.a("internal.registerCallback", new Callable() {
            @Override
            public final Object call() {
                return this.f15092d.b();
            }
        });
        c1970s1.f15310d.a("internal.eventLogger", new Callable() {
            @Override
            public final Object call() {
                return new V3(this.f14677d.f15129c);
            }
        });
    }

    public final C1841c a() {
        return this.f15129c;
    }

    final AbstractC1905k b() throws Exception {
        return new h7(this.f15130d);
    }

    public final void c(C1892i2 c1892i2) throws C2017y0 {
        AbstractC1905k abstractC1905k;
        try {
            this.f15128b = this.f15127a.f15308b.a();
            if (this.f15127a.a(this.f15128b, (C1932n2[]) c1892i2.y().toArray(new C1932n2[0])) instanceof C1881h) {
                throw new IllegalStateException("Program loading failed");
            }
            for (C1876g2 c1876g2 : c1892i2.w().z()) {
                List<C1932n2> listY = c1876g2.y();
                String strX = c1876g2.x();
                Iterator<C1932n2> it = listY.iterator();
                while (it.hasNext()) {
                    r rVarA = this.f15127a.a(this.f15128b, it.next());
                    if (!(rVarA instanceof C1937o)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    T1 t1 = this.f15128b;
                    if (t1.h(strX)) {
                        r rVarD = t1.d(strX);
                        if (!(rVarD instanceof AbstractC1905k)) {
                            String strValueOf = String.valueOf(strX);
                            throw new IllegalStateException(strValueOf.length() != 0 ? "Invalid function name: ".concat(strValueOf) : new String("Invalid function name: "));
                        }
                        abstractC1905k = (AbstractC1905k) rVarD;
                    } else {
                        abstractC1905k = null;
                    }
                    if (abstractC1905k == null) {
                        String strValueOf2 = String.valueOf(strX);
                        throw new IllegalStateException(strValueOf2.length() != 0 ? "Rule function is undefined: ".concat(strValueOf2) : new String("Rule function is undefined: "));
                    }
                    abstractC1905k.a(this.f15128b, Collections.singletonList(rVarA));
                }
            }
        } catch (Throwable th) {
            throw new C2017y0(th);
        }
    }

    public final void d(String str, Callable<? extends AbstractC1905k> callable) {
        this.f15127a.f15310d.a(str, callable);
    }

    public final boolean e(C1833b c1833b) throws C2017y0 {
        try {
            this.f15129c.d(c1833b);
            this.f15127a.f15309c.g(YGBtcyQ.YGoLRaahDxKZD, new C1897j(Double.valueOf(0.0d)));
            this.f15130d.b(this.f15128b.a(), this.f15129c);
            if (g()) {
                return true;
            }
            return f();
        } catch (Throwable th) {
            throw new C2017y0(th);
        }
    }

    public final boolean f() {
        return !this.f15129c.c().isEmpty();
    }

    public final boolean g() {
        return !this.f15129c.b().equals(this.f15129c.a());
    }
}
