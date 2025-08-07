package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.FN.krlBPZZeK;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.Z;
import c4.C1746b;
import c4.C1753i;
import c4.C1754j;
import c4.C1755k;
import com.github.luben.zstd.BuildConfig;
import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;
import com.google.android.material.chip.a;
import com.google.android.material.internal.j;
import com.google.android.material.internal.p;
import com.google.android.material.internal.s;
import d4.C2395h;
import java.util.List;
import r4.C2755d;
import r4.f;
import s4.C2884b;
import u4.h;
import u4.k;
import u4.n;
import x4.C2990a;
import y0.C3019t;

public class Chip extends AppCompatCheckBox implements a.InterfaceC0155a, n, Checkable {

    private static final int f17631L = C1754j.f12965r;

    private static final Rect f17632M = new Rect();

    private static final int[] f17633N = {R.attr.state_selected};

    private static final int[] f17634O = {R.attr.state_checkable};

    private boolean f17635A;

    private boolean f17636B;

    private boolean f17637C;

    private int f17638D;

    private int f17639E;

    private CharSequence f17640F;

    private final c f17641G;

    private boolean f17642H;

    private final Rect f17643I;

    private final RectF f17644J;

    private final f f17645K;

    private com.google.android.material.chip.a f17646d;

    private InsetDrawable f17647e;

    private RippleDrawable f17648i;

    private View.OnClickListener f17649v;

    private CompoundButton.OnCheckedChangeListener f17650w;

    private boolean f17651y;

    private boolean f17652z;

    class a extends f {
        a() {
        }

        @Override
        public void a(int i7) {
        }

        @Override
        public void b(Typeface typeface, boolean z7) {
            Chip chip = Chip.this;
            chip.setText(chip.f17646d.P2() ? Chip.this.f17646d.k1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f17646d != null) {
                Chip.this.f17646d.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends H0.a {
        c(Chip chip) {
            super(chip);
        }

        @Override
        protected int B(float f7, float f8) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f7, f8)) ? 1 : 0;
        }

        @Override
        protected void C(List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f17649v != null) {
                list.add(1);
            }
        }

        @Override
        protected boolean J(int i7, int i8, Bundle bundle) {
            if (i8 != 16) {
                return false;
            }
            if (i7 == 0) {
                return Chip.this.performClick();
            }
            if (i7 == 1) {
                return Chip.this.u();
            }
            return false;
        }

        @Override
        protected void M(C3019t c3019t) {
            c3019t.c0(Chip.this.r());
            c3019t.f0(Chip.this.isClickable());
            c3019t.e0(Chip.this.getAccessibilityClassName());
            c3019t.B0(Chip.this.getText());
        }

        @Override
        protected void N(int i7, C3019t c3019t) {
            CharSequence charSequence = BuildConfig.FLAVOR;
            if (i7 != 1) {
                c3019t.i0(BuildConfig.FLAVOR);
                c3019t.Z(Chip.f17632M);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                c3019t.i0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                int i8 = C1753i.f12932k;
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                c3019t.i0(context.getString(i8, charSequence).trim());
            }
            c3019t.Z(Chip.this.getCloseIconTouchBoundsInt());
            c3019t.b(C3019t.a.f24389i);
            c3019t.k0(Chip.this.isEnabled());
        }

        @Override
        protected void O(int i7, boolean z7) {
            if (i7 == 1) {
                Chip.this.f17636B = z7;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1746b.f12737d);
    }

    private void A() {
        this.f17648i = new RippleDrawable(C2884b.a(this.f17646d.i1()), getBackgroundDrawable(), null);
        this.f17646d.O2(false);
        Z.r0(this, this.f17648i);
        B();
    }

