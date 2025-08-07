package S3;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

final class A extends AbstractCollection {

    final C f6395d;

    A(C c2) {
        this.f6395d = c2;
    }

    @Override
    public final void clear() {
        this.f6395d.clear();
    }

    @Override
    public final Iterator iterator() {
        C c2 = this.f6395d;
        Map mapP = c2.p();
        return mapP != null ? mapP.values().iterator() : new C1463u(c2);
    }

    @Override
    public final int size() {
        return this.f6395d.size();
    }
}
