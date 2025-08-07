package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C1620h0;
import androidx.core.view.Z;
import g.C2447a;
import g.C2452f;
import g.C2453g;
import g.C2456j;

public class ActionBarContextView extends AbsActionBarView {
    private View mClose;
    private View mCloseButton;
    private int mCloseItemLayout;
    private View mCustomView;
    private CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private TextView mSubtitleView;
    private CharSequence mTitle;
    private LinearLayout mTitleLayout;
    private boolean mTitleOptional;
    private int mTitleStyleRes;
    private TextView mTitleView;

    class a implements View.OnClickListener {

        final androidx.appcompat.view.b f9106d;

        a(androidx.appcompat.view.b bVar) {
            this.f9106d = bVar;
        }

        @Override
        public void onClick(View view) {
            this.f9106d.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void initTitle() {
        if (this.mTitleLayout == null) {
            LayoutInflater.from(getContext()).inflate(C2453g.f20677a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.mTitleLayout = linearLayout;
            this.mTitleView = (TextView) linearLayout.findViewById(C2452f.f20655e);
            this.mSubtitleView = (TextView) this.mTitleLayout.findViewById(C2452f.f20654d);
            if (this.mTitleStyleRes != 0) {
                this.mTitleView.setTextAppearance(getContext(), this.mTitleStyleRes);
            }
            if (this.mSubtitleStyleRes != 0) {
                this.mSubtitleView.setTextAppearance(getContext(), this.mSubtitleStyleRes);
            }
        }
        this.mTitleView.setText(this.mTitle);
        this.mSubtitleView.setText(this.mSubtitle);
        boolean zIsEmpty = TextUtils.isEmpty(this.mTitle);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.mSubtitle);
        this.mSubtitleView.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.mTitleLayout.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.mTitleLayout.getParent() == null) {
            addView(this.mTitleLayout);
        }
    }

    @Override
    public void animateToVisibility(int i7) {
        super.animateToVisibility(i7);
    }

    @Override
    public boolean canShowOverflowMenu() {
        return super.canShowOverflowMenu();
    }

    public void closeMode() {
        if (this.mClose == null) {
            killMode();
        }
    }

    @Override
    public void dismissPopupMenus() {
        super.dismissPopupMenus();
    }

    @Override
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override
    public int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override
    public int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.mSubtitle;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    @Override
    public boolean hideOverflowMenu() {
        C1597b c1597b = this.mActionMenuPresenter;
        if (c1597b != null) {
            return c1597b.C();
        }
        return false;
    }

