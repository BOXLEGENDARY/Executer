package u4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import c4.C1755k;

public class k {

    public static final InterfaceC2933c f23964m = new i(0.5f);

    C2934d f23965a;

    C2934d f23966b;

    C2934d f23967c;

    C2934d f23968d;

    InterfaceC2933c f23969e;

    InterfaceC2933c f23970f;

    InterfaceC2933c f23971g;

    InterfaceC2933c f23972h;

    C2936f f23973i;

    C2936f f23974j;

    C2936f f23975k;

    C2936f f23976l;

    public interface c {
        InterfaceC2933c a(InterfaceC2933c interfaceC2933c);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i7, int i8) {
        return c(context, i7, i8, 0);
    }

    private static b c(Context context, int i7, int i8, int i9) {
        return d(context, i7, i8, new C2931a(i9));
    }

    private static b d(Context context, int i7, int i8, InterfaceC2933c interfaceC2933c) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i7);
        if (i8 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i8);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C1755k.f13191i5);
        try {
            int i9 = typedArrayObtainStyledAttributes.getInt(C1755k.f13199j5, 0);
            int i10 = typedArrayObtainStyledAttributes.getInt(C1755k.f13220m5, i9);
            int i11 = typedArrayObtainStyledAttributes.getInt(C1755k.f13227n5, i9);
            int i12 = typedArrayObtainStyledAttributes.getInt(C1755k.f13213l5, i9);
            int i13 = typedArrayObtainStyledAttributes.getInt(C1755k.f13206k5, i9);
            InterfaceC2933c interfaceC2933cM = m(typedArrayObtainStyledAttributes, C1755k.f13233o5, interfaceC2933c);
            InterfaceC2933c interfaceC2933cM2 = m(typedArrayObtainStyledAttributes, C1755k.f13254r5, interfaceC2933cM);
            InterfaceC2933c interfaceC2933cM3 = m(typedArrayObtainStyledAttributes, C1755k.f13261s5, interfaceC2933cM);
            InterfaceC2933c interfaceC2933cM4 = m(typedArrayObtainStyledAttributes, C1755k.f13247q5, interfaceC2933cM);
            return new b().y(i10, interfaceC2933cM2).C(i11, interfaceC2933cM3).u(i12, interfaceC2933cM4).q(i13, m(typedArrayObtainStyledAttributes, C1755k.f13240p5, interfaceC2933cM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i7, int i8) {
        return f(context, attributeSet, i7, i8, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i7, int i8, int i9) {
        return g(context, attributeSet, i7, i8, new C2931a(i9));
    }

    public static b g(Context context, AttributeSet attributeSet, int i7, int i8, InterfaceC2933c interfaceC2933c) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1755k.f13166f4, i7, i8);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C1755k.f13174g4, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C1755k.f13182h4, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, interfaceC2933c);
    }

    private static InterfaceC2933c m(TypedArray typedArray, int i7, InterfaceC2933c interfaceC2933c) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i7);
        if (typedValuePeekValue == null) {
            return interfaceC2933c;
        }
        int i8 = typedValuePeekValue.type;
        return i8 == 5 ? new C2931a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i8 == 6 ? new i(typedValuePeekValue.getFraction(1.0f, 1.0f)) : interfaceC2933c;
    }

    public C2936f h() {
        return this.f23975k;
    }

    public C2934d i() {
        return this.f23968d;
    }

    public InterfaceC2933c j() {
        return this.f23972h;
    }

    public C2934d k() {
        return this.f23967c;
    }

    public InterfaceC2933c l() {
        return this.f23971g;
    }

    public C2936f n() {
        return this.f23976l;
    }

    public C2936f o() {
        return this.f23974j;
    }

    public C2936f p() {
        return this.f23973i;
    }

    public C2934d q() {
        return this.f23965a;
    }

    public InterfaceC2933c r() {
        return this.f23969e;
    }

    public C2934d s() {
        return this.f23966b;
    }

    public InterfaceC2933c t() {
        return this.f23970f;
    }

    public boolean u(RectF rectF) {
        boolean z7 = this.f23976l.getClass().equals(C2936f.class) && this.f23974j.getClass().equals(C2936f.class) && this.f23973i.getClass().equals(C2936f.class) && this.f23975k.getClass().equals(C2936f.class);
        float fA = this.f23969e.a(rectF);
        return z7 && ((this.f23970f.a(rectF) > fA ? 1 : (this.f23970f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f23972h.a(rectF) > fA ? 1 : (this.f23972h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f23971g.a(rectF) > fA ? 1 : (this.f23971g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f23966b instanceof j) && (this.f23965a instanceof j) && (this.f23967c instanceof j) && (this.f23968d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f7) {
        return v().o(f7).m();
    }

    public k x(InterfaceC2933c interfaceC2933c) {
        return v().p(interfaceC2933c).m();
    }

    public k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    private k(b bVar) {
        this.f23965a = bVar.f23977a;
        this.f23966b = bVar.f23978b;
        this.f23967c = bVar.f23979c;
        this.f23968d = bVar.f23980d;
        this.f23969e = bVar.f23981e;
        this.f23970f = bVar.f23982f;
        this.f23971g = bVar.f23983g;
        this.f23972h = bVar.f23984h;
        this.f23973i = bVar.f23985i;
        this.f23974j = bVar.f23986j;
        this.f23975k = bVar.f23987k;
        this.f23976l = bVar.f23988l;
    }

    public static final class b {

        private C2934d f23977a;

        private C2934d f23978b;

        private C2934d f23979c;

        private C2934d f23980d;

        private InterfaceC2933c f23981e;

        private InterfaceC2933c f23982f;

        private InterfaceC2933c f23983g;

        private InterfaceC2933c f23984h;

        private C2936f f23985i;

        private C2936f f23986j;

        private C2936f f23987k;

        private C2936f f23988l;

        public b() {
            this.f23977a = h.b();
            this.f23978b = h.b();
            this.f23979c = h.b();
            this.f23980d = h.b();
            this.f23981e = new C2931a(0.0f);
            this.f23982f = new C2931a(0.0f);
            this.f23983g = new C2931a(0.0f);
            this.f23984h = new C2931a(0.0f);
            this.f23985i = h.c();
            this.f23986j = h.c();
            this.f23987k = h.c();
            this.f23988l = h.c();
        }

        private static float n(C2934d c2934d) {
            if (c2934d instanceof j) {
                return ((j) c2934d).f23963a;
            }
            if (c2934d instanceof C2935e) {
                return ((C2935e) c2934d).f23911a;
            }
            return -1.0f;
        }

        public b A(float f7) {
            this.f23981e = new C2931a(f7);
            return this;
        }

        public b B(InterfaceC2933c interfaceC2933c) {
            this.f23981e = interfaceC2933c;
            return this;
        }

        public b C(int i7, InterfaceC2933c interfaceC2933c) {
            return D(h.a(i7)).F(interfaceC2933c);
        }

        public b D(C2934d c2934d) {
            this.f23978b = c2934d;
            float fN = n(c2934d);
            if (fN != -1.0f) {
                E(fN);
            }
            return this;
        }

        public b E(float f7) {
            this.f23982f = new C2931a(f7);
            return this;
        }

        public b F(InterfaceC2933c interfaceC2933c) {
            this.f23982f = interfaceC2933c;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f7) {
            return A(f7).E(f7).w(f7).s(f7);
        }

        public b p(InterfaceC2933c interfaceC2933c) {
            return B(interfaceC2933c).F(interfaceC2933c).x(interfaceC2933c).t(interfaceC2933c);
        }

        public b q(int i7, InterfaceC2933c interfaceC2933c) {
            return r(h.a(i7)).t(interfaceC2933c);
        }

        public b r(C2934d c2934d) {
            this.f23980d = c2934d;
            float fN = n(c2934d);
            if (fN != -1.0f) {
                s(fN);
            }
            return this;
        }

        public b s(float f7) {
            this.f23984h = new C2931a(f7);
            return this;
        }

        public b t(InterfaceC2933c interfaceC2933c) {
            this.f23984h = interfaceC2933c;
            return this;
        }

        public b u(int i7, InterfaceC2933c interfaceC2933c) {
            return v(h.a(i7)).x(interfaceC2933c);
        }

        public b v(C2934d c2934d) {
            this.f23979c = c2934d;
            float fN = n(c2934d);
            if (fN != -1.0f) {
                w(fN);
            }
            return this;
        }

        public b w(float f7) {
            this.f23983g = new C2931a(f7);
            return this;
        }

        public b x(InterfaceC2933c interfaceC2933c) {
            this.f23983g = interfaceC2933c;
            return this;
        }

        public b y(int i7, InterfaceC2933c interfaceC2933c) {
            return z(h.a(i7)).B(interfaceC2933c);
        }

        public b z(C2934d c2934d) {
            this.f23977a = c2934d;
            float fN = n(c2934d);
            if (fN != -1.0f) {
                A(fN);
            }
            return this;
        }

        public b(k kVar) {
            this.f23977a = h.b();
            this.f23978b = h.b();
            this.f23979c = h.b();
            this.f23980d = h.b();
            this.f23981e = new C2931a(0.0f);
            this.f23982f = new C2931a(0.0f);
            this.f23983g = new C2931a(0.0f);
            this.f23984h = new C2931a(0.0f);
            this.f23985i = h.c();
            this.f23986j = h.c();
            this.f23987k = h.c();
            this.f23988l = h.c();
            this.f23977a = kVar.f23965a;
            this.f23978b = kVar.f23966b;
            this.f23979c = kVar.f23967c;
            this.f23980d = kVar.f23968d;
            this.f23981e = kVar.f23969e;
            this.f23982f = kVar.f23970f;
            this.f23983g = kVar.f23971g;
            this.f23984h = kVar.f23972h;
            this.f23985i = kVar.f23973i;
            this.f23986j = kVar.f23974j;
            this.f23987k = kVar.f23975k;
            this.f23988l = kVar.f23976l;
        }
    }

    public k() {
        this.f23965a = h.b();
        this.f23966b = h.b();
        this.f23967c = h.b();
        this.f23968d = h.b();
        this.f23969e = new C2931a(0.0f);
        this.f23970f = new C2931a(0.0f);
        this.f23971g = new C2931a(0.0f);
        this.f23972h = new C2931a(0.0f);
        this.f23973i = h.c();
        this.f23974j = h.c();
        this.f23975k = h.c();
        this.f23976l = h.c();
    }
}
