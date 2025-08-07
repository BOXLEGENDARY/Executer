package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.m;
import androidx.core.graphics.Insets;
import androidx.core.view.F;
import androidx.core.view.G;
import androidx.core.view.H;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.Z;
import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;
import g.C2447a;
import g.C2452f;

public class ActionBarOverlayLayout extends ViewGroup implements DecorContentParent, F, G {
    private static final int ACTION_BAR_ANIMATE_DELAY = 600;
    static final int[] ATTRS = {C2447a.f20540b, R.attr.windowContentOverlay};
    private static final String TAG = "ActionBarOverlayLayout";
    private int mActionBarHeight;
    ActionBarContainer mActionBarTop;
    private ActionBarVisibilityCallback mActionBarVisibilityCallback;
    private final Runnable mAddActionBarHideOffset;
    boolean mAnimatingForFling;
    private final Rect mBaseContentInsets;
    private WindowInsetsCompat mBaseInnerInsets;
    private final Rect mBaseInnerInsetsRect;
    private ContentFrameLayout mContent;
    private final Rect mContentInsets;
    ViewPropertyAnimator mCurrentActionBarTopAnimator;
    private DecorToolbar mDecorToolbar;
    private OverScroller mFlingEstimator;
    private boolean mHasNonEmbeddedTabs;
    private boolean mHideOnContentScroll;
    private int mHideOnContentScrollReference;
    private boolean mIgnoreWindowContentOverlay;
    private WindowInsetsCompat mInnerInsets;
    private final Rect mInnerInsetsRect;
    private final Rect mLastBaseContentInsets;
    private WindowInsetsCompat mLastBaseInnerInsets;
    private final Rect mLastBaseInnerInsetsRect;
    private WindowInsetsCompat mLastInnerInsets;
    private final Rect mLastInnerInsetsRect;
    private int mLastSystemUiVisibility;
    private boolean mOverlayMode;
    private final H mParentHelper;
    private final Runnable mRemoveActionBarHideOffset;
    final AnimatorListenerAdapter mTopAnimatorListener;
    private Drawable mWindowContentOverlay;
    private int mWindowVisibility;

    public interface ActionBarVisibilityCallback {
        void enableContentAnimations(boolean z7);

        void hideForSystem();

        void onContentScrollStarted();

        void onContentScrollStopped();

        void onWindowVisibilityChanged(int i7);

