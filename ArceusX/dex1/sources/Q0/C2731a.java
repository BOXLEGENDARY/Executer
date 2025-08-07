package q0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class C2731a {

    static class C0217a {
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(Drawable drawable, float f7, float f8) {
            drawable.setHotspot(f7, f8);
        }

        static void f(Drawable drawable, int i7, int i8, int i9, int i10) {
            drawable.setHotspotBounds(i7, i8, i9, i10);
        }

        static void g(Drawable drawable, int i7) {
            drawable.setTint(i7);
        }

        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    static class b {
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(Drawable drawable, int i7) {
            return drawable.setLayoutDirection(i7);
        }
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        C0217a.a(drawable, theme);
    }

    public static boolean b(Drawable drawable) {
        return C0217a.b(drawable);
    }

    public static void c(Drawable drawable) {
        drawable.clearColorFilter();
    }

    @Deprecated
    public static int d(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static ColorFilter e(Drawable drawable) {
        return C0217a.c(drawable);
    }

    public static int f(Drawable drawable) {
        return b.a(drawable);
    }

    public static void g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C0217a.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    @Deprecated
    public static boolean h(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    public static void i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    @Deprecated
    public static void j(Drawable drawable, boolean z7) {
        drawable.setAutoMirrored(z7);
    }

    public static void k(Drawable drawable, float f7, float f8) {
        C0217a.e(drawable, f7, f8);
    }

    public static void l(Drawable drawable, int i7, int i8, int i9, int i10) {
        C0217a.f(drawable, i7, i8, i9, i10);
    }

    public static boolean m(Drawable drawable, int i7) {
        return b.b(drawable, i7);
    }

    public static void n(Drawable drawable, int i7) {
        C0217a.g(drawable, i7);
    }

    public static void o(Drawable drawable, ColorStateList colorStateList) {
        C0217a.h(drawable, colorStateList);
    }

    public static void p(Drawable drawable, PorterDuff.Mode mode) {
        C0217a.i(drawable, mode);
    }

    public static <T extends Drawable> T q(Drawable drawable) {
        return drawable instanceof q0.b ? (T) ((q0.b) drawable).b() : drawable;
    }

    public static Drawable r(Drawable drawable) {
        return drawable;
    }
}
