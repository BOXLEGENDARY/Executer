package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.Z;

public abstract class a implements View.OnTouchListener {

    private static final int f10765K = ViewConfiguration.getTapTimeout();

    private int f10766A;

    private boolean f10770E;

    boolean f10771F;

    boolean f10772G;

    boolean f10773H;

    private boolean f10774I;

    private boolean f10775J;

    final View f10778i;

    private Runnable f10779v;

    private int f10782z;

    final C0091a f10776d = new C0091a();

    private final Interpolator f10777e = new AccelerateInterpolator();

    private float[] f10780w = {0.0f, 0.0f};

    private float[] f10781y = {Float.MAX_VALUE, Float.MAX_VALUE};

    private float[] f10767B = {0.0f, 0.0f};

    private float[] f10768C = {0.0f, 0.0f};

    private float[] f10769D = {Float.MAX_VALUE, Float.MAX_VALUE};

    private static class C0091a {

        private int f10783a;

        private int f10784b;

        private float f10785c;

        private float f10786d;

        private float f10792j;

        private int f10793k;

        private long f10787e = Long.MIN_VALUE;

        private long f10791i = -1;

        private long f10788f = 0;

        private int f10789g = 0;

        private int f10790h = 0;

        C0091a() {
        }

        private float e(long j7) {
            if (j7 < this.f10787e) {
                return 0.0f;
            }
            long j8 = this.f10791i;
            if (j8 < 0 || j7 < j8) {
                return a.o((j7 - r0) / this.f10783a, 0.0f, 1.0f) * 0.5f;
            }
            float f7 = this.f10792j;
            return (1.0f - f7) + (f7 * a.o((j7 - j8) / this.f10793k, 0.0f, 1.0f));
        }

        private float g(float f7) {
            return ((-4.0f) * f7 * f7) + (f7 * 4.0f);
        }

