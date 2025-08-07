package S3;

import java.util.Map;

final class C1516z extends AbstractC1387n {

    private final Object f7305d;

    private int f7306e;

    final C f7307i;

    C1516z(C c2, int i7) {
        this.f7307i = c2;
        this.f7305d = C.k(c2, i7);
        this.f7306e = i7;
    }

    private final void a() {
        int i7 = this.f7306e;
        if (i7 == -1 || i7 >= this.f7307i.size() || !T9.a(this.f7305d, C.k(this.f7307i, this.f7306e))) {
            this.f7306e = this.f7307i.A(this.f7305d);
        }
    }

    @Override
    public final Object getKey() {
        return this.f7305d;
    }

    @Override
    public final Object getValue() {
        Map mapP = this.f7307i.p();
        if (mapP != null) {
            return mapP.get(this.f7305d);
        }
        a();
        int i7 = this.f7306e;
        if (i7 == -1) {
            return null;
        }
        return C.n(this.f7307i, i7);
    }

    @Override
    public final Object setValue(Object obj) {
        Map mapP = this.f7307i.p();
        if (mapP != null) {
            return mapP.put(this.f7305d, obj);
        }
        a();
        int i7 = this.f7306e;
        if (i7 == -1) {
            this.f7307i.put(this.f7305d, obj);
            return null;
        }
        C c2 = this.f7307i;
        Object objN = C.n(c2, i7);
        C.r(c2, this.f7306e, obj);
        return objN;
    }
}
