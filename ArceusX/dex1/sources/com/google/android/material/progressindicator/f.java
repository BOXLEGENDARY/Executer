package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.progressindicator.b;
import com.google.android.material.progressindicator.h;
import s0.C2870a;

public final class f<S extends b> extends g {

    private static final I0.c<f<?>> f18249N = new a("indicatorLevel");

    private h<S> f18250I;

    private final I0.e f18251J;

    private final I0.d f18252K;

    private final h.a f18253L;

    private boolean f18254M;

    class a extends I0.c<f<?>> {
        a(String str) {
            super(str);
        }

        @Override
        public float a(f<?> fVar) {
            return fVar.x() * 10000.0f;
        }

        @Override
        public void b(f<?> fVar, float f7) {
            fVar.z(f7 / 10000.0f);
        }
    }

    f(Context context, b bVar, h<S> hVar) {
        super(context, bVar);
        this.f18254M = false;
        y(hVar);
        this.f18253L = new h.a();
        I0.e eVar = new I0.e();
        this.f18251J = eVar;
        eVar.d(1.0f);
        eVar.f(50.0f);
        I0.d dVar = new I0.d(this, f18249N);
        this.f18252K = dVar;
        dVar.p(eVar);
        n(1.0f);
    }

    static f<e> v(Context context, e eVar, c cVar) {
        return new f<>(context, eVar, cVar);
    }

    public float x() {
        return this.f18253L.f18274b;
    }

    public void z(float f7) {
        this.f18253L.f18274b = f7;
        invalidateSelf();
    }

    void A(float f7) {
        setLevel((int) (f7 * 10000.0f));
    }

    @Override
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f18250I.g(canvas, getBounds(), h(), k(), j());
            this.f18261F.setStyle(Paint.Style.FILL);
            this.f18261F.setAntiAlias(true);
            h.a aVar = this.f18253L;
            b bVar = this.f18264e;
            aVar.f18275c = bVar.f18221c[0];
            int i7 = bVar.f18225g;
            if (i7 > 0) {
                this.f18250I.d(canvas, this.f18261F, x(), 1.0f, this.f18264e.f18222d, getAlpha(), (int) ((i7 * C2870a.b(x(), 0.0f, 0.01f)) / 0.01f));
            } else {
                this.f18250I.d(canvas, this.f18261F, 0.0f, 1.0f, bVar.f18222d, getAlpha(), 0);
            }
            this.f18250I.c(canvas, this.f18261F, this.f18253L, getAlpha());
            this.f18250I.b(canvas, this.f18261F, this.f18264e.f18221c[0], getAlpha());
            canvas.restore();
        }
    }

    @Override
    public int getAlpha() {
        return super.getAlpha();
    }

    @Override
    public int getIntrinsicHeight() {
        return this.f18250I.e();
    }

    @Override
    public int getIntrinsicWidth() {
        return this.f18250I.f();
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
    public void jumpToCurrentState() {
        this.f18252K.q();
        z(getLevel() / 10000.0f);
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
    protected boolean onLevelChange(int i7) {
        if (this.f18254M) {
            this.f18252K.q();
            z(i7 / 10000.0f);
            return true;
        }
        this.f18252K.h(x() * 10000.0f);
        this.f18252K.l(i7);
        return true;
    }

    @Override
    public boolean q(boolean z7, boolean z8, boolean z9) {
        return super.q(z7, z8, z9);
    }

    @Override
    boolean r(boolean z7, boolean z8, boolean z9) {
        boolean zR = super.r(z7, z8, z9);
        float fA = this.f18265i.a(this.f18263d.getContentResolver());
        if (fA == 0.0f) {
            this.f18254M = true;
        } else {
            this.f18254M = false;
            this.f18251J.f(50.0f / fA);
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

    h<S> w() {
        return this.f18250I;
    }

    void y(h<S> hVar) {
        this.f18250I = hVar;
    }
}
