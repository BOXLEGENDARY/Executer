package com.google.android.gms.common.api.internal;

import a4.C1574k;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import m3.InterfaceC2580k;

public final class H extends m3.t {

    private final AbstractC1808h f14086b;

    private final C1574k f14087c;

    private final InterfaceC2580k f14088d;

    public H(int i7, AbstractC1808h abstractC1808h, C1574k c1574k, InterfaceC2580k interfaceC2580k) {
        super(i7);
        this.f14087c = c1574k;
        this.f14086b = abstractC1808h;
        this.f14088d = interfaceC2580k;
        if (i7 == 2 && abstractC1808h.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override
    public final void a(Status status) {
        this.f14087c.d(this.f14088d.a(status));
    }

    @Override
    public final void b(Exception exc) {
        this.f14087c.d(exc);
    }

    @Override
    public final void c(t tVar) throws DeadObjectException {
        try {
            this.f14086b.b(tVar.t(), this.f14087c);
        } catch (DeadObjectException e7) {
            throw e7;
        } catch (RemoteException e8) {
            a(J.e(e8));
        } catch (RuntimeException e9) {
            this.f14087c.d(e9);
        }
    }

    @Override
    public final void d(C1812l c1812l, boolean z7) {
        c1812l.d(this.f14087c, z7);
    }

    @Override
    public final boolean f(t tVar) {
        return this.f14086b.c();
    }

    @Override
    public final Feature[] g(t tVar) {
        return this.f14086b.e();
    }
}
