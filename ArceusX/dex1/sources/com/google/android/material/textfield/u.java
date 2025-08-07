package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.Z;
import c4.C1746b;
import c4.C1748d;
import c4.C1750f;
import com.github.luben.zstd.BuildConfig;
import d4.C2388a;
import d4.C2389b;
import java.util.ArrayList;
import java.util.List;
import r4.C2754c;

final class u {

    private ColorStateList f18628A;

    private Typeface f18629B;

    private final int f18630a;

    private final int f18631b;

    private final int f18632c;

    private final TimeInterpolator f18633d;

    private final TimeInterpolator f18634e;

    private final TimeInterpolator f18635f;

    private final Context f18636g;

    private final TextInputLayout f18637h;

    private LinearLayout f18638i;

    private int f18639j;

    private FrameLayout f18640k;

    private Animator f18641l;

    private final float f18642m;

    private int f18643n;

    private int f18644o;

    private CharSequence f18645p;

    private boolean f18646q;

    private TextView f18647r;

    private CharSequence f18648s;

    private int f18649t;

    private int f18650u;

    private ColorStateList f18651v;

    private CharSequence f18652w;

    private boolean f18653x;

    private TextView f18654y;

    private int f18655z;

    class a extends AnimatorListenerAdapter {

        final int f18656a;

        final TextView f18657b;

        final int f18658c;

        final TextView f18659d;

        a(int i7, TextView textView, int i8, TextView textView2) {
            this.f18656a = i7;
            this.f18657b = textView;
            this.f18658c = i8;
            this.f18659d = textView2;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            u.this.f18643n = this.f18656a;
            u.this.f18641l = null;
            TextView textView = this.f18657b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f18658c == 1 && u.this.f18647r != null) {
                    u.this.f18647r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f18659d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f18659d.setAlpha(1.0f);
            }
        }

