package R3;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

class C1123n extends AbstractCollection {

    final Object f5691d;

    Collection f5692e;

    final C1123n f5693i;

    final Collection f5694v;

    final AbstractC1147q f5695w;

    C1123n(AbstractC1147q abstractC1147q, Object obj, Collection collection, C1123n c1123n) {
        this.f5695w = abstractC1147q;
        this.f5691d = obj;
        this.f5692e = collection;
        this.f5693i = c1123n;
        this.f5694v = c1123n == null ? null : c1123n.f5692e;
    }

    @Override
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f5692e.isEmpty();
        boolean zAdd = this.f5692e.add(obj);
        if (!zAdd) {
            return zAdd;
        }
        AbstractC1147q.g(this.f5695w);
        if (!zIsEmpty) {
            return zAdd;
        }
        d();
        return true;
    }

    @Override
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f5692e.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        AbstractC1147q.i(this.f5695w, this.f5692e.size() - size);
        if (size != 0) {
            return zAddAll;
        }
        d();
        return true;
    }

    @Override
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f5692e.clear();
        AbstractC1147q.j(this.f5695w, size);
        e();
    }

    @Override
    public final boolean contains(Object obj) {
        zzb();
        return this.f5692e.contains(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f5692e.containsAll(collection);
    }

    final void d() {
        C1123n c1123n = this.f5693i;
        if (c1123n != null) {
            c1123n.d();
        } else {
            this.f5695w.f5781i.put(this.f5691d, this.f5692e);
        }
    }

    final void e() {
        C1123n c1123n = this.f5693i;
        if (c1123n != null) {
            c1123n.e();
        } else if (this.f5692e.isEmpty()) {
            this.f5695w.f5781i.remove(this.f5691d);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f5692e.equals(obj);
    }

    @Override
    public final int hashCode() {
        zzb();
        return this.f5692e.hashCode();
    }

    @Override
    public final Iterator iterator() {
        zzb();
        return new C1115m(this);
    }

    @Override
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.f5692e.remove(obj);
        if (zRemove) {
            AbstractC1147q.h(this.f5695w);
            e();
        }
        return zRemove;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f5692e.removeAll(collection);
        if (zRemoveAll) {
            AbstractC1147q.i(this.f5695w, this.f5692e.size() - size);
            e();
        }
        return zRemoveAll;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f5692e.retainAll(collection);
        if (zRetainAll) {
            AbstractC1147q.i(this.f5695w, this.f5692e.size() - size);
            e();
        }
        return zRetainAll;
    }

    @Override
    public final int size() {
        zzb();
        return this.f5692e.size();
    }

    @Override
    public final String toString() {
        zzb();
        return this.f5692e.toString();
    }

    final void zzb() {
        Collection collection;
        C1123n c1123n = this.f5693i;
        if (c1123n != null) {
            c1123n.zzb();
            if (this.f5693i.f5692e != this.f5694v) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f5692e.isEmpty() || (collection = (Collection) this.f5695w.f5781i.get(this.f5691d)) == null) {
                return;
            }
            this.f5692e = collection;
        }
    }
}
