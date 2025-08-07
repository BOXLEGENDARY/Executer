package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import c4.C1749e;
import com.google.android.material.progressindicator.b;
import com.google.android.material.progressindicator.h;
import q0.C2731a;
import q4.C2733a;

public final class j<S extends b> extends g {

    private h<S> f18279I;

    private i<ObjectAnimator> f18280J;

    private Drawable f18281K;

    j(Context context, b bVar, h<S> hVar, i<ObjectAnimator> iVar) {
        super(context, bVar);
        y(hVar);
        x(iVar);
    }

    static j<e> t(Context context, e eVar, c cVar) {
        j<e> jVar = new j<>(context, eVar, cVar, new d(eVar));
        jVar.z(androidx.vectordrawable.graphics.drawable.f.b(context.getResources(), C1749e.f12841d, null));
        return jVar;
    }

    private boolean w() {
        C2733a c2733a = this.f18265i;
        return c2733a != null && c2733a.a(this.f18263d.getContentResolver()) == 0.0f;
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (w() && (drawable = this.f18281K) != null) {
                drawable.setBounds(getBounds());
                C2731a.n(this.f18281K, this.f18264e.f18221c[0]);
                this.f18281K.draw(canvas);
                return;
            }
            canvas.save();
            this.f18279I.g(canvas, getBounds(), h(), k(), j());
            int i7 = this.f18264e.f18225g;
            int alpha = getAlpha();
            if (i7 == 0) {
                this.f18279I.d(canvas, this.f18261F, 0.0f, 1.0f, this.f18264e.f18222d, alpha, 0);
            } else {
                h.a aVar = this.f18280J.f18278b.get(0);
                alpha = 0;
                this.f18279I.d(canvas, this.f18261F, this.f18280J.f18278b.get(r3.size() - 1).f18274b, aVar.f18273a + 1.0f, this.f18264e.f18222d, 0, i7);
            }
            for (int i8 = 0; i8 < this.f18280J.f18278b.size(); i8++) {
                h.a aVar2 = this.f18280J.f18278b.get(i8);
                this.f18279I.c(canvas, this.f18261F, aVar2, getAlpha());
                if (i8 > 0 && i7 > 0) {
                    this.f18279I.d(canvas, this.f18261F, this.f18280J.f18278b.get(i8 - 1).f18274b, aVar2.f18273a, this.f18264e.f18222d, alpha, i7);
                }
            }
            canvas.restore();
        }
    }

    @Override
    public int getAlpha() {
        return super.getAlpha();
    }

    @Override
    public int getIntrinsicHeight() {
        return this.f18279I.e();
    }

    @Override
    public int getIntrinsicWidth() {
        return this.f18279I.f();
    }

    @Override
    public int getOpacity() {
        return super.getOpacity();
    }

    @Override
    public boolean i() {
        return super.i();
    }

    @Override
    public boolean isRunning() {
        return super.isRunning();
    }

    @Override
    public boolean j() {
        return super.j();
    }

    @Override
    public boolean k() {
        return super.k();
    }

    @Override
    public void m(androidx.vectordrawable.graphics.drawable.b bVar) {
        super.m(bVar);
    }

    @Override
    public boolean q(boolean z7, boolean z8, boolean z9) {
        return super.q(z7, z8, z9);
    }

    @Override
    boolean r(boolean z7, boolean z8, boolean z9) {
        Drawable drawable;
        boolean zR = super.r(z7, z8, z9);
        if (w() && (drawable = this.f18281K) != null) {
            return drawable.setVisible(z7, z8);
        }
        if (!isRunning()) {
            this.f18280J.a();
        }
        if (z7 && z9) {
            this.f18280J.g();
        }
        return zR;
    }

    @Override
    public boolean s(androidx.vectordrawable.graphics.drawable.b bVar) {
        return super.s(bVar);
    }

    @Override
    public void setAlpha(int i7) {
        super.setAlpha(i7);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override
    public boolean setVisible(boolean z7, boolean z8) {
        return super.setVisible(z7, z8);
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }

    i<ObjectAnimator> u() {
        return this.f18280J;
    }

    h<S> v() {
        return this.f18279I;
    }

    void x(i<ObjectAnimator> iVar) {
        this.f18280J = iVar;
        iVar.e(this);
    }

    void y(h<S> hVar) {
        this.f18279I = hVar;
    }

    public void z(Drawable drawable) {
        this.f18281K = drawable;
    }
}
