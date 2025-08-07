package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import u4.C2937g;

class h extends C2937g {

    b f18569S;

    private static class c extends h {
        c(b bVar) {
            super(bVar);
        }

        @Override
        protected void r(Canvas canvas) {
            if (this.f18569S.f18570w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.f18569S.f18570w);
            super.r(canvas);
            canvas.restore();
        }
    }

    public static h o0(b bVar) {
        return new c(bVar);
    }

    static h p0(u4.k kVar) {
        if (kVar == null) {
            kVar = new u4.k();
        }
        return o0(new b(kVar, new RectF()));
    }

    @Override
    public Drawable mutate() {
        this.f18569S = new b(this.f18569S);
        return this;
    }

    boolean q0() {
        return !this.f18569S.f18570w.isEmpty();
    }

    void r0() {
        s0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void s0(float f7, float f8, float f9, float f10) {
        if (f7 == this.f18569S.f18570w.left && f8 == this.f18569S.f18570w.top && f9 == this.f18569S.f18570w.right && f10 == this.f18569S.f18570w.bottom) {
            return;
        }
        this.f18569S.f18570w.set(f7, f8, f9, f10);
        invalidateSelf();
    }

    void t0(RectF rectF) {
        s0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    private static final class b extends C2937g.c {

        private final RectF f18570w;

        @Override
        public Drawable newDrawable() {
            h hVarO0 = h.o0(this);
            hVarO0.invalidateSelf();
            return hVarO0;
        }

        private b(u4.k kVar, RectF rectF) {
            super(kVar, null);
            this.f18570w = rectF;
        }

        private b(b bVar) {
            super(bVar);
            this.f18570w = bVar.f18570w;
        }
    }

    private h(b bVar) {
        super(bVar);
        this.f18569S = bVar;
    }
}
