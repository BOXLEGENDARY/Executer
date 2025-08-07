package S3;

import java.util.Set;

public abstract class P extends H implements Set {

    private transient M f6818e;

    P() {
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
        return C1399o0.a(this);
    }

    public final M k() {
        M m7 = this.f6818e;
        if (m7 != null) {
            return m7;
        }
        M mL = l();
        this.f6818e = mL;
        return mL;
    }

    M l() {
        Object[] array = toArray();
        int i7 = M.f6801i;
        return M.l(array, array.length);
    }
}
