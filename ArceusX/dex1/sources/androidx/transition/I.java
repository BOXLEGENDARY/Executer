package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

class I {

    private static boolean f12228a = true;

    private static Field f12229b;

    private static boolean f12230c;

    static class a {
        static float a(View view) {
            return view.getTransitionAlpha();
        }

        static void b(View view, float f7) {
            view.setTransitionAlpha(f7);
        }
    }

    I() {
    }

    public void a(View view) {
    }

    public float b(View view) {
        if (f12228a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f12228a = false;
            }
        }
        return view.getAlpha();
    }

    public void c(View view) {
    }

    public void d(View view, int i7, int i8, int i9, int i10) {
        throw null;
    }

    public void e(View view, float f7) {
        if (f12228a) {
            try {
                a.b(view, f7);
                return;
            } catch (NoSuchMethodError unused) {
                f12228a = false;
            }
        }
        view.setAlpha(f7);
    }

    public void f(View view, int i7) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f12230c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f12229b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f12230c = true;
        }
        Field field = f12229b;
        if (field != null) {
            try {
                f12229b.setInt(view, i7 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void g(View view, Matrix matrix) {
        throw null;
    }

    public void h(View view, Matrix matrix) {
        throw null;
    }
}
