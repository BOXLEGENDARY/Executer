package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import x0.g;

public class b extends Drawable implements Animatable {

    private final c f12174d;

    private float f12175e;

    private Resources f12176i;

    private Animator f12177v;

    float f12178w;

    boolean f12179y;

    private static final Interpolator f12173z = new LinearInterpolator();

    private static final Interpolator f12171A = new O0.b();

    private static final int[] f12172B = {-16777216};

    class a implements ValueAnimator.AnimatorUpdateListener {

        final c f12180a;

        a(c cVar) {
            this.f12180a = cVar;
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(fFloatValue, this.f12180a);
            b.this.b(fFloatValue, this.f12180a, false);
            b.this.invalidateSelf();
        }
    }

    class C0120b implements Animator.AnimatorListener {

        final c f12182a;

        C0120b(c cVar) {
            this.f12182a = cVar;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
        }

        @Override
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f12182a, true);
            this.f12182a.A();
            this.f12182a.l();
            b bVar = b.this;
            if (!bVar.f12179y) {
                bVar.f12178w += 1.0f;
                return;
            }
            bVar.f12179y = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f12182a.x(false);
        }

        @Override
        public void onAnimationStart(Animator animator) {
            b.this.f12178w = 0.0f;
        }
    }

    private static class c {

        final RectF f12184a = new RectF();

        final Paint f12185b;

        final Paint f12186c;

        final Paint f12187d;

        float f12188e;

        float f12189f;

        float f12190g;

        float f12191h;

        int[] f12192i;

        int f12193j;

        float f12194k;

        float f12195l;

        float f12196m;

        boolean f12197n;

        Path f12198o;

        float f12199p;

        float f12200q;

        int f12201r;

        int f12202s;

        int f12203t;

        int f12204u;

        c() {
            Paint paint = new Paint();
            this.f12185b = paint;
            Paint paint2 = new Paint();
            this.f12186c = paint2;
            Paint paint3 = new Paint();
            this.f12187d = paint3;
            this.f12188e = 0.0f;
            this.f12189f = 0.0f;
            this.f12190g = 0.0f;
            this.f12191h = 5.0f;
            this.f12199p = 1.0f;
            this.f12203t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A() {
            this.f12194k = this.f12188e;
            this.f12195l = this.f12189f;
            this.f12196m = this.f12190g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f12184a;
            float f7 = this.f12200q;
            float fMin = (this.f12191h / 2.0f) + f7;
            if (f7 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f12201r * this.f12199p) / 2.0f, this.f12191h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f8 = this.f12188e;
            float f9 = this.f12190g;
            float f10 = (f8 + f9) * 360.0f;
            float f11 = ((this.f12189f + f9) * 360.0f) - f10;
            this.f12185b.setColor(this.f12204u);
            this.f12185b.setAlpha(this.f12203t);
            float f12 = this.f12191h / 2.0f;
            rectF.inset(f12, f12);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f12187d);
            float f13 = -f12;
            rectF.inset(f13, f13);
            canvas.drawArc(rectF, f10, f11, false, this.f12185b);
            b(canvas, f10, f11, rectF);
        }

        void b(Canvas canvas, float f7, float f8, RectF rectF) {
            if (this.f12197n) {
                Path path = this.f12198o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f12198o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f9 = (this.f12201r * this.f12199p) / 2.0f;
                this.f12198o.moveTo(0.0f, 0.0f);
                this.f12198o.lineTo(this.f12201r * this.f12199p, 0.0f);
                Path path3 = this.f12198o;
                float f10 = this.f12201r;
                float f11 = this.f12199p;
                path3.lineTo((f10 * f11) / 2.0f, this.f12202s * f11);
                this.f12198o.offset((fMin + rectF.centerX()) - f9, rectF.centerY() + (this.f12191h / 2.0f));
                this.f12198o.close();
                this.f12186c.setColor(this.f12204u);
                this.f12186c.setAlpha(this.f12203t);
                canvas.save();
                canvas.rotate(f7 + f8, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f12198o, this.f12186c);
                canvas.restore();
            }
        }

        int c() {
            return this.f12203t;
        }

        float d() {
            return this.f12189f;
        }

        int e() {
            return this.f12192i[f()];
        }

        int f() {
            return (this.f12193j + 1) % this.f12192i.length;
        }

        float g() {
            return this.f12188e;
        }

        int h() {
            return this.f12192i[this.f12193j];
        }

        float i() {
            return this.f12195l;
        }

        float j() {
            return this.f12196m;
        }

        float k() {
            return this.f12194k;
        }

        void l() {
            t(f());
        }

        void m() {
            this.f12194k = 0.0f;
            this.f12195l = 0.0f;
            this.f12196m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        void n(int i7) {
            this.f12203t = i7;
        }

        void o(float f7, float f8) {
            this.f12201r = (int) f7;
            this.f12202s = (int) f8;
        }

        void p(float f7) {
            if (f7 != this.f12199p) {
                this.f12199p = f7;
            }
        }

        void q(float f7) {
            this.f12200q = f7;
        }

        void r(int i7) {
            this.f12204u = i7;
        }

        void s(ColorFilter colorFilter) {
            this.f12185b.setColorFilter(colorFilter);
        }

        void t(int i7) {
            this.f12193j = i7;
            this.f12204u = this.f12192i[i7];
        }

        void u(int[] iArr) {
            this.f12192i = iArr;
            t(0);
        }

        void v(float f7) {
            this.f12189f = f7;
        }

        void w(float f7) {
            this.f12190g = f7;
        }

        void x(boolean z7) {
            if (this.f12197n != z7) {
                this.f12197n = z7;
            }
        }

        void y(float f7) {
            this.f12188e = f7;
        }

        void z(float f7) {
            this.f12191h = f7;
            this.f12185b.setStrokeWidth(f7);
        }
    }

    public b(Context context) {
        this.f12176i = ((Context) g.g(context)).getResources();
        c cVar = new c();
        this.f12174d = cVar;
        cVar.u(f12172B);
        k(2.5f);
        m();
    }

    private void a(float f7, c cVar) {
        n(f7, cVar);
        float fFloor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f7));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((fFloor - cVar.j()) * f7));
    }

    private int c(float f7, int i7, int i8) {
        return ((((i7 >> 24) & 255) + ((int) ((((i8 >> 24) & 255) - r0) * f7))) << 24) | ((((i7 >> 16) & 255) + ((int) ((((i8 >> 16) & 255) - r1) * f7))) << 16) | ((((i7 >> 8) & 255) + ((int) ((((i8 >> 8) & 255) - r2) * f7))) << 8) | ((i7 & 255) + ((int) (f7 * ((i8 & 255) - r8))));
    }

    private void h(float f7) {
        this.f12175e = f7;
    }

    private void i(float f7, float f8, float f9, float f10) {
        c cVar = this.f12174d;
        float f11 = this.f12176i.getDisplayMetrics().density;
        cVar.z(f8 * f11);
        cVar.q(f7 * f11);
        cVar.t(0);
        cVar.o(f9 * f11, f10 * f11);
    }

    private void m() {
        c cVar = this.f12174d;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f12173z);
        valueAnimatorOfFloat.addListener(new C0120b(cVar));
        this.f12177v = valueAnimatorOfFloat;
    }

    void b(float f7, c cVar, boolean z7) {
        float interpolation;
        float interpolation2;
        if (this.f12179y) {
            a(f7, cVar);
            return;
        }
        if (f7 != 1.0f || z7) {
            float fJ = cVar.j();
            if (f7 < 0.5f) {
                interpolation = cVar.k();
                interpolation2 = (f12171A.getInterpolation(f7 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fK = cVar.k() + 0.79f;
                interpolation = fK - (((1.0f - f12171A.getInterpolation((f7 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fK;
            }
            float f8 = fJ + (0.20999998f * f7);
            float f9 = (f7 + this.f12178w) * 216.0f;
            cVar.y(interpolation);
            cVar.v(interpolation2);
            cVar.w(f8);
            h(f9);
        }
    }

    public void d(boolean z7) {
        this.f12174d.x(z7);
        invalidateSelf();
    }

    @Override
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f12175e, bounds.exactCenterX(), bounds.exactCenterY());
        this.f12174d.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f7) {
        this.f12174d.p(f7);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f12174d.u(iArr);
        this.f12174d.t(0);
        invalidateSelf();
    }

    public void g(float f7) {
        this.f12174d.w(f7);
        invalidateSelf();
    }

    @Override
    public int getAlpha() {
        return this.f12174d.c();
    }

    @Override
    public int getOpacity() {
        return -3;
    }

    @Override
    public boolean isRunning() {
        return this.f12177v.isRunning();
    }

    public void j(float f7, float f8) {
        this.f12174d.y(f7);
        this.f12174d.v(f8);
        invalidateSelf();
    }

    public void k(float f7) {
        this.f12174d.z(f7);
        invalidateSelf();
    }

    public void l(int i7) {
        if (i7 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void n(float f7, c cVar) {
        if (f7 > 0.75f) {
            cVar.r(c((f7 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override
    public void setAlpha(int i7) {
        this.f12174d.n(i7);
        invalidateSelf();
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f12174d.s(colorFilter);
        invalidateSelf();
    }

    @Override
    public void start() {
        this.f12177v.cancel();
        this.f12174d.A();
        if (this.f12174d.d() != this.f12174d.g()) {
            this.f12179y = true;
            this.f12177v.setDuration(666L);
            this.f12177v.start();
        } else {
            this.f12174d.t(0);
            this.f12174d.m();
            this.f12177v.setDuration(1332L);
            this.f12177v.start();
        }
    }

    @Override
    public void stop() {
        this.f12177v.cancel();
        h(0.0f);
        this.f12174d.x(false);
        this.f12174d.t(0);
        this.f12174d.m();
        invalidateSelf();
    }
}
