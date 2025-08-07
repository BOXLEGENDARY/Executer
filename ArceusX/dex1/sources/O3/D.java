package O3;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

class D extends AbstractCollection {

    final Object f2741d;

    Collection f2742e;

    final D f2743i;

    final Collection f2744v;

    final G f2745w;

    D(G g7, Object obj, Collection collection, D d7) {
        this.f2745w = g7;
        this.f2741d = obj;
        this.f2742e = collection;
        this.f2743i = d7;
        this.f2744v = d7 == null ? null : d7.f2742e;
    }

    @Override
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f2742e.isEmpty();
        boolean zAdd = this.f2742e.add(obj);
        if (zAdd) {
            this.f2745w.f2764v++;
            if (zIsEmpty) {
                d();
                return true;
            }
        }
        return zAdd;
    }

    @Override
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f2742e.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f2742e.size();
        this.f2745w.f2764v += size2 - size;
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
        this.f2742e.clear();
        this.f2745w.f2764v -= size;
        e();
    }

    @Override
    public final boolean contains(Object obj) {
        zzb();
        return this.f2742e.contains(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f2742e.containsAll(collection);
    }

    final void d() {
        D d7 = this.f2743i;
        if (d7 != null) {
            d7.d();
            return;
        }
        G g7 = this.f2745w;
        g7.f2763i.put(this.f2741d, this.f2742e);
    }

    final void e() {
        D d7 = this.f2743i;
        if (d7 != null) {
            d7.e();
        } else if (this.f2742e.isEmpty()) {
            G g7 = this.f2745w;
            g7.f2763i.remove(this.f2741d);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f2742e.equals(obj);
    }

    @Override
    public final int hashCode() {
        zzb();
        return this.f2742e.hashCode();
    }

    @Override
    public final Iterator iterator() {
        zzb();
        return new C(this);
    }

    @Override
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.f2742e.remove(obj);
        if (zRemove) {
            G g7 = this.f2745w;
            g7.f2764v--;
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
        boolean zRemoveAll = this.f2742e.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f2742e.size();
            this.f2745w.f2764v += size2 - size;
            e();
        }
        return zRemoveAll;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f2742e.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f2742e.size();
            this.f2745w.f2764v += size2 - size;
            e();
        }
        return zRetainAll;
    }

    @Override
    public final int size() {
        zzb();
        return this.f2742e.size();
    }

    @Override
    public final String toString() {
        zzb();
        return this.f2742e.toString();
    }

    final void zzb() {
        D d7 = this.f2743i;
        if (d7 != null) {
            d7.zzb();
            D d8 = this.f2743i;
            if (d8.f2742e != this.f2744v) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f2742e.isEmpty()) {
            G g7 = this.f2745w;
            Collection collection = (Collection) g7.f2763i.get(this.f2741d);
            if (collection != null) {
                this.f2742e = collection;
            }
        }
    }
}
