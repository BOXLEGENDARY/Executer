package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC1842c0;

public final class O3 extends AbstractC2298w1 {

    private Handler f16451c;

    protected final N3 f16452d;

    protected final M3 f16453e;

    protected final J3 f16454f;

    O3(N1 n1) {
        super(n1);
        this.f16452d = new N3(this);
        this.f16453e = new M3(this);
        this.f16454f = new J3(this);
    }

    static void q(O3 o32, long j7) {
        o32.h();
        o32.s();
        o32.f16818a.b().v().b("Activity paused, time", Long.valueOf(j7));
        o32.f16454f.a(j7);
        if (o32.f16818a.z().D()) {
            o32.f16453e.b(j7);
        }
    }

    static void r(O3 o32, long j7) {
        o32.h();
        o32.s();
        o32.f16818a.b().v().b("Activity resumed, time", Long.valueOf(j7));
        if (o32.f16818a.z().D() || o32.f16818a.F().f17095q.b()) {
            o32.f16453e.c(j7);
        }
        o32.f16454f.b();
        N3 n32 = o32.f16452d;
        n32.f16440a.h();
        if (n32.f16440a.f16818a.o()) {
            n32.b(n32.f16440a.f16818a.c().a(), false);
        }
    }

    public final void s() {
        h();
        if (this.f16451c == null) {
            this.f16451c = new HandlerC1842c0(Looper.getMainLooper());
        }
    }

    @Override
    protected final boolean n() {
        return false;
    }
}
