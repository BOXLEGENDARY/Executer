package O3;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

abstract class AbstractC0742r0 extends AbstractMap {

    private transient Set f3553d;

    private transient Collection f3554e;

    AbstractC0742r0() {
    }

    abstract Set a();

    @Override
    public final Set entrySet() {
        Set set = this.f3553d;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f3553d = setA;
        return setA;
    }

    @Override
    public final Collection values() {
        Collection collection = this.f3554e;
        if (collection != null) {
            return collection;
        }
        C0732q0 c0732q0 = new C0732q0(this);
        this.f3554e = c0732q0;
        return c0732q0;
    }
}
