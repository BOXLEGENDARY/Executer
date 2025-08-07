package z0;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

public final class C3071a {

    static class C0241a {
        static Interpolator a(float f7, float f8, float f9, float f10) {
            return new PathInterpolator(f7, f8, f9, f10);
        }

        static Interpolator b(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f7, float f8, float f9, float f10) {
        return C0241a.a(f7, f8, f9, f10);
    }

    public static Interpolator b(Path path) {
        return C0241a.b(path);
    }
}
