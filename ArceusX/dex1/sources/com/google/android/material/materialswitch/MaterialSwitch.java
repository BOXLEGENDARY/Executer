package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.a;
import c4.C1746b;
import c4.C1754j;
import c4.C1755k;
import com.google.android.material.drawable.d;
import com.google.android.material.internal.p;
import com.google.android.material.internal.s;
import h.C2473a;
import q0.C2731a;
import x4.C2990a;

public class MaterialSwitch extends SwitchCompat {

    private static final int f18184G = C1754j.f12957j;

    private static final int[] f18185H = {C1746b.f12736c0};

    private PorterDuff.Mode f18186A;

    private ColorStateList f18187B;

    private ColorStateList f18188C;

    private PorterDuff.Mode f18189D;

    private int[] f18190E;

    private int[] f18191F;

    private Drawable f18192d;

    private Drawable f18193e;

    private int f18194i;

    private Drawable f18195v;

    private Drawable f18196w;

    private ColorStateList f18197y;

    private ColorStateList f18198z;

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1746b.f12706B);
    }

    private void a() {
        this.f18192d = d.c(this.f18192d, this.f18197y, getThumbTintMode());
        this.f18193e = d.c(this.f18193e, this.f18198z, this.f18186A);
        d();
        Drawable drawable = this.f18192d;
        Drawable drawable2 = this.f18193e;
        int i7 = this.f18194i;
        super.setThumbDrawable(d.b(drawable, drawable2, i7, i7));
        refreshDrawableState();
    }

    private void b() {
        this.f18195v = d.c(this.f18195v, this.f18187B, getTrackTintMode());
        this.f18196w = d.c(this.f18196w, this.f18188C, this.f18189D);
        d();
        Drawable layerDrawable = this.f18195v;
        if (layerDrawable != null && this.f18196w != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.f18195v, this.f18196w});
        } else if (layerDrawable == null) {
            layerDrawable = this.f18196w;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    private static void c(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f7) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        C2731a.n(drawable, a.c(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f7));
    }

    private void d() {
        if (this.f18197y == null && this.f18198z == null && this.f18187B == null && this.f18188C == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f18197y;
        if (colorStateList != null) {
            c(this.f18192d, colorStateList, this.f18190E, this.f18191F, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f18198z;
        if (colorStateList2 != null) {
            c(this.f18193e, colorStateList2, this.f18190E, this.f18191F, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f18187B;
        if (colorStateList3 != null) {
            c(this.f18195v, colorStateList3, this.f18190E, this.f18191F, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f18188C;
        if (colorStateList4 != null) {
            c(this.f18196w, colorStateList4, this.f18190E, this.f18191F, thumbPosition);
        }
    }

    @Override
    public Drawable getThumbDrawable() {
        return this.f18192d;
    }

    public Drawable getThumbIconDrawable() {
        return this.f18193e;
    }

    public int getThumbIconSize() {
        return this.f18194i;
    }

    public ColorStateList getThumbIconTintList() {
        return this.f18198z;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f18186A;
    }

    @Override
    public ColorStateList getThumbTintList() {
        return this.f18197y;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.f18196w;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.f18188C;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f18189D;
    }

    @Override
    public Drawable getTrackDrawable() {
        return this.f18195v;
    }

    @Override
    public ColorStateList getTrackTintList() {
        return this.f18187B;
    }

    @Override
    public void invalidate() {
        d();
        super.invalidate();
    }

    @Override
    protected int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        if (this.f18193e != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f18185H);
        }
        this.f18190E = d.j(iArrOnCreateDrawableState);
        this.f18191F = d.f(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override
    public void setThumbDrawable(Drawable drawable) {
        this.f18192d = drawable;
        a();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.f18193e = drawable;
        a();
    }

    public void setThumbIconResource(int i7) {
        setThumbIconDrawable(C2473a.b(getContext(), i7));
    }

    public void setThumbIconSize(int i7) {
        if (this.f18194i != i7) {
            this.f18194i = i7;
            a();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.f18198z = colorStateList;
        a();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.f18186A = mode;
        a();
    }

    @Override
    public void setThumbTintList(ColorStateList colorStateList) {
        this.f18197y = colorStateList;
        a();
    }

    @Override
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        a();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.f18196w = drawable;
        b();
    }

    public void setTrackDecorationResource(int i7) {
        setTrackDecorationDrawable(C2473a.b(getContext(), i7));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.f18188C = colorStateList;
        b();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.f18189D = mode;
        b();
    }

    @Override
    public void setTrackDrawable(Drawable drawable) {
        this.f18195v = drawable;
        b();
    }

    @Override
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f18187B = colorStateList;
        b();
    }

    @Override
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        b();
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f18184G;
        super(C2990a.c(context, attributeSet, i7, i8), attributeSet, i7);
        this.f18194i = -1;
        Context context2 = getContext();
        this.f18192d = super.getThumbDrawable();
        this.f18197y = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f18195v = super.getTrackDrawable();
        this.f18187B = super.getTrackTintList();
        super.setTrackTintList(null);
        TintTypedArray tintTypedArrayJ = p.j(context2, attributeSet, C1755k.f13190i4, i7, i8, new int[0]);
        this.f18193e = tintTypedArrayJ.getDrawable(C1755k.f13198j4);
        this.f18194i = tintTypedArrayJ.getDimensionPixelSize(C1755k.f13205k4, -1);
        this.f18198z = tintTypedArrayJ.getColorStateList(C1755k.f13212l4);
        int i9 = tintTypedArrayJ.getInt(C1755k.f13219m4, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f18186A = s.j(i9, mode);
        this.f18196w = tintTypedArrayJ.getDrawable(C1755k.f13226n4);
        this.f18188C = tintTypedArrayJ.getColorStateList(C1755k.f13232o4);
        this.f18189D = s.j(tintTypedArrayJ.getInt(C1755k.f13239p4, -1), mode);
        tintTypedArrayJ.recycle();
        setEnforceSwitchWidth(false);
        a();
        b();
    }
}
