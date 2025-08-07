package m3;

import l3.C2526a;
import l3.C2526a.d;
import n3.C2649g;

public final class C2571b<O extends C2526a.d> {

    private final int f22020a;

    private final C2526a f22021b;

    private final C2526a.d f22022c;

    private final String f22023d;

    private C2571b(C2526a c2526a, C2526a.d dVar, String str) {
        this.f22021b = c2526a;
        this.f22022c = dVar;
        this.f22023d = str;
        this.f22020a = C2649g.c(c2526a, dVar, str);
    }

    public static <O extends C2526a.d> C2571b<O> a(C2526a<O> c2526a, O o2, String str) {
        return new C2571b<>(c2526a, o2, str);
    }

    public final String b() {
        return this.f22021b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2571b)) {
            return false;
        }
        C2571b c2571b = (C2571b) obj;
        return C2649g.b(this.f22021b, c2571b.f22021b) && C2649g.b(this.f22022c, c2571b.f22022c) && C2649g.b(this.f22023d, c2571b.f22023d);
    }

    public final int hashCode() {
        return this.f22020a;
    }
}
