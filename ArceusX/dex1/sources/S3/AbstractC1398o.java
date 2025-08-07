package S3;

import java.util.Map;
import java.util.Set;

abstract class AbstractC1398o implements InterfaceC1300f0 {

    private transient Set f7043d;

    private transient Map f7044e;

    AbstractC1398o() {
    }

    abstract Map c();

    abstract Set d();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC1300f0) {
            return k().equals(((InterfaceC1300f0) obj).k());
        }
        return false;
    }

    public final int hashCode() {
        return k().hashCode();
    }

    @Override
    public final Map k() {
        Map map = this.f7044e;
        if (map != null) {
            return map;
        }
        Map mapC = c();
        this.f7044e = mapC;
        return mapC;
    }

    @Override
    public final Set l() {
        Set set = this.f7043d;
        if (set != null) {
            return set;
        }
        Set setD = d();
        this.f7043d = setD;
        return setD;
    }

    public final String toString() {
        return k().toString();
    }
}
