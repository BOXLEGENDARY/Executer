package o2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o2.b;

public class g {
    private static boolean g = true;
    private F a = null;
    private String b = "";
    private String c = "";
    private float d = 96.0f;
    private b.r e = new b.r();
    private Map<String, L> f = new HashMap();

    static class A extends C0722z {
        A() {
        }

        @Override
        String n() {
            return "polygon";
        }
    }

    static class B extends AbstractC0708l {
        C0712p o;
        C0712p p;
        C0712p q;
        C0712p r;
        C0712p s;
        C0712p t;

        B() {
        }

        @Override
        String n() {
            return "rect";
        }
    }

    static class C extends L implements J {
        C() {
        }

        @Override
        public List<N> getChildren() {
            return Collections.emptyList();
        }

        @Override
        public void i(N n) {
        }

        @Override
        String n() {
            return "solidColor";
        }
    }

    static class D extends L implements J {
        Float h;

        D() {
        }

        @Override
        public List<N> getChildren() {
            return Collections.emptyList();
        }

        @Override
        public void i(N n) {
        }

        @Override
        String n() {
            return "stop";
        }
    }

    static class E implements Cloneable {
        c A;
        d B;
        Float C;
        C0712p[] D;
        C0712p E;
        Float F;
        C0703f G;
        List<String> H;
        C0712p I;
        Integer J;
        b K;
        EnumC0258g L;
        h M;
        f N;
        Boolean O;
        C0700c P;
        String Q;
        String R;
        String S;
        Boolean T;
        Boolean U;
        O V;
        Float W;
        String X;
        a Y;
        String Z;
        O a0;
        Float b0;
        O c0;
        long d = 0;
        Float d0;
        O e;
        i e0;
        e f0;
        a i;
        Float v;
        O w;
        Float y;
        C0712p z;

        public enum a {
            NonZero,
            EvenOdd
        }

        public enum b {
            Normal,
            Italic,
            Oblique
        }

        public enum c {
            Butt,
            Round,
            Square
        }

        public enum d {
            Miter,
            Round,
            Bevel
        }

        public enum e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum f {
            Start,
            Middle,
            End
        }

        public enum EnumC0258g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum h {
            LTR,
            RTL
        }

        public enum i {
            None,
            NonScalingStroke
        }

        E() {
        }

        static E a() {
            E e2 = new E();
            e2.d = -1L;
            C0703f c0703f = C0703f.e;
            e2.e = c0703f;
            a aVar = a.NonZero;
            e2.i = aVar;
            Float fValueOf = Float.valueOf(1.0f);
            e2.v = fValueOf;
            e2.w = null;
            e2.y = fValueOf;
            e2.z = new C0712p(1.0f);
            e2.A = c.Butt;
            e2.B = d.Miter;
            e2.C = Float.valueOf(4.0f);
            e2.D = null;
            e2.E = new C0712p(0.0f);
            e2.F = fValueOf;
            e2.G = c0703f;
            e2.H = null;
            e2.I = new C0712p(12.0f, d0.pt);
            e2.J = 400;
            e2.K = b.Normal;
            e2.L = EnumC0258g.None;
            e2.M = h.LTR;
            e2.N = f.Start;
            Boolean bool = Boolean.TRUE;
            e2.O = bool;
            e2.P = null;
            e2.Q = null;
            e2.R = null;
            e2.S = null;
            e2.T = bool;
            e2.U = bool;
            e2.V = c0703f;
            e2.W = fValueOf;
            e2.X = null;
            e2.Y = aVar;
            e2.Z = null;
            e2.a0 = null;
            e2.b0 = fValueOf;
            e2.c0 = null;
            e2.d0 = fValueOf;
            e2.e0 = i.None;
            e2.f0 = e.auto;
            return e2;
        }

        void b(boolean z) {
            Boolean bool = Boolean.TRUE;
            this.T = bool;
            if (!z) {
                bool = Boolean.FALSE;
            }
            this.O = bool;
            this.P = null;
            this.X = null;
            this.F = Float.valueOf(1.0f);
            this.V = C0703f.e;
            this.W = Float.valueOf(1.0f);
            this.Z = null;
            this.a0 = null;
            this.b0 = Float.valueOf(1.0f);
            this.c0 = null;
            this.d0 = Float.valueOf(1.0f);
            this.e0 = i.None;
        }

