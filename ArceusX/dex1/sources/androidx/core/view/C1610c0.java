package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import java.util.Objects;

public final class C1610c0 {

    static class a {
        static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    static class b {
        static boolean a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    static class c {
        static int a(ViewConfiguration viewConfiguration, int i7, int i8, int i9) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i7, i8, i9);
        }

        static int b(ViewConfiguration viewConfiguration, int i7, int i8, int i9) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i7, i8, i9);
        }
    }

    private static int a(Resources resources, int i7, x0.h<Integer> hVar, int i8) {
        int dimensionPixelSize;
        return i7 != -1 ? (i7 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i7)) < 0) ? i8 : dimensionPixelSize : hVar.get().intValue();
    }

    private static int b(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    private static int c(Resources resources, int i7, int i8) {
        if (i7 == 4194304 && i8 == 26) {
            return b(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int d(Resources resources, int i7, int i8) {
        if (i7 == 4194304 && i8 == 26) {
            return b(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float e(ViewConfiguration viewConfiguration, Context context) {
        return a.a(viewConfiguration);
    }

    public static int f(Context context, final ViewConfiguration viewConfiguration, int i7, int i8, int i9) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(viewConfiguration, i7, i8, i9);
        }
        if (!i(i7, i8, i9)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int iC = c(resources, i9, i8);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, iC, new x0.h() {
            @Override
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    public static int g(Context context, final ViewConfiguration viewConfiguration, int i7, int i8, int i9) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(viewConfiguration, i7, i8, i9);
        }
        if (!i(i7, i8, i9)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int iD = d(resources, i9, i8);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, iD, new x0.h() {
            @Override
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    public static float h(ViewConfiguration viewConfiguration, Context context) {
        return a.b(viewConfiguration);
    }

    private static boolean i(int i7, int i8, int i9) {
        InputDevice device = InputDevice.getDevice(i7);
        return (device == null || device.getMotionRange(i8, i9) == null) ? false : true;
    }

    public static boolean j(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(viewConfiguration);
        }
        Resources resources = context.getResources();
        int iB = b(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return iB != 0 && resources.getBoolean(iB);
    }
}
