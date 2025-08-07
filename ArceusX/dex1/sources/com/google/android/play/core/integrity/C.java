package com.google.android.play.core.integrity;

import a4.C1574k;
import android.os.RemoteException;

final class C extends I {

    final long f18780i;

    final C1574k f18781v;

    final J f18782w;

    C(J j7, C1574k c1574k, int i7, long j8, C1574k c1574k2) {
        super(j7, c1574k);
        this.f18780i = j8;
        this.f18781v = c1574k2;
        this.f18782w = j7;
    }

    @Override
    protected final void b() {
        if (J.j(this.f18782w)) {
            super.a(new C2319b(-2, null));
            return;
        }
        if (J.i(this.f18782w, 0)) {
            super.a(new C2319b(-14, null));
            return;
        }
        try {
            J j7 = this.f18782w;
            ((H4.L) j7.f18802f.e()).Q4(J.b(j7, this.f18780i, 0), new H(this.f18782w, this.f18781v));
        } catch (RemoteException e7) {
            this.f18782w.f18797a.b(e7, "warmUpIntegrityToken(%s)", Long.valueOf(this.f18780i));
            this.f18781v.d(new C2319b(-100, e7));
        }
    }
}
