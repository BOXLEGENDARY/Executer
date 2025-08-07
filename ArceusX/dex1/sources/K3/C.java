package K3;

import java.io.Serializable;
import java.util.Map;

public abstract class C implements Map, Serializable {

    static final Map.Entry[] f1769e = new Map.Entry[0];

    private transient E f1770d;

    C() {
    }

    public abstract AbstractC0496w a();

    abstract E b();

    public final E c() {
        E e7 = this.f1770d;
        if (e7 != null) {
            return e7;
        }
        E eB = b();
        this.f1770d = eB;
        return eB;
    }

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override
    public final boolean containsValue(Object obj) {
        return a().contains(obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override
    public abstract Object get(Object obj);

    @Override
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override
    public final int hashCode() {
        return Y.a(c());
    }

    @Override
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z7 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z7) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z7 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
