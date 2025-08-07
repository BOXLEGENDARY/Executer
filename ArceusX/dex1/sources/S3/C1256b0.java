package S3;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

final class C1256b0 extends AbstractCollection {

    final Map f6891d;

    C1256b0(Map map) {
        this.f6891d = map;
    }

    @Override
    public final void clear() {
        this.f6891d.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f6891d.containsValue(obj);
    }

    @Override
    public final boolean isEmpty() {
        return this.f6891d.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new Y(this.f6891d.entrySet().iterator());
    }

    @Override
    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry entry : this.f6891d.entrySet()) {
                if (T9.a(obj, entry.getValue())) {
                    this.f6891d.remove(entry.getKey());
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
            for (Map.Entry entry : this.f6891d.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f6891d.keySet().removeAll(hashSet);
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
            for (Map.Entry entry : this.f6891d.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f6891d.keySet().retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f6891d.size();
    }
}
