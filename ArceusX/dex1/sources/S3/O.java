package S3;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

public abstract class O implements Map, Serializable {

    private transient P f6811d;

    private transient P f6812e;

    private transient H f6813i;

    O() {
    }

    public static O c(Object obj, Object obj2) {
        r.b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C1377m0.h(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    abstract H a();

    @Override
    public final H values() {
        H h7 = this.f6813i;
        if (h7 != null) {
            return h7;
        }
        H hA = a();
        this.f6813i = hA;
        return hA;
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

    abstract P d();

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

    abstract P f();

    @Override
    public final P entrySet() {
        P p7 = this.f6811d;
        if (p7 != null) {
            return p7;
        }
        P pD = d();
        this.f6811d = pD;
        return pD;
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
        return C1399o0.a(entrySet());
    }

    @Override
    public final boolean isEmpty() {
        return false;
    }

    @Override
    public final Set keySet() {
        P p7 = this.f6812e;
        if (p7 != null) {
            return p7;
        }
        P pF = f();
        this.f6812e = pF;
        return pF;
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
        r.a(size, "size");
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
