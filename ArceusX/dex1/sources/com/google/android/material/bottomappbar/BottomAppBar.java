package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Z;
import androidx.customview.view.AbsSavedState;
import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import c4.C1745a;
import c4.C1746b;
import c4.C1748d;
import c4.C1754j;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.s;
import d4.C2388a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q0.C2731a;
import u4.C2937g;
import u4.h;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    private static final int f17301P = C1754j.f12961n;

    private static final int f17302Q = C1746b.f12708D;

    private static final int f17303R = C1746b.f12718N;

    private final int f17304A;

    private int f17305B;

    private int f17306C;

    private final boolean f17307D;

    private boolean f17308E;

    private int f17309F;

    private ArrayList<g> f17310G;

    private int f17311H;

    private boolean f17312I;

    private boolean f17313J;

    private Behavior f17314K;

    private int f17315L;

    private int f17316M;

    private int f17317N;

    AnimatorListenerAdapter f17318O;

    private Integer f17319d;

    private final C2937g f17320e;

    private Animator f17321i;

    private Animator f17322v;

    private int f17323w;

    private int f17324y;

    private int f17325z;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        int f17331d;

        boolean f17332e;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f17331d);
            parcel.writeInt(this.f17332e ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17331d = parcel.readInt();
            this.f17332e = parcel.readInt() != 0;
        }
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.A();
            BottomAppBar.this.f17321i = null;
        }

        @Override
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.B();
        }
    }

    class b extends FloatingActionButton.b {

        final int f17334a;

        class a extends FloatingActionButton.b {
            a() {
            }

            @Override
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.A();
            }
        }

        b(int i7) {
            this.f17334a = i7;
        }

        @Override
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.F(this.f17334a));
            floatingActionButton.s(new a());
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.A();
            BottomAppBar.this.f17312I = false;
            BottomAppBar.this.f17322v = null;
        }

        @Override
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.B();
        }
    }

    class d extends AnimatorListenerAdapter {

        public boolean f17338a;

        final ActionMenuView f17339b;

        final int f17340c;

        final boolean f17341d;

        d(ActionMenuView actionMenuView, int i7, boolean z7) {
            this.f17339b = actionMenuView;
            this.f17340c = i7;
            this.f17341d = z7;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            this.f17338a = true;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (this.f17338a) {
                return;
            }
            boolean z7 = BottomAppBar.this.f17311H != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.L(bottomAppBar.f17311H);
            BottomAppBar.this.S(this.f17339b, this.f17340c, this.f17341d, z7);
        }
    }

    class e implements Runnable {

        final ActionMenuView f17343d;

        final int f17344e;

        final boolean f17345i;

        e(ActionMenuView actionMenuView, int i7, boolean z7) {
            this.f17343d = actionMenuView;
            this.f17344e = i7;
            this.f17345i = z7;
        }

        @Override
        public void run() {
            this.f17343d.setTranslationX(BottomAppBar.this.E(r0, this.f17344e, this.f17345i));
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f17318O.onAnimationStart(animator);
            FloatingActionButton floatingActionButtonC = BottomAppBar.this.C();
            if (floatingActionButtonC != null) {
                floatingActionButtonC.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    interface g {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    public void A() {
        ArrayList<g> arrayList;
        int i7 = this.f17309F - 1;
        this.f17309F = i7;
        if (i7 != 0 || (arrayList = this.f17310G) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    public void B() {
        ArrayList<g> arrayList;
        int i7 = this.f17309F;
        this.f17309F = i7 + 1;
        if (i7 != 0 || (arrayList = this.f17310G) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public FloatingActionButton C() {
        View viewD = D();
        if (viewD instanceof FloatingActionButton) {
            return (FloatingActionButton) viewD;
        }
        return null;
    }

    public View D() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).m(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public float F(int i7) {
        boolean zH = s.h(this);
        if (i7 != 1) {
            return 0.0f;
        }
        return ((getMeasuredWidth() / 2) - ((zH ? this.f17317N : this.f17316M) + ((this.f17305B == -1 || D() == null) ? this.f17304A : (r6.getMeasuredWidth() / 2) + this.f17305B))) * (zH ? -1 : 1);
    }

    private boolean G() {
        FloatingActionButton floatingActionButtonC = C();
        return floatingActionButtonC != null && floatingActionButtonC.p();
    }

    private void I(int i7, boolean z7) {
        if (!Z.R(this)) {
            this.f17312I = false;
            L(this.f17311H);
            return;
        }
        Animator animator = this.f17322v;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!G()) {
            i7 = 0;
            z7 = false;
        }
        z(i7, z7, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f17322v = animatorSet;
        animatorSet.addListener(new c());
        this.f17322v.start();
    }

    private void J(int i7) {
        if (this.f17323w == i7 || !Z.R(this)) {
            return;
        }
        Animator animator = this.f17321i;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f17324y == 1) {
            y(i7, arrayList);
        } else {
            x(i7, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(p4.e.g(getContext(), f17303R, C2388a.f20312a));
        this.f17321i = animatorSet;
        animatorSet.addListener(new a());
        this.f17321i.start();
    }

    private Drawable K(Drawable drawable) {
        if (drawable == null || this.f17319d == null) {
            return drawable;
        }
        Drawable drawableR = C2731a.r(drawable.mutate());
        C2731a.n(drawableR, this.f17319d.intValue());
        return drawableR;
    }

    private void M() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f17322v != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (G()) {
            Q(actionMenuView, this.f17323w, this.f17313J);
        } else {
            Q(actionMenuView, 0, false);
        }
    }

    public void N() {
        getTopEdgeTreatment().o(getFabTranslationX());
        this.f17320e.b0((this.f17313J && G() && this.f17325z == 1) ? 1.0f : 0.0f);
        View viewD = D();
        if (viewD != null) {
            viewD.setTranslationY(getFabTranslationY());
            viewD.setTranslationX(getFabTranslationX());
        }
    }

    private void Q(ActionMenuView actionMenuView, int i7, boolean z7) {
        S(actionMenuView, i7, z7, false);
    }

    public void S(ActionMenuView actionMenuView, int i7, boolean z7, boolean z8) {
        e eVar = new e(actionMenuView, i7, z7);
        if (z8) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    public static void T(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        fVar.f10333d = 17;
        int i7 = bottomAppBar.f17325z;
        if (i7 == 1) {
            fVar.f10333d = 17 | 48;
        }
        if (i7 == 0) {
            fVar.f10333d |= 80;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public int getBottomInset() {
        return this.f17315L;
    }

    private int getFabAlignmentAnimationDuration() {
        return p4.e.f(getContext(), f17302Q, 300);
    }

    public float getFabTranslationX() {
        return F(this.f17323w);
    }

    private float getFabTranslationY() {
        if (this.f17325z == 1) {
            return -getTopEdgeTreatment().c();
        }
        return D() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    public int getLeftInset() {
        return this.f17317N;
    }

    public int getRightInset() {
        return this.f17316M;
    }

    private com.google.android.material.bottomappbar.b getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.b) this.f17320e.E().p();
    }

    public void v(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.f17318O);
        floatingActionButton.f(new f());
        floatingActionButton.g(null);
    }

    private void w() {
        Animator animator = this.f17322v;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f17321i;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void y(int i7, List<Animator> list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(C(), vxbbqXNtzfMxs.MDRwgwDvgyq, F(i7));
        objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(objectAnimatorOfFloat);
    }

    private void z(int i7, boolean z7, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
        Animator animatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        animatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
        if (Math.abs(actionMenuView.getTranslationX() - E(actionMenuView, i7, z7)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(animatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            objectAnimatorOfFloat.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
            objectAnimatorOfFloat.addListener(new d(actionMenuView, i7, z7));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(objectAnimatorOfFloat, animatorOfFloat);
            list.add(animatorSet);
        }
    }

    protected int E(ActionMenuView actionMenuView, int i7, boolean z7) throws Resources.NotFoundException {
        int dimensionPixelOffset = 0;
        if (this.f17306C != 1 && (i7 != 1 || !z7)) {
            return 0;
        }
        boolean zH = s.h(this);
        int measuredWidth = zH ? getMeasuredWidth() : 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & 8388615) == 8388611) {
                measuredWidth = zH ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zH ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i9 = zH ? this.f17316M : -this.f17317N;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(C1748d.f12824m);
            if (!zH) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i9) + dimensionPixelOffset);
    }

    public void L(int i7) {
        if (i7 != 0) {
            this.f17311H = 0;
            getMenu().clear();
            inflateMenu(i7);
        }
    }

    public void O(int i7, int i8) {
        this.f17311H = i8;
        this.f17312I = true;
        I(i7, this.f17313J);
        J(i7);
        this.f17323w = i7;
    }

    boolean P(int i7) {
        float f7 = i7;
        if (f7 == getTopEdgeTreatment().h()) {
            return false;
        }
        getTopEdgeTreatment().n(f7);
        this.f17320e.invalidateSelf();
        return true;
    }

    public ColorStateList getBackgroundTint() {
        return this.f17320e.I();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().c();
    }

    public int getFabAlignmentMode() {
        return this.f17323w;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f17305B;
    }

    public int getFabAnchorMode() {
        return this.f17325z;
    }

    public int getFabAnimationMode() {
        return this.f17324y;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().e();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().g();
    }

    public boolean getHideOnScroll() {
        return this.f17308E;
    }

    public int getMenuAlignmentMode() {
        return this.f17306C;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.f17320e);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        if (z7) {
            w();
            N();
            final View viewD = D();
            if (viewD != null && Z.R(viewD)) {
                viewD.post(new Runnable() {
                    @Override
                    public final void run() {
                        viewD.requestLayout();
                    }
                });
            }
        }
        M();
    }

    @Override
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f17323w = savedState.f17331d;
        this.f17313J = savedState.f17332e;
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f17331d = this.f17323w;
        savedState.f17332e = this.f17313J;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C2731a.o(this.f17320e, colorStateList);
    }

    public void setCradleVerticalOffset(float f7) {
        if (f7 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().i(f7);
            this.f17320e.invalidateSelf();
            N();
        }
    }

    @Override
    public void setElevation(float f7) {
        this.f17320e.Z(f7);
        getBehavior().I(this, this.f17320e.D() - this.f17320e.C());
    }

    public void setFabAlignmentMode(int i7) {
        O(i7, 0);
    }

    public void setFabAlignmentModeEndMargin(int i7) {
        if (this.f17305B != i7) {
            this.f17305B = i7;
            N();
        }
    }

    public void setFabAnchorMode(int i7) {
        this.f17325z = i7;
        N();
        View viewD = D();
        if (viewD != null) {
            T(this, viewD);
            viewD.requestLayout();
            this.f17320e.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i7) {
        this.f17324y = i7;
    }

    void setFabCornerSize(float f7) {
        if (f7 != getTopEdgeTreatment().d()) {
            getTopEdgeTreatment().j(f7);
            this.f17320e.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f7) {
        if (f7 != getFabCradleMargin()) {
            getTopEdgeTreatment().k(f7);
            this.f17320e.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f7) {
        if (f7 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().l(f7);
            this.f17320e.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z7) {
        this.f17308E = z7;
    }

    public void setMenuAlignmentMode(int i7) {
        if (this.f17306C != i7) {
            this.f17306C = i7;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                Q(actionMenuView, this.f17323w, G());
            }
        }
    }

    @Override
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(K(drawable));
    }

    public void setNavigationIconTint(int i7) {
        this.f17319d = Integer.valueOf(i7);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override
    public void setTitle(CharSequence charSequence) {
    }

    protected void x(int i7, List<Animator> list) {
        FloatingActionButton floatingActionButtonC = C();
        if (floatingActionButtonC == null || floatingActionButtonC.o()) {
            return;
        }
        B();
        floatingActionButtonC.m(new b(i7));
    }

    @Override
    public Behavior getBehavior() {
        if (this.f17314K == null) {
            this.f17314K = new Behavior();
        }
        return this.f17314K;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        private final Rect f17326m;

        private WeakReference<BottomAppBar> f17327n;

        private int f17328o;

        private final View.OnLayoutChangeListener f17329p;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override
            public void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f17327n.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.j(Behavior.this.f17326m);
                    int iHeight = Behavior.this.f17326m.height();
                    bottomAppBar.P(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.f17326m)));
                    height = iHeight;
                }
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.f17328o == 0) {
                    if (bottomAppBar.f17325z == 1) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C1748d.f12787N) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (s.h(view)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.f17304A;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.f17304A;
                    }
                }
                bottomAppBar.N();
            }
        }

        public Behavior() {
            this.f17329p = new a();
            this.f17326m = new Rect();
        }

        @Override
        public boolean l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i7) {
            this.f17327n = new WeakReference<>(bottomAppBar);
            View viewD = bottomAppBar.D();
            if (viewD != null && !Z.R(viewD)) {
                BottomAppBar.T(bottomAppBar, viewD);
                this.f17328o = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) viewD.getLayoutParams())).bottomMargin;
                if (viewD instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewD;
                    if (bottomAppBar.f17325z == 0 && bottomAppBar.f17307D) {
                        Z.v0(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(C1745a.f12702b);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(C1745a.f12701a);
                    }
                    bottomAppBar.v(floatingActionButton);
                }
                viewD.addOnLayoutChangeListener(this.f17329p);
                bottomAppBar.N();
            }
            coordinatorLayout.C(bottomAppBar, i7);
            return super.l(coordinatorLayout, bottomAppBar, i7);
        }

        @Override
        public boolean A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i7, int i8) {
            return bottomAppBar.getHideOnScroll() && super.A(coordinatorLayout, bottomAppBar, view, view2, i7, i8);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17329p = new a();
            this.f17326m = new Rect();
        }
    }
}
