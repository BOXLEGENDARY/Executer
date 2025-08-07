package R3;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

final class E extends AbstractCollection {

    final F f5178d;

    E(F f7) {
        this.f5178d = f7;
    }

    @Override
    public final void clear() {
        this.f5178d.clear();
    }

    @Override
    public final Iterator iterator() {
        F f7 = this.f5178d;
        Map mapO = f7.o();
        return mapO != null ? mapO.values().iterator() : new C1205y(f7);
    }

    @Override
    public final int size() {
        return this.f5178d.size();
    }
}
