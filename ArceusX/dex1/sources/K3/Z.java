package K3;

import java.util.Iterator;

final class Z extends E {

    final transient Object f1858i;

    Z(Object obj) {
        obj.getClass();
        this.f1858i = obj;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f1858i.equals(obj);
    }

    @Override
    final int d(Object[] objArr, int i7) {
        objArr[0] = this.f1858i;
        return 1;
    }

    @Override
    public final int hashCode() {
        return this.f1858i.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return new M(this.f1858i);
    }

    @Override
    public final AbstractC0460d0 iterator() {
        return new M(this.f1858i);
    }

    @Override
    public final A o() {
        return A.p(this.f1858i);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        return "[" + this.f1858i.toString() + "]";
    }
}
