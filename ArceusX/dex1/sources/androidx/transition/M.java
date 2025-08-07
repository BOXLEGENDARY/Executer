package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

class M extends I {

    private static boolean f12231d = true;

    private static boolean f12232e = true;

    static class a {
        static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    M() {
    }

    @Override
    public void g(View view, Matrix matrix) {
        if (f12231d) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f12231d = false;
            }
        }
    }

    @Override
    public void h(View view, Matrix matrix) {
        if (f12232e) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f12232e = false;
            }
        }
    }
}
