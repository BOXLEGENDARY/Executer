package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

public final class C1628l0 {

    static class a {
        static void a(Window window, boolean z7) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z7 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    static class b {
        static void a(Window window, boolean z7) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z7 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
            window.setDecorFitsSystemWindows(z7);
        }
    }

    static class c {
        static void a(Window window, boolean z7) {
            window.setDecorFitsSystemWindows(z7);
        }
    }

    public static c1 a(Window window, View view) {
        return new c1(window, view);
    }

    public static void b(Window window, boolean z7) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            c.a(window, z7);
        } else if (i7 >= 30) {
            b.a(window, z7);
        } else {
            a.a(window, z7);
        }
    }
}
