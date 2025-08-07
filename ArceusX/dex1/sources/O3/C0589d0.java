package O3;

import java.io.Serializable;

final class C0589d0 extends H implements Serializable {

    final Object f3415d;

    final Object f3416e;

    C0589d0(Object obj, Object obj2) {
        this.f3415d = obj;
        this.f3416e = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f3415d;
    }

    @Override
    public final Object getValue() {
        return this.f3416e;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
