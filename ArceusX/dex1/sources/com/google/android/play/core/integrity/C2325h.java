package com.google.android.play.core.integrity;

import H4.C0434g;
import a4.C1574k;
import android.os.Parcelable;
import android.os.RemoteException;

final class C2325h extends H4.V {

    final byte[] f18843e;

    final Long f18844i;

    final Parcelable f18845v;

    final C1574k f18846w;

    final IntegrityTokenRequest f18847y;

    final C2328k f18848z;

    C2325h(C2328k c2328k, C1574k c1574k, byte[] bArr, Long l7, Parcelable parcelable, C1574k c1574k2, IntegrityTokenRequest integrityTokenRequest) {
        super(c1574k);
        this.f18843e = bArr;
        this.f18844i = l7;
        this.f18845v = parcelable;
        this.f18846w = c1574k2;
        this.f18847y = integrityTokenRequest;
        this.f18848z = c2328k;
    }

    @Override
    public final void a(Exception exc) {
        if (exc instanceof C0434g) {
            super.a(new C2318a(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override
    protected final void b() {
        try {
            ((H4.Q) this.f18848z.f18863f.e()).W1(C2328k.a(this.f18848z, this.f18843e, this.f18844i, this.f18845v), new BinderC2327j(this.f18848z, this.f18846w));
        } catch (RemoteException e7) {
            this.f18848z.f18858a.b(e7, "requestIntegrityToken(%s)", this.f18847y);
            this.f18846w.d(new C2318a(-100, e7));
        }
    }
}
