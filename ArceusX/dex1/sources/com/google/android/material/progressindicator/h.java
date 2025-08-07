package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.progressindicator.b;

abstract class h<S extends b> {

    S f18272a;

    protected static class a {

        float f18273a;

        float f18274b;

        int f18275c;

        int f18276d;

        protected a() {
        }
    }

    public h(S s7) {
        this.f18272a = s7;
    }

    abstract void a(Canvas canvas, Rect rect, float f7, boolean z7, boolean z8);

    abstract void b(Canvas canvas, Paint paint, int i7, int i8);

    abstract void c(Canvas canvas, Paint paint, a aVar, int i7);

    abstract void d(Canvas canvas, Paint paint, float f7, float f8, int i7, int i8, int i9);

    abstract int e();

    abstract int f();

    void g(Canvas canvas, Rect rect, float f7, boolean z7, boolean z8) {
        this.f18272a.e();
        a(canvas, rect, f7, z7, z8);
    }
}
