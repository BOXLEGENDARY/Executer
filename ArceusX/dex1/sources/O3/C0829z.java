package O3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class C0829z implements Iterator {

    Map.Entry f3675d;

    final Iterator f3676e;

    final A f3677i;

    C0829z(A a2, Iterator it) {
        this.f3676e = it;
        this.f3677i = a2;
    }

    @Override
    public final boolean hasNext() {
        return this.f3676e.hasNext();
    }

    @Override
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f3676e.next();
        this.f3675d = entry;
        return entry.getKey();
    }

    @Override
    public final void remove() {
        r.e(this.f3675d != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f3675d.getValue();
        this.f3676e.remove();
        this.f3677i.f2705e.f2764v -= collection.size();
        collection.clear();
        this.f3675d = null;
    }
}
