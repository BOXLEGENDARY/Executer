package O3;

import java.util.Map;
import java.util.Set;

abstract class I implements InterfaceC0764t0 {

    private transient Set f2888d;

    private transient Map f2889e;

    I() {
    }

    @Override
    public final Set C() {
        Set set = this.f2888d;
        if (set != null) {
            return set;
        }
        Set setC = c();
        this.f2888d = setC;
        return setC;
    }

    abstract Map b();

    abstract Set c();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC0764t0) {
            return q().equals(((InterfaceC0764t0) obj).q());
        }
        return false;
    }

    public final int hashCode() {
        return q().hashCode();
    }

    @Override
    public final Map q() {
        Map map = this.f2889e;
        if (map != null) {
            return map;
        }
        Map mapB = b();
        this.f2889e = mapB;
        return mapB;
    }

    public final String toString() {
        return q().toString();
    }
}
