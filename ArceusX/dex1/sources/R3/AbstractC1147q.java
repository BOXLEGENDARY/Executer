package R3;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

abstract class AbstractC1147q extends AbstractC1162s implements Serializable {

    private transient Map f5781i;

    private transient int f5782v;

    protected AbstractC1147q(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f5781i = map;
    }

    static int g(AbstractC1147q abstractC1147q) {
        int i7 = abstractC1147q.f5782v;
        abstractC1147q.f5782v = i7 + 1;
        return i7;
    }

    static int h(AbstractC1147q abstractC1147q) {
        int i7 = abstractC1147q.f5782v;
        abstractC1147q.f5782v = i7 - 1;
        return i7;
    }

    static int i(AbstractC1147q abstractC1147q, int i7) {
        int i8 = abstractC1147q.f5782v + i7;
        abstractC1147q.f5782v = i8;
        return i8;
    }

    static int j(AbstractC1147q abstractC1147q, int i7) {
        int i8 = abstractC1147q.f5782v - i7;
        abstractC1147q.f5782v = i8;
        return i8;
    }

    static void p(AbstractC1147q abstractC1147q, Object obj) {
        Object objRemove;
        Map map = abstractC1147q.f5781i;
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
            abstractC1147q.f5782v -= size;
        }
    }

    @Override
    public final boolean b(Object obj, Object obj2) {
        Collection collection = (Collection) this.f5781i.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f5782v++;
            return true;
        }
        Collection collectionE = e();
        if (!collectionE.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f5782v++;
        this.f5781i.put(obj, collectionE);
        return true;
    }

    @Override
    final Map c() {
        return new C1083i(this, this.f5781i);
    }

    @Override
    final Set d() {
        return new C1099k(this, this.f5781i);
    }

    abstract Collection e();

    abstract Collection f(Object obj, Collection collection);

    public final Collection k(Object obj) {
        Collection collectionE = (Collection) this.f5781i.get(obj);
        if (collectionE == null) {
            collectionE = e();
        }
        return f(obj, collectionE);
    }

    final List l(Object obj, List list, C1123n c1123n) {
        return list instanceof RandomAccess ? new C1107l(this, obj, list, c1123n) : new C1139p(this, obj, list, c1123n);
    }

    public final void q() {
        Iterator it = this.f5781i.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f5781i.clear();
        this.f5782v = 0;
    }
}
