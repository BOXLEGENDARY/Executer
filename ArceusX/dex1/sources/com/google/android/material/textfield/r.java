package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
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
import c4.C1753i;
import c4.C1755k;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import h.C2473a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q0.C2731a;
import r4.C2754c;
import y0.C3002c;

class r extends LinearLayout {

    private final d f18594A;

    private int f18595B;

    private final LinkedHashSet<TextInputLayout.g> f18596C;

    private ColorStateList f18597D;

    private PorterDuff.Mode f18598E;

    private int f18599F;

    private ImageView.ScaleType f18600G;

    private View.OnLongClickListener f18601H;

    private CharSequence f18602I;

    private final TextView f18603J;

    private boolean f18604K;

    private EditText f18605L;

    private final AccessibilityManager f18606M;

    private C3002c.a f18607N;

    private final TextWatcher f18608O;

    private final TextInputLayout.f f18609P;

    final TextInputLayout f18610d;

    private final FrameLayout f18611e;

    private final CheckableImageButton f18612i;

    private ColorStateList f18613v;

    private PorterDuff.Mode f18614w;

    private View.OnLongClickListener f18615y;

    private final CheckableImageButton f18616z;

    class a extends com.google.android.material.internal.o {
        a() {
        }

        @Override
        public void afterTextChanged(Editable editable) {
            r.this.m().a(editable);
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            r.this.m().b(charSequence, i7, i8, i9);
        }
    }

    class b implements TextInputLayout.f {
        b() {
        }

        @Override
        public void a(TextInputLayout textInputLayout) {
            if (r.this.f18605L == textInputLayout.getEditText()) {
                return;
            }
            if (r.this.f18605L != null) {
                r.this.f18605L.removeTextChangedListener(r.this.f18608O);
                if (r.this.f18605L.getOnFocusChangeListener() == r.this.m().e()) {
                    r.this.f18605L.setOnFocusChangeListener(null);
                }
            }
            r.this.f18605L = textInputLayout.getEditText();
            if (r.this.f18605L != null) {
                r.this.f18605L.addTextChangedListener(r.this.f18608O);
            }
            r.this.m().n(r.this.f18605L);
            r rVar = r.this;
            rVar.h0(rVar.m());
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override
        public void onViewAttachedToWindow(View view) {
            r.this.g();
        }

        @Override
        public void onViewDetachedFromWindow(View view) {
            r.this.M();
        }
    }

    private static class d {

        private final SparseArray<s> f18620a = new SparseArray<>();

        private final r f18621b;

        private final int f18622c;

        private final int f18623d;

        d(r rVar, TintTypedArray tintTypedArray) {
            this.f18621b = rVar;
            this.f18622c = tintTypedArray.getResourceId(C1755k.f13118Y6, 0);
            this.f18623d = tintTypedArray.getResourceId(C1755k.f13291w7, 0);
        }

        private s b(int i7) {
            if (i7 == -1) {
                return new g(this.f18621b);
            }
            if (i7 == 0) {
                return new v(this.f18621b);
            }
            if (i7 == 1) {
                return new x(this.f18621b, this.f18623d);
            }
            if (i7 == 2) {
                return new f(this.f18621b);
            }
            if (i7 == 3) {
                return new p(this.f18621b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i7);
        }

        s c(int i7) {
            s sVar = this.f18620a.get(i7);
            if (sVar != null) {
                return sVar;
            }
            s sVarB = b(i7);
            this.f18620a.append(i7, sVarB);
            return sVarB;
        }
    }

