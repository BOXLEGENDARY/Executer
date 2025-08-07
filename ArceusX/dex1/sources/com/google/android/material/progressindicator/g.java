package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import d4.C2388a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q4.C2733a;

abstract class g extends Drawable implements Animatable {

    private static final Property<g, Float> f18255H = new c(Float.class, "growFraction");

    private float f18256A;

    private List<androidx.vectordrawable.graphics.drawable.b> f18257B;

    private androidx.vectordrawable.graphics.drawable.b f18258C;

    private boolean f18259D;

    private float f18260E;

    private int f18262G;

    final Context f18263d;

    final com.google.android.material.progressindicator.b f18264e;

    private ValueAnimator f18266v;

    private ValueAnimator f18267w;

    private boolean f18268y;

    private boolean f18269z;

    final Paint f18261F = new Paint();

    C2733a f18265i = new C2733a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            g.this.f();
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            g.super.setVisible(false, false);
            g.this.e();
        }
    }

    class c extends Property<g, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override
        public Float get(g gVar) {
            return Float.valueOf(gVar.h());
        }

        @Override
        public void set(g gVar, Float f7) {
            gVar.n(f7.floatValue());
        }
    }

    g(Context context, com.google.android.material.progressindicator.b bVar) {
        this.f18263d = context;
        this.f18264e = bVar;
        setAlpha(255);
    }

    private void d(ValueAnimator... valueAnimatorArr) {
        boolean z7 = this.f18259D;
        this.f18259D = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f18259D = z7;
    }

    public void e() {
        androidx.vectordrawable.graphics.drawable.b bVar = this.f18258C;
        if (bVar != null) {
            bVar.b(this);
        }
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f18257B;
        if (list == null || this.f18259D) {
            return;
        }
        Iterator<androidx.vectordrawable.graphics.drawable.b> it = list.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    public void f() {
        androidx.vectordrawable.graphics.drawable.b bVar = this.f18258C;
        if (bVar != null) {
            bVar.c(this);
        }
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f18257B;
        if (list == null || this.f18259D) {
            return;
        }
        Iterator<androidx.vectordrawable.graphics.drawable.b> it = list.iterator();
        while (it.hasNext()) {
            it.next().c(this);
        }
    }

    private void g(ValueAnimator... valueAnimatorArr) {
        boolean z7 = this.f18259D;
        this.f18259D = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f18259D = z7;
    }

    private void l() {
        if (this.f18266v == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f18255H, 0.0f, 1.0f);
            this.f18266v = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f18266v.setInterpolator(C2388a.f20313b);
            p(this.f18266v);
        }
        if (this.f18267w == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f18255H, 1.0f, 0.0f);
            this.f18267w = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f18267w.setInterpolator(C2388a.f20313b);
            o(this.f18267w);
        }
    }

    private void o(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f18267w;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f18267w = valueAnimator;
        valueAnimator.addListener(new b());
    }

    private void p(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f18266v;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f18266v = valueAnimator;
        valueAnimator.addListener(new a());
    }

    @Override
    public int getAlpha() {
        return this.f18262G;
    }

    @Override
    public int getOpacity() {
        return -3;
    }

    float h() {
        if (this.f18264e.b() || this.f18264e.a()) {
            return (this.f18269z || this.f18268y) ? this.f18256A : this.f18260E;
        }
        return 1.0f;
    }

    public boolean i() {
        return q(false, false, false);
    }

    public boolean isRunning() {
        return k() || j();
    }

    public boolean j() {
        ValueAnimator valueAnimator = this.f18267w;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f18269z;
    }

    public boolean k() {
        ValueAnimator valueAnimator = this.f18266v;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f18268y;
    }

    public void m(androidx.vectordrawable.graphics.drawable.b bVar) {
        if (this.f18257B == null) {
            this.f18257B = new ArrayList();
        }
        if (this.f18257B.contains(bVar)) {
            return;
        }
        this.f18257B.add(bVar);
    }

    void n(float f7) {
        if (this.f18260E != f7) {
            this.f18260E = f7;
            invalidateSelf();
        }
    }

    public boolean q(boolean z7, boolean z8, boolean z9) {
        return r(z7, z8, z9 && this.f18265i.a(this.f18263d.getContentResolver()) > 0.0f);
    }

    boolean r(boolean z7, boolean z8, boolean z9) {
        l();
        if (!isVisible() && !z7) {
            return false;
        }
        ValueAnimator valueAnimator = z7 ? this.f18266v : this.f18267w;
        ValueAnimator valueAnimator2 = z7 ? this.f18267w : this.f18266v;
        if (!z9) {
            if (valueAnimator2.isRunning()) {
                d(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                g(valueAnimator);
            }
            return super.setVisible(z7, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z10 = !z7 || super.setVisible(z7, false);
        if (!(z7 ? this.f18264e.b() : this.f18264e.a())) {
            g(valueAnimator);
            return z10;
        }
        if (z8 || !valueAnimator.isPaused()) {
            valueAnimator.start();
        } else {
            valueAnimator.resume();
        }
        return z10;
    }

    public boolean s(androidx.vectordrawable.graphics.drawable.b bVar) {
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f18257B;
        if (list == null || !list.contains(bVar)) {
            return false;
        }
        this.f18257B.remove(bVar);
        if (!this.f18257B.isEmpty()) {
            return true;
        }
        this.f18257B = null;
        return true;
    }

    @Override
    public void setAlpha(int i7) {
        this.f18262G = i7;
        invalidateSelf();
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f18261F.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override
    public boolean setVisible(boolean z7, boolean z8) {
        return q(z7, z8, true);
    }

    public void start() {
        r(true, true, false);
    }

    public void stop() {
        r(false, true, false);
    }
}
