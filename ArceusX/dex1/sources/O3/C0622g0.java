package O3;

import java.util.List;

final class C0622g0 extends AbstractC0633h0 {

    final transient int f3461v;

    final transient int f3462w;

    final AbstractC0633h0 f3463y;

    C0622g0(AbstractC0633h0 abstractC0633h0, int i7, int i8) {
        this.f3463y = abstractC0633h0;
        this.f3461v = i7;
        this.f3462w = i8;
    }

    @Override
    final int e() {
        return this.f3463y.g() + this.f3461v + this.f3462w;
    }

    @Override
    final int g() {
        return this.f3463y.g() + this.f3461v;
    }

    @Override
    public final Object get(int i7) {
        r.a(i7, this.f3462w, "index");
        return this.f3463y.get(i7 + this.f3461v);
    }

    @Override
    final Object[] k() {
        return this.f3463y.k();
    }

    @Override
    public final AbstractC0633h0 subList(int i7, int i8) {
        r.d(i7, i8, this.f3462w);
        int i9 = this.f3461v;
        return this.f3463y.subList(i7 + i9, i8 + i9);
    }

    @Override
    public final int size() {
        return this.f3462w;
    }

    @Override
    public final List subList(int i7, int i8) {
        return subList(i7, i8);
    }
}
