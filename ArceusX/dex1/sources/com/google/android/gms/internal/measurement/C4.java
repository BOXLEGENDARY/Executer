package com.google.android.gms.internal.measurement;

import java.io.IOException;

final class C4<T> implements J4<T> {

    private final InterfaceC2021y4 f14684a;

    private final Y4<?, ?> f14685b;

    private final boolean f14686c;

    private final H3<?> f14687d;

    private C4(Y4<?, ?> y42, H3<?> h32, InterfaceC2021y4 interfaceC2021y4) {
        this.f14685b = y42;
        this.f14686c = h32.c(interfaceC2021y4);
        this.f14687d = h32;
        this.f14684a = interfaceC2021y4;
    }

    static <T> C4<T> j(Y4<?, ?> y42, H3<?> h32, InterfaceC2021y4 interfaceC2021y4) {
        return new C4<>(y42, h32, interfaceC2021y4);
    }

    @Override
    public final int a(T t7) {
        Y4<?, ?> y42 = this.f14685b;
        int iB = y42.b(y42.c(t7));
        if (!this.f14686c) {
            return iB;
        }
        this.f14687d.a(t7);
        throw null;
    }

    @Override
    public final T b() {
        return (T) this.f14684a.g().A();
    }

    @Override
    public final int c(T t7) {
        int iHashCode = this.f14685b.c(t7).hashCode();
        if (!this.f14686c) {
            return iHashCode;
        }
        this.f14687d.a(t7);
        throw null;
    }

    @Override
    public final void d(T t7) {
        this.f14685b.g(t7);
        this.f14687d.b(t7);
    }

    @Override
    public final void e(T t7, T t8) {
        L4.f(this.f14685b, t7, t8);
        if (this.f14686c) {
            L4.e(this.f14687d, t7, t8);
        }
    }

    @Override
    public final boolean f(T t7) {
        this.f14687d.a(t7);
        throw null;
    }

    @Override
    public final void g(T t7, byte[] bArr, int i7, int i8, C1877g3 c1877g3) throws IOException {
        T3 t32 = (T3) t7;
        if (t32.zzc == Z4.c()) {
            t32.zzc = Z4.e();
        }
        throw null;
    }

    @Override
    public final boolean h(T t7, T t8) {
        if (!this.f14685b.c(t7).equals(this.f14685b.c(t8))) {
            return false;
        }
        if (!this.f14686c) {
            return true;
        }
        this.f14687d.a(t7);
        this.f14687d.a(t8);
        throw null;
    }

    @Override
    public final void i(T t7, C3 c3) throws IOException {
        this.f14687d.a(t7);
        throw null;
    }
}
