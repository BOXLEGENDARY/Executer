package Q3;

import java.util.Set;

public abstract class Q5 extends M4 implements Set {

    private transient N5 f4176e;

    Q5() {
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
        return C0847b.a(this);
    }

    public final N5 k() {
        N5 n52 = this.f4176e;
        if (n52 != null) {
            return n52;
        }
        N5 n5L = l();
        this.f4176e = n5L;
        return n5L;
    }

    N5 l() {
        return N5.l(toArray());
    }
}
