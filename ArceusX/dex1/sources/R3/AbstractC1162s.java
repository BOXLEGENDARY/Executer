package R3;

import java.util.Map;
import java.util.Set;

abstract class AbstractC1162s implements InterfaceC1044d0 {

    private transient Set f5828d;

    private transient Map f5829e;

    AbstractC1162s() {
    }

    abstract Map c();

    abstract Set d();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC1044d0) {
            return n().equals(((InterfaceC1044d0) obj).n());
        }
        return false;
    }

    public final int hashCode() {
        return n().hashCode();
    }

    @Override
    public final Map n() {
        Map map = this.f5829e;
        if (map != null) {
            return map;
        }
        Map mapC = c();
        this.f5829e = mapC;
        return mapC;
    }

    @Override
    public final Set o() {
        Set set = this.f5828d;
        if (set != null) {
            return set;
        }
        Set setD = d();
        this.f5828d = setD;
        return setD;
    }

    public final String toString() {
        return ((C1083i) n()).f5575i.toString();
    }
}
