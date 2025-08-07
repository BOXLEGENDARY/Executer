package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import x0.C2986c;

public final class b {

    private static final ThreadLocal<C2986c<Rect, Rect>> f10563a = new ThreadLocal<>();

    static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }
}
