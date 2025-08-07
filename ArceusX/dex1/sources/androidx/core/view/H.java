package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

public class H {

    private int f10601a;

    private int f10602b;

    public H(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f10601a | this.f10602b;
    }

    public void b(View view, View view2, int i7) {
        c(view, view2, i7, 0);
    }

    public void c(View view, View view2, int i7, int i8) {
        if (i8 == 1) {
            this.f10602b = i7;
        } else {
            this.f10601a = i7;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i7) {
        if (i7 == 1) {
            this.f10602b = 0;
        } else {
            this.f10601a = 0;
        }
    }
}
