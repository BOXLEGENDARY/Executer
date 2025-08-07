package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

class F {

    private static final I f12225a;

    static final Property<View, Float> f12226b;

    static final Property<View, Rect> f12227c;

    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override
        public Float get(View view) {
            return Float.valueOf(F.b(view));
        }

        @Override
        public void set(View view, Float f7) {
            F.e(view, f7.floatValue());
        }
    }

    class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f12225a = new S();
        } else {
            f12225a = new Q();
        }
        f12226b = new a(Float.class, "translationAlpha");
        f12227c = new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        f12225a.a(view);
    }

    static float b(View view) {
        return f12225a.b(view);
    }

    static void c(View view) {
        f12225a.c(view);
    }

    static void d(View view, int i7, int i8, int i9, int i10) {
        f12225a.d(view, i7, i8, i9, i10);
    }

    static void e(View view, float f7) {
        f12225a.e(view, f7);
    }

    static void f(View view, int i7) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        f12225a.f(view, i7);
    }

    static void g(View view, Matrix matrix) {
        f12225a.g(view, matrix);
    }

    static void h(View view, Matrix matrix) {
        f12225a.h(view, matrix);
    }
}
