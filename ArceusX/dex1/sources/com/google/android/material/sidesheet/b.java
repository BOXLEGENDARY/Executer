package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

final class b extends d {

    final SideSheetBehavior<? extends View> f18365a;

    b(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f18365a = sideSheetBehavior;
    }

    @Override
    int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override
    float b(int i7) {
        float fD = d();
        return (fD - i7) / (fD - c());
    }

    @Override
    int c() {
        return Math.max(0, (d() - this.f18365a.Y()) - this.f18365a.d0());
    }

    @Override
    int d() {
        return this.f18365a.g0();
    }

    @Override
    int e() {
        return this.f18365a.g0();
    }

    @Override
    int f() {
        return c();
    }

    @Override
    <V extends View> int g(V v7) {
        return v7.getLeft() - this.f18365a.d0();
    }

    @Override
    public int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override
    int i() {
        return 0;
    }

    @Override
    boolean j(float f7) {
        return f7 < 0.0f;
    }

    @Override
    boolean k(View view) {
        return view.getLeft() > (d() + c()) / 2;
    }

    @Override
    boolean l(float f7, float f8) {
        return e.a(f7, f8) && Math.abs(f7) > ((float) this.f18365a.h0());
    }

    @Override
    boolean m(View view, float f7) {
        return Math.abs(((float) view.getRight()) + (f7 * this.f18365a.b0())) > this.f18365a.c0();
    }

    @Override
    void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i7, int i8) {
        int iG0 = this.f18365a.g0();
        if (i7 <= iG0) {
            marginLayoutParams.rightMargin = iG0 - i7;
        }
    }
}
