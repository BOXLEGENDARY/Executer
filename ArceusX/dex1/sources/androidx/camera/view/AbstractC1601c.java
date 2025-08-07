package androidx.camera.view;

import C.InterfaceC0351s0;
import C.c1;
import P.c;
import S.B;
import S.C1233o;
import S.W;
import android.content.Context;
import android.graphics.Matrix;
import android.util.Range;
import android.util.Rational;
import android.view.C1709w;
import android.view.LiveData;
import androidx.camera.core.f;
import androidx.camera.view.u;
import c0.C1744a;
import f6.ck.ZJZXBWla;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import n.InterfaceC2621a;
import x0.InterfaceC2984a;
import z.AbstractC3051h0;
import z.AbstractC3056k;
import z.C3032B;
import z.C3033C;
import z.C3043d0;
import z.C3061p;
import z.C3070z;
import z.H0;
import z.I0;
import z.InterfaceC3052i;
import z.InterfaceC3054j;
import z.J0;
import z.T;
import z.o0;

public abstract class AbstractC1601c {

    private static final T.i f9618L = new a();

    private boolean f9619A;

    private final C1603e<J0> f9620B;

    private final C1603e<Integer> f9621C;

    final C1709w<Integer> f9622D;

    private final h<Boolean> f9623E;

    private final h<Float> f9624F;

    private final h<Float> f9625G;

    private final Set<AbstractC3056k> f9626H;

    private final Context f9627I;

    private final com.google.common.util.concurrent.p<Void> f9628J;

    private final Map<C1744a.EnumC0141a, C1744a> f9629K;

    C3061p f9630a;

    private int f9631b;

    o0 f9632c;

    P.c f9633d;

    T f9634e;

    P.c f9635f;

    Executor f9636g;

    private Executor f9637h;

    private Executor f9638i;

    private f.a f9639j;

    androidx.camera.core.f f9640k;

    P.c f9641l;

    W<S.B> f9642m;

    Map<InterfaceC2984a<Object>, Object> f9643n;

    C1233o f9644o;

    private int f9645p;

    private C3070z f9646q;

    private C3070z f9647r;

    private Range<Integer> f9648s;

    InterfaceC3052i f9649t;

    s f9650u;

    I0 f9651v;

    o0.c f9652w;

    private final u f9653x;

    final u.b f9654y;

    private boolean f9655z;

    class a implements T.i {
        a() {
        }

        @Override
        public void a(long j7, T.j jVar) {
            jVar.a();
        }

        @Override
        public void clear() {
        }
    }

    class b implements G.c<C3033C> {
        b() {
        }

        @Override
        public void onSuccess(C3033C c3033c) {
            if (c3033c == null) {
                return;
            }
            C3043d0.a("CameraController", ZJZXBWla.NZW + c3033c.c());
            AbstractC1601c.this.f9622D.m(Integer.valueOf(c3033c.c() ? 2 : 3));
        }

        @Override
        public void onFailure(Throwable th) {
            if (th instanceof InterfaceC3054j.a) {
                C3043d0.a("CameraController", "Tap-to-focus is canceled by new action.");
            } else {
                C3043d0.b("CameraController", "Tap to focus failed.", th);
                AbstractC1601c.this.f9622D.m(4);
            }
        }
    }

    @Deprecated
    public static final class C0075c {
    }

    AbstractC1601c(Context context) {
        this(context, G.n.G(androidx.camera.lifecycle.e.t(context), new InterfaceC2621a() {
            @Override
            public final Object apply(Object obj) {
                return new t((androidx.camera.lifecycle.e) obj);
            }
        }, F.a.a()));
    }

    private void C(f.a aVar, f.a aVar2) {
        if (Objects.equals(aVar == null ? null : aVar.h(), aVar2 != null ? aVar2.h() : null)) {
            return;
        }
        Q(Integer.valueOf(this.f9640k.g0()), Integer.valueOf(this.f9640k.h0()), Integer.valueOf(this.f9640k.j0()));
        L();
    }

    private float J(float f7) {
        return f7 > 1.0f ? ((f7 - 1.0f) * 2.0f) + 1.0f : 1.0f - ((1.0f - f7) * 2.0f);
    }

    private void N() {
        this.f9653x.a(F.a.d(), this.f9654y);
    }

    private void O() {
        this.f9653x.c(this.f9654y);
    }

