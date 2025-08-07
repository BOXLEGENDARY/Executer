package O3;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

abstract class G extends I implements Serializable {

    private final transient Map f2763i;

    private transient int f2764v;

    protected G(Map map) {
        r.c(map.isEmpty());
        this.f2763i = map;
    }

    static void k(G g7, Object obj) {
        Object objRemove;
        try {
            objRemove = g7.f2763i.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            g7.f2764v -= size;
        }
    }

    @Override
    public final boolean D(Object obj, Object obj2) {
        Collection collection = (Collection) this.f2763i.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f2764v++;
            return true;
        }
        Collection collectionD = d();
        if (!collectionD.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f2764v++;
        this.f2763i.put(obj, collectionD);
        return true;
    }

    @Override
    final Map b() {
        return new C0818y(this, this.f2763i);
    }

    @Override
    final Set c() {
        return new A(this, this.f2763i);
    }

    abstract Collection d();

    abstract Collection e(Object obj, Collection collection);

    public final Collection g(Object obj) {
        Collection collectionD = (Collection) this.f2763i.get(obj);
        if (collectionD == null) {
            collectionD = d();
        }
        return e(obj, collectionD);
    }

    final List h(Object obj, List list, D d7) {
        return list instanceof RandomAccess ? new B(this, obj, list, d7) : new F(this, obj, list, d7);
    }

    public final void l() {
        Iterator it = this.f2763i.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f2763i.clear();
        this.f2764v = 0;
    }
}