        protected Object clone() throws CloneNotSupportedException {
            E e2 = (E) super.clone();
            C0712p[] c0712pArr = this.D;
            if (c0712pArr != null) {
                e2.D = (C0712p[]) c0712pArr.clone();
            }
            return e2;
        }
    }

    static class F extends R {
        C0712p q;
        C0712p r;
        C0712p s;
        C0712p t;
        public String u;

        F() {
        }

        @Override
        String n() {
            return "svg";
        }
    }

    interface G {
        Set<String> a();

        void b(Set<String> set);

        String c();

        void d(Set<String> set);

        void f(Set<String> set);

        Set<String> g();

        void h(String str);

        void k(Set<String> set);

        Set<String> l();

        Set<String> m();
    }

    static abstract class H extends K implements J, G {
        List<N> i = new ArrayList();
        Set<String> j = null;
        String k = null;
        Set<String> l = null;
        Set<String> m = null;
        Set<String> n = null;

        H() {
        }

        @Override
        public Set<String> a() {
            return null;
        }

        @Override
        public void b(Set<String> set) {
            this.m = set;
        }

        @Override
        public String c() {
            return this.k;
        }

        @Override
        public void d(Set<String> set) {
            this.n = set;
        }

        @Override
        public void f(Set<String> set) {
            this.j = set;
        }

        @Override
        public Set<String> g() {
            return this.j;
        }

        @Override
        public List<N> getChildren() {
            return this.i;
        }

        @Override
        public void h(String str) {
            this.k = str;
        }

        @Override
        public void i(N n) throws j {
            this.i.add(n);
        }

        @Override
        public void k(Set<String> set) {
            this.l = set;
        }

        @Override
        public Set<String> l() {
            return this.m;
        }

        @Override
        public Set<String> m() {
            return this.n;
        }
    }

    static abstract class I extends K implements G {
        Set<String> i = null;
        String j = null;
        Set<String> k = null;
        Set<String> l = null;
        Set<String> m = null;

        I() {
        }

        @Override
        public Set<String> a() {
            return this.k;
        }

        @Override
        public void b(Set<String> set) {
            this.l = set;
        }

        @Override
        public String c() {
            return this.j;
        }

        @Override
        public void d(Set<String> set) {
            this.m = set;
        }

        @Override
        public void f(Set<String> set) {
            this.i = set;
        }

        @Override
        public Set<String> g() {
            return this.i;
        }

        @Override
        public void h(String str) {
            this.j = str;
        }

        @Override
        public void k(Set<String> set) {
            this.k = set;
        }

        @Override
        public Set<String> l() {
            return this.l;
        }

        @Override
        public Set<String> m() {
            return this.m;
        }
    }

    interface J {
        List<N> getChildren();

        void i(N n) throws j;
    }

    static abstract class K extends L {
        C0699b h = null;

        K() {
        }
    }

    static abstract class L extends N {
        String c = null;
        Boolean d = null;
        E e = null;
        E f = null;
        List<String> g = null;

        L() {
        }

        public String toString() {
            return n();
        }
    }

    static class M extends AbstractC0706j {
        C0712p m;
        C0712p n;
        C0712p o;
        C0712p p;

        M() {
        }

        @Override
        String n() {
            return "linearGradient";
        }
    }

    static class N {
        g a;
        J b;

        N() {
        }

        String n() {
            return "";
        }
    }

    static abstract class O implements Cloneable {
        O() {
        }
    }

    static abstract class P extends H {
        e o = null;

        P() {
        }
    }

    static class Q extends AbstractC0706j {
        C0712p m;
        C0712p n;
        C0712p o;
        C0712p p;
        C0712p q;

        Q() {
        }

        @Override
        String n() {
            return "radialGradient";
        }
    }

    static abstract class R extends P {
        C0699b p;

        R() {
        }
    }

    static class S extends C0709m {
        S() {
        }

        @Override
        String n() {
            return "switch";
        }
    }

    static class T extends R implements InterfaceC0716t {
        T() {
        }

        @Override
        String n() {
            return "symbol";
        }
    }

    static class U extends Y implements X {
        String o;
        private b0 p;

        U() {
        }

        @Override
        public b0 e() {
            return this.p;
        }

        @Override
        String n() {
            return "tref";
        }

        public void o(b0 b0Var) {
            this.p = b0Var;
        }
    }

