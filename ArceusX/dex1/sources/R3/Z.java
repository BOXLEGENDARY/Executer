package R3;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

final class Z extends AbstractCollection {

    final Map f5440d;

    Z(Map map) {
        this.f5440d = map;
    }

    @Override
    public final void clear() {
        this.f5440d.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f5440d.containsValue(obj);
    }

    @Override
    public final boolean isEmpty() {
        return this.f5440d.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new W(this.f5440d.entrySet().iterator());
    }

    @Override
    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry entry : this.f5440d.entrySet()) {
                if (Q6.a(obj, entry.getValue())) {
                    this.f5440d.remove(entry.getKey());
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
            for (Map.Entry entry : this.f5440d.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f5440d.keySet().removeAll(hashSet);
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
            for (Map.Entry entry : this.f5440d.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f5440d.keySet().retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f5440d.size();
    }
}
