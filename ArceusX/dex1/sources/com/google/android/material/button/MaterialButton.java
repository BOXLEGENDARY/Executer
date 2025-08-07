package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.Z;
import androidx.core.widget.j;
import androidx.customview.view.AbsSavedState;
import c4.C1746b;
import c4.C1754j;
import c4.C1755k;
import com.google.android.material.internal.p;
import com.google.android.material.internal.s;
import h.C2473a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q0.C2731a;
import r4.C2754c;
import u4.h;
import u4.k;
import u4.n;
import x4.C2990a;

public class MaterialButton extends AppCompatButton implements Checkable, n {

    private static final int[] f17440H = {R.attr.state_checkable};

    private static final int[] f17441I = {R.attr.state_checked};

    private static final int f17442J = C1754j.f12962o;

    private int f17443A;

    private int f17444B;

    private int f17445C;

    private int f17446D;

    private boolean f17447E;

    private boolean f17448F;

    private int f17449G;

    private final com.google.android.material.button.a f17450d;

    private final LinkedHashSet<a> f17451e;

    private b f17452i;

    private PorterDuff.Mode f17453v;

    private ColorStateList f17454w;

    private Drawable f17455y;

    private String f17456z;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        boolean f17457d;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(Parcel parcel) {
            this.f17457d = parcel.readInt() == 1;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f17457d ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            a(parcel);
        }
    }

    public interface a {
        void a(MaterialButton materialButton, boolean z7);
    }

    interface b {
        void a(MaterialButton materialButton, boolean z7);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    private boolean b() {
        int i7 = this.f17449G;
        return i7 == 3 || i7 == 4;
    }

    private boolean c() {
        int i7 = this.f17449G;
        return i7 == 1 || i7 == 2;
    }

    private boolean d() {
        int i7 = this.f17449G;
        return i7 == 16 || i7 == 32;
    }

    private boolean e() {
        return Z.z(this) == 1;
    }

    private boolean f() {
        com.google.android.material.button.a aVar = this.f17450d;
        return (aVar == null || aVar.o()) ? false : true;
    }

    private void g() {
        if (c()) {
            j.m(this, this.f17455y, null, null, null);
        } else if (b()) {
            j.m(this, null, null, this.f17455y, null);
        } else if (d()) {
            j.m(this, null, this.f17455y, null, null);
        }
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i7 = 0; i7 < lineCount; i7++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i7));
        }
        return (int) Math.ceil(fMax);
    }

    private void h(boolean z7) {
        Drawable drawable = this.f17455y;
        if (drawable != null) {
            Drawable drawableMutate = C2731a.r(drawable).mutate();
            this.f17455y = drawableMutate;
            C2731a.o(drawableMutate, this.f17454w);
            PorterDuff.Mode mode = this.f17453v;
            if (mode != null) {
                C2731a.p(this.f17455y, mode);
            }
            int intrinsicWidth = this.f17443A;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f17455y.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f17443A;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f17455y.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f17455y;
            int i7 = this.f17444B;
            int i8 = this.f17445C;
            drawable2.setBounds(i7, i8, intrinsicWidth + i7, intrinsicHeight + i8);
            this.f17455y.setVisible(true, z7);
        }
        if (z7) {
            g();
            return;
        }
        Drawable[] drawableArrD = j.d(this);
        Drawable drawable3 = drawableArrD[0];
        Drawable drawable4 = drawableArrD[1];
        Drawable drawable5 = drawableArrD[2];
        if ((!c() || drawable3 == this.f17455y) && ((!b() || drawable5 == this.f17455y) && (!d() || drawable4 == this.f17455y))) {
            return;
        }
        g();
    }

    private void i(int i7, int i8) {
        if (this.f17455y == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f17444B = 0;
                if (this.f17449G == 16) {
                    this.f17445C = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.f17443A;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f17455y.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i8 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f17446D) - getPaddingBottom()) / 2);
                if (this.f17445C != iMax) {
                    this.f17445C = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f17445C = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i9 = this.f17449G;
        if (i9 == 1 || i9 == 3 || ((i9 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i9 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f17444B = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.f17443A;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f17455y.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i7 - getTextLayoutWidth()) - Z.D(this)) - intrinsicWidth) - this.f17446D) - Z.E(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (e() != (this.f17449G == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f17444B != textLayoutWidth) {
            this.f17444B = textLayoutWidth;
            h(false);
        }
    }

    public boolean a() {
        com.google.android.material.button.a aVar = this.f17450d;
        return aVar != null && aVar.p();
    }

    String getA11yClassName() {
        if (TextUtils.isEmpty(this.f17456z)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f17456z;
    }

    @Override
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f17450d.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f17455y;
    }

    public int getIconGravity() {
        return this.f17449G;
    }

    public int getIconPadding() {
        return this.f17446D;
    }

    public int getIconSize() {
        return this.f17443A;
    }

    public ColorStateList getIconTint() {
        return this.f17454w;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f17453v;
    }

    public int getInsetBottom() {
        return this.f17450d.c();
    }

    public int getInsetTop() {
        return this.f17450d.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f17450d.h();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (f()) {
            return this.f17450d.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f17450d.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f17450d.k();
        }
        return 0;
    }

    @Override
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f17450d.l() : super.getSupportBackgroundTintList();
    }

    @Override
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f17450d.m() : super.getSupportBackgroundTintMode();
    }

    @Override
    public boolean isChecked() {
        return this.f17447E;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            h.f(this, this.f17450d.f());
        }
    }

    @Override
    protected int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f17440H);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f17441I);
        }
        return iArrOnCreateDrawableState;
    }

    @Override
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f17457d);
    }

    @Override
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f17457d = this.f17447E;
        return savedState;
    }

    @Override
    protected void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override
    public boolean performClick() {
        if (this.f17450d.q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f17455y != null) {
            if (this.f17455y.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    void setA11yClassName(String str) {
        this.f17456z = str;
    }

    @Override
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override
    public void setBackgroundColor(int i7) {
        if (f()) {
            this.f17450d.s(i7);
        } else {
            super.setBackgroundColor(i7);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        if (!f()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f17450d.t();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override
    public void setBackgroundResource(int i7) {
        setBackgroundDrawable(i7 != 0 ? C2473a.b(getContext(), i7) : null);
    }

    @Override
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z7) {
        if (f()) {
            this.f17450d.u(z7);
        }
    }

    @Override
    public void setChecked(boolean z7) {
        if (a() && isEnabled() && this.f17447E != z7) {
            this.f17447E = z7;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f17447E);
            }
            if (this.f17448F) {
                return;
            }
            this.f17448F = true;
            Iterator<a> it = this.f17451e.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.f17447E);
            }
            this.f17448F = false;
        }
    }

    public void setCornerRadius(int i7) {
        if (f()) {
            this.f17450d.v(i7);
        }
    }

    public void setCornerRadiusResource(int i7) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i7));
        }
    }

    @Override
    public void setElevation(float f7) {
        super.setElevation(f7);
        if (f()) {
            this.f17450d.f().Z(f7);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f17455y != drawable) {
            this.f17455y = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i7) {
        if (this.f17449G != i7) {
            this.f17449G = i7;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i7) {
        if (this.f17446D != i7) {
            this.f17446D = i7;
            setCompoundDrawablePadding(i7);
        }
    }

    public void setIconResource(int i7) {
        setIcon(i7 != 0 ? C2473a.b(getContext(), i7) : null);
    }

    public void setIconSize(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f17443A != i7) {
            this.f17443A = i7;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f17454w != colorStateList) {
            this.f17454w = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f17453v != mode) {
            this.f17453v = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i7) {
        setIconTint(C2473a.a(getContext(), i7));
    }

    public void setInsetBottom(int i7) {
        this.f17450d.w(i7);
    }

    public void setInsetTop(int i7) {
        this.f17450d.x(i7);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(b bVar) {
        this.f17452i = bVar;
    }

    @Override
    public void setPressed(boolean z7) {
        b bVar = this.f17452i;
        if (bVar != null) {
            bVar.a(this, z7);
        }
        super.setPressed(z7);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f17450d.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i7) {
        if (f()) {
            setRippleColor(C2473a.a(getContext(), i7));
        }
    }

    @Override
    public void setShapeAppearanceModel(k kVar) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f17450d.z(kVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z7) {
        if (f()) {
            this.f17450d.A(z7);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f17450d.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i7) {
        if (f()) {
            setStrokeColor(C2473a.a(getContext(), i7));
        }
    }

    public void setStrokeWidth(int i7) {
        if (f()) {
            this.f17450d.C(i7);
        }
    }

    public void setStrokeWidthResource(int i7) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i7));
        }
    }

    @Override
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f17450d.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f17450d.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override
    public void setTextAlignment(int i7) {
        super.setTextAlignment(i7);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z7) {
        this.f17450d.F(z7);
    }

    @Override
    public void toggle() {
        setChecked(!this.f17447E);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1746b.f12759v);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f17442J;
        super(C2990a.c(context, attributeSet, i7, i8), attributeSet, i7);
        this.f17451e = new LinkedHashSet<>();
        this.f17447E = false;
        this.f17448F = false;
        Context context2 = getContext();
        TypedArray typedArrayI = p.i(context2, attributeSet, C1755k.F2, i7, i8, new int[0]);
        this.f17446D = typedArrayI.getDimensionPixelSize(C1755k.S2, 0);
        this.f17453v = s.j(typedArrayI.getInt(C1755k.V2, -1), PorterDuff.Mode.SRC_IN);
        this.f17454w = C2754c.a(getContext(), typedArrayI, C1755k.U2);
        this.f17455y = C2754c.d(getContext(), typedArrayI, C1755k.Q2);
        this.f17449G = typedArrayI.getInteger(C1755k.R2, 1);
        this.f17443A = typedArrayI.getDimensionPixelSize(C1755k.T2, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, k.e(context2, attributeSet, i7, i8).m());
        this.f17450d = aVar;
        aVar.r(typedArrayI);
        typedArrayI.recycle();
        setCompoundDrawablePadding(this.f17446D);
        h(this.f17455y != null);
    }
}
