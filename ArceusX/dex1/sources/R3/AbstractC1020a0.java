package R3;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

abstract class AbstractC1020a0 extends AbstractMap {

    private transient Set f5452d;

    private transient Collection f5453e;

    AbstractC1020a0() {
    }

    abstract Set a();

    @Override
    public final Set entrySet() {
        Set set = this.f5452d;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f5452d = setA;
        return setA;
    }

    @Override
    public final Collection values() {
        Collection collection = this.f5453e;
        if (collection != null) {
            return collection;
        }
        Z z7 = new Z(this);
        this.f5453e = z7;
        return z7;
    }
}
