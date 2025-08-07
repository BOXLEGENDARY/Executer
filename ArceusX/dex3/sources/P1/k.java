package P1;

import java.util.Arrays;

public final class k<V> {
    private final V a;
    private final Throwable b;

    public k(V v) {
        this.a = v;
        this.b = null;
    }

    public Throwable a() {
        return this.b;
    }

    public V b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (b() != null && b().equals(kVar.b())) {
            return true;
        }
        if (a() == null || kVar.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public k(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
