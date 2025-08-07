package Q3;

import java.util.AbstractMap;

final class T5 extends N5 {

    final U5 f4203i;

    T5(U5 u52) {
        this.f4203i = u52;
    }

    @Override
    public final Object get(int i7) {
        G1.a(i7, this.f4203i.f4215w, "index");
        U5 u52 = this.f4203i;
        int i8 = i7 + i7;
        Object obj = u52.f4214v[i8];
        obj.getClass();
        Object obj2 = u52.f4214v[i8 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f4203i.f4215w;
    }
}
