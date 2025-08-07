package R3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class C1099k extends Y {

    final AbstractC1147q f5626e;

    C1099k(AbstractC1147q abstractC1147q, Map map) {
        super(map);
        this.f5626e = abstractC1147q;
    }

    @Override
    public final void clear() {
        U.a(iterator());
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f5423d.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        return this == obj || this.f5423d.keySet().equals(obj);
    }

    @Override
    public final int hashCode() {
        return this.f5423d.keySet().hashCode();
    }

    @Override
    public final Iterator iterator() {
        return new C1091j(this, this.f5423d.entrySet().iterator());
    }

    @Override
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f5423d.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        AbstractC1147q.j(this.f5626e, size);
        return size > 0;
    }
}
