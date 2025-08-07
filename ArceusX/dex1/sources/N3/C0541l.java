package N3;

import java.util.Objects;

final class C0541l extends AbstractC0535f {

    static final AbstractC0535f f2619y = new C0541l(new Object[0], 0);

    final transient Object[] f2620v;

    private final transient int f2621w;

    C0541l(Object[] objArr, int i7) {
        this.f2620v = objArr;
        this.f2621w = i7;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        System.arraycopy(this.f2620v, 0, objArr, 0, this.f2621w);
        return this.f2621w;
    }

    @Override
    final int e() {
        return this.f2621w;
    }

    @Override
    final int g() {
        return 0;
    }

    @Override
    public final Object get(int i7) {
        Y.a(i7, this.f2621w, "index");
        Object obj = this.f2620v[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    final Object[] j() {
        return this.f2620v;
    }

    @Override
    public final int size() {
        return this.f2621w;
    }
}
