package R3;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

public abstract class S implements Map, Serializable {

    private transient T f5354d;

    private transient T f5355e;

    private transient K f5356i;

    S() {
    }

    public static S c(Object obj, Object obj2) {
        C1184v.b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C1100k0.h(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    abstract K a();

    @Override
    public final K values() {
        K k7 = this.f5356i;
        if (k7 != null) {
            return k7;
        }
        K kA = a();
        this.f5356i = kA;
        return kA;
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

    abstract T d();

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

    abstract T f();

    @Override
    public final T entrySet() {
        T t7 = this.f5354d;
        if (t7 != null) {
            return t7;
        }
        T tD = d();
        this.f5354d = tD;
        return tD;
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
        return C1116m0.a(entrySet());
    }

    @Override
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public final Set keySet() {
        T t7 = this.f5355e;
        if (t7 != null) {
            return t7;
        }
        T tF = f();
        this.f5355e = tF;
        return tF;
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
        C1184v.a(size, "size");
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
