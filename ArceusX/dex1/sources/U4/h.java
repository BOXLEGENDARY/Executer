package u4;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.s;

public class h {
    static C2934d a(int i7) {
        return i7 != 0 ? i7 != 1 ? b() : new C2935e() : new j();
    }

    static C2934d b() {
        return new j();
    }

    static C2936f c() {
        return new C2936f();
    }

    public static void d(View view, float f7) {
        Drawable background = view.getBackground();
        if (background instanceof C2937g) {
            ((C2937g) background).Z(f7);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C2937g) {
            f(view, (C2937g) background);
        }
    }

    public static void f(View view, C2937g c2937g) {
        if (c2937g.S()) {
            c2937g.d0(s.g(view));
        }
    }
}
