package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

class c<V extends View> extends CoordinatorLayout.c<V> {

    private d f17259a;

    private int f17260b;

    private int f17261c;

    public c() {
        this.f17260b = 0;
        this.f17261c = 0;
    }

    public int E() {
        d dVar = this.f17259a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    protected void F(CoordinatorLayout coordinatorLayout, V v7, int i7) {
        coordinatorLayout.C(v7, i7);
    }

    public boolean G(int i7) {
        d dVar = this.f17259a;
        if (dVar != null) {
            return dVar.e(i7);
        }
        this.f17260b = i7;
        return false;
    }

    @Override
    public boolean l(CoordinatorLayout coordinatorLayout, V v7, int i7) {
        F(coordinatorLayout, v7, i7);
        if (this.f17259a == null) {
            this.f17259a = new d(v7);
        }
        this.f17259a.c();
        this.f17259a.a();
        int i8 = this.f17260b;
        if (i8 != 0) {
            this.f17259a.e(i8);
            this.f17260b = 0;
        }
        int i9 = this.f17261c;
        if (i9 == 0) {
            return true;
        }
        this.f17259a.d(i9);
        this.f17261c = 0;
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17260b = 0;
        this.f17261c = 0;
    }
}
