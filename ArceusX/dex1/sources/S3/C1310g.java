package S3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class C1310g extends C1245a0 {

    final AbstractC1376m f6939e;

    C1310g(AbstractC1376m abstractC1376m, Map map) {
        super(map);
        this.f6939e = abstractC1376m;
    }

    @Override
    public final void clear() {
        Q.a(iterator());
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f6886d.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        return this == obj || this.f6886d.keySet().equals(obj);
    }

    @Override
    public final int hashCode() {
        return this.f6886d.keySet().hashCode();
    }

    @Override
    public final Iterator iterator() {
        return new C1299f(this, this.f6886d.entrySet().iterator());
    }

    @Override
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f6886d.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f6939e.f7018v -= size;
        return size > 0;
    }
}
