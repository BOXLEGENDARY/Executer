package p0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import y0.xyyu.hkVlaTTCDY;

final class f {
    private static a a(a aVar, int i7, int i8, boolean z7, int i9) {
        return aVar != null ? aVar : z7 ? new a(i7, i9, i8) : new a(i7, i8);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayI = k.i(resources, theme, attributeSet, o0.g.f22378B);
        float f7 = k.f(typedArrayI, xmlPullParser, "startX", o0.g.f22387K, 0.0f);
        float f8 = k.f(typedArrayI, xmlPullParser, "startY", o0.g.f22388L, 0.0f);
        float f9 = k.f(typedArrayI, xmlPullParser, "endX", o0.g.f22389M, 0.0f);
        float f10 = k.f(typedArrayI, xmlPullParser, "endY", o0.g.f22390N, 0.0f);
        float f11 = k.f(typedArrayI, xmlPullParser, "centerX", o0.g.f22382F, 0.0f);
        float f12 = k.f(typedArrayI, xmlPullParser, "centerY", o0.g.f22383G, 0.0f);
        int iG = k.g(typedArrayI, xmlPullParser, "type", o0.g.f22381E, 0);
        int iB = k.b(typedArrayI, xmlPullParser, "startColor", o0.g.f22379C, 0);
        boolean zH = k.h(xmlPullParser, "centerColor");
        int iB2 = k.b(typedArrayI, xmlPullParser, "centerColor", o0.g.f22386J, 0);
        int iB3 = k.b(typedArrayI, xmlPullParser, "endColor", o0.g.f22380D, 0);
        int iG2 = k.g(typedArrayI, xmlPullParser, hkVlaTTCDY.deEEvFbs, o0.g.f22385I, 0);
        float f13 = k.f(typedArrayI, xmlPullParser, "gradientRadius", o0.g.f22384H, 0.0f);
        typedArrayI.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iB, iB3, zH, iB2);
        if (iG != 1) {
            return iG != 2 ? new LinearGradient(f7, f8, f9, f10, aVarA.f22645a, aVarA.f22646b, d(iG2)) : new SweepGradient(f11, f12, aVarA.f22645a, aVarA.f22646b);
        }
        if (f13 > 0.0f) {
            return new RadialGradient(f11, f12, f13, aVarA.f22645a, aVarA.f22646b, d(iG2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    private static p0.f.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: p0.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):p0.f$a");
    }

    private static Shader.TileMode d(int i7) {
        return i7 != 1 ? i7 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    static final class a {

        final int[] f22645a;

        final float[] f22646b;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f22645a = new int[size];
            this.f22646b = new float[size];
            for (int i7 = 0; i7 < size; i7++) {
                this.f22645a[i7] = list.get(i7).intValue();
                this.f22646b[i7] = list2.get(i7).floatValue();
            }
        }

        a(int i7, int i8) {
            this.f22645a = new int[]{i7, i8};
            this.f22646b = new float[]{0.0f, 1.0f};
        }

        a(int i7, int i8, int i9) {
            this.f22645a = new int[]{i7, i8, i9};
            this.f22646b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
