package N3;

import java.util.List;

final class C0534e extends AbstractC0535f {

    final transient int f2604v;

    final transient int f2605w;

    final AbstractC0535f f2606y;

    C0534e(AbstractC0535f abstractC0535f, int i7, int i8) {
        this.f2606y = abstractC0535f;
        this.f2604v = i7;
        this.f2605w = i8;
    }

    @Override
    final int e() {
        return this.f2606y.g() + this.f2604v + this.f2605w;
    }

    @Override
    final int g() {
        return this.f2606y.g() + this.f2604v;
    }

    @Override
    public final Object get(int i7) {
        Y.a(i7, this.f2605w, "index");
        return this.f2606y.get(i7 + this.f2604v);
    }

    @Override
    final Object[] j() {
        return this.f2606y.j();
    }

    @Override
    public final AbstractC0535f subList(int i7, int i8) {
        Y.c(i7, i8, this.f2605w);
        int i9 = this.f2604v;
        return this.f2606y.subList(i7 + i9, i8 + i9);
    }

    @Override
    public final int size() {
        return this.f2605w;
    }

    @Override
    public final List subList(int i7, int i8) {
        return subList(i7, i8);
    }
}
