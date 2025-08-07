package com.google.android.gms.common.moduleinstall.internal;

import a4.C1574k;
import com.google.android.gms.common.api.Status;
import m3.InterfaceC2573d;
import m3.m;

final class h extends InterfaceC2573d.a {

    final C1574k f14390d;

    h(i iVar, C1574k c1574k) {
        this.f14390d = c1574k;
    }

    @Override
    public final void E2(Status status) {
        m.c(status, Boolean.TRUE, this.f14390d);
    }
}
