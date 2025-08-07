package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import c4.C1746b;
import c4.C1754j;
import c4.C1755k;
import com.google.android.material.internal.p;
import h.C2473a;
import u4.h;
import u4.k;
import u4.n;
import x4.C2990a;

public class MaterialCardView extends CardView implements Checkable, n {

    private static final int[] f17499G = {R.attr.state_checkable};

    private static final int[] f17500H = {R.attr.state_checked};

    private static final int[] f17501I = {C1746b.f12728X};

    private static final int f17502J = C1754j.f12963p;

    private final b f17503C;

    private boolean f17504D;

    private boolean f17505E;

    private boolean f17506F;

    public interface a {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1746b.f12762y);
    }

    private void f() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f17503C.k();
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f17503C.l().getBounds());
        return rectF;
    }

    public boolean g() {
        b bVar = this.f17503C;
        return bVar != null && bVar.F();
    }

    @Override
    public ColorStateList getCardBackgroundColor() {
        return this.f17503C.m();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f17503C.n();
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f17503C.o();
    }

    public int getCheckedIconGravity() {
        return this.f17503C.p();
    }

    public int getCheckedIconMargin() {
        return this.f17503C.q();
    }

    public int getCheckedIconSize() {
        return this.f17503C.r();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f17503C.s();
    }

    @Override
    public int getContentPaddingBottom() {
        return this.f17503C.C().bottom;
    }

    @Override
    public int getContentPaddingLeft() {
        return this.f17503C.C().left;
    }

    @Override
    public int getContentPaddingRight() {
        return this.f17503C.C().right;
    }

    @Override
    public int getContentPaddingTop() {
        return this.f17503C.C().top;
    }

    public float getProgress() {
        return this.f17503C.w();
    }

    @Override
    public float getRadius() {
        return this.f17503C.u();
    }

    public ColorStateList getRippleColor() {
        return this.f17503C.x();
    }

    public k getShapeAppearanceModel() {
        return this.f17503C.y();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f17503C.z();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f17503C.A();
    }

    public int getStrokeWidth() {
        return this.f17503C.B();
    }

    public boolean h() {
        return this.f17506F;
    }

    void i(int i7, int i8, int i9, int i10) {
        super.d(i7, i8, i9, i10);
    }

    @Override
    public boolean isChecked() {
        return this.f17505E;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17503C.g0();
        h.f(this, this.f17503C.l());
    }

    @Override
    protected int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 3);
        if (g()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f17499G);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f17500H);
        }
        if (h()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f17501I);
        }
        return iArrOnCreateDrawableState;
    }

    @Override
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        this.f17503C.K(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f17504D) {
            if (!this.f17503C.E()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f17503C.L(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override
    public void setCardBackgroundColor(int i7) {
        this.f17503C.M(ColorStateList.valueOf(i7));
    }

    @Override
    public void setCardElevation(float f7) {
        super.setCardElevation(f7);
        this.f17503C.i0();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f17503C.N(colorStateList);
    }

    public void setCheckable(boolean z7) {
        this.f17503C.O(z7);
    }

    @Override
    public void setChecked(boolean z7) {
        if (this.f17505E != z7) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f17503C.R(drawable);
    }

    public void setCheckedIconGravity(int i7) {
        if (this.f17503C.p() != i7) {
            this.f17503C.S(i7);
        }
    }

    public void setCheckedIconMargin(int i7) {
        this.f17503C.T(i7);
    }

    public void setCheckedIconMarginResource(int i7) {
        if (i7 != -1) {
            this.f17503C.T(getResources().getDimensionPixelSize(i7));
        }
    }

    public void setCheckedIconResource(int i7) {
        this.f17503C.R(C2473a.b(getContext(), i7));
    }

    public void setCheckedIconSize(int i7) {
        this.f17503C.U(i7);
    }

    public void setCheckedIconSizeResource(int i7) {
        if (i7 != 0) {
            this.f17503C.U(getResources().getDimensionPixelSize(i7));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f17503C.V(colorStateList);
    }

    @Override
    public void setClickable(boolean z7) {
        super.setClickable(z7);
        b bVar = this.f17503C;
        if (bVar != null) {
            bVar.g0();
        }
    }

    public void setDragged(boolean z7) {
        if (this.f17506F != z7) {
            this.f17506F = z7;
            refreshDrawableState();
            f();
            invalidate();
        }
    }

    @Override
    public void setMaxCardElevation(float f7) {
        super.setMaxCardElevation(f7);
        this.f17503C.k0();
    }

    public void setOnCheckedChangeListener(a aVar) {
    }

    @Override
    public void setPreventCornerOverlap(boolean z7) {
        super.setPreventCornerOverlap(z7);
        this.f17503C.k0();
        this.f17503C.h0();
    }

    public void setProgress(float f7) {
        this.f17503C.X(f7);
    }

    @Override
    public void setRadius(float f7) {
        super.setRadius(f7);
        this.f17503C.W(f7);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f17503C.Y(colorStateList);
    }

    public void setRippleColorResource(int i7) {
        this.f17503C.Y(C2473a.a(getContext(), i7));
    }

    @Override
    public void setShapeAppearanceModel(k kVar) {
        setClipToOutline(kVar.u(getBoundsAsRectF()));
        this.f17503C.Z(kVar);
    }

    public void setStrokeColor(int i7) {
        setStrokeColor(ColorStateList.valueOf(i7));
    }

    public void setStrokeWidth(int i7) {
        this.f17503C.b0(i7);
        invalidate();
    }

    @Override
    public void setUseCompatPadding(boolean z7) {
        super.setUseCompatPadding(z7);
        this.f17503C.k0();
        this.f17503C.h0();
    }

    @Override
    public void toggle() {
        if (g() && isEnabled()) {
            this.f17505E = !this.f17505E;
            refreshDrawableState();
            f();
            this.f17503C.Q(this.f17505E, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f17502J;
        super(C2990a.c(context, attributeSet, i7, i8), attributeSet, i7);
        this.f17505E = false;
        this.f17506F = false;
        this.f17504D = true;
        TypedArray typedArrayI = p.i(getContext(), attributeSet, C1755k.f12977A3, i7, i8, new int[0]);
        b bVar = new b(this, attributeSet, i7, i8);
        this.f17503C = bVar;
        bVar.M(super.getCardBackgroundColor());
        bVar.c0(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        bVar.J(typedArrayI);
        typedArrayI.recycle();
    }

    @Override
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f17503C.M(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f17503C.a0(colorStateList);
        invalidate();
    }
}
