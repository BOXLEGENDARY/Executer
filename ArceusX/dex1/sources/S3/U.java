package S3;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

final class U extends AbstractList implements RandomAccess, Serializable {

    final List f6840d;

    final InterfaceC1408o9 f6841e;

    U(List list, InterfaceC1408o9 interfaceC1408o9) {
        list.getClass();
        this.f6840d = list;
        this.f6841e = interfaceC1408o9;
    }

    @Override
    public final Object get(int i7) {
        return this.f6841e.a(this.f6840d.get(i7));
    }

    @Override
    public final boolean isEmpty() {
        return this.f6840d.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return listIterator();
    }

    @Override
    public final ListIterator listIterator(int i7) {
        return new T(this, this.f6840d.listIterator(i7));
    }

    @Override
    public final Object remove(int i7) {
        return this.f6841e.a(this.f6840d.remove(i7));
    }

    @Override
    protected final void removeRange(int i7, int i8) {
        this.f6840d.subList(i7, i8).clear();
    }

    @Override
    public final int size() {
        return this.f6840d.size();
    }
}
