package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Z;
import androidx.customview.view.AbsSavedState;
import c4.C1746b;
import c4.C1748d;
import c4.C1749e;
import c4.C1754j;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.q;
import k4.C2517a;
import q0.C2731a;
import u4.C2937g;
import u4.h;

public class SearchBar extends Toolbar {

    private static final int f18286F = C1754j.f12958k;

    private Integer f18287A;

    private Drawable f18288B;

    private int f18289C;

    private boolean f18290D;

    private C2937g f18291E;

    private final TextView f18292d;

    private final boolean f18293e;

    private final boolean f18294i;

    private final Drawable f18295v;

    private final boolean f18296w;

    private final boolean f18297y;

    private View f18298z;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        String f18299d;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeString(this.f18299d);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f18299d = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private int a(int i7, int i8) {
        return i7 == 0 ? i8 : i7;
    }

    private void b() {
        View view = this.f18298z;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i7 = measuredWidth2 + measuredWidth;
        int measuredHeight = this.f18298z.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        c(this.f18298z, measuredWidth2, measuredHeight2, i7, measuredHeight2 + measuredHeight);
    }

    private void c(View view, int i7, int i8, int i9, int i10) {
        if (Z.z(this) == 1) {
            view.layout(getMeasuredWidth() - i9, i8, getMeasuredWidth() - i7, i10);
        } else {
            view.layout(i7, i8, i9, i10);
        }
    }

    private Drawable d(Drawable drawable) {
        int iD;
        if (!this.f18296w || drawable == null) {
            return drawable;
        }
        Integer num = this.f18287A;
        if (num != null) {
            iD = num.intValue();
        } else {
            iD = C2517a.d(this, drawable == this.f18295v ? C1746b.f12747j : C1746b.f12746i);
        }
        Drawable drawableR = C2731a.r(drawable.mutate());
        C2731a.n(drawableR, iD);
        return drawableR;
    }

    private void e(int i7, int i8) {
        View view = this.f18298z;
        if (view != null) {
            view.measure(i7, i8);
        }
    }

    private void f() throws Resources.NotFoundException {
        if (this.f18294i && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C1748d.f12830s);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = a(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = a(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = a(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = a(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    private void g() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z7 = getLayoutDirection() == 1;
        ImageButton imageButtonD = q.d(this);
        int width = (imageButtonD == null || !imageButtonD.isClickable()) ? 0 : z7 ? getWidth() - imageButtonD.getLeft() : imageButtonD.getRight();
        ActionMenuView actionMenuViewA = q.a(this);
        int right = actionMenuViewA != null ? z7 ? actionMenuViewA.getRight() : getWidth() - actionMenuViewA.getLeft() : 0;
        float f7 = -(z7 ? right : width);
        if (!z7) {
            width = right;
        }
        setHandwritingBoundsOffsets(f7, 0.0f, -width, 0.0f);
    }

    private void h() {
        if (getLayoutParams() instanceof AppBarLayout.d) {
            AppBarLayout.d dVar = (AppBarLayout.d) getLayoutParams();
            if (this.f18290D) {
                if (dVar.c() == 0) {
                    dVar.g(53);
                }
            } else if (dVar.c() == 53) {
                dVar.g(0);
            }
        }
    }

    private void setNavigationIconDecorative(boolean z7) {
        ImageButton imageButtonD = q.d(this);
        if (imageButtonD == null) {
            return;
        }
        imageButtonD.setClickable(!z7);
        imageButtonD.setFocusable(!z7);
        Drawable background = imageButtonD.getBackground();
        if (background != null) {
            this.f18288B = background;
        }
        imageButtonD.setBackgroundDrawable(z7 ? null : this.f18288B);
        g();
    }

    @Override
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (this.f18293e && this.f18298z == null && !(view instanceof ActionMenuView)) {
            this.f18298z = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i7, layoutParams);
    }

    public View getCenterView() {
        return this.f18298z;
    }

    float getCompatElevation() {
        C2937g c2937g = this.f18291E;
        return c2937g != null ? c2937g.w() : Z.u(this);
    }

    public float getCornerSize() {
        return this.f18291E.J();
    }

    protected int getDefaultMarginVerticalResource() {
        return C1748d.f12831t;
    }

    protected int getDefaultNavigationIconResource() {
        return C1749e.f12840c;
    }

    public CharSequence getHint() {
        return this.f18292d.getHint();
    }

    int getMenuResId() {
        return this.f18289C;
    }

    public int getStrokeColor() {
        return this.f18291E.F().getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.f18291E.H();
    }

    public CharSequence getText() {
        return this.f18292d.getText();
    }

    public TextView getTextView() {
        return this.f18292d;
    }

    @Override
    public void inflateMenu(int i7) {
        Menu menu = getMenu();
        boolean z7 = menu instanceof g;
        if (z7) {
            ((g) menu).d0();
        }
        super.inflateMenu(i7);
        this.f18289C = i7;
        if (z7) {
            ((g) menu).c0();
        }
    }

    @Override
    protected void onAttachedToWindow() throws Resources.NotFoundException {
        super.onAttachedToWindow();
        h.f(this, this.f18291E);
        f();
        h();
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        accessibilityNodeInfo.setHintText(getHint());
        accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        b();
        g();
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        e(i7, i8);
    }

    @Override
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.f18299d);
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.f18299d = text == null ? null : text.toString();
        return savedState;
    }

    public void setCenterView(View view) {
        View view2 = this.f18298z;
        if (view2 != null) {
            removeView(view2);
            this.f18298z = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z7) {
        this.f18290D = z7;
        h();
    }

    @Override
    public void setElevation(float f7) {
        super.setElevation(f7);
        C2937g c2937g = this.f18291E;
        if (c2937g != null) {
            c2937g.Z(f7);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.f18292d.setHint(charSequence);
    }

    @Override
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(d(drawable));
    }

    @Override
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.f18297y) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z7) {
        throw null;
    }

    public void setStrokeColor(int i7) {
        if (getStrokeColor() != i7) {
            this.f18291E.i0(ColorStateList.valueOf(i7));
        }
    }

    public void setStrokeWidth(float f7) {
        if (getStrokeWidth() != f7) {
            this.f18291E.j0(f7);
        }
    }

    @Override
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        this.f18292d.setText(charSequence);
    }

    @Override
    public void setTitle(CharSequence charSequence) {
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        private boolean f18300h;

        public ScrollingViewBehavior() {
            this.f18300h = false;
        }

        private void U(AppBarLayout appBarLayout) throws Resources.NotFoundException {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override
        protected boolean P() {
            return true;
        }

        @Override
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) throws Resources.NotFoundException {
            boolean zH = super.h(coordinatorLayout, view, view2);
            if (!this.f18300h && (view2 instanceof AppBarLayout)) {
                this.f18300h = true;
                U((AppBarLayout) view2);
            }
            return zH;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f18300h = false;
        }
    }

    public void setHint(int i7) {
        this.f18292d.setHint(i7);
    }

    public void setText(int i7) {
        this.f18292d.setText(i7);
    }
}
