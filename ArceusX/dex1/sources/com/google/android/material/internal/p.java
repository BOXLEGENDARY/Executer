package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.TintTypedArray;
import c4.C1746b;
import c4.C1755k;
import r4.C2753b;

public final class p {

    private static final int[] f18172a = {C1746b.f12748k};

    private static final int[] f18173b = {C1746b.f12749l};

    public static void a(Context context) {
        e(context, f18172a, "Theme.AppCompat");
    }

    private static void b(Context context, AttributeSet attributeSet, int i7, int i8) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1755k.Q7, i7, i8);
        boolean z7 = typedArrayObtainStyledAttributes.getBoolean(C1755k.S7, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z7) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C1746b.f12758u, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(Context context) {
        e(context, f18173b, "Theme.MaterialComponents");
    }

    private static void d(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8, int... iArr2) {
        boolean zF;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1755k.Q7, i7, i8);
        if (!typedArrayObtainStyledAttributes.getBoolean(C1755k.T7, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zF = typedArrayObtainStyledAttributes.getResourceId(C1755k.R7, -1) != -1;
        } else {
            zF = f(context, attributeSet, iArr, i7, i8, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zF) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void e(Context context, int[] iArr, String str) {
        if (h(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    private static boolean f(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, i8);
        for (int i9 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i9, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static boolean g(Context context) {
        return C2753b.b(context, C1746b.f12757t, false);
    }

    private static boolean h(Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i7 = 0; i7 < iArr.length; i7++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i7)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static TypedArray i(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8, int... iArr2) {
        b(context, attributeSet, i7, i8);
        d(context, attributeSet, iArr, i7, i8, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i7, i8);
    }

    public static TintTypedArray j(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8, int... iArr2) {
        b(context, attributeSet, i7, i8);
        d(context, attributeSet, iArr, i7, i8, iArr2);
        return TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i7, i8);
    }
}
