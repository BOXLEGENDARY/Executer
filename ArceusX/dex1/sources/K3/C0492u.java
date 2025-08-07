package K3;

import java.io.Serializable;
import java.util.Comparator;

final class C0492u extends S implements Serializable {

    final Comparator f1898d;

    C0492u(Comparator comparator) {
        comparator.getClass();
        this.f1898d = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f1898d.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0492u) {
            return this.f1898d.equals(((C0492u) obj).f1898d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1898d.hashCode();
    }

    public final String toString() {
        return this.f1898d.toString();
    }
}
