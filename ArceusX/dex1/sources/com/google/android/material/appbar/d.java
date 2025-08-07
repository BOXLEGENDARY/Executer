package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.Z;

class d {

    private final View f17262a;

    private int f17263b;

    private int f17264c;

    private int f17265d;

    private int f17266e;

    private boolean f17267f = true;

    private boolean f17268g = true;

    public d(View view) {
        this.f17262a = view;
    }

    void a() {
        View view = this.f17262a;
        Z.Y(view, this.f17265d - (view.getTop() - this.f17263b));
        View view2 = this.f17262a;
        Z.X(view2, this.f17266e - (view2.getLeft() - this.f17264c));
    }

    public int b() {
        return this.f17265d;
    }

    void c() {
        this.f17263b = this.f17262a.getTop();
        this.f17264c = this.f17262a.getLeft();
    }

    public boolean d(int i7) {
        if (!this.f17268g || this.f17266e == i7) {
            return false;
        }
        this.f17266e = i7;
        a();
        return true;
    }

    public boolean e(int i7) {
        if (!this.f17267f || this.f17265d == i7) {
            return false;
        }
        this.f17265d = i7;
        a();
        return true;
    }
}
