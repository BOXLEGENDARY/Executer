package androidx.transition;

import android.os.Build;
import android.view.View;

class Q extends O {

    private static boolean f12234g = true;

    static class a {
        static void a(View view, int i7) {
            view.setTransitionVisibility(i7);
        }
    }

    Q() {
    }

    @Override
    public void f(View view, int i7) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i7);
        } else if (f12234g) {
            try {
                a.a(view, i7);
            } catch (NoSuchMethodError unused) {
                f12234g = false;
            }
        }
    }
}
