package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import g.C2456j;

public class ThemeUtils {
    private static final String TAG = "ThemeUtils";
    private static final ThreadLocal<TypedValue> TL_TYPED_VALUE = new ThreadLocal<>();
    static final int[] DISABLED_STATE_SET = {-16842910};
    static final int[] FOCUSED_STATE_SET = {R.attr.state_focused};
    static final int[] ACTIVATED_STATE_SET = {R.attr.state_activated};
    static final int[] PRESSED_STATE_SET = {R.attr.state_pressed};
    static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    static final int[] SELECTED_STATE_SET = {R.attr.state_selected};
    static final int[] NOT_PRESSED_OR_FOCUSED_STATE_SET = {-16842919, -16842908};
    static final int[] EMPTY_STATE_SET = new int[0];
    private static final int[] TEMP_ARRAY = new int[1];

    private ThemeUtils() {
    }

    public static void checkAppCompatTheme(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C2456j.f20720A0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(C2456j.f20740F0)) {
                Log.e(TAG, "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList createDisabledStateList(int i7, int i8) {
        return new ColorStateList(new int[][]{DISABLED_STATE_SET, EMPTY_STATE_SET}, new int[]{i8, i7});
    }

    public static int getDisabledThemeAttrColor(Context context, int i7) {
        ColorStateList themeAttrColorStateList = getThemeAttrColorStateList(context, i7);
        if (themeAttrColorStateList != null && themeAttrColorStateList.isStateful()) {
            return themeAttrColorStateList.getColorForState(DISABLED_STATE_SET, themeAttrColorStateList.getDefaultColor());
        }
        TypedValue typedValue = getTypedValue();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        return getThemeAttrColor(context, i7, typedValue.getFloat());
    }

    public static int getThemeAttrColor(Context context, int i7) {
        int[] iArr = TEMP_ARRAY;
        iArr[0] = i7;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, (AttributeSet) null, iArr);
        try {
            return tintTypedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList getThemeAttrColorStateList(Context context, int i7) {
        int[] iArr = TEMP_ARRAY;
        iArr[0] = i7;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, (AttributeSet) null, iArr);
        try {
            return tintTypedArrayObtainStyledAttributes.getColorStateList(0);
        } finally {
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }

    private static TypedValue getTypedValue() {
        ThreadLocal<TypedValue> threadLocal = TL_TYPED_VALUE;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    static int getThemeAttrColor(Context context, int i7, float f7) {
        return androidx.core.graphics.a.l(getThemeAttrColor(context, i7), Math.round(Color.alpha(r0) * f7));
    }
}
