package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.internal.measurement.HandlerC1842c0;
import n3.C2651i;

abstract class AbstractC2242l {

    private static volatile Handler f16879d;

    private final InterfaceC2235j2 f16880a;

    private final Runnable f16881b;

    private volatile long f16882c;

    AbstractC2242l(InterfaceC2235j2 interfaceC2235j2) {
        C2651i.l(interfaceC2235j2);
        this.f16880a = interfaceC2235j2;
        this.f16881b = new RunnableC2237k(this, interfaceC2235j2);
    }

    private final Handler f() {
        Handler handler;
        if (f16879d != null) {
            return f16879d;
        }
        synchronized (AbstractC2242l.class) {
            try {
                if (f16879d == null) {
                    f16879d = new HandlerC1842c0(this.f16880a.f().getMainLooper());
                }
                handler = f16879d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    final void b() {
        this.f16882c = 0L;
        f().removeCallbacks(this.f16881b);
    }

    public abstract void c();

    public final void d(long j7) {
        b();
        if (j7 >= 0) {
            this.f16882c = this.f16880a.c().a();
            if (f().postDelayed(this.f16881b, j7)) {
                return;
            }
            this.f16880a.b().r().b("Failed to schedule delayed post. time", Long.valueOf(j7));
        }
    }

    public final boolean e() {
        return this.f16882c != 0;
    }
}
