package N3;

import java.util.AbstractMap;
import java.util.Objects;

final class C0542m extends AbstractC0535f {

    final C0543n f2622v;

    C0542m(C0543n c0543n) {
        this.f2622v = c0543n;
    }

    @Override
    public final Object get(int i7) {
        Y.a(i7, this.f2622v.f2625w, "index");
        int i8 = i7 + i7;
        Object obj = this.f2622v.f2624v[i8];
        Objects.requireNonNull(obj);
        Object obj2 = this.f2622v.f2624v[i8 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f2622v.f2625w;
    }
}
