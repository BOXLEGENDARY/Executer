package O3;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

public abstract class AbstractC0655j0 implements Map, Serializable {

    private transient AbstractC0666k0 f3479d;

    private transient AbstractC0666k0 f3480e;

    private transient AbstractC0578c0 f3481i;

    AbstractC0655j0() {
    }

    public static AbstractC0655j0 c(Object obj, Object obj2) {
        L.b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return B0.h(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    abstract AbstractC0578c0 a();

    @Override
    public final AbstractC0578c0 values() {
        AbstractC0578c0 abstractC0578c0 = this.f3481i;
        if (abstractC0578c0 != null) {
            return abstractC0578c0;
        }
        AbstractC0578c0 abstractC0578c0A = a();
        this.f3481i = abstractC0578c0A;
        return abstractC0578c0A;
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

    abstract AbstractC0666k0 d();

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

    abstract AbstractC0666k0 f();

    @Override
    public final AbstractC0666k0 entrySet() {
        AbstractC0666k0 abstractC0666k0 = this.f3479d;
        if (abstractC0666k0 != null) {
            return abstractC0666k0;
        }
        AbstractC0666k0 abstractC0666k0D = d();
        this.f3479d = abstractC0666k0D;
        return abstractC0666k0D;
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
        return D0.a(entrySet());
    }

    @Override
    public final boolean isEmpty() {
        return false;
    }

    @Override
    public final Set keySet() {
        AbstractC0666k0 abstractC0666k0 = this.f3480e;
        if (abstractC0666k0 != null) {
            return abstractC0666k0;
        }
        AbstractC0666k0 abstractC0666k0F = f();
        this.f3480e = abstractC0666k0F;
        return abstractC0666k0F;
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
        L.a(size, "size");
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
