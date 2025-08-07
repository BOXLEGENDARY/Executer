package Q3;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

public abstract class P5 implements Map, Serializable {

    private transient Q5 f4166d;

    private transient Q5 f4167e;

    private transient M4 f4168i;

    P5() {
    }

    public static P5 c(Object obj, Object obj2) {
        C0907j3.a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return X5.h(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    abstract M4 a();

    @Override
    public final M4 values() {
        M4 m42 = this.f4168i;
        if (m42 != null) {
            return m42;
        }
        M4 m4A = a();
        this.f4168i = m4A;
        return m4A;
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

    abstract Q5 d();

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

    abstract Q5 f();

    @Override
    public final Q5 entrySet() {
        Q5 q52 = this.f4166d;
        if (q52 != null) {
            return q52;
        }
        Q5 q5D = d();
        this.f4166d = q5D;
        return q5D;
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
        return C0847b.a(entrySet());
    }

    @Override
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public final Set keySet() {
        Q5 q52 = this.f4167e;
        if (q52 != null) {
            return q52;
        }
        Q5 q5F = f();
        this.f4167e = q5F;
        return q5F;
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
