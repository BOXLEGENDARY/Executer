package O3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class A extends C0721p0 {

    final G f2705e;

    A(G g7, Map map) {
        super(map);
        this.f2705e = g7;
    }

    @Override
    public final void clear() {
        C0677l0.a(iterator());
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f3532d.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        return this == obj || this.f3532d.keySet().equals(obj);
    }

    @Override
    public final int hashCode() {
        return this.f3532d.keySet().hashCode();
    }

    @Override
    public final Iterator iterator() {
        return new C0829z(this, this.f3532d.entrySet().iterator());
    }

    @Override
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f3532d.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f2705e.f2764v -= size;
        return size > 0;
    }
}
