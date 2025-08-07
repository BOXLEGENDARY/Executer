package com.google.android.material.progressindicator;

import android.animation.Animator;
import com.google.android.material.progressindicator.h;
import java.util.ArrayList;
import java.util.List;

abstract class i<T extends Animator> {

    protected j f18277a;

    protected final List<h.a> f18278b = new ArrayList();

    protected i(int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            this.f18278b.add(new h.a());
        }
    }

    abstract void a();

    protected float b(int i7, int i8, int i9) {
        return (i7 - i8) / i9;
    }

    public abstract void c();

    public abstract void d(androidx.vectordrawable.graphics.drawable.b bVar);

    protected void e(j jVar) {
        this.f18277a = jVar;
    }

    abstract void f();

    abstract void g();

    public abstract void h();
}
