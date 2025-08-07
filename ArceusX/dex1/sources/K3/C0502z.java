package K3;

import java.util.List;

final class C0502z extends A {

    final transient int f1905v;

    final transient int f1906w;

    final A f1907y;

    C0502z(A a2, int i7, int i8) {
        this.f1907y = a2;
        this.f1905v = i7;
        this.f1906w = i8;
    }

    @Override
    final int e() {
        return this.f1907y.g() + this.f1905v + this.f1906w;
    }

    @Override
    final int g() {
        return this.f1907y.g() + this.f1905v;
    }

    @Override
    public final Object get(int i7) {
        C0485q.a(i7, this.f1906w, "index");
        return this.f1907y.get(i7 + this.f1905v);
    }

    @Override
    final Object[] k() {
        return this.f1907y.k();
    }

    @Override
    public final A subList(int i7, int i8) {
        C0485q.e(i7, i8, this.f1906w);
        A a2 = this.f1907y;
        int i9 = this.f1905v;
        return a2.subList(i7 + i9, i8 + i9);
    }

    @Override
    public final int size() {
        return this.f1906w;
    }

    @Override
    public final List subList(int i7, int i8) {
        return subList(i7, i8);
    }
}
