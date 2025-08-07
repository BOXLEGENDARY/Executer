package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1605a;
import androidx.core.view.D;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.Z;
import androidx.customview.view.AbsSavedState;
import c4.C1746b;
import c4.C1754j;
import c4.C1755k;
import d4.C2388a;
import h.C2473a;
import java.lang.ref.WeakReference;
import java.util.List;
import q0.C2731a;
import s0.C2870a;
import u4.C2937g;
import u4.h;
import y0.C3019t;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    private static final int f17192R = C1754j.f12952e;

    private List<a> f17193A;

    private boolean f17194B;

    private boolean f17195C;

    private boolean f17196D;

    private boolean f17197E;

    private int f17198F;

    private WeakReference<View> f17199G;

    private final boolean f17200H;

    private ValueAnimator f17201I;

    private ValueAnimator.AnimatorUpdateListener f17202J;

    private final long f17203K;

    private final TimeInterpolator f17204L;

    private int[] f17205M;

    private Drawable f17206N;

    private Integer f17207O;

    private final float f17208P;

    private Behavior f17209Q;

    private int f17210d;

    private int f17211e;

    private int f17212i;

    private int f17213v;

    private boolean f17214w;

    private int f17215y;

    private WindowInsetsCompat f17216z;

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.a<T> {

        private int f17217k;

        private int f17218l;

        private ValueAnimator f17219m;

        private SavedState f17220n;

        private WeakReference<View> f17221o;

        class a implements ValueAnimator.AnimatorUpdateListener {

            final CoordinatorLayout f17227a;

            final AppBarLayout f17228b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f17227a = coordinatorLayout;
                this.f17228b = appBarLayout;
            }

            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.f17227a, this.f17228b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b extends C1605a {

            final AppBarLayout f17230d;

            final CoordinatorLayout f17231e;

            b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f17230d = appBarLayout;
                this.f17231e = coordinatorLayout;
            }

            @Override
            public void g(View view, C3019t c3019t) {
                View viewF0;
                super.g(view, c3019t);
                c3019t.e0(ScrollView.class.getName());
                if (this.f17230d.getTotalScrollRange() == 0 || (viewF0 = BaseBehavior.this.f0(this.f17231e)) == null || !BaseBehavior.this.b0(this.f17230d)) {
                    return;
                }
                if (BaseBehavior.this.M() != (-this.f17230d.getTotalScrollRange())) {
                    c3019t.b(C3019t.a.f24397q);
                    c3019t.x0(true);
                }
                if (BaseBehavior.this.M() != 0) {
                    if (!viewF0.canScrollVertically(-1)) {
                        c3019t.b(C3019t.a.f24398r);
                        c3019t.x0(true);
                    } else if ((-this.f17230d.getDownNestedPreScrollRange()) != 0) {
                        c3019t.b(C3019t.a.f24398r);
                        c3019t.x0(true);
                    }
                }
            }

            @Override
            public boolean j(View view, int i7, Bundle bundle) {
                if (i7 == 4096) {
                    this.f17230d.setExpanded(false);
                    return true;
                }
                if (i7 != 8192) {
                    return super.j(view, i7, bundle);
                }
                if (BaseBehavior.this.M() != 0) {
                    View viewF0 = BaseBehavior.this.f0(this.f17231e);
                    if (!viewF0.canScrollVertically(-1)) {
                        this.f17230d.setExpanded(true);
                        return true;
                    }
                    int i8 = -this.f17230d.getDownNestedPreScrollRange();
                    if (i8 != 0) {
                        BaseBehavior.this.q(this.f17231e, this.f17230d, viewF0, 0, i8, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        public BaseBehavior() {
        }

        private void U(CoordinatorLayout coordinatorLayout, T t7) {
            if (Z.M(coordinatorLayout)) {
                return;
            }
            Z.n0(coordinatorLayout, new b(t7, coordinatorLayout));
        }

        private void V(CoordinatorLayout coordinatorLayout, T t7, int i7, float f7) {
            int iAbs = Math.abs(M() - i7);
            float fAbs = Math.abs(f7);
            W(coordinatorLayout, t7, i7, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t7.getHeight()) + 1.0f) * 150.0f));
        }

        private void W(CoordinatorLayout coordinatorLayout, T t7, int i7, int i8) {
            int iM = M();
            if (iM == i7) {
                ValueAnimator valueAnimator = this.f17219m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f17219m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f17219m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f17219m = valueAnimator3;
                valueAnimator3.setInterpolator(C2388a.f20316e);
                this.f17219m.addUpdateListener(new a(coordinatorLayout, t7));
            } else {
                valueAnimator2.cancel();
            }
            this.f17219m.setDuration(Math.min(i8, 600));
            this.f17219m.setIntValues(iM, i7);
            this.f17219m.start();
        }

        private int X(int i7, int i8, int i9) {
            return i7 < (i8 + i9) / 2 ? i8 : i9;
        }

        private boolean Z(CoordinatorLayout coordinatorLayout, T t7, View view) {
            return t7.i() && coordinatorLayout.getHeight() - view.getHeight() <= t7.getHeight();
        }

        private static boolean a0(int i7, int i8) {
            return (i7 & i8) == i8;
        }

        public boolean b0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                if (((d) appBarLayout.getChildAt(i7).getLayoutParams()).f17235a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View c0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                if ((childAt instanceof D) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View d0(AppBarLayout appBarLayout, int i7) {
            int iAbs = Math.abs(i7);
            int childCount = appBarLayout.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = appBarLayout.getChildAt(i8);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int e0(T t7, int i7) {
            int childCount = t7.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = t7.getChildAt(i8);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (a0(dVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i9 = -i7;
                if (top <= i9 && bottom >= i9) {
                    return i8;
                }
            }
            return -1;
        }

        public View f0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int i0(T t7, int i7) {
            int iAbs = Math.abs(i7);
            int childCount = t7.getChildCount();
            int topInset = 0;
            int i8 = 0;
            while (true) {
                if (i8 >= childCount) {
                    break;
                }
                View childAt = t7.getChildAt(i8);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator interpolatorD = dVar.d();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i8++;
                } else if (interpolatorD != null) {
                    int iC = dVar.c();
                    if ((iC & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                        if ((iC & 2) != 0) {
                            topInset -= Z.A(childAt);
                        }
                    }
                    if (Z.w(childAt)) {
                        topInset -= t7.getTopInset();
                    }
                    if (topInset > 0) {
                        float f7 = topInset;
                        return Integer.signum(i7) * (childAt.getTop() + Math.round(f7 * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f7)));
                    }
                }
            }
            return i7;
        }

        private boolean v0(CoordinatorLayout coordinatorLayout, T t7) {
            List<View> listM = coordinatorLayout.m(t7);
            int size = listM.size();
            for (int i7 = 0; i7 < size; i7++) {
                CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) listM.get(i7).getLayoutParams()).f();
                if (cVarF instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVarF).K() != 0;
                }
            }
            return false;
        }

        private void w0(CoordinatorLayout coordinatorLayout, T t7) {
            int topInset = t7.getTopInset() + t7.getPaddingTop();
            int iM = M() - topInset;
            int iE0 = e0(t7, iM);
            if (iE0 >= 0) {
                View childAt = t7.getChildAt(iE0);
                d dVar = (d) childAt.getLayoutParams();
                int iC = dVar.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int iA = -childAt.getBottom();
                    if (iE0 == 0 && Z.w(t7) && Z.w(childAt)) {
                        topInset2 -= t7.getTopInset();
                    }
                    if (a0(iC, 2)) {
                        iA += Z.A(childAt);
                    } else if (a0(iC, 5)) {
                        int iA2 = Z.A(childAt) + iA;
                        if (iM < iA2) {
                            topInset2 = iA2;
                        } else {
                            iA = iA2;
                        }
                    }
                    if (a0(iC, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) dVar).topMargin;
                        iA -= ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    V(coordinatorLayout, t7, C2870a.c(X(iM, iA, topInset2) + topInset, -t7.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void x0(CoordinatorLayout coordinatorLayout, T t7, int i7, int i8, boolean z7) {
            View viewD0 = d0(t7, i7);
            boolean zU = false;
            if (viewD0 != null) {
                int iC = ((d) viewD0.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int iA = Z.A(viewD0);
                    if (i8 <= 0 || (iC & 12) == 0 ? !((iC & 2) == 0 || (-i7) < (viewD0.getBottom() - iA) - t7.getTopInset()) : (-i7) >= (viewD0.getBottom() - iA) - t7.getTopInset()) {
                        zU = true;
                    }
                }
            }
            if (t7.k()) {
                zU = t7.u(c0(coordinatorLayout));
            }
            boolean zR = t7.r(zU);
            if (z7 || (zR && v0(coordinatorLayout, t7))) {
                if (t7.getBackground() != null) {
                    t7.getBackground().jumpToCurrentState();
                }
                if (t7.getForeground() != null) {
                    t7.getForeground().jumpToCurrentState();
                }
                if (t7.getStateListAnimator() != null) {
                    t7.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override
        int M() {
            return E() + this.f17217k;
        }

        @Override
        public boolean H(T t7) {
            WeakReference<View> weakReference = this.f17221o;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        @Override
        public int K(T t7) {
            return (-t7.getDownNestedScrollRange()) + t7.getTopInset();
        }

        @Override
        public int L(T t7) {
            return t7.getTotalScrollRange();
        }

        @Override
        public void N(CoordinatorLayout coordinatorLayout, T t7) {
            w0(coordinatorLayout, t7);
            if (t7.k()) {
                t7.r(t7.u(c0(coordinatorLayout)));
            }
        }

        @Override
        public boolean l(CoordinatorLayout coordinatorLayout, T t7, int i7) {
            boolean zL = super.l(coordinatorLayout, t7, i7);
            int pendingAction = t7.getPendingAction();
            SavedState savedState = this.f17220n;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z7 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i8 = -t7.getUpNestedPreScrollRange();
                        if (z7) {
                            V(coordinatorLayout, t7, i8, 0.0f);
                        } else {
                            P(coordinatorLayout, t7, i8);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z7) {
                            V(coordinatorLayout, t7, 0, 0.0f);
                        } else {
                            P(coordinatorLayout, t7, 0);
                        }
                    }
                }
            } else if (savedState.f17222d) {
                P(coordinatorLayout, t7, -t7.getTotalScrollRange());
            } else if (savedState.f17223e) {
                P(coordinatorLayout, t7, 0);
            } else {
                View childAt = t7.getChildAt(savedState.f17224i);
                P(coordinatorLayout, t7, (-childAt.getBottom()) + (this.f17220n.f17226w ? Z.A(childAt) + t7.getTopInset() : Math.round(childAt.getHeight() * this.f17220n.f17225v)));
            }
            t7.n();
            this.f17220n = null;
            G(C2870a.c(E(), -t7.getTotalScrollRange(), 0));
            x0(coordinatorLayout, t7, E(), 0, true);
            t7.m(E());
            U(coordinatorLayout, t7);
            return zL;
        }

        @Override
        public boolean m(CoordinatorLayout coordinatorLayout, T t7, int i7, int i8, int i9, int i10) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t7.getLayoutParams())).height != -2) {
                return super.m(coordinatorLayout, t7, i7, i8, i9, i10);
            }
            coordinatorLayout.D(t7, i7, i8, View.MeasureSpec.makeMeasureSpec(0, 0), i10);
            return true;
        }

        @Override
        public void q(CoordinatorLayout coordinatorLayout, T t7, View view, int i7, int i8, int[] iArr, int i9) {
            int i10;
            int downNestedPreScrollRange;
            if (i8 != 0) {
                if (i8 < 0) {
                    i10 = -t7.getTotalScrollRange();
                    downNestedPreScrollRange = t7.getDownNestedPreScrollRange() + i10;
                } else {
                    i10 = -t7.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i11 = i10;
                int i12 = downNestedPreScrollRange;
                if (i11 != i12) {
                    iArr[1] = O(coordinatorLayout, t7, i8, i11, i12);
                }
            }
            if (t7.k()) {
                t7.r(t7.u(view));
            }
        }

        @Override
        public void t(CoordinatorLayout coordinatorLayout, T t7, View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
            if (i10 < 0) {
                iArr[1] = O(coordinatorLayout, t7, i10, -t7.getDownNestedScrollRange(), 0);
            }
            if (i10 == 0) {
                U(coordinatorLayout, t7);
            }
        }

        @Override
        public void x(CoordinatorLayout coordinatorLayout, T t7, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                s0((SavedState) parcelable, true);
                super.x(coordinatorLayout, t7, this.f17220n.getSuperState());
            } else {
                super.x(coordinatorLayout, t7, parcelable);
                this.f17220n = null;
            }
        }

        @Override
        public Parcelable y(CoordinatorLayout coordinatorLayout, T t7) {
            Parcelable parcelableY = super.y(coordinatorLayout, t7);
            SavedState savedStateT0 = t0(parcelableY, t7);
            return savedStateT0 == null ? parcelableY : savedStateT0;
        }

        @Override
        public boolean A(CoordinatorLayout coordinatorLayout, T t7, View view, View view2, int i7, int i8) {
            ValueAnimator valueAnimator;
            boolean z7 = (i7 & 2) != 0 && (t7.k() || Z(coordinatorLayout, t7, view));
            if (z7 && (valueAnimator = this.f17219m) != null) {
                valueAnimator.cancel();
            }
            this.f17221o = null;
            this.f17218l = i8;
            return z7;
        }

        @Override
        public void C(CoordinatorLayout coordinatorLayout, T t7, View view, int i7) {
            if (this.f17218l == 0 || i7 == 1) {
                w0(coordinatorLayout, t7);
                if (t7.k()) {
                    t7.r(t7.u(view));
                }
            }
            this.f17221o = new WeakReference<>(view);
        }

        void s0(SavedState savedState, boolean z7) {
            if (this.f17220n == null || z7) {
                this.f17220n = savedState;
            }
        }

        SavedState t0(Parcelable parcelable, T t7) {
            int iE = E();
            int childCount = t7.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = t7.getChildAt(i7);
                int bottom = childAt.getBottom() + iE;
                if (childAt.getTop() + iE <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.EMPTY_STATE;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z7 = iE == 0;
                    savedState.f17223e = z7;
                    savedState.f17222d = !z7 && (-iE) >= t7.getTotalScrollRange();
                    savedState.f17224i = i7;
                    savedState.f17226w = bottom == Z.A(childAt) + t7.getTopInset();
                    savedState.f17225v = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        @Override
        public int Q(CoordinatorLayout coordinatorLayout, T t7, int i7, int i8, int i9) {
            int iM = M();
            int i10 = 0;
            if (i8 == 0 || iM < i8 || iM > i9) {
                this.f17217k = 0;
            } else {
                int iC = C2870a.c(i7, i8, i9);
                if (iM != iC) {
                    int iI0 = t7.g() ? i0(t7, iC) : iC;
                    boolean zG = G(iI0);
                    int i11 = iM - iC;
                    this.f17217k = iC - iI0;
                    if (zG) {
                        while (i10 < t7.getChildCount()) {
                            d dVar = (d) t7.getChildAt(i10).getLayoutParams();
                            b bVarB = dVar.b();
                            if (bVarB != null && (dVar.c() & 1) != 0) {
                                bVarB.a(t7, t7.getChildAt(i10), E());
                            }
                            i10++;
                        }
                    }
                    if (!zG && t7.g()) {
                        coordinatorLayout.f(t7);
                    }
                    t7.m(E());
                    x0(coordinatorLayout, t7, iC, iC < iM ? -1 : 1, false);
                    i10 = i11;
                }
            }
            U(coordinatorLayout, t7);
            return i10;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            boolean f17222d;

            boolean f17223e;

            int f17224i;

            float f17225v;

            boolean f17226w;

            class a implements Parcelable.ClassLoaderCreator<SavedState> {
                a() {
                }

                @Override
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
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
                this.f17222d = parcel.readByte() != 0;
                this.f17223e = parcel.readByte() != 0;
                this.f17224i = parcel.readInt();
                this.f17225v = parcel.readFloat();
                this.f17226w = parcel.readByte() != 0;
            }

            @Override
            public void writeToParcel(Parcel parcel, int i7) {
                super.writeToParcel(parcel, i7);
                parcel.writeByte(this.f17222d ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f17223e ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f17224i);
                parcel.writeFloat(this.f17225v);
                parcel.writeByte(this.f17226w ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override
        public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        @Override
        public int E() {
            return super.E();
        }

        @Override
        public boolean G(int i7) {
            return super.G(i7);
        }

        @Override
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }

        @Override
        public boolean l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i7) {
            return super.l(coordinatorLayout, appBarLayout, i7);
        }

        @Override
        public boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i7, int i8, int i9, int i10) {
            return super.m(coordinatorLayout, appBarLayout, i7, i8, i9, i10);
        }

        @Override
        public void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i7, int i8, int[] iArr, int i9) {
            super.q(coordinatorLayout, appBarLayout, view, i7, i8, iArr, i9);
        }

        @Override
        public void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
            super.t(coordinatorLayout, appBarLayout, view, i7, i8, i9, i10, i11, iArr);
        }

        @Override
        public void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override
        public Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.y(coordinatorLayout, appBarLayout);
        }

        @Override
        public boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i7, int i8) {
            return super.A(coordinatorLayout, appBarLayout, view, view2, i7, i8);
        }

        @Override
        public void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i7) {
            super.C(coordinatorLayout, appBarLayout, view, i7);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.b {
        public ScrollingViewBehavior() {
        }

        private static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                return ((BaseBehavior) cVarF).M();
            }
            return 0;
        }

        private void S(View view, View view2) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                Z.Y(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarF).f17217k) + M()) - I(view2));
            }
        }

        private void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.k()) {
                    appBarLayout.r(appBarLayout.u(view));
                }
            }
        }

        @Override
        float J(View view) {
            int i7;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iR = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iR > downNestedPreScrollRange) && (i7 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iR / i7) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override
        int L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.L(view);
        }

        @Override
        public AppBarLayout H(List<View> list) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = list.get(i7);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                Z.n0(coordinatorLayout, null);
            }
        }

        @Override
        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i7) {
            return super.l(coordinatorLayout, view, i7);
        }

        @Override
        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9, int i10) {
            return super.m(coordinatorLayout, view, i7, i8, i9, i10);
        }

        @Override
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z7) {
            AppBarLayout appBarLayoutH = H(coordinatorLayout.l(view));
            if (appBarLayoutH != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f17255d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutH.o(false, !z7);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1755k.f13159e5);
            O(typedArrayObtainStyledAttributes.getDimensionPixelSize(C1755k.f13167f5, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public interface a<T extends AppBarLayout> {
        void a(T t7, int i7);
    }

    public static abstract class b {
        public abstract void a(AppBarLayout appBarLayout, View view, float f7);
    }

    public static class c extends b {

        private final Rect f17233a = new Rect();

        private final Rect f17234b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override
        public void a(AppBarLayout appBarLayout, View view, float f7) {
            b(this.f17233a, appBarLayout, view);
            float fAbs = this.f17233a.top - Math.abs(f7);
            if (fAbs > 0.0f) {
                Z.u0(view, null);
                view.setTranslationY(0.0f);
                view.setVisibility(0);
                return;
            }
            float fB = 1.0f - C2870a.b(Math.abs(fAbs / this.f17233a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f17233a.height() * 0.3f) * (1.0f - (fB * fB)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f17234b);
            this.f17234b.offset(0, (int) (-fHeight));
            if (fHeight >= this.f17234b.height()) {
                view.setVisibility(4);
            } else {
                view.setVisibility(0);
            }
            Z.u0(view, this.f17234b);
        }
    }

    private void a() {
        WeakReference<View> weakReference = this.f17199G;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f17199G = null;
    }

    private Integer b() {
        Drawable drawable = this.f17206N;
        if (drawable instanceof C2937g) {
            return Integer.valueOf(((C2937g) drawable).A());
        }
        ColorStateList colorStateListG = com.google.android.material.drawable.d.g(drawable);
        if (colorStateListG != null) {
            return Integer.valueOf(colorStateListG.getDefaultColor());
        }
        return null;
    }

    private View c(View view) {
        int i7;
        if (this.f17199G == null && (i7 = this.f17198F) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i7) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f17198F);
            }
            if (viewFindViewById != null) {
                this.f17199G = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f17199G;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean h() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            if (((d) getChildAt(i7).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void j() {
        Behavior behavior = this.f17209Q;
        BaseBehavior.SavedState savedStateT0 = (behavior == null || this.f17211e == -1 || this.f17215y != 0) ? null : behavior.t0(AbsSavedState.EMPTY_STATE, this);
        this.f17211e = -1;
        this.f17212i = -1;
        this.f17213v = -1;
        if (savedStateT0 != null) {
            this.f17209Q.s0(savedStateT0, false);
        }
    }

    private boolean l() {
        return getBackground() instanceof C2937g;
    }

    private void p(boolean z7, boolean z8, boolean z9) {
        this.f17215y = (z7 ? 1 : 2) | (z8 ? 4 : 0) | (z9 ? 8 : 0);
        requestLayout();
    }

    private boolean q(boolean z7) {
        if (this.f17195C == z7) {
            return false;
        }
        this.f17195C = z7;
        refreshDrawableState();
        return true;
    }

    private boolean t() {
        return this.f17206N != null && getTopInset() > 0;
    }

    private boolean v() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || Z.w(childAt)) ? false : true;
    }

    private void w(float f7, float f8) {
        ValueAnimator valueAnimator = this.f17201I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f7, f8);
        this.f17201I = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f17203K);
        this.f17201I.setInterpolator(this.f17204L);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f17202J;
        if (animatorUpdateListener != null) {
            this.f17201I.addUpdateListener(animatorUpdateListener);
        }
        this.f17201I.start();
    }

    private void x() {
        setWillNotDraw(!t());
    }

    @Override
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override
    public d generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (t()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f17210d);
            this.f17206N.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f17206N;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new d((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    boolean g() {
        return this.f17214w;
    }

    @Override
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f17209Q = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int iA;
        int i7 = this.f17212i;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = dVar.f17235a;
                if ((i9 & 5) != 5) {
                    if (i8 > 0) {
                        break;
                    }
                } else {
                    int i10 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    if ((i9 & 8) != 0) {
                        iA = Z.A(childAt);
                    } else if ((i9 & 2) != 0) {
                        iA = measuredHeight - Z.A(childAt);
                    } else {
                        iMin = i10 + measuredHeight;
                        if (childCount == 0 && Z.w(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i8 += iMin;
                    }
                    iMin = i10 + iA;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i8 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i8);
        this.f17212i = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i7 = this.f17213v;
        if (i7 != -1) {
            return i7;
        }
        int childCount = getChildCount();
        int i8 = 0;
        int iA = 0;
        while (true) {
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                int i9 = dVar.f17235a;
                if ((i9 & 1) == 0) {
                    break;
                }
                iA += measuredHeight;
                if ((i9 & 2) != 0) {
                    iA -= Z.A(childAt);
                    break;
                }
            }
            i8++;
        }
        int iMax = Math.max(0, iA);
        this.f17213v = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f17198F;
    }

    public C2937g getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof C2937g) {
            return (C2937g) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iA = Z.A(this);
        if (iA == 0) {
            int childCount = getChildCount();
            iA = childCount >= 1 ? Z.A(getChildAt(childCount - 1)) : 0;
            if (iA == 0) {
                return getHeight() / 3;
            }
        }
        return (iA * 2) + topInset;
    }

    int getPendingAction() {
        return this.f17215y;
    }

    public Drawable getStatusBarForeground() {
        return this.f17206N;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f17216z;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i7 = this.f17211e;
        if (i7 != -1) {
            return i7;
        }
        int childCount = getChildCount();
        int i8 = 0;
        int iA = 0;
        while (true) {
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = dVar.f17235a;
                if ((i9 & 1) == 0) {
                    break;
                }
                iA += measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                if (i8 == 0 && Z.w(childAt)) {
                    iA -= getTopInset();
                }
                if ((i9 & 2) != 0) {
                    iA -= Z.A(childAt);
                    break;
                }
            }
            i8++;
        }
        int iMax = Math.max(0, iA);
        this.f17211e = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    boolean i() {
        return getTotalScrollRange() != 0;
    }

    public boolean k() {
        return this.f17197E;
    }

    void m(int i7) {
        this.f17210d = i7;
        if (!willNotDraw()) {
            Z.e0(this);
        }
        List<a> list = this.f17193A;
        if (list != null) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                a aVar = this.f17193A.get(i8);
                if (aVar != null) {
                    aVar.a(this, i7);
                }
            }
        }
    }

    void n() {
        this.f17215y = 0;
    }

    public void o(boolean z7, boolean z8) {
        p(z7, z8, true);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override
    protected int[] onCreateDrawableState(int i7) {
        if (this.f17205M == null) {
            this.f17205M = new int[4];
        }
        int[] iArr = this.f17205M;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + iArr.length);
        boolean z7 = this.f17195C;
        int i8 = C1746b.f12732a0;
        if (!z7) {
            i8 = -i8;
        }
        iArr[0] = i8;
        iArr[1] = (z7 && this.f17196D) ? C1746b.f12734b0 : -C1746b.f12734b0;
        int i9 = C1746b.f12727W;
        if (!z7) {
            i9 = -i9;
        }
        iArr[2] = i9;
        iArr[3] = (z7 && this.f17196D) ? C1746b.f12726V : -C1746b.f12726V;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        boolean z8 = true;
        if (Z.w(this) && v()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                Z.Y(getChildAt(childCount), topInset);
            }
        }
        j();
        this.f17214w = false;
        int childCount2 = getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount2) {
                break;
            }
            if (((d) getChildAt(i11).getLayoutParams()).d() != null) {
                this.f17214w = true;
                break;
            }
            i11++;
        }
        Drawable drawable = this.f17206N;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f17194B) {
            return;
        }
        if (!this.f17197E && !h()) {
            z8 = false;
        }
        q(z8);
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i8);
        if (mode != 1073741824 && Z.w(this) && v()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C2870a.c(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i8));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        j();
    }

    boolean r(boolean z7) {
        return s(z7, !this.f17194B);
    }

    boolean s(boolean z7, boolean z8) {
        if (!z8 || this.f17196D == z7) {
            return false;
        }
        this.f17196D = z7;
        refreshDrawableState();
        if (!l()) {
            return true;
        }
        if (this.f17200H) {
            w(z7 ? 0.0f : 1.0f, z7 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f17197E) {
            return true;
        }
        w(z7 ? 0.0f : this.f17208P, z7 ? this.f17208P : 0.0f);
        return true;
    }

    @Override
    public void setElevation(float f7) {
        super.setElevation(f7);
        h.d(this, f7);
    }

    public void setExpanded(boolean z7) {
        o(z7, Z.R(this));
    }

    public void setLiftOnScroll(boolean z7) {
        this.f17197E = z7;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f17198F = -1;
        if (view == null) {
            a();
        } else {
            this.f17199G = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i7) {
        this.f17198F = i7;
        a();
    }

    public void setLiftableOverrideEnabled(boolean z7) {
        this.f17194B = z7;
    }

    @Override
    public void setOrientation(int i7) {
        if (i7 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i7);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f17206N;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f17206N = drawable != null ? drawable.mutate() : null;
            this.f17207O = b();
            Drawable drawable3 = this.f17206N;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f17206N.setState(getDrawableState());
                }
                C2731a.m(this.f17206N, Z.z(this));
                this.f17206N.setVisible(getVisibility() == 0, false);
                this.f17206N.setCallback(this);
            }
            x();
            Z.e0(this);
        }
    }

    public void setStatusBarForegroundColor(int i7) {
        setStatusBarForeground(new ColorDrawable(i7));
    }

    public void setStatusBarForegroundResource(int i7) {
        setStatusBarForeground(C2473a.b(getContext(), i7));
    }

    @Deprecated
    public void setTargetElevation(float f7) throws Resources.NotFoundException {
        e.a(this, f7);
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z7 = i7 == 0;
        Drawable drawable = this.f17206N;
        if (drawable != null) {
            drawable.setVisible(z7, false);
        }
    }

    boolean u(View view) {
        View viewC = c(view);
        if (viewC != null) {
            view = viewC;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f17206N;
    }

    public static class d extends LinearLayout.LayoutParams {

        int f17235a;

        private b f17236b;

        Interpolator f17237c;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17235a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1755k.f13215m);
            this.f17235a = typedArrayObtainStyledAttributes.getInt(C1755k.f13229o, 0);
            f(typedArrayObtainStyledAttributes.getInt(C1755k.f13222n, 0));
            int i7 = C1755k.f13235p;
            if (typedArrayObtainStyledAttributes.hasValue(i7)) {
                this.f17237c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i7, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        private b a(int i7) {
            if (i7 != 1) {
                return null;
            }
            return new c();
        }

        public b b() {
            return this.f17236b;
        }

        public int c() {
            return this.f17235a;
        }

        public Interpolator d() {
            return this.f17237c;
        }

        boolean e() {
            int i7 = this.f17235a;
            return (i7 & 1) == 1 && (i7 & 10) != 0;
        }

        public void f(int i7) {
            this.f17236b = a(i7);
        }

        public void g(int i7) {
            this.f17235a = i7;
        }

        public d(int i7, int i8) {
            super(i7, i8);
            this.f17235a = 1;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f17235a = 1;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f17235a = 1;
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f17235a = 1;
        }
    }
}
