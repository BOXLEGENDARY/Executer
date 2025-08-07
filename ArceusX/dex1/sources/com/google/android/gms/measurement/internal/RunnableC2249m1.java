package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;
import n3.C2651i;

final class RunnableC2249m1 implements Runnable {

    private final InterfaceC2244l1 f16903d;

    private final int f16904e;

    private final Throwable f16905i;

    private final byte[] f16906v;

    private final String f16907w;

    private final Map<String, List<String>> f16908y;

    RunnableC2249m1(String str, InterfaceC2244l1 interfaceC2244l1, int i7, Throwable th, byte[] bArr, Map map, W3.f fVar) {
        C2651i.l(interfaceC2244l1);
        this.f16903d = interfaceC2244l1;
        this.f16904e = i7;
        this.f16905i = th;
        this.f16906v = bArr;
        this.f16907w = str;
        this.f16908y = map;
    }

    @Override
    public final void run() {
        this.f16903d.a(this.f16907w, this.f16904e, this.f16905i, this.f16906v, this.f16908y);
    }
}
