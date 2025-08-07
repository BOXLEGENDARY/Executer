package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Z;
import c4.C1746b;
import c4.C1748d;
import c4.C1754j;
import c4.C1755k;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.b;
import com.google.android.material.internal.p;
import com.google.android.material.internal.s;
import com.google.android.material.internal.t;
import com.google.android.material.stateful.ExtendableSavedState;
import d4.C2395h;
import d4.InterfaceC2398k;
import java.util.List;
import n4.InterfaceC2669a;
import q0.C2731a;
import r4.C2754c;
import u4.k;
import u4.n;
import x0.g;
import x4.C2990a;

public class FloatingActionButton extends t implements InterfaceC2669a, n, CoordinatorLayout.b {

    private static final int f17899K = C1754j.f12954g;

    private int f17900A;

    private int f17901B;

    private int f17902C;

    private int f17903D;

    boolean f17904E;

    final Rect f17905F;

    private final Rect f17906G;

    private final AppCompatImageHelper f17907H;

    private final n4.b f17908I;

    private com.google.android.material.floatingactionbutton.b f17909J;

    private ColorStateList f17910e;

    private PorterDuff.Mode f17911i;

    private ColorStateList f17912v;

    private PorterDuff.Mode f17913w;

    private ColorStateList f17914y;

    private int f17915z;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, floatingActionButton, rect);
        }

        @Override
        public boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.h(coordinatorLayout, floatingActionButton, view);
        }

        @Override
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i7) {
            return super.l(coordinatorLayout, floatingActionButton, i7);
        }

        @Override
        public void g(CoordinatorLayout.f fVar) {
            super.g(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    class a implements b.k {

        final b f17919a;

        a(b bVar) {
            this.f17919a = bVar;
        }

        @Override
        public void a() {
            this.f17919a.b(FloatingActionButton.this);
        }

        @Override
        public void b() {
            this.f17919a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    private class c implements t4.b {
        c() {
        }

        @Override
        public void a(int i7, int i8, int i9, int i10) {
            FloatingActionButton.this.f17905F.set(i7, i8, i9, i10);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i7 + floatingActionButton.f17902C, i8 + FloatingActionButton.this.f17902C, i9 + FloatingActionButton.this.f17902C, i10 + FloatingActionButton.this.f17902C);
        }

        @Override
        public boolean b() {
            return FloatingActionButton.this.f17904E;
        }

        @Override
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }
    }

    class d<T extends FloatingActionButton> implements b.j {
        d(InterfaceC2398k<T> interfaceC2398k) {
        }

        @Override
        public void a() {
            throw null;
        }

        @Override
        public void b() {
            throw null;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            throw null;
        }

        public int hashCode() {
            throw null;
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1746b.f12756s);
    }

    private com.google.android.material.floatingactionbutton.b getImpl() {
        if (this.f17909J == null) {
            this.f17909J = h();
        }
        return this.f17909J;
    }

    private com.google.android.material.floatingactionbutton.b h() {
        return new com.google.android.material.floatingactionbutton.c(this, new c());
    }

    private int k(int i7) {
        int i8 = this.f17901B;
        if (i8 != 0) {
            return i8;
        }
        Resources resources = getResources();
        return i7 != -1 ? i7 != 1 ? resources.getDimensionPixelSize(C1748d.f12804c) : resources.getDimensionPixelSize(C1748d.f12802b) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? k(1) : k(0);
    }

    private void l(Rect rect) {
        j(rect);
        int i7 = -this.f17909J.v();
        rect.inset(i7, i7);
    }

    private void q(Rect rect) {
        int i7 = rect.left;
        Rect rect2 = this.f17905F;
        rect.left = i7 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void r() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f17912v;
        if (colorStateList == null) {
            C2731a.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f17913w;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(colorForState, mode));
    }

    private b.k u(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    @Override
    public boolean a() {
        return this.f17908I.c();
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().E(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        getImpl().f(animatorListener);
    }

    public void g(InterfaceC2398k<? extends FloatingActionButton> interfaceC2398k) {
        getImpl().g(new d(interfaceC2398k));
    }

    @Override
    public ColorStateList getBackgroundTintList() {
        return this.f17910e;
    }

    @Override
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f17911i;
    }

    @Override
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().s();
    }

    public Drawable getContentBackground() {
        return getImpl().l();
    }

    public int getCustomSize() {
        return this.f17901B;
    }

    public int getExpandedComponentIdHint() {
        return this.f17908I.b();
    }

    public C2395h getHideMotionSpec() {
        return getImpl().o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f17914y;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f17914y;
    }

    public k getShapeAppearanceModel() {
        return (k) g.g(getImpl().t());
    }

    public C2395h getShowMotionSpec() {
        return getImpl().u();
    }

    public int getSize() {
        return this.f17900A;
    }

    int getSizeDimension() {
        return k(this.f17900A);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f17912v;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f17913w;
    }

    public boolean getUseCompatPadding() {
        return this.f17904E;
    }

    @Deprecated
    public boolean i(Rect rect) {
        if (!Z.R(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        q(rect);
        return true;
    }

    public void j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        q(rect);
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().A();
    }

    public void m(b bVar) {
        n(bVar, true);
    }

    void n(b bVar, boolean z7) {
        getImpl().w(u(bVar), z7);
    }

    public boolean o() {
        return getImpl().y();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().B();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().D();
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        int sizeDimension = getSizeDimension();
        this.f17902C = (sizeDimension - this.f17903D) / 2;
        getImpl().f0();
        int iMin = Math.min(View.resolveSize(sizeDimension, i7), View.resolveSize(sizeDimension, i8));
        Rect rect = this.f17905F;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.getSuperState());
        this.f17908I.d((Bundle) g.g(extendableSavedState.f18453d.get("expandableWidgetHelper")));
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        extendableSavedState.f18453d.put("expandableWidgetHelper", this.f17908I.e());
        return extendableSavedState;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            l(this.f17906G);
            if (!this.f17906G.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean p() {
        return getImpl().z();
    }

    public void s(b bVar) {
        t(bVar, true);
    }

    @Override
    public void setBackgroundColor(int i7) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override
    public void setBackgroundResource(int i7) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f17910e != colorStateList) {
            this.f17910e = colorStateList;
            getImpl().L(colorStateList);
        }
    }

    @Override
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f17911i != mode) {
            this.f17911i = mode;
            getImpl().M(mode);
        }
    }

    public void setCompatElevation(float f7) {
        getImpl().N(f7);
    }

    public void setCompatElevationResource(int i7) {
        setCompatElevation(getResources().getDimension(i7));
    }

    public void setCompatHoveredFocusedTranslationZ(float f7) {
        getImpl().Q(f7);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i7) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i7));
    }

    public void setCompatPressedTranslationZ(float f7) {
        getImpl().U(f7);
    }

    public void setCompatPressedTranslationZResource(int i7) {
        setCompatPressedTranslationZ(getResources().getDimension(i7));
    }

    public void setCustomSize(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i7 != this.f17901B) {
            this.f17901B = i7;
            requestLayout();
        }
    }

    @Override
    public void setElevation(float f7) {
        super.setElevation(f7);
        getImpl().g0(f7);
    }

    public void setEnsureMinTouchTargetSize(boolean z7) {
        if (z7 != getImpl().n()) {
            getImpl().O(z7);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i7) {
        this.f17908I.f(i7);
    }

    public void setHideMotionSpec(C2395h c2395h) {
        getImpl().P(c2395h);
    }

    public void setHideMotionSpecResource(int i7) {
        setHideMotionSpec(C2395h.c(getContext(), i7));
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().e0();
            if (this.f17912v != null) {
                r();
            }
        }
    }

    @Override
    public void setImageResource(int i7) {
        this.f17907H.setImageResource(i7);
        r();
    }

    public void setMaxImageSize(int i7) {
        this.f17903D = i7;
        getImpl().S(i7);
    }

    public void setRippleColor(int i7) {
        setRippleColor(ColorStateList.valueOf(i7));
    }

    @Override
    public void setScaleX(float f7) {
        super.setScaleX(f7);
        getImpl().I();
    }

    @Override
    public void setScaleY(float f7) {
        super.setScaleY(f7);
        getImpl().I();
    }

    public void setShadowPaddingEnabled(boolean z7) {
        getImpl().W(z7);
    }

    @Override
    public void setShapeAppearanceModel(k kVar) {
        getImpl().X(kVar);
    }

    public void setShowMotionSpec(C2395h c2395h) {
        getImpl().Y(c2395h);
    }

    public void setShowMotionSpecResource(int i7) {
        setShowMotionSpec(C2395h.c(getContext(), i7));
    }

    public void setSize(int i7) {
        this.f17901B = 0;
        if (i7 != this.f17900A) {
            this.f17900A = i7;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f17912v != colorStateList) {
            this.f17912v = colorStateList;
            r();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f17913w != mode) {
            this.f17913w = mode;
            r();
        }
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        getImpl().J();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        getImpl().J();
    }

    @Override
    public void setTranslationZ(float f7) {
        super.setTranslationZ(f7);
        getImpl().J();
    }

    public void setUseCompatPadding(boolean z7) {
        if (this.f17904E != z7) {
            this.f17904E = z7;
            getImpl().C();
        }
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
    }

    void t(b bVar, boolean z7) {
        getImpl().c0(u(bVar), z7);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        private Rect f17916a;

        private b f17917b;

        private boolean f17918c;

        public BaseBehavior() {
            this.f17918c = true;
        }

        private static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f17905F;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i7 = 0;
            int i8 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i7 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i7 = -rect.top;
            }
            if (i7 != 0) {
                Z.Y(floatingActionButton, i7);
            }
            if (i8 != 0) {
                Z.X(floatingActionButton, i8);
            }
        }

        private boolean J(View view, FloatingActionButton floatingActionButton) {
            return this.f17918c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f17916a == null) {
                this.f17916a = new Rect();
            }
            Rect rect = this.f17916a;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.n(this.f17917b, false);
                return true;
            }
            floatingActionButton.t(this.f17917b, false);
            return true;
        }

        private boolean L(View view, FloatingActionButton floatingActionButton) {
            if (!J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.n(this.f17917b, false);
                return true;
            }
            floatingActionButton.t(this.f17917b, false);
            return true;
        }

        @Override
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f17905F;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override
        public boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!F(view)) {
                return false;
            }
            L(view, floatingActionButton);
            return false;
        }

        @Override
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i7) {
            List<View> listL = coordinatorLayout.l(floatingActionButton);
            int size = listL.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = listL.get(i8);
                if (!(view instanceof AppBarLayout)) {
                    if (F(view) && L(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.C(floatingActionButton, i7);
            G(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f10337h == 0) {
                fVar.f10337h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1755k.W1);
            this.f17918c = typedArrayObtainStyledAttributes.getBoolean(C1755k.X1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i7) throws Resources.NotFoundException {
        int i8 = f17899K;
        super(C2990a.c(context, attributeSet, i7, i8), attributeSet, i7);
        this.f17905F = new Rect();
        this.f17906G = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = p.i(context2, attributeSet, C1755k.G1, i7, i8, new int[0]);
        this.f17910e = C2754c.a(context2, typedArrayI, C1755k.I1);
        this.f17911i = s.j(typedArrayI.getInt(C1755k.J1, -1), null);
        this.f17914y = C2754c.a(context2, typedArrayI, C1755k.T1);
        this.f17900A = typedArrayI.getInt(C1755k.O1, -1);
        this.f17901B = typedArrayI.getDimensionPixelSize(C1755k.N1, 0);
        this.f17915z = typedArrayI.getDimensionPixelSize(C1755k.K1, 0);
        float dimension = typedArrayI.getDimension(C1755k.L1, 0.0f);
        float dimension2 = typedArrayI.getDimension(C1755k.Q1, 0.0f);
        float dimension3 = typedArrayI.getDimension(C1755k.S1, 0.0f);
        this.f17904E = typedArrayI.getBoolean(C1755k.V1, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C1748d.f12803b0);
        setMaxImageSize(typedArrayI.getDimensionPixelSize(C1755k.R1, 0));
        C2395h c2395hB = C2395h.b(context2, typedArrayI, C1755k.U1);
        C2395h c2395hB2 = C2395h.b(context2, typedArrayI, C1755k.P1);
        k kVarM = k.g(context2, attributeSet, i7, i8, k.f23964m).m();
        boolean z7 = typedArrayI.getBoolean(C1755k.M1, false);
        setEnabled(typedArrayI.getBoolean(C1755k.H1, true));
        typedArrayI.recycle();
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.f17907H = appCompatImageHelper;
        appCompatImageHelper.loadFromAttributes(attributeSet, i7);
        this.f17908I = new n4.b(this);
        getImpl().X(kVarM);
        getImpl().x(this.f17910e, this.f17911i, this.f17914y, this.f17915z);
        getImpl().T(dimensionPixelSize);
        getImpl().N(dimension);
        getImpl().Q(dimension2);
        getImpl().U(dimension3);
        getImpl().Y(c2395hB);
        getImpl().P(c2395hB2);
        getImpl().O(z7);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f17914y != colorStateList) {
            this.f17914y = colorStateList;
            getImpl().V(this.f17914y);
        }
    }
}
