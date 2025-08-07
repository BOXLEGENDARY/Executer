package B;

import B.C0273i;
import android.graphics.Bitmap;

final class C0265a extends C0273i.b {

    private final M.B<Bitmap> f198a;

    private final int f199b;

    C0265a(M.B<Bitmap> b2, int i7) {
        if (b2 == null) {
            throw new NullPointerException("Null packet");
        }
        this.f198a = b2;
        this.f199b = i7;
    }

    @Override
    int a() {
        return this.f199b;
    }

    @Override
    M.B<Bitmap> b() {
        return this.f198a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0273i.b)) {
            return false;
        }
        C0273i.b bVar = (C0273i.b) obj;
        return this.f198a.equals(bVar.b()) && this.f199b == bVar.a();
    }

    public int hashCode() {
        return ((this.f198a.hashCode() ^ 1000003) * 1000003) ^ this.f199b;
    }

    public String toString() {
        return "In{packet=" + this.f198a + ", jpegQuality=" + this.f199b + "}";
    }
}