        void showForSystem();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i7, int i8) {
            super(i7, i8);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.mCurrentActionBarTopAnimator = null;
            actionBarOverlayLayout.mAnimatingForFling = false;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.mCurrentActionBarTopAnimator = null;
            actionBarOverlayLayout.mAnimatingForFling = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override
        public void run() {
            ActionBarOverlayLayout.this.haltActionBarHideOffsetAnimations();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.mCurrentActionBarTopAnimator = actionBarOverlayLayout.mActionBarTop.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.mTopAnimatorListener);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override
        public void run() {
            ActionBarOverlayLayout.this.haltActionBarHideOffsetAnimations();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.mCurrentActionBarTopAnimator = actionBarOverlayLayout.mActionBarTop.animate().translationY(-ActionBarOverlayLayout.this.mActionBarTop.getHeight()).setListener(ActionBarOverlayLayout.this.mTopAnimatorListener);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    private void addActionBarHideOffset() {
        haltActionBarHideOffsetAnimations();
        this.mAddActionBarHideOffset.run();
    }

    private boolean applyInsets(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.applyInsets(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    private DecorToolbar getDecorToolbar(View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException(jUbDmI.xhXLpM + view.getClass().getSimpleName());
    }

    private void init(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(ATTRS);
        this.mActionBarHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.mWindowContentOverlay = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.mIgnoreWindowContentOverlay = context.getApplicationInfo().targetSdkVersion < 19;
        this.mFlingEstimator = new OverScroller(context);
    }

    private void postAddActionBarHideOffset() {
        haltActionBarHideOffsetAnimations();
        postDelayed(this.mAddActionBarHideOffset, 600L);
    }

    private void postRemoveActionBarHideOffset() {
        haltActionBarHideOffsetAnimations();
        postDelayed(this.mRemoveActionBarHideOffset, 600L);
    }

    private void removeActionBarHideOffset() {
        haltActionBarHideOffsetAnimations();
        this.mRemoveActionBarHideOffset.run();
    }

    private boolean shouldHideActionBarOnFling(float f7) {
        this.mFlingEstimator.fling(0, 0, 0, (int) f7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.mFlingEstimator.getFinalY() > this.mActionBarTop.getHeight();
    }

    @Override
    public boolean canShowOverflowMenu() {
        pullChildren();
        return this.mDecorToolbar.canShowOverflowMenu();
    }

    @Override
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override
    public void dismissPopups() {
        pullChildren();
        this.mDecorToolbar.dismissPopupMenus();
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.mWindowContentOverlay == null || this.mIgnoreWindowContentOverlay) {
            return;
        }
        int bottom = this.mActionBarTop.getVisibility() == 0 ? (int) (this.mActionBarTop.getBottom() + this.mActionBarTop.getTranslationY() + 0.5f) : 0;
        this.mWindowContentOverlay.setBounds(0, bottom, getWidth(), this.mWindowContentOverlay.getIntrinsicHeight() + bottom);
        this.mWindowContentOverlay.draw(canvas);
    }

    @Override
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.mActionBarTop;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.mParentHelper.a();
    }

    @Override
    public CharSequence getTitle() {
        pullChildren();
        return this.mDecorToolbar.getTitle();
    }

    void haltActionBarHideOffsetAnimations() {
        removeCallbacks(this.mRemoveActionBarHideOffset);
        removeCallbacks(this.mAddActionBarHideOffset);
        ViewPropertyAnimator viewPropertyAnimator = this.mCurrentActionBarTopAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override
    public boolean hasIcon() {
        pullChildren();
        return this.mDecorToolbar.hasIcon();
    }

    @Override
    public boolean hasLogo() {
        pullChildren();
        return this.mDecorToolbar.hasLogo();
    }

    @Override
    public boolean hideOverflowMenu() {
        pullChildren();
        return this.mDecorToolbar.hideOverflowMenu();
    }

    @Override
    public void initFeature(int i7) {
        pullChildren();
        if (i7 == 2) {
            this.mDecorToolbar.initProgress();
        } else if (i7 == 5) {
            this.mDecorToolbar.initIndeterminateProgress();
        } else {
            if (i7 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public boolean isHideOnContentScrollEnabled() {
        return this.mHideOnContentScroll;
    }

    public boolean isInOverlayMode() {
        return this.mOverlayMode;
    }

    @Override
    public boolean isOverflowMenuShowPending() {
        pullChildren();
        return this.mDecorToolbar.isOverflowMenuShowPending();
    }

    @Override
    public boolean isOverflowMenuShowing() {
        pullChildren();
        return this.mDecorToolbar.isOverflowMenuShowing();
    }

    @Override
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        pullChildren();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, this);
        boolean zApplyInsets = applyInsets(this.mActionBarTop, new Rect(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom()), true, true, false, true);
        Z.f(this, windowInsetsCompat, this.mBaseContentInsets);
        Rect rect = this.mBaseContentInsets;
        WindowInsetsCompat windowInsetsCompatInset = windowInsetsCompat.inset(rect.left, rect.top, rect.right, rect.bottom);
        this.mBaseInnerInsets = windowInsetsCompatInset;
        boolean z7 = true;
        if (!this.mLastBaseInnerInsets.equals(windowInsetsCompatInset)) {
            this.mLastBaseInnerInsets = this.mBaseInnerInsets;
            zApplyInsets = true;
        }
        if (this.mLastBaseContentInsets.equals(this.mBaseContentInsets)) {
            z7 = zApplyInsets;
        } else {
            this.mLastBaseContentInsets.set(this.mBaseContentInsets);
        }
        if (z7) {
            requestLayout();
        }
        return windowInsetsCompat.consumeDisplayCutout().consumeSystemWindowInsets().consumeStableInsets().toWindowInsets();
    }

    @Override
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        init(getContext());
        Z.k0(this);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        haltActionBarHideOffsetAnimations();
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
            }
        }
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        int measuredHeight;
        pullChildren();
        measureChildWithMargins(this.mActionBarTop, i7, 0, i8, 0);
        LayoutParams layoutParams = (LayoutParams) this.mActionBarTop.getLayoutParams();
        int iMax = Math.max(0, this.mActionBarTop.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int iMax2 = Math.max(0, this.mActionBarTop.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.mActionBarTop.getMeasuredState());
        boolean z7 = (Z.K(this) & 256) != 0;
        if (z7) {
            measuredHeight = this.mActionBarHeight;
            if (this.mHasNonEmbeddedTabs && this.mActionBarTop.getTabContainer() != null) {
                measuredHeight += this.mActionBarHeight;
            }
        } else {
            measuredHeight = this.mActionBarTop.getVisibility() != 8 ? this.mActionBarTop.getMeasuredHeight() : 0;
        }
        this.mContentInsets.set(this.mBaseContentInsets);
        WindowInsetsCompat windowInsetsCompat = this.mBaseInnerInsets;
        this.mInnerInsets = windowInsetsCompat;
        if (this.mOverlayMode || z7) {
            this.mInnerInsets = new WindowInsetsCompat.Builder(this.mInnerInsets).setSystemWindowInsets(Insets.of(windowInsetsCompat.getSystemWindowInsetLeft(), this.mInnerInsets.getSystemWindowInsetTop() + measuredHeight, this.mInnerInsets.getSystemWindowInsetRight(), this.mInnerInsets.getSystemWindowInsetBottom())).build();
        } else {
            Rect rect = this.mContentInsets;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.mInnerInsets = windowInsetsCompat.inset(0, measuredHeight, 0, 0);
        }
        applyInsets(this.mContent, this.mContentInsets, true, true, true, true);
        if (!this.mLastInnerInsets.equals(this.mInnerInsets)) {
            WindowInsetsCompat windowInsetsCompat2 = this.mInnerInsets;
            this.mLastInnerInsets = windowInsetsCompat2;
            Z.g(this.mContent, windowInsetsCompat2);
        }
        measureChildWithMargins(this.mContent, i7, 0, i8, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.mContent.getLayoutParams();
        int iMax3 = Math.max(iMax, this.mContent.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int iMax4 = Math.max(iMax2, this.mContent.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.mContent.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i7, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i8, iCombineMeasuredStates2 << 16));
    }

    @Override
    public boolean onNestedFling(View view, float f7, float f8, boolean z7) {
        if (!this.mHideOnContentScroll || !z7) {
            return false;
        }
        if (shouldHideActionBarOnFling(f8)) {
            addActionBarHideOffset();
        } else {
            removeActionBarHideOffset();
        }
        this.mAnimatingForFling = true;
        return true;
    }

    @Override
    public boolean onNestedPreFling(View view, float f7, float f8) {
        return false;
    }

    @Override
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
    }

    @Override
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        onNestedScroll(view, i7, i8, i9, i10, i11);
    }

    @Override
    public void onNestedScrollAccepted(View view, View view2, int i7, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override
    public boolean onStartNestedScroll(View view, View view2, int i7, int i8) {
        return i8 == 0 && onStartNestedScroll(view, view2, i7);
    }

    @Override
    public void onStopNestedScroll(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i7) {
        super.onWindowSystemUiVisibilityChanged(i7);
        pullChildren();
        int i8 = this.mLastSystemUiVisibility ^ i7;
        this.mLastSystemUiVisibility = i7;
        boolean z7 = (i7 & 4) == 0;
        boolean z8 = (i7 & 256) != 0;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.mActionBarVisibilityCallback;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.enableContentAnimations(!z8);
            if (z7 || !z8) {
                this.mActionBarVisibilityCallback.showForSystem();
            } else {
                this.mActionBarVisibilityCallback.hideForSystem();
            }
        }
        if ((i8 & 256) == 0 || this.mActionBarVisibilityCallback == null) {
            return;
        }
        Z.k0(this);
    }

    @Override
    protected void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        this.mWindowVisibility = i7;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.mActionBarVisibilityCallback;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onWindowVisibilityChanged(i7);
        }
    }

