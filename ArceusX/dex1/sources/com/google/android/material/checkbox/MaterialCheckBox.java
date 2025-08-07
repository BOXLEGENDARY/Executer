package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.TintTypedArray;
import c4.C1746b;
import c4.C1749e;
import c4.C1750f;
import c4.C1753i;
import c4.C1754j;
import c4.C1755k;
import com.google.android.material.drawable.d;
import com.google.android.material.internal.p;
import com.google.android.material.internal.s;
import h.C2473a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k4.C2517a;
import q0.C2731a;
import r4.C2754c;
import x4.C2990a;

public class MaterialCheckBox extends AppCompatCheckBox {

    private static final int f17604N = C1754j.f12967t;

    private static final int[] f17605O = {C1746b.f12730Z};

    private static final int[] f17606P;

    private static final int[][] f17607Q;

    private static final int f17608R;

    private Drawable f17609A;

    private Drawable f17610B;

    private boolean f17611C;

    ColorStateList f17612D;

    ColorStateList f17613E;

    private PorterDuff.Mode f17614F;

    private int f17615G;

    private int[] f17616H;

    private boolean f17617I;

    private CharSequence f17618J;

    private CompoundButton.OnCheckedChangeListener f17619K;

    private final androidx.vectordrawable.graphics.drawable.c f17620L;

    private final androidx.vectordrawable.graphics.drawable.b f17621M;

    private final LinkedHashSet<c> f17622d;

    private final LinkedHashSet<b> f17623e;

    private ColorStateList f17624i;

    private boolean f17625v;

    private boolean f17626w;

    private boolean f17627y;

