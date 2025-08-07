package R3;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class C1212z extends AbstractSet {

    final F f6035d;

    C1212z(F f7) {
        this.f6035d = f7;
    }

    @Override
    public final void clear() {
        this.f6035d.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Map mapO = this.f6035d.o();
        if (mapO != null) {
            return mapO.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iY = this.f6035d.y(entry.getKey());
            if (iY != -1 && Q6.a(F.m(this.f6035d, iY), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        F f7 = this.f6035d;
        Map mapO = f7.o();
        return mapO != null ? mapO.entrySet().iterator() : new C1198x(f7);
    }

    @Override
    public final boolean remove(Object obj) {
        Map mapO = this.f6035d.o();
        if (mapO != null) {
            return mapO.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        F f7 = this.f6035d;
        if (f7.t()) {
            return false;
        }
        int iX = f7.x();
        int iB = G.b(entry.getKey(), entry.getValue(), iX, F.n(this.f6035d), this.f6035d.C(), this.f6035d.a(), this.f6035d.b());
        if (iB == -1) {
            return false;
        }
        this.f6035d.s(iB, iX);
        F.d(this.f6035d);
        this.f6035d.q();
        return true;
    }

    @Override
    public final int size() {
        return this.f6035d.size();
    }
}
