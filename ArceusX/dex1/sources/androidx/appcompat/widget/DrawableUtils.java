package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import q0.C2731a;

public class DrawableUtils {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] EMPTY_STATE_SET = new int[0];
    public static final Rect INSETS_NONE = new Rect();

    static class a {

        private static final boolean f9173a;

        private static final Method f9174b;

        private static final Field f9175c;

        private static final Field f9176d;

        private static final Field f9177e;

        private static final Field f9178f;

        static {
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.DrawableUtils.a.<clinit>():void");
        }

        static Rect a(Drawable drawable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT < 29 && f9173a) {
                try {
                    Object objInvoke = f9174b.invoke(drawable, null);
                    if (objInvoke != null) {
                        return new Rect(f9175c.getInt(objInvoke), f9176d.getInt(objInvoke), f9177e.getInt(objInvoke), f9178f.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return DrawableUtils.INSETS_NONE;
        }
    }

    static class b {
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    private DrawableUtils() {
    }

    public static boolean canSafelyMutateDrawable(Drawable drawable) {
        return true;
    }

    static void fixDrawable(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 29 || i7 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        forceDrawableStateChange(drawable);
    }

    private static void forceDrawableStateChange(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(CHECKED_STATE_SET);
        } else {
            drawable.setState(EMPTY_STATE_SET);
        }
        drawable.setState(state);
    }

    public static Rect getOpticalBounds(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(C2731a.q(drawable));
        }
        Insets insetsA = b.a(drawable);
        return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
    }

    public static PorterDuff.Mode parseTintMode(int i7, PorterDuff.Mode mode) {
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i7) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
