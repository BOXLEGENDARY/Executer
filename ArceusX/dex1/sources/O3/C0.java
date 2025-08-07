package O3;

import java.util.AbstractSet;
import java.util.Collection;

abstract class C0 extends AbstractSet {
    C0() {
    }

    @Override
    public boolean removeAll(Collection collection) {
        return D0.c(this, collection);
    }

    @Override
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
