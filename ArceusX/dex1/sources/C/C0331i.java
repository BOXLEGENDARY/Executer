package C;

import android.util.Size;
import android.view.Surface;

final class C0331i extends K0 {

    private final Surface f605a;

    private final Size f606b;

    private final int f607c;

    C0331i(Surface surface, Size size, int i7) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f605a = surface;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f606b = size;
        this.f607c = i7;
    }

    @Override
    public int b() {
        return this.f607c;
    }

    @Override
    public Size c() {
        return this.f606b;
    }

    @Override
    public Surface d() {
        return this.f605a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        K0 k02 = (K0) obj;
        return this.f605a.equals(k02.d()) && this.f606b.equals(k02.c()) && this.f607c == k02.b();
    }

    public int hashCode() {
        return ((((this.f605a.hashCode() ^ 1000003) * 1000003) ^ this.f606b.hashCode()) * 1000003) ^ this.f607c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f605a + ", size=" + this.f606b + ", imageFormat=" + this.f607c + "}";
    }
}