    private void P() {
        S();
        R(Integer.valueOf(m()));
        Q(Integer.valueOf(this.f9640k.g0()), Integer.valueOf(this.f9640k.h0()), Integer.valueOf(this.f9640k.j0()));
        T();
    }

    private void Q(Integer num, Integer num2, Integer num3) {
        f.a aVar;
        E.p.a();
        if (s()) {
            this.f9650u.a(this.f9640k);
        }
        androidx.camera.core.f fVarF = f(num, num2, num3);
        this.f9640k = fVarF;
        Executor executor = this.f9637h;
        if (executor == null || (aVar = this.f9639j) == null) {
            return;
        }
        fVarF.q0(executor, aVar);
    }

    private void R(Integer num) {
        if (s()) {
            this.f9650u.a(this.f9634e);
        }
        int iM0 = this.f9634e.m0();
        this.f9634e = g(num);
        F(iM0);
    }

    private void S() {
        if (s()) {
            this.f9650u.a(this.f9632c);
        }
        o0 o0VarH = h();
        this.f9632c = o0VarH;
        o0.c cVar = this.f9652w;
        if (cVar != null) {
            o0VarH.o0(cVar);
        }
    }

    private void T() {
        if (s()) {
            this.f9650u.a(this.f9642m);
        }
        this.f9642m = j();
    }

    private void e(InterfaceC0351s0.a<?> aVar, P.c cVar, C0075c c0075c) {
        P.a aVarP;
        if (cVar != null) {
            aVar.a(cVar);
            return;
        }
        I0 i02 = this.f9651v;
        if (i02 == null || (aVarP = p(i02)) == null) {
            return;
        }
        aVar.a(new c.a().d(aVarP).a());
    }

    private androidx.camera.core.f f(Integer num, Integer num2, Integer num3) {
        f.c cVar = new f.c();
        if (num != null) {
            cVar.j(num.intValue());
        }
        if (num2 != null) {
            cVar.n(num2.intValue());
        }
        if (num3 != null) {
            cVar.o(num3.intValue());
        }
        e(cVar, this.f9641l, null);
        Executor executor = this.f9638i;
        if (executor != null) {
            cVar.i(executor);
        }
        return cVar.f();
    }

    private T g(Integer num) {
        T.b bVar = new T.b();
        if (num != null) {
            bVar.i(num.intValue());
        }
        e(bVar, this.f9635f, null);
        Executor executor = this.f9636g;
        if (executor != null) {
            bVar.l(executor);
        }
        return bVar.f();
    }

    private o0 h() {
        o0.a aVar = new o0.a();
        e(aVar, this.f9633d, null);
        aVar.j(this.f9647r);
        return aVar.f();
    }

    private W<S.B> j() {
        int iO;
        B.f fVarG = new B.f().g(this.f9644o);
        I0 i02 = this.f9651v;
        if (i02 != null && this.f9644o == S.B.f6084h0 && (iO = o(i02)) != -1) {
            fVarG.f(iO);
        }
        return new W.d(fVarG.c()).p(this.f9648s).l(this.f9645p).k(this.f9646q).f();
    }

    private int o(I0 i02) {
        int iB = i02 == null ? 0 : E.c.b(i02.c());
        s sVar = this.f9650u;
        int iA = sVar == null ? 0 : sVar.b(this.f9630a).a();
        s sVar2 = this.f9650u;
        int iA2 = E.c.a(iB, iA, sVar2 == null || sVar2.b(this.f9630a).h() == 1);
        Rational rationalA = i02.a();
        if (iA2 == 90 || iA2 == 270) {
            rationalA = new Rational(rationalA.getDenominator(), rationalA.getNumerator());
        }
        if (rationalA.equals(new Rational(4, 3))) {
            return 0;
        }
        return rationalA.equals(new Rational(16, 9)) ? 1 : -1;
    }

    private P.a p(I0 i02) {
        int iO = o(i02);
        if (iO != -1) {
            return new P.a(iO, 1);
        }
        return null;
    }

    private boolean r() {
        return this.f9649t != null;
    }

    private boolean s() {
        return this.f9650u != null;
    }

    private boolean v() {
        return (this.f9652w == null || this.f9651v == null) ? false : true;
    }

    private boolean w(int i7) {
        return (i7 & this.f9631b) != 0;
    }

    public Void y(s sVar) {
        this.f9650u = sVar;
        P();
        L();
        return null;
    }

    public void z(int i7) {
        this.f9640k.r0(i7);
        this.f9634e.F0(i7);
        this.f9642m.W0(i7);
    }

