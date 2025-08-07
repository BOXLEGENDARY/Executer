package N3;

import java.util.Objects;

final class C0545p extends AbstractC0535f {

    private final transient Object[] f2628v;

    private final transient int f2629w;

    private final transient int f2630y;

    C0545p(Object[] objArr, int i7, int i8) {
        this.f2628v = objArr;
        this.f2629w = i7;
        this.f2630y = i8;
    }

    @Override
    public final Object get(int i7) {
        Y.a(i7, this.f2630y, "index");
        Object obj = this.f2628v[i7 + i7 + this.f2629w];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int size() {
        return this.f2630y;
    }
}
