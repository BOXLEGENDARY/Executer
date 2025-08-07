package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

final class W3 implements InterfaceC2244l1 {

    final String f16557a;

    final c4 f16558b;

    W3(c4 c4Var, String str) {
        this.f16558b = c4Var;
        this.f16557a = str;
    }

    @Override
    public final void a(String str, int i7, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.f16558b.o(i7, th, bArr, this.f16557a);
    }
}
