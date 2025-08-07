package com.airbnb.lottie;

import P1.q;
import Z1.v;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class a extends Drawable implements Drawable.Callback, Animatable {
    private final ArrayList<o> A;
    private final ValueAnimator.AnimatorUpdateListener B;
    private T1.b C;
    private String D;
    private T1.a E;
    private boolean F;
    private X1.c G;
    private int H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private final Matrix d = new Matrix();
    private P1.d e;
    private final b2.e i;
    private float v;
    private boolean w;
    private boolean y;
    private boolean z;

    class C0060a implements o {
        final String a;

        C0060a(String str) {
            this.a = str;
        }

        @Override
        public void a(P1.d dVar) {
            a.this.b0(this.a);
        }
    }

    class b implements o {
        final int a;
        final int b;

        b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override
        public void a(P1.d dVar) {
            a.this.a0(this.a, this.b);
        }
    }

    class c implements o {
        final int a;

        c(int i) {
            this.a = i;
        }

        @Override
        public void a(P1.d dVar) {
            a.this.T(this.a);
        }
    }

    class d implements o {
        final float a;

        d(float f) {
            this.a = f;
        }

        @Override
        public void a(P1.d dVar) {
            a.this.h0(this.a);
        }
    }

    class e implements o {
        final U1.e a;
        final Object b;
        final c2.c c;

        e(U1.e eVar, Object obj, c2.c cVar) {
            this.a = eVar;
            this.b = obj;
            this.c = cVar;
        }

        @Override
        public void a(P1.d dVar) {
            a.this.d(this.a, this.b, this.c);
        }
    }

    class f implements ValueAnimator.AnimatorUpdateListener {
        f() {
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (a.this.G != null) {
                a.this.G.K(a.this.i.i());
            }
        }
    }

    class g implements o {
        g() {
        }

        @Override
        public void a(P1.d dVar) {
            a.this.L();
        }
    }

    class h implements o {
        h() {
        }

        @Override
        public void a(P1.d dVar) {
            a.this.P();
        }
    }

    class i implements o {
        final int a;

        i(int i) {
            this.a = i;
        }

        @Override
        public void a(P1.d dVar) {
            a.this.c0(this.a);
        }
    }

    class j implements o {
        final float a;

        j(float f) {
            this.a = f;
        }

        @Override
        public void a(P1.d dVar) {
            a.this.e0(this.a);
        }
    }

    class k implements o {
        final int a;

        k(int i) {
            this.a = i;
        }

        @Override
        public void a(P1.d dVar) {
            a.this.X(this.a);
        }
    }

    class l implements o {
        final float a;

        l(float f) {
            this.a = f;
        }

        @Override
        public void a(P1.d dVar) {
            a.this.Z(this.a);
        }
    }

    class m implements o {
        final String a;

        m(String str) {
            this.a = str;
        }

        @Override
        public void a(P1.d dVar) {
            a.this.d0(this.a);
        }
    }

    class n implements o {
        final String a;

        n(String str) {
            this.a = str;
        }

        @Override
        public void a(P1.d dVar) {
            a.this.Y(this.a);
        }
    }

    private interface o {
        void a(P1.d dVar);
    }

    public a() {
        b2.e eVar = new b2.e();
        this.i = eVar;
        this.v = 1.0f;
        this.w = true;
        this.y = false;
        this.z = false;
        this.A = new ArrayList<>();
        f fVar = new f();
        this.B = fVar;
        this.H = 255;
        this.L = true;
        this.M = false;
        eVar.addUpdateListener(fVar);
    }

    private boolean e() {
        return this.w || this.y;
    }

    private float f(Rect rect) {
        return rect.width() / rect.height();
    }

    private boolean g() {
        P1.d dVar = this.e;
        return dVar == null || getBounds().isEmpty() || f(getBounds()) == f(dVar.b());
    }

    private void h() {
        X1.c cVar = new X1.c(this, v.a(this.e), this.e.k(), this.e);
        this.G = cVar;
        if (this.J) {
            cVar.I(true);
        }
    }

    private void k(@NonNull Canvas canvas) {
        if (g()) {
            m(canvas);
        } else {
            l(canvas);
        }
    }

    private void l(Canvas canvas) {
        float f2;
        X1.c cVar = this.G;
        P1.d dVar = this.e;
        if (cVar == null || dVar == null) {
            return;
        }
        Rect bounds = getBounds();
        float fWidth = bounds.width() / dVar.b().width();
        float fHeight = bounds.height() / dVar.b().height();
        int iSave = -1;
        if (this.L) {
            float fMin = Math.min(fWidth, fHeight);
            if (fMin < 1.0f) {
                f2 = 1.0f / fMin;
                fWidth /= f2;
                fHeight /= f2;
            } else {
                f2 = 1.0f;
            }
            if (f2 > 1.0f) {
                iSave = canvas.save();
                float fWidth2 = bounds.width() / 2.0f;
                float fHeight2 = bounds.height() / 2.0f;
                float f3 = fWidth2 * fMin;
                float f4 = fMin * fHeight2;
                canvas.translate(fWidth2 - f3, fHeight2 - f4);
                canvas.scale(f2, f2, f3, f4);
            }
        }
        this.d.reset();
        this.d.preScale(fWidth, fHeight);
        cVar.f(canvas, this.d, this.H);
        if (iSave > 0) {
            canvas.restoreToCount(iSave);
        }
    }

    private void m(Canvas canvas) {
        float f2;
        int iSave;
        X1.c cVar = this.G;
        P1.d dVar = this.e;
        if (cVar == null || dVar == null) {
            return;
        }
        float f3 = this.v;
        float fY = y(canvas, dVar);
        if (f3 > fY) {
            f2 = this.v / fY;
        } else {
            fY = f3;
            f2 = 1.0f;
        }
        if (f2 > 1.0f) {
            iSave = canvas.save();
            float fWidth = dVar.b().width() / 2.0f;
            float fHeight = dVar.b().height() / 2.0f;
            float f4 = fWidth * fY;
            float f5 = fHeight * fY;
            canvas.translate((E() * fWidth) - f4, (E() * fHeight) - f5);
            canvas.scale(f2, f2, f4, f5);
        } else {
            iSave = -1;
        }
        this.d.reset();
        this.d.preScale(fY, fY);
        cVar.f(canvas, this.d, this.H);
        if (iSave > 0) {
            canvas.restoreToCount(iSave);
        }
    }

    private Context r() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private T1.a s() {
        if (getCallback() == null) {
            return null;
        }
        if (this.E == null) {
            this.E = new T1.a(getCallback(), null);
        }
        return this.E;
    }

    private T1.b v() {
        if (getCallback() == null) {
            return null;
        }
        T1.b bVar = this.C;
        if (bVar != null && !bVar.b(r())) {
            this.C = null;
        }
        if (this.C == null) {
            this.C = new T1.b(getCallback(), this.D, null, this.e.j());
        }
        return this.C;
    }

    private float y(@NonNull Canvas canvas, P1.d dVar) {
        return Math.min(canvas.getWidth() / dVar.b().width(), canvas.getHeight() / dVar.b().height());
    }

    public P1.l A() {
        P1.d dVar = this.e;
        if (dVar != null) {
            return dVar.n();
        }
        return null;
    }

    public float B() {
        return this.i.i();
    }

    public int C() {
        return this.i.getRepeatCount();
    }

    @SuppressLint({"WrongConstant"})
    public int D() {
        return this.i.getRepeatMode();
    }

    public float E() {
        return this.v;
    }

    public float F() {
        return this.i.o();
    }

    public q G() {
        return null;
    }

    public Typeface H(String str, String str2) {
        T1.a aVarS = s();
        if (aVarS != null) {
            return aVarS.b(str, str2);
        }
        return null;
    }

    public boolean I() {
        b2.e eVar = this.i;
        if (eVar == null) {
            return false;
        }
        return eVar.isRunning();
    }

    public boolean J() {
        return this.K;
    }

    public void K() {
        this.A.clear();
        this.i.q();
    }

    public void L() {
        if (this.G == null) {
            this.A.add(new g());
            return;
        }
        if (e() || C() == 0) {
            this.i.r();
        }
        if (e()) {
            return;
        }
        T((int) (F() < 0.0f ? z() : x()));
        this.i.h();
    }

    public void M() {
        this.i.removeAllListeners();
    }

    public void N() {
        this.i.removeAllUpdateListeners();
        this.i.addUpdateListener(this.B);
    }

    public List<U1.e> O(U1.e eVar) {
        if (this.G == null) {
            b2.d.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.G.d(eVar, 0, arrayList, new U1.e(new String[0]));
        return arrayList;
    }

    public void P() {
        if (this.G == null) {
            this.A.add(new h());
            return;
        }
        if (e() || C() == 0) {
            this.i.w();
        }
        if (e()) {
            return;
        }
        T((int) (F() < 0.0f ? z() : x()));
        this.i.h();
    }

    public void Q(boolean z) {
        this.K = z;
    }

    public boolean R(P1.d dVar) {
        if (this.e == dVar) {
            return false;
        }
        this.M = false;
        j();
        this.e = dVar;
        h();
        this.i.y(dVar);
        h0(this.i.getAnimatedFraction());
        l0(this.v);
        Iterator it = new ArrayList(this.A).iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar != null) {
                oVar.a(dVar);
            }
            it.remove();
        }
        this.A.clear();
        dVar.v(this.I);
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof ImageView)) {
            return true;
        }
        ImageView imageView = (ImageView) callback;
        imageView.setImageDrawable(null);
        imageView.setImageDrawable(this);
        return true;
    }

    public void S(P1.a aVar) {
        T1.a aVar2 = this.E;
        if (aVar2 != null) {
            aVar2.c(aVar);
        }
    }

    public void T(int i2) {
        if (this.e == null) {
            this.A.add(new c(i2));
        } else {
            this.i.z(i2);
        }
    }

    public void U(boolean z) {
        this.y = z;
    }

    public void V(P1.b bVar) {
        T1.b bVar2 = this.C;
        if (bVar2 != null) {
            bVar2.d(bVar);
        }
    }

    public void W(String str) {
        this.D = str;
    }

    public void X(int i2) {
        if (this.e == null) {
            this.A.add(new k(i2));
        } else {
            this.i.B(i2 + 0.99f);
        }
    }

    public void Y(String str) {
        P1.d dVar = this.e;
        if (dVar == null) {
            this.A.add(new n(str));
            return;
        }
        U1.h hVarL = dVar.l(str);
        if (hVarL != null) {
            X((int) (hVarL.b + hVarL.c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void Z(float f2) {
        P1.d dVar = this.e;
        if (dVar == null) {
            this.A.add(new l(f2));
        } else {
            X((int) b2.g.k(dVar.p(), this.e.f(), f2));
        }
    }

    public void a0(int i2, int i3) {
        if (this.e == null) {
            this.A.add(new b(i2, i3));
        } else {
            this.i.C(i2, i3 + 0.99f);
        }
    }

    public void b0(String str) {
        P1.d dVar = this.e;
        if (dVar == null) {
            this.A.add(new C0060a(str));
            return;
        }
        U1.h hVarL = dVar.l(str);
        if (hVarL != null) {
            int i2 = (int) hVarL.b;
            a0(i2, ((int) hVarL.c) + i2);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public void c(Animator.AnimatorListener animatorListener) {
        this.i.addListener(animatorListener);
    }

    public void c0(int i2) {
        if (this.e == null) {
            this.A.add(new i(i2));
        } else {
            this.i.D(i2);
        }
    }

    public <T> void d(U1.e eVar, T t, c2.c<T> cVar) {
        X1.c cVar2 = this.G;
        if (cVar2 == null) {
            this.A.add(new e(eVar, t, cVar));
            return;
        }
        boolean zIsEmpty = true;
        if (eVar == U1.e.c) {
            cVar2.g(t, cVar);
        } else if (eVar.d() != null) {
            eVar.d().g(t, cVar);
        } else {
            List<U1.e> listO = O(eVar);
            for (int i2 = 0; i2 < listO.size(); i2++) {
                listO.get(i2).d().g(t, cVar);
            }
            zIsEmpty = true ^ listO.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t == P1.j.E) {
                h0(B());
            }
        }
    }

    public void d0(String str) {
        P1.d dVar = this.e;
        if (dVar == null) {
            this.A.add(new m(str));
            return;
        }
        U1.h hVarL = dVar.l(str);
        if (hVarL != null) {
            c0((int) hVarL.b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    @Override
    public void draw(@NonNull Canvas canvas) {
        this.M = false;
        P1.c.a("Drawable#draw");
        if (this.z) {
            try {
                k(canvas);
            } catch (Throwable th) {
                b2.d.b("Lottie crashed in draw!", th);
            }
        } else {
            k(canvas);
        }
        P1.c.b("Drawable#draw");
    }

    public void e0(float f2) {
        P1.d dVar = this.e;
        if (dVar == null) {
            this.A.add(new j(f2));
        } else {
            c0((int) b2.g.k(dVar.p(), this.e.f(), f2));
        }
    }

    public void f0(boolean z) {
        if (this.J == z) {
            return;
        }
        this.J = z;
        X1.c cVar = this.G;
        if (cVar != null) {
            cVar.I(z);
        }
    }

    public void g0(boolean z) {
        this.I = z;
        P1.d dVar = this.e;
        if (dVar != null) {
            dVar.v(z);
        }
    }

    @Override
    public int getAlpha() {
        return this.H;
    }

    @Override
    public int getIntrinsicHeight() {
        if (this.e == null) {
            return -1;
        }
        return (int) (r0.b().height() * E());
    }

    @Override
    public int getIntrinsicWidth() {
        if (this.e == null) {
            return -1;
        }
        return (int) (r0.b().width() * E());
    }

    @Override
    public int getOpacity() {
        return -3;
    }

    public void h0(float f2) {
        if (this.e == null) {
            this.A.add(new d(f2));
            return;
        }
        P1.c.a("Drawable#setProgress");
        this.i.z(this.e.h(f2));
        P1.c.b("Drawable#setProgress");
    }

    public void i() {
        this.A.clear();
        this.i.cancel();
    }

    public void i0(int i2) {
        this.i.setRepeatCount(i2);
    }

    @Override
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override
    public void invalidateSelf() {
        if (this.M) {
            return;
        }
        this.M = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override
    public boolean isRunning() {
        return I();
    }

    public void j() {
        if (this.i.isRunning()) {
            this.i.cancel();
        }
        this.e = null;
        this.G = null;
        this.C = null;
        this.i.g();
        invalidateSelf();
    }

    public void j0(int i2) {
        this.i.setRepeatMode(i2);
    }

    public void k0(boolean z) {
        this.z = z;
    }

    public void l0(float f2) {
        this.v = f2;
    }

    public void m0(float f2) {
        this.i.E(f2);
    }

    public void n(boolean z) {
        if (this.F == z) {
            return;
        }
        this.F = z;
        if (this.e != null) {
            h();
        }
    }

    void n0(Boolean bool) {
        this.w = bool.booleanValue();
    }

    public boolean o() {
        return this.F;
    }

    public void o0(q qVar) {
    }

    public void p() {
        this.A.clear();
        this.i.h();
    }

    public boolean p0() {
        return this.e.c().i() > 0;
    }

    public P1.d q() {
        return this.e;
    }

    @Override
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j2);
    }

    @Override
    public void setAlpha(int i2) {
        this.H = i2;
        invalidateSelf();
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        b2.d.c("Use addColorFilter instead.");
    }

    @Override
    public void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || ((View) callback).isInEditMode()) {
            return;
        }
        L();
    }

    @Override
    public void stop() {
        p();
    }

    public int t() {
        return (int) this.i.j();
    }

    public Bitmap u(String str) {
        T1.b bVarV = v();
        if (bVarV != null) {
            return bVarV.a(str);
        }
        P1.d dVar = this.e;
        P1.f fVar = dVar == null ? null : dVar.j().get(str);
        if (fVar != null) {
            return fVar.a();
        }
        return null;
    }

    @Override
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public String w() {
        return this.D;
    }

    public float x() {
        return this.i.l();
    }

    public float z() {
        return this.i.n();
    }
}
