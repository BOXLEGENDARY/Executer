package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import c4.C1748d;
import c4.C1755k;
import com.google.android.material.carousel.f;
import d4.C2388a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k0.BAKp.xAQOwX;
import s0.C2870a;

public class CarouselLayoutManager extends RecyclerView.p implements com.google.android.material.carousel.b, RecyclerView.z.b {

    private int f17536A;

    private Map<Integer, f> f17537B;

    private com.google.android.material.carousel.c f17538C;

    private final View.OnLayoutChangeListener f17539D;

    private int f17540E;

    private int f17541F;

    private int f17542G;

    int f17543s;

    int f17544t;

    int f17545u;

    private boolean f17546v;

    private final c f17547w;

    private com.google.android.material.carousel.d f17548x;

    private g f17549y;

    private f f17550z;

    class a extends m {
        a(Context context) {
            super(context);
        }

        @Override
        public PointF a(int i7) {
            return CarouselLayoutManager.this.c(i7);
        }

        @Override
        public int t(View view, int i7) {
            if (CarouselLayoutManager.this.f17549y == null || !CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.g2(carouselLayoutManager.l0(view));
        }

        @Override
        public int u(View view, int i7) {
            if (CarouselLayoutManager.this.f17549y == null || CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.g2(carouselLayoutManager.l0(view));
        }
    }

    private static final class b {

        final View f17552a;

        final float f17553b;

        final float f17554c;

        final d f17555d;

        b(View view, float f7, float f8, d dVar) {
            this.f17552a = view;
            this.f17553b = f7;
            this.f17554c = f8;
            this.f17555d = dVar;
        }
    }

    private static class c extends RecyclerView.o {

        private final Paint f17556a;

        private List<f.c> f17557b;

        c() {
            Paint paint = new Paint();
            this.f17556a = paint;
            this.f17557b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a2) {
            super.i(canvas, recyclerView, a2);
            this.f17556a.setStrokeWidth(recyclerView.getResources().getDimension(C1748d.f12825n));
            for (f.c cVar : this.f17557b) {
                this.f17556a.setColor(androidx.core.graphics.a.c(-65281, -16776961, cVar.f17588c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).f()) {
                    canvas.drawLine(cVar.f17587b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).A2(), cVar.f17587b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).v2(), this.f17556a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).x2(), cVar.f17587b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).y2(), cVar.f17587b, this.f17556a);
                }
            }
        }

        void j(List<f.c> list) {
            this.f17557b = Collections.unmodifiableList(list);
        }
    }

    private static class d {

        final f.c f17558a;

        final f.c f17559b;

        d(f.c cVar, f.c cVar2) {
            x0.g.a(cVar.f17586a <= cVar2.f17586a);
            this.f17558a = cVar;
            this.f17559b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new i());
    }

    public int A2() {
        return this.f17538C.l();
    }

    private int B2() {
        if (R() || !this.f17548x.f()) {
            return 0;
        }
        return u2() == 1 ? h0() : j0();
    }

    private int C2(int i7, f fVar) {
        return F2() ? (int) (((n2() - fVar.h().f17586a) - (i7 * fVar.f())) - (fVar.f() / 2.0f)) : (int) (((i7 * fVar.f()) - fVar.a().f17586a) + (fVar.f() / 2.0f));
    }

    private int D2(int i7, f fVar) {
        int i8 = Integer.MAX_VALUE;
        for (f.c cVar : fVar.e()) {
            float f7 = (i7 * fVar.f()) + (fVar.f() / 2.0f);
            int iN2 = (F2() ? (int) ((n2() - cVar.f17586a) - f7) : (int) (f7 - cVar.f17586a)) - this.f17543s;
            if (Math.abs(i8) > Math.abs(iN2)) {
                i8 = iN2;
            }
        }
        return i8;
    }

    private static d E2(List<f.c> list, float f7, boolean z7) {
        float f8 = Float.MAX_VALUE;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        float f9 = -3.4028235E38f;
        float f10 = Float.MAX_VALUE;
        float f11 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < list.size(); i11++) {
            f.c cVar = list.get(i11);
            float f12 = z7 ? cVar.f17587b : cVar.f17586a;
            float fAbs = Math.abs(f12 - f7);
            if (f12 <= f7 && fAbs <= f8) {
                i7 = i11;
                f8 = fAbs;
            }
            if (f12 > f7 && fAbs <= f10) {
                i9 = i11;
                f10 = fAbs;
            }
            if (f12 <= f11) {
                i8 = i11;
                f11 = f12;
            }
            if (f12 > f9) {
                i10 = i11;
                f9 = f12;
            }
        }
        if (i7 == -1) {
            i7 = i8;
        }
        if (i9 == -1) {
            i9 = i10;
        }
        return new d(list.get(i7), list.get(i9));
    }

    private boolean G2(float f7, d dVar) {
        float fZ1 = Z1(f7, s2(f7, dVar) / 2.0f);
        if (F2()) {
            if (fZ1 >= 0.0f) {
                return false;
            }
        } else if (fZ1 <= n2()) {
            return false;
        }
        return true;
    }

    private boolean H2(float f7, d dVar) {
        float fY1 = Y1(f7, s2(f7, dVar) / 2.0f);
        if (F2()) {
            if (fY1 <= n2()) {
                return false;
            }
        } else if (fY1 >= 0.0f) {
            return false;
        }
        return true;
    }

    public void I2(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        if (i7 == i11 && i8 == i12 && i9 == i13 && i10 == i14) {
            return;
        }
        view.post(new Runnable() {
            @Override
            public final void run() {
                this.f20961d.N2();
            }
        });
    }

    private void J2() {
        if (this.f17546v && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", xAQOwX.pKCTDHSg);
            for (int i7 = 0; i7 < O(); i7++) {
                View viewN = N(i7);
                Log.d("CarouselLayoutManager", "item position " + l0(viewN) + ", center:" + o2(viewN) + ", child index:" + i7);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    private b K2(RecyclerView.w wVar, float f7, int i7) {
        View viewO = wVar.o(i7);
        E0(viewO, 0, 0);
        float fY1 = Y1(f7, this.f17550z.f() / 2.0f);
        d dVarE2 = E2(this.f17550z.g(), fY1, false);
        return new b(viewO, fY1, d2(viewO, fY1, dVarE2), dVarE2);
    }

    private float L2(View view, float f7, float f8, Rect rect) {
        float fY1 = Y1(f7, f8);
        d dVarE2 = E2(this.f17550z.g(), fY1, false);
        float fD2 = d2(view, fY1, dVarE2);
        super.U(view, rect);
        V2(view, fY1, dVarE2);
        this.f17538C.o(view, rect, f8, fD2);
        return fD2;
    }

    private void M2(RecyclerView.w wVar) {
        View viewO = wVar.o(0);
        E0(viewO, 0, 0);
        f fVarG = this.f17548x.g(this, viewO);
        if (F2()) {
            fVarG = f.n(fVarG, n2());
        }
        this.f17549y = g.f(this, fVarG, p2(), r2(), B2());
    }

    public void N2() {
        this.f17549y = null;
        x1();
    }

    private void O2(RecyclerView.w wVar) {
        while (O() > 0) {
            View viewN = N(0);
            float fO2 = o2(viewN);
            if (!H2(fO2, E2(this.f17550z.g(), fO2, true))) {
                break;
            } else {
                q1(viewN, wVar);
            }
        }
        while (O() - 1 >= 0) {
            View viewN2 = N(O() - 1);
            float fO22 = o2(viewN2);
            if (!G2(fO22, E2(this.f17550z.g(), fO22, true))) {
                return;
            } else {
                q1(viewN2, wVar);
            }
        }
    }

    private int P2(int i7, RecyclerView.w wVar, RecyclerView.A a2) {
        if (O() == 0 || i7 == 0) {
            return 0;
        }
        if (this.f17549y == null) {
            M2(wVar);
        }
        int iH2 = h2(i7, this.f17543s, this.f17544t, this.f17545u);
        this.f17543s += iH2;
        W2(this.f17549y);
        float f7 = this.f17550z.f() / 2.0f;
        float fE2 = e2(l0(N(0)));
        Rect rect = new Rect();
        float f8 = F2() ? this.f17550z.h().f17587b : this.f17550z.a().f17587b;
        float f9 = Float.MAX_VALUE;
        for (int i8 = 0; i8 < O(); i8++) {
            View viewN = N(i8);
            float fAbs = Math.abs(f8 - L2(viewN, fE2, f7, rect));
            if (viewN != null && fAbs < f9) {
                this.f17541F = l0(viewN);
                f9 = fAbs;
            }
            fE2 = Y1(fE2, this.f17550z.f());
        }
        k2(wVar, a2);
        return iH2;
    }

    private void Q2(RecyclerView recyclerView, int i7) {
        if (f()) {
            recyclerView.scrollBy(i7, 0);
        } else {
            recyclerView.scrollBy(0, i7);
        }
    }

    private void S2(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1755k.f13209l0);
            R2(typedArrayObtainStyledAttributes.getInt(C1755k.f13216m0, 0));
            U2(typedArrayObtainStyledAttributes.getInt(C1755k.f13143c5, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void V2(View view, float f7, d dVar) {
        if (view instanceof h) {
            f.c cVar = dVar.f17558a;
            float f8 = cVar.f17588c;
            f.c cVar2 = dVar.f17559b;
            float fB = C2388a.b(f8, cVar2.f17588c, cVar.f17586a, cVar2.f17586a, f7);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFF = this.f17538C.f(height, width, C2388a.b(0.0f, height / 2.0f, 0.0f, 1.0f, fB), C2388a.b(0.0f, width / 2.0f, 0.0f, 1.0f, fB));
            float fD2 = d2(view, f7, dVar);
            RectF rectF = new RectF(fD2 - (rectFF.width() / 2.0f), fD2 - (rectFF.height() / 2.0f), fD2 + (rectFF.width() / 2.0f), (rectFF.height() / 2.0f) + fD2);
            RectF rectF2 = new RectF(x2(), A2(), y2(), v2());
            if (this.f17548x.f()) {
                this.f17538C.a(rectFF, rectF, rectF2);
            }
            this.f17538C.n(rectFF, rectF, rectF2);
            ((h) view).a(rectFF);
        }
    }

    private void W2(g gVar) {
        int i7 = this.f17545u;
        int i8 = this.f17544t;
        if (i7 <= i8) {
            this.f17550z = F2() ? gVar.h() : gVar.l();
        } else {
            this.f17550z = gVar.j(this.f17543s, i8, i7);
        }
        this.f17547w.j(this.f17550z.g());
    }

    private void X1(View view, int i7, b bVar) {
        float f7 = this.f17550z.f() / 2.0f;
        j(view, i7);
        float f8 = bVar.f17554c;
        this.f17538C.m(view, (int) (f8 - f7), (int) (f8 + f7));
        V2(view, bVar.f17553b, bVar.f17555d);
    }

    private void X2() {
        int iE = e();
        int i7 = this.f17540E;
        if (iE == i7 || this.f17549y == null) {
            return;
        }
        if (this.f17548x.h(this, i7)) {
            N2();
        }
        this.f17540E = iE;
    }

    private float Y1(float f7, float f8) {
        return F2() ? f7 - f8 : f7 + f8;
    }

    private void Y2() {
        if (!this.f17546v || O() < 1) {
            return;
        }
        int i7 = 0;
        while (i7 < O() - 1) {
            int iL0 = l0(N(i7));
            int i8 = i7 + 1;
            int iL02 = l0(N(i8));
            if (iL0 > iL02) {
                J2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i7 + "] had adapter position [" + iL0 + "] and child at index [" + i8 + "] had adapter position [" + iL02 + "].");
            }
            i7 = i8;
        }
    }

    private float Z1(float f7, float f8) {
        return F2() ? f7 + f8 : f7 - f8;
    }

    private void a2(RecyclerView.w wVar, int i7, int i8) {
        if (i7 < 0 || i7 >= e()) {
            return;
        }
        b bVarK2 = K2(wVar, e2(i7), i7);
        X1(bVarK2.f17552a, i8, bVarK2);
    }

    private void b2(RecyclerView.w wVar, RecyclerView.A a2, int i7) {
        float fE2 = e2(i7);
        while (i7 < a2.b()) {
            b bVarK2 = K2(wVar, fE2, i7);
            if (G2(bVarK2.f17554c, bVarK2.f17555d)) {
                return;
            }
            fE2 = Y1(fE2, this.f17550z.f());
            if (!H2(bVarK2.f17554c, bVarK2.f17555d)) {
                X1(bVarK2.f17552a, -1, bVarK2);
            }
            i7++;
        }
    }

    private void c2(RecyclerView.w wVar, int i7) {
        float fE2 = e2(i7);
        while (i7 >= 0) {
            b bVarK2 = K2(wVar, fE2, i7);
            if (H2(bVarK2.f17554c, bVarK2.f17555d)) {
                return;
            }
            fE2 = Z1(fE2, this.f17550z.f());
            if (!G2(bVarK2.f17554c, bVarK2.f17555d)) {
                X1(bVarK2.f17552a, 0, bVarK2);
            }
            i7--;
        }
    }

    private float d2(View view, float f7, d dVar) {
        f.c cVar = dVar.f17558a;
        float f8 = cVar.f17587b;
        f.c cVar2 = dVar.f17559b;
        float fB = C2388a.b(f8, cVar2.f17587b, cVar.f17586a, cVar2.f17586a, f7);
        if (dVar.f17559b != this.f17550z.c() && dVar.f17558a != this.f17550z.j()) {
            return fB;
        }
        float fE = this.f17538C.e((RecyclerView.q) view.getLayoutParams()) / this.f17550z.f();
        f.c cVar3 = dVar.f17559b;
        return fB + ((f7 - cVar3.f17586a) * ((1.0f - cVar3.f17588c) + fE));
    }

    private float e2(int i7) {
        return Y1(z2() - this.f17543s, this.f17550z.f() * i7);
    }

    private int f2(RecyclerView.A a2, g gVar) {
        boolean zF2 = F2();
        f fVarL = zF2 ? gVar.l() : gVar.h();
        f.c cVarA = zF2 ? fVarL.a() : fVarL.h();
        int iB = (int) (((((a2.b() - 1) * fVarL.f()) * (zF2 ? -1.0f : 1.0f)) - (cVarA.f17586a - z2())) + (w2() - cVarA.f17586a) + (zF2 ? -cVarA.f17592g : cVarA.f17593h));
        return zF2 ? Math.min(0, iB) : Math.max(0, iB);
    }

    private static int h2(int i7, int i8, int i9, int i10) {
        int i11 = i8 + i7;
        return i11 < i9 ? i9 - i8 : i11 > i10 ? i10 - i8 : i7;
    }

    private int i2(g gVar) {
        boolean zF2 = F2();
        f fVarH = zF2 ? gVar.h() : gVar.l();
        return (int) (z2() - Z1((zF2 ? fVarH.h() : fVarH.a()).f17586a, fVarH.f() / 2.0f));
    }

    private int j2(int i7) {
        int iU2 = u2();
        if (i7 == 1) {
            return -1;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 17) {
            if (iU2 == 0) {
                return F2() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i7 == 33) {
            return iU2 == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i7 == 66) {
            if (iU2 == 0) {
                return F2() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i7 == 130) {
            return iU2 == 1 ? 1 : Integer.MIN_VALUE;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i7);
        return Integer.MIN_VALUE;
    }

    private void k2(RecyclerView.w wVar, RecyclerView.A a2) {
        O2(wVar);
        if (O() == 0) {
            c2(wVar, this.f17536A - 1);
            b2(wVar, a2, this.f17536A);
        } else {
            int iL0 = l0(N(0));
            int iL02 = l0(N(O() - 1));
            c2(wVar, iL0 - 1);
            b2(wVar, a2, iL02 + 1);
        }
        Y2();
    }

    private View l2() {
        return N(F2() ? 0 : O() - 1);
    }

    private View m2() {
        return N(F2() ? O() - 1 : 0);
    }

    private int n2() {
        return f() ? a() : b();
    }

    private float o2(View view) {
        super.U(view, new Rect());
        return f() ? r0.centerX() : r0.centerY();
    }

    private int p2() {
        int i7;
        int i8;
        if (O() <= 0) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) N(0).getLayoutParams();
        if (this.f17538C.f17568a == 0) {
            i7 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
            i8 = ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        } else {
            i7 = ((ViewGroup.MarginLayoutParams) qVar).topMargin;
            i8 = ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }
        return i7 + i8;
    }

    private f q2(int i7) {
        f fVar;
        Map<Integer, f> map = this.f17537B;
        return (map == null || (fVar = map.get(Integer.valueOf(C2870a.c(i7, 0, Math.max(0, e() + (-1)))))) == null) ? this.f17549y.g() : fVar;
    }

    private int r2() {
        if (R() || !this.f17548x.f()) {
            return 0;
        }
        return u2() == 1 ? k0() : i0();
    }

    private float s2(float f7, d dVar) {
        f.c cVar = dVar.f17558a;
        float f8 = cVar.f17589d;
        f.c cVar2 = dVar.f17559b;
        return C2388a.b(f8, cVar2.f17589d, cVar.f17587b, cVar2.f17587b, f7);
    }

    public int v2() {
        return this.f17538C.g();
    }

    private int w2() {
        return this.f17538C.h();
    }

    public int x2() {
        return this.f17538C.i();
    }

    public int y2() {
        return this.f17538C.j();
    }

    private int z2() {
        return this.f17538C.k();
    }

    @Override
    public int A(RecyclerView.A a2) {
        return this.f17545u - this.f17544t;
    }

    @Override
    public int A1(int i7, RecyclerView.w wVar, RecyclerView.A a2) {
        if (p()) {
            return P2(i7, wVar, a2);
        }
        return 0;
    }

    @Override
    public void B1(int i7) {
        this.f17541F = i7;
        if (this.f17549y == null) {
            return;
        }
        this.f17543s = C2(i7, q2(i7));
        this.f17536A = C2870a.c(i7, 0, Math.max(0, e() - 1));
        W2(this.f17549y);
        x1();
    }

    @Override
    public int C1(int i7, RecyclerView.w wVar, RecyclerView.A a2) {
        if (q()) {
            return P2(i7, wVar, a2);
        }
        return 0;
    }

    @Override
    public void E0(View view, int i7, int i8) {
        if (!(view instanceof h)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        Rect rect = new Rect();
        o(view, rect);
        int i9 = i7 + rect.left + rect.right;
        int i10 = i8 + rect.top + rect.bottom;
        g gVar = this.f17549y;
        float f7 = (gVar == null || this.f17538C.f17568a != 0) ? ((ViewGroup.MarginLayoutParams) qVar).width : gVar.g().f();
        g gVar2 = this.f17549y;
        view.measure(RecyclerView.p.P(s0(), t0(), i0() + j0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i9, (int) f7, p()), RecyclerView.p.P(b0(), c0(), k0() + h0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i10, (int) ((gVar2 == null || this.f17538C.f17568a != 1) ? ((ViewGroup.MarginLayoutParams) qVar).height : gVar2.g().f()), q()));
    }

    boolean F2() {
        return f() && d0() == 1;
    }

    @Override
    public RecyclerView.q I() {
        return new RecyclerView.q(-2, -2);
    }

    @Override
    public void K0(RecyclerView recyclerView) {
        super.K0(recyclerView);
        this.f17548x.e(recyclerView.getContext());
        N2();
        recyclerView.addOnLayoutChangeListener(this.f17539D);
    }

    @Override
    public void M0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.M0(recyclerView, wVar);
        recyclerView.removeOnLayoutChangeListener(this.f17539D);
    }

    @Override
    public void M1(RecyclerView recyclerView, RecyclerView.A a2, int i7) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i7);
        N1(aVar);
    }

    @Override
    public View N0(View view, int i7, RecyclerView.w wVar, RecyclerView.A a2) {
        int iJ2;
        if (O() == 0 || (iJ2 = j2(i7)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iJ2 == -1) {
            if (l0(view) == 0) {
                return null;
            }
            a2(wVar, l0(N(0)) - 1, 0);
            return m2();
        }
        if (l0(view) == e() - 1) {
            return null;
        }
        a2(wVar, l0(N(O() - 1)) + 1, -1);
        return l2();
    }

    @Override
    public void O0(AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(l0(N(0)));
            accessibilityEvent.setToIndex(l0(N(O() - 1)));
        }
    }

    public void R2(int i7) {
        this.f17542G = i7;
        N2();
    }

    public void T2(com.google.android.material.carousel.d dVar) {
        this.f17548x = dVar;
        N2();
    }

    @Override
    public void U(View view, Rect rect) {
        super.U(view, rect);
        float fCenterY = rect.centerY();
        if (f()) {
            fCenterY = rect.centerX();
        }
        float fS2 = s2(fCenterY, E2(this.f17550z.g(), fCenterY, true));
        float fWidth = f() ? (rect.width() - fS2) / 2.0f : 0.0f;
        float fHeight = f() ? 0.0f : (rect.height() - fS2) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public void U2(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i7);
        }
        l(null);
        com.google.android.material.carousel.c cVar = this.f17538C;
        if (cVar == null || i7 != cVar.f17568a) {
            this.f17538C = com.google.android.material.carousel.c.c(this, i7);
            N2();
        }
    }

    @Override
    public void V0(RecyclerView recyclerView, int i7, int i8) {
        super.V0(recyclerView, i7, i8);
        X2();
    }

    @Override
    public void Y0(RecyclerView recyclerView, int i7, int i8) {
        super.Y0(recyclerView, i7, i8);
        X2();
    }

    @Override
    public int a() {
        return s0();
    }

    @Override
    public int b() {
        return b0();
    }

    @Override
    public void b1(RecyclerView.w wVar, RecyclerView.A a2) {
        if (a2.b() <= 0 || n2() <= 0.0f) {
            o1(wVar);
            this.f17536A = 0;
            return;
        }
        boolean zF2 = F2();
        boolean z7 = this.f17549y == null;
        if (z7) {
            M2(wVar);
        }
        int iI2 = i2(this.f17549y);
        int iF2 = f2(a2, this.f17549y);
        this.f17544t = zF2 ? iF2 : iI2;
        if (zF2) {
            iF2 = iI2;
        }
        this.f17545u = iF2;
        if (z7) {
            this.f17543s = iI2;
            this.f17537B = this.f17549y.i(e(), this.f17544t, this.f17545u, F2());
            int i7 = this.f17541F;
            if (i7 != -1) {
                this.f17543s = C2(i7, q2(i7));
            }
        }
        int i8 = this.f17543s;
        this.f17543s = i8 + h2(0, i8, this.f17544t, this.f17545u);
        this.f17536A = C2870a.c(this.f17536A, 0, a2.b());
        W2(this.f17549y);
        B(wVar);
        k2(wVar, a2);
        this.f17540E = e();
    }

    @Override
    public PointF c(int i7) {
        if (this.f17549y == null) {
            return null;
        }
        int iT2 = t2(i7, q2(i7));
        return f() ? new PointF(iT2, 0.0f) : new PointF(0.0f, iT2);
    }

    @Override
    public void c1(RecyclerView.A a2) {
        super.c1(a2);
        if (O() == 0) {
            this.f17536A = 0;
        } else {
            this.f17536A = l0(N(0));
        }
        Y2();
    }

    @Override
    public int d() {
        return this.f17542G;
    }

    @Override
    public boolean f() {
        return this.f17538C.f17568a == 0;
    }

    int g2(int i7) {
        return (int) (this.f17543s - C2(i7, q2(i7)));
    }

    @Override
    public boolean p() {
        return f();
    }

    @Override
    public boolean q() {
        return !f();
    }

    int t2(int i7, f fVar) {
        return C2(i7, fVar) - this.f17543s;
    }

    public int u2() {
        return this.f17538C.f17568a;
    }

    @Override
    public int v(RecyclerView.A a2) {
        if (O() == 0 || this.f17549y == null || e() <= 1) {
            return 0;
        }
        return (int) (s0() * (this.f17549y.g().f() / x(a2)));
    }

    @Override
    public int w(RecyclerView.A a2) {
        return this.f17543s;
    }

    @Override
    public boolean w0() {
        return true;
    }

    @Override
    public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean z7, boolean z8) {
        int iD2;
        if (this.f17549y == null || (iD2 = D2(l0(view), q2(l0(view)))) == 0) {
            return false;
        }
        Q2(recyclerView, D2(l0(view), this.f17549y.j(this.f17543s + h2(iD2, this.f17543s, this.f17544t, this.f17545u), this.f17544t, this.f17545u)));
        return true;
    }

    @Override
    public int x(RecyclerView.A a2) {
        return this.f17545u - this.f17544t;
    }

    @Override
    public int y(RecyclerView.A a2) {
        if (O() == 0 || this.f17549y == null || e() <= 1) {
            return 0;
        }
        return (int) (b0() * (this.f17549y.g().f() / A(a2)));
    }

    @Override
    public int z(RecyclerView.A a2) {
        return this.f17543s;
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d dVar) {
        this(dVar, 0);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d dVar, int i7) {
        this.f17546v = false;
        this.f17547w = new c();
        this.f17536A = 0;
        this.f17539D = new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                this.f20960a.I2(view, i8, i9, i10, i11, i12, i13, i14, i15);
            }
        };
        this.f17541F = -1;
        this.f17542G = 0;
        T2(dVar);
        U2(i7);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f17546v = false;
        this.f17547w = new c();
        this.f17536A = 0;
        this.f17539D = new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view, int i82, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                this.f20960a.I2(view, i82, i9, i10, i11, i12, i13, i14, i15);
            }
        };
        this.f17541F = -1;
        this.f17542G = 0;
        T2(new i());
        S2(context, attributeSet);
    }
}