        public void a() {
            if (this.f10788f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j7 = jCurrentAnimationTimeMillis - this.f10788f;
            this.f10788f = jCurrentAnimationTimeMillis;
            float f7 = j7 * fG;
            this.f10789g = (int) (this.f10785c * f7);
            this.f10790h = (int) (f7 * this.f10786d);
        }

        public int b() {
            return this.f10789g;
        }

        public int c() {
            return this.f10790h;
        }

        public int d() {
            float f7 = this.f10785c;
            return (int) (f7 / Math.abs(f7));
        }

        public int f() {
            float f7 = this.f10786d;
            return (int) (f7 / Math.abs(f7));
        }

        public boolean h() {
            return this.f10791i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f10791i + ((long) this.f10793k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f10793k = a.p((int) (jCurrentAnimationTimeMillis - this.f10787e), 0, this.f10784b);
            this.f10792j = e(jCurrentAnimationTimeMillis);
            this.f10791i = jCurrentAnimationTimeMillis;
        }

        public void j(int i7) {
            this.f10784b = i7;
        }

        public void k(int i7) {
            this.f10783a = i7;
        }

        public void l(float f7, float f8) {
            this.f10785c = f7;
            this.f10786d = f8;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f10787e = jCurrentAnimationTimeMillis;
            this.f10791i = -1L;
            this.f10788f = jCurrentAnimationTimeMillis;
            this.f10792j = 0.5f;
            this.f10789g = 0;
            this.f10790h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override
        public void run() {
            a aVar = a.this;
            if (aVar.f10773H) {
                if (aVar.f10771F) {
                    aVar.f10771F = false;
                    aVar.f10776d.m();
                }
                C0091a c0091a = a.this.f10776d;
                if (c0091a.h() || !a.this.E()) {
                    a.this.f10773H = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f10772G) {
                    aVar2.f10772G = false;
                    aVar2.d();
                }
                c0091a.a();
                a.this.t(c0091a.b(), c0091a.c());
                Z.f0(a.this.f10778i, this);
            }
        }
    }

    public a(View view) {
        this.f10778i = view;
        float f7 = Resources.getSystem().getDisplayMetrics().density;
        float f8 = (int) ((1575.0f * f7) + 0.5f);
        y(f8, f8);
        float f9 = (int) ((f7 * 315.0f) + 0.5f);
        z(f9, f9);
        v(1);
        x(Float.MAX_VALUE, Float.MAX_VALUE);
        C(0.2f, 0.2f);
        D(1.0f, 1.0f);
        u(f10765K);
        B(500);
        A(500);
    }

    private void F() {
        int i7;
        if (this.f10779v == null) {
            this.f10779v = new b();
        }
        this.f10773H = true;
        this.f10771F = true;
        if (this.f10770E || (i7 = this.f10766A) <= 0) {
            this.f10779v.run();
        } else {
            Z.g0(this.f10778i, this.f10779v, i7);
        }
        this.f10770E = true;
    }

    private float g(int i7, float f7, float f8, float f9) {
        float fR = r(this.f10780w[i7], f8, this.f10781y[i7], f7);
        if (fR == 0.0f) {
            return 0.0f;
        }
        float f10 = this.f10767B[i7];
        float f11 = this.f10768C[i7];
        float f12 = this.f10769D[i7];
        float f13 = f10 * f9;
        return fR > 0.0f ? o(fR * f13, f11, f12) : -o((-fR) * f13, f11, f12);
    }

    static float o(float f7, float f8, float f9) {
        return f7 > f9 ? f9 : f7 < f8 ? f8 : f7;
    }

    static int p(int i7, int i8, int i9) {
        return i7 > i9 ? i9 : i7 < i8 ? i8 : i7;
    }

    private float q(float f7, float f8) {
        if (f8 == 0.0f) {
            return 0.0f;
        }
        int i7 = this.f10782z;
        if (i7 == 0 || i7 == 1) {
            if (f7 < f8) {
                if (f7 >= 0.0f) {
                    return 1.0f - (f7 / f8);
                }
                if (this.f10773H && i7 == 1) {
                    return 1.0f;
                }
            }
        } else if (i7 == 2 && f7 < 0.0f) {
            return f7 / (-f8);
        }
        return 0.0f;
    }

    private float r(float f7, float f8, float f9, float f10) {
        float interpolation;
        float fO = o(f7 * f8, 0.0f, f9);
        float fQ = q(f8 - f10, fO) - q(f10, fO);
        if (fQ < 0.0f) {
            interpolation = -this.f10777e.getInterpolation(-fQ);
        } else {
            if (fQ <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f10777e.getInterpolation(fQ);
        }
        return o(interpolation, -1.0f, 1.0f);
    }

    private void s() {
        if (this.f10771F) {
            this.f10773H = false;
        } else {
            this.f10776d.i();
        }
    }

    public a A(int i7) {
        this.f10776d.j(i7);
        return this;
    }

    public a B(int i7) {
        this.f10776d.k(i7);
        return this;
    }

    public a C(float f7, float f8) {
        float[] fArr = this.f10780w;
        fArr[0] = f7;
        fArr[1] = f8;
        return this;
    }

    public a D(float f7, float f8) {
        float[] fArr = this.f10767B;
        fArr[0] = f7 / 1000.0f;
        fArr[1] = f8 / 1000.0f;
        return this;
    }

    boolean E() {
        C0091a c0091a = this.f10776d;
        int iF = c0091a.f();
        int iD = c0091a.d();
        return (iF != 0 && b(iF)) || (iD != 0 && a(iD));
    }

    public abstract boolean a(int i7);

    public abstract boolean b(int i7);

    void d() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f10778i.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract void t(int i7, int i8);

    public a u(int i7) {
        this.f10766A = i7;
        return this;
    }

    public a v(int i7) {
        this.f10782z = i7;
        return this;
    }

    public a w(boolean z7) {
        if (this.f10774I && !z7) {
            s();
        }
        this.f10774I = z7;
        return this;
    }

    public a x(float f7, float f8) {
        float[] fArr = this.f10781y;
        fArr[0] = f7;
        fArr[1] = f8;
        return this;
    }

    public a y(float f7, float f8) {
        float[] fArr = this.f10769D;
        fArr[0] = f7 / 1000.0f;
        fArr[1] = f8 / 1000.0f;
        return this;
    }

    public a z(float f7, float f8) {
        float[] fArr = this.f10768C;
        fArr[0] = f7 / 1000.0f;
        fArr[1] = f8 / 1000.0f;
        return this;
    }
}
