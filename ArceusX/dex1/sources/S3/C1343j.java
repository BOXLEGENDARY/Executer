package S3;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

class C1343j extends AbstractCollection {

    final Object f6965d;

    Collection f6966e;

    final C1343j f6967i;

    final Collection f6968v;

    final AbstractC1376m f6969w;

    C1343j(AbstractC1376m abstractC1376m, Object obj, Collection collection, C1343j c1343j) {
        this.f6969w = abstractC1376m;
        this.f6965d = obj;
        this.f6966e = collection;
        this.f6967i = c1343j;
        this.f6968v = c1343j == null ? null : c1343j.f6966e;
    }

    @Override
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f6966e.isEmpty();
        boolean zAdd = this.f6966e.add(obj);
        if (zAdd) {
            this.f6969w.f7018v++;
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
        boolean zAddAll = this.f6966e.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f6966e.size();
        this.f6969w.f7018v += size2 - size;
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
        this.f6966e.clear();
        this.f6969w.f7018v -= size;
        e();
    }

    @Override
    public final boolean contains(Object obj) {
        zzb();
        return this.f6966e.contains(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f6966e.containsAll(collection);
    }

    final void d() {
        C1343j c1343j = this.f6967i;
        if (c1343j != null) {
            c1343j.d();
            return;
        }
        AbstractC1376m abstractC1376m = this.f6969w;
        abstractC1376m.f7017i.put(this.f6965d, this.f6966e);
    }

    final void e() {
        C1343j c1343j = this.f6967i;
        if (c1343j != null) {
            c1343j.e();
        } else if (this.f6966e.isEmpty()) {
            AbstractC1376m abstractC1376m = this.f6969w;
            abstractC1376m.f7017i.remove(this.f6965d);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f6966e.equals(obj);
    }

    @Override
    public final int hashCode() {
        zzb();
        return this.f6966e.hashCode();
    }

    @Override
    public final Iterator iterator() {
        zzb();
        return new C1332i(this);
    }

    @Override
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.f6966e.remove(obj);
        if (zRemove) {
            AbstractC1376m abstractC1376m = this.f6969w;
            abstractC1376m.f7018v--;
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
        boolean zRemoveAll = this.f6966e.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f6966e.size();
            this.f6969w.f7018v += size2 - size;
            e();
        }
        return zRemoveAll;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f6966e.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f6966e.size();
            this.f6969w.f7018v += size2 - size;
            e();
        }
        return zRetainAll;
    }

    @Override
    public final int size() {
        zzb();
        return this.f6966e.size();
    }

    @Override
    public final String toString() {
        zzb();
        return this.f6966e.toString();
    }

    final void zzb() {
        C1343j c1343j = this.f6967i;
        if (c1343j != null) {
            c1343j.zzb();
            C1343j c1343j2 = this.f6967i;
            if (c1343j2.f6966e != this.f6968v) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f6966e.isEmpty()) {
            AbstractC1376m abstractC1376m = this.f6969w;
            Collection collection = (Collection) abstractC1376m.f7017i.get(this.f6965d);
            if (collection != null) {
                this.f6966e = collection;
            }
        }
    }
}
