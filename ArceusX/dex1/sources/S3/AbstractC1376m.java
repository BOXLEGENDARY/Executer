package S3;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

abstract class AbstractC1376m extends AbstractC1398o implements Serializable {

    private transient Map f7017i;

    private transient int f7018v;

    protected AbstractC1376m(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f7017i = map;
    }

    static void n(AbstractC1376m abstractC1376m, Object obj) {
        Object objRemove;
        Map map = abstractC1376m.f7017i;
        map.getClass();
        try {
            objRemove = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            abstractC1376m.f7018v -= size;
        }
    }

    @Override
    public final boolean b(Object obj, Object obj2) {
        Collection collection = (Collection) this.f7017i.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f7018v++;
            return true;
        }
        Collection collectionE = e();
        if (!collectionE.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f7018v++;
        this.f7017i.put(obj, collectionE);
        return true;
    }

    @Override
    final Map c() {
        return new C1288e(this, this.f7017i);
    }

    @Override
    final Set d() {
        return new C1310g(this, this.f7017i);
    }

    abstract Collection e();

    abstract Collection f(Object obj, Collection collection);

    public final Collection h(Object obj) {
        Collection collectionE = (Collection) this.f7017i.get(obj);
        if (collectionE == null) {
            collectionE = e();
        }
        return f(obj, collectionE);
    }

    final List i(Object obj, List list, C1343j c1343j) {
        return list instanceof RandomAccess ? new C1321h(this, obj, list, c1343j) : new C1365l(this, obj, list, c1343j);
    }

    public final void o() {
        Iterator it = this.f7017i.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f7017i.clear();
        this.f7018v = 0;
    }
}
