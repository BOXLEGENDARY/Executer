package R3;

import java.util.Map;

final class D extends r {

    private final Object f5151d;

    private int f5152e;

    final F f5153i;

    D(F f7, int i7) {
        this.f5153i = f7;
        this.f5151d = F.j(f7, i7);
        this.f5152e = i7;
    }

    private final void a() {
        int i7 = this.f5152e;
        if (i7 == -1 || i7 >= this.f5153i.size() || !Q6.a(this.f5151d, F.j(this.f5153i, this.f5152e))) {
            this.f5152e = this.f5153i.y(this.f5151d);
        }
    }

    @Override
    public final Object getKey() {
        return this.f5151d;
    }

    @Override
    public final Object getValue() {
        Map mapO = this.f5153i.o();
        if (mapO != null) {
            return mapO.get(this.f5151d);
        }
        a();
        int i7 = this.f5152e;
        if (i7 == -1) {
            return null;
        }
        return F.m(this.f5153i, i7);
    }

    @Override
    public final Object setValue(Object obj) {
        Map mapO = this.f5153i.o();
        if (mapO != null) {
            return mapO.put(this.f5151d, obj);
        }
        a();
        int i7 = this.f5152e;
        if (i7 == -1) {
            this.f5153i.put(this.f5151d, obj);
            return null;
        }
        Object objM = F.m(this.f5153i, i7);
        F.p(this.f5153i, this.f5152e, obj);
        return objM;
    }
}