    void pullChildren() {
        if (this.mContent == null) {
            this.mContent = (ContentFrameLayout) findViewById(C2452f.f20652b);
            this.mActionBarTop = (ActionBarContainer) findViewById(C2452f.f20653c);
            this.mDecorToolbar = getDecorToolbar(findViewById(C2452f.f20651a));
        }
    }

    @Override
    public void restoreToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        pullChildren();
        this.mDecorToolbar.restoreHierarchyState(sparseArray);
    }

    @Override
    public void saveToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        pullChildren();
        this.mDecorToolbar.saveHierarchyState(sparseArray);
    }

    public void setActionBarHideOffset(int i7) {
        haltActionBarHideOffsetAnimations();
        this.mActionBarTop.setTranslationY(-Math.max(0, Math.min(i7, this.mActionBarTop.getHeight())));
    }

    public void setActionBarVisibilityCallback(ActionBarVisibilityCallback actionBarVisibilityCallback) {
        this.mActionBarVisibilityCallback = actionBarVisibilityCallback;
        if (getWindowToken() != null) {
            this.mActionBarVisibilityCallback.onWindowVisibilityChanged(this.mWindowVisibility);
            int i7 = this.mLastSystemUiVisibility;
            if (i7 != 0) {
                onWindowSystemUiVisibilityChanged(i7);
                Z.k0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z7) {
        this.mHasNonEmbeddedTabs = z7;
    }

    public void setHideOnContentScrollEnabled(boolean z7) {
        if (z7 != this.mHideOnContentScroll) {
            this.mHideOnContentScroll = z7;
            if (z7) {
                return;
            }
            haltActionBarHideOffsetAnimations();
            setActionBarHideOffset(0);
        }
    }

    @Override
    public void setIcon(int i7) {
        pullChildren();
        this.mDecorToolbar.setIcon(i7);
    }

    @Override
    public void setLogo(int i7) {
        pullChildren();
        this.mDecorToolbar.setLogo(i7);
    }

    @Override
    public void setMenu(Menu menu, m.a aVar) {
        pullChildren();
        this.mDecorToolbar.setMenu(menu, aVar);
    }

    @Override
    public void setMenuPrepared() {
        pullChildren();
        this.mDecorToolbar.setMenuPrepared();
    }

    public void setOverlayMode(boolean z7) {
        this.mOverlayMode = z7;
        this.mIgnoreWindowContentOverlay = z7 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z7) {
    }

    @Override
    public void setUiOptions(int i7) {
    }

    @Override
    public void setWindowCallback(Window.Callback callback) {
        pullChildren();
        this.mDecorToolbar.setWindowCallback(callback);
    }

    @Override
    public void setWindowTitle(CharSequence charSequence) {
        pullChildren();
        this.mDecorToolbar.setWindowTitle(charSequence);
    }

    @Override
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override
    public boolean showOverflowMenu() {
        pullChildren();
        return this.mDecorToolbar.showOverflowMenu();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWindowVisibility = 0;
        this.mBaseContentInsets = new Rect();
        this.mLastBaseContentInsets = new Rect();
        this.mContentInsets = new Rect();
        this.mBaseInnerInsetsRect = new Rect();
        this.mLastBaseInnerInsetsRect = new Rect();
        this.mInnerInsetsRect = new Rect();
        this.mLastInnerInsetsRect = new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.CONSUMED;
        this.mBaseInnerInsets = windowInsetsCompat;
        this.mLastBaseInnerInsets = windowInsetsCompat;
        this.mInnerInsets = windowInsetsCompat;
        this.mLastInnerInsets = windowInsetsCompat;
        this.mTopAnimatorListener = new a();
        this.mRemoveActionBarHideOffset = new b();
        this.mAddActionBarHideOffset = new c();
        init(context);
        this.mParentHelper = new H(this);
    }

    @Override
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr, int i9) {
        if (i9 == 0) {
            onNestedPreScroll(view, i7, i8, iArr);
        }
    }

    @Override
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            onNestedScroll(view, i7, i8, i9, i10);
        }
    }

    @Override
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        this.mParentHelper.b(view, view2, i7);
        this.mHideOnContentScrollReference = getActionBarHideOffset();
        haltActionBarHideOffsetAnimations();
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.mActionBarVisibilityCallback;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onContentScrollStarted();
        }
    }

    @Override
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        if ((i7 & 2) == 0 || this.mActionBarTop.getVisibility() != 0) {
            return false;
        }
        return this.mHideOnContentScroll;
    }

    @Override
    public void onStopNestedScroll(View view) {
        if (this.mHideOnContentScroll && !this.mAnimatingForFling) {
            if (this.mHideOnContentScrollReference <= this.mActionBarTop.getHeight()) {
                postRemoveActionBarHideOffset();
            } else {
                postAddActionBarHideOffset();
            }
        }
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.mActionBarVisibilityCallback;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onContentScrollStopped();
        }
    }

    @Override
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        int i11 = this.mHideOnContentScrollReference + i8;
        this.mHideOnContentScrollReference = i11;
        setActionBarHideOffset(i11);
    }

    @Override
    public void setIcon(Drawable drawable) {
        pullChildren();
        this.mDecorToolbar.setIcon(drawable);
    }
}
