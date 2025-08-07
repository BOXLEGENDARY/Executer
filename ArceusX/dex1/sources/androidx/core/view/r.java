package androidx.core.view;

import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import x0.C2985b;

public final class r {

    private final DisplayCutout f10716a;

    static class a {
        static int a(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    static class b {
        static Insets a(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    private r(DisplayCutout displayCutout) {
        this.f10716a = displayCutout;
    }

    static r g(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new r(displayCutout);
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(this.f10716a);
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(this.f10716a);
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f10716a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f10716a);
        }
        return 0;
    }

    public androidx.core.graphics.Insets e() {
        return Build.VERSION.SDK_INT >= 30 ? androidx.core.graphics.Insets.toCompatInsets(b.a(this.f10716a)) : androidx.core.graphics.Insets.NONE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        return C2985b.a(this.f10716a, ((r) obj).f10716a);
    }

    DisplayCutout f() {
        return this.f10716a;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f10716a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f10716a + "}";
    }
}
