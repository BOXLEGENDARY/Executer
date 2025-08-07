package com.google.android.play.core.integrity;

import a4.C1574k;
import android.os.RemoteException;
import com.google.android.play.core.integrity.InterfaceC2320c;

final class D extends I {

    final InterfaceC2320c.d f18783i;

    final long f18784v;

    final long f18785w;

    final C1574k f18786y;

    final J f18787z;

    D(J j7, C1574k c1574k, int i7, InterfaceC2320c.d dVar, long j8, long j9, C1574k c1574k2) {
        super(j7, c1574k);
        this.f18783i = dVar;
        this.f18784v = j8;
        this.f18785w = j9;
        this.f18786y = c1574k2;
        this.f18787z = j7;
    }

    @Override
    protected final void b() {
        if (J.j(this.f18787z)) {
            super.a(new C2319b(-2, null));
            return;
        }
        if (J.i(this.f18787z, 0)) {
            super.a(new C2319b(-14, null));
            return;
        }
        try {
            J j7 = this.f18787z;
            ((H4.L) j7.f18802f.e()).B2(J.a(j7, this.f18783i, this.f18784v, this.f18785w, 0), new G(this.f18787z, this.f18786y, this.f18784v));
        } catch (RemoteException e7) {
            this.f18787z.f18797a.b(e7, "requestExpressIntegrityToken(%s, %s, %s)", this.f18783i.b(), this.f18783i.c(), Long.valueOf(this.f18784v));
            this.f18786y.d(new C2319b(-100, e7));
        }
    }
}
