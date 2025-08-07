package S3;

import java.util.Objects;

final class C1322h0 extends M {

    static final M f6950y = new C1322h0(new Object[0], 0);

    final transient Object[] f6951v;

    private final transient int f6952w;

    C1322h0(Object[] objArr, int i7) {
        this.f6951v = objArr;
        this.f6952w = i7;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        System.arraycopy(this.f6951v, 0, objArr, 0, this.f6952w);
        return this.f6952w;
    }

    @Override
    final int e() {
        return this.f6952w;
    }

    @Override
    final int g() {
        return 0;
    }

    @Override
    public final Object get(int i7) {
        U9.a(i7, this.f6952w, "index");
        Object obj = this.f6951v[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    final Object[] j() {
        return this.f6951v;
    }

    @Override
    public final int size() {
        return this.f6952w;
    }
}
