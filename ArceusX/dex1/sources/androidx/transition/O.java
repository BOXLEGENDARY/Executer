package androidx.transition;

import android.view.View;

class O extends M {

    private static boolean f12233f = true;

    static class a {
        static void a(View view, int i7, int i8, int i9, int i10) {
            view.setLeftTopRightBottom(i7, i8, i9, i10);
        }
    }

    O() {
    }

    @Override
    public void d(View view, int i7, int i8, int i9, int i10) {
        if (f12233f) {
            try {
                a.a(view, i7, i8, i9, i10);
            } catch (NoSuchMethodError unused) {
                f12233f = false;
            }
        }
    }
}
