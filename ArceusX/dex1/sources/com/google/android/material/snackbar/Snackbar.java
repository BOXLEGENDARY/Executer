package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c4.C1746b;
import c4.C1752h;
import com.google.android.material.snackbar.BaseTransientBottomBar;

public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    private static final int[] f18436J;

    private static final int[] f18437K;

    private final AccessibilityManager f18438H;

    private boolean f18439I;

    public static final class SnackbarLayout extends BaseTransientBottomBar.t {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override
        protected void onMeasure(int i7, int i8) {
            super.onMeasure(i7, i8);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override
        public void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override
        public void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override
        public void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override
        public void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    public static class a extends BaseTransientBottomBar.r<Snackbar> {
        @Override
        public void b(Snackbar snackbar) {
        }
    }

    static {
        int i7 = C1746b.f12723S;
        f18436J = new int[]{i7};
        f18437K = new int[]{i7, C1746b.f12725U};
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.a aVar) {
        super(context, viewGroup, view, aVar);
        this.f18438H = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    private static ViewGroup h0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private SnackbarContentLayout i0() {
        return (SnackbarContentLayout) this.f18382i.getChildAt(0);
    }

    private TextView j0() {
        return i0().getMessageView();
    }

    private static boolean k0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f18437K);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    public static Snackbar l0(View view, CharSequence charSequence, int i7) {
        return m0(null, view, charSequence, i7);
    }

    private static Snackbar m0(Context context, View view, CharSequence charSequence, int i7) {
        ViewGroup viewGroupH0 = h0(view);
        if (viewGroupH0 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupH0.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(k0(context) ? C1752h.f12919t : C1752h.f12901b, viewGroupH0, false);
        Snackbar snackbar = new Snackbar(context, viewGroupH0, snackbarContentLayout, snackbarContentLayout);
        snackbar.n0(charSequence);
        snackbar.V(i7);
        return snackbar;
    }

    @Override
    public void A() {
        super.A();
    }

    @Override
    public int E() {
        int iE = super.E();
        if (iE == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f18438H.getRecommendedTimeoutMillis(iE, (this.f18439I ? 4 : 0) | 3);
        }
        if (this.f18439I && this.f18438H.isTouchExplorationEnabled()) {
            return -2;
        }
        return iE;
    }

    @Override
    public void Z() {
        super.Z();
    }

    public Snackbar n0(CharSequence charSequence) {
        j0().setText(charSequence);
        return this;
    }

    public Snackbar o0(int i7) {
        j0().setMaxLines(i7);
        return this;
    }
}
