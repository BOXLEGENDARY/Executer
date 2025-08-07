package O3;

import java.util.Objects;

final class A0 extends AbstractC0633h0 {

    private final transient Object[] f2706v;

    private final transient int f2707w;

    private final transient int f2708y = 1;

    A0(Object[] objArr, int i7, int i8) {
        this.f2706v = objArr;
        this.f2707w = i7;
    }

    @Override
    public final Object get(int i7) {
        r.a(i7, this.f2708y, "index");
        Object obj = this.f2706v[i7 + i7 + this.f2707w];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int size() {
        return this.f2708y;
    }
}
