package com.google.android.play.core.integrity;

import H4.C0451y;
import H4.InterfaceC0452z;
import android.content.Context;

final class g0 implements InterfaceC2337u {

    private final H4.D f18837a;

    private final H4.D f18838b;

    private final H4.D f18839c;

    private final H4.D f18840d;

    private final H4.D f18841e;

    private final H4.D f18842f;

    g0(Context context, z4.k kVar) {
        InterfaceC0452z interfaceC0452zB = H4.A.b(context);
        this.f18837a = interfaceC0452zB;
        H4.D dB = C0451y.b(A.f18777a);
        this.f18838b = dB;
        C2335s c2335s = new C2335s(interfaceC0452zB, b0.f18824a);
        this.f18839c = c2335s;
        H4.D dB2 = C0451y.b(new L(interfaceC0452zB, dB, c2335s, b0.f18824a));
        this.f18840d = dB2;
        H4.D dB3 = C0451y.b(new Q(dB2));
        this.f18841e = dB3;
        this.f18842f = C0451y.b(new C2342z(dB2, dB3));
    }

    @Override
    public final InterfaceC2320c a() {
        return (InterfaceC2320c) this.f18842f.a();
    }
}
