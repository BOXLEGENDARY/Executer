package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1605a;
import androidx.core.view.I;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.Z;
import c4.C1746b;
import c4.C1748d;
import c4.C1752h;
import c4.C1755k;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.u;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.c;
import d4.C2388a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import k4.C2517a;
import q0.C2731a;
import r4.C2754c;
import u4.C2937g;
import x4.C2990a;
import y0.C3019t;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    private final int f18374a;

    private final int f18375b;

    private final int f18376c;

    private final TimeInterpolator f18377d;

    private final TimeInterpolator f18378e;

    private final TimeInterpolator f18379f;

    private final ViewGroup f18380g;

    private final Context f18381h;

    protected final t f18382i;

    private final com.google.android.material.snackbar.a f18383j;

    private int f18384k;

    private boolean f18385l;

    private q f18386m;

    private int f18389p;

    private int f18390q;

    private int f18391r;

    private int f18392s;

    private int f18393t;

    private int f18394u;

    private boolean f18395v;

    private List<r<B>> f18396w;

    private Behavior f18397x;

    private final AccessibilityManager f18398y;

    private static final TimeInterpolator f18367A = C2388a.f20313b;

    private static final TimeInterpolator f18368B = C2388a.f20312a;

    private static final TimeInterpolator f18369C = C2388a.f20315d;

    private static final boolean f18371E = false;

    private static final int[] f18372F = {C1746b.f12724T};

    private static final String f18373G = BaseTransientBottomBar.class.getSimpleName();

    static final Handler f18370D = new Handler(Looper.getMainLooper(), new h());

    private boolean f18387n = false;

    private final Runnable f18388o = new i();

    c.b f18399z = new l();

    public static class Behavior extends SwipeDismissBehavior<View> {

        private final s f18400l = new s(this);

        public void Q(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f18400l.c(baseTransientBottomBar);
        }

        @Override
        public boolean F(View view) {
            return this.f18400l.a(view);
        }

        @Override
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f18400l.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    class a extends AnimatorListenerAdapter {

        final int f18401a;

        a(int i7) {
            this.f18401a = i7;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.R(this.f18401a);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f18382i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f18382i.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f18382i.setScaleY(fFloatValue);
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.S();
        }

        @Override
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f18383j.a(BaseTransientBottomBar.this.f18376c - BaseTransientBottomBar.this.f18374a, BaseTransientBottomBar.this.f18374a);
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {

        private int f18406a;

        final int f18407b;

        e(int i7) {
            this.f18407b = i7;
            this.f18406a = i7;
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f18371E) {
                Z.Y(BaseTransientBottomBar.this.f18382i, iIntValue - this.f18406a);
            } else {
                BaseTransientBottomBar.this.f18382i.setTranslationY(iIntValue);
            }
            this.f18406a = iIntValue;
        }
    }

    class f extends AnimatorListenerAdapter {

        final int f18409a;

        f(int i7) {
            this.f18409a = i7;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.R(this.f18409a);
        }

        @Override
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f18383j.b(0, BaseTransientBottomBar.this.f18375b);
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {

        private int f18411a = 0;

        g() {
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f18371E) {
                Z.Y(BaseTransientBottomBar.this.f18382i, iIntValue - this.f18411a);
            } else {
                BaseTransientBottomBar.this.f18382i.setTranslationY(iIntValue);
            }
            this.f18411a = iIntValue;
        }
    }

    class h implements Handler.Callback {
        h() {
        }

        @Override
        public boolean handleMessage(Message message) {
            int i7 = message.what;
            if (i7 == 0) {
                ((BaseTransientBottomBar) message.obj).a0();
                return true;
            }
            if (i7 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).L(message.arg1);
            return true;
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f18382i == null || baseTransientBottomBar.f18381h == null) {
                return;
            }
            int iHeight = (u.a(BaseTransientBottomBar.this.f18381h).height() - BaseTransientBottomBar.this.J()) + ((int) BaseTransientBottomBar.this.f18382i.getTranslationY());
            if (iHeight >= BaseTransientBottomBar.this.f18393t) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f18394u = baseTransientBottomBar2.f18393t;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f18382i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f18373G, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f18394u = baseTransientBottomBar3.f18393t;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f18393t - iHeight;
            BaseTransientBottomBar.this.f18382i.requestLayout();
        }
    }

    class j implements I {
        j() {
        }

        @Override
        public WindowInsetsCompat K(View view, WindowInsetsCompat windowInsetsCompat) {
            BaseTransientBottomBar.this.f18389p = windowInsetsCompat.getSystemWindowInsetBottom();
            BaseTransientBottomBar.this.f18390q = windowInsetsCompat.getSystemWindowInsetLeft();
            BaseTransientBottomBar.this.f18391r = windowInsetsCompat.getSystemWindowInsetRight();
            BaseTransientBottomBar.this.g0();
            return windowInsetsCompat;
        }
    }

    class k extends C1605a {
        k() {
        }

        @Override
        public void g(View view, C3019t c3019t) {
            super.g(view, c3019t);
            c3019t.a(1048576);
            c3019t.j0(true);
        }

        @Override
        public boolean j(View view, int i7, Bundle bundle) {
            if (i7 != 1048576) {
                return super.j(view, i7, bundle);
            }
            BaseTransientBottomBar.this.A();
            return true;
        }
    }

    class l implements c.b {
        l() {
        }

        @Override
        public void a(int i7) {
            Handler handler = BaseTransientBottomBar.f18370D;
            handler.sendMessage(handler.obtainMessage(1, i7, 0, BaseTransientBottomBar.this));
        }

        @Override
        public void show() {
            Handler handler = BaseTransientBottomBar.f18370D;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    class m implements Runnable {
        m() {
        }

        @Override
        public void run() {
            BaseTransientBottomBar.this.R(3);
        }
    }

    class n implements SwipeDismissBehavior.c {
        n() {
        }

        @Override
        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.B(0);
        }

        @Override
        public void b(int i7) {
            if (i7 == 0) {
                com.google.android.material.snackbar.c.c().k(BaseTransientBottomBar.this.f18399z);
            } else if (i7 == 1 || i7 == 2) {
                com.google.android.material.snackbar.c.c().j(BaseTransientBottomBar.this.f18399z);
            }
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override
        public void run() {
            t tVar = BaseTransientBottomBar.this.f18382i;
            if (tVar == null) {
                return;
            }
            if (tVar.getParent() != null) {
                BaseTransientBottomBar.this.f18382i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f18382i.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.c0();
            } else {
                BaseTransientBottomBar.this.e0();
            }
        }
    }

    class p extends AnimatorListenerAdapter {
        p() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.S();
        }
    }

    static class q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        private final WeakReference<BaseTransientBottomBar> f18421d;

        private final WeakReference<View> f18422e;

        private q(BaseTransientBottomBar baseTransientBottomBar, View view) {
            this.f18421d = new WeakReference<>(baseTransientBottomBar);
            this.f18422e = new WeakReference<>(view);
        }

        static q a(BaseTransientBottomBar baseTransientBottomBar, View view) {
            q qVar = new q(baseTransientBottomBar, view);
            if (Z.Q(view)) {
                com.google.android.material.internal.s.b(view, qVar);
            }
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        }

        private boolean d() {
            if (this.f18421d.get() != null) {
                return false;
            }
            c();
            return true;
        }

        View b() {
            return this.f18422e.get();
        }

        void c() {
            if (this.f18422e.get() != null) {
                this.f18422e.get().removeOnAttachStateChangeListener(this);
                com.google.android.material.internal.s.k(this.f18422e.get(), this);
            }
            this.f18422e.clear();
            this.f18421d.clear();
        }

        @Override
        public void onGlobalLayout() {
            if (d() || !this.f18421d.get().f18387n) {
                return;
            }
            this.f18421d.get().T();
        }

        @Override
        public void onViewAttachedToWindow(View view) {
            if (d()) {
                return;
            }
            com.google.android.material.internal.s.b(view, this);
        }

        @Override
        public void onViewDetachedFromWindow(View view) {
            if (d()) {
                return;
            }
            com.google.android.material.internal.s.k(view, this);
        }
    }

    public static abstract class r<B> {
        public void a(B b2, int i7) {
        }

        public void b(B b2) {
        }
    }

    public static class s {

        private c.b f18423a;

        public s(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.M(0.1f);
            swipeDismissBehavior.K(0.6f);
            swipeDismissBehavior.N(0);
        }

        public boolean a(View view) {
            return view instanceof t;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.v(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.c.c().j(this.f18423a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.c.c().k(this.f18423a);
            }
        }

        public void c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f18423a = baseTransientBottomBar.f18399z;
        }
    }

    protected static class t extends FrameLayout {

        private static final View.OnTouchListener f18424E = new a();

        private ColorStateList f18425A;

        private PorterDuff.Mode f18426B;

        private Rect f18427C;

        private boolean f18428D;

        private BaseTransientBottomBar<?> f18429d;

        u4.k f18430e;

        private int f18431i;

        private final float f18432v;

        private final float f18433w;

        private final int f18434y;

        private final int f18435z;

        class a implements View.OnTouchListener {
            a() {
            }

            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected t(Context context, AttributeSet attributeSet) {
            super(C2990a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C1755k.f13042L5);
            if (typedArrayObtainStyledAttributes.hasValue(C1755k.f13084S5)) {
                Z.v0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(r2, 0));
            }
            this.f18431i = typedArrayObtainStyledAttributes.getInt(C1755k.f13060O5, 0);
            if (typedArrayObtainStyledAttributes.hasValue(C1755k.f13094U5) || typedArrayObtainStyledAttributes.hasValue(C1755k.f13099V5)) {
                this.f18430e = u4.k.e(context2, attributeSet, 0, 0).m();
            }
            this.f18432v = typedArrayObtainStyledAttributes.getFloat(C1755k.f13066P5, 1.0f);
            setBackgroundTintList(C2754c.a(context2, typedArrayObtainStyledAttributes, C1755k.f13072Q5));
            setBackgroundTintMode(com.google.android.material.internal.s.j(typedArrayObtainStyledAttributes.getInt(C1755k.f13078R5, -1), PorterDuff.Mode.SRC_IN));
            this.f18433w = typedArrayObtainStyledAttributes.getFloat(C1755k.f13054N5, 1.0f);
            this.f18434y = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1755k.f13048M5, -1);
            this.f18435z = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1755k.f13089T5, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f18424E);
            setFocusable(true);
            if (getBackground() == null) {
                Z.r0(this, d());
            }
        }

        private Drawable d() {
            int iK = C2517a.k(this, C1746b.f12751n, C1746b.f12746i, getBackgroundOverlayColorAlpha());
            u4.k kVar = this.f18430e;
            Drawable drawableZ = kVar != null ? BaseTransientBottomBar.z(iK, kVar) : BaseTransientBottomBar.y(iK, getResources());
            if (this.f18425A == null) {
                return C2731a.r(drawableZ);
            }
            Drawable drawableR = C2731a.r(drawableZ);
            C2731a.o(drawableR, this.f18425A);
            return drawableR;
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f18427C = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f18429d = baseTransientBottomBar;
        }

        void c(ViewGroup viewGroup) {
            this.f18428D = true;
            viewGroup.addView(this);
            this.f18428D = false;
        }

        float getActionTextColorAlpha() {
            return this.f18433w;
        }

        int getAnimationMode() {
            return this.f18431i;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f18432v;
        }

        int getMaxInlineActionWidth() {
            return this.f18435z;
        }

        int getMaxWidth() {
            return this.f18434y;
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f18429d;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.O();
            }
            Z.k0(this);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f18429d;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.P();
            }
        }

        @Override
        protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
            super.onLayout(z7, i7, i8, i9, i10);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f18429d;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.Q();
            }
        }

        @Override
        protected void onMeasure(int i7, int i8) {
            super.onMeasure(i7, i8);
            if (this.f18434y > 0) {
                int measuredWidth = getMeasuredWidth();
                int i9 = this.f18434y;
                if (measuredWidth > i9) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), i8);
                }
            }
        }

        void setAnimationMode(int i7) {
            this.f18431i = i7;
        }

        @Override
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f18425A != null) {
                drawable = C2731a.r(drawable.mutate());
                C2731a.o(drawable, this.f18425A);
                C2731a.p(drawable, this.f18426B);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f18425A = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = C2731a.r(getBackground().mutate());
                C2731a.o(drawableR, colorStateList);
                C2731a.p(drawableR, this.f18426B);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f18426B = mode;
            if (getBackground() != null) {
                Drawable drawableR = C2731a.r(getBackground().mutate());
                C2731a.p(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f18428D || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f18429d;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.g0();
            }
        }

        @Override
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f18424E);
            super.setOnClickListener(onClickListener);
        }
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f18380g = viewGroup;
        this.f18383j = aVar;
        this.f18381h = context;
        com.google.android.material.internal.p.a(context);
        t tVar = (t) LayoutInflater.from(context).inflate(H(), viewGroup, false);
        this.f18382i = tVar;
        tVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.c(tVar.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(tVar.getMaxInlineActionWidth());
        }
        tVar.addView(view);
        Z.p0(tVar, 1);
        Z.x0(tVar, 1);
        Z.w0(tVar, true);
        Z.B0(tVar, new j());
        Z.n0(tVar, new k());
        this.f18398y = (AccessibilityManager) context.getSystemService("accessibility");
        int i7 = C1746b.f12708D;
        this.f18376c = p4.e.f(context, i7, 250);
        this.f18374a = p4.e.f(context, i7, 150);
        this.f18375b = p4.e.f(context, C1746b.f12709E, 75);
        int i8 = C1746b.f12718N;
        this.f18377d = p4.e.g(context, i8, f18368B);
        this.f18379f = p4.e.g(context, i8, f18369C);
        this.f18378e = p4.e.g(context, i8, f18367A);
    }

    private ValueAnimator C(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f18377d);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    private ValueAnimator G(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f18379f);
        valueAnimatorOfFloat.addUpdateListener(new c());
        return valueAnimatorOfFloat;
    }

    private int I() {
        int height = this.f18382i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f18382i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public int J() {
        int[] iArr = new int[2];
        this.f18382i.getLocationInWindow(iArr);
        return iArr[1] + this.f18382i.getHeight();
    }

    private boolean N() {
        ViewGroup.LayoutParams layoutParams = this.f18382i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    public void T() {
        this.f18392s = x();
        g0();
    }

    private void W(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehaviorF = this.f18397x;
        if (swipeDismissBehaviorF == null) {
            swipeDismissBehaviorF = F();
        }
        if (swipeDismissBehaviorF instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorF).Q(this);
        }
        swipeDismissBehaviorF.L(new n());
        fVar.o(swipeDismissBehaviorF);
        if (D() == null) {
            fVar.f10336g = 80;
        }
    }

    private boolean Y() {
        return this.f18393t > 0 && !this.f18385l && N();
    }

    private void b0() {
        if (X()) {
            v();
            return;
        }
        if (this.f18382i.getParent() != null) {
            this.f18382i.setVisibility(0);
        }
        S();
    }

    public void c0() {
        ValueAnimator valueAnimatorC = C(0.0f, 1.0f);
        ValueAnimator valueAnimatorG = G(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorC, valueAnimatorG);
        animatorSet.setDuration(this.f18374a);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    private void d0(int i7) {
        ValueAnimator valueAnimatorC = C(1.0f, 0.0f);
        valueAnimatorC.setDuration(this.f18375b);
        valueAnimatorC.addListener(new a(i7));
        valueAnimatorC.start();
    }

    public void e0() {
        int I2 = I();
        if (f18371E) {
            Z.Y(this.f18382i, I2);
        } else {
            this.f18382i.setTranslationY(I2);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(I2, 0);
        valueAnimator.setInterpolator(this.f18378e);
        valueAnimator.setDuration(this.f18376c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(I2));
        valueAnimator.start();
    }

    private void f0(int i7) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, I());
        valueAnimator.setInterpolator(this.f18378e);
        valueAnimator.setDuration(this.f18376c);
        valueAnimator.addListener(new f(i7));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    public void g0() {
        ViewGroup.LayoutParams layoutParams = this.f18382i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(f18373G, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f18382i.f18427C == null) {
            Log.w(f18373G, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.f18382i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i7 = this.f18382i.f18427C.bottom + (D() != null ? this.f18392s : this.f18389p);
        int i8 = this.f18382i.f18427C.left + this.f18390q;
        int i9 = this.f18382i.f18427C.right + this.f18391r;
        int i10 = this.f18382i.f18427C.top;
        boolean z7 = (marginLayoutParams.bottomMargin == i7 && marginLayoutParams.leftMargin == i8 && marginLayoutParams.rightMargin == i9 && marginLayoutParams.topMargin == i10) ? false : true;
        if (z7) {
            marginLayoutParams.bottomMargin = i7;
            marginLayoutParams.leftMargin = i8;
            marginLayoutParams.rightMargin = i9;
            marginLayoutParams.topMargin = i10;
            this.f18382i.requestLayout();
        }
        if ((z7 || this.f18394u != this.f18393t) && Build.VERSION.SDK_INT >= 29 && Y()) {
            this.f18382i.removeCallbacks(this.f18388o);
            this.f18382i.post(this.f18388o);
        }
    }

    private void w(int i7) {
        if (this.f18382i.getAnimationMode() == 1) {
            d0(i7);
        } else {
            f0(i7);
        }
    }

    private int x() {
        if (D() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        D().getLocationOnScreen(iArr);
        int i7 = iArr[1];
        int[] iArr2 = new int[2];
        this.f18380g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f18380g.getHeight()) - i7;
    }

    public static GradientDrawable y(int i7, Resources resources) throws Resources.NotFoundException {
        float dimension = resources.getDimension(C1748d.f12815h0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i7);
        return gradientDrawable;
    }

    public static C2937g z(int i7, u4.k kVar) {
        C2937g c2937g = new C2937g(kVar);
        c2937g.a0(ColorStateList.valueOf(i7));
        return c2937g;
    }

    public void A() {
        B(3);
    }

    protected void B(int i7) {
        com.google.android.material.snackbar.c.c().b(this.f18399z, i7);
    }

    public View D() {
        q qVar = this.f18386m;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    public int E() {
        return this.f18384k;
    }

    protected SwipeDismissBehavior<? extends View> F() {
        return new Behavior();
    }

    protected int H() {
        return K() ? C1752h.f12918s : C1752h.f12900a;
    }

    protected boolean K() {
        TypedArray typedArrayObtainStyledAttributes = this.f18381h.obtainStyledAttributes(f18372F);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    final void L(int i7) {
        if (X() && this.f18382i.getVisibility() == 0) {
            w(i7);
        } else {
            R(i7);
        }
    }

    public boolean M() {
        return com.google.android.material.snackbar.c.c().e(this.f18399z);
    }

    void O() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f18382i.getRootWindowInsets()) == null) {
            return;
        }
        this.f18393t = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        g0();
    }

    void P() {
        if (M()) {
            f18370D.post(new m());
        }
    }

    void Q() {
        if (this.f18395v) {
            b0();
            this.f18395v = false;
        }
    }

    void R(int i7) {
        com.google.android.material.snackbar.c.c().h(this.f18399z);
        List<r<B>> list = this.f18396w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f18396w.get(size).a(this, i7);
            }
        }
        ViewParent parent = this.f18382i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f18382i);
        }
    }

    void S() {
        com.google.android.material.snackbar.c.c().i(this.f18399z);
        List<r<B>> list = this.f18396w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f18396w.get(size).b(this);
            }
        }
    }

    public B U(View view) {
        q qVar = this.f18386m;
        if (qVar != null) {
            qVar.c();
        }
        this.f18386m = view == null ? null : q.a(this, view);
        return this;
    }

    public B V(int i7) {
        this.f18384k = i7;
        return this;
    }

    boolean X() {
        AccessibilityManager accessibilityManager = this.f18398y;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void Z() {
        com.google.android.material.snackbar.c.c().m(E(), this.f18399z);
    }

    final void a0() {
        if (this.f18382i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f18382i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                W((CoordinatorLayout.f) layoutParams);
            }
            this.f18382i.c(this.f18380g);
            T();
            this.f18382i.setVisibility(4);
        }
        if (Z.R(this.f18382i)) {
            b0();
        } else {
            this.f18395v = true;
        }
    }

    public B u(r<B> rVar) {
        if (rVar == null) {
            return this;
        }
        if (this.f18396w == null) {
            this.f18396w = new ArrayList();
        }
        this.f18396w.add(rVar);
        return this;
    }

    void v() {
        this.f18382i.post(new o());
    }
}
