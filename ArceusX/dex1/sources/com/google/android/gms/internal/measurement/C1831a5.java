package com.google.android.gms.internal.measurement;

import java.io.IOException;

final class C1831a5 extends Y4<Z4, Z4> {
    C1831a5() {
    }

    @Override
    final int a(Z4 z42) {
        return z42.a();
    }

    @Override
    final int b(Z4 z42) {
        return z42.b();
    }

    @Override
    final Z4 c(Object obj) {
        return ((T3) obj).zzc;
    }

    @Override
    final Z4 d(Z4 z42, Z4 z43) {
        Z4 z44 = z43;
        return z44.equals(Z4.c()) ? z42 : Z4.d(z42, z44);
    }

    @Override
    final Z4 e() {
        return Z4.e();
    }

    @Override
    final void f(Z4 z42, int i7, long j7) {
        z42.h(i7 << 3, Long.valueOf(j7));
    }

    @Override
    final void g(Object obj) {
        ((T3) obj).zzc.f();
    }

    @Override
    final void h(Object obj, Z4 z42) {
        ((T3) obj).zzc = z42;
    }

    @Override
    final void i(Z4 z42, C3 c3) throws IOException {
        z42.i(c3);
    }
}
