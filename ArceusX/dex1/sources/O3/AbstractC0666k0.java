package O3;

import java.util.Set;

public abstract class AbstractC0666k0 extends AbstractC0578c0 implements Set {

    private transient AbstractC0633h0 f3486e;

    AbstractC0666k0() {
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return D0.b(this, obj);
    }

    @Override
    public final int hashCode() {
        return D0.a(this);
    }

    public final AbstractC0633h0 l() {
        AbstractC0633h0 abstractC0633h0 = this.f3486e;
        if (abstractC0633h0 != null) {
            return abstractC0633h0;
        }
        AbstractC0633h0 abstractC0633h0M = m();
        this.f3486e = abstractC0633h0M;
        return abstractC0633h0M;
    }

    AbstractC0633h0 m() {
        Object[] array = toArray();
        int i7 = AbstractC0633h0.f3469i;
        return AbstractC0633h0.m(array, array.length);
    }
}
