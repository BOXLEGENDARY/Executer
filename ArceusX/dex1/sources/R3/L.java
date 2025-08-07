package R3;

import java.io.Serializable;

final class L extends r implements Serializable {

    final Object f5268d;

    final Object f5269e;

    L(Object obj, Object obj2) {
        this.f5268d = obj;
        this.f5269e = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f5268d;
    }

    @Override
    public final Object getValue() {
        return this.f5269e;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
