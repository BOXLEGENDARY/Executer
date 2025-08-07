package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.progressindicator.h;
import d4.C2390c;

final class d extends i<ObjectAnimator> {

    private static final int[] f18231k = {0, 1350, 2700, 4050};

    private static final int[] f18232l = {667, 2017, 3367, 4717};

    private static final int[] f18233m = {1000, 2350, 3700, 5050};

    private static final Property<d, Float> f18234n = new c(Float.class, "animationFraction");

    private static final Property<d, Float> f18235o = new C0162d(Float.class, "completeEndFraction");

    private ObjectAnimator f18236c;

    private ObjectAnimator f18237d;

    private final O0.b f18238e;

    private final com.google.android.material.progressindicator.b f18239f;

    private int f18240g;

    private float f18241h;

    private float f18242i;

    androidx.vectordrawable.graphics.drawable.b f18243j;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            d dVar = d.this;
            dVar.f18240g = (dVar.f18240g + 4) % d.this.f18239f.f18221c.length;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            d.this.a();
            d dVar = d.this;
            androidx.vectordrawable.graphics.drawable.b bVar = dVar.f18243j;
            if (bVar != null) {
                bVar.b(dVar.f18277a);
            }
        }
    }

    class c extends Property<d, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override
        public Float get(d dVar) {
            return Float.valueOf(dVar.o());
        }

        @Override
        public void set(d dVar, Float f7) {
            dVar.t(f7.floatValue());
        }
    }

    class C0162d extends Property<d, Float> {
        C0162d(Class cls, String str) {
            super(cls, str);
        }

        @Override
        public Float get(d dVar) {
            return Float.valueOf(dVar.p());
        }

        @Override
        public void set(d dVar, Float f7) {
            dVar.u(f7.floatValue());
        }
    }

    public d(e eVar) {
        super(1);
        this.f18240g = 0;
        this.f18243j = null;
        this.f18239f = eVar;
        this.f18238e = new O0.b();
    }

    public float o() {
        return this.f18241h;
    }

    public float p() {
        return this.f18242i;
    }

    private void q() {
        if (this.f18236c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f18234n, 0.0f, 1.0f);
            this.f18236c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f18236c.setInterpolator(null);
            this.f18236c.setRepeatCount(-1);
            this.f18236c.addListener(new a());
        }
        if (this.f18237d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f18235o, 0.0f, 1.0f);
            this.f18237d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f18237d.setInterpolator(this.f18238e);
            this.f18237d.addListener(new b());
        }
    }

    private void r(int i7) {
        for (int i8 = 0; i8 < 4; i8++) {
            float fB = b(i7, f18233m[i8], 333);
            if (fB >= 0.0f && fB <= 1.0f) {
                int i9 = i8 + this.f18240g;
                int[] iArr = this.f18239f.f18221c;
                int length = i9 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int i10 = iArr[length];
                int i11 = iArr[length2];
                this.f18278b.get(0).f18275c = C2390c.b().evaluate(this.f18238e.getInterpolation(fB), Integer.valueOf(i10), Integer.valueOf(i11)).intValue();
                return;
            }
        }
    }

    public void u(float f7) {
        this.f18242i = f7;
    }

    private void v(int i7) {
        h.a aVar = this.f18278b.get(0);
        float f7 = this.f18241h;
        aVar.f18273a = (f7 * 1520.0f) - 20.0f;
        aVar.f18274b = f7 * 1520.0f;
        for (int i8 = 0; i8 < 4; i8++) {
            aVar.f18274b += this.f18238e.getInterpolation(b(i7, f18231k[i8], 667)) * 250.0f;
            aVar.f18273a += this.f18238e.getInterpolation(b(i7, f18232l[i8], 667)) * 250.0f;
        }
        float f8 = aVar.f18273a;
        float f9 = aVar.f18274b;
        aVar.f18273a = (f8 + ((f9 - f8) * this.f18242i)) / 360.0f;
        aVar.f18274b = f9 / 360.0f;
    }

    @Override
    void a() {
        ObjectAnimator objectAnimator = this.f18236c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override
    public void c() {
        s();
    }

    @Override
    public void d(androidx.vectordrawable.graphics.drawable.b bVar) {
        this.f18243j = bVar;
    }

    @Override
    void f() {
        ObjectAnimator objectAnimator = this.f18237d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f18277a.isVisible()) {
            this.f18237d.start();
        } else {
            a();
        }
    }

    @Override
    void g() {
        q();
        s();
        this.f18236c.start();
    }

    @Override
    public void h() {
        this.f18243j = null;
    }

    void s() {
        this.f18240g = 0;
        this.f18278b.get(0).f18275c = this.f18239f.f18221c[0];
        this.f18242i = 0.0f;
    }

    void t(float f7) {
        this.f18241h = f7;
        int i7 = (int) (f7 * 5400.0f);
        v(i7);
        r(i7);
        this.f18277a.invalidateSelf();
    }
}
