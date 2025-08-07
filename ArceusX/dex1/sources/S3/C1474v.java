package S3;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class C1474v extends AbstractSet {

    final C f7157d;

    C1474v(C c2) {
        this.f7157d = c2;
    }

    @Override
    public final void clear() {
        this.f7157d.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Map mapP = this.f7157d.p();
        if (mapP != null) {
            return mapP.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iA = this.f7157d.A(entry.getKey());
            if (iA != -1 && T9.a(C.n(this.f7157d, iA), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        C c2 = this.f7157d;
        Map mapP = c2.p();
        return mapP != null ? mapP.entrySet().iterator() : new C1452t(c2);
    }

    @Override
    public final boolean remove(Object obj) {
        Map mapP = this.f7157d.p();
        if (mapP != null) {
            return mapP.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C c2 = this.f7157d;
        if (c2.v()) {
            return false;
        }
        int iZ = c2.z();
        Object key = entry.getKey();
        Object value = entry.getValue();
        C c3 = this.f7157d;
        int iB = D.b(key, value, iZ, C.m(c3), c3.a(), c3.b(), c3.c());
        if (iB == -1) {
            return false;
        }
        this.f7157d.u(iB, iZ);
        C c7 = this.f7157d;
        c7.f6411y--;
        this.f7157d.s();
        return true;
    }

    @Override
    public final int size() {
        return this.f7157d.size();
    }
}
