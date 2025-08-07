package K3;

import java.io.Serializable;

final class X extends S implements Serializable {

    final S f1826d;

    X(S s7) {
        this.f1826d = s7;
    }

    @Override
    public final S a() {
        return this.f1826d;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f1826d.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X) {
            return this.f1826d.equals(((X) obj).f1826d);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f1826d.hashCode();
    }

    public final String toString() {
        return this.f1826d.toString().concat(".reverse()");
    }
}
