package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Z;
import java.util.List;
import n4.InterfaceC2669a;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    private int f18744a;

    class a implements ViewTreeObserver.OnPreDrawListener {

        final View f18745d;

        final int f18746e;

        final InterfaceC2669a f18747i;

        a(View view, int i7, InterfaceC2669a interfaceC2669a) {
            this.f18745d = view;
            this.f18746e = i7;
            this.f18747i = interfaceC2669a;
        }

        @Override
        public boolean onPreDraw() {
            this.f18745d.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f18744a == this.f18746e) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                InterfaceC2669a interfaceC2669a = this.f18747i;
                expandableBehavior.H((View) interfaceC2669a, this.f18745d, interfaceC2669a.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f18744a = 0;
    }

    private boolean F(boolean z7) {
        if (!z7) {
            return this.f18744a == 1;
        }
        int i7 = this.f18744a;
        return i7 == 0 || i7 == 2;
    }

    protected InterfaceC2669a G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> listL = coordinatorLayout.l(view);
        int size = listL.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = listL.get(i7);
            if (e(coordinatorLayout, view, view2)) {
                return (InterfaceC2669a) view2;
            }
        }
        return null;
    }

    protected abstract boolean H(View view, View view2, boolean z7, boolean z8);

    @Override
    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC2669a interfaceC2669a = (InterfaceC2669a) view2;
        if (!F(interfaceC2669a.a())) {
            return false;
        }
        this.f18744a = interfaceC2669a.a() ? 1 : 2;
        return H((View) interfaceC2669a, view, interfaceC2669a.a(), true);
    }

    @Override
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i7) {
        InterfaceC2669a interfaceC2669aG;
        if (Z.R(view) || (interfaceC2669aG = G(coordinatorLayout, view)) == null || !F(interfaceC2669aG.a())) {
            return false;
        }
        int i8 = interfaceC2669aG.a() ? 1 : 2;
        this.f18744a = i8;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i8, interfaceC2669aG));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18744a = 0;
    }
}
