package S3;

import java.io.Serializable;

final class I extends AbstractC1387n implements Serializable {

    final Object f6772d;

    final Object f6773e;

    I(Object obj, Object obj2) {
        this.f6772d = obj;
        this.f6773e = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f6772d;
    }

    @Override
    public final Object getValue() {
        return this.f6773e;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
