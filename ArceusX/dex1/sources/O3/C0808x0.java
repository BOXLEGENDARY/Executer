package O3;

import java.util.AbstractMap;
import java.util.Objects;

final class C0808x0 extends AbstractC0633h0 {

    final C0819y0 f3635v;

    C0808x0(C0819y0 c0819y0) {
        this.f3635v = c0819y0;
    }

    @Override
    public final Object get(int i7) {
        r.a(i7, this.f3635v.f3644w, "index");
        int i8 = i7 + i7;
        Object obj = this.f3635v.f3643v[i8];
        Objects.requireNonNull(obj);
        Object obj2 = this.f3635v.f3643v[i8 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f3635v.f3644w;
    }
}
