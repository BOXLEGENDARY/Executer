package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.view.C1605a;
import androidx.core.view.Z;
import c4.C1748d;
import c4.C1749e;
import c4.C1750f;
import c4.C1752h;
import g.C2447a;
import q0.C2731a;
import y0.C3019t;

public class NavigationMenuItemView extends h implements n.a {

    private static final int[] f18039K = {R.attr.state_checked};

    private boolean f18040A;

    boolean f18041B;

    boolean f18042C;

    private final CheckedTextView f18043D;

    private FrameLayout f18044E;

    private androidx.appcompat.view.menu.i f18045F;

    private ColorStateList f18046G;

    private boolean f18047H;

    private Drawable f18048I;

    private final C1605a f18049J;

    private int f18050z;

    class a extends C1605a {
        a() {
        }

        @Override
        public void g(View view, C3019t c3019t) {
            super.g(view, c3019t);
            c3019t.c0(NavigationMenuItemView.this.f18041B);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void c() {
        if (e()) {
            this.f18043D.setVisibility(8);
            FrameLayout frameLayout = this.f18044E;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.f18044E.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f18043D.setVisibility(0);
        FrameLayout frameLayout2 = this.f18044E;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.f18044E.setLayoutParams(layoutParams2);
        }
    }

    private StateListDrawable d() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C2447a.f20563y, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f18039K, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean e() {
        return this.f18045F.getTitle() == null && this.f18045F.getIcon() == null && this.f18045F.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f18044E == null) {
                this.f18044E = (FrameLayout) ((ViewStub) findViewById(C1750f.f12875e)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f18044E.removeAllViews();
            this.f18044E.addView(view);
        }
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public void b(androidx.appcompat.view.menu.i iVar, int i7) throws Resources.NotFoundException {
        this.f18045F = iVar;
        if (iVar.getItemId() > 0) {
            setId(iVar.getItemId());
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            Z.r0(this, d());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        TooltipCompat.setTooltipText(this, iVar.getTooltipText());
        c();
    }

    @Override
    public androidx.appcompat.view.menu.i getItemData() {
        return this.f18045F;
    }

    @Override
    protected int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        androidx.appcompat.view.menu.i iVar = this.f18045F;
        if (iVar != null && iVar.isCheckable() && this.f18045F.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f18039K);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z7) {
        refreshDrawableState();
        if (this.f18041B != z7) {
            this.f18041B = z7;
            this.f18049J.l(this.f18043D, 2048);
        }
    }

    public void setChecked(boolean z7) {
        refreshDrawableState();
        this.f18043D.setChecked(z7);
        CheckedTextView checkedTextView = this.f18043D;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z7 && this.f18042C) ? 1 : 0);
    }

    public void setHorizontalPadding(int i7) {
        setPadding(i7, getPaddingTop(), i7, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) throws Resources.NotFoundException {
        if (drawable != null) {
            if (this.f18047H) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C2731a.r(drawable).mutate();
                C2731a.o(drawable, this.f18046G);
            }
            int i7 = this.f18050z;
            drawable.setBounds(0, 0, i7, i7);
        } else if (this.f18040A) {
            if (this.f18048I == null) {
                Drawable drawableE = p0.h.e(getResources(), C1749e.f12850m, getContext().getTheme());
                this.f18048I = drawableE;
                if (drawableE != null) {
                    int i8 = this.f18050z;
                    drawableE.setBounds(0, 0, i8, i8);
                }
            }
            drawable = this.f18048I;
        }
        androidx.core.widget.j.m(this.f18043D, drawable, null, null, null);
    }

    public void setIconPadding(int i7) {
        this.f18043D.setCompoundDrawablePadding(i7);
    }

    public void setIconSize(int i7) {
        this.f18050z = i7;
    }

    void setIconTintList(ColorStateList colorStateList) throws Resources.NotFoundException {
        this.f18046G = colorStateList;
        this.f18047H = colorStateList != null;
        androidx.appcompat.view.menu.i iVar = this.f18045F;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i7) {
        this.f18043D.setMaxLines(i7);
    }

    public void setNeedsEmptyIcon(boolean z7) {
        this.f18040A = z7;
    }

    public void setTextAppearance(int i7) {
        androidx.core.widget.j.r(this.f18043D, i7);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f18043D.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f18043D.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f18042C = true;
        a aVar = new a();
        this.f18049J = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C1752h.f12902c, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C1748d.f12806d));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C1750f.f12876f);
        this.f18043D = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        Z.n0(checkedTextView, aVar);
    }
}
