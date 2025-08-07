package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import c4.C1746b;
import c4.C1749e;
import c4.C1753i;
import d4.C2388a;

class f extends s {

    private final int f18558e;

    private final int f18559f;

    private final TimeInterpolator f18560g;

    private final TimeInterpolator f18561h;

    private EditText f18562i;

    private final View.OnClickListener f18563j;

    private final View.OnFocusChangeListener f18564k;

    private AnimatorSet f18565l;

    private ValueAnimator f18566m;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override
        public void onAnimationStart(Animator animator) {
            f.this.f18625b.a0(true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            f.this.f18625b.a0(false);
        }
    }

    f(r rVar) {
        super(rVar);
        this.f18563j = new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f18553d.G(view);
            }
        };
        this.f18564k = new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view, boolean z7) {
                this.f18554a.H(view, z7);
            }
        };
        Context context = rVar.getContext();
        int i7 = C1746b.f12714J;
        this.f18558e = p4.e.f(context, i7, 100);
        this.f18559f = p4.e.f(rVar.getContext(), i7, 150);
        this.f18560g = p4.e.g(rVar.getContext(), C1746b.f12719O, C2388a.f20312a);
        this.f18561h = p4.e.g(rVar.getContext(), C1746b.f12718N, C2388a.f20315d);
    }

    private void A(boolean z7) {
        boolean z8 = this.f18625b.F() == z7;
        if (z7 && !this.f18565l.isRunning()) {
            this.f18566m.cancel();
            this.f18565l.start();
            if (z8) {
                this.f18565l.end();
                return;
            }
            return;
        }
        if (z7) {
            return;
        }
        this.f18565l.cancel();
        this.f18566m.start();
        if (z8) {
            this.f18566m.end();
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f18560g);
        valueAnimatorOfFloat.setDuration(this.f18558e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f18555a.E(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f18561h);
        valueAnimatorOfFloat.setDuration(this.f18559f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f18557a.F(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f18565l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.f18565l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.f18566m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    public void E(ValueAnimator valueAnimator) {
        this.f18627d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void F(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f18627d.setScaleX(fFloatValue);
        this.f18627d.setScaleY(fFloatValue);
    }

    public void G(View view) {
        EditText editText = this.f18562i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        r();
    }

    public void H(View view, boolean z7) {
        A(J());
    }

    public void I() {
        A(true);
    }

    private boolean J() {
        EditText editText = this.f18562i;
        return editText != null && (editText.hasFocus() || this.f18627d.hasFocus()) && this.f18562i.getText().length() > 0;
    }

    @Override
    void a(Editable editable) {
        if (this.f18625b.w() != null) {
            return;
        }
        A(J());
    }

    @Override
    int c() {
        return C1753i.f12926e;
    }

    @Override
    int d() {
        return C1749e.f12849l;
    }

    @Override
    View.OnFocusChangeListener e() {
        return this.f18564k;
    }

    @Override
    View.OnClickListener f() {
        return this.f18563j;
    }

    @Override
    View.OnFocusChangeListener g() {
        return this.f18564k;
    }

    @Override
    public void n(EditText editText) {
        this.f18562i = editText;
        this.f18624a.setEndIconVisible(J());
    }

    @Override
    void q(boolean z7) {
        if (this.f18625b.w() == null) {
            return;
        }
        A(z7);
    }

    @Override
    void s() {
        D();
    }

    @Override
    void u() {
        EditText editText = this.f18562i;
        if (editText != null) {
            editText.post(new Runnable() {
                @Override
                public final void run() {
                    this.f18556d.I();
                }
            });
        }
    }
}