    void A(float f7) {
        if (!r()) {
            C3043d0.l("CameraController", "Use cases not attached to camera.");
            return;
        }
        if (!this.f9655z) {
            C3043d0.a("CameraController", "Pinch to zoom disabled.");
            return;
        }
        C3043d0.a("CameraController", "Pinch to zoom with scale: " + f7);
        J0 j0F = q().f();
        if (j0F == null) {
            return;
        }
        I(Math.min(Math.max(j0F.c() * J(f7), j0F.b()), j0F.a()));
    }

    void B(AbstractC3051h0 abstractC3051h0, float f7, float f8) {
        if (!r()) {
            C3043d0.l("CameraController", "Use cases not attached to camera.");
            return;
        }
        if (!this.f9619A) {
            C3043d0.a("CameraController", "Tap to focus disabled. ");
            return;
        }
        C3043d0.a("CameraController", "Tap to focus started: " + f7 + ", " + f8);
        this.f9622D.m(1);
        G.n.j(this.f9649t.a().l(new C3032B.a(abstractC3051h0.c(f7, f8, 0.16666667f), 1).a(abstractC3051h0.c(f7, f8, 0.25f), 2).b()), new b(), F.a.a());
    }

    public void D(Executor executor, f.a aVar) {
        E.p.a();
        f.a aVar2 = this.f9639j;
        if (aVar2 == aVar && this.f9637h == executor) {
            return;
        }
        this.f9637h = executor;
        this.f9639j = aVar;
        this.f9640k.q0(executor, aVar);
        C(aVar2, aVar);
    }

    public void E(P.c cVar) {
        E.p.a();
        if (this.f9641l == cVar) {
            return;
        }
        this.f9641l = cVar;
        Q(Integer.valueOf(this.f9640k.g0()), Integer.valueOf(this.f9640k.h0()), Integer.valueOf(this.f9640k.j0()));
        L();
    }

