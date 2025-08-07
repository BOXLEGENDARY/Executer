package k4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import r4.C2753b;

public class C2517a {
    public static int a(int i7, int i8) {
        return androidx.core.graphics.a.l(i7, (Color.alpha(i7) * i8) / 255);
    }

    public static int b(Context context, int i7, int i8) {
        Integer numF = f(context, i7);
        return numF != null ? numF.intValue() : i8;
    }

    public static int c(Context context, int i7, String str) {
        return l(context, C2753b.e(context, i7, str));
    }

    public static int d(View view, int i7) {
        return l(view.getContext(), C2753b.f(view, i7));
    }

    public static int e(View view, int i7, int i8) {
        return b(view.getContext(), i7, i8);
    }

    public static Integer f(Context context, int i7) {
        TypedValue typedValueA = C2753b.a(context, i7);
        if (typedValueA != null) {
            return Integer.valueOf(l(context, typedValueA));
        }
        return null;
    }

    public static ColorStateList g(Context context, int i7) {
        TypedValue typedValueA = C2753b.a(context, i7);
        if (typedValueA == null) {
            return null;
        }
        int i8 = typedValueA.resourceId;
        if (i8 != 0) {
            return androidx.core.content.a.d(context, i8);
        }
        int i9 = typedValueA.data;
        if (i9 != 0) {
            return ColorStateList.valueOf(i9);
        }
        return null;
    }

    public static boolean h(int i7) {
        return i7 != 0 && androidx.core.graphics.a.e(i7) > 0.5d;
    }

    public static int i(int i7, int i8) {
        return androidx.core.graphics.a.h(i8, i7);
    }

    public static int j(int i7, int i8, float f7) {
        return i(i7, androidx.core.graphics.a.l(i8, Math.round(Color.alpha(i8) * f7)));
    }

    public static int k(View view, int i7, int i8, float f7) {
        return j(d(view, i7), d(view, i8), f7);
    }

    private static int l(Context context, TypedValue typedValue) {
        int i7 = typedValue.resourceId;
        return i7 != 0 ? androidx.core.content.a.c(context, i7) : typedValue.data;
    }
}
