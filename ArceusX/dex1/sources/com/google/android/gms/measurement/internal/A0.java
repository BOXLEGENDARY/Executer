package com.google.android.gms.measurement.internal;

import U.Gw.oeVkjmfPcLbWm;
import android.os.Bundle;
import g0.C2457a;
import j0.tkB.pkcpMQSgx;
import java.util.Iterator;
import java.util.Map;
import n3.C2651i;

public final class A0 extends C2189a1 {

    private final Map<String, Long> f16244b;

    private final Map<String, Integer> f16245c;

    private long f16246d;

    public A0(N1 n1) {
        super(n1);
        this.f16245c = new C2457a();
        this.f16244b = new C2457a();
    }

    static void i(A0 a02, String str, long j7) {
        a02.h();
        C2651i.f(str);
        if (a02.f16245c.isEmpty()) {
            a02.f16246d = j7;
        }
        Integer num = a02.f16245c.get(str);
        if (num != null) {
            a02.f16245c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (a02.f16245c.size() >= 100) {
            a02.f16818a.b().w().a("Too many ads visible");
        } else {
            a02.f16245c.put(str, 1);
            a02.f16244b.put(str, Long.valueOf(j7));
        }
    }

    static void j(A0 a02, String str, long j7) {
        a02.h();
        C2651i.f(str);
        Integer num = a02.f16245c.get(str);
        if (num == null) {
            a02.f16818a.b().r().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        S2 s2T = a02.f16818a.K().t(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            a02.f16245c.put(str, Integer.valueOf(iIntValue));
            return;
        }
        a02.f16245c.remove(str);
        Long l7 = a02.f16244b.get(str);
        if (l7 == null) {
            a02.f16818a.b().r().a("First ad unit exposure time was never set");
        } else {
            long jLongValue = l7.longValue();
            a02.f16244b.remove(str);
            a02.p(str, j7 - jLongValue, s2T);
        }
        if (a02.f16245c.isEmpty()) {
            long j8 = a02.f16246d;
            if (j8 == 0) {
                a02.f16818a.b().r().a("First ad exposure time was never set");
            } else {
                a02.o(j7 - j8, s2T);
                a02.f16246d = 0L;
            }
        }
    }

    private final void o(long j7, S2 s22) {
        if (s22 == null) {
            this.f16818a.b().v().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j7 < 1000) {
            this.f16818a.b().v().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j7));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j7);
        i4.x(s22, bundle, true);
        this.f16818a.I().u("am", oeVkjmfPcLbWm.SCxwXxRoJlFv, bundle);
    }

    private final void p(String str, long j7, S2 s22) {
        if (s22 == null) {
            this.f16818a.b().v().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j7 < 1000) {
            this.f16818a.b().v().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j7));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j7);
        i4.x(s22, bundle, true);
        this.f16818a.I().u("am", "_xu", bundle);
    }

    public final void q(long j7) {
        Iterator<String> it = this.f16244b.keySet().iterator();
        while (it.hasNext()) {
            this.f16244b.put(it.next(), Long.valueOf(j7));
        }
        if (this.f16244b.isEmpty()) {
            return;
        }
        this.f16246d = j7;
    }

    public final void l(String str, long j7) throws IllegalStateException {
        if (str == null || str.length() == 0) {
            this.f16818a.b().r().a("Ad unit id must be a non-empty string");
        } else {
            this.f16818a.a().z(new RunnableC2187a(this, str, j7));
        }
    }

    public final void m(String str, long j7) throws IllegalStateException {
        if (str == null || str.length() == 0) {
            this.f16818a.b().r().a(pkcpMQSgx.FwzzZlBLQdKDmk);
        } else {
            this.f16818a.a().z(new RunnableC2301x(this, str, j7));
        }
    }

    public final void n(long j7) {
        S2 s2T = this.f16818a.K().t(false);
        for (String str : this.f16244b.keySet()) {
            p(str, j7 - this.f16244b.get(str).longValue(), s2T);
        }
        if (!this.f16244b.isEmpty()) {
            o(j7 - this.f16246d, s2T);
        }
        q(j7);
    }
}
