package r4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.TintTypedArray;
import h.C2473a;

public class C2754c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i7) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (colorStateListA = C2473a.a(context, resourceId)) == null) ? typedArray.getColorStateList(i7) : colorStateListA;
    }

    public static ColorStateList b(Context context, TintTypedArray tintTypedArray, int i7) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!tintTypedArray.hasValue(i7) || (resourceId = tintTypedArray.getResourceId(i7, 0)) == 0 || (colorStateListA = C2473a.a(context, resourceId)) == null) ? tintTypedArray.getColorStateList(i7) : colorStateListA;
    }

    public static int c(Context context, TypedArray typedArray, int i7, int i8) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i7, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i7, i8);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i8);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable d(Context context, TypedArray typedArray, int i7) {
        int resourceId;
        Drawable drawableB;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (drawableB = C2473a.b(context, resourceId)) == null) ? typedArray.getDrawable(i7) : drawableB;
    }

    static int e(TypedArray typedArray, int i7, int i8) {
        return typedArray.hasValue(i7) ? i7 : i8;
    }

    public static C2755d f(Context context, TypedArray typedArray, int i7) {
        int resourceId;
        if (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0) {
            return null;
        }
        return new C2755d(context, resourceId);
    }

    public static boolean g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
