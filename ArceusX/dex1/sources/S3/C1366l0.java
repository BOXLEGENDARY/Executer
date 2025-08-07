package S3;

import java.util.Objects;

final class C1366l0 extends M {

    private final transient Object[] f7002v;

    private final transient int f7003w;

    private final transient int f7004y = 1;

    C1366l0(Object[] objArr, int i7, int i8) {
        this.f7002v = objArr;
        this.f7003w = i7;
    }

    @Override
    public final Object get(int i7) {
        U9.a(i7, this.f7004y, "index");
        Object obj = this.f7002v[i7 + i7 + this.f7003w];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int size() {
        return this.f7004y;
    }
}
