package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.Z;
import androidx.recyclerview.widget.RecyclerView;

class j extends RecyclerView.o implements RecyclerView.t {

    private static final int[] f11944D = {R.attr.state_pressed};

    private static final int[] f11945E = new int[0];

    int f11946A;

    private final Runnable f11947B;

    private final RecyclerView.u f11948C;

    private final int f11949a;

    private final int f11950b;

    final StateListDrawable f11951c;

    final Drawable f11952d;

    private final int f11953e;

    private final int f11954f;

    private final StateListDrawable f11955g;

    private final Drawable f11956h;

    private final int f11957i;

    private final int f11958j;

    int f11959k;

    int f11960l;

    float f11961m;

    int f11962n;

    int f11963o;

    float f11964p;

    private RecyclerView f11967s;

    final ValueAnimator f11974z;

    private int f11965q = 0;

    private int f11966r = 0;

    private boolean f11968t = false;

    private boolean f11969u = false;

    private int f11970v = 0;

    private int f11971w = 0;

    private final int[] f11972x = new int[2];

    private final int[] f11973y = new int[2];

    class a implements Runnable {
        a() {
        }

        @Override
        public void run() {
            j.this.q(500);
        }
    }

    class b extends RecyclerView.u {
        b() {
        }

        @Override
        public void b(RecyclerView recyclerView, int i7, int i8) {
            j.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        private boolean f11977a = false;

        c() {
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            this.f11977a = true;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (this.f11977a) {
                this.f11977a = false;
                return;
            }
            if (((Float) j.this.f11974z.getAnimatedValue()).floatValue() == 0.0f) {
                j jVar = j.this;
                jVar.f11946A = 0;
                jVar.y(0);
            } else {
                j jVar2 = j.this;
                jVar2.f11946A = 2;
                jVar2.v();
            }
        }
    }

    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            j.this.f11951c.setAlpha(iFloatValue);
            j.this.f11952d.setAlpha(iFloatValue);
            j.this.v();
        }
    }

    j(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i7, int i8, int i9) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f11974z = valueAnimatorOfFloat;
        this.f11946A = 0;
        this.f11947B = new a();
        this.f11948C = new b();
        this.f11951c = stateListDrawable;
        this.f11952d = drawable;
        this.f11955g = stateListDrawable2;
        this.f11956h = drawable2;
        this.f11953e = Math.max(i7, stateListDrawable.getIntrinsicWidth());
        this.f11954f = Math.max(i7, drawable.getIntrinsicWidth());
        this.f11957i = Math.max(i7, stateListDrawable2.getIntrinsicWidth());
        this.f11958j = Math.max(i7, drawable2.getIntrinsicWidth());
        this.f11949a = i8;
        this.f11950b = i9;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        j(recyclerView);
    }

    private void C(float f7) {
        int[] iArrP = p();
        float fMax = Math.max(iArrP[0], Math.min(iArrP[1], f7));
        if (Math.abs(this.f11960l - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f11961m, fMax, iArrP, this.f11967s.computeVerticalScrollRange(), this.f11967s.computeVerticalScrollOffset(), this.f11966r);
        if (iX != 0) {
            this.f11967s.scrollBy(0, iX);
        }
        this.f11961m = fMax;
    }

    private void k() {
        this.f11967s.removeCallbacks(this.f11947B);
    }

    private void l() {
        this.f11967s.W0(this);
        this.f11967s.X0(this);
        this.f11967s.Y0(this.f11948C);
        k();
    }

    private void m(Canvas canvas) {
        int i7 = this.f11966r;
        int i8 = this.f11957i;
        int i9 = this.f11963o;
        int i10 = this.f11962n;
        this.f11955g.setBounds(0, 0, i10, i8);
        this.f11956h.setBounds(0, 0, this.f11965q, this.f11958j);
        canvas.translate(0.0f, i7 - i8);
        this.f11956h.draw(canvas);
        canvas.translate(i9 - (i10 / 2), 0.0f);
        this.f11955g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void n(Canvas canvas) {
        int i7 = this.f11965q;
        int i8 = this.f11953e;
        int i9 = i7 - i8;
        int i10 = this.f11960l;
        int i11 = this.f11959k;
        int i12 = i10 - (i11 / 2);
        this.f11951c.setBounds(0, 0, i8, i11);
        this.f11952d.setBounds(0, 0, this.f11954f, this.f11966r);
        if (!s()) {
            canvas.translate(i9, 0.0f);
            this.f11952d.draw(canvas);
            canvas.translate(0.0f, i12);
            this.f11951c.draw(canvas);
            canvas.translate(-i9, -i12);
            return;
        }
        this.f11952d.draw(canvas);
        canvas.translate(this.f11953e, i12);
        canvas.scale(-1.0f, 1.0f);
        this.f11951c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f11953e, -i12);
    }

    private int[] o() {
        int[] iArr = this.f11973y;
        int i7 = this.f11950b;
        iArr[0] = i7;
        iArr[1] = this.f11965q - i7;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f11972x;
        int i7 = this.f11950b;
        iArr[0] = i7;
        iArr[1] = this.f11966r - i7;
        return iArr;
    }

    private void r(float f7) {
        int[] iArrO = o();
        float fMax = Math.max(iArrO[0], Math.min(iArrO[1], f7));
        if (Math.abs(this.f11963o - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f11964p, fMax, iArrO, this.f11967s.computeHorizontalScrollRange(), this.f11967s.computeHorizontalScrollOffset(), this.f11965q);
        if (iX != 0) {
            this.f11967s.scrollBy(iX, 0);
        }
        this.f11964p = fMax;
    }

    private boolean s() {
        return Z.z(this.f11967s) == 1;
    }

    private void w(int i7) {
        k();
        this.f11967s.postDelayed(this.f11947B, i7);
    }

    private int x(float f7, float f8, int[] iArr, int i7, int i8, int i9) {
        int i10 = iArr[1] - iArr[0];
        if (i10 == 0) {
            return 0;
        }
        int i11 = i7 - i9;
        int i12 = (int) (((f8 - f7) / i10) * i11);
        int i13 = i8 + i12;
        if (i13 >= i11 || i13 < 0) {
            return 0;
        }
        return i12;
    }

    private void z() {
        this.f11967s.g(this);
        this.f11967s.i(this);
        this.f11967s.j(this.f11948C);
    }

    public void A() {
        int i7 = this.f11946A;
        if (i7 != 0) {
            if (i7 != 3) {
                return;
            } else {
                this.f11974z.cancel();
            }
        }
        this.f11946A = 1;
        ValueAnimator valueAnimator = this.f11974z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f11974z.setDuration(500L);
        this.f11974z.setStartDelay(0L);
        this.f11974z.start();
    }

    void B(int i7, int i8) {
        int iComputeVerticalScrollRange = this.f11967s.computeVerticalScrollRange();
        int i9 = this.f11966r;
        this.f11968t = iComputeVerticalScrollRange - i9 > 0 && i9 >= this.f11949a;
        int iComputeHorizontalScrollRange = this.f11967s.computeHorizontalScrollRange();
        int i10 = this.f11965q;
        boolean z7 = iComputeHorizontalScrollRange - i10 > 0 && i10 >= this.f11949a;
        this.f11969u = z7;
        boolean z8 = this.f11968t;
        if (!z8 && !z7) {
            if (this.f11970v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z8) {
            float f7 = i9;
            this.f11960l = (int) ((f7 * (i8 + (f7 / 2.0f))) / iComputeVerticalScrollRange);
            this.f11959k = Math.min(i9, (i9 * i9) / iComputeVerticalScrollRange);
        }
        if (this.f11969u) {
            float f8 = i10;
            this.f11963o = (int) ((f8 * (i7 + (f8 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f11962n = Math.min(i10, (i10 * i10) / iComputeHorizontalScrollRange);
        }
        int i11 = this.f11970v;
        if (i11 == 0 || i11 == 1) {
            y(1);
        }
    }

    @Override
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f11970v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (zU || zT) {
                if (zT) {
                    this.f11971w = 1;
                    this.f11964p = (int) motionEvent.getX();
                } else if (zU) {
                    this.f11971w = 2;
                    this.f11961m = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f11970v == 2) {
            this.f11961m = 0.0f;
            this.f11964p = 0.0f;
            y(1);
            this.f11971w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f11970v == 2) {
            A();
            if (this.f11971w == 1) {
                r(motionEvent.getX());
            }
            if (this.f11971w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i7 = this.f11970v;
        if (i7 == 1) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zU && !zT) {
                return false;
            }
            if (zT) {
                this.f11971w = 1;
                this.f11964p = (int) motionEvent.getX();
            } else if (zU) {
                this.f11971w = 2;
                this.f11961m = (int) motionEvent.getY();
            }
            y(2);
        } else if (i7 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public void c(boolean z7) {
    }

    @Override
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a2) {
        if (this.f11965q != this.f11967s.getWidth() || this.f11966r != this.f11967s.getHeight()) {
            this.f11965q = this.f11967s.getWidth();
            this.f11966r = this.f11967s.getHeight();
            y(0);
        } else if (this.f11946A != 0) {
            if (this.f11968t) {
                n(canvas);
            }
            if (this.f11969u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f11967s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f11967s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    void q(int i7) {
        int i8 = this.f11946A;
        if (i8 == 1) {
            this.f11974z.cancel();
        } else if (i8 != 2) {
            return;
        }
        this.f11946A = 3;
        ValueAnimator valueAnimator = this.f11974z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f11974z.setDuration(i7);
        this.f11974z.start();
    }

    boolean t(float f7, float f8) {
        if (f8 >= this.f11966r - this.f11957i) {
            int i7 = this.f11963o;
            int i8 = this.f11962n;
            if (f7 >= i7 - (i8 / 2) && f7 <= i7 + (i8 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean u(float f7, float f8) {
        if (!s() ? f7 >= this.f11965q - this.f11953e : f7 <= this.f11953e) {
            int i7 = this.f11960l;
            int i8 = this.f11959k;
            if (f8 >= i7 - (i8 / 2) && f8 <= i7 + (i8 / 2)) {
                return true;
            }
        }
        return false;
    }

    void v() {
        this.f11967s.invalidate();
    }

    void y(int i7) {
        if (i7 == 2 && this.f11970v != 2) {
            this.f11951c.setState(f11944D);
            k();
        }
        if (i7 == 0) {
            v();
        } else {
            A();
        }
        if (this.f11970v == 2 && i7 != 2) {
            this.f11951c.setState(f11945E);
            w(1200);
        } else if (i7 == 1) {
            w(1500);
        }
        this.f11970v = i7;
    }
}
