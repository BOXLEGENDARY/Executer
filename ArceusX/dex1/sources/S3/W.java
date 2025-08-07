package S3;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

final class W extends AbstractSequentialList implements Serializable {

    final List f6852d;

    final InterfaceC1408o9 f6853e;

    W(List list, InterfaceC1408o9 interfaceC1408o9) {
        list.getClass();
        this.f6852d = list;
        this.f6853e = interfaceC1408o9;
    }

    @Override
    public final boolean isEmpty() {
        return this.f6852d.isEmpty();
    }

    @Override
    public final ListIterator listIterator(int i7) {
        return new V(this, this.f6852d.listIterator(i7));
    }

    @Override
    protected final void removeRange(int i7, int i8) {
        this.f6852d.subList(i7, i8).clear();
    }

    @Override
    public final int size() {
        return this.f6852d.size();
    }
}
