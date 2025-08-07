package B;

import B.C0286w;

final class C0267c extends C0286w.a {

    private final M.B<androidx.camera.core.n> f213a;

    private final int f214b;

    C0267c(M.B<androidx.camera.core.n> b2, int i7) {
        if (b2 == null) {
            throw new NullPointerException("Null packet");
        }
        this.f213a = b2;
        this.f214b = i7;
    }

    @Override
    int a() {
        return this.f214b;
    }

    @Override
    M.B<androidx.camera.core.n> b() {
        return this.f213a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0286w.a)) {
            return false;
        }
        C0286w.a aVar = (C0286w.a) obj;
        return this.f213a.equals(aVar.b()) && this.f214b == aVar.a();
    }

    public int hashCode() {
        return ((this.f213a.hashCode() ^ 1000003) * 1000003) ^ this.f214b;
    }

    public String toString() {
        return "In{packet=" + this.f213a + ", jpegQuality=" + this.f214b + "}";
    }
}
