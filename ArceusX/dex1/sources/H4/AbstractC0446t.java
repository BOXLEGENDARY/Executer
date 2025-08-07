package H4;

import java.util.Iterator;
import java.util.Set;

public abstract class AbstractC0446t extends AbstractC0443p implements Set {

    private transient AbstractC0445s f1622e;

    AbstractC0446t() {
    }

    public static AbstractC0446t n() {
        return C0448v.f1626y;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0446t) {
            ((AbstractC0446t) obj).o();
            if (obj.hashCode() != 0) {
                return false;
            }
        }
        if (obj == this) {
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
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override
    public abstract AbstractC0449w iterator();

    public final AbstractC0445s l() {
        AbstractC0445s abstractC0445s = this.f1622e;
        if (abstractC0445s != null) {
            return abstractC0445s;
        }
        AbstractC0445s abstractC0445sM = m();
        this.f1622e = abstractC0445sM;
        return abstractC0445sM;
    }

    AbstractC0445s m() {
        throw null;
    }

    boolean o() {
        throw null;
    }
}
