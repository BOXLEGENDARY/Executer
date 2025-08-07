package p0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public class k {
    public static boolean a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i7, boolean z7) {
        return !h(xmlPullParser, str) ? z7 : typedArray.getBoolean(i7, z7);
    }

    public static int b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i7, int i8) {
        return !h(xmlPullParser, str) ? i8 : typedArray.getColor(i7, i8);
    }

    public static ColorStateList c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i7) {
        if (!h(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i7, typedValue);
        int i8 = typedValue.type;
        if (i8 != 2) {
            return (i8 < 28 || i8 > 31) ? c.d(typedArray.getResources(), typedArray.getResourceId(i7, 0), theme) : d(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i7 + ": " + typedValue);
    }

    private static ColorStateList d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static d e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i7, int i8) {
        if (h(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i7, typedValue);
            int i9 = typedValue.type;
            if (i9 >= 28 && i9 <= 31) {
                return d.b(typedValue.data);
            }
            d dVarG = d.g(typedArray.getResources(), typedArray.getResourceId(i7, 0), theme);
            if (dVarG != null) {
                return dVarG;
            }
        }
        return d.b(i8);
    }

    public static float f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i7, float f7) {
        return !h(xmlPullParser, str) ? f7 : typedArray.getFloat(i7, f7);
    }

    public static int g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i7, int i8) {
        return !h(xmlPullParser, str) ? i8 : typedArray.getInt(i7, i8);
    }

    public static boolean h(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray i(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
