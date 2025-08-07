package d4;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class C2388a {

    public static final TimeInterpolator f20312a = new LinearInterpolator();

    public static final TimeInterpolator f20313b = new O0.b();

    public static final TimeInterpolator f20314c = new O0.a();

    public static final TimeInterpolator f20315d = new O0.c();

    public static final TimeInterpolator f20316e = new DecelerateInterpolator();

    public static float a(float f7, float f8, float f9) {
        return f7 + (f9 * (f8 - f7));
    }

    public static float b(float f7, float f8, float f9, float f10, float f11) {
        return f11 <= f9 ? f7 : f11 >= f10 ? f8 : a(f7, f8, (f11 - f9) / (f10 - f9));
    }

    public static int c(int i7, int i8, float f7) {
        return i7 + Math.round(f7 * (i8 - i7));
    }
}
