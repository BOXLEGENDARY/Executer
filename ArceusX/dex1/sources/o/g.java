package O;

import android.opengl.EGLSurface;

public abstract class g {
    public static g d(EGLSurface eGLSurface, int i7, int i8) {
        return new c(eGLSurface, i7, i8);
    }

    public abstract EGLSurface a();

    public abstract int b();

    public abstract int c();
}
