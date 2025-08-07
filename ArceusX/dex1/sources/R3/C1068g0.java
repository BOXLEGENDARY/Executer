package R3;

import java.util.AbstractMap;

final class C1068g0 extends P {

    final C1076h0 f5532i;

    C1068g0(C1076h0 c1076h0) {
        this.f5532i = c1076h0;
    }

    @Override
    public final Object get(int i7) {
        C1035c.a(i7, this.f5532i.f5557w, "index");
        C1076h0 c1076h0 = this.f5532i;
        int i8 = i7 + i7;
        Object obj = c1076h0.f5556v[i8];
        obj.getClass();
        Object obj2 = c1076h0.f5556v[i8 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f5532i.f5557w;
    }
}
