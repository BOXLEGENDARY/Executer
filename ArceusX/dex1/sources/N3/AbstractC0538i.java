package N3;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

public abstract class AbstractC0538i implements Map, Serializable {

    private transient AbstractC0539j f2615d;

    private transient AbstractC0539j f2616e;

    private transient AbstractC0532c f2617i;

    AbstractC0538i() {
    }

    public static AbstractC0538i c(Object obj, Object obj2) {
        b0.a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C0546q.h(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    abstract AbstractC0532c a();

    @Override
    public final AbstractC0532c values() {
        AbstractC0532c abstractC0532c = this.f2617i;
        if (abstractC0532c != null) {
            return abstractC0532c;
        }
        AbstractC0532c abstractC0532cA = a();
        this.f2617i = abstractC0532cA;
        return abstractC0532cA;
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
        return values().contains(obj);
    }

    abstract AbstractC0539j d();

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

    abstract AbstractC0539j f();

    @Override
    public final AbstractC0539j entrySet() {
        AbstractC0539j abstractC0539j = this.f2615d;
        if (abstractC0539j != null) {
            return abstractC0539j;
        }
        AbstractC0539j abstractC0539jD = d();
        this.f2615d = abstractC0539jD;
        return abstractC0539jD;
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
        return r.a(entrySet());
    }

    @Override
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public final Set keySet() {
        AbstractC0539j abstractC0539j = this.f2616e;
        if (abstractC0539j != null) {
            return abstractC0539j;
        }
        AbstractC0539j abstractC0539jF = f();
        this.f2616e = abstractC0539jF;
        return abstractC0539jF;
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
