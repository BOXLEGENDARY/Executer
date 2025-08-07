package O3;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

final class W extends AbstractCollection {

    final X f3314d;

    W(X x7) {
        this.f3314d = x7;
    }

    @Override
    public final void clear() {
        this.f3314d.clear();
    }

    @Override
    public final Iterator iterator() {
        X x7 = this.f3314d;
        Map mapP = x7.p();
        return mapP != null ? mapP.values().iterator() : new P(x7);
    }

    @Override
    public final int size() {
        return this.f3314d.size();
    }
}