        @Override
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f18659d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f18659d.setAlpha(0.0f);
            }
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = u.this.f18637h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f18636g = context;
        this.f18637h = textInputLayout;
        this.f18642m = context.getResources().getDimensionPixelSize(C1748d.f12812g);
        int i7 = C1746b.f12715K;
        this.f18630a = p4.e.f(context, i7, 217);
        this.f18631b = p4.e.f(context, C1746b.f12711G, 167);
        this.f18632c = p4.e.f(context, i7, 167);
        int i8 = C1746b.f12717M;
        this.f18633d = p4.e.g(context, i8, C2388a.f20315d);
        TimeInterpolator timeInterpolator = C2388a.f20312a;
        this.f18634e = p4.e.g(context, i8, timeInterpolator);
        this.f18635f = p4.e.g(context, C1746b.f12719O, timeInterpolator);
    }

    private void D(int i7, int i8) {
        TextView textViewM;
        TextView textViewM2;
        if (i7 == i8) {
            return;
        }
        if (i8 != 0 && (textViewM2 = m(i8)) != null) {
            textViewM2.setVisibility(0);
            textViewM2.setAlpha(1.0f);
        }
        if (i7 != 0 && (textViewM = m(i7)) != null) {
            textViewM.setVisibility(4);
            if (i7 == 1) {
                textViewM.setText((CharSequence) null);
            }
        }
        this.f18643n = i8;
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int i7) {
        if (i7 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        return Z.R(this.f18637h) && this.f18637h.isEnabled() && !(this.f18644o == this.f18643n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void S(int i7, int i8, boolean z7) {
        if (i7 == i8) {
            return;
        }
        if (z7) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f18641l = animatorSet;
            ArrayList arrayList = new ArrayList();
            i(arrayList, this.f18653x, this.f18654y, 2, i7, i8);
            i(arrayList, this.f18646q, this.f18647r, 1, i7, i8);
            C2389b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i8, m(i7), i7, m(i8)));
            animatorSet.start();
        } else {
            D(i7, i8);
        }
        this.f18637h.q0();
        this.f18637h.v0(z7);
        this.f18637h.B0();
    }

    private boolean g() {
        return (this.f18638i == null || this.f18637h.getEditText() == null) ? false : true;
    }

    private void i(List<Animator> list, boolean z7, TextView textView, int i7, int i8, int i9) {
        if (textView == null || !z7) {
            return;
        }
        if (i7 == i9 || i7 == i8) {
            ObjectAnimator objectAnimatorJ = j(textView, i9 == i7);
            if (i7 == i9 && i8 != 0) {
                objectAnimatorJ.setStartDelay(this.f18632c);
            }
            list.add(objectAnimatorJ);
            if (i9 != i7 || i8 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorK = k(textView);
            objectAnimatorK.setStartDelay(this.f18632c);
            list.add(objectAnimatorK);
        }
    }

    private ObjectAnimator j(TextView textView, boolean z7) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z7 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z7 ? this.f18631b : this.f18632c);
        objectAnimatorOfFloat.setInterpolator(z7 ? this.f18634e : this.f18635f);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f18642m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f18630a);
        objectAnimatorOfFloat.setInterpolator(this.f18633d);
        return objectAnimatorOfFloat;
    }

    private TextView m(int i7) {
        if (i7 == 1) {
            return this.f18647r;
        }
        if (i7 != 2) {
            return null;
        }
        return this.f18654y;
    }

    private int v(boolean z7, int i7, int i8) {
        return z7 ? this.f18636g.getResources().getDimensionPixelSize(i7) : i8;
    }

    private boolean y(int i7) {
        return (i7 != 1 || this.f18647r == null || TextUtils.isEmpty(this.f18645p)) ? false : true;
    }

    boolean A() {
        return this.f18646q;
    }

    boolean B() {
        return this.f18653x;
    }

    void C(TextView textView, int i7) {
        FrameLayout frameLayout;
        if (this.f18638i == null) {
            return;
        }
        if (!z(i7) || (frameLayout = this.f18640k) == null) {
            this.f18638i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i8 = this.f18639j - 1;
        this.f18639j = i8;
        O(this.f18638i, i8);
    }

    void E(int i7) {
        this.f18649t = i7;
        TextView textView = this.f18647r;
        if (textView != null) {
            Z.p0(textView, i7);
        }
    }

    void F(CharSequence charSequence) {
        this.f18648s = charSequence;
        TextView textView = this.f18647r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void G(boolean z7) {
        if (this.f18646q == z7) {
            return;
        }
        h();
        if (z7) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f18636g);
            this.f18647r = appCompatTextView;
            appCompatTextView.setId(C1750f.f12865O);
            this.f18647r.setTextAlignment(5);
            Typeface typeface = this.f18629B;
            if (typeface != null) {
                this.f18647r.setTypeface(typeface);
            }
            H(this.f18650u);
            I(this.f18651v);
            F(this.f18648s);
            E(this.f18649t);
            this.f18647r.setVisibility(4);
            e(this.f18647r, 0);
        } else {
            w();
            C(this.f18647r, 0);
            this.f18647r = null;
            this.f18637h.q0();
            this.f18637h.B0();
        }
        this.f18646q = z7;
    }

    void H(int i7) {
        this.f18650u = i7;
        TextView textView = this.f18647r;
        if (textView != null) {
            this.f18637h.d0(textView, i7);
        }
    }

    void I(ColorStateList colorStateList) {
        this.f18651v = colorStateList;
        TextView textView = this.f18647r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void J(int i7) {
        this.f18655z = i7;
        TextView textView = this.f18654y;
        if (textView != null) {
            androidx.core.widget.j.r(textView, i7);
        }
    }

    void K(boolean z7) {
        if (this.f18653x == z7) {
            return;
        }
        h();
        if (z7) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f18636g);
            this.f18654y = appCompatTextView;
            appCompatTextView.setId(C1750f.f12866P);
            this.f18654y.setTextAlignment(5);
            Typeface typeface = this.f18629B;
            if (typeface != null) {
                this.f18654y.setTypeface(typeface);
            }
            this.f18654y.setVisibility(4);
            Z.p0(this.f18654y, 1);
            J(this.f18655z);
            L(this.f18628A);
            e(this.f18654y, 1);
            this.f18654y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.f18654y, 1);
            this.f18654y = null;
            this.f18637h.q0();
            this.f18637h.B0();
        }
        this.f18653x = z7;
    }

    void L(ColorStateList colorStateList) {
        this.f18628A = colorStateList;
        TextView textView = this.f18654y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void N(Typeface typeface) {
        if (typeface != this.f18629B) {
            this.f18629B = typeface;
            M(this.f18647r, typeface);
            M(this.f18654y, typeface);
        }
    }

    void Q(CharSequence charSequence) {
        h();
        this.f18645p = charSequence;
        this.f18647r.setText(charSequence);
        int i7 = this.f18643n;
        if (i7 != 1) {
            this.f18644o = 1;
        }
        S(i7, this.f18644o, P(this.f18647r, charSequence));
    }

    void R(CharSequence charSequence) {
        h();
        this.f18652w = charSequence;
        this.f18654y.setText(charSequence);
        int i7 = this.f18643n;
        if (i7 != 2) {
            this.f18644o = 2;
        }
        S(i7, this.f18644o, P(this.f18654y, charSequence));
    }

    void e(TextView textView, int i7) {
        if (this.f18638i == null && this.f18640k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f18636g);
            this.f18638i = linearLayout;
            linearLayout.setOrientation(0);
            this.f18637h.addView(this.f18638i, -1, -2);
            this.f18640k = new FrameLayout(this.f18636g);
            this.f18638i.addView(this.f18640k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f18637h.getEditText() != null) {
                f();
            }
        }
        if (z(i7)) {
            this.f18640k.setVisibility(0);
            this.f18640k.addView(textView);
        } else {
            this.f18638i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f18638i.setVisibility(0);
        this.f18639j++;
    }

    void f() {
        if (g()) {
            EditText editText = this.f18637h.getEditText();
            boolean zG = C2754c.g(this.f18636g);
            LinearLayout linearLayout = this.f18638i;
            int i7 = C1748d.f12782I;
            Z.C0(linearLayout, v(zG, i7, Z.E(editText)), v(zG, C1748d.f12783J, this.f18636g.getResources().getDimensionPixelSize(C1748d.f12781H)), v(zG, i7, Z.D(editText)), 0);
        }
    }

    void h() {
        Animator animator = this.f18641l;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return y(this.f18644o);
    }

    int n() {
        return this.f18649t;
    }

    CharSequence o() {
        return this.f18648s;
    }

    CharSequence p() {
        return this.f18645p;
    }

    int q() {
        TextView textView = this.f18647r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList r() {
        TextView textView = this.f18647r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence s() {
        return this.f18652w;
    }

    View t() {
        return this.f18654y;
    }

    int u() {
        TextView textView = this.f18654y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void w() {
        this.f18645p = null;
        h();
        if (this.f18643n == 1) {
            if (!this.f18653x || TextUtils.isEmpty(this.f18652w)) {
                this.f18644o = 0;
            } else {
                this.f18644o = 2;
            }
        }
        S(this.f18643n, this.f18644o, P(this.f18647r, BuildConfig.FLAVOR));
    }

    void x() {
        h();
        int i7 = this.f18643n;
        if (i7 == 2) {
            this.f18644o = 0;
        }
        S(i7, this.f18644o, P(this.f18654y, BuildConfig.FLAVOR));
    }

    boolean z(int i7) {
        return i7 == 0 || i7 == 1;
    }
}
