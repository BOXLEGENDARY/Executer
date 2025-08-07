package com.google.android.material.bottomsheet;

import H0.c;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Z;
import androidx.customview.view.AbsSavedState;
import c4.C1746b;
import c4.C1748d;
import c4.C1753i;
import c4.C1754j;
import c4.C1755k;
import com.google.android.material.internal.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p4.C2724b;
import r4.C2754c;
import s0.C2870a;
import u4.C2937g;
import u4.k;
import y0.C3019t;
import y0.InterfaceC3022w;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    private static final int f17355i0 = C1754j.f12953f;

    private boolean f17356A;

    private final BottomSheetBehavior<V>.g f17357B;

    private ValueAnimator f17358C;

    int f17359D;

    int f17360E;

    int f17361F;

    float f17362G;

    int f17363H;

    float f17364I;

    boolean f17365J;

    private boolean f17366K;

    private boolean f17367L;

    int f17368M;

    int f17369N;

    H0.c f17370O;

    private boolean f17371P;

    private int f17372Q;

    private boolean f17373R;

    private float f17374S;

    private int f17375T;

    int f17376U;

    int f17377V;

    WeakReference<V> f17378W;

    WeakReference<View> f17379X;

    WeakReference<View> f17380Y;

    private final ArrayList<f> f17381Z;

    private int f17382a;

    private VelocityTracker f17383a0;

    private boolean f17384b;

    C2724b f17385b0;

    private boolean f17386c;

    int f17387c0;

    private float f17388d;

    private int f17389d0;

    private int f17390e;

    boolean f17391e0;

    private int f17392f;

    private Map<View, Integer> f17393f0;

    private boolean f17394g;

    final SparseIntArray f17395g0;

    private int f17396h;

    private final c.AbstractC0023c f17397h0;

    private int f17398i;

    private C2937g f17399j;

    private ColorStateList f17400k;

    private int f17401l;

    private int f17402m;

    private int f17403n;

    private boolean f17404o;

    private boolean f17405p;

    private boolean f17406q;

    private boolean f17407r;

    private boolean f17408s;

    private boolean f17409t;

    private boolean f17410u;

    private boolean f17411v;

    private int f17412w;

    private int f17413x;

    private boolean f17414y;

    private k f17415z;

    class a implements Runnable {

        final View f17421d;

        final int f17422e;

        a(View view, int i7) {
            this.f17421d = view;
            this.f17422e = i7;
        }

        @Override
        public void run() {
            BottomSheetBehavior.this.a1(this.f17421d, this.f17422e, false);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f17399j != null) {
                BottomSheetBehavior.this.f17399j.b0(fFloatValue);
            }
        }
    }

    class c implements s.c {

        final boolean f17425a;

        c(boolean z7) {
            this.f17425a = z7;
        }

        @Override
        public androidx.core.view.WindowInsetsCompat a(android.view.View r11, androidx.core.view.WindowInsetsCompat r12, com.google.android.material.internal.s.d r13) {
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.a(android.view.View, androidx.core.view.WindowInsetsCompat, com.google.android.material.internal.s$d):androidx.core.view.WindowInsetsCompat");
        }
    }

    class d extends c.AbstractC0023c {

        private long f17427a;

        d() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f17377V + bottomSheetBehavior.o0()) / 2;
        }

        @Override
        public int a(View view, int i7, int i8) {
            return view.getLeft();
        }

        @Override
        public int b(View view, int i7, int i8) {
            return C2870a.c(i7, BottomSheetBehavior.this.o0(), e(view));
        }

        @Override
        public int e(View view) {
            return BottomSheetBehavior.this.f0() ? BottomSheetBehavior.this.f17377V : BottomSheetBehavior.this.f17363H;
        }

        @Override
        public void j(int i7) {
            if (i7 == 1 && BottomSheetBehavior.this.f17367L) {
                BottomSheetBehavior.this.S0(1);
            }
        }

        @Override
        public void k(View view, int i7, int i8, int i9, int i10) {
            BottomSheetBehavior.this.k0(i8);
        }

        @Override
        public void l(android.view.View r8, float r9, float r10) {
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override
        public boolean m(View view, int i7) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i8 = bottomSheetBehavior.f17368M;
            if (i8 == 1 || bottomSheetBehavior.f17391e0) {
                return false;
            }
            if (i8 == 3 && bottomSheetBehavior.f17387c0 == i7) {
                WeakReference<View> weakReference = bottomSheetBehavior.f17380Y;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f17427a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f17378W;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class e implements InterfaceC3022w {

        final int f17429a;

        e(int i7) {
            this.f17429a = i7;
        }

        @Override
        public boolean a(View view, InterfaceC3022w.a aVar) {
            BottomSheetBehavior.this.R0(this.f17429a);
            return true;
        }
    }

    public static abstract class f {
        void a(View view) {
        }

        public abstract void b(View view, float f7);

        public abstract void c(View view, int i7);
    }

    public BottomSheetBehavior() {
        this.f17382a = 0;
        this.f17384b = true;
        this.f17386c = false;
        this.f17401l = -1;
        this.f17402m = -1;
        this.f17357B = new g(this, null);
        this.f17362G = 0.5f;
        this.f17364I = -1.0f;
        this.f17367L = true;
        this.f17368M = 4;
        this.f17369N = 4;
        this.f17374S = 0.1f;
        this.f17381Z = new ArrayList<>();
        this.f17389d0 = -1;
        this.f17395g0 = new SparseIntArray();
        this.f17397h0 = new d();
    }

    private void A0(View view, C3019t.a aVar, int i7) {
        Z.j0(view, aVar, null, h0(i7));
    }

    private void B0() {
        this.f17387c0 = -1;
        this.f17389d0 = -1;
        VelocityTracker velocityTracker = this.f17383a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f17383a0 = null;
        }
    }

    private void C0(SavedState savedState) {
        int i7 = this.f17382a;
        if (i7 == 0) {
            return;
        }
        if (i7 == -1 || (i7 & 1) == 1) {
            this.f17392f = savedState.f17417e;
        }
        if (i7 == -1 || (i7 & 2) == 2) {
            this.f17384b = savedState.f17418i;
        }
        if (i7 == -1 || (i7 & 4) == 4) {
            this.f17365J = savedState.f17419v;
        }
        if (i7 == -1 || (i7 & 8) == 8) {
            this.f17366K = savedState.f17420w;
        }
    }

    private void D0(V v7, Runnable runnable) {
        if (y0(v7)) {
            v7.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void U0(View view) {
        boolean z7 = (Build.VERSION.SDK_INT < 29 || v0() || this.f17394g) ? false : true;
        if (this.f17405p || this.f17406q || this.f17407r || this.f17409t || this.f17410u || this.f17411v || z7) {
            s.c(view, new c(z7));
        }
    }

    private boolean W0() {
        return this.f17370O != null && (this.f17367L || this.f17368M == 1);
    }

    private int X(View view, int i7, int i8) {
        return Z.c(view, view.getResources().getString(i7), h0(i8));
    }

    private void Z() {
        int iD0 = d0();
        if (this.f17384b) {
            this.f17363H = Math.max(this.f17377V - iD0, this.f17360E);
        } else {
            this.f17363H = this.f17377V - iD0;
        }
    }

    private float a0(float f7, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f7 > 0.0f) {
                return radius / f7;
            }
        }
        return 0.0f;
    }

    public void a1(View view, int i7, boolean z7) {
        int iR0 = r0(i7);
        H0.c cVar = this.f17370O;
        if (cVar == null || (!z7 ? cVar.H(view, view.getLeft(), iR0) : cVar.F(view.getLeft(), iR0))) {
            S0(i7);
            return;
        }
        S0(2);
        d1(i7, true);
        this.f17357B.c(i7);
    }

    private void b0() {
        this.f17361F = (int) (this.f17377V * (1.0f - this.f17362G));
    }

    private void b1() {
        WeakReference<V> weakReference = this.f17378W;
        if (weakReference != null) {
            c1(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.f17379X;
        if (weakReference2 != null) {
            c1(weakReference2.get(), 1);
        }
    }

    private float c0() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        if (this.f17399j == null || (weakReference = this.f17378W) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        V v7 = this.f17378W.get();
        if (!t0() || (rootWindowInsets = v7.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(a0(this.f17399j.J(), rootWindowInsets.getRoundedCorner(0)), a0(this.f17399j.K(), rootWindowInsets.getRoundedCorner(1)));
    }

    private void c1(View view, int i7) {
        if (view == null) {
            return;
        }
        g0(view, i7);
        if (!this.f17384b && this.f17368M != 6) {
            this.f17395g0.put(i7, X(view, C1753i.f12922a, 6));
        }
        if (this.f17365J && x0() && this.f17368M != 5) {
            A0(view, C3019t.a.f24405y, 5);
        }
        int i8 = this.f17368M;
        if (i8 == 3) {
            A0(view, C3019t.a.f24404x, this.f17384b ? 4 : 6);
            return;
        }
        if (i8 == 4) {
            A0(view, C3019t.a.f24403w, this.f17384b ? 3 : 6);
        } else {
            if (i8 != 6) {
                return;
            }
            A0(view, C3019t.a.f24404x, 4);
            A0(view, C3019t.a.f24403w, 3);
        }
    }

    private int d0() {
        int i7;
        return this.f17394g ? Math.min(Math.max(this.f17396h, this.f17377V - ((this.f17376U * 9) / 16)), this.f17375T) + this.f17412w : (this.f17404o || this.f17405p || (i7 = this.f17403n) <= 0) ? this.f17392f + this.f17412w : Math.max(this.f17392f, i7 + this.f17398i);
    }

    private void d1(int i7, boolean z7) {
        boolean zU0;
        ValueAnimator valueAnimator;
        if (i7 == 2 || this.f17356A == (zU0 = u0()) || this.f17399j == null) {
            return;
        }
        this.f17356A = zU0;
        if (!z7 || (valueAnimator = this.f17358C) == null) {
            ValueAnimator valueAnimator2 = this.f17358C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f17358C.cancel();
            }
            this.f17399j.b0(this.f17356A ? c0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f17358C.reverse();
        } else {
            this.f17358C.setFloatValues(this.f17399j.y(), zU0 ? c0() : 1.0f);
            this.f17358C.start();
        }
    }

    private float e0(int i7) {
        float f7;
        float fO0;
        int i8 = this.f17363H;
        if (i7 > i8 || i8 == o0()) {
            int i9 = this.f17363H;
            f7 = i9 - i7;
            fO0 = this.f17377V - i9;
        } else {
            int i10 = this.f17363H;
            f7 = i10 - i7;
            fO0 = i10 - o0();
        }
        return f7 / fO0;
    }

    private void e1(boolean z7) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f17378W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z7) {
                if (this.f17393f0 != null) {
                    return;
                } else {
                    this.f17393f0 = new HashMap(childCount);
                }
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                if (childAt != this.f17378W.get()) {
                    if (z7) {
                        this.f17393f0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f17386c) {
                            Z.x0(childAt, 4);
                        }
                    } else if (this.f17386c && (map = this.f17393f0) != null && map.containsKey(childAt)) {
                        Z.x0(childAt, this.f17393f0.get(childAt).intValue());
                    }
                }
            }
            if (!z7) {
                this.f17393f0 = null;
            } else if (this.f17386c) {
                this.f17378W.get().sendAccessibilityEvent(8);
            }
        }
    }

    public boolean f0() {
        return w0() && x0();
    }

    public void f1(boolean z7) {
        V v7;
        if (this.f17378W != null) {
            Z();
            if (this.f17368M != 4 || (v7 = this.f17378W.get()) == null) {
                return;
            }
            if (z7) {
                R0(4);
            } else {
                v7.requestLayout();
            }
        }
    }

    private void g0(View view, int i7) {
        if (view == null) {
            return;
        }
        Z.h0(view, 524288);
        Z.h0(view, 262144);
        Z.h0(view, 1048576);
        int i8 = this.f17395g0.get(i7, -1);
        if (i8 != -1) {
            Z.h0(view, i8);
            this.f17395g0.delete(i7);
        }
    }

    private InterfaceC3022w h0(int i7) {
        return new e(i7);
    }

    private void i0(Context context) {
        if (this.f17415z == null) {
            return;
        }
        C2937g c2937g = new C2937g(this.f17415z);
        this.f17399j = c2937g;
        c2937g.Q(context);
        ColorStateList colorStateList = this.f17400k;
        if (colorStateList != null) {
            this.f17399j.a0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f17399j.setTint(typedValue.data);
    }

    private void j0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c0(), 1.0f);
        this.f17358C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f17358C.addUpdateListener(new b());
    }

    public static <V extends View> BottomSheetBehavior<V> m0(V v7) {
        ViewGroup.LayoutParams layoutParams = v7.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) layoutParams).f();
        if (cVarF instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVarF;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int n0(int i7, int i8, int i9, int i10) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i8, i10);
        if (i9 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i9), 1073741824);
        }
        if (size != 0) {
            i9 = Math.min(size, i9);
        }
        return View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
    }

    private int r0(int i7) {
        if (i7 == 3) {
            return o0();
        }
        if (i7 == 4) {
            return this.f17363H;
        }
        if (i7 == 5) {
            return this.f17377V;
        }
        if (i7 == 6) {
            return this.f17361F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i7);
    }

    private float s0() {
        VelocityTracker velocityTracker = this.f17383a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f17388d);
        return this.f17383a0.getYVelocity(this.f17387c0);
    }

    private boolean t0() {
        WeakReference<V> weakReference = this.f17378W;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        this.f17378W.get().getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    private boolean u0() {
        return this.f17368M == 3 && (this.f17414y || t0());
    }

    private boolean y0(V v7) {
        ViewParent parent = v7.getParent();
        return parent != null && parent.isLayoutRequested() && Z.Q(v7);
    }

    @Override
    public boolean A(CoordinatorLayout coordinatorLayout, V v7, View view, View view2, int i7, int i8) {
        this.f17372Q = 0;
        this.f17373R = false;
        return (i7 & 2) != 0;
    }

    @Override
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override
    public boolean D(CoordinatorLayout coordinatorLayout, V v7, MotionEvent motionEvent) {
        if (!v7.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f17368M == 1 && actionMasked == 0) {
            return true;
        }
        if (W0()) {
            this.f17370O.z(motionEvent);
        }
        if (actionMasked == 0) {
            B0();
        }
        if (this.f17383a0 == null) {
            this.f17383a0 = VelocityTracker.obtain();
        }
        this.f17383a0.addMovement(motionEvent);
        if (W0() && actionMasked == 2 && !this.f17371P && Math.abs(this.f17389d0 - motionEvent.getY()) > this.f17370O.u()) {
            this.f17370O.b(v7, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f17371P;
    }

    public void E0(boolean z7) {
        this.f17367L = z7;
    }

    public void F0(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f17359D = i7;
        d1(this.f17368M, true);
    }

    public void G0(boolean z7) {
        if (this.f17384b == z7) {
            return;
        }
        this.f17384b = z7;
        if (this.f17378W != null) {
            Z();
        }
        S0((this.f17384b && this.f17368M == 6) ? 3 : this.f17368M);
        d1(this.f17368M, true);
        b1();
    }

    public void H0(boolean z7) {
        this.f17404o = z7;
    }

    public void I0(float f7) {
        if (f7 <= 0.0f || f7 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f17362G = f7;
        if (this.f17378W != null) {
            b0();
        }
    }

    public void J0(boolean z7) {
        if (this.f17365J != z7) {
            this.f17365J = z7;
            if (!z7 && this.f17368M == 5) {
                R0(4);
            }
            b1();
        }
    }

    public void K0(int i7) {
        this.f17402m = i7;
    }

    public void L0(int i7) {
        this.f17401l = i7;
    }

    public void M0(int i7) {
        N0(i7, false);
    }

    public final void N0(int i7, boolean z7) {
        if (i7 == -1) {
            if (this.f17394g) {
                return;
            } else {
                this.f17394g = true;
            }
        } else {
            if (!this.f17394g && this.f17392f == i7) {
                return;
            }
            this.f17394g = false;
            this.f17392f = Math.max(0, i7);
        }
        f1(z7);
    }

    public void O0(int i7) {
        this.f17382a = i7;
    }

    public void P0(int i7) {
        this.f17390e = i7;
    }

    public void Q0(boolean z7) {
        this.f17366K = z7;
    }

    public void R0(int i7) {
        if (i7 == 1 || i7 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i7 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.f17365J && i7 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i7);
            return;
        }
        int i8 = (i7 == 6 && this.f17384b && r0(i7) <= this.f17360E) ? 3 : i7;
        WeakReference<V> weakReference = this.f17378W;
        if (weakReference == null || weakReference.get() == null) {
            S0(i7);
        } else {
            V v7 = this.f17378W.get();
            D0(v7, new a(v7, i8));
        }
    }

    void S0(int i7) {
        V v7;
        if (this.f17368M == i7) {
            return;
        }
        this.f17368M = i7;
        if (i7 == 4 || i7 == 3 || i7 == 6 || (this.f17365J && i7 == 5)) {
            this.f17369N = i7;
        }
        WeakReference<V> weakReference = this.f17378W;
        if (weakReference == null || (v7 = weakReference.get()) == null) {
            return;
        }
        if (i7 == 3) {
            e1(true);
        } else if (i7 == 6 || i7 == 5 || i7 == 4) {
            e1(false);
        }
        d1(i7, true);
        for (int i8 = 0; i8 < this.f17381Z.size(); i8++) {
            this.f17381Z.get(i8).c(v7, i7);
        }
        b1();
    }

    public void T0(boolean z7) {
        this.f17386c = z7;
    }

    public boolean V0(long j7, float f7) {
        return false;
    }

    boolean X0(View view, float f7) {
        if (this.f17366K) {
            return true;
        }
        if (x0() && view.getTop() >= this.f17363H) {
            return Math.abs((((float) view.getTop()) + (f7 * this.f17374S)) - ((float) this.f17363H)) / ((float) d0()) > 0.5f;
        }
        return false;
    }

    public void Y(f fVar) {
        if (this.f17381Z.contains(fVar)) {
            return;
        }
        this.f17381Z.add(fVar);
    }

    public boolean Y0() {
        return false;
    }

    public boolean Z0() {
        return true;
    }

    @Override
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f17378W = null;
        this.f17370O = null;
        this.f17385b0 = null;
    }

    @Override
    public void j() {
        super.j();
        this.f17378W = null;
        this.f17370O = null;
        this.f17385b0 = null;
    }

    @Override
    public boolean k(CoordinatorLayout coordinatorLayout, V v7, MotionEvent motionEvent) {
        int i7;
        H0.c cVar;
        if (!v7.isShown() || !this.f17367L) {
            this.f17371P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            B0();
        }
        if (this.f17383a0 == null) {
            this.f17383a0 = VelocityTracker.obtain();
        }
        this.f17383a0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x7 = (int) motionEvent.getX();
            this.f17389d0 = (int) motionEvent.getY();
            if (this.f17368M != 2) {
                WeakReference<View> weakReference = this.f17380Y;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.v(view, x7, this.f17389d0)) {
                    this.f17387c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f17391e0 = true;
                }
            }
            this.f17371P = this.f17387c0 == -1 && !coordinatorLayout.v(v7, x7, this.f17389d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f17391e0 = false;
            this.f17387c0 = -1;
            if (this.f17371P) {
                this.f17371P = false;
                return false;
            }
        }
        if (!this.f17371P && (cVar = this.f17370O) != null && cVar.G(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f17380Y;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f17371P || this.f17368M == 1 || coordinatorLayout.v(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f17370O == null || (i7 = this.f17389d0) == -1 || Math.abs(((float) i7) - motionEvent.getY()) <= ((float) this.f17370O.u())) ? false : true;
    }

    void k0(int i7) {
        V v7 = this.f17378W.get();
        if (v7 == null || this.f17381Z.isEmpty()) {
            return;
        }
        float fE0 = e0(i7);
        for (int i8 = 0; i8 < this.f17381Z.size(); i8++) {
            this.f17381Z.get(i8).b(v7, fE0);
        }
    }

    @Override
    public boolean l(CoordinatorLayout coordinatorLayout, V v7, int i7) {
        if (Z.w(coordinatorLayout) && !Z.w(v7)) {
            v7.setFitsSystemWindows(true);
        }
        if (this.f17378W == null) {
            this.f17396h = coordinatorLayout.getResources().getDimensionPixelSize(C1748d.f12800a);
            U0(v7);
            Z.I0(v7, new com.google.android.material.bottomsheet.a(v7));
            this.f17378W = new WeakReference<>(v7);
            this.f17385b0 = new C2724b(v7);
            C2937g c2937g = this.f17399j;
            if (c2937g != null) {
                Z.r0(v7, c2937g);
                C2937g c2937g2 = this.f17399j;
                float fU = this.f17364I;
                if (fU == -1.0f) {
                    fU = Z.u(v7);
                }
                c2937g2.Z(fU);
            } else {
                ColorStateList colorStateList = this.f17400k;
                if (colorStateList != null) {
                    Z.s0(v7, colorStateList);
                }
            }
            b1();
            if (Z.x(v7) == 0) {
                Z.x0(v7, 1);
            }
        }
        if (this.f17370O == null) {
            this.f17370O = H0.c.m(coordinatorLayout, this.f17397h0);
        }
        int top = v7.getTop();
        coordinatorLayout.C(v7, i7);
        this.f17376U = coordinatorLayout.getWidth();
        this.f17377V = coordinatorLayout.getHeight();
        int height = v7.getHeight();
        this.f17375T = height;
        int iMin = this.f17377V;
        int i8 = iMin - height;
        int i9 = this.f17413x;
        if (i8 < i9) {
            if (this.f17408s) {
                int i10 = this.f17402m;
                if (i10 != -1) {
                    iMin = Math.min(iMin, i10);
                }
                this.f17375T = iMin;
            } else {
                int iMin2 = iMin - i9;
                int i11 = this.f17402m;
                if (i11 != -1) {
                    iMin2 = Math.min(iMin2, i11);
                }
                this.f17375T = iMin2;
            }
        }
        this.f17360E = Math.max(0, this.f17377V - this.f17375T);
        b0();
        Z();
        int i12 = this.f17368M;
        if (i12 == 3) {
            Z.Y(v7, o0());
        } else if (i12 == 6) {
            Z.Y(v7, this.f17361F);
        } else if (this.f17365J && i12 == 5) {
            Z.Y(v7, this.f17377V);
        } else if (i12 == 4) {
            Z.Y(v7, this.f17363H);
        } else if (i12 == 1 || i12 == 2) {
            Z.Y(v7, top - v7.getTop());
        }
        d1(this.f17368M, false);
        this.f17380Y = new WeakReference<>(l0(v7));
        for (int i13 = 0; i13 < this.f17381Z.size(); i13++) {
            this.f17381Z.get(i13).a(v7);
        }
        return true;
    }

    View l0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (Z.S(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View viewL0 = l0(viewGroup.getChildAt(i7));
                if (viewL0 != null) {
                    return viewL0;
                }
            }
        }
        return null;
    }

    @Override
    public boolean m(CoordinatorLayout coordinatorLayout, V v7, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v7.getLayoutParams();
        v7.measure(n0(i7, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, this.f17401l, marginLayoutParams.width), n0(i9, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, this.f17402m, marginLayoutParams.height));
        return true;
    }

    @Override
    public boolean o(CoordinatorLayout coordinatorLayout, V v7, View view, float f7, float f8) {
        WeakReference<View> weakReference;
        if (z0() && (weakReference = this.f17380Y) != null && view == weakReference.get()) {
            return this.f17368M != 3 || super.o(coordinatorLayout, v7, view, f7, f8);
        }
        return false;
    }

    public int o0() {
        if (this.f17384b) {
            return this.f17360E;
        }
        return Math.max(this.f17359D, this.f17408s ? 0 : this.f17413x);
    }

    public int p0() {
        if (this.f17394g) {
            return -1;
        }
        return this.f17392f;
    }

    @Override
    public void q(CoordinatorLayout coordinatorLayout, V v7, View view, int i7, int i8, int[] iArr, int i9) {
        if (i9 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f17380Y;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!z0() || view == view2) {
            int top = v7.getTop();
            int i10 = top - i8;
            if (i8 > 0) {
                if (i10 < o0()) {
                    int iO0 = top - o0();
                    iArr[1] = iO0;
                    Z.Y(v7, -iO0);
                    S0(3);
                } else {
                    if (!this.f17367L) {
                        return;
                    }
                    iArr[1] = i8;
                    Z.Y(v7, -i8);
                    S0(1);
                }
            } else if (i8 < 0 && !view.canScrollVertically(-1)) {
                if (i10 > this.f17363H && !f0()) {
                    int i11 = top - this.f17363H;
                    iArr[1] = i11;
                    Z.Y(v7, -i11);
                    S0(4);
                } else {
                    if (!this.f17367L) {
                        return;
                    }
                    iArr[1] = i8;
                    Z.Y(v7, -i8);
                    S0(1);
                }
            }
            k0(v7.getTop());
            this.f17372Q = i8;
            this.f17373R = true;
        }
    }

    public int q0() {
        return this.f17368M;
    }

    @Override
    public void t(CoordinatorLayout coordinatorLayout, V v7, View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
    }

    public boolean v0() {
        return this.f17404o;
    }

    public boolean w0() {
        return this.f17365J;
    }

    @Override
    public void x(CoordinatorLayout coordinatorLayout, V v7, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.x(coordinatorLayout, v7, savedState.getSuperState());
        C0(savedState);
        int i7 = savedState.f17416d;
        if (i7 == 1 || i7 == 2) {
            this.f17368M = 4;
            this.f17369N = 4;
        } else {
            this.f17368M = i7;
            this.f17369N = i7;
        }
    }

    public boolean x0() {
        return true;
    }

    @Override
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v7) {
        return new SavedState(super.y(coordinatorLayout, v7), (BottomSheetBehavior<?>) this);
    }

    public boolean z0() {
        return true;
    }

    private class g {

        private int f17431a;

        private boolean f17432b;

        private final Runnable f17433c;

        class a implements Runnable {
            a() {
            }

            @Override
            public void run() {
                g.this.f17432b = false;
                H0.c cVar = BottomSheetBehavior.this.f17370O;
                if (cVar != null && cVar.k(true)) {
                    g gVar = g.this;
                    gVar.c(gVar.f17431a);
                    return;
                }
                g gVar2 = g.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f17368M == 2) {
                    bottomSheetBehavior.S0(gVar2.f17431a);
                }
            }
        }

        private g() {
            this.f17433c = new a();
        }

        void c(int i7) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.f17378W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f17431a = i7;
            if (this.f17432b) {
                return;
            }
            Z.f0(BottomSheetBehavior.this.f17378W.get(), this.f17433c);
            this.f17432b = true;
        }

        g(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        final int f17416d;

        int f17417e;

        boolean f17418i;

        boolean f17419v;

        boolean f17420w;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17416d = parcel.readInt();
            this.f17417e = parcel.readInt();
            this.f17418i = parcel.readInt() == 1;
            this.f17419v = parcel.readInt() == 1;
            this.f17420w = parcel.readInt() == 1;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f17416d);
            parcel.writeInt(this.f17417e);
            parcel.writeInt(this.f17418i ? 1 : 0);
            parcel.writeInt(this.f17419v ? 1 : 0);
            parcel.writeInt(this.f17420w ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f17416d = bottomSheetBehavior.f17368M;
            this.f17417e = ((BottomSheetBehavior) bottomSheetBehavior).f17392f;
            this.f17418i = ((BottomSheetBehavior) bottomSheetBehavior).f17384b;
            this.f17419v = bottomSheetBehavior.f17365J;
            this.f17420w = ((BottomSheetBehavior) bottomSheetBehavior).f17366K;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i7;
        super(context, attributeSet);
        this.f17382a = 0;
        this.f17384b = true;
        this.f17386c = false;
        this.f17401l = -1;
        this.f17402m = -1;
        this.f17357B = new g(this, null);
        this.f17362G = 0.5f;
        this.f17364I = -1.0f;
        this.f17367L = true;
        this.f17368M = 4;
        this.f17369N = 4;
        this.f17374S = 0.1f;
        this.f17381Z = new ArrayList<>();
        this.f17389d0 = -1;
        this.f17395g0 = new SparseIntArray();
        this.f17397h0 = new d();
        this.f17398i = context.getResources().getDimensionPixelSize(C1748d.f12805c0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1755k.f13025J);
        int i8 = C1755k.f13050N;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            this.f17400k = C2754c.a(context, typedArrayObtainStyledAttributes, i8);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1755k.f13162f0)) {
            this.f17415z = k.e(context, attributeSet, C1746b.f12733b, f17355i0).m();
        }
        i0(context);
        j0();
        this.f17364I = typedArrayObtainStyledAttributes.getDimension(C1755k.f13044M, -1.0f);
        int i9 = C1755k.f13032K;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            L0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i9, -1));
        }
        int i10 = C1755k.f13038L;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            K0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i10, -1));
        }
        int i11 = C1755k.f13086T;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i11);
        if (typedValuePeekValue != null && (i7 = typedValuePeekValue.data) == -1) {
            M0(i7);
        } else {
            M0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i11, -1));
        }
        J0(typedArrayObtainStyledAttributes.getBoolean(C1755k.f13080S, false));
        H0(typedArrayObtainStyledAttributes.getBoolean(C1755k.f13107X, false));
        G0(typedArrayObtainStyledAttributes.getBoolean(C1755k.f13068Q, true));
        Q0(typedArrayObtainStyledAttributes.getBoolean(C1755k.f13101W, false));
        E0(typedArrayObtainStyledAttributes.getBoolean(C1755k.f13056O, true));
        O0(typedArrayObtainStyledAttributes.getInt(C1755k.f13091U, 0));
        I0(typedArrayObtainStyledAttributes.getFloat(C1755k.f13074R, 0.5f));
        int i12 = C1755k.f13062P;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i12);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            F0(typedValuePeekValue2.data);
        } else {
            F0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i12, 0));
        }
        P0(typedArrayObtainStyledAttributes.getInt(C1755k.f13096V, 500));
        this.f17405p = typedArrayObtainStyledAttributes.getBoolean(C1755k.f13133b0, false);
        this.f17406q = typedArrayObtainStyledAttributes.getBoolean(C1755k.f13140c0, false);
        this.f17407r = typedArrayObtainStyledAttributes.getBoolean(C1755k.f13146d0, false);
        this.f17408s = typedArrayObtainStyledAttributes.getBoolean(C1755k.f13154e0, true);
        this.f17409t = typedArrayObtainStyledAttributes.getBoolean(C1755k.f13113Y, false);
        this.f17410u = typedArrayObtainStyledAttributes.getBoolean(C1755k.f13119Z, false);
        this.f17411v = typedArrayObtainStyledAttributes.getBoolean(C1755k.f13126a0, false);
        this.f17414y = typedArrayObtainStyledAttributes.getBoolean(C1755k.f13170g0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f17388d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
