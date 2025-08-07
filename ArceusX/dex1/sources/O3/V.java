package O3;

import java.util.Map;

final class V extends H {

    private final Object f3304d;

    private int f3305e;

    final X f3306i;

    V(X x7, int i7) {
        this.f3306i = x7;
        this.f3304d = X.k(x7, i7);
        this.f3305e = i7;
    }

    private final void a() {
        int i7 = this.f3305e;
        if (i7 == -1 || i7 >= this.f3306i.size() || !C0720p.a(this.f3304d, X.k(this.f3306i, this.f3305e))) {
            this.f3305e = this.f3306i.A(this.f3304d);
        }
    }

    @Override
    public final Object getKey() {
        return this.f3304d;
    }

    @Override
    public final Object getValue() {
        Map mapP = this.f3306i.p();
        if (mapP != null) {
            return mapP.get(this.f3304d);
        }
        a();
        int i7 = this.f3305e;
        if (i7 == -1) {
            return null;
        }
        return X.n(this.f3306i, i7);
    }

    @Override
    public final Object setValue(Object obj) {
        Map mapP = this.f3306i.p();
        if (mapP != null) {
            return mapP.put(this.f3304d, obj);
        }
        a();
        int i7 = this.f3305e;
        if (i7 == -1) {
            this.f3306i.put(this.f3304d, obj);
            return null;
        }
        X x7 = this.f3306i;
        Object objN = X.n(x7, i7);
        X.r(x7, this.f3305e, obj);
        return objN;
    }
}