    static class V extends a0 implements X {
        private b0 s;

        V() {
        }

        @Override
        public b0 e() {
            return this.s;
        }

        @Override
        String n() {
            return "tspan";
        }

        public void o(b0 b0Var) {
            this.s = b0Var;
        }
    }

    static class W extends a0 implements b0, InterfaceC0710n {
        Matrix s;

        W() {
        }

        @Override
        public void j(Matrix matrix) {
            this.s = matrix;
        }

        @Override
        String n() {
            return Text.type;
        }
    }

    interface X {
        b0 e();
    }

    static abstract class Y extends H {
        Y() {
        }

        @Override
        public void i(N n) throws j {
            if (n instanceof X) {
                this.i.add(n);
                return;
            }
            throw new j("Text content elements cannot contain " + n + " elements.");
        }
    }

    static class Z extends Y implements X {
        String o;
        C0712p p;
        private b0 q;

        Z() {
        }

        @Override
        public b0 e() {
            return this.q;
        }

        @Override
        String n() {
            return "textPath";
        }

        public void o(b0 b0Var) {
            this.q = b0Var;
        }
    }

    static class C0698a {
        static final int[] a;

        static {
            int[] iArr = new int[d0.values().length];
            a = iArr;
            try {
                iArr[d0.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d0.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d0.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d0.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d0.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[d0.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[d0.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[d0.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[d0.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static abstract class a0 extends Y {
        List<C0712p> o;
        List<C0712p> p;
        List<C0712p> q;
        List<C0712p> r;

        a0() {
        }
    }

    interface b0 {
    }

    static class C0700c {
        C0712p a;
        C0712p b;
        C0712p c;
        C0712p d;

        C0700c(C0712p c0712p, C0712p c0712p2, C0712p c0712p3, C0712p c0712p4) {
            this.a = c0712p;
            this.b = c0712p2;
            this.c = c0712p3;
            this.d = c0712p4;
        }
    }

    static class c0 extends N implements X {
        String c;
        private b0 d;

        c0(String str) {
            this.c = str;
        }

        @Override
        public b0 e() {
            return this.d;
        }

        public String toString() {
            return "TextChild: '" + this.c + "'";
        }
    }

    static class C0701d extends AbstractC0708l {
        C0712p o;
        C0712p p;
        C0712p q;

        C0701d() {
        }

        @Override
        String n() {
            return "circle";
        }
    }

    enum d0 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    static class C0702e extends C0709m implements InterfaceC0716t {
        Boolean p;

        C0702e() {
        }

        @Override
        String n() {
            return "clipPath";
        }
    }

    static class e0 extends C0709m {
        String p;
        C0712p q;
        C0712p r;
        C0712p s;
        C0712p t;

        e0() {
        }

        @Override
        String n() {
            return "use";
        }
    }

    static class C0703f extends O {
        static final C0703f e = new C0703f(-16777216);
        static final C0703f i = new C0703f(0);
        int d;

        C0703f(int i2) {
            this.d = i2;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.d));
        }
    }

    static class f0 extends R implements InterfaceC0716t {
        f0() {
        }

        @Override
        String n() {
            return "view";
        }
    }

    static class C0259g extends O {
        private static C0259g d = new C0259g();

        private C0259g() {
        }

        static C0259g a() {
            return d;
        }
    }

    static class C0704h extends C0709m implements InterfaceC0716t {
        C0704h() {
        }

        @Override
        String n() {
            return "defs";
        }
    }

    static class C0705i extends AbstractC0708l {
        C0712p o;
        C0712p p;
        C0712p q;
        C0712p r;

        C0705i() {
        }

        @Override
        String n() {
            return "ellipse";
        }
    }

    static abstract class AbstractC0706j extends L implements J {
        List<N> h = new ArrayList();
        Boolean i;
        Matrix j;
        EnumC0707k k;
        String l;

        AbstractC0706j() {
        }

        @Override
        public List<N> getChildren() {
            return this.h;
        }

        @Override
        public void i(N n) throws j {
            if (n instanceof D) {
                this.h.add(n);
                return;
            }
            throw new j("Gradient elements cannot contain " + n + " elements.");
        }
    }

    enum EnumC0707k {
        pad,
        reflect,
        repeat
    }

    static abstract class AbstractC0708l extends I implements InterfaceC0710n {
        Matrix n;

        AbstractC0708l() {
        }

        @Override
        public void j(Matrix matrix) {
            this.n = matrix;
        }
    }

    static class C0709m extends H implements InterfaceC0710n {
        Matrix o;

        C0709m() {
        }

        @Override
        public void j(Matrix matrix) {
            this.o = matrix;
        }

        @Override
        String n() {
            return "group";
        }
    }

    interface InterfaceC0710n {
        void j(Matrix matrix);
    }

    static class C0711o extends P implements InterfaceC0710n {
        String p;
        C0712p q;
        C0712p r;
        C0712p s;
        C0712p t;
        Matrix u;

        C0711o() {
        }

        @Override
        public void j(Matrix matrix) {
            this.u = matrix;
        }

        @Override
        String n() {
            return "image";
        }
    }

    static class C0713q extends AbstractC0708l {
        C0712p o;
        C0712p p;
        C0712p q;
        C0712p r;

        C0713q() {
        }

        @Override
        String n() {
            return "line";
        }
    }

    static class C0714r extends R implements InterfaceC0716t {
        boolean q;
        C0712p r;
        C0712p s;
        C0712p t;
        C0712p u;
        Float v;

        C0714r() {
        }

        @Override
        String n() {
            return "marker";
        }
    }

    static class C0715s extends H implements InterfaceC0716t {
        Boolean o;
        Boolean p;
        C0712p q;
        C0712p r;
        C0712p s;
        C0712p t;

        C0715s() {
        }

        @Override
        String n() {
            return "mask";
        }
    }

    interface InterfaceC0716t {
    }

    static class C0717u extends O {
        String d;
        O e;

        C0717u(String str, O o) {
            this.d = str;
            this.e = o;
        }

        public String toString() {
            return this.d + " " + this.e;
        }
    }

    static class C0718v extends AbstractC0708l {
        C0719w o;
        Float p;

        C0718v() {
        }

        @Override
        String n() {
            return "path";
        }
    }

    static class C0719w implements InterfaceC0720x {
        private int b = 0;
        private int d = 0;
        private byte[] a = new byte[8];
        private float[] c = new float[16];

        C0719w() {
        }

        private void f(byte b) {
            int i = this.b;
            byte[] bArr = this.a;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.a = bArr2;
            }
            byte[] bArr3 = this.a;
            int i2 = this.b;
            this.b = i2 + 1;
            bArr3[i2] = b;
        }

        private void g(int i) {
            float[] fArr = this.c;
            if (fArr.length < this.d + i) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.c = fArr2;
            }
        }

        @Override
        public void a(float f, float f2, float f3, float f4) {
            f((byte) 3);
            g(4);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            this.d = i + 4;
            fArr[i4] = f4;
        }

        @Override
        public void b(float f, float f2) {
            f((byte) 0);
            g(2);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            this.d = i + 2;
            fArr[i2] = f2;
        }

        @Override
        public void c(float f, float f2, float f3, float f4, float f5, float f6) {
            f((byte) 2);
            g(6);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.d = i5;
            fArr[i4] = f4;
            int i6 = i + 5;
            this.d = i6;
            fArr[i5] = f5;
            this.d = i + 6;
            fArr[i6] = f6;
        }

        @Override
        public void close() {
            f((byte) 8);
        }

        @Override
        public void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            f((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
            g(5);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.d = i5;
            fArr[i4] = f4;
            this.d = i + 5;
            fArr[i5] = f5;
        }

        @Override
        public void e(float f, float f2) {
            f((byte) 1);
            g(2);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            this.d = i + 2;
            fArr[i2] = f2;
        }

        void h(InterfaceC0720x interfaceC0720x) {
            int i = 0;
            for (int i2 = 0; i2 < this.b; i2++) {
                byte b = this.a[i2];
                if (b == 0) {
                    float[] fArr = this.c;
                    int i3 = i + 1;
                    float f = fArr[i];
                    i += 2;
                    interfaceC0720x.b(f, fArr[i3]);
                } else if (b == 1) {
                    float[] fArr2 = this.c;
                    int i4 = i + 1;
                    float f2 = fArr2[i];
                    i += 2;
                    interfaceC0720x.e(f2, fArr2[i4]);
                } else if (b == 2) {
                    float[] fArr3 = this.c;
                    float f3 = fArr3[i];
                    float f4 = fArr3[i + 1];
                    float f5 = fArr3[i + 2];
                    float f6 = fArr3[i + 3];
                    int i5 = i + 5;
                    float f7 = fArr3[i + 4];
                    i += 6;
                    interfaceC0720x.c(f3, f4, f5, f6, f7, fArr3[i5]);
                } else if (b == 3) {
                    float[] fArr4 = this.c;
                    float f10 = fArr4[i];
                    float f11 = fArr4[i + 1];
                    int i6 = i + 3;
                    float f12 = fArr4[i + 2];
                    i += 4;
                    interfaceC0720x.a(f10, f11, f12, fArr4[i6]);
                } else if (b != 8) {
                    boolean z = (b & 2) != 0;
                    boolean z2 = (b & 1) != 0;
                    float[] fArr5 = this.c;
                    float f13 = fArr5[i];
                    float f14 = fArr5[i + 1];
                    float f15 = fArr5[i + 2];
                    int i7 = i + 4;
                    float f16 = fArr5[i + 3];
                    i += 5;
                    interfaceC0720x.d(f13, f14, f15, z, z2, f16, fArr5[i7]);
                } else {
                    interfaceC0720x.close();
                }
            }
        }

        boolean i() {
            return this.b == 0;
        }
    }

    interface InterfaceC0720x {
        void a(float f, float f2, float f3, float f4);

        void b(float f, float f2);

        void c(float f, float f2, float f3, float f4, float f5, float f6);

        void close();

        void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        void e(float f, float f2);
    }

    static class C0721y extends R implements InterfaceC0716t {
        Boolean q;
        Boolean r;
        Matrix s;
        C0712p t;
        C0712p u;
        C0712p v;
        C0712p w;
        String x;

        C0721y() {
        }

        @Override
        String n() {
            return "pattern";
        }
    }

    static class C0722z extends AbstractC0708l {
        float[] o;

        C0722z() {
        }

        @Override
        String n() {
            return "polyline";
        }
    }

    g() {
    }

    private String c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    private C0699b e(float f) {
        d0 d0Var;
        d0 d0Var2;
        d0 d0Var3;
        d0 d0Var4;
        float fB;
        d0 d0Var5;
        F f2 = this.a;
        C0712p c0712p = f2.s;
        C0712p c0712p2 = f2.t;
        if (c0712p == null || c0712p.i() || (d0Var = c0712p.e) == (d0Var2 = d0.percent) || d0Var == (d0Var3 = d0.em) || d0Var == (d0Var4 = d0.ex)) {
            return new C0699b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fB2 = c0712p.b(f);
        if (c0712p2 == null) {
            C0699b c0699b = this.a.p;
            fB = c0699b != null ? (c0699b.d * fB2) / c0699b.c : fB2;
        } else {
            if (c0712p2.i() || (d0Var5 = c0712p2.e) == d0Var2 || d0Var5 == d0Var3 || d0Var5 == d0Var4) {
                return new C0699b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fB = c0712p2.b(f);
        }
        return new C0699b(0.0f, 0.0f, fB2, fB);
    }

    private L j(J j, String str) {
        L lJ;
        L l = (L) j;
        if (str.equals(l.c)) {
            return l;
        }
        for (Object obj : j.getChildren()) {
            if (obj instanceof L) {
                L l2 = (L) obj;
                if (str.equals(l2.c)) {
                    return l2;
                }
                if ((obj instanceof J) && (lJ = j((J) obj, str)) != null) {
                    return lJ;
                }
            }
        }
        return null;
    }

    static i k() {
        return null;
    }

    public static g l(InputStream inputStream) throws j {
        return new k().z(inputStream, g);
    }

    void a(b.r rVar) {
        this.e.b(rVar);
    }

    void b() {
        this.e.e(b.u.RenderOptions);
    }

    List<b.p> d() {
        return this.e.c();
    }

    public float f() {
        if (this.a != null) {
            return e(this.d).d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF g() {
        F f = this.a;
        if (f == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        C0699b c0699b = f.p;
        if (c0699b == null) {
            return null;
        }
        return c0699b.d();
    }

    public float h() {
        if (this.a != null) {
            return e(this.d).c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    L i(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.a.c)) {
            return this.a;
        }
        if (this.f.containsKey(str)) {
            return this.f.get(str);
        }
        L lJ = j(this.a, str);
        this.f.put(str, lJ);
        return lJ;
    }

    F m() {
        return this.a;
    }

    boolean n() {
        return !this.e.d();
    }

    public void o(Canvas canvas, f fVar) {
        if (fVar == null) {
            fVar = new f();
        }
        if (!fVar.g()) {
            fVar.h(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new h(canvas, this.d).G0(this, fVar);
    }

    N p(String str) {
        if (str == null) {
            return null;
        }
        String strC = c(str);
        if (strC.length() <= 1 || !strC.startsWith("#")) {
            return null;
        }
        return i(strC.substring(1));
    }

    void q(String str) {
        this.c = str;
    }

    public void r(String str) throws j {
        F f = this.a;
        if (f == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f.t = k.o0(str);
    }

    public void s(float f, float f2, float f3, float f4) {
        F f5 = this.a;
        if (f5 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f5.p = new C0699b(f, f2, f3, f4);
    }

    public void t(String str) throws j {
        F f = this.a;
        if (f == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f.s = k.o0(str);
    }

    void u(F f) {
        this.a = f;
    }

    void v(String str) {
        this.b = str;
    }

    static class C0712p implements Cloneable {
        float d;
        d0 e;

        C0712p(float f, d0 d0Var) {
            this.d = f;
            this.e = d0Var;
        }

        float a() {
            return this.d;
        }

        float b(float f) {
            int i = C0698a.a[this.e.ordinal()];
            if (i == 1) {
                return this.d;
            }
            switch (i) {
                case 4:
                    return this.d * f;
                case 5:
                    return (this.d * f) / 2.54f;
                case com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    return (this.d * f) / 25.4f;
                case com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    return (this.d * f) / 72.0f;
                case com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_loop:
                    return (this.d * f) / 6.0f;
                default:
                    return this.d;
            }
        }

        float c(h hVar) {
            if (this.e != d0.percent) {
                return e(hVar);
            }
            C0699b c0699bS = hVar.S();
            if (c0699bS == null) {
                return this.d;
            }
            float f = c0699bS.c;
            if (f == c0699bS.d) {
                return (this.d * f) / 100.0f;
            }
            return (this.d * ((float) (Math.sqrt((f * f) + (r6 * r6)) / 1.414213562373095d))) / 100.0f;
        }

        float d(h hVar, float f) {
            return this.e == d0.percent ? (this.d * f) / 100.0f : e(hVar);
        }

        float e(h hVar) {
            switch (C0698a.a[this.e.ordinal()]) {
                case com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress:
                    C0699b c0699bS = hVar.S();
                    if (c0699bS != null) {
                        break;
                    } else {
                        break;
                    }
            }
            return this.d;
        }

        float g(h hVar) {
            if (this.e != d0.percent) {
                return e(hVar);
            }
            C0699b c0699bS = hVar.S();
            return c0699bS == null ? this.d : (this.d * c0699bS.d) / 100.0f;
        }

        boolean h() {
            return this.d < 0.0f;
        }

        boolean i() {
            return this.d == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.d) + this.e;
        }

        C0712p(float f) {
            this.d = f;
            this.e = d0.px;
        }
    }

    static class C0699b {
        float a;
        float b;
        float c;
        float d;

        C0699b(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        static C0699b a(float f, float f2, float f3, float f4) {
            return new C0699b(f, f2, f3 - f, f4 - f2);
        }

        float b() {
            return this.a + this.c;
        }

        float c() {
            return this.b + this.d;
        }

        RectF d() {
            return new RectF(this.a, this.b, b(), c());
        }

        void e(C0699b c0699b) {
            float f = c0699b.a;
            if (f < this.a) {
                this.a = f;
            }
            float f2 = c0699b.b;
            if (f2 < this.b) {
                this.b = f2;
            }
            if (c0699b.b() > b()) {
                this.c = c0699b.b() - this.a;
            }
            if (c0699b.c() > c()) {
                this.d = c0699b.c() - this.b;
            }
        }

        public String toString() {
            return "[" + this.a + " " + this.b + " " + this.c + " " + this.d + "]";
        }

        C0699b(C0699b c0699b) {
            this.a = c0699b.a;
            this.b = c0699b.b;
            this.c = c0699b.c;
            this.d = c0699b.d;
        }
    }
}