    private void B() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f17646d) == null) {
            return;
        }
        int iM0 = (int) (aVar.M0() + this.f17646d.m1() + this.f17646d.t0());
        int iR0 = (int) (this.f17646d.R0() + this.f17646d.n1() + this.f17646d.p0());
        if (this.f17647e != null) {
            Rect rect = new Rect();
            this.f17647e.getPadding(rect);
            iR0 += rect.left;
            iM0 += rect.right;
        }
        Z.C0(this, iR0, getPaddingTop(), iM0, getPaddingBottom());
    }

    private void C() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C2755d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f17645K);
        }
    }

    private void D(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", jUbDmI.PpmZ);
        }
    }

    public RectF getCloseIconTouchBounds() {
        this.f17644J.setEmpty();
        if (n() && this.f17649v != null) {
            this.f17646d.b1(this.f17644J);
        }
        return this.f17644J;
    }

    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f17643I.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f17643I;
    }

    private C2755d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.l1();
        }
        return null;
    }

    private void j(com.google.android.material.chip.a aVar) {
        aVar.s2(this);
    }

    private int[] k() {
        ?? IsEnabled = isEnabled();
        int i7 = IsEnabled;
        if (this.f17636B) {
            i7 = IsEnabled + 1;
        }
        int i8 = i7;
        if (this.f17635A) {
            i8 = i7 + 1;
        }
        int i9 = i8;
        if (this.f17652z) {
            i9 = i8 + 1;
        }
        int i10 = i9;
        if (isChecked()) {
            i10 = i9 + 1;
        }
        int[] iArr = new int[i10];
        int i11 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i11 = 1;
        }
        if (this.f17636B) {
            iArr[i11] = 16842908;
            i11++;
        }
        if (this.f17635A) {
            iArr[i11] = 16843623;
            i11++;
        }
        if (this.f17652z) {
            iArr[i11] = 16842919;
            i11++;
        }
        if (isChecked()) {
            iArr[i11] = 16842913;
        }
        return iArr;
    }

    private void m() {
        if (getBackgroundDrawable() == this.f17647e && this.f17646d.getCallback() == null) {
            this.f17646d.setCallback(this.f17647e);
        }
    }

    public boolean n() {
        com.google.android.material.chip.a aVar = this.f17646d;
        return (aVar == null || aVar.U0() == null) ? false : true;
    }

    private void o(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayI = p.i(context, attributeSet, C1755k.f13230o0, i7, f17631L, new int[0]);
        this.f17637C = typedArrayI.getBoolean(C1755k.U0, false);
        this.f17639E = (int) Math.ceil(typedArrayI.getDimension(C1755k.f13022I0, (float) Math.ceil(s.d(getContext(), 48))));
        typedArrayI.recycle();
    }

    private void p() {
        setOutlineProvider(new b());
    }

    private void q(int i7, int i8, int i9, int i10) {
        this.f17647e = new InsetDrawable((Drawable) this.f17646d, i7, i8, i9, i10);
    }

    private void setCloseIconHovered(boolean z7) {
        if (this.f17635A != z7) {
            this.f17635A = z7;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z7) {
        if (this.f17652z != z7) {
            this.f17652z = z7;
            refreshDrawableState();
        }
    }

    public void t(CompoundButton compoundButton, boolean z7) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f17650w;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z7);
        }
    }

    private void v() {
        if (this.f17647e != null) {
            this.f17647e = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            z();
        }
    }

    private void x(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.s2(null);
        }
    }

    private void y() {
        if (n() && s() && this.f17649v != null) {
            Z.n0(this, this.f17641G);
            this.f17642H = true;
        } else {
            Z.n0(this, null);
            this.f17642H = false;
        }
    }

    private void z() {
        if (C2884b.f23671a) {
            A();
            return;
        }
        this.f17646d.O2(true);
        Z.r0(this, getBackgroundDrawable());
        B();
        m();
    }

    @Override
    public void a() {
        l(this.f17639E);
        requestLayout();
        invalidateOutline();
    }

    @Override
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f17642H ? super.dispatchHoverEvent(motionEvent) : this.f17641G.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f17642H) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f17641G.w(keyEvent) || this.f17641G.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f17646d;
        if ((aVar == null || !aVar.s1()) ? false : this.f17646d.o2(k())) {
            invalidate();
        }
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f17640F)) {
            return this.f17640F;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof com.google.android.material.chip.b) && ((com.google.android.material.chip.b) parent).f()) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f17647e;
        return insetDrawable == null ? this.f17646d : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.I0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.K0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return Math.max(0.0f, aVar.L0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f17646d;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.M0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.N0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.O0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.P0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.Q0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.R0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.S0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.T0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.U0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.V0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.W0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.X0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.Y0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    @Override
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.e1();
        }
        return null;
    }

    @Override
    public void getFocusedRect(Rect rect) {
        if (this.f17642H && (this.f17641G.A() == 1 || this.f17641G.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C2395h getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.f1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.g1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.h1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.i1();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f17646d.E();
    }

    public C2395h getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.j1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.m1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            return aVar.n1();
        }
        return 0.0f;
    }

    public boolean l(int i7) {
        this.f17639E = i7;
        if (!w()) {
            if (this.f17647e != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int iMax = Math.max(0, i7 - this.f17646d.getIntrinsicHeight());
        int iMax2 = Math.max(0, i7 - this.f17646d.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f17647e != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int i8 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i9 = iMax > 0 ? iMax / 2 : 0;
        if (this.f17647e != null) {
            Rect rect = new Rect();
            this.f17647e.getPadding(rect);
            if (rect.top == i9 && rect.bottom == i9 && rect.left == i8 && rect.right == i8) {
                z();
                return true;
            }
        }
        if (getMinHeight() != i7) {
            setMinHeight(i7);
        }
        if (getMinWidth() != i7) {
            setMinWidth(i7);
        }
        q(i8, i9, i8, i9);
        z();
        return true;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.f17646d);
    }

    @Override
    protected int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f17633N);
        }
        if (r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f17634O);
        }
        return iArrOnCreateDrawableState;
    }

    @Override
    protected void onFocusChanged(boolean z7, int i7, Rect rect) {
        super.onFocusChanged(z7, i7, rect);
        if (this.f17642H) {
            this.f17641G.I(z7, i7, rect);
        }
    }

    @Override
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof com.google.android.material.chip.b) {
            com.google.android.material.chip.b bVar = (com.google.android.material.chip.b) getParent();
            C3019t.F0(accessibilityNodeInfo).h0(C3019t.f.a(bVar.b(this), 1, bVar.c() ? bVar.d(this) : -1, 1, false, isChecked()));
        }
    }

    @Override
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i7) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i7);
    }

    @Override
    public void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        if (this.f17638D != i7) {
            this.f17638D = i7;
            B();
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f17646d;
        return aVar != null && aVar.r1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f17646d;
        return aVar != null && aVar.t1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f17640F = charSequence;
    }

    @Override
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f17648i) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f17648i) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override
    public void setBackgroundResource(int i7) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.A1(z7);
        }
    }

    public void setCheckableResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.B1(i7);
        }
    }

    @Override
    public void setChecked(boolean z7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar == null) {
            this.f17651y = z7;
        } else if (aVar.r1()) {
            super.setChecked(z7);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.C1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z7) {
        setCheckedIconVisible(z7);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i7) {
        setCheckedIconVisible(i7);
    }

    public void setCheckedIconResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.D1(i7);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.E1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.F1(i7);
        }
    }

    public void setCheckedIconVisible(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.G1(i7);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.I1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.J1(i7);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.K1(f7);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.L1(i7);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f17646d;
        if (aVar2 != aVar) {
            x(aVar2);
            this.f17646d = aVar;
            aVar.D2(false);
            j(this.f17646d);
            l(this.f17639E);
        }
    }

    public void setChipEndPadding(float f7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.M1(f7);
        }
    }

    public void setChipEndPaddingResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.N1(i7);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.O1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z7) {
        setChipIconVisible(z7);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i7) {
        setChipIconVisible(i7);
    }

    public void setChipIconResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.P1(i7);
        }
    }

    public void setChipIconSize(float f7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.Q1(f7);
        }
    }

    public void setChipIconSizeResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.R1(i7);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.S1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.T1(i7);
        }
    }

    public void setChipIconVisible(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.U1(i7);
        }
    }

    public void setChipMinHeight(float f7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.W1(f7);
        }
    }

    public void setChipMinHeightResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.X1(i7);
        }
    }

    public void setChipStartPadding(float f7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.Y1(f7);
        }
    }

    public void setChipStartPaddingResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.Z1(i7);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.a2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.b2(i7);
        }
    }

    public void setChipStrokeWidth(float f7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.c2(f7);
        }
    }

    public void setChipStrokeWidthResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.d2(i7);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i7) {
        setText(getResources().getString(i7));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.f2(drawable);
        }
        y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.g2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z7) {
        setCloseIconVisible(z7);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i7) {
        setCloseIconVisible(i7);
    }

    public void setCloseIconEndPadding(float f7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.h2(f7);
        }
    }

    public void setCloseIconEndPaddingResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.i2(i7);
        }
    }

    public void setCloseIconResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.j2(i7);
        }
        y();
    }

    public void setCloseIconSize(float f7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.k2(f7);
        }
    }

    public void setCloseIconSizeResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.l2(i7);
        }
    }

    public void setCloseIconStartPadding(float f7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.m2(f7);
        }
    }

    public void setCloseIconStartPaddingResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.n2(i7);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.p2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.q2(i7);
        }
    }

    public void setCloseIconVisible(int i7) {
        setCloseIconVisible(getResources().getBoolean(i7));
    }

    @Override
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        if (i7 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i7, i8, i9, i10);
    }

    @Override
    public void setCompoundDrawablesWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        if (i7 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i7, i8, i9, i10);
    }

    @Override
    public void setElevation(float f7) {
        super.setElevation(f7);
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.Z(f7);
        }
    }

    @Override
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f17646d == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.t2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z7) {
        this.f17637C = z7;
        l(this.f17639E);
    }

    @Override
    public void setGravity(int i7) {
        if (i7 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i7);
        }
    }

    public void setHideMotionSpec(C2395h c2395h) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.u2(c2395h);
        }
    }

    public void setHideMotionSpecResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.v2(i7);
        }
    }

    public void setIconEndPadding(float f7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.w2(f7);
        }
    }

    public void setIconEndPaddingResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.x2(i7);
        }
    }

    public void setIconStartPadding(float f7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.y2(f7);
        }
    }

    public void setIconStartPaddingResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.z2(i7);
        }
    }

    public void setInternalOnCheckedChangeListener(j<Chip> jVar) {
    }

    @Override
    public void setLayoutDirection(int i7) {
        if (this.f17646d == null) {
            return;
        }
        super.setLayoutDirection(i7);
    }

    @Override
    public void setLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i7);
    }

    @Override
    public void setMaxLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i7);
    }

    @Override
    public void setMaxWidth(int i7) {
        super.setMaxWidth(i7);
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.A2(i7);
        }
    }

    @Override
    public void setMinLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i7);
    }

    @Override
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f17650w = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f17649v = onClickListener;
        y();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.B2(colorStateList);
        }
        if (this.f17646d.p1()) {
            return;
        }
        A();
    }

    public void setRippleColorResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.C2(i7);
            if (this.f17646d.p1()) {
                return;
            }
            A();
        }
    }

    @Override
    public void setShapeAppearanceModel(k kVar) {
        this.f17646d.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C2395h c2395h) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.E2(c2395h);
        }
    }

    public void setShowMotionSpecResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.F2(i7);
        }
    }

    @Override
    public void setSingleLine(boolean z7) {
        if (!z7) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z7);
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        super.setText(aVar.P2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f17646d;
        if (aVar2 != null) {
            aVar2.G2(charSequence);
        }
    }

    public void setTextAppearance(C2755d c2755d) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.H2(c2755d);
        }
        C();
    }

    public void setTextAppearanceResource(int i7) {
        setTextAppearance(getContext(), i7);
    }

    public void setTextEndPadding(float f7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.J2(f7);
        }
    }

    public void setTextEndPaddingResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.K2(i7);
        }
    }

    @Override
    public void setTextSize(int i7, float f7) {
        super.setTextSize(i7, f7);
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.L2(TypedValue.applyDimension(i7, f7, getResources().getDisplayMetrics()));
        }
        C();
    }

    public void setTextStartPadding(float f7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.M2(f7);
        }
    }

    public void setTextStartPaddingResource(int i7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.N2(i7);
        }
    }

    public boolean u() {
        boolean z7 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f17649v;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z7 = true;
        }
        if (this.f17642H) {
            this.f17641G.U(1, 1);
        }
        return z7;
    }

    public boolean w() {
        return this.f17637C;
    }

    public Chip(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f17631L;
        super(C2990a.c(context, attributeSet, i7, i8), attributeSet, i7);
        this.f17643I = new Rect();
        this.f17644J = new RectF();
        this.f17645K = new a();
        Context context2 = getContext();
        D(attributeSet);
        com.google.android.material.chip.a aVarY0 = com.google.android.material.chip.a.y0(context2, attributeSet, i7, i8);
        o(context2, attributeSet, i7);
        setChipDrawable(aVarY0);
        aVarY0.Z(Z.u(this));
        TypedArray typedArrayI = p.i(context2, attributeSet, C1755k.f13230o0, i7, i8, new int[0]);
        boolean zHasValue = typedArrayI.hasValue(C1755k.f13120Z0);
        typedArrayI.recycle();
        this.f17641G = new c(this);
        y();
        if (!zHasValue) {
            p();
        }
        setChecked(this.f17651y);
        setText(aVarY0.k1());
        setEllipsize(aVarY0.e1());
        C();
        if (!this.f17646d.P2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        B();
        if (w()) {
            setMinHeight(this.f17639E);
        }
        this.f17638D = Z.z(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                this.f21039a.t(compoundButton, z7);
            }
        });
    }

    public void setCloseIconVisible(boolean z7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.r2(z7);
        }
        y();
    }

    public void setCheckedIconVisible(boolean z7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.H1(z7);
        }
    }

    public void setChipIconVisible(boolean z7) {
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.V1(z7);
        }
    }

    @Override
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException(krlBPZZeK.NkUREPEsn);
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.I2(i7);
        }
        C();
    }

    @Override
    public void setTextAppearance(int i7) {
        super.setTextAppearance(i7);
        com.google.android.material.chip.a aVar = this.f17646d;
        if (aVar != null) {
            aVar.I2(i7);
        }
        C();
    }
}