    private CharSequence f17628z;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        int f17629d;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }
        }

        SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        private String a() {
            int i7 = this.f17629d;
            return i7 != 1 ? i7 != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeValue(Integer.valueOf(this.f17629d));
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f17629d = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    class a extends androidx.vectordrawable.graphics.drawable.b {
        a() {
        }

        @Override
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f17612D;
            if (colorStateList != null) {
                C2731a.o(drawable, colorStateList);
            }
        }

        @Override
        public void c(Drawable drawable) {
            super.c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f17612D;
            if (colorStateList != null) {
                C2731a.n(drawable, colorStateList.getColorForState(materialCheckBox.f17616H, MaterialCheckBox.this.f17612D.getDefaultColor()));
            }
        }
    }

    public interface b {
        void a(MaterialCheckBox materialCheckBox, int i7);
    }

    public interface c {
        void a(MaterialCheckBox materialCheckBox, boolean z7);
    }

    static {
        int i7 = C1746b.f12729Y;
        f17606P = new int[]{i7};
        f17607Q = new int[][]{new int[]{R.attr.state_enabled, i7}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f17608R = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1746b.f12735c);
    }

    private boolean d(TintTypedArray tintTypedArray) {
        return tintTypedArray.getResourceId(C1755k.f13046M3, 0) == f17608R && tintTypedArray.getResourceId(C1755k.f13052N3, 0) == 0;
    }

    private void f() {
        this.f17609A = d.d(this.f17609A, this.f17612D, androidx.core.widget.d.c(this));
        this.f17610B = d.d(this.f17610B, this.f17613E, this.f17614F);
        h();
        i();
        super.setButtonDrawable(d.a(this.f17609A, this.f17610B));
        refreshDrawableState();
    }

    private void g() {
        if (Build.VERSION.SDK_INT < 30 || this.f17618J != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private String getButtonStateDescription() {
        int i7 = this.f17615G;
        return i7 == 1 ? getResources().getString(C1753i.f12929h) : i7 == 0 ? getResources().getString(C1753i.f12931j) : getResources().getString(C1753i.f12930i);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f17624i == null) {
            int[][] iArr = f17607Q;
            int[] iArr2 = new int[iArr.length];
            int iD = C2517a.d(this, C1746b.f12741f);
            int iD2 = C2517a.d(this, C1746b.f12745h);
            int iD3 = C2517a.d(this, C1746b.f12751n);
            int iD4 = C2517a.d(this, C1746b.f12746i);
            iArr2[0] = C2517a.j(iD3, iD2, 1.0f);
            iArr2[1] = C2517a.j(iD3, iD, 1.0f);
            iArr2[2] = C2517a.j(iD3, iD4, 0.54f);
            iArr2[3] = C2517a.j(iD3, iD4, 0.38f);
            iArr2[4] = C2517a.j(iD3, iD4, 0.38f);
            this.f17624i = new ColorStateList(iArr, iArr2);
        }
        return this.f17624i;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f17612D;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void h() {
        androidx.vectordrawable.graphics.drawable.c cVar;
        if (this.f17611C) {
            androidx.vectordrawable.graphics.drawable.c cVar2 = this.f17620L;
            if (cVar2 != null) {
                cVar2.f(this.f17621M);
                this.f17620L.b(this.f17621M);
            }
            Drawable drawable = this.f17609A;
            if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f17620L) == null) {
                return;
            }
            int i7 = C1750f.f12872b;
            int i8 = C1750f.f12870T;
            ((AnimatedStateListDrawable) drawable).addTransition(i7, i8, cVar, false);
            ((AnimatedStateListDrawable) this.f17609A).addTransition(C1750f.f12878h, i8, this.f17620L, false);
        }
    }

    private void i() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f17609A;
        if (drawable != null && (colorStateList2 = this.f17612D) != null) {
            C2731a.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f17610B;
        if (drawable2 == null || (colorStateList = this.f17613E) == null) {
            return;
        }
        C2731a.o(drawable2, colorStateList);
    }

    private void j() {
    }

    public void c(b bVar) {
        this.f17623e.add(bVar);
    }

    public boolean e() {
        return this.f17627y;
    }

    @Override
    public Drawable getButtonDrawable() {
        return this.f17609A;
    }

    public Drawable getButtonIconDrawable() {
        return this.f17610B;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f17613E;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f17614F;
    }

    @Override
    public ColorStateList getButtonTintList() {
        return this.f17612D;
    }

    public int getCheckedState() {
        return this.f17615G;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f17628z;
    }

    @Override
    public boolean isChecked() {
        return this.f17615G == 1;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17625v && this.f17612D == null && this.f17613E == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override
    protected int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f17605O);
        }
        if (e()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f17606P);
        }
        this.f17616H = d.f(iArrOnCreateDrawableState);
        j();
        return iArrOnCreateDrawableState;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f17626w || !TextUtils.isEmpty(getText()) || (drawableA = androidx.core.widget.d.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (s.h(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            C2731a.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && e()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f17628z));
        }
    }

    @Override
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f17629d);
    }

    @Override
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f17629d = getCheckedState();
        return savedState;
    }

    @Override
    public void setButtonDrawable(int i7) {
        setButtonDrawable(C2473a.b(getContext(), i7));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f17610B = drawable;
        f();
    }

    public void setButtonIconDrawableResource(int i7) {
        setButtonIconDrawable(C2473a.b(getContext(), i7));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f17613E == colorStateList) {
            return;
        }
        this.f17613E = colorStateList;
        f();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f17614F == mode) {
            return;
        }
        this.f17614F = mode;
        f();
    }

    @Override
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f17612D == colorStateList) {
            return;
        }
        this.f17612D = colorStateList;
        f();
    }

    @Override
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        f();
    }

    public void setCenterIfNoTextEnabled(boolean z7) {
        this.f17626w = z7;
    }

    @Override
    public void setChecked(boolean z7) {
        setCheckedState(z7 ? 1 : 0);
    }

    public void setCheckedState(int i7) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f17615G != i7) {
            this.f17615G = i7;
            super.setChecked(i7 == 1);
            refreshDrawableState();
            g();
            if (this.f17617I) {
                return;
            }
            this.f17617I = true;
            LinkedHashSet<b> linkedHashSet = this.f17623e;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.f17615G);
                }
            }
            if (this.f17615G != 2 && (onCheckedChangeListener = this.f17619K) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f17617I = false;
        }
    }

    @Override
    public void setEnabled(boolean z7) {
        super.setEnabled(z7);
        j();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f17628z = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i7) {
        setErrorAccessibilityLabel(i7 != 0 ? getResources().getText(i7) : null);
    }

    public void setErrorShown(boolean z7) {
        if (this.f17627y == z7) {
            return;
        }
        this.f17627y = z7;
        refreshDrawableState();
        Iterator<c> it = this.f17622d.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f17627y);
        }
    }

    @Override
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f17619K = onCheckedChangeListener;
    }

    @Override
    public void setStateDescription(CharSequence charSequence) {
        this.f17618J = charSequence;
        if (charSequence == null) {
            g();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z7) {
        this.f17625v = z7;
        if (z7) {
            androidx.core.widget.d.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.d.d(this, null);
        }
    }

    @Override
    public void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f17604N;
        super(C2990a.c(context, attributeSet, i7, i8), attributeSet, i7);
        this.f17622d = new LinkedHashSet<>();
        this.f17623e = new LinkedHashSet<>();
        this.f17620L = androidx.vectordrawable.graphics.drawable.c.a(getContext(), C1749e.f12845h);
        this.f17621M = new a();
        Context context2 = getContext();
        this.f17609A = androidx.core.widget.d.a(this);
        this.f17612D = getSuperButtonTintList();
        setSupportButtonTintList(null);
        TintTypedArray tintTypedArrayJ = p.j(context2, attributeSet, C1755k.f13040L3, i7, i8, new int[0]);
        this.f17610B = tintTypedArrayJ.getDrawable(C1755k.f13058O3);
        if (this.f17609A != null && p.g(context2) && d(tintTypedArrayJ)) {
            super.setButtonDrawable((Drawable) null);
            this.f17609A = C2473a.b(context2, C1749e.f12844g);
            this.f17611C = true;
            if (this.f17610B == null) {
                this.f17610B = C2473a.b(context2, C1749e.f12846i);
            }
        }
        this.f17613E = C2754c.b(context2, tintTypedArrayJ, C1755k.f13064P3);
        this.f17614F = s.j(tintTypedArrayJ.getInt(C1755k.f13070Q3, -1), PorterDuff.Mode.SRC_IN);
        this.f17625v = tintTypedArrayJ.getBoolean(C1755k.f13097V3, false);
        this.f17626w = tintTypedArrayJ.getBoolean(C1755k.f13076R3, true);
        this.f17627y = tintTypedArrayJ.getBoolean(C1755k.f13092U3, false);
        this.f17628z = tintTypedArrayJ.getText(C1755k.f13087T3);
        int i9 = C1755k.f13082S3;
        if (tintTypedArrayJ.hasValue(i9)) {
            setCheckedState(tintTypedArrayJ.getInt(i9, 0));
        }
        tintTypedArrayJ.recycle();
        f();
    }

    @Override
    public void setButtonDrawable(Drawable drawable) {
        this.f17609A = drawable;
        this.f17611C = false;
        f();
    }
}
