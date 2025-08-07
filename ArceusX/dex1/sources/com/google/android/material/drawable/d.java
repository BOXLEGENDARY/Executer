package com.google.android.material.drawable;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import java.util.Arrays;
import q0.C2731a;

public final class d {

    private static class a {
        static void a(Outline outline, Path path) {
            outline.setConvexPath(path);
        }
    }

    private static class b {
        static void a(Outline outline, Path path) {
            outline.setPath(path);
        }
    }

    public static Drawable a(Drawable drawable, Drawable drawable2) {
        return b(drawable, drawable2, -1, -1);
    }

    public static Drawable b(Drawable drawable, Drawable drawable2, int i7, int i8) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i7 == -1) {
            i7 = i(drawable, drawable2);
        }
        if (i8 == -1) {
            i8 = h(drawable, drawable2);
        }
        if (i7 > drawable.getIntrinsicWidth() || i8 > drawable.getIntrinsicHeight()) {
            float f7 = i7 / i8;
            if (f7 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i8 = (int) (intrinsicWidth / f7);
                i7 = intrinsicWidth;
            } else {
                i8 = drawable.getIntrinsicHeight();
                i7 = (int) (f7 * i8);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i7, i8);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static Drawable c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return e(drawable, colorStateList, mode, false);
    }

    public static Drawable d(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return e(drawable, colorStateList, mode, false);
    }

    private static Drawable e(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, boolean z7) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = C2731a.r(drawable).mutate();
            if (mode != null) {
                C2731a.p(drawable, mode);
            }
        } else if (z7) {
            drawable.mutate();
        }
        return drawable;
    }

    public static int[] f(int[] iArr) {
        for (int i7 = 0; i7 < iArr.length; i7++) {
            int i8 = iArr[i7];
            if (i8 == 16842912) {
                return iArr;
            }
            if (i8 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i7] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    public static ColorStateList g(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !com.google.android.material.drawable.a.a(drawable)) {
            return null;
        }
        return com.google.android.material.drawable.b.a(drawable).getColorStateList();
    }

    private static int h(Drawable drawable, Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : drawable.getIntrinsicHeight();
    }

    private static int i(Drawable drawable, Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        return intrinsicWidth != -1 ? intrinsicWidth : drawable.getIntrinsicWidth();
    }

    public static int[] j(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i7 = 0;
        for (int i8 : iArr) {
            if (i8 != 16842912) {
                iArr2[i7] = i8;
                i7++;
            }
        }
        return iArr2;
    }

    public static void k(Outline outline, Path path) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            b.a(outline, path);
            return;
        }
        if (i7 >= 29) {
            try {
                a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            a.a(outline, path);
        }
    }

    public static PorterDuffColorFilter l(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