    r(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.f18595B = 0;
        this.f18596C = new LinkedHashSet<>();
        this.f18608O = new a();
        b bVar = new b();
        this.f18609P = bVar;
        this.f18606M = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f18610d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f18611e = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonI = i(this, layoutInflaterFrom, C1750f.f12863M);
        this.f18612i = checkableImageButtonI;
        CheckableImageButton checkableImageButtonI2 = i(frameLayout, layoutInflaterFrom, C1750f.f12862L);
        this.f18616z = checkableImageButtonI2;
        this.f18594A = new d(this, tintTypedArray);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f18603J = appCompatTextView;
        C(tintTypedArray);
        B(tintTypedArray);
        D(tintTypedArray);
        frameLayout.addView(checkableImageButtonI2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonI);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void B(TintTypedArray tintTypedArray) {
        int i7 = C1755k.x7;
        if (!tintTypedArray.hasValue(i7)) {
            int i8 = C1755k.c7;
            if (tintTypedArray.hasValue(i8)) {
                this.f18597D = C2754c.b(getContext(), tintTypedArray, i8);
            }
            int i9 = C1755k.d7;
            if (tintTypedArray.hasValue(i9)) {
                this.f18598E = com.google.android.material.internal.s.j(tintTypedArray.getInt(i9, -1), null);
            }
        }
        int i10 = C1755k.f13131a7;
        if (tintTypedArray.hasValue(i10)) {
            U(tintTypedArray.getInt(i10, 0));
            int i11 = C1755k.f13112X6;
            if (tintTypedArray.hasValue(i11)) {
                Q(tintTypedArray.getText(i11));
            }
            O(tintTypedArray.getBoolean(C1755k.f13106W6, true));
        } else if (tintTypedArray.hasValue(i7)) {
            int i12 = C1755k.y7;
            if (tintTypedArray.hasValue(i12)) {
                this.f18597D = C2754c.b(getContext(), tintTypedArray, i12);
            }
            int i13 = C1755k.z7;
            if (tintTypedArray.hasValue(i13)) {
                this.f18598E = com.google.android.material.internal.s.j(tintTypedArray.getInt(i13, -1), null);
            }
            U(tintTypedArray.getBoolean(i7, false) ? 1 : 0);
            Q(tintTypedArray.getText(C1755k.v7));
        }
        T(tintTypedArray.getDimensionPixelSize(C1755k.f13124Z6, getResources().getDimensionPixelSize(C1748d.f12805c0)));
        int i14 = C1755k.f13138b7;
        if (tintTypedArray.hasValue(i14)) {
            X(t.b(tintTypedArray.getInt(i14, -1)));
        }
    }

    private void C(TintTypedArray tintTypedArray) {
        int i7 = C1755k.i7;
        if (tintTypedArray.hasValue(i7)) {
            this.f18613v = C2754c.b(getContext(), tintTypedArray, i7);
        }
        int i8 = C1755k.j7;
        if (tintTypedArray.hasValue(i8)) {
            this.f18614w = com.google.android.material.internal.s.j(tintTypedArray.getInt(i8, -1), null);
        }
        int i9 = C1755k.h7;
        if (tintTypedArray.hasValue(i9)) {
            c0(tintTypedArray.getDrawable(i9));
        }
        this.f18612i.setContentDescription(getResources().getText(C1753i.f12927f));
        Z.x0(this.f18612i, 2);
        this.f18612i.setClickable(false);
        this.f18612i.setPressable(false);
        this.f18612i.setFocusable(false);
    }

    private void D(TintTypedArray tintTypedArray) {
        this.f18603J.setVisibility(8);
        this.f18603J.setId(C1750f.f12869S);
        this.f18603J.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        Z.p0(this.f18603J, 1);
        q0(tintTypedArray.getResourceId(C1755k.O7, 0));
        int i7 = C1755k.P7;
        if (tintTypedArray.hasValue(i7)) {
            r0(tintTypedArray.getColorStateList(i7));
        }
        p0(tintTypedArray.getText(C1755k.N7));
    }

    public void M() {
        AccessibilityManager accessibilityManager;
        C3002c.a aVar = this.f18607N;
        if (aVar == null || (accessibilityManager = this.f18606M) == null) {
            return;
        }
        C3002c.b(accessibilityManager, aVar);
    }

    public void g() {
        if (this.f18607N == null || this.f18606M == null || !Z.Q(this)) {
            return;
        }
        C3002c.a(this.f18606M, this.f18607N);
    }

    public void h0(s sVar) {
        if (this.f18605L == null) {
            return;
        }
        if (sVar.e() != null) {
            this.f18605L.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.f18616z.setOnFocusChangeListener(sVar.g());
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i7) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C1752h.f12903d, viewGroup, false);
        checkableImageButton.setId(i7);
        t.e(checkableImageButton);
        if (C2754c.g(getContext())) {
            C1646v.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void j(int i7) {
        Iterator<TextInputLayout.g> it = this.f18596C.iterator();
        while (it.hasNext()) {
            it.next().a(this.f18610d, i7);
        }
    }

    private void s0(s sVar) {
        sVar.s();
        this.f18607N = sVar.h();
        g();
    }

    private int t(s sVar) {
        int i7 = this.f18594A.f18622c;
        return i7 == 0 ? sVar.d() : i7;
    }

    private void t0(s sVar) {
        M();
        this.f18607N = null;
        sVar.u();
    }

    private void u0(boolean z7) {
        if (!z7 || n() == null) {
            t.a(this.f18610d, this.f18616z, this.f18597D, this.f18598E);
            return;
        }
        Drawable drawableMutate = C2731a.r(n()).mutate();
        C2731a.n(drawableMutate, this.f18610d.getErrorCurrentTextColors());
        this.f18616z.setImageDrawable(drawableMutate);
    }

    private void v0() {
        this.f18611e.setVisibility((this.f18616z.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || !((this.f18602I == null || this.f18604K) ? 8 : false)) ? 0 : 8);
    }

    private void w0() {
        this.f18612i.setVisibility(s() != null && this.f18610d.N() && this.f18610d.e0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.f18610d.p0();
    }

    private void y0() {
        int visibility = this.f18603J.getVisibility();
        int i7 = (this.f18602I == null || this.f18604K) ? 8 : 0;
        if (visibility != i7) {
            m().q(i7 == 0);
        }
        v0();
        this.f18603J.setVisibility(i7);
        this.f18610d.p0();
    }

    boolean A() {
        return this.f18595B != 0;
    }

    boolean E() {
        return A() && this.f18616z.isChecked();
    }

    boolean F() {
        return this.f18611e.getVisibility() == 0 && this.f18616z.getVisibility() == 0;
    }

    boolean G() {
        return this.f18612i.getVisibility() == 0;
    }

    void H(boolean z7) {
        this.f18604K = z7;
        y0();
    }

    void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f18610d.e0());
        }
    }

