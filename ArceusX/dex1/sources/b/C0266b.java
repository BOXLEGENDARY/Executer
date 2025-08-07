package B;

import B.C0284u;
import B.Z;
import M.C0524u;
import android.util.Size;

final class C0266b extends C0284u.c {

    private final Size f202d;

    private final int f203e;

    private final int f204f;

    private final boolean f205g;

    private final z.Z f206h;

    private final Size f207i;

    private final int f208j;

    private final C0524u<P> f209k;

    private final C0524u<Z.b> f210l;

    C0266b(Size size, int i7, int i8, boolean z7, z.Z z8, Size size2, int i9, C0524u<P> c0524u, C0524u<Z.b> c0524u2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f202d = size;
        this.f203e = i7;
        this.f204f = i8;
        this.f205g = z7;
        this.f206h = z8;
        this.f207i = size2;
        this.f208j = i9;
        if (c0524u == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.f209k = c0524u;
        if (c0524u2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.f210l = c0524u2;
    }

    @Override
    C0524u<Z.b> b() {
        return this.f210l;
    }

    @Override
    z.Z c() {
        return this.f206h;
    }

    @Override
    int d() {
        return this.f203e;
    }

    @Override
    int e() {
        return this.f204f;
    }

    public boolean equals(Object obj) {
        z.Z z7;
        Size size;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0284u.c)) {
            return false;
        }
        C0284u.c cVar = (C0284u.c) obj;
        return this.f202d.equals(cVar.j()) && this.f203e == cVar.d() && this.f204f == cVar.e() && this.f205g == cVar.l() && ((z7 = this.f206h) != null ? z7.equals(cVar.c()) : cVar.c() == null) && ((size = this.f207i) != null ? size.equals(cVar.g()) : cVar.g() == null) && this.f208j == cVar.f() && this.f209k.equals(cVar.i()) && this.f210l.equals(cVar.b());
    }

    @Override
    int f() {
        return this.f208j;
    }

    @Override
    Size g() {
        return this.f207i;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f202d.hashCode() ^ 1000003) * 1000003) ^ this.f203e) * 1000003) ^ this.f204f) * 1000003) ^ (this.f205g ? 1231 : 1237)) * 1000003;
        z.Z z7 = this.f206h;
        int iHashCode2 = (iHashCode ^ (z7 == null ? 0 : z7.hashCode())) * 1000003;
        Size size = this.f207i;
        return ((((((iHashCode2 ^ (size != null ? size.hashCode() : 0)) * 1000003) ^ this.f208j) * 1000003) ^ this.f209k.hashCode()) * 1000003) ^ this.f210l.hashCode();
    }

    @Override
    C0524u<P> i() {
        return this.f209k;
    }

    @Override
    Size j() {
        return this.f202d;
    }

    @Override
    boolean l() {
        return this.f205g;
    }

    public String toString() {
        return "In{size=" + this.f202d + ", inputFormat=" + this.f203e + ", outputFormat=" + this.f204f + ", virtualCamera=" + this.f205g + ", imageReaderProxyProvider=" + this.f206h + ", postviewSize=" + this.f207i + ", postviewImageFormat=" + this.f208j + ", requestEdge=" + this.f209k + ", errorEdge=" + this.f210l + "}";
    }
}
