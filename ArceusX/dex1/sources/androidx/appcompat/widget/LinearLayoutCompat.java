package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.Z;
import com.appsflyer.R;
import g.C2456j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i7, int i8) {
            super(i7, i8);
        }

        public LayoutParams(int i7, int i8, float f7) {
            super(i7, i8, f7);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    private void forceUniformHeight(int i7, int i8) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i9 = 0; i9 < i7; i9++) {
            View virtualChildAt = getVirtualChildAt(i9);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                    int i10 = ((LinearLayout.LayoutParams) layoutParams).width;
                    ((LinearLayout.LayoutParams) layoutParams).width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i8, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) layoutParams).width = i10;
                }
            }
        }
    }

    private void forceUniformWidth(int i7, int i8) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i9 = 0; i9 < i7; i9++) {
            View virtualChildAt = getVirtualChildAt(i9);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i10 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, iMakeMeasureSpec, 0, i8, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i10;
                }
            }
        }
    }

    private void setChildFrame(View view, int i7, int i8, int i9, int i10) {
        view.layout(i7, i8, i9 + i7, i10 + i8);
    }

    @Override
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i7;
        int virtualChildCount = getVirtualChildCount();
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        for (int i8 = 0; i8 < virtualChildCount; i8++) {
            View virtualChildAt = getVirtualChildAt(i8);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i8)) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, zIsLayoutRtl ? virtualChildAt.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                if (zIsLayoutRtl) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i7 = this.mDividerWidth;
                    right = left - i7;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (zIsLayoutRtl) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i7 = this.mDividerWidth;
                right = left - i7;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i7 = 0; i7 < virtualChildCount; i7++) {
            View virtualChildAt = getVirtualChildAt(i7);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i7)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt2.getLayoutParams())).bottomMargin);
        }
    }

    void drawHorizontalDivider(Canvas canvas, int i7) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i7, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i7);
        this.mDivider.draw(canvas);
    }

    void drawVerticalDivider(Canvas canvas, int i7) {
        this.mDivider.setBounds(i7, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i7, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override
    public int getBaseline() {
        int i7;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i8 = this.mBaselineAlignedChildIndex;
        if (childCount <= i8) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i8);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i7 = this.mGravity & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != 48) {
            if (i7 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i7 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    int getChildrenSkipCount(View view, int i7) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    int getLocationOffset(View view) {
        return 0;
    }

    int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    View getVirtualChildAt(int i7) {
        return getChildAt(i7);
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    protected boolean hasDividerBeforeChildAt(int i7) {
        if (i7 == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i7 == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) == 0) {
            return false;
        }
        for (int i8 = i7 - 1; i8 >= 0; i8--) {
            if (getChildAt(i8).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    void layoutHorizontal(int r25, int r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.layoutHorizontal(int, int, int, int):void");
    }

    void layoutVertical(int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.layoutVertical(int, int, int, int):void");
    }

    void measureChildBeforeLayout(View view, int i7, int i8, int i9, int i10, int i11) {
        measureChildWithMargins(view, i8, i9, i10, i11);
    }

    void measureHorizontal(int r40, int r41) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.measureHorizontal(int, int):void");
    }

    int measureNullChild(int i7) {
        return 0;
    }

    void measureVertical(int r34, int r35) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.measureVertical(int, int):void");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        if (this.mOrientation == 1) {
            layoutVertical(i7, i8, i9, i10);
        } else {
            layoutHorizontal(i7, i8, i9, i10);
        }
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        if (this.mOrientation == 1) {
            measureVertical(i7, i8);
        } else {
            measureHorizontal(i7, i8);
        }
    }

    public void setBaselineAligned(boolean z7) {
        this.mBaselineAligned = z7;
    }

    public void setBaselineAlignedChildIndex(int i7) {
        if (i7 >= 0 && i7 < getChildCount()) {
            this.mBaselineAlignedChildIndex = i7;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i7) {
        this.mDividerPadding = i7;
    }

    public void setGravity(int i7) {
        if (this.mGravity != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i7 |= 48;
            }
            this.mGravity = i7;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i7) {
        int i8 = i7 & 8388615;
        int i9 = this.mGravity;
        if ((8388615 & i9) != i8) {
            this.mGravity = i8 | ((-8388616) & i9);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z7) {
        this.mUseLargestChild = z7;
    }

    public void setOrientation(int i7) {
        if (this.mOrientation != i7) {
            this.mOrientation = i7;
            requestLayout();
        }
    }

    public void setShowDividers(int i7) {
        if (i7 != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i7;
    }

    public void setVerticalGravity(int i7) {
        int i8 = i7 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int i9 = this.mGravity;
        if ((i9 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != i8) {
            this.mGravity = i8 | (i9 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f7) {
        this.mWeightSum = Math.max(0.0f, f7);
    }

    @Override
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override
    public LayoutParams generateDefaultLayoutParams() {
        int i7 = this.mOrientation;
        if (i7 == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i7 == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        int[] iArr = C2456j.f20802c1;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i7, 0);
        Z.l0(this, context, iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i7, 0);
        int i8 = tintTypedArrayObtainStyledAttributes.getInt(C2456j.f20810e1, -1);
        if (i8 >= 0) {
            setOrientation(i8);
        }
        int i9 = tintTypedArrayObtainStyledAttributes.getInt(C2456j.f20805d1, -1);
        if (i9 >= 0) {
            setGravity(i9);
        }
        boolean z7 = tintTypedArrayObtainStyledAttributes.getBoolean(C2456j.f20815f1, true);
        if (!z7) {
            setBaselineAligned(z7);
        }
        this.mWeightSum = tintTypedArrayObtainStyledAttributes.getFloat(C2456j.f20825h1, -1.0f);
        this.mBaselineAlignedChildIndex = tintTypedArrayObtainStyledAttributes.getInt(C2456j.f20820g1, -1);
        this.mUseLargestChild = tintTypedArrayObtainStyledAttributes.getBoolean(C2456j.k1, false);
        setDividerDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(C2456j.f20830i1));
        this.mShowDividers = tintTypedArrayObtainStyledAttributes.getInt(C2456j.l1, 0);
        this.mDividerPadding = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(C2456j.f20835j1, 0);
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    @Override
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }
}