    void J() {
        t.d(this.f18610d, this.f18616z, this.f18597D);
    }

    void K() {
        t.d(this.f18610d, this.f18612i, this.f18613v);
    }

    void L(boolean z7) {
        boolean z8;
        boolean zIsActivated;
        boolean zIsChecked;
        s sVarM = m();
        boolean z9 = true;
        if (!sVarM.l() || (zIsChecked = this.f18616z.isChecked()) == sVarM.m()) {
            z8 = false;
        } else {
            this.f18616z.setChecked(!zIsChecked);
            z8 = true;
        }
        if (!sVarM.j() || (zIsActivated = this.f18616z.isActivated()) == sVarM.k()) {
            z9 = z8;
        } else {
            N(!zIsActivated);
        }
        if (z7 || z9) {
            J();
        }
    }

    void N(boolean z7) {
        this.f18616z.setActivated(z7);
    }

    void O(boolean z7) {
        this.f18616z.setCheckable(z7);
    }

    void P(int i7) {
        Q(i7 != 0 ? getResources().getText(i7) : null);
    }

    void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f18616z.setContentDescription(charSequence);
        }
    }

    void R(int i7) {
        S(i7 != 0 ? C2473a.b(getContext(), i7) : null);
    }

    void S(Drawable drawable) {
        this.f18616z.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f18610d, this.f18616z, this.f18597D, this.f18598E);
            J();
        }
    }

    void T(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i7 != this.f18599F) {
            this.f18599F = i7;
            t.g(this.f18616z, i7);
            t.g(this.f18612i, i7);
        }
    }

    void U(int i7) {
        if (this.f18595B == i7) {
            return;
        }
        t0(m());
        int i8 = this.f18595B;
        this.f18595B = i7;
        j(i8);
        a0(i7 != 0);
        s sVarM = m();
        R(t(sVarM));
        P(sVarM.c());
        O(sVarM.l());
        if (!sVarM.i(this.f18610d.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f18610d.getBoxBackgroundMode() + " is not supported by the end icon mode " + i7);
        }
        s0(sVarM);
        V(sVarM.f());
        EditText editText = this.f18605L;
        if (editText != null) {
            sVarM.n(editText);
            h0(sVarM);
        }
        t.a(this.f18610d, this.f18616z, this.f18597D, this.f18598E);
        L(true);
    }

    void V(View.OnClickListener onClickListener) {
        t.h(this.f18616z, onClickListener, this.f18601H);
    }

    void W(View.OnLongClickListener onLongClickListener) {
        this.f18601H = onLongClickListener;
        t.i(this.f18616z, onLongClickListener);
    }

    void X(ImageView.ScaleType scaleType) {
        this.f18600G = scaleType;
        t.j(this.f18616z, scaleType);
        t.j(this.f18612i, scaleType);
    }

    void Y(ColorStateList colorStateList) {
        if (this.f18597D != colorStateList) {
            this.f18597D = colorStateList;
            t.a(this.f18610d, this.f18616z, colorStateList, this.f18598E);
        }
    }

    void Z(PorterDuff.Mode mode) {
        if (this.f18598E != mode) {
            this.f18598E = mode;
            t.a(this.f18610d, this.f18616z, this.f18597D, mode);
        }
    }

    void a0(boolean z7) {
        if (F() != z7) {
            this.f18616z.setVisibility(z7 ? 0 : 8);
            v0();
            x0();
            this.f18610d.p0();
        }
    }

    void b0(int i7) {
        c0(i7 != 0 ? C2473a.b(getContext(), i7) : null);
        K();
    }

    void c0(Drawable drawable) {
        this.f18612i.setImageDrawable(drawable);
        w0();
        t.a(this.f18610d, this.f18612i, this.f18613v, this.f18614w);
    }

    void d0(View.OnClickListener onClickListener) {
        t.h(this.f18612i, onClickListener, this.f18615y);
    }

    void e0(View.OnLongClickListener onLongClickListener) {
        this.f18615y = onLongClickListener;
        t.i(this.f18612i, onLongClickListener);
    }

    void f0(ColorStateList colorStateList) {
        if (this.f18613v != colorStateList) {
            this.f18613v = colorStateList;
            t.a(this.f18610d, this.f18612i, colorStateList, this.f18614w);
        }
    }

    void g0(PorterDuff.Mode mode) {
        if (this.f18614w != mode) {
            this.f18614w = mode;
            t.a(this.f18610d, this.f18612i, this.f18613v, mode);
        }
    }

    void h() {
        this.f18616z.performClick();
        this.f18616z.jumpDrawablesToCurrentState();
    }

    void i0(int i7) {
        j0(i7 != 0 ? getResources().getText(i7) : null);
    }

    void j0(CharSequence charSequence) {
        this.f18616z.setContentDescription(charSequence);
    }

    CheckableImageButton k() {
        if (G()) {
            return this.f18612i;
        }
        if (A() && F()) {
            return this.f18616z;
        }
        return null;
    }

    void k0(int i7) {
        l0(i7 != 0 ? C2473a.b(getContext(), i7) : null);
    }

    CharSequence l() {
        return this.f18616z.getContentDescription();
    }

    void l0(Drawable drawable) {
        this.f18616z.setImageDrawable(drawable);
    }

    s m() {
        return this.f18594A.c(this.f18595B);
    }

    void m0(boolean z7) {
        if (z7 && this.f18595B != 1) {
            U(1);
        } else {
            if (z7) {
                return;
            }
            U(0);
        }
    }

    Drawable n() {
        return this.f18616z.getDrawable();
    }

    void n0(ColorStateList colorStateList) {
        this.f18597D = colorStateList;
        t.a(this.f18610d, this.f18616z, colorStateList, this.f18598E);
    }

    int o() {
        return this.f18599F;
    }

    void o0(PorterDuff.Mode mode) {
        this.f18598E = mode;
        t.a(this.f18610d, this.f18616z, this.f18597D, mode);
    }

    int p() {
        return this.f18595B;
    }

    void p0(CharSequence charSequence) {
        this.f18602I = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f18603J.setText(charSequence);
        y0();
    }

    ImageView.ScaleType q() {
        return this.f18600G;
    }

    void q0(int i7) {
        androidx.core.widget.j.r(this.f18603J, i7);
    }

    CheckableImageButton r() {
        return this.f18616z;
    }

    void r0(ColorStateList colorStateList) {
        this.f18603J.setTextColor(colorStateList);
    }

    Drawable s() {
        return this.f18612i.getDrawable();
    }

    CharSequence u() {
        return this.f18616z.getContentDescription();
    }

    Drawable v() {
        return this.f18616z.getDrawable();
    }

    CharSequence w() {
        return this.f18602I;
    }

    ColorStateList x() {
        return this.f18603J.getTextColors();
    }

    void x0() {
        if (this.f18610d.f18536v == null) {
            return;
        }
        Z.C0(this.f18603J, getContext().getResources().getDimensionPixelSize(C1748d.f12784K), this.f18610d.f18536v.getPaddingTop(), (F() || G()) ? 0 : Z.D(this.f18610d.f18536v), this.f18610d.f18536v.getPaddingBottom());
    }

    int y() {
        return Z.D(this) + Z.D(this.f18603J) + ((F() || G()) ? this.f18616z.getMeasuredWidth() + C1646v.b((ViewGroup.MarginLayoutParams) this.f18616z.getLayoutParams()) : 0);
    }

    TextView z() {
        return this.f18603J;
    }
}
