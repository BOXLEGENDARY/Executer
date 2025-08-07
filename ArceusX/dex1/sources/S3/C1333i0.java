package S3;

import java.util.AbstractMap;
import java.util.Objects;

final class C1333i0 extends M {

    final C1344j0 f6960v;

    C1333i0(C1344j0 c1344j0) {
        this.f6960v = c1344j0;
    }

    @Override
    public final Object get(int i7) {
        U9.a(i7, this.f6960v.f6972w, "index");
        int i8 = i7 + i7;
        Object obj = this.f6960v.f6971v[i8];
        Objects.requireNonNull(obj);
        Object obj2 = this.f6960v.f6971v[i8 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f6960v.f6972w;
    }
}
