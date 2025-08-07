package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c4.C1746b;
import d4.C2388a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p4.e;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    private static final int f17270j = C1746b.f12708D;

    private static final int f17271k = C1746b.f12711G;

    private static final int f17272l = C1746b.f12718N;

    private final LinkedHashSet<b> f17273a;

    private int f17274b;

    private int f17275c;

    private TimeInterpolator f17276d;

    private TimeInterpolator f17277e;

    private int f17278f;

    private int f17279g;

    private int f17280h;

    private ViewPropertyAnimator f17281i;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f17281i = null;
        }
    }

    public interface b {
        void a(View view, int i7);
    }

    public HideBottomViewOnScrollBehavior() {
        this.f17273a = new LinkedHashSet<>();
        this.f17278f = 0;
        this.f17279g = 2;
        this.f17280h = 0;
    }

    private void F(V v7, int i7, long j7, TimeInterpolator timeInterpolator) {
        this.f17281i = v7.animate().translationY(i7).setInterpolator(timeInterpolator).setDuration(j7).setListener(new a());
    }

    private void N(V v7, int i7) {
        this.f17279g = i7;
        Iterator<b> it = this.f17273a.iterator();
        while (it.hasNext()) {
            it.next().a(v7, this.f17279g);
        }
    }

    @Override
    public boolean A(CoordinatorLayout coordinatorLayout, V v7, View view, View view2, int i7, int i8) {
        return i7 == 2;
    }

    public boolean G() {
        return this.f17279g == 1;
    }

    public boolean H() {
        return this.f17279g == 2;
    }

    public void I(V v7, int i7) {
        this.f17280h = i7;
        if (this.f17279g == 1) {
            v7.setTranslationY(this.f17278f + i7);
        }
    }

    public void J(V v7) {
        K(v7, true);
    }

    public void K(V v7, boolean z7) {
        if (G()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f17281i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v7.clearAnimation();
        }
        N(v7, 1);
        int i7 = this.f17278f + this.f17280h;
        if (z7) {
            F(v7, i7, this.f17275c, this.f17277e);
        } else {
            v7.setTranslationY(i7);
        }
    }

    public void L(V v7) {
        M(v7, true);
    }

    public void M(V v7, boolean z7) {
        if (H()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f17281i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v7.clearAnimation();
        }
        N(v7, 2);
        if (z7) {
            F(v7, 0, this.f17274b, this.f17276d);
        } else {
            v7.setTranslationY(0);
        }
    }

    @Override
    public boolean l(CoordinatorLayout coordinatorLayout, V v7, int i7) {
        this.f17278f = v7.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v7.getLayoutParams()).bottomMargin;
        this.f17274b = e.f(v7.getContext(), f17270j, 225);
        this.f17275c = e.f(v7.getContext(), f17271k, 175);
        Context context = v7.getContext();
        int i8 = f17272l;
        this.f17276d = e.g(context, i8, C2388a.f20315d);
        this.f17277e = e.g(v7.getContext(), i8, C2388a.f20314c);
        return super.l(coordinatorLayout, v7, i7);
    }

    @Override
    public void t(CoordinatorLayout coordinatorLayout, V v7, View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        if (i8 > 0) {
            J(v7);
        } else if (i8 < 0) {
            L(v7);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17273a = new LinkedHashSet<>();
        this.f17278f = 0;
        this.f17279g = 2;
        this.f17280h = 0;
    }
}
