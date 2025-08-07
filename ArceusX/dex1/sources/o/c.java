package O;

import K0.wJ.BtcVLuo;
import android.opengl.EGLSurface;

final class c extends g {

    private final EGLSurface f2674a;

    private final int f2675b;

    private final int f2676c;

    c(EGLSurface eGLSurface, int i7, int i8) {
        if (eGLSurface == null) {
            throw new NullPointerException(BtcVLuo.VGSSgatDOARdQdP);
        }
        this.f2674a = eGLSurface;
        this.f2675b = i7;
        this.f2676c = i8;
    }

    @Override
    public EGLSurface a() {
        return this.f2674a;
    }

    @Override
    public int b() {
        return this.f2676c;
    }

    @Override
    public int c() {
        return this.f2675b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f2674a.equals(gVar.a()) && this.f2675b == gVar.c() && this.f2676c == gVar.b();
    }

    public int hashCode() {
        return ((((this.f2674a.hashCode() ^ 1000003) * 1000003) ^ this.f2675b) * 1000003) ^ this.f2676c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f2674a + ", width=" + this.f2675b + ", height=" + this.f2676c + "}";
    }
}
