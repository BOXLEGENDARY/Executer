package R3;

import java.util.Set;

public abstract class T extends K implements Set {

    private transient P f5371e;

    T() {
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return C1116m0.a(this);
    }

    public final P k() {
        P p7 = this.f5371e;
        if (p7 != null) {
            return p7;
        }
        P pL = l();
        this.f5371e = pL;
        return pL;
    }

    P l() {
        return P.l(toArray());
    }
}