    public void F(int i7) {
        E.p.a();
        if (i7 == 3) {
            Integer numD = this.f9630a.d();
            if (numD != null && numD.intValue() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
            V();
        }
        this.f9634e.B0(i7);
    }

    public com.google.common.util.concurrent.p<Void> G(float f7) {
        E.p.a();
        return !r() ? this.f9624F.d(Float.valueOf(f7)) : this.f9649t.a().e(f7);
    }

    public void H(C1744a c1744a) {
        C1744a c1744aN = n();
        this.f9629K.put(c1744a.a(), c1744a);
        C1744a c1744aN2 = n();
        if (c1744aN2 == null || c1744aN2.equals(c1744aN)) {
            return;
        }
        V();
    }

    public com.google.common.util.concurrent.p<Void> I(float f7) {
        E.p.a();
        return !r() ? this.f9625G.d(Float.valueOf(f7)) : this.f9649t.a().g(f7);
    }

    abstract InterfaceC3052i K();

    void L() {
        M(null);
    }

    void M(Runnable runnable) {
        try {
            this.f9649t = K();
            if (!r()) {
                C3043d0.a("CameraController", "Use cases not attached to camera.");
                return;
            }
            this.f9620B.r(this.f9649t.c().q());
            this.f9621C.r(this.f9649t.c().e());
            this.f9623E.c(new InterfaceC2621a() {
                @Override
                public final Object apply(Object obj) {
                    return this.f8236a.k(((Boolean) obj).booleanValue());
                }
            });
            this.f9624F.c(new InterfaceC2621a() {
                @Override
                public final Object apply(Object obj) {
                    return this.f8237a.G(((Float) obj).floatValue());
                }
            });
            this.f9625G.c(new InterfaceC2621a() {
                @Override
                public final Object apply(Object obj) {
                    return this.f8238a.I(((Float) obj).floatValue());
                }
            });
        } catch (RuntimeException e7) {
            if (runnable != null) {
                runnable.run();
            }
            throw e7;
        }
    }

    void U(Matrix matrix) {
        E.p.a();
        f.a aVar = this.f9639j;
        if (aVar != null && aVar.i() == 1) {
            this.f9639j.b(matrix);
        }
    }

    public void V() {
        C1744a c1744aN = n();
        if (c1744aN == null) {
            C3043d0.a("CameraController", "No ScreenFlash instance set yet, need to wait for controller to be set to either ScreenFlashView or PreviewView");
            this.f9634e.C0(f9618L);
            return;
        }
        this.f9634e.C0(c1744aN.b());
        C3043d0.a("CameraController", "Set ScreenFlash instance to ImageCapture, provided by " + c1744aN.a().name());
    }

    void c(o0.c cVar, I0 i02) {
        E.p.a();
        if (this.f9652w != cVar) {
            this.f9652w = cVar;
            this.f9632c.o0(cVar);
        }
        boolean z7 = this.f9651v == null || p(i02) != p(this.f9651v);
        this.f9651v = i02;
        N();
        if (z7) {
            P();
        }
        L();
    }

    void d() {
        E.p.a();
        s sVar = this.f9650u;
        if (sVar != null) {
            sVar.a(this.f9632c, this.f9634e, this.f9640k, this.f9642m);
        }
        this.f9632c.o0(null);
        this.f9649t = null;
        this.f9652w = null;
        this.f9651v = null;
        O();
    }

    protected H0 i() {
        if (!s()) {
            C3043d0.a("CameraController", "Camera not initialized.");
            return null;
        }
        if (!v()) {
            C3043d0.a("CameraController", "PreviewView not attached to CameraController.");
            return null;
        }
        H0.a aVarB = new H0.a().b(this.f9632c);
        if (u()) {
            aVarB.b(this.f9634e);
        } else {
            this.f9650u.a(this.f9634e);
        }
        if (t()) {
            aVarB.b(this.f9640k);
        } else {
            this.f9650u.a(this.f9640k);
        }
        if (x()) {
            aVarB.b(this.f9642m);
        } else {
            this.f9650u.a(this.f9642m);
        }
        aVarB.e(this.f9651v);
        Iterator<AbstractC3056k> it = this.f9626H.iterator();
        while (it.hasNext()) {
            aVarB.a(it.next());
        }
        return aVarB.c();
    }

    public com.google.common.util.concurrent.p<Void> k(boolean z7) {
        E.p.a();
        return !r() ? this.f9623E.d(Boolean.valueOf(z7)) : this.f9649t.a().a(z7);
    }

    public int l() {
        E.p.a();
        return this.f9634e.m0();
    }

    public int m() {
        E.p.a();
        return this.f9634e.l0();
    }

    public C1744a n() {
        Map<C1744a.EnumC0141a, C1744a> map = this.f9629K;
        C1744a.EnumC0141a enumC0141a = C1744a.EnumC0141a.SCREEN_FLASH_VIEW;
        if (map.get(enumC0141a) != null) {
            return this.f9629K.get(enumC0141a);
        }
        Map<C1744a.EnumC0141a, C1744a> map2 = this.f9629K;
        C1744a.EnumC0141a enumC0141a2 = C1744a.EnumC0141a.PREVIEW_VIEW;
        if (map2.get(enumC0141a2) != null) {
            return this.f9629K.get(enumC0141a2);
        }
        return null;
    }

    public LiveData<J0> q() {
        E.p.a();
        return this.f9620B;
    }

    public boolean t() {
        E.p.a();
        return w(2);
    }

    public boolean u() {
        E.p.a();
        return w(1);
    }

    public boolean x() {
        E.p.a();
        return w(4);
    }

    AbstractC1601c(Context context, com.google.common.util.concurrent.p<s> pVar) {
        this.f9630a = C3061p.f24686d;
        this.f9631b = 3;
        this.f9643n = new HashMap();
        this.f9644o = S.B.f6084h0;
        this.f9645p = 0;
        C3070z c3070z = C3070z.f24772c;
        this.f9646q = c3070z;
        this.f9647r = c3070z;
        this.f9648s = c1.f534a;
        this.f9655z = true;
        this.f9619A = true;
        this.f9620B = new C1603e<>();
        this.f9621C = new C1603e<>();
        this.f9622D = new C1709w<>(0);
        this.f9623E = new h<>();
        this.f9624F = new h<>();
        this.f9625G = new h<>();
        this.f9626H = new HashSet();
        this.f9629K = new HashMap();
        Context contextA = E.e.a(context);
        this.f9627I = contextA;
        this.f9632c = h();
        this.f9634e = g(null);
        this.f9640k = f(null, null, null);
        this.f9642m = j();
        this.f9628J = G.n.G(pVar, new InterfaceC2621a() {
            @Override
            public final Object apply(Object obj) {
                return this.f9617a.y((s) obj);
            }
        }, F.a.d());
        this.f9653x = new u(contextA);
        this.f9654y = new u.b() {
            @Override
            public final void a(int i7) {
                this.f8239a.z(i7);
            }
        };
    }
}
