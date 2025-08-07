package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import c4.C1754j;
import com.google.android.material.internal.g;
import java.util.List;
import y0.C3019t;

public class b extends g {

    private static final int f17717B = C1754j.f12964q;

    private final int f17718A;

    private int f17719w;

    private int f17720y;

    private d f17721z;

    class a implements d {
        a(c cVar) {
        }
    }

    public static class C0156b extends ViewGroup.MarginLayoutParams {
        public C0156b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0156b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0156b(int i7, int i8) {
            super(i7, i8);
        }
    }

    @Deprecated
    public interface c {
    }

    public interface d {
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        static ViewGroup.OnHierarchyChangeListener a(e eVar, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
            throw null;
        }
    }

    private boolean e(int i7) {
        return getChildAt(i7).getVisibility() == 0;
    }

    private int getVisibleChipCount() {
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if ((getChildAt(i8) instanceof Chip) && e(i8)) {
                i7++;
            }
        }
        return i7;
    }

    @Override
    public boolean c() {
        return super.c();
    }

    @Override
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0156b);
    }

    int d(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if ((childAt instanceof Chip) && e(i8)) {
                if (((Chip) childAt) == view) {
                    return i7;
                }
                i7++;
            }
        }
        return -1;
    }

    public boolean f() {
        throw null;
    }

    @Override
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0156b(-2, -2);
    }

    @Override
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0156b(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        throw null;
    }

    public List<Integer> getCheckedChipIds() {
        throw null;
    }

    public int getChipSpacingHorizontal() {
        return this.f17719w;
    }

    public int getChipSpacingVertical() {
        return this.f17720y;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (this.f17718A != -1) {
            throw null;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3019t.F0(accessibilityNodeInfo).g0(C3019t.e.a(getRowCount(), c() ? getVisibleChipCount() : -1, false, f() ? 1 : 2));
    }

    public void setChipSpacing(int i7) {
        setChipSpacingHorizontal(i7);
        setChipSpacingVertical(i7);
    }

    public void setChipSpacingHorizontal(int i7) {
        if (this.f17719w != i7) {
            this.f17719w = i7;
            setItemSpacing(i7);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i7) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i7));
    }

    public void setChipSpacingResource(int i7) {
        setChipSpacing(getResources().getDimensionPixelOffset(i7));
    }

    public void setChipSpacingVertical(int i7) {
        if (this.f17720y != i7) {
            this.f17720y = i7;
            setLineSpacing(i7);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i7) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i7));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i7) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new a(cVar));
        }
    }

    public void setOnCheckedStateChangeListener(d dVar) {
        this.f17721z = dVar;
    }

    @Override
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        e.a(null, onHierarchyChangeListener);
    }

    public void setSelectionRequired(boolean z7) {
        throw null;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i7) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i7) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override
    public void setSingleLine(boolean z7) {
        super.setSingleLine(z7);
    }

    public void setSingleSelection(boolean z7) {
        throw null;
    }

    @Override
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0156b(layoutParams);
    }

    public void setSingleLine(int i7) {
        setSingleLine(getResources().getBoolean(i7));
    }

    public void setSingleSelection(int i7) {
        setSingleSelection(getResources().getBoolean(i7));
    }
}
