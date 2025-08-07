package o2;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import o2.b;
import o2.e;
import o2.g;

class h {
    private static HashSet<String> i;
    private Canvas a;
    private float b;
    private o2.g c;
    private C0260h d;
    private Stack<C0260h> e;
    private Stack<g.J> f;
    private Stack<Matrix> g;
    private b.q h = null;

    static class a {
        static final int[] a;
        static final int[] b;
        static final int[] c;

        static {
            int[] iArr = new int[g.E.d.values().length];
            c = iArr;
            try {
                iArr[g.E.d.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[g.E.d.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[g.E.d.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[g.E.c.values().length];
            b = iArr2;
            try {
                iArr2[g.E.c.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[g.E.c.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[g.E.c.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[e.a.values().length];
            a = iArr3;
            try {
                iArr3[e.a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[e.a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[e.a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[e.a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[e.a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[e.a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[e.a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[e.a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private class b implements g.InterfaceC0720x {
        private float b;
        private float c;
        private boolean h;
        private List<c> a = new ArrayList();
        private c d = null;
        private boolean e = false;
        private boolean f = true;
        private int g = -1;

        b(g.C0719w c0719w) {
            if (c0719w == null) {
                return;
            }
            c0719w.h(this);
            if (this.h) {
                this.d.b(this.a.get(this.g));
                this.a.set(this.g, this.d);
                this.h = false;
            }
            c cVar = this.d;
            if (cVar != null) {
                this.a.add(cVar);
            }
        }

        @Override
        public void a(float f, float f2, float f3, float f4) {
            this.d.a(f, f2);
            this.a.add(this.d);
            this.d = h.this.new c(f3, f4, f3 - f, f4 - f2);
            this.h = false;
        }

        @Override
        public void b(float f, float f2) {
            if (this.h) {
                this.d.b(this.a.get(this.g));
                this.a.set(this.g, this.d);
                this.h = false;
            }
            c cVar = this.d;
            if (cVar != null) {
                this.a.add(cVar);
            }
            this.b = f;
            this.c = f2;
            this.d = h.this.new c(f, f2, 0.0f, 0.0f);
            this.g = this.a.size();
        }

        @Override
        public void c(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.f || this.e) {
                this.d.a(f, f2);
                this.a.add(this.d);
                this.e = false;
            }
            this.d = h.this.new c(f5, f6, f5 - f3, f6 - f4);
            this.h = false;
        }

        @Override
        public void close() {
            this.a.add(this.d);
            e(this.b, this.c);
            this.h = true;
        }

        @Override
        public void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.e = true;
            this.f = false;
            c cVar = this.d;
            h.h(cVar.a, cVar.b, f, f2, f3, z, z2, f4, f5, this);
            this.f = true;
            this.h = false;
        }

        @Override
        public void e(float f, float f2) {
            this.d.a(f, f2);
            this.a.add(this.d);
            h hVar = h.this;
            c cVar = this.d;
            this.d = hVar.new c(f, f2, f - cVar.a, f2 - cVar.b);
            this.h = false;
        }

        List<c> f() {
            return this.a;
        }
    }

    private class c {
        float a;
        float b;
        float c;
        float d;
        boolean e = false;

        c(float f, float f2, float f3, float f4) {
            this.c = 0.0f;
            this.d = 0.0f;
            this.a = f;
            this.b = f2;
            double dSqrt = Math.sqrt((f3 * f3) + (f4 * f4));
            if (dSqrt != 0.0d) {
                this.c = (float) (f3 / dSqrt);
                this.d = (float) (f4 / dSqrt);
            }
        }

        void a(float f, float f2) {
            float f3 = f - this.a;
            float f4 = f2 - this.b;
            double dSqrt = Math.sqrt((f3 * f3) + (f4 * f4));
            if (dSqrt != 0.0d) {
                f3 = (float) (f3 / dSqrt);
                f4 = (float) (f4 / dSqrt);
            }
            float f5 = this.c;
            if (f3 != (-f5) || f4 != (-this.d)) {
                this.c = f5 + f3;
                this.d += f4;
            } else {
                this.e = true;
                this.c = -f4;
                this.d = f3;
            }
        }

        void b(c cVar) {
            float f = cVar.c;
            float f2 = this.c;
            if (f == (-f2)) {
                float f3 = cVar.d;
                if (f3 == (-this.d)) {
                    this.e = true;
                    this.c = -f3;
                    this.d = cVar.c;
                    return;
                }
            }
            this.c = f2 + f;
            this.d += cVar.d;
        }

        public String toString() {
            return "(" + this.a + "," + this.b + " " + this.c + "," + this.d + ")";
        }
    }

    private class d implements g.InterfaceC0720x {
        Path a = new Path();
        float b;
        float c;

        d(g.C0719w c0719w) {
            if (c0719w == null) {
                return;
            }
            c0719w.h(this);
        }

        @Override
        public void a(float f, float f2, float f3, float f4) {
            this.a.quadTo(f, f2, f3, f4);
            this.b = f3;
            this.c = f4;
        }

        @Override
        public void b(float f, float f2) {
            this.a.moveTo(f, f2);
            this.b = f;
            this.c = f2;
        }

        @Override
        public void c(float f, float f2, float f3, float f4, float f5, float f6) {
            this.a.cubicTo(f, f2, f3, f4, f5, f6);
            this.b = f5;
            this.c = f6;
        }

        @Override
        public void close() {
            this.a.close();
        }

        @Override
        public void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            h.h(this.b, this.c, f, f2, f3, z, z2, f4, f5, this);
            this.b = f4;
            this.c = f5;
        }

        @Override
        public void e(float f, float f2) {
            this.a.lineTo(f, f2);
            this.b = f;
            this.c = f2;
        }

        Path f() {
            return this.a;
        }
    }

    private class e extends f {
        private Path e;

        e(Path path, float f, float f2) {
            super(f, f2);
            this.e = path;
        }

        @Override
        public void b(String str) {
            if (h.this.Y0()) {
                if (h.this.d.b) {
                    h.this.a.drawTextOnPath(str, this.e, this.b, this.c, h.this.d.d);
                }
                if (h.this.d.c) {
                    h.this.a.drawTextOnPath(str, this.e, this.b, this.c, h.this.d.e);
                }
            }
            this.b += h.this.d.d.measureText(str);
        }
    }

    private class f extends j {
        float b;
        float c;

        f(float f, float f2) {
            super(h.this, null);
            this.b = f;
            this.c = f2;
        }

        @Override
        public void b(String str) {
            h.y("TextSequence render", new Object[0]);
            if (h.this.Y0()) {
                if (h.this.d.b) {
                    h.this.a.drawText(str, this.b, this.c, h.this.d.d);
                }
                if (h.this.d.c) {
                    h.this.a.drawText(str, this.b, this.c, h.this.d.e);
                }
            }
            this.b += h.this.d.d.measureText(str);
        }
    }

    private class g extends j {
        float b;
        float c;
        Path d;

        g(float f, float f2, Path path) {
            super(h.this, null);
            this.b = f;
            this.c = f2;
            this.d = path;
        }

        @Override
        public boolean a(g.Y y) {
            if (!(y instanceof g.Z)) {
                return true;
            }
            h.Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override
        public void b(String str) {
            if (h.this.Y0()) {
                Path path = new Path();
                h.this.d.d.getTextPath(str, 0, str.length(), this.b, this.c, path);
                this.d.addPath(path);
            }
            this.b += h.this.d.d.measureText(str);
        }
    }

    private class i extends j {
        float b;
        float c;
        RectF d;

        i(float f, float f2) {
            super(h.this, null);
            this.d = new RectF();
            this.b = f;
            this.c = f2;
        }

        @Override
        public boolean a(g.Y y) {
            if (!(y instanceof g.Z)) {
                return true;
            }
            g.Z z = (g.Z) y;
            g.N nP = y.a.p(z.o);
            if (nP == null) {
                h.F("TextPath path reference '%s' not found", z.o);
                return false;
            }
            g.C0718v c0718v = (g.C0718v) nP;
            Path pathF = h.this.new d(c0718v.o).f();
            Matrix matrix = c0718v.n;
            if (matrix != null) {
                pathF.transform(matrix);
            }
            RectF rectF = new RectF();
            pathF.computeBounds(rectF, true);
            this.d.union(rectF);
            return false;
        }

        @Override
        public void b(String str) {
            if (h.this.Y0()) {
                Rect rect = new Rect();
                h.this.d.d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.b, this.c);
                this.d.union(rectF);
            }
            this.b += h.this.d.d.measureText(str);
        }
    }

    private abstract class j {
        private j() {
        }

        public boolean a(g.Y y) {
            return true;
        }

        public abstract void b(String str);

        j(h hVar, a aVar) {
            this();
        }
    }

    h(Canvas canvas, float f2) {
        this.a = canvas;
        this.b = f2;
    }

    private boolean A() {
        Boolean bool = this.d.a.T;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private void A0(g.N n) {
        if (n instanceof g.InterfaceC0716t) {
            return;
        }
        S0();
        u(n);
        if (n instanceof g.F) {
            x0((g.F) n);
        } else if (n instanceof g.e0) {
            E0((g.e0) n);
        } else if (n instanceof g.S) {
            B0((g.S) n);
        } else if (n instanceof g.C0709m) {
            q0((g.C0709m) n);
        } else if (n instanceof g.C0711o) {
            r0((g.C0711o) n);
        } else if (n instanceof g.C0718v) {
            t0((g.C0718v) n);
        } else if (n instanceof g.B) {
            w0((g.B) n);
        } else if (n instanceof g.C0701d) {
            o0((g.C0701d) n);
        } else if (n instanceof g.C0705i) {
            p0((g.C0705i) n);
        } else if (n instanceof g.C0713q) {
            s0((g.C0713q) n);
        } else if (n instanceof g.A) {
            v0((g.A) n);
        } else if (n instanceof g.C0722z) {
            u0((g.C0722z) n);
        } else if (n instanceof g.W) {
            D0((g.W) n);
        }
        R0();
    }

    private void B(g.K k2, Path path) {
        g.O o = this.d.a.e;
        if (o instanceof g.C0717u) {
            g.N nP = this.c.p(((g.C0717u) o).d);
            if (nP instanceof g.C0721y) {
                L(k2, path, (g.C0721y) nP);
                return;
            }
        }
        this.a.drawPath(path, this.d.d);
    }

    private void B0(g.S s) {
        y("Switch render", new Object[0]);
        W0(this.d, s);
        if (A()) {
            Matrix matrix = s.o;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            p(s);
            boolean zM0 = m0();
            K0(s);
            if (zM0) {
                j0(s);
            }
            U0(s);
        }
    }

    private void C(Path path) {
        C0260h c0260h = this.d;
        if (c0260h.a.e0 != g.E.i.NonScalingStroke) {
            this.a.drawPath(path, c0260h.e);
            return;
        }
        Matrix matrix = this.a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.a.setMatrix(new Matrix());
        Shader shader = this.d.e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.a.drawPath(path2, this.d.e);
        this.a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private void C0(g.T t, g.C0699b c0699b) {
        y("Symbol render", new Object[0]);
        if (c0699b.c == 0.0f || c0699b.d == 0.0f) {
            return;
        }
        o2.e eVar = t.o;
        if (eVar == null) {
            eVar = o2.e.e;
        }
        W0(this.d, t);
        C0260h c0260h = this.d;
        c0260h.f = c0699b;
        if (!c0260h.a.O.booleanValue()) {
            g.C0699b c0699b2 = this.d.f;
            O0(c0699b2.a, c0699b2.b, c0699b2.c, c0699b2.d);
        }
        g.C0699b c0699b3 = t.p;
        if (c0699b3 != null) {
            this.a.concat(o(this.d.f, c0699b3, eVar));
            this.d.g = t.p;
        } else {
            Canvas canvas = this.a;
            g.C0699b c0699b4 = this.d.f;
            canvas.translate(c0699b4.a, c0699b4.b);
        }
        boolean zM0 = m0();
        F0(t, true);
        if (zM0) {
            j0(t);
        }
        U0(t);
    }

    private float D(float f2, float f3, float f4, float f5) {
        return (f2 * f4) + (f3 * f5);
    }

    private void D0(g.W w) {
        y("Text render", new Object[0]);
        W0(this.d, w);
        if (A()) {
            Matrix matrix = w.s;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            List<g.C0712p> list = w.o;
            float fG = 0.0f;
            float fE = (list == null || list.size() == 0) ? 0.0f : w.o.get(0).e(this);
            List<g.C0712p> list2 = w.p;
            float fG2 = (list2 == null || list2.size() == 0) ? 0.0f : w.p.get(0).g(this);
            List<g.C0712p> list3 = w.q;
            float fE2 = (list3 == null || list3.size() == 0) ? 0.0f : w.q.get(0).e(this);
            List<g.C0712p> list4 = w.r;
            if (list4 != null && list4.size() != 0) {
                fG = w.r.get(0).g(this);
            }
            g.E.f fVarO = O();
            if (fVarO != g.E.f.Start) {
                float fN = n(w);
                if (fVarO == g.E.f.Middle) {
                    fN /= 2.0f;
                }
                fE -= fN;
            }
            if (w.h == null) {
                i iVar = new i(fE, fG2);
                E(w, iVar);
                RectF rectF = iVar.d;
                w.h = new g.C0699b(rectF.left, rectF.top, rectF.width(), iVar.d.height());
            }
            U0(w);
            r(w);
            p(w);
            boolean zM0 = m0();
            E(w, new f(fE + fE2, fG2 + fG));
            if (zM0) {
                j0(w);
            }
        }
    }

    private void E(g.Y y, j jVar) {
        if (A()) {
            Iterator<g.N> it = y.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                g.N next = it.next();
                if (next instanceof g.c0) {
                    jVar.b(T0(((g.c0) next).c, z, !it.hasNext()));
                } else {
                    l0(next, jVar);
                }
                z = false;
            }
        }
    }

    private void E0(g.e0 e0Var) {
        y("Use render", new Object[0]);
        g.C0712p c0712p = e0Var.s;
        if (c0712p == null || !c0712p.i()) {
            g.C0712p c0712p2 = e0Var.t;
            if (c0712p2 == null || !c0712p2.i()) {
                W0(this.d, e0Var);
                if (A()) {
                    g.N nP = e0Var.a.p(e0Var.p);
                    if (nP == null) {
                        F("Use reference '%s' not found", e0Var.p);
                        return;
                    }
                    Matrix matrix = e0Var.o;
                    if (matrix != null) {
                        this.a.concat(matrix);
                    }
                    g.C0712p c0712p3 = e0Var.q;
                    float fE = c0712p3 != null ? c0712p3.e(this) : 0.0f;
                    g.C0712p c0712p4 = e0Var.r;
                    this.a.translate(fE, c0712p4 != null ? c0712p4.g(this) : 0.0f);
                    p(e0Var);
                    boolean zM0 = m0();
                    i0(e0Var);
                    if (nP instanceof g.F) {
                        g.C0699b c0699bF0 = f0(null, null, e0Var.s, e0Var.t);
                        S0();
                        y0((g.F) nP, c0699bF0);
                        R0();
                    } else if (nP instanceof g.T) {
                        g.C0712p c0712p5 = e0Var.s;
                        if (c0712p5 == null) {
                            c0712p5 = new g.C0712p(100.0f, g.d0.percent);
                        }
                        g.C0712p c0712p6 = e0Var.t;
                        if (c0712p6 == null) {
                            c0712p6 = new g.C0712p(100.0f, g.d0.percent);
                        }
                        g.C0699b c0699bF02 = f0(null, null, c0712p5, c0712p6);
                        S0();
                        C0((g.T) nP, c0699bF02);
                        R0();
                    } else {
                        A0(nP);
                    }
                    h0();
                    if (zM0) {
                        j0(e0Var);
                    }
                    U0(e0Var);
                }
            }
        }
    }

    public static void F(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    private void F0(g.J j2, boolean z) {
        if (z) {
            i0(j2);
        }
        Iterator<g.N> it = j2.getChildren().iterator();
        while (it.hasNext()) {
            A0(it.next());
        }
        if (z) {
            h0();
        }
    }

    private void G(g.Y y, StringBuilder sb) {
        Iterator<g.N> it = y.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            g.N next = it.next();
            if (next instanceof g.Y) {
                G((g.Y) next, sb);
            } else if (next instanceof g.c0) {
                sb.append(T0(((g.c0) next).c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    private void H(g.AbstractC0706j abstractC0706j, String str) {
        g.N nP = abstractC0706j.a.p(str);
        if (nP == null) {
            Z0("Gradient reference '%s' not found", str);
            return;
        }
        if (!(nP instanceof g.AbstractC0706j)) {
            F("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (nP == abstractC0706j) {
            F("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        g.AbstractC0706j abstractC0706j2 = (g.AbstractC0706j) nP;
        if (abstractC0706j.i == null) {
            abstractC0706j.i = abstractC0706j2.i;
        }
        if (abstractC0706j.j == null) {
            abstractC0706j.j = abstractC0706j2.j;
        }
        if (abstractC0706j.k == null) {
            abstractC0706j.k = abstractC0706j2.k;
        }
        if (abstractC0706j.h.isEmpty()) {
            abstractC0706j.h = abstractC0706j2.h;
        }
        try {
            if (abstractC0706j instanceof g.M) {
                I((g.M) abstractC0706j, (g.M) nP);
            } else {
                J((g.Q) abstractC0706j, (g.Q) nP);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC0706j2.l;
        if (str2 != null) {
            H(abstractC0706j, str2);
        }
    }

    private void H0(o2.g.C0714r r12, o2.h.c r13) {
        throw new UnsupportedOperationException("Method not decompiled: o2.h.H0(o2.g$r, o2.h$c):void");
    }

    private void I(g.M m, g.M m2) {
        if (m.m == null) {
            m.m = m2.m;
        }
        if (m.n == null) {
            m.n = m2.n;
        }
        if (m.o == null) {
            m.o = m2.o;
        }
        if (m.p == null) {
            m.p = m2.p;
        }
    }

    private void I0(g.AbstractC0708l abstractC0708l) {
        g.C0714r c0714r;
        g.C0714r c0714r2;
        g.C0714r c0714r3;
        int size;
        g.E e2 = this.d.a;
        String str = e2.Q;
        if (str == null && e2.R == null && e2.S == null) {
            return;
        }
        if (str == null) {
            c0714r = null;
        } else {
            g.N nP = abstractC0708l.a.p(str);
            if (nP != null) {
                c0714r = (g.C0714r) nP;
            } else {
                F("Marker reference '%s' not found", this.d.a.Q);
                c0714r = null;
            }
        }
        String str2 = this.d.a.R;
        if (str2 == null) {
            c0714r2 = null;
        } else {
            g.N nP2 = abstractC0708l.a.p(str2);
            if (nP2 != null) {
                c0714r2 = (g.C0714r) nP2;
            } else {
                F("Marker reference '%s' not found", this.d.a.R);
                c0714r2 = null;
            }
        }
        String str3 = this.d.a.S;
        if (str3 == null) {
            c0714r3 = null;
        } else {
            g.N nP3 = abstractC0708l.a.p(str3);
            if (nP3 != null) {
                c0714r3 = (g.C0714r) nP3;
            } else {
                F("Marker reference '%s' not found", this.d.a.S);
                c0714r3 = null;
            }
        }
        List<c> listF = abstractC0708l instanceof g.C0718v ? new b(((g.C0718v) abstractC0708l).o).f() : abstractC0708l instanceof g.C0713q ? k((g.C0713q) abstractC0708l) : l((g.C0722z) abstractC0708l);
        if (listF == null || (size = listF.size()) == 0) {
            return;
        }
        g.E e3 = this.d.a;
        e3.S = null;
        e3.R = null;
        e3.Q = null;
        if (c0714r != null) {
            H0(c0714r, listF.get(0));
        }
        if (c0714r2 != null && listF.size() > 2) {
            c cVarN0 = listF.get(0);
            c cVar = listF.get(1);
            int i2 = 1;
            while (i2 < size - 1) {
                i2++;
                c cVar2 = listF.get(i2);
                cVarN0 = cVar.e ? n0(cVarN0, cVar, cVar2) : cVar;
                H0(c0714r2, cVarN0);
                cVar = cVar2;
            }
        }
        if (c0714r3 != null) {
            H0(c0714r3, listF.get(size - 1));
        }
    }

    private void J(g.Q q, g.Q q2) {
        if (q.m == null) {
            q.m = q2.m;
        }
        if (q.n == null) {
            q.n = q2.n;
        }
        if (q.o == null) {
            q.o = q2.o;
        }
        if (q.p == null) {
            q.p = q2.p;
        }
        if (q.q == null) {
            q.q = q2.q;
        }
    }

    private void J0(g.C0715s c0715s, g.K k2, g.C0699b c0699b) {
        float fE;
        float fG;
        y("Mask render", new Object[0]);
        Boolean bool = c0715s.o;
        if (bool == null || !bool.booleanValue()) {
            g.C0712p c0712p = c0715s.s;
            float fD = c0712p != null ? c0712p.d(this, 1.0f) : 1.2f;
            g.C0712p c0712p2 = c0715s.t;
            float fD2 = c0712p2 != null ? c0712p2.d(this, 1.0f) : 1.2f;
            fE = fD * c0699b.c;
            fG = fD2 * c0699b.d;
        } else {
            g.C0712p c0712p3 = c0715s.s;
            fE = c0712p3 != null ? c0712p3.e(this) : c0699b.c;
            g.C0712p c0712p4 = c0715s.t;
            fG = c0712p4 != null ? c0712p4.g(this) : c0699b.d;
        }
        if (fE == 0.0f || fG == 0.0f) {
            return;
        }
        S0();
        C0260h c0260hM = M(c0715s);
        this.d = c0260hM;
        c0260hM.a.F = Float.valueOf(1.0f);
        boolean zM0 = m0();
        this.a.save();
        Boolean bool2 = c0715s.p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.a.translate(c0699b.a, c0699b.b);
            this.a.scale(c0699b.c, c0699b.d);
        }
        F0(c0715s, false);
        this.a.restore();
        if (zM0) {
            k0(k2, c0699b);
        }
        R0();
    }

    private void K(g.C0721y c0721y, String str) {
        g.N nP = c0721y.a.p(str);
        if (nP == null) {
            Z0("Pattern reference '%s' not found", str);
            return;
        }
        if (!(nP instanceof g.C0721y)) {
            F("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (nP == c0721y) {
            F("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        g.C0721y c0721y2 = (g.C0721y) nP;
        if (c0721y.q == null) {
            c0721y.q = c0721y2.q;
        }
        if (c0721y.r == null) {
            c0721y.r = c0721y2.r;
        }
        if (c0721y.s == null) {
            c0721y.s = c0721y2.s;
        }
        if (c0721y.t == null) {
            c0721y.t = c0721y2.t;
        }
        if (c0721y.u == null) {
            c0721y.u = c0721y2.u;
        }
        if (c0721y.v == null) {
            c0721y.v = c0721y2.v;
        }
        if (c0721y.w == null) {
            c0721y.w = c0721y2.w;
        }
        if (c0721y.i.isEmpty()) {
            c0721y.i = c0721y2.i;
        }
        if (c0721y.p == null) {
            c0721y.p = c0721y2.p;
        }
        if (c0721y.o == null) {
            c0721y.o = c0721y2.o;
        }
        String str2 = c0721y2.x;
        if (str2 != null) {
            K(c0721y, str2);
        }
    }

    private void K0(g.S s) {
        Set<String> setA;
        String language = Locale.getDefault().getLanguage();
        o2.g.k();
        for (g.N n : s.getChildren()) {
            if (n instanceof g.G) {
                g.G g2 = (g.G) n;
                if (g2.c() == null && ((setA = g2.a()) == null || (!setA.isEmpty() && setA.contains(language)))) {
                    Set<String> setG = g2.g();
                    if (setG != null) {
                        if (i == null) {
                            V();
                        }
                        if (setG.isEmpty() || !i.containsAll(setG)) {
                        }
                    }
                    Set<String> setL = g2.l();
                    if (setL != null) {
                        setL.isEmpty();
                    } else {
                        Set<String> setM = g2.m();
                        if (setM == null) {
                            A0(n);
                            return;
                        }
                        setM.isEmpty();
                    }
                }
            }
        }
    }

    private void L(o2.g.K r20, android.graphics.Path r21, o2.g.C0721y r22) {
        throw new UnsupportedOperationException("Method not decompiled: o2.h.L(o2.g$K, android.graphics.Path, o2.g$y):void");
    }

    private void L0(g.Z z) {
        y("TextPath render", new Object[0]);
        W0(this.d, z);
        if (A() && Y0()) {
            g.N nP = z.a.p(z.o);
            if (nP == null) {
                F("TextPath reference '%s' not found", z.o);
                return;
            }
            g.C0718v c0718v = (g.C0718v) nP;
            Path pathF = new d(c0718v.o).f();
            Matrix matrix = c0718v.n;
            if (matrix != null) {
                pathF.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(pathF, false);
            g.C0712p c0712p = z.p;
            float fD = c0712p != null ? c0712p.d(this, pathMeasure.getLength()) : 0.0f;
            g.E.f fVarO = O();
            if (fVarO != g.E.f.Start) {
                float fN = n(z);
                if (fVarO == g.E.f.Middle) {
                    fN /= 2.0f;
                }
                fD -= fN;
            }
            r((g.K) z.e());
            boolean zM0 = m0();
            E(z, new e(pathF, fD, 0.0f));
            if (zM0) {
                j0(z);
            }
        }
    }

    private C0260h M(g.N n) {
        C0260h c0260h = new C0260h();
        V0(c0260h, g.E.a());
        return N(n, c0260h);
    }

    private boolean M0() {
        return this.d.a.F.floatValue() < 1.0f || this.d.a.Z != null;
    }

    private C0260h N(g.N n, C0260h c0260h) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (n instanceof g.L) {
                arrayList.add(0, (g.L) n);
            }
            Object obj = n.b;
            if (obj == null) {
                break;
            }
            n = (g.N) obj;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            W0(c0260h, (g.L) it.next());
        }
        C0260h c0260h2 = this.d;
        c0260h.g = c0260h2.g;
        c0260h.f = c0260h2.f;
        return c0260h;
    }

    private void N0() {
        this.d = new C0260h();
        this.e = new Stack<>();
        V0(this.d, g.E.a());
        C0260h c0260h = this.d;
        c0260h.f = null;
        c0260h.h = false;
        this.e.push(new C0260h(c0260h));
        this.g = new Stack<>();
        this.f = new Stack<>();
    }

    private g.E.f O() {
        g.E.f fVar;
        g.E e2 = this.d.a;
        if (e2.M == g.E.h.LTR || (fVar = e2.N) == g.E.f.Middle) {
            return e2.N;
        }
        g.E.f fVar2 = g.E.f.Start;
        return fVar == fVar2 ? g.E.f.End : fVar2;
    }

    private void O0(float f2, float f3, float f4, float f5) {
        float fE = f4 + f2;
        float fG = f5 + f3;
        g.C0700c c0700c = this.d.a.P;
        if (c0700c != null) {
            f2 += c0700c.d.e(this);
            f3 += this.d.a.P.a.g(this);
            fE -= this.d.a.P.b.e(this);
            fG -= this.d.a.P.c.g(this);
        }
        this.a.clipRect(f2, f3, fE, fG);
    }

    private Path.FillType P() {
        g.E.a aVar = this.d.a.Y;
        return (aVar == null || aVar != g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void P0(C0260h c0260h, boolean z, g.O o) {
        int i2;
        g.E e2 = c0260h.a;
        float fFloatValue = (z ? e2.v : e2.y).floatValue();
        if (o instanceof g.C0703f) {
            i2 = ((g.C0703f) o).d;
        } else if (!(o instanceof g.C0259g)) {
            return;
        } else {
            i2 = c0260h.a.G.d;
        }
        int iX = x(i2, fFloatValue);
        if (z) {
            c0260h.d.setColor(iX);
        } else {
            c0260h.e.setColor(iX);
        }
    }

    private void Q0(boolean z, g.C c3) {
        if (z) {
            if (W(c3.e, 2147483648L)) {
                C0260h c0260h = this.d;
                g.E e2 = c0260h.a;
                g.O o = c3.e.a0;
                e2.e = o;
                c0260h.b = o != null;
            }
            if (W(c3.e, 4294967296L)) {
                this.d.a.v = c3.e.b0;
            }
            if (W(c3.e, 6442450944L)) {
                C0260h c0260h2 = this.d;
                P0(c0260h2, z, c0260h2.a.e);
                return;
            }
            return;
        }
        if (W(c3.e, 2147483648L)) {
            C0260h c0260h3 = this.d;
            g.E e3 = c0260h3.a;
            g.O o3 = c3.e.a0;
            e3.w = o3;
            c0260h3.c = o3 != null;
        }
        if (W(c3.e, 4294967296L)) {
            this.d.a.y = c3.e.b0;
        }
        if (W(c3.e, 6442450944L)) {
            C0260h c0260h4 = this.d;
            P0(c0260h4, z, c0260h4.a.w);
        }
    }

    private void R0() {
        this.a.restore();
        this.d = this.e.pop();
    }

    private void S0() {
        this.a.save();
        this.e.push(this.d);
        this.d = new C0260h(this.d);
    }

    private String T0(String str, boolean z, boolean z2) {
        if (this.d.h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    private Path.FillType U() {
        g.E.a aVar = this.d.a.i;
        return (aVar == null || aVar != g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void U0(g.K k2) {
        if (k2.b == null || k2.h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.g.peek().invert(matrix)) {
            g.C0699b c0699b = k2.h;
            float f2 = c0699b.a;
            float f3 = c0699b.b;
            float fB = c0699b.b();
            g.C0699b c0699b2 = k2.h;
            float f4 = c0699b2.b;
            float fB2 = c0699b2.b();
            float fC = k2.h.c();
            g.C0699b c0699b3 = k2.h;
            float[] fArr = {f2, f3, fB, f4, fB2, fC, c0699b3.a, c0699b3.c()};
            matrix.preConcat(this.a.getMatrix());
            matrix.mapPoints(fArr);
            float f5 = fArr[0];
            float f6 = fArr[1];
            RectF rectF = new RectF(f5, f6, f5, f6);
            for (int i2 = 2; i2 <= 6; i2 += 2) {
                float f7 = fArr[i2];
                if (f7 < rectF.left) {
                    rectF.left = f7;
                }
                if (f7 > rectF.right) {
                    rectF.right = f7;
                }
                float f10 = fArr[i2 + 1];
                if (f10 < rectF.top) {
                    rectF.top = f10;
                }
                if (f10 > rectF.bottom) {
                    rectF.bottom = f10;
                }
            }
            g.K k3 = (g.K) this.f.peek();
            g.C0699b c0699b4 = k3.h;
            if (c0699b4 == null) {
                k3.h = g.C0699b.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                c0699b4.e(g.C0699b.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    private static synchronized void V() {
        HashSet<String> hashSet = new HashSet<>();
        i = hashSet;
        hashSet.add("Structure");
        i.add("BasicStructure");
        i.add("ConditionalProcessing");
        i.add("Image");
        i.add("Style");
        i.add("ViewportAttribute");
        i.add("Shape");
        i.add("BasicText");
        i.add("PaintAttribute");
        i.add("BasicPaintAttribute");
        i.add("OpacityAttribute");
        i.add("BasicGraphicsAttribute");
        i.add("Marker");
        i.add("Gradient");
        i.add("Pattern");
        i.add("Clip");
        i.add("BasicClip");
        i.add("Mask");
        i.add("View");
    }

    private void V0(C0260h c0260h, g.E e2) {
        if (W(e2, 4096L)) {
            c0260h.a.G = e2.G;
        }
        if (W(e2, 2048L)) {
            c0260h.a.F = e2.F;
        }
        if (W(e2, 1L)) {
            c0260h.a.e = e2.e;
            g.O o = e2.e;
            c0260h.b = (o == null || o == g.C0703f.i) ? false : true;
        }
        if (W(e2, 4L)) {
            c0260h.a.v = e2.v;
        }
        if (W(e2, 6149L)) {
            P0(c0260h, true, c0260h.a.e);
        }
        if (W(e2, 2L)) {
            c0260h.a.i = e2.i;
        }
        if (W(e2, 8L)) {
            c0260h.a.w = e2.w;
            g.O o3 = e2.w;
            c0260h.c = (o3 == null || o3 == g.C0703f.i) ? false : true;
        }
        if (W(e2, 16L)) {
            c0260h.a.y = e2.y;
        }
        if (W(e2, 6168L)) {
            P0(c0260h, false, c0260h.a.w);
        }
        if (W(e2, 34359738368L)) {
            c0260h.a.e0 = e2.e0;
        }
        if (W(e2, 32L)) {
            g.E e3 = c0260h.a;
            g.C0712p c0712p = e2.z;
            e3.z = c0712p;
            c0260h.e.setStrokeWidth(c0712p.c(this));
        }
        if (W(e2, 64L)) {
            c0260h.a.A = e2.A;
            int i2 = a.b[e2.A.ordinal()];
            if (i2 == 1) {
                c0260h.e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i2 == 2) {
                c0260h.e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i2 == 3) {
                c0260h.e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (W(e2, 128L)) {
            c0260h.a.B = e2.B;
            int i3 = a.c[e2.B.ordinal()];
            if (i3 == 1) {
                c0260h.e.setStrokeJoin(Paint.Join.MITER);
            } else if (i3 == 2) {
                c0260h.e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i3 == 3) {
                c0260h.e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (W(e2, 256L)) {
            c0260h.a.C = e2.C;
            c0260h.e.setStrokeMiter(e2.C.floatValue());
        }
        if (W(e2, 512L)) {
            c0260h.a.D = e2.D;
        }
        if (W(e2, 1024L)) {
            c0260h.a.E = e2.E;
        }
        Typeface typefaceT = null;
        if (W(e2, 1536L)) {
            g.C0712p[] c0712pArr = c0260h.a.D;
            if (c0712pArr == null) {
                c0260h.e.setPathEffect(null);
            } else {
                int length = c0712pArr.length;
                int i4 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i4];
                float f2 = 0.0f;
                for (int i5 = 0; i5 < i4; i5++) {
                    float fC = c0260h.a.D[i5 % length].c(this);
                    fArr[i5] = fC;
                    f2 += fC;
                }
                if (f2 == 0.0f) {
                    c0260h.e.setPathEffect(null);
                } else {
                    float fC2 = c0260h.a.E.c(this);
                    if (fC2 < 0.0f) {
                        fC2 = (fC2 % f2) + f2;
                    }
                    c0260h.e.setPathEffect(new DashPathEffect(fArr, fC2));
                }
            }
        }
        if (W(e2, 16384L)) {
            float fQ = Q();
            c0260h.a.I = e2.I;
            c0260h.d.setTextSize(e2.I.d(this, fQ));
            c0260h.e.setTextSize(e2.I.d(this, fQ));
        }
        if (W(e2, 8192L)) {
            c0260h.a.H = e2.H;
        }
        if (W(e2, 32768L)) {
            if (e2.J.intValue() == -1 && c0260h.a.J.intValue() > 100) {
                g.E e4 = c0260h.a;
                e4.J = Integer.valueOf(e4.J.intValue() - 100);
            } else if (e2.J.intValue() != 1 || c0260h.a.J.intValue() >= 900) {
                c0260h.a.J = e2.J;
            } else {
                g.E e5 = c0260h.a;
                e5.J = Integer.valueOf(e5.J.intValue() + 100);
            }
        }
        if (W(e2, 65536L)) {
            c0260h.a.K = e2.K;
        }
        if (W(e2, 106496L)) {
            if (c0260h.a.H != null && this.c != null) {
                o2.g.k();
                for (String str : c0260h.a.H) {
                    g.E e6 = c0260h.a;
                    typefaceT = t(str, e6.J, e6.K);
                    if (typefaceT != null) {
                        break;
                    }
                }
            }
            if (typefaceT == null) {
                g.E e7 = c0260h.a;
                typefaceT = t("serif", e7.J, e7.K);
            }
            c0260h.d.setTypeface(typefaceT);
            c0260h.e.setTypeface(typefaceT);
        }
        if (W(e2, 131072L)) {
            c0260h.a.L = e2.L;
            Paint paint = c0260h.d;
            g.E.EnumC0258g enumC0258g = e2.L;
            g.E.EnumC0258g enumC0258g2 = g.E.EnumC0258g.LineThrough;
            paint.setStrikeThruText(enumC0258g == enumC0258g2);
            Paint paint2 = c0260h.d;
            g.E.EnumC0258g enumC0258g3 = e2.L;
            g.E.EnumC0258g enumC0258g4 = g.E.EnumC0258g.Underline;
            paint2.setUnderlineText(enumC0258g3 == enumC0258g4);
            c0260h.e.setStrikeThruText(e2.L == enumC0258g2);
            c0260h.e.setUnderlineText(e2.L == enumC0258g4);
        }
        if (W(e2, 68719476736L)) {
            c0260h.a.M = e2.M;
        }
        if (W(e2, 262144L)) {
            c0260h.a.N = e2.N;
        }
        if (W(e2, 524288L)) {
            c0260h.a.O = e2.O;
        }
        if (W(e2, 2097152L)) {
            c0260h.a.Q = e2.Q;
        }
        if (W(e2, 4194304L)) {
            c0260h.a.R = e2.R;
        }
        if (W(e2, 8388608L)) {
            c0260h.a.S = e2.S;
        }
        if (W(e2, 16777216L)) {
            c0260h.a.T = e2.T;
        }
        if (W(e2, 33554432L)) {
            c0260h.a.U = e2.U;
        }
        if (W(e2, 1048576L)) {
            c0260h.a.P = e2.P;
        }
        if (W(e2, 268435456L)) {
            c0260h.a.X = e2.X;
        }
        if (W(e2, 536870912L)) {
            c0260h.a.Y = e2.Y;
        }
        if (W(e2, 1073741824L)) {
            c0260h.a.Z = e2.Z;
        }
        if (W(e2, 67108864L)) {
            c0260h.a.V = e2.V;
        }
        if (W(e2, 134217728L)) {
            c0260h.a.W = e2.W;
        }
        if (W(e2, 8589934592L)) {
            c0260h.a.c0 = e2.c0;
        }
        if (W(e2, 17179869184L)) {
            c0260h.a.d0 = e2.d0;
        }
        if (W(e2, 137438953472L)) {
            c0260h.a.f0 = e2.f0;
        }
    }

    private boolean W(g.E e2, long j2) {
        return (e2.d & j2) != 0;
    }

    private void W0(C0260h c0260h, g.L l) {
        c0260h.a.b(l.b == null);
        g.E e2 = l.e;
        if (e2 != null) {
            V0(c0260h, e2);
        }
        if (this.c.n()) {
            for (b.p pVar : this.c.d()) {
                if (o2.b.l(this.h, pVar.a, l)) {
                    V0(c0260h, pVar.b);
                }
            }
        }
        g.E e3 = l.f;
        if (e3 != null) {
            V0(c0260h, e3);
        }
    }

    private void X(boolean z, g.C0699b c0699b, g.M m) {
        float f2;
        float fD;
        float f3;
        float f4;
        String str = m.l;
        if (str != null) {
            H(m, str);
        }
        Boolean bool = m.i;
        int i2 = 0;
        boolean z2 = bool != null && bool.booleanValue();
        C0260h c0260h = this.d;
        Paint paint = z ? c0260h.d : c0260h.e;
        if (z2) {
            g.C0699b c0699bS = S();
            g.C0712p c0712p = m.m;
            float fE = c0712p != null ? c0712p.e(this) : 0.0f;
            g.C0712p c0712p2 = m.n;
            float fG = c0712p2 != null ? c0712p2.g(this) : 0.0f;
            g.C0712p c0712p3 = m.o;
            float fE2 = c0712p3 != null ? c0712p3.e(this) : c0699bS.c;
            g.C0712p c0712p4 = m.p;
            f4 = fE2;
            f2 = fE;
            f3 = fG;
            fD = c0712p4 != null ? c0712p4.g(this) : 0.0f;
        } else {
            g.C0712p c0712p5 = m.m;
            float fD2 = c0712p5 != null ? c0712p5.d(this, 1.0f) : 0.0f;
            g.C0712p c0712p6 = m.n;
            float fD3 = c0712p6 != null ? c0712p6.d(this, 1.0f) : 0.0f;
            g.C0712p c0712p7 = m.o;
            float fD4 = c0712p7 != null ? c0712p7.d(this, 1.0f) : 1.0f;
            g.C0712p c0712p8 = m.p;
            f2 = fD2;
            fD = c0712p8 != null ? c0712p8.d(this, 1.0f) : 0.0f;
            f3 = fD3;
            f4 = fD4;
        }
        S0();
        this.d = M(m);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(c0699b.a, c0699b.b);
            matrix.preScale(c0699b.c, c0699b.d);
        }
        Matrix matrix2 = m.j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = m.h.size();
        if (size == 0) {
            R0();
            if (z) {
                this.d.b = false;
                return;
            } else {
                this.d.c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<g.N> it = m.h.iterator();
        float f5 = -1.0f;
        while (it.hasNext()) {
            g.D d2 = (g.D) it.next();
            Float f6 = d2.h;
            float fFloatValue = f6 != null ? f6.floatValue() : 0.0f;
            if (i2 == 0 || fFloatValue >= f5) {
                fArr[i2] = fFloatValue;
                f5 = fFloatValue;
            } else {
                fArr[i2] = f5;
            }
            S0();
            W0(this.d, d2);
            g.E e2 = this.d.a;
            g.C0703f c0703f = (g.C0703f) e2.V;
            if (c0703f == null) {
                c0703f = g.C0703f.e;
            }
            iArr[i2] = x(c0703f.d, e2.W.floatValue());
            i2++;
            R0();
        }
        if ((f2 == f4 && f3 == fD) || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        g.EnumC0707k enumC0707k = m.k;
        if (enumC0707k != null) {
            if (enumC0707k == g.EnumC0707k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (enumC0707k == g.EnumC0707k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        LinearGradient linearGradient = new LinearGradient(f2, f3, f4, fD, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(w(this.d.a.v.floatValue()));
    }

    private void X0() {
        int iX;
        g.E e2 = this.d.a;
        g.O o = e2.c0;
        if (o instanceof g.C0703f) {
            iX = ((g.C0703f) o).d;
        } else if (!(o instanceof g.C0259g)) {
            return;
        } else {
            iX = e2.G.d;
        }
        Float f2 = e2.d0;
        if (f2 != null) {
            iX = x(iX, f2.floatValue());
        }
        this.a.drawColor(iX);
    }

    private Path Y(g.C0701d c0701d) {
        g.C0712p c0712p = c0701d.o;
        float fE = c0712p != null ? c0712p.e(this) : 0.0f;
        g.C0712p c0712p2 = c0701d.p;
        float fG = c0712p2 != null ? c0712p2.g(this) : 0.0f;
        float fC = c0701d.q.c(this);
        float f2 = fE - fC;
        float f3 = fG - fC;
        float f4 = fE + fC;
        float f5 = fG + fC;
        if (c0701d.h == null) {
            float f6 = 2.0f * fC;
            c0701d.h = new g.C0699b(f2, f3, f6, f6);
        }
        float f7 = 0.5522848f * fC;
        Path path = new Path();
        path.moveTo(fE, f3);
        float f10 = fE + f7;
        float f11 = fG - f7;
        path.cubicTo(f10, f3, f4, f11, f4, fG);
        float f12 = fG + f7;
        path.cubicTo(f4, f12, f10, f5, fE, f5);
        float f13 = fE - f7;
        path.cubicTo(f13, f5, f2, f12, f2, fG);
        path.cubicTo(f2, f11, f13, f3, fE, f3);
        path.close();
        return path;
    }

    public boolean Y0() {
        Boolean bool = this.d.a.U;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private Path Z(g.C0705i c0705i) {
        g.C0712p c0712p = c0705i.o;
        float fE = c0712p != null ? c0712p.e(this) : 0.0f;
        g.C0712p c0712p2 = c0705i.p;
        float fG = c0712p2 != null ? c0712p2.g(this) : 0.0f;
        float fE2 = c0705i.q.e(this);
        float fG2 = c0705i.r.g(this);
        float f2 = fE - fE2;
        float f3 = fG - fG2;
        float f4 = fE + fE2;
        float f5 = fG + fG2;
        if (c0705i.h == null) {
            c0705i.h = new g.C0699b(f2, f3, fE2 * 2.0f, 2.0f * fG2);
        }
        float f6 = fE2 * 0.5522848f;
        float f7 = 0.5522848f * fG2;
        Path path = new Path();
        path.moveTo(fE, f3);
        float f10 = fE + f6;
        float f11 = fG - f7;
        path.cubicTo(f10, f3, f4, f11, f4, fG);
        float f12 = f7 + fG;
        path.cubicTo(f4, f12, f10, f5, fE, f5);
        float f13 = fE - f6;
        path.cubicTo(f13, f5, f2, f12, f2, fG);
        path.cubicTo(f2, f11, f13, f3, fE, f3);
        path.close();
        return path;
    }

    public static void Z0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    private Path a0(g.C0713q c0713q) {
        g.C0712p c0712p = c0713q.o;
        float fE = c0712p == null ? 0.0f : c0712p.e(this);
        g.C0712p c0712p2 = c0713q.p;
        float fG = c0712p2 == null ? 0.0f : c0712p2.g(this);
        g.C0712p c0712p3 = c0713q.q;
        float fE2 = c0712p3 == null ? 0.0f : c0712p3.e(this);
        g.C0712p c0712p4 = c0713q.r;
        float fG2 = c0712p4 != null ? c0712p4.g(this) : 0.0f;
        if (c0713q.h == null) {
            c0713q.h = new g.C0699b(Math.min(fE, fE2), Math.min(fG, fG2), Math.abs(fE2 - fE), Math.abs(fG2 - fG));
        }
        Path path = new Path();
        path.moveTo(fE, fG);
        path.lineTo(fE2, fG2);
        return path;
    }

    private Path b0(g.C0722z c0722z) {
        Path path = new Path();
        float[] fArr = c0722z.o;
        path.moveTo(fArr[0], fArr[1]);
        int i2 = 2;
        while (true) {
            float[] fArr2 = c0722z.o;
            if (i2 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i2], fArr2[i2 + 1]);
            i2 += 2;
        }
        if (c0722z instanceof g.A) {
            path.close();
        }
        if (c0722z.h == null) {
            c0722z.h = m(path);
        }
        return path;
    }

    private android.graphics.Path c0(o2.g.B r24) {
        throw new UnsupportedOperationException("Method not decompiled: o2.h.c0(o2.g$B):android.graphics.Path");
    }

    private Path d0(g.W w) {
        List<g.C0712p> list = w.o;
        float fG = 0.0f;
        float fE = (list == null || list.size() == 0) ? 0.0f : w.o.get(0).e(this);
        List<g.C0712p> list2 = w.p;
        float fG2 = (list2 == null || list2.size() == 0) ? 0.0f : w.p.get(0).g(this);
        List<g.C0712p> list3 = w.q;
        float fE2 = (list3 == null || list3.size() == 0) ? 0.0f : w.q.get(0).e(this);
        List<g.C0712p> list4 = w.r;
        if (list4 != null && list4.size() != 0) {
            fG = w.r.get(0).g(this);
        }
        if (this.d.a.N != g.E.f.Start) {
            float fN = n(w);
            if (this.d.a.N == g.E.f.Middle) {
                fN /= 2.0f;
            }
            fE -= fN;
        }
        if (w.h == null) {
            i iVar = new i(fE, fG2);
            E(w, iVar);
            RectF rectF = iVar.d;
            w.h = new g.C0699b(rectF.left, rectF.top, rectF.width(), iVar.d.height());
        }
        Path path = new Path();
        E(w, new g(fE + fE2, fG2 + fG, path));
        return path;
    }

    private void e0(boolean z, g.C0699b c0699b, g.Q q) {
        float f2;
        float fD;
        float f3;
        String str = q.l;
        if (str != null) {
            H(q, str);
        }
        Boolean bool = q.i;
        int i2 = 0;
        boolean z2 = bool != null && bool.booleanValue();
        C0260h c0260h = this.d;
        Paint paint = z ? c0260h.d : c0260h.e;
        if (z2) {
            g.C0712p c0712p = new g.C0712p(50.0f, g.d0.percent);
            g.C0712p c0712p2 = q.m;
            float fE = c0712p2 != null ? c0712p2.e(this) : c0712p.e(this);
            g.C0712p c0712p3 = q.n;
            float fG = c0712p3 != null ? c0712p3.g(this) : c0712p.g(this);
            g.C0712p c0712p4 = q.o;
            fD = c0712p4 != null ? c0712p4.c(this) : c0712p.c(this);
            f2 = fE;
            f3 = fG;
        } else {
            g.C0712p c0712p5 = q.m;
            float fD2 = c0712p5 != null ? c0712p5.d(this, 1.0f) : 0.5f;
            g.C0712p c0712p6 = q.n;
            float fD3 = c0712p6 != null ? c0712p6.d(this, 1.0f) : 0.5f;
            g.C0712p c0712p7 = q.o;
            f2 = fD2;
            fD = c0712p7 != null ? c0712p7.d(this, 1.0f) : 0.5f;
            f3 = fD3;
        }
        S0();
        this.d = M(q);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(c0699b.a, c0699b.b);
            matrix.preScale(c0699b.c, c0699b.d);
        }
        Matrix matrix2 = q.j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = q.h.size();
        if (size == 0) {
            R0();
            if (z) {
                this.d.b = false;
                return;
            } else {
                this.d.c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<g.N> it = q.h.iterator();
        float f4 = -1.0f;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            g.D d2 = (g.D) it.next();
            Float f5 = d2.h;
            float fFloatValue = f5 != null ? f5.floatValue() : 0.0f;
            if (i2 == 0 || fFloatValue >= f4) {
                fArr[i2] = fFloatValue;
                f4 = fFloatValue;
            } else {
                fArr[i2] = f4;
            }
            S0();
            W0(this.d, d2);
            g.E e2 = this.d.a;
            g.C0703f c0703f = (g.C0703f) e2.V;
            if (c0703f == null) {
                c0703f = g.C0703f.e;
            }
            iArr[i2] = x(c0703f.d, e2.W.floatValue());
            i2++;
            R0();
        }
        if (fD == 0.0f || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        g.EnumC0707k enumC0707k = q.k;
        if (enumC0707k != null) {
            if (enumC0707k == g.EnumC0707k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (enumC0707k == g.EnumC0707k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        RadialGradient radialGradient = new RadialGradient(f2, f3, fD, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(w(this.d.a.v.floatValue()));
    }

    private g.C0699b f0(g.C0712p c0712p, g.C0712p c0712p2, g.C0712p c0712p3, g.C0712p c0712p4) {
        float fE = c0712p != null ? c0712p.e(this) : 0.0f;
        float fG = c0712p2 != null ? c0712p2.g(this) : 0.0f;
        g.C0699b c0699bS = S();
        return new g.C0699b(fE, fG, c0712p3 != null ? c0712p3.e(this) : c0699bS.c, c0712p4 != null ? c0712p4.g(this) : c0699bS.d);
    }

    @TargetApi(19)
    private Path g0(g.K k2, boolean z) {
        Path pathD0;
        Path pathJ;
        this.e.push(this.d);
        C0260h c0260h = new C0260h(this.d);
        this.d = c0260h;
        W0(c0260h, k2);
        if (!A() || !Y0()) {
            this.d = this.e.pop();
            return null;
        }
        if (k2 instanceof g.e0) {
            if (!z) {
                F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            g.e0 e0Var = (g.e0) k2;
            g.N nP = k2.a.p(e0Var.p);
            if (nP == null) {
                F("Use reference '%s' not found", e0Var.p);
                this.d = this.e.pop();
                return null;
            }
            if (!(nP instanceof g.K)) {
                this.d = this.e.pop();
                return null;
            }
            pathD0 = g0((g.K) nP, false);
            if (pathD0 == null) {
                return null;
            }
            if (e0Var.h == null) {
                e0Var.h = m(pathD0);
            }
            Matrix matrix = e0Var.o;
            if (matrix != null) {
                pathD0.transform(matrix);
            }
        } else if (k2 instanceof g.AbstractC0708l) {
            g.AbstractC0708l abstractC0708l = (g.AbstractC0708l) k2;
            if (k2 instanceof g.C0718v) {
                pathD0 = new d(((g.C0718v) k2).o).f();
                if (k2.h == null) {
                    k2.h = m(pathD0);
                }
            } else {
                pathD0 = k2 instanceof g.B ? c0((g.B) k2) : k2 instanceof g.C0701d ? Y((g.C0701d) k2) : k2 instanceof g.C0705i ? Z((g.C0705i) k2) : k2 instanceof g.C0722z ? b0((g.C0722z) k2) : null;
            }
            if (pathD0 == null) {
                return null;
            }
            if (abstractC0708l.h == null) {
                abstractC0708l.h = m(pathD0);
            }
            Matrix matrix2 = abstractC0708l.n;
            if (matrix2 != null) {
                pathD0.transform(matrix2);
            }
            pathD0.setFillType(P());
        } else {
            if (!(k2 instanceof g.W)) {
                F("Invalid %s element found in clipPath definition", k2.n());
                return null;
            }
            g.W w = (g.W) k2;
            pathD0 = d0(w);
            if (pathD0 == null) {
                return null;
            }
            Matrix matrix3 = w.s;
            if (matrix3 != null) {
                pathD0.transform(matrix3);
            }
            pathD0.setFillType(P());
        }
        if (this.d.a.X != null && (pathJ = j(k2, k2.h)) != null) {
            pathD0.op(pathJ, Path.Op.INTERSECT);
        }
        this.d = this.e.pop();
        return pathD0;
    }

    public static void h(float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2, float f7, float f10, g.InterfaceC0720x interfaceC0720x) {
        float f11;
        g.InterfaceC0720x interfaceC0720x2;
        if (f2 == f7 && f3 == f10) {
            return;
        }
        if (f4 == 0.0f) {
            f11 = f7;
            interfaceC0720x2 = interfaceC0720x;
        } else {
            if (f5 != 0.0f) {
                float fAbs = Math.abs(f4);
                float fAbs2 = Math.abs(f5);
                double radians = Math.toRadians(f6 % 360.0d);
                double dCos = Math.cos(radians);
                double dSin = Math.sin(radians);
                double d2 = (f2 - f7) / 2.0d;
                double d3 = (f3 - f10) / 2.0d;
                double d4 = (dCos * d2) + (dSin * d3);
                double d5 = ((-dSin) * d2) + (d3 * dCos);
                double d6 = fAbs * fAbs;
                double d7 = fAbs2 * fAbs2;
                double d8 = d4 * d4;
                double d10 = d5 * d5;
                double d11 = (d8 / d6) + (d10 / d7);
                if (d11 > 0.99999d) {
                    double dSqrt = Math.sqrt(d11) * 1.00001d;
                    fAbs = (float) (fAbs * dSqrt);
                    fAbs2 = (float) (dSqrt * fAbs2);
                    d6 = fAbs * fAbs;
                    d7 = fAbs2 * fAbs2;
                }
                double d12 = z == z2 ? -1.0d : 1.0d;
                double d13 = d6 * d7;
                double d14 = d6 * d10;
                double d15 = d7 * d8;
                double d16 = ((d13 - d14) - d15) / (d14 + d15);
                if (d16 < 0.0d) {
                    d16 = 0.0d;
                }
                double dSqrt2 = d12 * Math.sqrt(d16);
                double d17 = fAbs;
                double d18 = fAbs2;
                double d19 = ((d17 * d5) / d18) * dSqrt2;
                float f12 = fAbs;
                float f13 = fAbs2;
                double d20 = dSqrt2 * (-((d18 * d4) / d17));
                double d21 = ((f2 + f7) / 2.0d) + ((dCos * d19) - (dSin * d20));
                double d22 = ((f3 + f10) / 2.0d) + (dSin * d19) + (dCos * d20);
                double d23 = (d4 - d19) / d17;
                double d24 = (d5 - d20) / d18;
                double d25 = ((-d4) - d19) / d17;
                double d26 = ((-d5) - d20) / d18;
                double d27 = (d23 * d23) + (d24 * d24);
                double dAcos = (d24 < 0.0d ? -1.0d : 1.0d) * Math.acos(d23 / Math.sqrt(d27));
                double dV = ((d23 * d26) - (d24 * d25) < 0.0d ? -1.0d : 1.0d) * v(((d23 * d25) + (d24 * d26)) / Math.sqrt(d27 * ((d25 * d25) + (d26 * d26))));
                if (!z2 && dV > 0.0d) {
                    dV -= 6.283185307179586d;
                } else if (z2 && dV < 0.0d) {
                    dV += 6.283185307179586d;
                }
                float[] fArrI = i(dAcos % 6.283185307179586d, dV % 6.283185307179586d);
                Matrix matrix = new Matrix();
                matrix.postScale(f12, f13);
                matrix.postRotate(f6);
                matrix.postTranslate((float) d21, (float) d22);
                matrix.mapPoints(fArrI);
                fArrI[fArrI.length - 2] = f7;
                fArrI[fArrI.length - 1] = f10;
                for (int i2 = 0; i2 < fArrI.length; i2 += 6) {
                    interfaceC0720x.c(fArrI[i2], fArrI[i2 + 1], fArrI[i2 + 2], fArrI[i2 + 3], fArrI[i2 + 4], fArrI[i2 + 5]);
                }
                return;
            }
            interfaceC0720x2 = interfaceC0720x;
            f11 = f7;
        }
        interfaceC0720x2.e(f11, f10);
    }

    private void h0() {
        this.f.pop();
        this.g.pop();
    }

    private static float[] i(double d2, double d3) {
        int iCeil = (int) Math.ceil((Math.abs(d3) * 2.0d) / 3.141592653589793d);
        double d4 = d3 / iCeil;
        double d5 = d4 / 2.0d;
        double dSin = (Math.sin(d5) * 1.3333333333333333d) / (Math.cos(d5) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iCeil) {
            double d6 = d2 + (i2 * d4);
            double dCos = Math.cos(d6);
            double dSin2 = Math.sin(d6);
            double d7 = d4;
            fArr[i3] = (float) (dCos - (dSin * dSin2));
            fArr[i3 + 1] = (float) (dSin2 + (dCos * dSin));
            double d8 = d6 + d7;
            double dCos2 = Math.cos(d8);
            double dSin3 = Math.sin(d8);
            fArr[i3 + 2] = (float) ((dSin * dSin3) + dCos2);
            fArr[i3 + 3] = (float) (dSin3 - (dSin * dCos2));
            int i4 = i3 + 5;
            fArr[i3 + 4] = (float) dCos2;
            i3 += 6;
            fArr[i4] = (float) dSin3;
            i2++;
            d4 = d7;
        }
        return fArr;
    }

    private void i0(g.J j2) {
        this.f.push(j2);
        this.g.push(this.a.getMatrix());
    }

    @TargetApi(19)
    private Path j(g.K k2, g.C0699b c0699b) {
        Path pathG0;
        g.N nP = k2.a.p(this.d.a.X);
        if (nP == null) {
            F("ClipPath reference '%s' not found", this.d.a.X);
            return null;
        }
        g.C0702e c0702e = (g.C0702e) nP;
        this.e.push(this.d);
        this.d = M(c0702e);
        Boolean bool = c0702e.p;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(c0699b.a, c0699b.b);
            matrix.preScale(c0699b.c, c0699b.d);
        }
        Matrix matrix2 = c0702e.o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (g.N n : c0702e.i) {
            if ((n instanceof g.K) && (pathG0 = g0((g.K) n, true)) != null) {
                path.op(pathG0, Path.Op.UNION);
            }
        }
        if (this.d.a.X != null) {
            if (c0702e.h == null) {
                c0702e.h = m(path);
            }
            Path pathJ = j(c0702e, c0702e.h);
            if (pathJ != null) {
                path.op(pathJ, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.d = this.e.pop();
        return path;
    }

    private void j0(g.K k2) {
        k0(k2, k2.h);
    }

    private List<c> k(g.C0713q c0713q) {
        g.C0712p c0712p = c0713q.o;
        float fE = c0712p != null ? c0712p.e(this) : 0.0f;
        g.C0712p c0712p2 = c0713q.p;
        float fG = c0712p2 != null ? c0712p2.g(this) : 0.0f;
        g.C0712p c0712p3 = c0713q.q;
        float fE2 = c0712p3 != null ? c0712p3.e(this) : 0.0f;
        g.C0712p c0712p4 = c0713q.r;
        float fG2 = c0712p4 != null ? c0712p4.g(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f2 = fE2 - fE;
        float f3 = fG2 - fG;
        arrayList.add(new c(fE, fG, f2, f3));
        arrayList.add(new c(fE2, fG2, f2, f3));
        return arrayList;
    }

    private void k0(g.K k2, g.C0699b c0699b) {
        if (this.d.a.Z != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.a.saveLayer(null, paint2, 31);
            g.C0715s c0715s = (g.C0715s) this.c.p(this.d.a.Z);
            J0(c0715s, k2, c0699b);
            this.a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.a.saveLayer(null, paint3, 31);
            J0(c0715s, k2, c0699b);
            this.a.restore();
            this.a.restore();
        }
        R0();
    }

    private List<c> l(g.C0722z c0722z) {
        int length = c0722z.o.length;
        int i2 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = c0722z.o;
        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (i2 < length) {
            float[] fArr2 = c0722z.o;
            float f4 = fArr2[i2];
            float f5 = fArr2[i2 + 1];
            cVar.a(f4, f5);
            arrayList.add(cVar);
            i2 += 2;
            cVar = new c(f4, f5, f4 - cVar.a, f5 - cVar.b);
            f3 = f5;
            f2 = f4;
        }
        if (c0722z instanceof g.A) {
            float[] fArr3 = c0722z.o;
            float f6 = fArr3[0];
            if (f2 != f6) {
                float f7 = fArr3[1];
                if (f3 != f7) {
                    cVar.a(f6, f7);
                    arrayList.add(cVar);
                    c cVar2 = new c(f6, f7, f6 - cVar.a, f7 - cVar.b);
                    cVar2.b((c) arrayList.get(0));
                    arrayList.add(cVar2);
                    arrayList.set(0, cVar2);
                }
            }
        } else {
            arrayList.add(cVar);
        }
        return arrayList;
    }

    private void l0(g.N n, j jVar) {
        float f2;
        float fG;
        float fE;
        g.E.f fVarO;
        if (jVar.a((g.Y) n)) {
            if (n instanceof g.Z) {
                S0();
                L0((g.Z) n);
                R0();
                return;
            }
            if (!(n instanceof g.V)) {
                if (n instanceof g.U) {
                    S0();
                    g.U u = (g.U) n;
                    W0(this.d, u);
                    if (A()) {
                        r((g.K) u.e());
                        g.N nP = n.a.p(u.o);
                        if (nP == null || !(nP instanceof g.Y)) {
                            F("Tref reference '%s' not found", u.o);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            G((g.Y) nP, sb);
                            if (sb.length() > 0) {
                                jVar.b(sb.toString());
                            }
                        }
                    }
                    R0();
                    return;
                }
                return;
            }
            y("TSpan render", new Object[0]);
            S0();
            g.V v = (g.V) n;
            W0(this.d, v);
            if (A()) {
                List<g.C0712p> list = v.o;
                boolean z = list != null && list.size() > 0;
                boolean z2 = jVar instanceof f;
                float fG2 = 0.0f;
                if (z2) {
                    float fE2 = !z ? ((f) jVar).b : v.o.get(0).e(this);
                    List<g.C0712p> list2 = v.p;
                    fG = (list2 == null || list2.size() == 0) ? ((f) jVar).c : v.p.get(0).g(this);
                    List<g.C0712p> list3 = v.q;
                    fE = (list3 == null || list3.size() == 0) ? 0.0f : v.q.get(0).e(this);
                    List<g.C0712p> list4 = v.r;
                    if (list4 != null && list4.size() != 0) {
                        fG2 = v.r.get(0).g(this);
                    }
                    f2 = fG2;
                    fG2 = fE2;
                } else {
                    f2 = 0.0f;
                    fG = 0.0f;
                    fE = 0.0f;
                }
                if (z && (fVarO = O()) != g.E.f.Start) {
                    float fN = n(v);
                    if (fVarO == g.E.f.Middle) {
                        fN /= 2.0f;
                    }
                    fG2 -= fN;
                }
                r((g.K) v.e());
                if (z2) {
                    f fVar = (f) jVar;
                    fVar.b = fG2 + fE;
                    fVar.c = fG + f2;
                }
                boolean zM0 = m0();
                E(v, jVar);
                if (zM0) {
                    j0(v);
                }
            }
            R0();
        }
    }

    private g.C0699b m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new g.C0699b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private boolean m0() {
        g.N nP;
        if (!M0()) {
            return false;
        }
        this.a.saveLayerAlpha(null, w(this.d.a.F.floatValue()), 31);
        this.e.push(this.d);
        C0260h c0260h = new C0260h(this.d);
        this.d = c0260h;
        String str = c0260h.a.Z;
        if (str != null && ((nP = this.c.p(str)) == null || !(nP instanceof g.C0715s))) {
            F("Mask reference '%s' not found", this.d.a.Z);
            this.d.a.Z = null;
        }
        return true;
    }

    private float n(g.Y y) {
        k kVar = new k(this, null);
        E(y, kVar);
        return kVar.b;
    }

    private c n0(c cVar, c cVar2, c cVar3) {
        float fD = D(cVar2.c, cVar2.d, cVar2.a - cVar.a, cVar2.b - cVar.b);
        if (fD == 0.0f) {
            fD = D(cVar2.c, cVar2.d, cVar3.a - cVar2.a, cVar3.b - cVar2.b);
        }
        if (fD > 0.0f) {
            return cVar2;
        }
        if (fD == 0.0f && (cVar2.c > 0.0f || cVar2.d >= 0.0f)) {
            return cVar2;
        }
        cVar2.c = -cVar2.c;
        cVar2.d = -cVar2.d;
        return cVar2;
    }

    private android.graphics.Matrix o(o2.g.C0699b r10, o2.g.C0699b r11, o2.e r12) {
        throw new UnsupportedOperationException("Method not decompiled: o2.h.o(o2.g$b, o2.g$b, o2.e):android.graphics.Matrix");
    }

    private void o0(g.C0701d c0701d) {
        y("Circle render", new Object[0]);
        g.C0712p c0712p = c0701d.q;
        if (c0712p == null || c0712p.i()) {
            return;
        }
        W0(this.d, c0701d);
        if (A() && Y0()) {
            Matrix matrix = c0701d.n;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            Path pathY = Y(c0701d);
            U0(c0701d);
            r(c0701d);
            p(c0701d);
            boolean zM0 = m0();
            if (this.d.b) {
                B(c0701d, pathY);
            }
            if (this.d.c) {
                C(pathY);
            }
            if (zM0) {
                j0(c0701d);
            }
        }
    }

    private void p(g.K k2) {
        q(k2, k2.h);
    }

    private void p0(g.C0705i c0705i) {
        y("Ellipse render", new Object[0]);
        g.C0712p c0712p = c0705i.q;
        if (c0712p == null || c0705i.r == null || c0712p.i() || c0705i.r.i()) {
            return;
        }
        W0(this.d, c0705i);
        if (A() && Y0()) {
            Matrix matrix = c0705i.n;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            Path pathZ = Z(c0705i);
            U0(c0705i);
            r(c0705i);
            p(c0705i);
            boolean zM0 = m0();
            if (this.d.b) {
                B(c0705i, pathZ);
            }
            if (this.d.c) {
                C(pathZ);
            }
            if (zM0) {
                j0(c0705i);
            }
        }
    }

    private void q(g.K k2, g.C0699b c0699b) {
        Path pathJ;
        if (this.d.a.X == null || (pathJ = j(k2, c0699b)) == null) {
            return;
        }
        this.a.clipPath(pathJ);
    }

    private void q0(g.C0709m c0709m) {
        y("Group render", new Object[0]);
        W0(this.d, c0709m);
        if (A()) {
            Matrix matrix = c0709m.o;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            p(c0709m);
            boolean zM0 = m0();
            F0(c0709m, true);
            if (zM0) {
                j0(c0709m);
            }
            U0(c0709m);
        }
    }

    private void r(g.K k2) {
        g.O o = this.d.a.e;
        if (o instanceof g.C0717u) {
            z(true, k2.h, (g.C0717u) o);
        }
        g.O o3 = this.d.a.w;
        if (o3 instanceof g.C0717u) {
            z(false, k2.h, (g.C0717u) o3);
        }
    }

    private void r0(g.C0711o c0711o) {
        g.C0712p c0712p;
        String str;
        y("Image render", new Object[0]);
        g.C0712p c0712p2 = c0711o.s;
        if (c0712p2 == null || c0712p2.i() || (c0712p = c0711o.t) == null || c0712p.i() || (str = c0711o.p) == null) {
            return;
        }
        o2.e eVar = c0711o.o;
        if (eVar == null) {
            eVar = o2.e.e;
        }
        Bitmap bitmapS = s(str);
        if (bitmapS == null) {
            o2.g.k();
            return;
        }
        g.C0699b c0699b = new g.C0699b(0.0f, 0.0f, bitmapS.getWidth(), bitmapS.getHeight());
        W0(this.d, c0711o);
        if (A() && Y0()) {
            Matrix matrix = c0711o.u;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            g.C0712p c0712p3 = c0711o.q;
            float fE = c0712p3 != null ? c0712p3.e(this) : 0.0f;
            g.C0712p c0712p4 = c0711o.r;
            this.d.f = new g.C0699b(fE, c0712p4 != null ? c0712p4.g(this) : 0.0f, c0711o.s.e(this), c0711o.t.e(this));
            if (!this.d.a.O.booleanValue()) {
                g.C0699b c0699b2 = this.d.f;
                O0(c0699b2.a, c0699b2.b, c0699b2.c, c0699b2.d);
            }
            c0711o.h = this.d.f;
            U0(c0711o);
            p(c0711o);
            boolean zM0 = m0();
            X0();
            this.a.save();
            this.a.concat(o(this.d.f, c0699b, eVar));
            this.a.drawBitmap(bitmapS, 0.0f, 0.0f, new Paint(this.d.a.f0 != g.E.e.optimizeSpeed ? 2 : 0));
            this.a.restore();
            if (zM0) {
                j0(c0711o);
            }
        }
    }

    private Bitmap s(String str) {
        int iIndexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (iIndexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e2) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e2);
            return null;
        }
    }

    private void s0(g.C0713q c0713q) {
        y("Line render", new Object[0]);
        W0(this.d, c0713q);
        if (A() && Y0() && this.d.c) {
            Matrix matrix = c0713q.n;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            Path pathA0 = a0(c0713q);
            U0(c0713q);
            r(c0713q);
            p(c0713q);
            boolean zM0 = m0();
            C(pathA0);
            I0(c0713q);
            if (zM0) {
                j0(c0713q);
            }
        }
    }

    private android.graphics.Typeface t(java.lang.String r6, java.lang.Integer r7, o2.g.E.b r8) {
        throw new UnsupportedOperationException("Method not decompiled: o2.h.t(java.lang.String, java.lang.Integer, o2.g$E$b):android.graphics.Typeface");
    }

    private void t0(g.C0718v c0718v) {
        y("Path render", new Object[0]);
        if (c0718v.o == null) {
            return;
        }
        W0(this.d, c0718v);
        if (A() && Y0()) {
            C0260h c0260h = this.d;
            if (c0260h.c || c0260h.b) {
                Matrix matrix = c0718v.n;
                if (matrix != null) {
                    this.a.concat(matrix);
                }
                Path pathF = new d(c0718v.o).f();
                if (c0718v.h == null) {
                    c0718v.h = m(pathF);
                }
                U0(c0718v);
                r(c0718v);
                p(c0718v);
                boolean zM0 = m0();
                if (this.d.b) {
                    pathF.setFillType(U());
                    B(c0718v, pathF);
                }
                if (this.d.c) {
                    C(pathF);
                }
                I0(c0718v);
                if (zM0) {
                    j0(c0718v);
                }
            }
        }
    }

    private void u(g.N n) {
        Boolean bool;
        if ((n instanceof g.L) && (bool = ((g.L) n).d) != null) {
            this.d.h = bool.booleanValue();
        }
    }

    private void u0(g.C0722z c0722z) {
        y("PolyLine render", new Object[0]);
        W0(this.d, c0722z);
        if (A() && Y0()) {
            C0260h c0260h = this.d;
            if (c0260h.c || c0260h.b) {
                Matrix matrix = c0722z.n;
                if (matrix != null) {
                    this.a.concat(matrix);
                }
                if (c0722z.o.length < 2) {
                    return;
                }
                Path pathB0 = b0(c0722z);
                U0(c0722z);
                pathB0.setFillType(U());
                r(c0722z);
                p(c0722z);
                boolean zM0 = m0();
                if (this.d.b) {
                    B(c0722z, pathB0);
                }
                if (this.d.c) {
                    C(pathB0);
                }
                I0(c0722z);
                if (zM0) {
                    j0(c0722z);
                }
            }
        }
    }

    private static double v(double d2) {
        if (d2 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d2 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d2);
    }

    private void v0(g.A a3) {
        y("Polygon render", new Object[0]);
        W0(this.d, a3);
        if (A() && Y0()) {
            C0260h c0260h = this.d;
            if (c0260h.c || c0260h.b) {
                Matrix matrix = a3.n;
                if (matrix != null) {
                    this.a.concat(matrix);
                }
                if (a3.o.length < 2) {
                    return;
                }
                Path pathB0 = b0(a3);
                U0(a3);
                r(a3);
                p(a3);
                boolean zM0 = m0();
                if (this.d.b) {
                    B(a3, pathB0);
                }
                if (this.d.c) {
                    C(pathB0);
                }
                I0(a3);
                if (zM0) {
                    j0(a3);
                }
            }
        }
    }

    private static int w(float f2) {
        int i2 = (int) (f2 * 256.0f);
        if (i2 < 0) {
            return 0;
        }
        if (i2 > 255) {
            return 255;
        }
        return i2;
    }

    private void w0(g.B b3) {
        y("Rect render", new Object[0]);
        g.C0712p c0712p = b3.q;
        if (c0712p == null || b3.r == null || c0712p.i() || b3.r.i()) {
            return;
        }
        W0(this.d, b3);
        if (A() && Y0()) {
            Matrix matrix = b3.n;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            Path pathC0 = c0(b3);
            U0(b3);
            r(b3);
            p(b3);
            boolean zM0 = m0();
            if (this.d.b) {
                B(b3, pathC0);
            }
            if (this.d.c) {
                C(pathC0);
            }
            if (zM0) {
                j0(b3);
            }
        }
    }

    private static int x(int i2, float f2) {
        int i3 = 255;
        int iRound = Math.round(((i2 >> 24) & 255) * f2);
        if (iRound < 0) {
            i3 = 0;
        } else if (iRound <= 255) {
            i3 = iRound;
        }
        return (i2 & 16777215) | (i3 << 24);
    }

    private void x0(g.F f2) {
        z0(f2, f0(f2.q, f2.r, f2.s, f2.t), f2.p, f2.o);
    }

    public static void y(String str, Object... objArr) {
    }

    private void y0(g.F f2, g.C0699b c0699b) {
        z0(f2, c0699b, f2.p, f2.o);
    }

    private void z(boolean z, g.C0699b c0699b, g.C0717u c0717u) {
        g.N nP = this.c.p(c0717u.d);
        if (nP == null) {
            F("%s reference '%s' not found", z ? "Fill" : "Stroke", c0717u.d);
            g.O o = c0717u.e;
            if (o != null) {
                P0(this.d, z, o);
                return;
            } else if (z) {
                this.d.b = false;
                return;
            } else {
                this.d.c = false;
                return;
            }
        }
        if (nP instanceof g.M) {
            X(z, c0699b, (g.M) nP);
        } else if (nP instanceof g.Q) {
            e0(z, c0699b, (g.Q) nP);
        } else if (nP instanceof g.C) {
            Q0(z, (g.C) nP);
        }
    }

    private void z0(g.F f2, g.C0699b c0699b, g.C0699b c0699b2, o2.e eVar) {
        y("Svg render", new Object[0]);
        if (c0699b.c == 0.0f || c0699b.d == 0.0f) {
            return;
        }
        if (eVar == null && (eVar = f2.o) == null) {
            eVar = o2.e.e;
        }
        W0(this.d, f2);
        if (A()) {
            C0260h c0260h = this.d;
            c0260h.f = c0699b;
            if (!c0260h.a.O.booleanValue()) {
                g.C0699b c0699b3 = this.d.f;
                O0(c0699b3.a, c0699b3.b, c0699b3.c, c0699b3.d);
            }
            q(f2, this.d.f);
            if (c0699b2 != null) {
                this.a.concat(o(this.d.f, c0699b2, eVar));
                this.d.g = f2.p;
            } else {
                Canvas canvas = this.a;
                g.C0699b c0699b4 = this.d.f;
                canvas.translate(c0699b4.a, c0699b4.b);
            }
            boolean zM0 = m0();
            X0();
            F0(f2, true);
            if (zM0) {
                j0(f2);
            }
            U0(f2);
        }
    }

    void G0(o2.g gVar, o2.f fVar) {
        g.C0699b c0699b;
        o2.e eVar;
        if (fVar == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.c = gVar;
        g.F fM = gVar.m();
        if (fM == null) {
            Z0("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (fVar.e()) {
            g.L lI = this.c.i(fVar.e);
            if (lI == null || !(lI instanceof g.f0)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", fVar.e));
                return;
            }
            g.f0 f0Var = (g.f0) lI;
            c0699b = f0Var.p;
            if (c0699b == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", fVar.e));
                return;
            }
            eVar = f0Var.o;
        } else {
            c0699b = fVar.f() ? fVar.d : fM.p;
            eVar = fVar.c() ? fVar.b : fM.o;
        }
        if (fVar.b()) {
            gVar.a(fVar.a);
        }
        if (fVar.d()) {
            b.q qVar = new b.q();
            this.h = qVar;
            qVar.a = gVar.i(fVar.c);
        }
        N0();
        u(fM);
        S0();
        g.C0699b c0699b2 = new g.C0699b(fVar.f);
        g.C0712p c0712p = fM.s;
        if (c0712p != null) {
            c0699b2.c = c0712p.d(this, c0699b2.c);
        }
        g.C0712p c0712p2 = fM.t;
        if (c0712p2 != null) {
            c0699b2.d = c0712p2.d(this, c0699b2.d);
        }
        z0(fM, c0699b2, c0699b, eVar);
        R0();
        if (fVar.b()) {
            gVar.b();
        }
    }

    float Q() {
        return this.d.d.getTextSize();
    }

    float R() {
        return this.d.d.getTextSize() / 2.0f;
    }

    g.C0699b S() {
        C0260h c0260h = this.d;
        g.C0699b c0699b = c0260h.g;
        return c0699b != null ? c0699b : c0260h.f;
    }

    float T() {
        return this.b;
    }

    private class k extends j {
        float b;

        private k() {
            super(h.this, null);
            this.b = 0.0f;
        }

        @Override
        public void b(String str) {
            this.b += h.this.d.d.measureText(str);
        }

        k(h hVar, a aVar) {
            this();
        }
    }

    private class C0260h {
        g.E a;
        boolean b;
        boolean c;
        Paint d;
        Paint e;
        g.C0699b f;
        g.C0699b g;
        boolean h;

        C0260h() {
            Paint paint = new Paint();
            this.d = paint;
            paint.setFlags(193);
            this.d.setHinting(0);
            this.d.setStyle(Paint.Style.FILL);
            Paint paint2 = this.d;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.e = paint3;
            paint3.setFlags(193);
            this.e.setHinting(0);
            this.e.setStyle(Paint.Style.STROKE);
            this.e.setTypeface(typeface);
            this.a = g.E.a();
        }

        C0260h(C0260h c0260h) {
            this.b = c0260h.b;
            this.c = c0260h.c;
            this.d = new Paint(c0260h.d);
            this.e = new Paint(c0260h.e);
            g.C0699b c0699b = c0260h.f;
            if (c0699b != null) {
                this.f = new g.C0699b(c0699b);
            }
            g.C0699b c0699b2 = c0260h.g;
            if (c0699b2 != null) {
                this.g = new g.C0699b(c0699b2);
            }
            this.h = c0260h.h;
            try {
                this.a = (g.E) c0260h.a.clone();
            } catch (CloneNotSupportedException e) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
                this.a = g.E.a();
            }
        }
    }
}
