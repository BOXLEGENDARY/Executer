package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Z;
import c4.C1754j;
import c4.C1755k;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import d4.C2395h;
import java.util.List;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    private static final int f17883S = C1754j.f12969v;

    static final Property<View, Float> f17884T = new a(Float.class, "width");

    static final Property<View, Float> f17885U = new b(Float.class, "height");

    static final Property<View, Float> f17886V = new c(Float.class, "paddingStart");

    static final Property<View, Float> f17887W = new d(Float.class, "paddingEnd");

    private final int f17888K;

    private int f17889L;

    private int f17890M;

    private final CoordinatorLayout.c<ExtendedFloatingActionButton> f17891N;

    private boolean f17892O;

    private boolean f17893P;

    private boolean f17894Q;

    protected ColorStateList f17895R;

    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override
        public void set(View view, Float f7) {
            view.getLayoutParams().width = f7.intValue();
            view.requestLayout();
        }
    }

    class b extends Property<View, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override
        public void set(View view, Float f7) {
            view.getLayoutParams().height = f7.intValue();
            view.requestLayout();
        }
    }

    class c extends Property<View, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override
        public Float get(View view) {
            return Float.valueOf(Z.E(view));
        }

        @Override
        public void set(View view, Float f7) {
            Z.C0(view, f7.intValue(), view.getPaddingTop(), Z.D(view), view.getPaddingBottom());
        }
    }

    class d extends Property<View, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override
        public Float get(View view) {
            return Float.valueOf(Z.D(view));
        }

        @Override
        public void set(View view, Float f7) {
            Z.C0(view, Z.E(view), view.getPaddingTop(), f7.intValue(), view.getPaddingBottom());
        }
    }

    public static abstract class e {
    }

    public void k(int i7, e eVar) {
        if (i7 == 0 || i7 == 1 || i7 == 2 || i7 == 3) {
            throw null;
        }
        throw new IllegalStateException("Unknown strategy type: " + i7);
    }

    private void l() {
        this.f17895R = getTextColors();
    }

    @Override
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.f17891N;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    int getCollapsedSize() {
        int i7 = this.f17888K;
        return i7 < 0 ? (Math.min(Z.E(this), Z.D(this)) * 2) + getIconSize() : i7;
    }

    public C2395h getExtendMotionSpec() {
        throw null;
    }

    public C2395h getHideMotionSpec() {
        throw null;
    }

    public C2395h getShowMotionSpec() {
        throw null;
    }

    public C2395h getShrinkMotionSpec() {
        throw null;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17892O && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f17892O = false;
            throw null;
        }
    }

    public void setAnimateShowBeforeLayout(boolean z7) {
        this.f17894Q = z7;
    }

    public void setExtendMotionSpec(C2395h c2395h) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i7) {
        setExtendMotionSpec(C2395h.c(getContext(), i7));
    }

    public void setExtended(boolean z7) {
        if (this.f17892O != z7) {
            throw null;
        }
    }

    public void setHideMotionSpec(C2395h c2395h) {
        throw null;
    }

    public void setHideMotionSpecResource(int i7) {
        setHideMotionSpec(C2395h.c(getContext(), i7));
    }

    @Override
    public void setPadding(int i7, int i8, int i9, int i10) {
        super.setPadding(i7, i8, i9, i10);
        if (!this.f17892O || this.f17893P) {
            return;
        }
        this.f17889L = Z.E(this);
        this.f17890M = Z.D(this);
    }

    @Override
    public void setPaddingRelative(int i7, int i8, int i9, int i10) {
        super.setPaddingRelative(i7, i8, i9, i10);
        if (!this.f17892O || this.f17893P) {
            return;
        }
        this.f17889L = i7;
        this.f17890M = i9;
    }

    public void setShowMotionSpec(C2395h c2395h) {
        throw null;
    }

    public void setShowMotionSpecResource(int i7) {
        setShowMotionSpec(C2395h.c(getContext(), i7));
    }

    public void setShrinkMotionSpec(C2395h c2395h) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i7) {
        setShrinkMotionSpec(C2395h.c(getContext(), i7));
    }

    @Override
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        l();
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        private Rect f17896a;

        private boolean f17897b;

        private boolean f17898c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f17897b = false;
            this.f17898c = true;
        }

        private static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f17897b || this.f17898c) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        private boolean L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f17896a == null) {
                this.f17896a = new Rect();
            }
            Rect rect = this.f17896a;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                K(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        private boolean M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                K(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        protected void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.k(this.f17898c ? 3 : 0, null);
        }

        @Override
        public boolean b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override
        public boolean h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!G(view)) {
                return false;
            }
            M(view, extendedFloatingActionButton);
            return false;
        }

        @Override
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i7) {
            List<View> listL = coordinatorLayout.l(extendedFloatingActionButton);
            int size = listL.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = listL.get(i8);
                if (!(view instanceof AppBarLayout)) {
                    if (G(view) && M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.C(extendedFloatingActionButton, i7);
            return true;
        }

        protected void K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.k(this.f17898c ? 2 : 1, null);
        }

        @Override
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f10337h == 0) {
                fVar.f10337h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1755k.D1);
            this.f17897b = typedArrayObtainStyledAttributes.getBoolean(C1755k.E1, false);
            this.f17898c = typedArrayObtainStyledAttributes.getBoolean(C1755k.F1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        l();
    }
}
