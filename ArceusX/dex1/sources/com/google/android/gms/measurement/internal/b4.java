package com.google.android.gms.measurement.internal;

import java.util.ArrayList;
import java.util.List;
import n3.C2651i;

final class b4 {

    com.google.android.gms.internal.measurement.R1 f16718a;

    List<Long> f16719b;

    List<com.google.android.gms.internal.measurement.H1> f16720c;

    long f16721d;

    final c4 f16722e;

    b4(c4 c4Var, W3.w wVar) {
        this.f16722e = c4Var;
    }

    private static final long b(com.google.android.gms.internal.measurement.H1 h12) {
        return ((h12.z() / 1000) / 60) / 60;
    }

    public final boolean a(long j7, com.google.android.gms.internal.measurement.H1 h12) {
        C2651i.l(h12);
        if (this.f16720c == null) {
            this.f16720c = new ArrayList();
        }
        if (this.f16719b == null) {
            this.f16719b = new ArrayList();
        }
        if (this.f16720c.size() > 0 && b(this.f16720c.get(0)) != b(h12)) {
            return false;
        }
        long jA = this.f16721d + h12.a();
        this.f16722e.T();
        if (jA >= Math.max(0, Y0.f16624j.a(null).intValue())) {
            return false;
        }
        this.f16721d = jA;
        this.f16720c.add(h12);
        this.f16719b.add(Long.valueOf(j7));
        int size = this.f16720c.size();
        this.f16722e.T();
        return size < Math.max(1, Y0.f16626k.a(null).intValue());
    }
}