    public void initForMode(androidx.appcompat.view.b bVar) {
        View view = this.mClose;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.mCloseItemLayout, (ViewGroup) this, false);
            this.mClose = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.mClose);
        }
        View viewFindViewById = this.mClose.findViewById(C2452f.f20659i);
        this.mCloseButton = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) bVar.e();
        C1597b c1597b = this.mActionMenuPresenter;
        if (c1597b != null) {
            c1597b.z();
        }
        C1597b c1597b2 = new C1597b(getContext());
        this.mActionMenuPresenter = c1597b2;
        c1597b2.L(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.c(this.mActionMenuPresenter, this.mPopupContext);
        ActionMenuView actionMenuView = (ActionMenuView) this.mActionMenuPresenter.p(this);
        this.mMenuView = actionMenuView;
        Z.r0(actionMenuView, null);
        addView(this.mMenuView, layoutParams);
    }

    @Override
    public boolean isOverflowMenuShowPending() {
        return super.isOverflowMenuShowPending();
    }

    @Override
    public boolean isOverflowMenuShowing() {
        C1597b c1597b = this.mActionMenuPresenter;
        if (c1597b != null) {
            return c1597b.F();
        }
        return false;
    }

    @Override
    public boolean isOverflowReserved() {
        return super.isOverflowReserved();
    }

    public boolean isTitleOptional() {
        return this.mTitleOptional;
    }

    public void killMode() {
        removeAllViews();
        this.mCustomView = null;
        this.mMenuView = null;
        this.mActionMenuPresenter = null;
        View view = this.mCloseButton;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1597b c1597b = this.mActionMenuPresenter;
        if (c1597b != null) {
            c1597b.C();
            this.mActionMenuPresenter.D();
        }
    }

    @Override
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        int paddingRight = zIsLayoutRtl ? (i9 - i7) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
        View view = this.mClose;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mClose.getLayoutParams();
            int i11 = zIsLayoutRtl ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i12 = zIsLayoutRtl ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int next = AbsActionBarView.next(paddingRight, i11, zIsLayoutRtl);
            paddingRight = AbsActionBarView.next(next + positionChild(this.mClose, next, paddingTop, paddingTop2, zIsLayoutRtl), i12, zIsLayoutRtl);
        }
        int iPositionChild = paddingRight;
        LinearLayout linearLayout = this.mTitleLayout;
        if (linearLayout != null && this.mCustomView == null && linearLayout.getVisibility() != 8) {
            iPositionChild += positionChild(this.mTitleLayout, iPositionChild, paddingTop, paddingTop2, zIsLayoutRtl);
        }
        int i13 = iPositionChild;
        View view2 = this.mCustomView;
        if (view2 != null) {
            positionChild(view2, i13, paddingTop, paddingTop2, zIsLayoutRtl);
        }
        int paddingLeft = zIsLayoutRtl ? getPaddingLeft() : (i9 - i7) - getPaddingRight();
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            positionChild(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zIsLayoutRtl);
        }
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        if (View.MeasureSpec.getMode(i7) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i8) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i7);
        int size2 = this.mContentHeight;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i8);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.mClose;
        if (view != null) {
            int iMeasureChildView = measureChildView(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mClose.getLayoutParams();
            paddingLeft = iMeasureChildView - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = measureChildView(this.mMenuView, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.mTitleLayout;
        if (linearLayout != null && this.mCustomView == null) {
            if (this.mTitleOptional) {
                this.mTitleLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.mTitleLayout.getMeasuredWidth();
                boolean z7 = measuredWidth <= paddingLeft;
                if (z7) {
                    paddingLeft -= measuredWidth;
                }
                this.mTitleLayout.setVisibility(z7 ? 0 : 8);
            } else {
                paddingLeft = measureChildView(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.mCustomView;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i9 = layoutParams.width;
            int i10 = i9 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i9 >= 0) {
                paddingLeft = Math.min(i9, paddingLeft);
            }
            int i11 = layoutParams.height;
            int i12 = i11 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i11 >= 0) {
                iMin = Math.min(i11, iMin);
            }
            this.mCustomView.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i10), View.MeasureSpec.makeMeasureSpec(iMin, i12));
        }
        if (this.mContentHeight > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            int measuredHeight = getChildAt(i14).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i13) {
                i13 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i13);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void postShowOverflowMenu() {
        super.postShowOverflowMenu();
    }

    @Override
    public void setContentHeight(int i7) {
        this.mContentHeight = i7;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.mCustomView;
        if (view2 != null) {
            removeView(view2);
        }
        this.mCustomView = view;
        if (view != null && (linearLayout = this.mTitleLayout) != null) {
            removeView(linearLayout);
            this.mTitleLayout = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.mSubtitle = charSequence;
        initTitle();
    }

    public void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        initTitle();
        Z.q0(this, charSequence);
    }

    public void setTitleOptional(boolean z7) {
        if (z7 != this.mTitleOptional) {
            requestLayout();
        }
        this.mTitleOptional = z7;
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
    }

    @Override
    public C1620h0 setupAnimatorToVisibility(int i7, long j7) {
        return super.setupAnimatorToVisibility(i7, j7);
    }

    @Override
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override
    public boolean showOverflowMenu() {
        C1597b c1597b = this.mActionMenuPresenter;
        if (c1597b != null) {
            return c1597b.M();
        }
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2447a.f20550l);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C2456j.f20893y, i7, 0);
        Z.r0(this, tintTypedArrayObtainStyledAttributes.getDrawable(C2456j.f20898z));
        this.mTitleStyleRes = tintTypedArrayObtainStyledAttributes.getResourceId(C2456j.f20731D, 0);
        this.mSubtitleStyleRes = tintTypedArrayObtainStyledAttributes.getResourceId(C2456j.f20727C, 0);
        this.mContentHeight = tintTypedArrayObtainStyledAttributes.getLayoutDimension(C2456j.f20723B, 0);
        this.mCloseItemLayout = tintTypedArrayObtainStyledAttributes.getResourceId(C2456j.f20719A, C2453g.f20680d);
        tintTypedArrayObtainStyledAttributes.recycle();
    }
}
