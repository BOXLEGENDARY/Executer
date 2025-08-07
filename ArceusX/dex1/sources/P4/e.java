package p4;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import r4.C2753b;
import z0.C3071a;

public class e {
    private static float a(String[] strArr, int i7) throws NumberFormatException {
        float f7 = Float.parseFloat(strArr[i7]);
        if (f7 >= 0.0f && f7 <= 1.0f) {
            return f7;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f7);
    }

    private static String b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static TimeInterpolator c(String str) {
        if (!e(str, "cubic-bezier")) {
            if (e(str, "path")) {
                return C3071a.b(androidx.core.graphics.c.e(b(str, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
        String[] strArrSplit = b(str, "cubic-bezier").split(",");
        if (strArrSplit.length == 4) {
            return C3071a.a(a(strArrSplit, 0), a(strArrSplit, 1), a(strArrSplit, 2), a(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    private static boolean d(String str) {
        return e(str, "cubic-bezier") || e(str, "path");
    }

    private static boolean e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    public static int f(Context context, int i7, int i8) {
        return C2753b.c(context, i7, i8);
    }

    public static TimeInterpolator g(Context context, int i7, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i7, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        return d(strValueOf) ? c(strValueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }
}
