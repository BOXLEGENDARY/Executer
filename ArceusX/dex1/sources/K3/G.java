package K3;

import java.util.AbstractMap;

final class G extends A {

    final H f1778v;

    G(H h7) {
        this.f1778v = h7;
    }

    @Override
    public final Object get(int i7) {
        return new AbstractMap.SimpleImmutableEntry(this.f1778v.f1785i.f1789i.f1818w.get(i7), this.f1778v.f1785i.f1790v.get(i7));
    }

    @Override
    public final int size() {
        return this.f1778v.f1785i.size();
    }
}
