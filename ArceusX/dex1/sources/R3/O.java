package R3;

import java.util.List;

final class O extends P {

    final transient int f5302i;

    final transient int f5303v;

    final P f5304w;

    O(P p7, int i7, int i8) {
        this.f5304w = p7;
        this.f5302i = i7;
        this.f5303v = i8;
    }

    @Override
    final int e() {
        return this.f5304w.g() + this.f5302i + this.f5303v;
    }

    @Override
    final int g() {
        return this.f5304w.g() + this.f5302i;
    }

    @Override
    public final Object get(int i7) {
        C1035c.a(i7, this.f5303v, "index");
        return this.f5304w.get(i7 + this.f5302i);
    }

    @Override
    final Object[] j() {
        return this.f5304w.j();
    }

    @Override
    public final P subList(int i7, int i8) {
        C1035c.c(i7, i8, this.f5303v);
        P p7 = this.f5304w;
        int i9 = this.f5302i;
        return p7.subList(i7 + i9, i8 + i9);
    }

    @Override
    public final int size() {
        return this.f5303v;
    }

    @Override
    public final List subList(int i7, int i8) {
        return subList(i7, i8);
    }
}
