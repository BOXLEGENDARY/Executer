package Z1;

import a2.c;
import android.graphics.Color;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class s {
    private static final c.a a = c.a.a("x", "y");

    static class a {
        static final int[] a;

        static {
            int[] iArr = new int[c.b.values().length];
            a = iArr;
            try {
                iArr[c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static PointF a(a2.c cVar, float f) throws IOException {
        cVar.e();
        float fA = (float) cVar.A();
        float fA2 = (float) cVar.A();
        while (cVar.h0() != c.b.END_ARRAY) {
            cVar.H0();
        }
        cVar.j();
        return new PointF(fA * f, fA2 * f);
    }

    private static PointF b(a2.c cVar, float f) throws IOException {
        float fA = (float) cVar.A();
        float fA2 = (float) cVar.A();
        while (cVar.u()) {
            cVar.H0();
        }
        return new PointF(fA * f, fA2 * f);
    }

    private static PointF c(a2.c cVar, float f) throws IOException {
        cVar.f();
        float fG = 0.0f;
        float fG2 = 0.0f;
        while (cVar.u()) {
            int iN0 = cVar.n0(a);
            if (iN0 == 0) {
                fG = g(cVar);
            } else if (iN0 != 1) {
                cVar.t0();
                cVar.H0();
            } else {
                fG2 = g(cVar);
            }
        }
        cVar.m();
        return new PointF(fG * f, fG2 * f);
    }

    static int d(a2.c cVar) throws IOException {
        cVar.e();
        int iA = (int) (cVar.A() * 255.0d);
        int iA2 = (int) (cVar.A() * 255.0d);
        int iA3 = (int) (cVar.A() * 255.0d);
        while (cVar.u()) {
            cVar.H0();
        }
        cVar.j();
        return Color.argb(255, iA, iA2, iA3);
    }

    static PointF e(a2.c cVar, float f) throws IOException {
        int i = a.a[cVar.h0().ordinal()];
        if (i == 1) {
            return b(cVar, f);
        }
        if (i == 2) {
            return a(cVar, f);
        }
        if (i == 3) {
            return c(cVar, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + cVar.h0());
    }

    static List<PointF> f(a2.c cVar, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.e();
        while (cVar.h0() == c.b.BEGIN_ARRAY) {
            cVar.e();
            arrayList.add(e(cVar, f));
            cVar.j();
        }
        cVar.j();
        return arrayList;
    }

    static float g(a2.c cVar) throws IOException {
        c.b bVarH0 = cVar.h0();
        int i = a.a[bVarH0.ordinal()];
        if (i == 1) {
            return (float) cVar.A();
        }
        if (i != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + bVarH0);
        }
        cVar.e();
        float fA = (float) cVar.A();
        while (cVar.u()) {
            cVar.H0();
        }
        cVar.j();
        return fA;
    }
}
