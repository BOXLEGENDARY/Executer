package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.LinearLayoutCompat;

public class ActionMenuView extends LinearLayoutCompat implements g.b, androidx.appcompat.view.menu.n {
    static final int GENERATED_ITEM_PADDING = 4;
    static final int MIN_CELL_SIZE = 56;
    private static final String TAG = "ActionMenuView";
    private m.a mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private androidx.appcompat.view.menu.g mMenu;
    g.a mMenuBuilderCallback;
    private int mMinCellSize;
    OnMenuItemClickListener mOnMenuItemClickListener;
    private Context mPopupContext;
    private int mPopupTheme;
    private C1597b mPresenter;
    private boolean mReserveOverflow;

    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        @ViewDebug.ExportedProperty
        public int cellsUsed;

        @ViewDebug.ExportedProperty
        public boolean expandable;
        boolean expanded;

        @ViewDebug.ExportedProperty
        public int extraPixels;

        @ViewDebug.ExportedProperty
        public boolean isOverflowButton;

        @ViewDebug.ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.isOverflowButton = layoutParams.isOverflowButton;
        }

        public LayoutParams(int i7, int i8) {
            super(i7, i8);
            this.isOverflowButton = false;
        }

        LayoutParams(int i7, int i8, boolean z7) {
            super(i7, i8);
            this.isOverflowButton = z7;
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    private static class a implements m.a {
        a() {
        }

        @Override
        public void a(androidx.appcompat.view.menu.g gVar, boolean z7) {
        }

        @Override
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            return false;
        }
    }

    private class b implements g.a {
        b() {
        }

        @Override
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = ActionMenuView.this.mOnMenuItemClickListener;
            return onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(menuItem);
        }

        @Override
        public void b(androidx.appcompat.view.menu.g gVar) {
            g.a aVar = ActionMenuView.this.mMenuBuilderCallback;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    static int measureChildForCells(android.view.View r5, int r6, int r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.measureChildForCells(android.view.View, int, int, int, int):int");
    }

    private void onMeasureExactFormat(int i7, int i8) {
        int i9;
        int i10;
        boolean z7;
        int i11;
        int i12;
        boolean z8;
        boolean z9;
        int i13;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, paddingTop, -2);
        int i14 = size - paddingLeft;
        int i15 = this.mMinCellSize;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = i15 + (i17 / i16);
        int childCount = getChildCount();
        int iMax = 0;
        int i19 = 0;
        boolean z10 = false;
        int i20 = 0;
        int iMax2 = 0;
        int i21 = 0;
        long j7 = 0;
        while (i19 < childCount) {
            View childAt = getChildAt(i19);
            int i22 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z11 = childAt instanceof ActionMenuItemView;
                int i23 = i20 + 1;
                if (z11) {
                    int i24 = this.mGeneratedItemPadding;
                    i13 = i23;
                    r14 = 0;
                    childAt.setPadding(i24, 0, i24, 0);
                } else {
                    i13 = i23;
                    r14 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.expanded = r14;
                layoutParams.extraPixels = r14;
                layoutParams.cellsUsed = r14;
                layoutParams.expandable = r14;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = r14;
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = r14;
                layoutParams.preventEdgeOffset = z11 && ((ActionMenuItemView) childAt).d();
                int iMeasureChildForCells = measureChildForCells(childAt, i18, layoutParams.isOverflowButton ? 1 : i16, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iMeasureChildForCells);
                if (layoutParams.expandable) {
                    i21++;
                }
                if (layoutParams.isOverflowButton) {
                    z10 = true;
                }
                i16 -= iMeasureChildForCells;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iMeasureChildForCells == 1) {
                    j7 |= 1 << i19;
                    iMax = iMax;
                }
                i20 = i13;
            }
            i19++;
            size2 = i22;
        }
        int i25 = size2;
        boolean z12 = z10 && i20 == 2;
        boolean z13 = false;
        while (i21 > 0 && i16 > 0) {
            int i26 = Integer.MAX_VALUE;
            int i27 = 0;
            int i28 = 0;
            long j8 = 0;
            while (i28 < childCount) {
                boolean z14 = z13;
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i28).getLayoutParams();
                int i29 = iMax;
                if (layoutParams2.expandable) {
                    int i30 = layoutParams2.cellsUsed;
                    if (i30 < i26) {
                        j8 = 1 << i28;
                        i26 = i30;
                        i27 = 1;
                    } else if (i30 == i26) {
                        i27++;
                        j8 |= 1 << i28;
                    }
                }
                i28++;
                iMax = i29;
                z13 = z14;
            }
            z7 = z13;
            i11 = iMax;
            j7 |= j8;
            if (i27 > i16) {
                i9 = mode;
                i10 = i14;
                break;
            }
            int i31 = i26 + 1;
            int i32 = 0;
            while (i32 < childCount) {
                View childAt2 = getChildAt(i32);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                int i33 = i14;
                int i34 = mode;
                long j9 = 1 << i32;
                if ((j8 & j9) == 0) {
                    if (layoutParams3.cellsUsed == i31) {
                        j7 |= j9;
                    }
                    z9 = z12;
                } else {
                    if (z12 && layoutParams3.preventEdgeOffset && i16 == 1) {
                        int i35 = this.mGeneratedItemPadding;
                        z9 = z12;
                        childAt2.setPadding(i35 + i18, 0, i35, 0);
                    } else {
                        z9 = z12;
                    }
                    layoutParams3.cellsUsed++;
                    layoutParams3.expanded = true;
                    i16--;
                }
                i32++;
                mode = i34;
                i14 = i33;
                z12 = z9;
            }
            iMax = i11;
            z13 = true;
        }
        i9 = mode;
        i10 = i14;
        z7 = z13;
        i11 = iMax;
        boolean z15 = !z10 && i20 == 1;
        if (i16 <= 0 || j7 == 0 || (i16 >= i20 - 1 && !z15 && iMax2 <= 1)) {
            i12 = 0;
            z8 = z7;
        } else {
            float fBitCount = Long.bitCount(j7);
            if (z15) {
                i12 = 0;
            } else {
                i12 = 0;
                if ((j7 & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).preventEdgeOffset) {
                    fBitCount -= 0.5f;
                }
                int i36 = childCount - 1;
                if ((j7 & (1 << i36)) != 0 && !((LayoutParams) getChildAt(i36).getLayoutParams()).preventEdgeOffset) {
                    fBitCount -= 0.5f;
                }
            }
            int i37 = fBitCount > 0.0f ? (int) ((i16 * i18) / fBitCount) : i12;
            z8 = z7;
            for (int i38 = i12; i38 < childCount; i38++) {
                if ((j7 & (1 << i38)) != 0) {
                    View childAt3 = getChildAt(i38);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.extraPixels = i37;
                        layoutParams4.expanded = true;
                        if (i38 == 0 && !layoutParams4.preventEdgeOffset) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = (-i37) / 2;
                        }
                        z8 = true;
                    } else if (layoutParams4.isOverflowButton) {
                        layoutParams4.extraPixels = i37;
                        layoutParams4.expanded = true;
                        ((LinearLayout.LayoutParams) layoutParams4).rightMargin = (-i37) / 2;
                        z8 = true;
                    } else {
                        if (i38 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i37 / 2;
                        }
                        if (i38 != childCount - 1) {
                            ((LinearLayout.LayoutParams) layoutParams4).rightMargin = i37 / 2;
                        }
                    }
                }
            }
        }
        if (z8) {
            for (int i39 = i12; i39 < childCount; i39++) {
                View childAt4 = getChildAt(i39);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.expanded) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.cellsUsed * i18) + layoutParams5.extraPixels, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i10, i9 != 1073741824 ? i11 : i25);
    }

    @Override
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dismissPopupMenus() {
        C1597b c1597b = this.mPresenter;
        if (c1597b != null) {
            c1597b.z();
        }
    }

    @Override
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public LayoutParams generateOverflowButtonLayoutParams() {
        LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.isOverflowButton = true;
        return layoutParamsGenerateDefaultLayoutParams;
    }

    public Menu getMenu() {
        if (this.mMenu == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            this.mMenu = gVar;
            gVar.R(new b());
            C1597b c1597b = new C1597b(context);
            this.mPresenter = c1597b;
            c1597b.L(true);
            C1597b c1597b2 = this.mPresenter;
            m.a aVar = this.mActionMenuPresenterCallback;
            if (aVar == null) {
                aVar = new a();
            }
            c1597b2.f(aVar);
            this.mMenu.c(this.mPresenter, this.mPopupContext);
            this.mPresenter.J(this);
        }
        return this.mMenu;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.mPresenter.B();
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public int getWindowAnimations() {
        return 0;
    }

    protected boolean hasSupportDividerBeforeChildAt(int i7) {
        boolean zNeedsDividerAfter = false;
        if (i7 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i7 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i7);
        if (i7 < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            zNeedsDividerAfter = ((ActionMenuChildView) childAt).needsDividerAfter();
        }
        return (i7 <= 0 || !(childAt2 instanceof ActionMenuChildView)) ? zNeedsDividerAfter : zNeedsDividerAfter | ((ActionMenuChildView) childAt2).needsDividerBefore();
    }

    public boolean hideOverflowMenu() {
        C1597b c1597b = this.mPresenter;
        return c1597b != null && c1597b.C();
    }

    @Override
    public void initialize(androidx.appcompat.view.menu.g gVar) {
        this.mMenu = gVar;
    }

    @Override
    public boolean invokeItem(androidx.appcompat.view.menu.i iVar) {
        return this.mMenu.L(iVar, 0);
    }

    public boolean isOverflowMenuShowPending() {
        C1597b c1597b = this.mPresenter;
        return c1597b != null && c1597b.E();
    }

    public boolean isOverflowMenuShowing() {
        C1597b c1597b = this.mPresenter;
        return c1597b != null && c1597b.F();
    }

    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1597b c1597b = this.mPresenter;
        if (c1597b != null) {
            c1597b.b(false);
            if (this.mPresenter.F()) {
                this.mPresenter.C();
                this.mPresenter.M();
            }
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int width;
        int paddingLeft;
        if (!this.mFormatItems) {
            super.onLayout(z7, i7, i8, i9, i10);
            return;
        }
        int childCount = getChildCount();
        int i11 = (i10 - i8) / 2;
        int dividerWidth = getDividerWidth();
        int i12 = i9 - i7;
        int paddingRight = (i12 - getPaddingRight()) - getPaddingLeft();
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isOverflowButton) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (hasSupportDividerBeforeChildAt(i15)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zIsLayoutRtl) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i16 = i11 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i16, width, measuredHeight + i16);
                    paddingRight -= measuredWidth;
                    i13 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    hasSupportDividerBeforeChildAt(i15);
                    i14++;
                }
            }
        }
        if (childCount == 1 && i13 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i17 = (i12 / 2) - (measuredWidth2 / 2);
            int i18 = i11 - (measuredHeight2 / 2);
            childAt2.layout(i17, i18, measuredWidth2 + i17, measuredHeight2 + i18);
            return;
        }
        int i19 = i14 - (i13 ^ 1);
        int iMax = Math.max(0, i19 > 0 ? paddingRight / i19 : 0);
        if (zIsLayoutRtl) {
            int width2 = getWidth() - getPaddingRight();
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt3 = getChildAt(i20);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.isOverflowButton) {
                    int i21 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i22 = i11 - (measuredHeight3 / 2);
                    childAt3.layout(i21 - measuredWidth3, i22, i21, measuredHeight3 + i22);
                    width2 = i21 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt4 = getChildAt(i23);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.isOverflowButton) {
                int i24 = paddingLeft2 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i25 = i11 - (measuredHeight4 / 2);
                childAt4.layout(i24, i25, i24 + measuredWidth4, measuredHeight4 + i25);
                paddingLeft2 = i24 + measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + iMax;
            }
        }
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        androidx.appcompat.view.menu.g gVar;
        boolean z7 = this.mFormatItems;
        boolean z8 = View.MeasureSpec.getMode(i7) == 1073741824;
        this.mFormatItems = z8;
        if (z7 != z8) {
            this.mFormatItemsWidth = 0;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.mFormatItems && (gVar = this.mMenu) != null && size != this.mFormatItemsWidth) {
            this.mFormatItemsWidth = size;
            gVar.K(true);
        }
        int childCount = getChildCount();
        if (this.mFormatItems && childCount > 0) {
            onMeasureExactFormat(i7, i8);
            return;
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i9).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i7, i8);
    }

    public androidx.appcompat.view.menu.g peekMenu() {
        return this.mMenu;
    }

    public void setExpandedActionViewsExclusive(boolean z7) {
        this.mPresenter.I(z7);
    }

    public void setMenuCallbacks(m.a aVar, g.a aVar2) {
        this.mActionMenuPresenterCallback = aVar;
        this.mMenuBuilderCallback = aVar2;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.mPresenter.K(drawable);
    }

    public void setOverflowReserved(boolean z7) {
        this.mReserveOverflow = z7;
    }

    public void setPopupTheme(int i7) {
        if (this.mPopupTheme != i7) {
            this.mPopupTheme = i7;
            if (i7 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setPresenter(C1597b c1597b) {
        this.mPresenter = c1597b;
        c1597b.J(this);
    }

    public boolean showOverflowMenu() {
        C1597b c1597b = this.mPresenter;
        return c1597b != null && c1597b.M();
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f7 = context.getResources().getDisplayMetrics().density;
        this.mMinCellSize = (int) (56.0f * f7);
        this.mGeneratedItemPadding = (int) (f7 * 4.0f);
        this.mPopupContext = context;
        this.mPopupTheme = 0;
    }

    @Override
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams != null) {
            if (layoutParams instanceof LayoutParams) {
                layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
            } else {
                layoutParams2 = new LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
                ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
            }
            return layoutParams2;
        }
        return generateDefaultLayoutParams();
    }
}
