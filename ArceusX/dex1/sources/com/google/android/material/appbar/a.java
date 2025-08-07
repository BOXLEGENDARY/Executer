package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Z;
import s0.C2870a;

abstract class a<V extends View> extends c<V> {

    private Runnable f17245d;

    OverScroller f17246e;

    private boolean f17247f;

    private int f17248g;

    private int f17249h;

    private int f17250i;

    private VelocityTracker f17251j;

    private class RunnableC0154a implements Runnable {

        private final CoordinatorLayout f17252d;

        private final V f17253e;

        RunnableC0154a(CoordinatorLayout coordinatorLayout, V v7) {
            this.f17252d = coordinatorLayout;
            this.f17253e = v7;
        }

        @Override
        public void run() {
            OverScroller overScroller;
            if (this.f17253e == null || (overScroller = a.this.f17246e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                a.this.N(this.f17252d, this.f17253e);
                return;
            }
            a aVar = a.this;
            aVar.P(this.f17252d, this.f17253e, aVar.f17246e.getCurrY());
            Z.f0(this.f17253e, this);
        }
    }

    public a() {
        this.f17248g = -1;
        this.f17250i = -1;
    }

    private void I() {
        if (this.f17251j == null) {
            this.f17251j = VelocityTracker.obtain();
        }
    }

    @Override
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    boolean H(V v7) {
        return false;
    }

    final boolean J(CoordinatorLayout coordinatorLayout, V v7, int i7, int i8, float f7) {
        Runnable runnable = this.f17245d;
        if (runnable != null) {
            v7.removeCallbacks(runnable);
            this.f17245d = null;
        }
        if (this.f17246e == null) {
            this.f17246e = new OverScroller(v7.getContext());
        }
        this.f17246e.fling(0, E(), 0, Math.round(f7), 0, 0, i7, i8);
        if (!this.f17246e.computeScrollOffset()) {
            N(coordinatorLayout, v7);
            return false;
        }
        RunnableC0154a runnableC0154a = new RunnableC0154a(coordinatorLayout, v7);
        this.f17245d = runnableC0154a;
        Z.f0(v7, runnableC0154a);
        return true;
    }

    int K(V v7) {
        return -v7.getHeight();
    }

    int L(V v7) {
        return v7.getHeight();
    }

    int M() {
        return E();
    }

    void N(CoordinatorLayout coordinatorLayout, V v7) {
    }

    final int O(CoordinatorLayout coordinatorLayout, V v7, int i7, int i8, int i9) {
        return Q(coordinatorLayout, v7, M() - i7, i8, i9);
    }

    int P(CoordinatorLayout coordinatorLayout, V v7, int i7) {
        return Q(coordinatorLayout, v7, i7, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int Q(CoordinatorLayout coordinatorLayout, V v7, int i7, int i8, int i9) {
        int iC;
        int iE = E();
        if (i8 == 0 || iE < i8 || iE > i9 || iE == (iC = C2870a.c(i7, i8, i9))) {
            return 0;
        }
        G(iC);
        return iE - iC;
    }

    @Override
    public boolean k(CoordinatorLayout coordinatorLayout, V v7, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f17250i < 0) {
            this.f17250i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f17247f) {
            int i7 = this.f17248g;
            if (i7 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i7)) == -1) {
                return false;
            }
            int y7 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y7 - this.f17249h) > this.f17250i) {
                this.f17249h = y7;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f17248g = -1;
            int x7 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            boolean z7 = H(v7) && coordinatorLayout.v(v7, x7, y8);
            this.f17247f = z7;
            if (z7) {
                this.f17249h = y8;
                this.f17248g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.f17246e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f17246e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f17251j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17248g = -1;
        this.f17250i = -1;
    }
}
