package Q3;

import java.util.List;

final class M5 extends N5 {

    final transient int f4126i;

    final transient int f4127v;

    final N5 f4128w;

    M5(N5 n52, int i7, int i8) {
        this.f4128w = n52;
        this.f4126i = i7;
        this.f4127v = i8;
    }

    @Override
    final int e() {
        return this.f4128w.g() + this.f4126i + this.f4127v;
    }

    @Override
    final int g() {
        return this.f4128w.g() + this.f4126i;
    }

    @Override
    public final Object get(int i7) {
        G1.a(i7, this.f4127v, "index");
        return this.f4128w.get(i7 + this.f4126i);
    }

    @Override
    final Object[] j() {
        return this.f4128w.j();
    }

    @Override
    public final N5 subList(int i7, int i8) {
        G1.c(i7, i8, this.f4127v);
        N5 n52 = this.f4128w;
        int i9 = this.f4126i;
        return n52.subList(i7 + i9, i8 + i9);
    }

    @Override
    public final int size() {
        return this.f4127v;
    }

    @Override
    public final List subList(int i7, int i8) {
        return subList(i7, i8);
    }
}
