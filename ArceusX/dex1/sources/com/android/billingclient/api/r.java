package com.android.billingclient.api;

import e2.InterfaceC2418g;
import java.util.concurrent.Callable;

final class r implements Callable {

    final String f13553d;

    final InterfaceC2418g f13554e;

    final C1759c f13555i;

    r(C1759c c1759c, String str, InterfaceC2418g interfaceC2418g) {
        this.f13553d = str;
        this.f13554e = interfaceC2418g;
        this.f13555i = c1759c;
    }

    @Override
    public final Object call() throws Exception {
        C1778w c1778wQ0 = this.f13555i.q0(this.f13553d);
        this.f13554e.a(c1778wQ0.a(), c1778wQ0.b());
        return null;
    }
}
