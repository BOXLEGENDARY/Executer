package B;

import B.O;
import M.C0524u;

final class C0269e extends O.a {

    private final C0524u<O.b> f221a;

    private final C0524u<O.b> f222b;

    private final int f223c;

    private final int f224d;

    C0269e(C0524u<O.b> c0524u, C0524u<O.b> c0524u2, int i7, int i8) {
        if (c0524u == null) {
            throw new NullPointerException("Null edge");
        }
        this.f221a = c0524u;
        if (c0524u2 == null) {
            throw new NullPointerException("Null postviewEdge");
        }
        this.f222b = c0524u2;
        this.f223c = i7;
        this.f224d = i8;
    }

    @Override
    C0524u<O.b> a() {
        return this.f221a;
    }

    @Override
    int b() {
        return this.f223c;
    }

    @Override
    int c() {
        return this.f224d;
    }

    @Override
    C0524u<O.b> d() {
        return this.f222b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O.a)) {
            return false;
        }
        O.a aVar = (O.a) obj;
        return this.f221a.equals(aVar.a()) && this.f222b.equals(aVar.d()) && this.f223c == aVar.b() && this.f224d == aVar.c();
    }

    public int hashCode() {
        return ((((((this.f221a.hashCode() ^ 1000003) * 1000003) ^ this.f222b.hashCode()) * 1000003) ^ this.f223c) * 1000003) ^ this.f224d;
    }

    public String toString() {
        return "In{edge=" + this.f221a + ", postviewEdge=" + this.f222b + ", inputFormat=" + this.f223c + ", outputFormat=" + this.f224d + "}";
    }
}
