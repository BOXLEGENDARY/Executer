package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1848c6;

final class M3 {

    protected long f16386a;

    protected long f16387b;

    private final AbstractC2242l f16388c;

    final O3 f16389d;

    public M3(O3 o32) {
        this.f16389d = o32;
        this.f16388c = new L3(this, o32.f16818a);
        long jB = o32.f16818a.c().b();
        this.f16386a = jB;
        this.f16387b = jB;
    }

    final void a() {
        this.f16388c.b();
        this.f16386a = 0L;
        this.f16387b = 0L;
    }

    final void b(long j7) {
        this.f16388c.b();
    }

    final void c(long j7) {
        this.f16389d.h();
        this.f16388c.b();
        this.f16386a = j7;
        this.f16387b = j7;
    }

    public final boolean d(boolean z7, boolean z8, long j7) {
        this.f16389d.h();
        this.f16389d.i();
        C1848c6.b();
        if (!this.f16389d.f16818a.z().B(null, Y0.f16627k0) || this.f16389d.f16818a.o()) {
            this.f16389d.f16818a.F().f17093o.b(this.f16389d.f16818a.c().a());
        }
        long j8 = j7 - this.f16386a;
        if (!z7 && j8 < 1000) {
            this.f16389d.f16818a.b().v().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j8));
            return false;
        }
        if (!z8) {
            j8 = j7 - this.f16387b;
            this.f16387b = j7;
        }
        this.f16389d.f16818a.b().v().b("Recording user engagement, ms", Long.valueOf(j8));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j8);
        i4.x(this.f16389d.f16818a.K().t(!this.f16389d.f16818a.z().D()), bundle, true);
        C2212f c2212fZ = this.f16389d.f16818a.z();
        X0<Boolean> x02 = Y0.f16601V;
        if (!c2212fZ.B(null, x02) && z8) {
            bundle.putLong("_fr", 1L);
        }
        if (!this.f16389d.f16818a.z().B(null, x02) || !z8) {
            this.f16389d.f16818a.I().u("auto", "_e", bundle);
        }
        this.f16386a = j7;
        this.f16388c.b();
        this.f16388c.d(3600000L);
        return true;
    }
}
