package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;

class E {

    private static boolean f12224a = true;

    static class a {
        static int a(ViewGroup viewGroup, int i7) {
            return viewGroup.getChildDrawingOrder(i7);
        }

        static void b(ViewGroup viewGroup, boolean z7) {
            viewGroup.suppressLayout(z7);
        }
    }

    private static void a(ViewGroup viewGroup, boolean z7) {
        if (f12224a) {
            try {
                a.b(viewGroup, z7);
            } catch (NoSuchMethodError unused) {
                f12224a = false;
            }
        }
    }

    static void b(ViewGroup viewGroup, boolean z7) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(viewGroup, z7);
        } else {
            a(viewGroup, z7);
        }
    }
}
