package com.google.android.play.core.integrity;

import H4.C0451y;
import H4.InterfaceC0452z;
import android.content.Context;

final class e0 {

    private final H4.D f18829a;

    private final H4.D f18830b;

    private final H4.D f18831c;

    private final H4.D f18832d;

    private final H4.D f18833e;

    e0(Context context, z4.i iVar) {
        InterfaceC0452z interfaceC0452zB = H4.A.b(context);
        this.f18829a = interfaceC0452zB;
        H4.D dB = C0451y.b(C2324g.f18836a);
        this.f18830b = dB;
        C2335s c2335s = new C2335s(interfaceC0452zB, Z.f18821a);
        this.f18831c = c2335s;
        H4.D dB2 = C0451y.b(new C2330m(interfaceC0452zB, dB, c2335s, Z.f18821a));
        this.f18832d = dB2;
        this.f18833e = C0451y.b(new C2323f(dB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f18833e.a();
    }
}
