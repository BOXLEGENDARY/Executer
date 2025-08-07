package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C1801a;

final class C1815o implements ComponentCallbacks2C1801a.InterfaceC0151a {

    final C1803c f14166a;

    C1815o(C1803c c1803c) {
        this.f14166a = c1803c;
    }

    @Override
    public final void a(boolean z7) {
        C1803c c1803c = this.f14166a;
        c1803c.f14120G.sendMessage(c1803c.f14120G.obtainMessage(1, Boolean.valueOf(z7)));
    }
}
