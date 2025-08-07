package N3;

import java.util.Set;

public abstract class AbstractC0539j extends AbstractC0532c implements Set {

    private transient AbstractC0535f f2618e;

    AbstractC0539j() {
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
        return r.a(this);
    }

    public final AbstractC0535f k() {
        AbstractC0535f abstractC0535f = this.f2618e;
        if (abstractC0535f != null) {
            return abstractC0535f;
        }
        AbstractC0535f abstractC0535fL = l();
        this.f2618e = abstractC0535fL;
        return abstractC0535fL;
    }

    AbstractC0535f l() {
        Object[] array = toArray();
        int i7 = AbstractC0535f.f2608i;
        return AbstractC0535f.l(array, array.length);
    }
}
