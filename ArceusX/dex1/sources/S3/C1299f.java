package S3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class C1299f implements Iterator {

    Map.Entry f6928d;

    final Iterator f6929e;

    final C1310g f6930i;

    C1299f(C1310g c1310g, Iterator it) {
        this.f6929e = it;
        this.f6930i = c1310g;
    }

    @Override
    public final boolean hasNext() {
        return this.f6929e.hasNext();
    }

    @Override
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f6929e.next();
        this.f6928d = entry;
        return entry.getKey();
    }

    @Override
    public final void remove() {
        U9.d(this.f6928d != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f6928d.getValue();
        this.f6929e.remove();
        this.f6930i.f6939e.f7018v -= collection.size();
        collection.clear();
        this.f6928d = null;
    }
}
