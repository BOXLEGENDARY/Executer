package R3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

abstract class X extends AbstractC1108l0 {
    X() {
    }

    @Override
    public final void clear() {
        d().clear();
    }

    @Override
    public abstract boolean contains(Object obj);

    abstract Map d();

    @Override
    public final boolean isEmpty() {
        return d().isEmpty();
    }

    @Override
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return C1116m0.b(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            return C1116m0.c(this, collection.iterator());
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        int iCeil;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                C1184v.a(size, "expectedSize");
                iCeil = size + 1;
            } else {
                iCeil = size < 1073741824 ? (int) Math.ceil(size / 0.75d) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(iCeil);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return ((C1083i) d()).f5576v.o().retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return d().size();
    }
}
