package S3;

import java.util.List;

final class L extends M {

    final transient int f6793v;

    final transient int f6794w;

    final M f6795y;

    L(M m7, int i7, int i8) {
        this.f6795y = m7;
        this.f6793v = i7;
        this.f6794w = i8;
    }

    @Override
    final int e() {
        return this.f6795y.g() + this.f6793v + this.f6794w;
    }

    @Override
    final int g() {
        return this.f6795y.g() + this.f6793v;
    }

    @Override
    public final Object get(int i7) {
        U9.a(i7, this.f6794w, "index");
        return this.f6795y.get(i7 + this.f6793v);
    }

    @Override
    final Object[] j() {
        return this.f6795y.j();
    }

    @Override
    public final M subList(int i7, int i8) {
        U9.c(i7, i8, this.f6794w);
        int i9 = this.f6793v;
        return this.f6795y.subList(i7 + i9, i8 + i9);
    }

    @Override
    public final int size() {
        return this.f6794w;
    }

    @Override
    public final List subList(int i7, int i8) {
        return subList(i7, i8);
    }
}
