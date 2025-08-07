package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

final class a extends d {

    final SideSheetBehavior<? extends View> f18364a;

    a(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f18364a = sideSheetBehavior;
    }

    @Override
    int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override
    float b(int i7) {
        float fD = d();
        return (i7 - fD) / (c() - fD);
    }

    @Override
    int c() {
        return Math.max(0, this.f18364a.f0() + this.f18364a.d0());
    }

    @Override
    int d() {
        return (-this.f18364a.Y()) - this.f18364a.d0();
    }

    @Override
    int e() {
        return this.f18364a.d0();
    }

    @Override
    int f() {
        return -this.f18364a.Y();
    }

    @Override
    <V extends View> int g(V v7) {
        return v7.getRight() + this.f18364a.d0();
    }

    @Override
    public int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override
    int i() {
        return 1;
    }

    @Override
    boolean j(float f7) {
        return f7 > 0.0f;
    }

    @Override
    boolean k(View view) {
        return view.getRight() < (c() - d()) / 2;
    }

    @Override
    boolean l(float f7, float f8) {
        return e.a(f7, f8) && Math.abs(f7) > ((float) this.f18364a.h0());
    }

    @Override
    boolean m(View view, float f7) {
        return Math.abs(((float) view.getLeft()) + (f7 * this.f18364a.b0())) > this.f18364a.c0();
    }

    @Override
    void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i7, int i8) {
        if (i7 <= this.f18364a.g0()) {
            marginLayoutParams.leftMargin = i8;
        }
    }
}
