package R3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class C1083i extends AbstractC1020a0 {

    final transient Map f5575i;

    final AbstractC1147q f5576v;

    C1083i(AbstractC1147q abstractC1147q, Map map) {
        this.f5576v = abstractC1147q;
        this.f5575i = map;
    }

    @Override
    protected final Set a() {
        return new C1067g(this);
    }

    @Override
    public final void clear() {
        Map map = this.f5575i;
        AbstractC1147q abstractC1147q = this.f5576v;
        if (map == abstractC1147q.f5781i) {
            abstractC1147q.q();
        } else {
            U.a(new C1075h(this));
        }
    }

    @Override
    public final boolean containsKey(Object obj) {
        return C1028b0.b(this.f5575i, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        return this == obj || this.f5575i.equals(obj);
    }

    @Override
    public final Object get(Object obj) {
        Collection collection = (Collection) C1028b0.a(this.f5575i, obj);
        if (collection == null) {
            return null;
        }
        return this.f5576v.f(obj, collection);
    }

    @Override
    public final int hashCode() {
        return this.f5575i.hashCode();
    }

    @Override
    public final Set keySet() {
        return this.f5576v.o();
    }

    @Override
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f5575i.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionE = this.f5576v.e();
        collectionE.addAll(collection);
        AbstractC1147q.j(this.f5576v, collection.size());
        collection.clear();
        return collectionE;
    }

    @Override
    public final int size() {
        return this.f5575i.size();
    }

    @Override
    public final String toString() {
        return this.f5575i.toString();
    }
}
