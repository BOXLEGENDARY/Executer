package p0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s0.C2870a;

public final class c {

    private static final ThreadLocal<TypedValue> f22629a = new ThreadLocal<>();

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    private static TypedValue c() {
        ThreadLocal<TypedValue> threadLocal = f22629a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList d(Resources resources, int i7, Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i7), theme);
        } catch (Exception e7) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e7);
            return null;
        }
    }

    private static android.content.res.ColorStateList e(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: p0.c.e(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    private static boolean f(Resources resources, int i7) throws Resources.NotFoundException {
        TypedValue typedValueC = c();
        resources.getValue(i7, typedValueC, true);
        int i8 = typedValueC.type;
        return i8 >= 28 && i8 <= 31;
    }

    private static int g(int i7, float f7, float f8) {
        boolean z7 = f8 >= 0.0f && f8 <= 100.0f;
        if (f7 == 1.0f && !z7) {
            return i7;
        }
        int iC = C2870a.c((int) ((Color.alpha(i7) * f7) + 0.5f), 0, 255);
        if (z7) {
            C2717a c2717aC = C2717a.c(i7);
            i7 = C2717a.m(c2717aC.j(), c2717aC.i(), f8);
        }
        return (i7 & 16777215) | (iC << 24);
    }

    private static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
