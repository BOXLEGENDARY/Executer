package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1620h0;
import androidx.core.view.InterfaceC1622i0;
import androidx.core.view.Z;
import g.C2447a;
import g.C2456j;

abstract class AbsActionBarView extends ViewGroup {
    private static final int FADE_DURATION = 200;
    protected C1597b mActionMenuPresenter;
    protected int mContentHeight;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    protected ActionMenuView mMenuView;
    protected final Context mPopupContext;
    protected final VisibilityAnimListener mVisAnimListener;
    protected C1620h0 mVisibilityAnim;

    protected class VisibilityAnimListener implements InterfaceC1622i0 {
        private boolean mCanceled = false;
        int mFinalVisibility;

        protected VisibilityAnimListener() {
        }

        @Override
        public void onAnimationCancel(View view) {
            this.mCanceled = true;
        }

        @Override
        public void onAnimationEnd(View view) {
            if (this.mCanceled) {
                return;
            }
            AbsActionBarView absActionBarView = AbsActionBarView.this;
            absActionBarView.mVisibilityAnim = null;
            AbsActionBarView.super.setVisibility(this.mFinalVisibility);
        }

        @Override
        public void onAnimationStart(View view) {
            AbsActionBarView.super.setVisibility(0);
            this.mCanceled = false;
        }

        public VisibilityAnimListener withFinalVisibility(C1620h0 c1620h0, int i7) {
            AbsActionBarView.this.mVisibilityAnim = c1620h0;
            this.mFinalVisibility = i7;
            return this;
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override
        public void run() {
            AbsActionBarView.this.showOverflowMenu();
        }
    }

    AbsActionBarView(Context context) {
        this(context, null);
    }

    protected static int next(int i7, int i8, boolean z7) {
        return z7 ? i7 - i8 : i7 + i8;
    }

    public void animateToVisibility(int i7) {
        setupAnimatorToVisibility(i7, 200L).l();
    }

    public boolean canShowOverflowMenu() {
        return isOverflowReserved() && getVisibility() == 0;
    }

    public void dismissPopupMenus() {
        C1597b c1597b = this.mActionMenuPresenter;
        if (c1597b != null) {
            c1597b.z();
        }
    }

    public int getAnimatedVisibility() {
        return this.mVisibilityAnim != null ? this.mVisAnimListener.mFinalVisibility : getVisibility();
    }

    public int getContentHeight() {
        return this.mContentHeight;
    }

    public boolean hideOverflowMenu() {
        C1597b c1597b = this.mActionMenuPresenter;
        if (c1597b != null) {
            return c1597b.C();
        }
        return false;
    }

    public boolean isOverflowMenuShowPending() {
        C1597b c1597b = this.mActionMenuPresenter;
        if (c1597b != null) {
            return c1597b.E();
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        C1597b c1597b = this.mActionMenuPresenter;
        if (c1597b != null) {
            return c1597b.F();
        }
        return false;
    }

    public boolean isOverflowReserved() {
        C1597b c1597b = this.mActionMenuPresenter;
        return c1597b != null && c1597b.G();
    }

    protected int measureChildView(View view, int i7, int i8, int i9) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), i8);
        return Math.max(0, (i7 - view.getMeasuredWidth()) - i9);
    }

    @Override
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C2456j.f20794a, C2447a.f20541c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(C2456j.f20833j, 0));
        typedArrayObtainStyledAttributes.recycle();
        C1597b c1597b = this.mActionMenuPresenter;
        if (c1597b != null) {
            c1597b.H(configuration);
        }
    }

    @Override
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    protected int positionChild(View view, int i7, int i8, int i9, boolean z7) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i8 + ((i9 - measuredHeight) / 2);
        if (z7) {
            view.layout(i7 - measuredWidth, i10, i7, measuredHeight + i10);
        } else {
            view.layout(i7, i10, i7 + measuredWidth, measuredHeight + i10);
        }
        return z7 ? -measuredWidth : measuredWidth;
    }

    public void postShowOverflowMenu() {
        post(new a());
    }

    public void setContentHeight(int i7) {
        this.mContentHeight = i7;
        requestLayout();
    }

    @Override
    public void setVisibility(int i7) {
        if (i7 != getVisibility()) {
            C1620h0 c1620h0 = this.mVisibilityAnim;
            if (c1620h0 != null) {
                c1620h0.c();
            }
            super.setVisibility(i7);
        }
    }

    public C1620h0 setupAnimatorToVisibility(int i7, long j7) {
        C1620h0 c1620h0 = this.mVisibilityAnim;
        if (c1620h0 != null) {
            c1620h0.c();
        }
        if (i7 != 0) {
            C1620h0 c1620h0B = Z.e(this).b(0.0f);
            c1620h0B.f(j7);
            c1620h0B.h(this.mVisAnimListener.withFinalVisibility(c1620h0B, i7));
            return c1620h0B;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C1620h0 c1620h0B2 = Z.e(this).b(1.0f);
        c1620h0B2.f(j7);
        c1620h0B2.h(this.mVisAnimListener.withFinalVisibility(c1620h0B2, i7));
        return c1620h0B2;
    }

    public boolean showOverflowMenu() {
        C1597b c1597b = this.mActionMenuPresenter;
        if (c1597b != null) {
            return c1597b.M();
        }
        return false;
    }

    AbsActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    AbsActionBarView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mVisAnimListener = new VisibilityAnimListener();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C2447a.f20539a, typedValue, true) && typedValue.resourceId != 0) {
            this.mPopupContext = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.mPopupContext = context;
        }
    }
}
