package com.google.android.gms.measurement.internal;

final class C2231i3 extends AbstractC2242l {

    final C2315z3 f16835e;

    C2231i3(C2315z3 c2315z3, InterfaceC2235j2 interfaceC2235j2) {
        super(interfaceC2235j2);
        this.f16835e = c2315z3;
    }

    @Override
    public final void c() {
        C2315z3 c2315z3 = this.f16835e;
        c2315z3.h();
        if (c2315z3.z()) {
            c2315z3.f16818a.b().v().a("Inactivity, disconnecting from the service");
            c2315z3.Q();
        }
    }
}
