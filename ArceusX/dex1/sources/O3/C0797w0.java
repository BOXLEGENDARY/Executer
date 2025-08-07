package O3;

import java.util.Objects;

final class C0797w0 extends AbstractC0633h0 {

    static final AbstractC0633h0 f3620y = new C0797w0(new Object[0], 0);

    final transient Object[] f3621v;

    private final transient int f3622w;

    C0797w0(Object[] objArr, int i7) {
        this.f3621v = objArr;
        this.f3622w = i7;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        System.arraycopy(this.f3621v, 0, objArr, i7, this.f3622w);
        return i7 + this.f3622w;
    }

    @Override
    final int e() {
        return this.f3622w;
    }

    @Override
    final int g() {
        return 0;
    }

    @Override
    public final Object get(int i7) {
        r.a(i7, this.f3622w, "index");
        Object obj = this.f3621v[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    final Object[] k() {
        return this.f3621v;
    }

    @Override
    public final int size() {
        return this.f3622w;
    }
}
