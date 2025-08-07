package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.C1646v;
import androidx.core.view.Z;
import c4.C1748d;
import c4.C1750f;
import c4.C1752h;
import c4.C1755k;
import com.google.android.material.internal.CheckableImageButton;
import r4.C2754c;
import y0.C3019t;

class y extends LinearLayout {

    private ImageView.ScaleType f18666A;

    private View.OnLongClickListener f18667B;

    private boolean f18668C;

    private final TextInputLayout f18669d;

    private final TextView f18670e;

    private CharSequence f18671i;

    private final CheckableImageButton f18672v;

    private ColorStateList f18673w;

    private PorterDuff.Mode f18674y;

    private int f18675z;

    y(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.f18669d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C1752h.f12904e, (ViewGroup) this, false);
        this.f18672v = checkableImageButton;
        t.e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f18670e = appCompatTextView;
        j(tintTypedArray);
        i(tintTypedArray);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void C() {
        int i7 = (this.f18671i == null || this.f18668C) ? 8 : 0;
        setVisibility((this.f18672v.getVisibility() == 0 || i7 == 0) ? 0 : 8);
        this.f18670e.setVisibility(i7);
        this.f18669d.p0();
    }

    private void i(TintTypedArray tintTypedArray) {
        this.f18670e.setVisibility(8);
        this.f18670e.setId(C1750f.f12868R);
        this.f18670e.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        Z.p0(this.f18670e, 1);
        o(tintTypedArray.getResourceId(C1755k.E7, 0));
        int i7 = C1755k.F7;
        if (tintTypedArray.hasValue(i7)) {
            p(tintTypedArray.getColorStateList(i7));
        }
        n(tintTypedArray.getText(C1755k.D7));
    }

    private void j(TintTypedArray tintTypedArray) {
        if (C2754c.g(getContext())) {
            C1646v.c((ViewGroup.MarginLayoutParams) this.f18672v.getLayoutParams(), 0);
        }
        u(null);
        v(null);
        int i7 = C1755k.L7;
        if (tintTypedArray.hasValue(i7)) {
            this.f18673w = C2754c.b(getContext(), tintTypedArray, i7);
        }
        int i8 = C1755k.M7;
        if (tintTypedArray.hasValue(i8)) {
            this.f18674y = com.google.android.material.internal.s.j(tintTypedArray.getInt(i8, -1), null);
        }
        int i9 = C1755k.I7;
        if (tintTypedArray.hasValue(i9)) {
            s(tintTypedArray.getDrawable(i9));
            int i10 = C1755k.H7;
            if (tintTypedArray.hasValue(i10)) {
                r(tintTypedArray.getText(i10));
            }
            q(tintTypedArray.getBoolean(C1755k.G7, true));
        }
        t(tintTypedArray.getDimensionPixelSize(C1755k.J7, getResources().getDimensionPixelSize(C1748d.f12805c0)));
        int i11 = C1755k.K7;
        if (tintTypedArray.hasValue(i11)) {
            w(t.b(tintTypedArray.getInt(i11, -1)));
        }
    }

    void A(C3019t c3019t) {
        if (this.f18670e.getVisibility() != 0) {
            c3019t.C0(this.f18672v);
        } else {
            c3019t.q0(this.f18670e);
            c3019t.C0(this.f18670e);
        }
    }

    void B() {
        EditText editText = this.f18669d.f18536v;
        if (editText == null) {
            return;
        }
        Z.C0(this.f18670e, k() ? 0 : Z.E(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C1748d.f12784K), editText.getCompoundPaddingBottom());
    }

    CharSequence a() {
        return this.f18671i;
    }

    ColorStateList b() {
        return this.f18670e.getTextColors();
    }

    int c() {
        return Z.E(this) + Z.E(this.f18670e) + (k() ? this.f18672v.getMeasuredWidth() + C1646v.a((ViewGroup.MarginLayoutParams) this.f18672v.getLayoutParams()) : 0);
    }

    TextView d() {
        return this.f18670e;
    }

    CharSequence e() {
        return this.f18672v.getContentDescription();
    }

    Drawable f() {
        return this.f18672v.getDrawable();
    }

    int g() {
        return this.f18675z;
    }

    ImageView.ScaleType h() {
        return this.f18666A;
    }

    boolean k() {
        return this.f18672v.getVisibility() == 0;
    }

    void l(boolean z7) {
        this.f18668C = z7;
        C();
    }

    void m() {
        t.d(this.f18669d, this.f18672v, this.f18673w);
    }

    void n(CharSequence charSequence) {
        this.f18671i = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f18670e.setText(charSequence);
        C();
    }

    void o(int i7) {
        androidx.core.widget.j.r(this.f18670e, i7);
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        B();
    }

    void p(ColorStateList colorStateList) {
        this.f18670e.setTextColor(colorStateList);
    }

    void q(boolean z7) {
        this.f18672v.setCheckable(z7);
    }

    void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f18672v.setContentDescription(charSequence);
        }
    }

    void s(Drawable drawable) {
        this.f18672v.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f18669d, this.f18672v, this.f18673w, this.f18674y);
            z(true);
            m();
        } else {
            z(false);
            u(null);
            v(null);
            r(null);
        }
    }

    void t(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i7 != this.f18675z) {
            this.f18675z = i7;
            t.g(this.f18672v, i7);
        }
    }

    void u(View.OnClickListener onClickListener) {
        t.h(this.f18672v, onClickListener, this.f18667B);
    }

    void v(View.OnLongClickListener onLongClickListener) {
        this.f18667B = onLongClickListener;
        t.i(this.f18672v, onLongClickListener);
    }

    void w(ImageView.ScaleType scaleType) {
        this.f18666A = scaleType;
        t.j(this.f18672v, scaleType);
    }

    void x(ColorStateList colorStateList) {
        if (this.f18673w != colorStateList) {
            this.f18673w = colorStateList;
            t.a(this.f18669d, this.f18672v, colorStateList, this.f18674y);
        }
    }

    void y(PorterDuff.Mode mode) {
        if (this.f18674y != mode) {
            this.f18674y = mode;
            t.a(this.f18669d, this.f18672v, this.f18673w, mode);
        }
    }

    void z(boolean z7) {
        if (k() != z7) {
            this.f18672v.setVisibility(z7 ? 0 : 8);
            B();
            C();
        }
    }
}
