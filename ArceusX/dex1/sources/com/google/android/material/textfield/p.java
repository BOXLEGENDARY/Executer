package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.Z;
import c4.C1746b;
import c4.C1749e;
import c4.C1753i;
import d4.C2388a;
import y0.C3002c;
import y0.C3019t;

class p extends s {

    private static final boolean f18578s = true;

    private final int f18579e;

    private final int f18580f;

    private final TimeInterpolator f18581g;

    private AutoCompleteTextView f18582h;

    private final View.OnClickListener f18583i;

    private final View.OnFocusChangeListener f18584j;

    private final C3002c.a f18585k;

    private boolean f18586l;

    private boolean f18587m;

    private boolean f18588n;

    private long f18589o;

    private AccessibilityManager f18590p;

    private ValueAnimator f18591q;

    private ValueAnimator f18592r;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f18592r.start();
        }
    }

    p(r rVar) {
        super(rVar);
        this.f18583i = new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f18574d.J(view);
            }
        };
        this.f18584j = new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view, boolean z7) {
                this.f18575a.K(view, z7);
            }
        };
        this.f18585k = new C3002c.a() {
            @Override
            public final void onTouchExplorationStateChanged(boolean z7) {
                this.f18576a.L(z7);
            }
        };
        this.f18589o = Long.MAX_VALUE;
        Context context = rVar.getContext();
        int i7 = C1746b.f12714J;
        this.f18580f = p4.e.f(context, i7, 67);
        this.f18579e = p4.e.f(rVar.getContext(), i7, 50);
        this.f18581g = p4.e.g(rVar.getContext(), C1746b.f12719O, C2388a.f20312a);
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i7, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f18581g);
        valueAnimatorOfFloat.setDuration(i7);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f18571a.I(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void F() {
        this.f18592r = E(this.f18580f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(this.f18579e, 1.0f, 0.0f);
        this.f18591q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    private boolean G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f18589o;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    public void H() {
        boolean zIsPopupShowing = this.f18582h.isPopupShowing();
        O(zIsPopupShowing);
        this.f18587m = zIsPopupShowing;
    }

    public void I(ValueAnimator valueAnimator) {
        this.f18627d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void J(View view) {
        Q();
    }

    public void K(View view, boolean z7) {
        this.f18586l = z7;
        r();
        if (z7) {
            return;
        }
        O(false);
        this.f18587m = false;
    }

    public void L(boolean z7) {
        AutoCompleteTextView autoCompleteTextView = this.f18582h;
        if (autoCompleteTextView == null || q.a(autoCompleteTextView)) {
            return;
        }
        Z.x0(this.f18627d, z7 ? 2 : 1);
    }

    public boolean M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (G()) {
                this.f18587m = false;
            }
            Q();
            R();
        }
        return false;
    }

    public void N() {
        R();
        O(false);
    }

    private void O(boolean z7) {
        if (this.f18588n != z7) {
            this.f18588n = z7;
            this.f18592r.cancel();
            this.f18591q.start();
        }
    }

    private void P() {
        this.f18582h.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f18572d.M(view, motionEvent);
            }
        });
        if (f18578s) {
            this.f18582h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() {
                @Override
                public final void onDismiss() {
                    this.f18573a.N();
                }
            });
        }
        this.f18582h.setThreshold(0);
    }

    private void Q() {
        if (this.f18582h == null) {
            return;
        }
        if (G()) {
            this.f18587m = false;
        }
        if (this.f18587m) {
            this.f18587m = false;
            return;
        }
        if (f18578s) {
            O(!this.f18588n);
        } else {
            this.f18588n = !this.f18588n;
            r();
        }
        if (!this.f18588n) {
            this.f18582h.dismissDropDown();
        } else {
            this.f18582h.requestFocus();
            this.f18582h.showDropDown();
        }
    }

    private void R() {
        this.f18587m = true;
        this.f18589o = System.currentTimeMillis();
    }

    @Override
    public void a(Editable editable) {
        if (this.f18590p.isTouchExplorationEnabled() && q.a(this.f18582h) && !this.f18627d.hasFocus()) {
            this.f18582h.dismissDropDown();
        }
        this.f18582h.post(new Runnable() {
            @Override
            public final void run() {
                this.f18577d.H();
            }
        });
    }

    @Override
    int c() {
        return C1753i.f12928g;
    }

    @Override
    int d() {
        return f18578s ? C1749e.f12847j : C1749e.f12848k;
    }

    @Override
    View.OnFocusChangeListener e() {
        return this.f18584j;
    }

    @Override
    View.OnClickListener f() {
        return this.f18583i;
    }

    @Override
    public C3002c.a h() {
        return this.f18585k;
    }

    @Override
    boolean i(int i7) {
        return i7 != 0;
    }

    @Override
    boolean j() {
        return true;
    }

    @Override
    boolean k() {
        return this.f18586l;
    }

    @Override
    boolean l() {
        return true;
    }

    @Override
    boolean m() {
        return this.f18588n;
    }

    @Override
    public void n(EditText editText) {
        this.f18582h = D(editText);
        P();
        this.f18624a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f18590p.isTouchExplorationEnabled()) {
            Z.x0(this.f18627d, 2);
        }
        this.f18624a.setEndIconVisible(true);
    }

    @Override
    public void o(View view, C3019t c3019t) {
        if (!q.a(this.f18582h)) {
            c3019t.e0(Spinner.class.getName());
        }
        if (c3019t.P()) {
            c3019t.p0(null);
        }
    }

    @Override
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f18590p.isEnabled() || q.a(this.f18582h)) {
            return;
        }
        boolean z7 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f18588n && !this.f18582h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z7) {
            Q();
            R();
        }
    }

    @Override
    void s() {
        F();
        this.f18590p = (AccessibilityManager) this.f18626c.getSystemService("accessibility");
    }

    @Override
    boolean t() {
        return true;
    }

    @Override
    void u() {
        AutoCompleteTextView autoCompleteTextView = this.f18582h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f18578s) {
                this.f18582h.setOnDismissListener(null);
            }
        }
    }
}
