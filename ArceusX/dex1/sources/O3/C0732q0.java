package O3;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

final class C0732q0 extends AbstractCollection {

    final Map f3543d;

    C0732q0(Map map) {
        this.f3543d = map;
    }

    @Override
    public final void clear() {
        this.f3543d.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f3543d.containsValue(obj);
    }

    @Override
    public final boolean isEmpty() {
        return this.f3543d.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new C0699n0(this.f3543d.entrySet().iterator());
    }

    @Override
    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry entry : this.f3543d.entrySet()) {
                if (C0720p.a(obj, entry.getValue())) {
                    this.f3543d.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return super.removeAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : this.f3543d.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f3543d.keySet().removeAll(hashSet);
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : this.f3543d.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f3543d.keySet().retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f3543d.size();
    }
}
