package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.d;
import c4.C1746b;
import c4.C1754j;
import c4.C1755k;
import com.google.android.material.internal.p;
import k4.C2517a;
import r4.C2754c;
import x4.C2990a;

public class MaterialRadioButton extends AppCompatRadioButton {

    private static final int f18282i = C1754j.f12968u;

    private static final int[][] f18283v = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    private ColorStateList f18284d;

    private boolean f18285e;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1746b.f12722R);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f18284d == null) {
            int iD = C2517a.d(this, C1746b.f12741f);
            int iD2 = C2517a.d(this, C1746b.f12746i);
            int iD3 = C2517a.d(this, C1746b.f12751n);
            int[][] iArr = f18283v;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C2517a.j(iD3, iD, 1.0f);
            iArr2[1] = C2517a.j(iD3, iD2, 0.54f);
            iArr2[2] = C2517a.j(iD3, iD2, 0.38f);
            iArr2[3] = C2517a.j(iD3, iD2, 0.38f);
            this.f18284d = new ColorStateList(iArr, iArr2);
        }
        return this.f18284d;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f18285e && d.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z7) {
        this.f18285e = z7;
        if (z7) {
            d.d(this, getMaterialThemeColorsTintList());
        } else {
            d.d(this, null);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f18282i;
        super(C2990a.c(context, attributeSet, i7, i8), attributeSet, i7);
        Context context2 = getContext();
        TypedArray typedArrayI = p.i(context2, attributeSet, C1755k.f13142c4, i7, i8, new int[0]);
        int i9 = C1755k.f13150d4;
        if (typedArrayI.hasValue(i9)) {
            d.d(this, C2754c.a(context2, typedArrayI, i9));
        }
        this.f18285e = typedArrayI.getBoolean(C1755k.f13158e4, false);
        typedArrayI.recycle();
    }
}
