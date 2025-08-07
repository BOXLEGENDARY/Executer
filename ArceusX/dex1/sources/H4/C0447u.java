package H4;

import java.util.Objects;

final class C0447u extends AbstractC0445s {

    static final AbstractC0445s f1623w = new C0447u(new Object[0], 0);

    final transient Object[] f1624v;

    C0447u(Object[] objArr, int i7) {
        this.f1624v = objArr;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        System.arraycopy(this.f1624v, 0, objArr, 0, 0);
        return 0;
    }

    @Override
    final int e() {
        return 0;
    }

    @Override
    final int g() {
        return 0;
    }

    @Override
    public final Object get(int i7) {
        C0440m.a(i7, 0, "index");
        Object obj = this.f1624v[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    final Object[] j() {
        return this.f1624v;
    }

    @Override
    public final int size() {
        return 0;
    }
}
