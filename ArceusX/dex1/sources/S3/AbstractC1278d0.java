package S3;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

abstract class AbstractC1278d0 extends AbstractMap {

    private transient Set f6908d;

    private transient Collection f6909e;

    AbstractC1278d0() {
    }

    abstract Set a();

    @Override
    public final Set entrySet() {
        Set set = this.f6908d;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f6908d = setA;
        return setA;
    }

    @Override
    public final Collection values() {
        Collection collection = this.f6909e;
        if (collection != null) {
            return collection;
        }
        C1256b0 c1256b0 = new C1256b0(this);
        this.f6909e = c1256b0;
        return c1256b0;
    }
}
