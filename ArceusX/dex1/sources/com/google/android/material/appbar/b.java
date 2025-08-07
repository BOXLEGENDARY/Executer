package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1640s;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.Z;
import java.util.List;
import s0.C2870a;

abstract class b extends c<View> {

    final Rect f17255d;

    final Rect f17256e;

    private int f17257f;

    private int f17258g;

    public b() {
        this.f17255d = new Rect();
        this.f17256e = new Rect();
        this.f17257f = 0;
    }

    private static int N(int i7) {
        if (i7 == 0) {
            return 8388659;
        }
        return i7;
    }

    @Override
    protected void F(CoordinatorLayout coordinatorLayout, View view, int i7) {
        View viewH = H(coordinatorLayout.l(view));
        if (viewH == null) {
            super.F(coordinatorLayout, view, i7);
            this.f17257f = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.f17255d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, viewH.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + viewH.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && Z.w(coordinatorLayout) && !Z.w(view)) {
            rect.left += lastWindowInsets.getSystemWindowInsetLeft();
            rect.right -= lastWindowInsets.getSystemWindowInsetRight();
        }
        Rect rect2 = this.f17256e;
        C1640s.a(N(fVar.f10332c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i7);
        int I2 = I(viewH);
        view.layout(rect2.left, rect2.top - I2, rect2.right, rect2.bottom - I2);
        this.f17257f = rect2.top - viewH.getBottom();
    }

    abstract View H(List<View> list);

    final int I(View view) {
        if (this.f17258g == 0) {
            return 0;
        }
        float fJ = J(view);
        int i7 = this.f17258g;
        return C2870a.c((int) (fJ * i7), 0, i7);
    }

    float J(View view) {
        return 1.0f;
    }

    public final int K() {
        return this.f17258g;
    }

    int L(View view) {
        return view.getMeasuredHeight();
    }

    final int M() {
        return this.f17257f;
    }

    public final void O(int i7) {
        this.f17258g = i7;
    }

    protected boolean P() {
        return false;
    }

    @Override
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9, int i10) {
        View viewH;
        WindowInsetsCompat lastWindowInsets;
        int i11 = view.getLayoutParams().height;
        if ((i11 != -1 && i11 != -2) || (viewH = H(coordinatorLayout.l(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i9);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (Z.w(viewH) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.getSystemWindowInsetTop() + lastWindowInsets.getSystemWindowInsetBottom();
        }
        int iL = size + L(viewH);
        int measuredHeight = viewH.getMeasuredHeight();
        if (P()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iL -= measuredHeight;
        }
        coordinatorLayout.D(view, i7, i8, View.MeasureSpec.makeMeasureSpec(iL, i11 == -1 ? 1073741824 : Integer.MIN_VALUE), i10);
        return true;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17255d = new Rect();
        this.f17256e = new Rect();
        this.f17257f = 0;
    }
}
