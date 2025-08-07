package L4;

import java.util.Objects;

class h<E> extends c<E> {

    static final c<Object> f2069w = new h(new Object[0], 0);

    final transient Object[] f2070i;

    private final transient int f2071v;

    h(Object[] objArr, int i7) {
        this.f2070i = objArr;
        this.f2071v = i7;
    }

    @Override
    int d(Object[] objArr, int i7) {
        System.arraycopy(this.f2070i, 0, objArr, i7, this.f2071v);
        return i7 + this.f2071v;
    }

    @Override
    Object[] e() {
        return this.f2070i;
    }

    @Override
    int g() {
        return this.f2071v;
    }

    @Override
    public E get(int i7) {
        K4.g.e(i7, this.f2071v);
        E e7 = (E) this.f2070i[i7];
        Objects.requireNonNull(e7);
        return e7;
    }

    @Override
    int j() {
        return 0;
    }

    @Override
    public int size() {
        return this.f2071v;
    }
}
