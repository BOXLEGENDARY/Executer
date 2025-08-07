package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.C1605a;
import androidx.core.view.C1646v;
import androidx.core.view.Z;
import androidx.customview.view.AbsSavedState;
import androidx.transition.C1721e;
import c4.C1746b;
import c4.C1747c;
import c4.C1748d;
import c4.C1750f;
import c4.C1753i;
import c4.C1754j;
import c4.C1755k;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.internal.CheckableImageButton;
import d4.C2388a;
import h.C2473a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k4.C2517a;
import q0.C2731a;
import r4.C2754c;
import u4.C2937g;
import u4.k;
import w0.C2962a;
import x4.C2990a;
import y0.C3019t;

public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final int V0 = C1754j.f12956i;

    private static final int[][] f18469W0 = {new int[]{R.attr.state_pressed}, new int[0]};

    private int f18470A;

    private Drawable f18471A0;

    private int f18472B;

    private ColorStateList f18473B0;

    private final u f18474C;

    private ColorStateList f18475C0;

    boolean f18476D;

    private int f18477D0;

    private int f18478E;

    private int f18479E0;

    private boolean f18480F;

    private int f18481F0;

    private e f18482G;

    private ColorStateList f18483G0;

    private TextView f18484H;

    private int f18485H0;

    private int f18486I;

    private int f18487I0;

    private int f18488J;

    private int f18489J0;

    private CharSequence f18490K;

    private int f18491K0;

    private boolean f18492L;

    private int f18493L0;

    private TextView f18494M;

    int f18495M0;

    private ColorStateList f18496N;

    private boolean f18497N0;

    private int f18498O;

    final com.google.android.material.internal.a f18499O0;

    private C1721e f18500P;

    private boolean f18501P0;

    private C1721e f18502Q;

    private boolean f18503Q0;

    private ColorStateList f18504R;

    private ValueAnimator f18505R0;

    private ColorStateList f18506S;

    private boolean f18507S0;

    private ColorStateList f18508T;
    private boolean T0;

    private ColorStateList f18509U;
    private boolean U0;

    private boolean f18510V;

    private CharSequence f18511W;

    private boolean f18512a0;

    private C2937g f18513b0;

    private C2937g f18514c0;

    private final FrameLayout f18515d;

    private StateListDrawable f18516d0;

    private final y f18517e;

    private boolean f18518e0;

    private C2937g f18519f0;

    private C2937g f18520g0;

    private u4.k f18521h0;

    private final r f18522i;

    private boolean f18523i0;

    private final int f18524j0;

    private int f18525k0;

    private int f18526l0;

    private int f18527m0;

    private int f18528n0;

    private int f18529o0;

    private int f18530p0;

    private int f18531q0;

    private final Rect f18532r0;

    private final Rect f18533s0;

    private final RectF f18534t0;

    private Typeface f18535u0;

    EditText f18536v;

    private Drawable f18537v0;

    private CharSequence f18538w;

    private int f18539w0;

    private final LinkedHashSet<f> f18540x0;

    private int f18541y;

    private Drawable f18542y0;

    private int f18543z;

    private int f18544z0;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        CharSequence f18545d;

        boolean f18546e;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
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

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f18545d) + "}";
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            TextUtils.writeToParcel(this.f18545d, parcel, i7);
            parcel.writeInt(this.f18546e ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f18545d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f18546e = parcel.readInt() == 1;
        }
    }

    class a implements TextWatcher {

        int f18547d;

        final EditText f18548e;

        a(EditText editText) {
            this.f18548e = editText;
            this.f18547d = editText.getLineCount();
        }

        @Override
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.v0(!r0.T0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f18476D) {
                textInputLayout.l0(editable);
            }
            if (TextInputLayout.this.f18492L) {
                TextInputLayout.this.z0(editable);
            }
            int lineCount = this.f18548e.getLineCount();
            int i7 = this.f18547d;
            if (lineCount != i7) {
                if (lineCount < i7) {
                    int iA = Z.A(this.f18548e);
                    int i8 = TextInputLayout.this.f18495M0;
                    if (iA != i8) {
                        this.f18548e.setMinimumHeight(i8);
                    }
                }
                this.f18547d = lineCount;
            }
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override
        public void run() {
            TextInputLayout.this.f18522i.h();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f18499O0.c0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends C1605a {

        private final TextInputLayout f18552d;

        public d(TextInputLayout textInputLayout) {
            this.f18552d = textInputLayout;
        }

        @Override
        public void g(View view, C3019t c3019t) {
            super.g(view, c3019t);
            EditText editText = this.f18552d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f18552d.getHint();
            CharSequence error = this.f18552d.getError();
            CharSequence placeholderText = this.f18552d.getPlaceholderText();
            int counterMaxLength = this.f18552d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f18552d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zP = this.f18552d.P();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z7 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : BuildConfig.FLAVOR;
            this.f18552d.f18517e.A(c3019t);
            if (!zIsEmpty) {
                c3019t.B0(text);
            } else if (!TextUtils.isEmpty(string)) {
                c3019t.B0(string);
                if (!zP && placeholderText != null) {
                    c3019t.B0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                c3019t.B0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                c3019t.p0(string);
                c3019t.y0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            c3019t.r0(counterMaxLength);
            if (z7) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                c3019t.l0(error);
            }
            View viewT = this.f18552d.f18474C.t();
            if (viewT != null) {
                c3019t.q0(viewT);
            }
            this.f18552d.f18522i.m().o(view, c3019t);
        }

        @Override
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f18552d.f18522i.m().p(view, accessibilityEvent);
        }
    }

    public interface e {
        int a(Editable editable);
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i7);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1746b.f12740e0);
    }

    private C1721e A() {
        C1721e c1721e = new C1721e();
        c1721e.g0(p4.e.f(getContext(), C1746b.f12713I, 87));
        c1721e.i0(p4.e.g(getContext(), C1746b.f12719O, C2388a.f20312a));
        return c1721e;
    }

    private void A0(boolean z7, boolean z8) {
        int defaultColor = this.f18483G0.getDefaultColor();
        int colorForState = this.f18483G0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f18483G0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z7) {
            this.f18530p0 = colorForState2;
        } else if (z8) {
            this.f18530p0 = colorForState;
        } else {
            this.f18530p0 = defaultColor;
        }
    }

    private boolean B() {
        return this.f18510V && !TextUtils.isEmpty(this.f18511W) && (this.f18513b0 instanceof h);
    }

    private void C() {
        Iterator<f> it = this.f18540x0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void D(Canvas canvas) {
        C2937g c2937g;
        if (this.f18520g0 == null || (c2937g = this.f18519f0) == null) {
            return;
        }
        c2937g.draw(canvas);
        if (this.f18536v.isFocused()) {
            Rect bounds = this.f18520g0.getBounds();
            Rect bounds2 = this.f18519f0.getBounds();
            float fX = this.f18499O0.x();
            int iCenterX = bounds2.centerX();
            bounds.left = C2388a.c(iCenterX, bounds2.left, fX);
            bounds.right = C2388a.c(iCenterX, bounds2.right, fX);
            this.f18520g0.draw(canvas);
        }
    }

    private void E(Canvas canvas) {
        if (this.f18510V) {
            this.f18499O0.l(canvas);
        }
    }

    private void F(boolean z7) {
        ValueAnimator valueAnimator = this.f18505R0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f18505R0.cancel();
        }
        if (z7 && this.f18503Q0) {
            l(0.0f);
        } else {
            this.f18499O0.c0(0.0f);
        }
        if (B() && ((h) this.f18513b0).q0()) {
            y();
        }
        this.f18497N0 = true;
        L();
        this.f18517e.l(true);
        this.f18522i.H(true);
    }

    private C2937g G(boolean z7) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(C1748d.f12813g0);
        float f7 = z7 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f18536v;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(C1748d.f12829r);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C1748d.f12801a0);
        u4.k kVarM = u4.k.a().A(f7).E(f7).s(dimensionPixelOffset).w(dimensionPixelOffset).m();
        EditText editText2 = this.f18536v;
        C2937g c2937gM = C2937g.m(getContext(), popupElevation, editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null);
        c2937gM.setShapeAppearanceModel(kVarM);
        c2937gM.c0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return c2937gM;
    }

    private static Drawable H(C2937g c2937g, int i7, int i8, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{C2517a.j(i8, i7, 0.1f), i7}), c2937g, c2937g);
    }

    private int I(int i7, boolean z7) {
        return i7 + ((z7 || getPrefixText() == null) ? (!z7 || getSuffixText() == null) ? this.f18536v.getCompoundPaddingLeft() : this.f18522i.y() : this.f18517e.c());
    }

    private int J(int i7, boolean z7) {
        return i7 - ((z7 || getSuffixText() == null) ? (!z7 || getPrefixText() == null) ? this.f18536v.getCompoundPaddingRight() : this.f18517e.c() : this.f18522i.y());
    }

    private static Drawable K(Context context, C2937g c2937g, int i7, int[][] iArr) {
        int iC = C2517a.c(context, C1746b.f12751n, "TextInputLayout");
        C2937g c2937g2 = new C2937g(c2937g.E());
        int iJ = C2517a.j(i7, iC, 0.1f);
        c2937g2.a0(new ColorStateList(iArr, new int[]{iJ, 0}));
        c2937g2.setTint(iC);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iJ, iC});
        C2937g c2937g3 = new C2937g(c2937g.E());
        c2937g3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c2937g2, c2937g3), c2937g});
    }

    private void L() {
        TextView textView = this.f18494M;
        if (textView == null || !this.f18492L) {
            return;
        }
        textView.setText((CharSequence) null);
        androidx.transition.x.a(this.f18515d, this.f18502Q);
        this.f18494M.setVisibility(4);
    }

    private boolean Q() {
        return e0() || (this.f18484H != null && this.f18480F);
    }

    private boolean S() {
        return this.f18525k0 == 1 && this.f18536v.getMinLines() <= 1;
    }

    public static int T(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    public void U() {
        this.f18536v.requestLayout();
    }

    private void V() {
        p();
        s0();
        B0();
        i0();
        k();
        if (this.f18525k0 != 0) {
            u0();
        }
        c0();
    }

    private void W() {
        if (B()) {
            RectF rectF = this.f18534t0;
            this.f18499O0.o(rectF, this.f18536v.getWidth(), this.f18536v.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            o(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f18527m0);
            ((h) this.f18513b0).t0(rectF);
        }
    }

    private void X() {
        if (!B() || this.f18497N0) {
            return;
        }
        y();
        W();
    }

    private static void Y(ViewGroup viewGroup, boolean z7) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            childAt.setEnabled(z7);
            if (childAt instanceof ViewGroup) {
                Y((ViewGroup) childAt, z7);
            }
        }
    }

    private void a0() {
        TextView textView = this.f18494M;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void c0() {
        EditText editText = this.f18536v;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i7 = this.f18525k0;
                if (i7 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i7 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    private boolean f0() {
        return (this.f18522i.G() || ((this.f18522i.A() && M()) || this.f18522i.w() != null)) && this.f18522i.getMeasuredWidth() > 0;
    }

    private boolean g0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f18517e.getMeasuredWidth() > 0;
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f18536v;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.f18513b0;
        }
        int iD = C2517a.d(this.f18536v, C1746b.f12743g);
        int i7 = this.f18525k0;
        if (i7 == 2) {
            return K(getContext(), this.f18513b0, iD, f18469W0);
        }
        if (i7 == 1) {
            return H(this.f18513b0, this.f18531q0, iD, f18469W0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f18516d0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f18516d0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f18516d0.addState(new int[0], G(false));
        }
        return this.f18516d0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f18514c0 == null) {
            this.f18514c0 = G(true);
        }
        return this.f18514c0;
    }

    private void h0() {
        if (this.f18494M == null || !this.f18492L || TextUtils.isEmpty(this.f18490K)) {
            return;
        }
        this.f18494M.setText(this.f18490K);
        androidx.transition.x.a(this.f18515d, this.f18500P);
        this.f18494M.setVisibility(0);
        this.f18494M.bringToFront();
        announceForAccessibility(this.f18490K);
    }

    private void i0() {
        if (this.f18525k0 == 1) {
            if (C2754c.h(getContext())) {
                this.f18526l0 = getResources().getDimensionPixelSize(C1748d.f12780G);
            } else if (C2754c.g(getContext())) {
                this.f18526l0 = getResources().getDimensionPixelSize(C1748d.f12779F);
            }
        }
    }

    private void j() {
        TextView textView = this.f18494M;
        if (textView != null) {
            this.f18515d.addView(textView);
            this.f18494M.setVisibility(0);
        }
    }

    private void j0(Rect rect) {
        C2937g c2937g = this.f18519f0;
        if (c2937g != null) {
            int i7 = rect.bottom;
            c2937g.setBounds(rect.left, i7 - this.f18528n0, rect.right, i7);
        }
        C2937g c2937g2 = this.f18520g0;
        if (c2937g2 != null) {
            int i8 = rect.bottom;
            c2937g2.setBounds(rect.left, i8 - this.f18529o0, rect.right, i8);
        }
    }

    private void k() {
        if (this.f18536v == null || this.f18525k0 != 1) {
            return;
        }
        if (C2754c.h(getContext())) {
            EditText editText = this.f18536v;
            Z.C0(editText, Z.E(editText), getResources().getDimensionPixelSize(C1748d.f12778E), Z.D(this.f18536v), getResources().getDimensionPixelSize(C1748d.f12777D));
        } else if (C2754c.g(getContext())) {
            EditText editText2 = this.f18536v;
            Z.C0(editText2, Z.E(editText2), getResources().getDimensionPixelSize(C1748d.f12776C), Z.D(this.f18536v), getResources().getDimensionPixelSize(C1748d.f12775B));
        }
    }

    private void k0() {
        if (this.f18484H != null) {
            EditText editText = this.f18536v;
            l0(editText == null ? null : editText.getText());
        }
    }

    private void m() {
        C2937g c2937g = this.f18513b0;
        if (c2937g == null) {
            return;
        }
        u4.k kVarE = c2937g.E();
        u4.k kVar = this.f18521h0;
        if (kVarE != kVar) {
            this.f18513b0.setShapeAppearanceModel(kVar);
        }
        if (w()) {
            this.f18513b0.g0(this.f18527m0, this.f18530p0);
        }
        int iQ = q();
        this.f18531q0 = iQ;
        this.f18513b0.a0(ColorStateList.valueOf(iQ));
        n();
        s0();
    }

    private static void m0(Context context, TextView textView, int i7, int i8, boolean z7) {
        textView.setContentDescription(context.getString(z7 ? C1753i.f12924c : C1753i.f12923b, Integer.valueOf(i7), Integer.valueOf(i8)));
    }

    private void n() {
        if (this.f18519f0 == null || this.f18520g0 == null) {
            return;
        }
        if (x()) {
            this.f18519f0.a0(this.f18536v.isFocused() ? ColorStateList.valueOf(this.f18477D0) : ColorStateList.valueOf(this.f18530p0));
            this.f18520g0.a0(ColorStateList.valueOf(this.f18530p0));
        }
        invalidate();
    }

    private void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f18484H;
        if (textView != null) {
            d0(textView, this.f18480F ? this.f18486I : this.f18488J);
            if (!this.f18480F && (colorStateList2 = this.f18504R) != null) {
                this.f18484H.setTextColor(colorStateList2);
            }
            if (!this.f18480F || (colorStateList = this.f18506S) == null) {
                return;
            }
            this.f18484H.setTextColor(colorStateList);
        }
    }

    private void o(RectF rectF) {
        float f7 = rectF.left;
        int i7 = this.f18524j0;
        rectF.left = f7 - i7;
        rectF.right += i7;
    }

    private void o0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListG = this.f18508T;
        if (colorStateListG == null) {
            colorStateListG = C2517a.g(getContext(), C1746b.f12741f);
        }
        EditText editText = this.f18536v;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = C2731a.r(this.f18536v.getTextCursorDrawable()).mutate();
        if (Q() && (colorStateList = this.f18509U) != null) {
            colorStateListG = colorStateList;
        }
        C2731a.o(drawableMutate, colorStateListG);
    }

    private void p() {
        int i7 = this.f18525k0;
        if (i7 == 0) {
            this.f18513b0 = null;
            this.f18519f0 = null;
            this.f18520g0 = null;
            return;
        }
        if (i7 == 1) {
            this.f18513b0 = new C2937g(this.f18521h0);
            this.f18519f0 = new C2937g();
            this.f18520g0 = new C2937g();
        } else {
            if (i7 != 2) {
                throw new IllegalArgumentException(this.f18525k0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f18510V || (this.f18513b0 instanceof h)) {
                this.f18513b0 = new C2937g(this.f18521h0);
            } else {
                this.f18513b0 = h.p0(this.f18521h0);
            }
            this.f18519f0 = null;
            this.f18520g0 = null;
        }
    }

    private int q() {
        return this.f18525k0 == 1 ? C2517a.i(C2517a.e(this, C1746b.f12751n, 0), this.f18531q0) : this.f18531q0;
    }

    private Rect r(Rect rect) {
        if (this.f18536v == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f18533s0;
        boolean zH = com.google.android.material.internal.s.h(this);
        rect2.bottom = rect.bottom;
        int i7 = this.f18525k0;
        if (i7 == 1) {
            rect2.left = I(rect.left, zH);
            rect2.top = rect.top + this.f18526l0;
            rect2.right = J(rect.right, zH);
            return rect2;
        }
        if (i7 != 2) {
            rect2.left = I(rect.left, zH);
            rect2.top = getPaddingTop();
            rect2.right = J(rect.right, zH);
            return rect2;
        }
        rect2.left = rect.left + this.f18536v.getPaddingLeft();
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.f18536v.getPaddingRight();
        return rect2;
    }

    private void r0() {
        Z.r0(this.f18536v, getEditTextBoxBackground());
    }

    private int s(Rect rect, Rect rect2, float f7) {
        return S() ? (int) (rect2.top + f7) : rect.bottom - this.f18536v.getCompoundPaddingBottom();
    }

    private void setEditText(EditText editText) {
        if (this.f18536v != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f18536v = editText;
        int i7 = this.f18541y;
        if (i7 != -1) {
            setMinEms(i7);
        } else {
            setMinWidth(this.f18470A);
        }
        int i8 = this.f18543z;
        if (i8 != -1) {
            setMaxEms(i8);
        } else {
            setMaxWidth(this.f18472B);
        }
        this.f18518e0 = false;
        V();
        setTextInputAccessibilityDelegate(new d(this));
        this.f18499O0.i0(this.f18536v.getTypeface());
        this.f18499O0.a0(this.f18536v.getTextSize());
        int i9 = Build.VERSION.SDK_INT;
        this.f18499O0.X(this.f18536v.getLetterSpacing());
        int gravity = this.f18536v.getGravity();
        this.f18499O0.S((gravity & (-113)) | 48);
        this.f18499O0.Z(gravity);
        this.f18495M0 = Z.A(editText);
        this.f18536v.addTextChangedListener(new a(editText));
        if (this.f18473B0 == null) {
            this.f18473B0 = this.f18536v.getHintTextColors();
        }
        if (this.f18510V) {
            if (TextUtils.isEmpty(this.f18511W)) {
                CharSequence hint = this.f18536v.getHint();
                this.f18538w = hint;
                setHint(hint);
                this.f18536v.setHint((CharSequence) null);
            }
            this.f18512a0 = true;
        }
        if (i9 >= 29) {
            o0();
        }
        if (this.f18484H != null) {
            l0(this.f18536v.getText());
        }
        q0();
        this.f18474C.f();
        this.f18517e.bringToFront();
        this.f18522i.bringToFront();
        C();
        this.f18522i.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f18511W)) {
            return;
        }
        this.f18511W = charSequence;
        this.f18499O0.g0(charSequence);
        if (this.f18497N0) {
            return;
        }
        W();
    }

    private void setPlaceholderTextEnabled(boolean z7) {
        if (this.f18492L == z7) {
            return;
        }
        if (z7) {
            j();
        } else {
            a0();
            this.f18494M = null;
        }
        this.f18492L = z7;
    }

    private int t(Rect rect, float f7) {
        return S() ? (int) (rect.centerY() - (f7 / 2.0f)) : rect.top + this.f18536v.getCompoundPaddingTop();
    }

    private boolean t0() {
        int iMax;
        if (this.f18536v == null || this.f18536v.getMeasuredHeight() >= (iMax = Math.max(this.f18522i.getMeasuredHeight(), this.f18517e.getMeasuredHeight()))) {
            return false;
        }
        this.f18536v.setMinimumHeight(iMax);
        return true;
    }

    private Rect u(Rect rect) {
        if (this.f18536v == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f18533s0;
        float fW = this.f18499O0.w();
        rect2.left = rect.left + this.f18536v.getCompoundPaddingLeft();
        rect2.top = t(rect, fW);
        rect2.right = rect.right - this.f18536v.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, fW);
        return rect2;
    }

    private void u0() {
        if (this.f18525k0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f18515d.getLayoutParams();
            int iV = v();
            if (iV != layoutParams.topMargin) {
                layoutParams.topMargin = iV;
                this.f18515d.requestLayout();
            }
        }
    }

    private int v() {
        float fQ;
        if (!this.f18510V) {
            return 0;
        }
        int i7 = this.f18525k0;
        if (i7 == 0) {
            fQ = this.f18499O0.q();
        } else {
            if (i7 != 2) {
                return 0;
            }
            fQ = this.f18499O0.q() / 2.0f;
        }
        return (int) fQ;
    }

    private boolean w() {
        return this.f18525k0 == 2 && x();
    }

    private void w0(boolean z7, boolean z8) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f18536v;
        boolean z9 = false;
        boolean z10 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f18536v;
        if (editText2 != null && editText2.hasFocus()) {
            z9 = true;
        }
        ColorStateList colorStateList2 = this.f18473B0;
        if (colorStateList2 != null) {
            this.f18499O0.M(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f18473B0;
            this.f18499O0.M(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f18493L0) : this.f18493L0));
        } else if (e0()) {
            this.f18499O0.M(this.f18474C.r());
        } else if (this.f18480F && (textView = this.f18484H) != null) {
            this.f18499O0.M(textView.getTextColors());
        } else if (z9 && (colorStateList = this.f18475C0) != null) {
            this.f18499O0.R(colorStateList);
        }
        if (z10 || !this.f18501P0 || (isEnabled() && z9)) {
            if (z8 || this.f18497N0) {
                z(z7);
                return;
            }
            return;
        }
        if (z8 || !this.f18497N0) {
            F(z7);
        }
    }

    private boolean x() {
        return this.f18527m0 > -1 && this.f18530p0 != 0;
    }

    private void x0() {
        EditText editText;
        if (this.f18494M == null || (editText = this.f18536v) == null) {
            return;
        }
        this.f18494M.setGravity(editText.getGravity());
        this.f18494M.setPadding(this.f18536v.getCompoundPaddingLeft(), this.f18536v.getCompoundPaddingTop(), this.f18536v.getCompoundPaddingRight(), this.f18536v.getCompoundPaddingBottom());
    }

    private void y() {
        if (B()) {
            ((h) this.f18513b0).r0();
        }
    }

    private void y0() {
        EditText editText = this.f18536v;
        z0(editText == null ? null : editText.getText());
    }

    private void z(boolean z7) {
        ValueAnimator valueAnimator = this.f18505R0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f18505R0.cancel();
        }
        if (z7 && this.f18503Q0) {
            l(1.0f);
        } else {
            this.f18499O0.c0(1.0f);
        }
        this.f18497N0 = false;
        if (B()) {
            W();
        }
        y0();
        this.f18517e.l(false);
        this.f18522i.H(false);
    }

    public void z0(Editable editable) {
        if (this.f18482G.a(editable) != 0 || this.f18497N0) {
            L();
        } else {
            h0();
        }
    }

    void B0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f18513b0 == null || this.f18525k0 == 0) {
            return;
        }
        boolean z7 = false;
        boolean z8 = isFocused() || ((editText2 = this.f18536v) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f18536v) != null && editText.isHovered())) {
            z7 = true;
        }
        if (!isEnabled()) {
            this.f18530p0 = this.f18493L0;
        } else if (e0()) {
            if (this.f18483G0 != null) {
                A0(z8, z7);
            } else {
                this.f18530p0 = getErrorCurrentTextColors();
            }
        } else if (!this.f18480F || (textView = this.f18484H) == null) {
            if (z8) {
                this.f18530p0 = this.f18481F0;
            } else if (z7) {
                this.f18530p0 = this.f18479E0;
            } else {
                this.f18530p0 = this.f18477D0;
            }
        } else if (this.f18483G0 != null) {
            A0(z8, z7);
        } else {
            this.f18530p0 = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            o0();
        }
        this.f18522i.I();
        Z();
        if (this.f18525k0 == 2) {
            int i7 = this.f18527m0;
            if (z8 && isEnabled()) {
                this.f18527m0 = this.f18529o0;
            } else {
                this.f18527m0 = this.f18528n0;
            }
            if (this.f18527m0 != i7) {
                X();
            }
        }
        if (this.f18525k0 == 1) {
            if (!isEnabled()) {
                this.f18531q0 = this.f18487I0;
            } else if (z7 && !z8) {
                this.f18531q0 = this.f18491K0;
            } else if (z8) {
                this.f18531q0 = this.f18489J0;
            } else {
                this.f18531q0 = this.f18485H0;
            }
        }
        m();
    }

    public boolean M() {
        return this.f18522i.F();
    }

    public boolean N() {
        return this.f18474C.A();
    }

    public boolean O() {
        return this.f18474C.B();
    }

    final boolean P() {
        return this.f18497N0;
    }

    public boolean R() {
        return this.f18512a0;
    }

    public void Z() {
        this.f18517e.m();
    }

    @Override
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i7, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f18515d.addView(view, layoutParams2);
        this.f18515d.setLayoutParams(layoutParams);
        u0();
        setEditText((EditText) view);
    }

    public void b0(float f7, float f8, float f9, float f10) {
        boolean zH = com.google.android.material.internal.s.h(this);
        this.f18523i0 = zH;
        float f11 = zH ? f8 : f7;
        if (!zH) {
            f7 = f8;
        }
        float f12 = zH ? f10 : f9;
        if (!zH) {
            f9 = f10;
        }
        C2937g c2937g = this.f18513b0;
        if (c2937g != null && c2937g.J() == f11 && this.f18513b0.K() == f7 && this.f18513b0.s() == f12 && this.f18513b0.t() == f9) {
            return;
        }
        this.f18521h0 = this.f18521h0.v().A(f11).E(f7).s(f12).w(f9).m();
        m();
    }

    void d0(TextView textView, int i7) {
        try {
            androidx.core.widget.j.r(textView, i7);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        androidx.core.widget.j.r(textView, C1754j.f12949b);
        textView.setTextColor(androidx.core.content.a.c(getContext(), C1747c.f12764a));
    }

    @Override
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i7) {
        EditText editText = this.f18536v;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i7);
            return;
        }
        if (this.f18538w != null) {
            boolean z7 = this.f18512a0;
            this.f18512a0 = false;
            CharSequence hint = editText.getHint();
            this.f18536v.setHint(this.f18538w);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i7);
                return;
            } finally {
                this.f18536v.setHint(hint);
                this.f18512a0 = z7;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i7);
        onProvideAutofillVirtualStructure(viewStructure, i7);
        viewStructure.setChildCount(this.f18515d.getChildCount());
        for (int i8 = 0; i8 < this.f18515d.getChildCount(); i8++) {
            View childAt = this.f18515d.getChildAt(i8);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i8);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i7);
            if (childAt == this.f18536v) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.T0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.T0 = false;
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override
    protected void drawableStateChanged() {
        if (this.f18507S0) {
            return;
        }
        this.f18507S0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.f18499O0;
        boolean zF0 = aVar != null ? aVar.f0(drawableState) : false;
        if (this.f18536v != null) {
            v0(Z.R(this) && isEnabled());
        }
        q0();
        B0();
        if (zF0) {
            invalidate();
        }
        this.f18507S0 = false;
    }

    boolean e0() {
        return this.f18474C.l();
    }

    @Override
    public int getBaseline() {
        EditText editText = this.f18536v;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    C2937g getBoxBackground() {
        int i7 = this.f18525k0;
        if (i7 == 1 || i7 == 2) {
            return this.f18513b0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f18531q0;
    }

    public int getBoxBackgroundMode() {
        return this.f18525k0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f18526l0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return com.google.android.material.internal.s.h(this) ? this.f18521h0.j().a(this.f18534t0) : this.f18521h0.l().a(this.f18534t0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return com.google.android.material.internal.s.h(this) ? this.f18521h0.l().a(this.f18534t0) : this.f18521h0.j().a(this.f18534t0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return com.google.android.material.internal.s.h(this) ? this.f18521h0.r().a(this.f18534t0) : this.f18521h0.t().a(this.f18534t0);
    }

    public float getBoxCornerRadiusTopStart() {
        return com.google.android.material.internal.s.h(this) ? this.f18521h0.t().a(this.f18534t0) : this.f18521h0.r().a(this.f18534t0);
    }

    public int getBoxStrokeColor() {
        return this.f18481F0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f18483G0;
    }

    public int getBoxStrokeWidth() {
        return this.f18528n0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f18529o0;
    }

    public int getCounterMaxLength() {
        return this.f18478E;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f18476D && this.f18480F && (textView = this.f18484H) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f18506S;
    }

    public ColorStateList getCounterTextColor() {
        return this.f18504R;
    }

    public ColorStateList getCursorColor() {
        return this.f18508T;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f18509U;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f18473B0;
    }

    public EditText getEditText() {
        return this.f18536v;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f18522i.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f18522i.n();
    }

    public int getEndIconMinSize() {
        return this.f18522i.o();
    }

    public int getEndIconMode() {
        return this.f18522i.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f18522i.q();
    }

    CheckableImageButton getEndIconView() {
        return this.f18522i.r();
    }

    public CharSequence getError() {
        if (this.f18474C.A()) {
            return this.f18474C.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f18474C.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f18474C.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f18474C.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f18522i.s();
    }

    public CharSequence getHelperText() {
        if (this.f18474C.B()) {
            return this.f18474C.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f18474C.u();
    }

    public CharSequence getHint() {
        if (this.f18510V) {
            return this.f18511W;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f18499O0.q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f18499O0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f18475C0;
    }

    public e getLengthCounter() {
        return this.f18482G;
    }

    public int getMaxEms() {
        return this.f18543z;
    }

    public int getMaxWidth() {
        return this.f18472B;
    }

    public int getMinEms() {
        return this.f18541y;
    }

    public int getMinWidth() {
        return this.f18470A;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f18522i.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f18522i.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f18492L) {
            return this.f18490K;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f18498O;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f18496N;
    }

    public CharSequence getPrefixText() {
        return this.f18517e.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f18517e.b();
    }

    public TextView getPrefixTextView() {
        return this.f18517e.d();
    }

    public u4.k getShapeAppearanceModel() {
        return this.f18521h0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f18517e.e();
    }

    public Drawable getStartIconDrawable() {
        return this.f18517e.f();
    }

    public int getStartIconMinSize() {
        return this.f18517e.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f18517e.h();
    }

    public CharSequence getSuffixText() {
        return this.f18522i.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f18522i.x();
    }

    public TextView getSuffixTextView() {
        return this.f18522i.z();
    }

    public Typeface getTypeface() {
        return this.f18535u0;
    }

    public void i(f fVar) {
        this.f18540x0.add(fVar);
        if (this.f18536v != null) {
            fVar.a(this);
        }
    }

    void l(float f7) {
        if (this.f18499O0.x() == f7) {
            return;
        }
        if (this.f18505R0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f18505R0 = valueAnimator;
            valueAnimator.setInterpolator(p4.e.g(getContext(), C1746b.f12718N, C2388a.f20313b));
            this.f18505R0.setDuration(p4.e.f(getContext(), C1746b.f12711G, 167));
            this.f18505R0.addUpdateListener(new c());
        }
        this.f18505R0.setFloatValues(this.f18499O0.x(), f7);
        this.f18505R0.start();
    }

    void l0(Editable editable) {
        int iA = this.f18482G.a(editable);
        boolean z7 = this.f18480F;
        int i7 = this.f18478E;
        if (i7 == -1) {
            this.f18484H.setText(String.valueOf(iA));
            this.f18484H.setContentDescription(null);
            this.f18480F = false;
        } else {
            this.f18480F = iA > i7;
            m0(getContext(), this.f18484H, iA, this.f18478E, this.f18480F);
            if (z7 != this.f18480F) {
                n0();
            }
            this.f18484H.setText(C2962a.c().j(getContext().getString(C1753i.f12925d, Integer.valueOf(iA), Integer.valueOf(this.f18478E))));
        }
        if (this.f18536v == null || z7 == this.f18480F) {
            return;
        }
        v0(false);
        B0();
        q0();
    }

    @Override
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f18499O0.H(configuration);
    }

    @Override
    public void onGlobalLayout() {
        this.f18522i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.U0 = false;
        boolean zT0 = t0();
        boolean zP0 = p0();
        if (zT0 || zP0) {
            this.f18536v.post(new Runnable() {
                @Override
                public final void run() {
                    this.f18454d.U();
                }
            });
        }
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        EditText editText = this.f18536v;
        if (editText != null) {
            Rect rect = this.f18532r0;
            com.google.android.material.internal.c.a(this, editText, rect);
            j0(rect);
            if (this.f18510V) {
                this.f18499O0.a0(this.f18536v.getTextSize());
                int gravity = this.f18536v.getGravity();
                this.f18499O0.S((gravity & (-113)) | 48);
                this.f18499O0.Z(gravity);
                this.f18499O0.O(r(rect));
                this.f18499O0.W(u(rect));
                this.f18499O0.J();
                if (!B() || this.f18497N0) {
                    return;
                }
                W();
            }
        }
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (!this.U0) {
            this.f18522i.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.U0 = true;
        }
        x0();
        this.f18522i.x0();
    }

    @Override
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.f18545d);
        if (savedState.f18546e) {
            post(new b());
        }
        requestLayout();
    }

    @Override
    public void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        boolean z7 = i7 == 1;
        if (z7 != this.f18523i0) {
            float fA = this.f18521h0.r().a(this.f18534t0);
            float fA2 = this.f18521h0.t().a(this.f18534t0);
            u4.k kVarM = u4.k.a().z(this.f18521h0.s()).D(this.f18521h0.q()).r(this.f18521h0.k()).v(this.f18521h0.i()).A(fA2).E(fA).s(this.f18521h0.l().a(this.f18534t0)).w(this.f18521h0.j().a(this.f18534t0)).m();
            this.f18523i0 = z7;
            setShapeAppearanceModel(kVarM);
        }
    }

    @Override
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (e0()) {
            savedState.f18545d = getError();
        }
        savedState.f18546e = this.f18522i.E();
        return savedState;
    }

    boolean p0() {
        boolean z7;
        if (this.f18536v == null) {
            return false;
        }
        boolean z8 = true;
        if (g0()) {
            int measuredWidth = this.f18517e.getMeasuredWidth() - this.f18536v.getPaddingLeft();
            if (this.f18537v0 == null || this.f18539w0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f18537v0 = colorDrawable;
                this.f18539w0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrD = androidx.core.widget.j.d(this.f18536v);
            Drawable drawable = drawableArrD[0];
            Drawable drawable2 = this.f18537v0;
            if (drawable != drawable2) {
                androidx.core.widget.j.m(this.f18536v, drawable2, drawableArrD[1], drawableArrD[2], drawableArrD[3]);
                z7 = true;
            }
            z7 = false;
        } else {
            if (this.f18537v0 != null) {
                Drawable[] drawableArrD2 = androidx.core.widget.j.d(this.f18536v);
                androidx.core.widget.j.m(this.f18536v, null, drawableArrD2[1], drawableArrD2[2], drawableArrD2[3]);
                this.f18537v0 = null;
                z7 = true;
            }
            z7 = false;
        }
        if (f0()) {
            int measuredWidth2 = this.f18522i.z().getMeasuredWidth() - this.f18536v.getPaddingRight();
            CheckableImageButton checkableImageButtonK = this.f18522i.k();
            if (checkableImageButtonK != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonK.getMeasuredWidth() + C1646v.b((ViewGroup.MarginLayoutParams) checkableImageButtonK.getLayoutParams());
            }
            Drawable[] drawableArrD3 = androidx.core.widget.j.d(this.f18536v);
            Drawable drawable3 = this.f18542y0;
            if (drawable3 == null || this.f18544z0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f18542y0 = colorDrawable2;
                    this.f18544z0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = drawableArrD3[2];
                Drawable drawable5 = this.f18542y0;
                if (drawable4 != drawable5) {
                    this.f18471A0 = drawable4;
                    androidx.core.widget.j.m(this.f18536v, drawableArrD3[0], drawableArrD3[1], drawable5, drawableArrD3[3]);
                } else {
                    z8 = z7;
                }
            } else {
                this.f18544z0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.j.m(this.f18536v, drawableArrD3[0], drawableArrD3[1], this.f18542y0, drawableArrD3[3]);
            }
        } else {
            if (this.f18542y0 == null) {
                return z7;
            }
            Drawable[] drawableArrD4 = androidx.core.widget.j.d(this.f18536v);
            if (drawableArrD4[2] == this.f18542y0) {
                androidx.core.widget.j.m(this.f18536v, drawableArrD4[0], drawableArrD4[1], this.f18471A0, drawableArrD4[3]);
            } else {
                z8 = z7;
            }
            this.f18542y0 = null;
        }
        return z8;
    }

    void q0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f18536v;
        if (editText == null || this.f18525k0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (DrawableUtils.canSafelyMutateDrawable(background)) {
            background = background.mutate();
        }
        if (e0()) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f18480F && (textView = this.f18484H) != null) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            C2731a.c(background);
            this.f18536v.refreshDrawableState();
        }
    }

    void s0() {
        EditText editText = this.f18536v;
        if (editText == null || this.f18513b0 == null) {
            return;
        }
        if ((this.f18518e0 || editText.getBackground() == null) && this.f18525k0 != 0) {
            r0();
            this.f18518e0 = true;
        }
    }

    public void setBoxBackgroundColor(int i7) {
        if (this.f18531q0 != i7) {
            this.f18531q0 = i7;
            this.f18485H0 = i7;
            this.f18489J0 = i7;
            this.f18491K0 = i7;
            m();
        }
    }

    public void setBoxBackgroundColorResource(int i7) {
        setBoxBackgroundColor(androidx.core.content.a.c(getContext(), i7));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f18485H0 = defaultColor;
        this.f18531q0 = defaultColor;
        this.f18487I0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f18489J0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f18491K0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i7) {
        if (i7 == this.f18525k0) {
            return;
        }
        this.f18525k0 = i7;
        if (this.f18536v != null) {
            V();
        }
    }

    public void setBoxCollapsedPaddingTop(int i7) {
        this.f18526l0 = i7;
    }

    public void setBoxCornerFamily(int i7) {
        this.f18521h0 = this.f18521h0.v().y(i7, this.f18521h0.r()).C(i7, this.f18521h0.t()).q(i7, this.f18521h0.j()).u(i7, this.f18521h0.l()).m();
        m();
    }

    public void setBoxStrokeColor(int i7) {
        if (this.f18481F0 != i7) {
            this.f18481F0 = i7;
            B0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f18477D0 = colorStateList.getDefaultColor();
            this.f18493L0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f18479E0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f18481F0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f18481F0 != colorStateList.getDefaultColor()) {
            this.f18481F0 = colorStateList.getDefaultColor();
        }
        B0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f18483G0 != colorStateList) {
            this.f18483G0 = colorStateList;
            B0();
        }
    }

    public void setBoxStrokeWidth(int i7) {
        this.f18528n0 = i7;
        B0();
    }

    public void setBoxStrokeWidthFocused(int i7) {
        this.f18529o0 = i7;
        B0();
    }

    public void setBoxStrokeWidthFocusedResource(int i7) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i7));
    }

    public void setBoxStrokeWidthResource(int i7) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i7));
    }

    public void setCounterEnabled(boolean z7) {
        if (this.f18476D != z7) {
            if (z7) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f18484H = appCompatTextView;
                appCompatTextView.setId(C1750f.f12864N);
                Typeface typeface = this.f18535u0;
                if (typeface != null) {
                    this.f18484H.setTypeface(typeface);
                }
                this.f18484H.setMaxLines(1);
                this.f18474C.e(this.f18484H, 2);
                C1646v.d((ViewGroup.MarginLayoutParams) this.f18484H.getLayoutParams(), getResources().getDimensionPixelOffset(C1748d.f12823l0));
                n0();
                k0();
            } else {
                this.f18474C.C(this.f18484H, 2);
                this.f18484H = null;
            }
            this.f18476D = z7;
        }
    }

    public void setCounterMaxLength(int i7) {
        if (this.f18478E != i7) {
            if (i7 > 0) {
                this.f18478E = i7;
            } else {
                this.f18478E = -1;
            }
            if (this.f18476D) {
                k0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i7) {
        if (this.f18486I != i7) {
            this.f18486I = i7;
            n0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f18506S != colorStateList) {
            this.f18506S = colorStateList;
            n0();
        }
    }

    public void setCounterTextAppearance(int i7) {
        if (this.f18488J != i7) {
            this.f18488J = i7;
            n0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f18504R != colorStateList) {
            this.f18504R = colorStateList;
            n0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f18508T != colorStateList) {
            this.f18508T = colorStateList;
            o0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f18509U != colorStateList) {
            this.f18509U = colorStateList;
            if (Q()) {
                o0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f18473B0 = colorStateList;
        this.f18475C0 = colorStateList;
        if (this.f18536v != null) {
            v0(false);
        }
    }

    @Override
    public void setEnabled(boolean z7) {
        Y(this, z7);
        super.setEnabled(z7);
    }

    public void setEndIconActivated(boolean z7) {
        this.f18522i.N(z7);
    }

    public void setEndIconCheckable(boolean z7) {
        this.f18522i.O(z7);
    }

    public void setEndIconContentDescription(int i7) {
        this.f18522i.P(i7);
    }

    public void setEndIconDrawable(int i7) {
        this.f18522i.R(i7);
    }

    public void setEndIconMinSize(int i7) {
        this.f18522i.T(i7);
    }

    public void setEndIconMode(int i7) {
        this.f18522i.U(i7);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f18522i.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f18522i.W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f18522i.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f18522i.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f18522i.Z(mode);
    }

    public void setEndIconVisible(boolean z7) {
        this.f18522i.a0(z7);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f18474C.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f18474C.w();
        } else {
            this.f18474C.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i7) {
        this.f18474C.E(i7);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f18474C.F(charSequence);
    }

    public void setErrorEnabled(boolean z7) {
        this.f18474C.G(z7);
    }

    public void setErrorIconDrawable(int i7) {
        this.f18522i.b0(i7);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f18522i.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f18522i.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f18522i.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f18522i.g0(mode);
    }

    public void setErrorTextAppearance(int i7) {
        this.f18474C.H(i7);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f18474C.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z7) {
        if (this.f18501P0 != z7) {
            this.f18501P0 = z7;
            v0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (O()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!O()) {
                setHelperTextEnabled(true);
            }
            this.f18474C.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f18474C.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z7) {
        this.f18474C.K(z7);
    }

    public void setHelperTextTextAppearance(int i7) {
        this.f18474C.J(i7);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f18510V) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z7) {
        this.f18503Q0 = z7;
    }

    public void setHintEnabled(boolean z7) {
        if (z7 != this.f18510V) {
            this.f18510V = z7;
            if (z7) {
                CharSequence hint = this.f18536v.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f18511W)) {
                        setHint(hint);
                    }
                    this.f18536v.setHint((CharSequence) null);
                }
                this.f18512a0 = true;
            } else {
                this.f18512a0 = false;
                if (!TextUtils.isEmpty(this.f18511W) && TextUtils.isEmpty(this.f18536v.getHint())) {
                    this.f18536v.setHint(this.f18511W);
                }
                setHintInternal(null);
            }
            if (this.f18536v != null) {
                u0();
            }
        }
    }

    public void setHintTextAppearance(int i7) {
        this.f18499O0.P(i7);
        this.f18475C0 = this.f18499O0.p();
        if (this.f18536v != null) {
            v0(false);
            u0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f18475C0 != colorStateList) {
            if (this.f18473B0 == null) {
                this.f18499O0.R(colorStateList);
            }
            this.f18475C0 = colorStateList;
            if (this.f18536v != null) {
                v0(false);
            }
        }
    }

    public void setLengthCounter(e eVar) {
        this.f18482G = eVar;
    }

    public void setMaxEms(int i7) {
        this.f18543z = i7;
        EditText editText = this.f18536v;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMaxEms(i7);
    }

    public void setMaxWidth(int i7) {
        this.f18472B = i7;
        EditText editText = this.f18536v;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMaxWidth(i7);
    }

    public void setMaxWidthResource(int i7) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i7));
    }

    public void setMinEms(int i7) {
        this.f18541y = i7;
        EditText editText = this.f18536v;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMinEms(i7);
    }

    public void setMinWidth(int i7) {
        this.f18470A = i7;
        EditText editText = this.f18536v;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMinWidth(i7);
    }

    public void setMinWidthResource(int i7) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i7));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i7) {
        this.f18522i.i0(i7);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i7) {
        this.f18522i.k0(i7);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z7) {
        this.f18522i.m0(z7);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f18522i.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f18522i.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f18494M == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f18494M = appCompatTextView;
            appCompatTextView.setId(C1750f.f12867Q);
            Z.x0(this.f18494M, 2);
            C1721e c1721eA = A();
            this.f18500P = c1721eA;
            c1721eA.l0(67L);
            this.f18502Q = A();
            setPlaceholderTextAppearance(this.f18498O);
            setPlaceholderTextColor(this.f18496N);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f18492L) {
                setPlaceholderTextEnabled(true);
            }
            this.f18490K = charSequence;
        }
        y0();
    }

    public void setPlaceholderTextAppearance(int i7) {
        this.f18498O = i7;
        TextView textView = this.f18494M;
        if (textView != null) {
            androidx.core.widget.j.r(textView, i7);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f18496N != colorStateList) {
            this.f18496N = colorStateList;
            TextView textView = this.f18494M;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f18517e.n(charSequence);
    }

    public void setPrefixTextAppearance(int i7) {
        this.f18517e.o(i7);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f18517e.p(colorStateList);
    }

    public void setShapeAppearanceModel(u4.k kVar) {
        C2937g c2937g = this.f18513b0;
        if (c2937g == null || c2937g.E() == kVar) {
            return;
        }
        this.f18521h0 = kVar;
        m();
    }

    public void setStartIconCheckable(boolean z7) {
        this.f18517e.q(z7);
    }

    public void setStartIconContentDescription(int i7) {
        setStartIconContentDescription(i7 != 0 ? getResources().getText(i7) : null);
    }

    public void setStartIconDrawable(int i7) {
        setStartIconDrawable(i7 != 0 ? C2473a.b(getContext(), i7) : null);
    }

    public void setStartIconMinSize(int i7) {
        this.f18517e.t(i7);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f18517e.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f18517e.v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f18517e.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f18517e.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f18517e.y(mode);
    }

    public void setStartIconVisible(boolean z7) {
        this.f18517e.z(z7);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f18522i.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i7) {
        this.f18522i.q0(i7);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f18522i.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f18536v;
        if (editText != null) {
            Z.n0(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f18535u0) {
            this.f18535u0 = typeface;
            this.f18499O0.i0(typeface);
            this.f18474C.N(typeface);
            TextView textView = this.f18484H;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void v0(boolean z7) {
        w0(z7, false);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i7) {
        int i8 = V0;
        super(C2990a.c(context, attributeSet, i7, i8), attributeSet, i7);
        this.f18541y = -1;
        this.f18543z = -1;
        this.f18470A = -1;
        this.f18472B = -1;
        this.f18474C = new u(this);
        this.f18482G = new e() {
            @Override
            public final int a(Editable editable) {
                return TextInputLayout.T(editable);
            }
        };
        this.f18532r0 = new Rect();
        this.f18533s0 = new Rect();
        this.f18534t0 = new RectF();
        this.f18540x0 = new LinkedHashSet<>();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.f18499O0 = aVar;
        this.U0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f18515d = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = C2388a.f20312a;
        aVar.h0(timeInterpolator);
        aVar.e0(timeInterpolator);
        aVar.S(8388659);
        int[] iArr = C1755k.f13283v6;
        int i9 = C1755k.f13085S6;
        int i10 = C1755k.f13073Q6;
        int i11 = C1755k.k7;
        int i12 = C1755k.p7;
        int i13 = C1755k.t7;
        TintTypedArray tintTypedArrayJ = com.google.android.material.internal.p.j(context2, attributeSet, iArr, i7, i8, i9, i10, i11, i12, i13);
        y yVar = new y(this, tintTypedArrayJ);
        this.f18517e = yVar;
        this.f18510V = tintTypedArrayJ.getBoolean(C1755k.s7, true);
        setHint(tintTypedArrayJ.getText(C1755k.f12980A6));
        this.f18503Q0 = tintTypedArrayJ.getBoolean(C1755k.r7, true);
        this.f18501P0 = tintTypedArrayJ.getBoolean(C1755k.m7, true);
        int i14 = C1755k.f12993C6;
        if (tintTypedArrayJ.hasValue(i14)) {
            setMinEms(tintTypedArrayJ.getInt(i14, -1));
        } else {
            int i15 = C1755k.f13313z6;
            if (tintTypedArrayJ.hasValue(i15)) {
                setMinWidth(tintTypedArrayJ.getDimensionPixelSize(i15, -1));
            }
        }
        int i16 = C1755k.f12987B6;
        if (tintTypedArrayJ.hasValue(i16)) {
            setMaxEms(tintTypedArrayJ.getInt(i16, -1));
        } else {
            int i17 = C1755k.f13306y6;
            if (tintTypedArrayJ.hasValue(i17)) {
                setMaxWidth(tintTypedArrayJ.getDimensionPixelSize(i17, -1));
            }
        }
        this.f18521h0 = u4.k.e(context2, attributeSet, i7, i8).m();
        this.f18524j0 = context2.getResources().getDimensionPixelOffset(C1748d.f12817i0);
        this.f18526l0 = tintTypedArrayJ.getDimensionPixelOffset(C1755k.f13010F6, 0);
        this.f18528n0 = tintTypedArrayJ.getDimensionPixelSize(C1755k.f13049M6, context2.getResources().getDimensionPixelSize(C1748d.f12819j0));
        this.f18529o0 = tintTypedArrayJ.getDimensionPixelSize(C1755k.f13055N6, context2.getResources().getDimensionPixelSize(C1748d.f12821k0));
        this.f18527m0 = this.f18528n0;
        float dimension = tintTypedArrayJ.getDimension(C1755k.f13031J6, -1.0f);
        float dimension2 = tintTypedArrayJ.getDimension(C1755k.I6, -1.0f);
        float dimension3 = tintTypedArrayJ.getDimension(C1755k.f13015G6, -1.0f);
        float dimension4 = tintTypedArrayJ.getDimension(C1755k.f13020H6, -1.0f);
        k.b bVarV = this.f18521h0.v();
        if (dimension >= 0.0f) {
            bVarV.A(dimension);
        }
        if (dimension2 >= 0.0f) {
            bVarV.E(dimension2);
        }
        if (dimension3 >= 0.0f) {
            bVarV.w(dimension3);
        }
        if (dimension4 >= 0.0f) {
            bVarV.s(dimension4);
        }
        this.f18521h0 = bVarV.m();
        ColorStateList colorStateListB = C2754c.b(context2, tintTypedArrayJ, C1755k.f12999D6);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f18485H0 = defaultColor;
            this.f18531q0 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f18487I0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f18489J0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f18491K0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f18489J0 = this.f18485H0;
                ColorStateList colorStateListA = C2473a.a(context2, C1747c.f12770g);
                this.f18487I0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.f18491K0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f18531q0 = 0;
            this.f18485H0 = 0;
            this.f18487I0 = 0;
            this.f18489J0 = 0;
            this.f18491K0 = 0;
        }
        int i18 = C1755k.f13298x6;
        if (tintTypedArrayJ.hasValue(i18)) {
            ColorStateList colorStateList = tintTypedArrayJ.getColorStateList(i18);
            this.f18475C0 = colorStateList;
            this.f18473B0 = colorStateList;
        }
        int i19 = C1755k.f13037K6;
        ColorStateList colorStateListB2 = C2754c.b(context2, tintTypedArrayJ, i19);
        this.f18481F0 = tintTypedArrayJ.getColor(i19, 0);
        this.f18477D0 = androidx.core.content.a.c(context2, C1747c.f12771h);
        this.f18493L0 = androidx.core.content.a.c(context2, C1747c.f12772i);
        this.f18479E0 = androidx.core.content.a.c(context2, C1747c.f12773j);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        int i20 = C1755k.f13043L6;
        if (tintTypedArrayJ.hasValue(i20)) {
            setBoxStrokeErrorColor(C2754c.b(context2, tintTypedArrayJ, i20));
        }
        if (tintTypedArrayJ.getResourceId(i13, -1) != -1) {
            setHintTextAppearance(tintTypedArrayJ.getResourceId(i13, 0));
        }
        this.f18508T = tintTypedArrayJ.getColorStateList(C1755k.f13095U6);
        this.f18509U = tintTypedArrayJ.getColorStateList(C1755k.f13100V6);
        int resourceId = tintTypedArrayJ.getResourceId(i11, 0);
        CharSequence text = tintTypedArrayJ.getText(C1755k.f7);
        int i21 = tintTypedArrayJ.getInt(C1755k.e7, 1);
        boolean z7 = tintTypedArrayJ.getBoolean(C1755k.g7, false);
        int resourceId2 = tintTypedArrayJ.getResourceId(i12, 0);
        boolean z8 = tintTypedArrayJ.getBoolean(C1755k.o7, false);
        CharSequence text2 = tintTypedArrayJ.getText(C1755k.n7);
        int resourceId3 = tintTypedArrayJ.getResourceId(C1755k.B7, 0);
        CharSequence text3 = tintTypedArrayJ.getText(C1755k.A7);
        boolean z9 = tintTypedArrayJ.getBoolean(C1755k.f13061O6, false);
        setCounterMaxLength(tintTypedArrayJ.getInt(C1755k.f13067P6, -1));
        this.f18488J = tintTypedArrayJ.getResourceId(i9, 0);
        this.f18486I = tintTypedArrayJ.getResourceId(i10, 0);
        setBoxBackgroundMode(tintTypedArrayJ.getInt(C1755k.f13005E6, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i21);
        setCounterOverflowTextAppearance(this.f18486I);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f18488J);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        int i22 = C1755k.l7;
        if (tintTypedArrayJ.hasValue(i22)) {
            setErrorTextColor(tintTypedArrayJ.getColorStateList(i22));
        }
        int i23 = C1755k.q7;
        if (tintTypedArrayJ.hasValue(i23)) {
            setHelperTextColor(tintTypedArrayJ.getColorStateList(i23));
        }
        int i24 = C1755k.u7;
        if (tintTypedArrayJ.hasValue(i24)) {
            setHintTextColor(tintTypedArrayJ.getColorStateList(i24));
        }
        int i25 = C1755k.f13090T6;
        if (tintTypedArrayJ.hasValue(i25)) {
            setCounterTextColor(tintTypedArrayJ.getColorStateList(i25));
        }
        int i26 = C1755k.f13079R6;
        if (tintTypedArrayJ.hasValue(i26)) {
            setCounterOverflowTextColor(tintTypedArrayJ.getColorStateList(i26));
        }
        int i27 = C1755k.C7;
        if (tintTypedArrayJ.hasValue(i27)) {
            setPlaceholderTextColor(tintTypedArrayJ.getColorStateList(i27));
        }
        r rVar = new r(this, tintTypedArrayJ);
        this.f18522i = rVar;
        boolean z10 = tintTypedArrayJ.getBoolean(C1755k.f13290w6, true);
        tintTypedArrayJ.recycle();
        Z.x0(this, 2);
        Z.z0(this, 1);
        frameLayout.addView(yVar);
        frameLayout.addView(rVar);
        addView(frameLayout);
        setEnabled(z10);
        setHelperTextEnabled(z8);
        setErrorEnabled(z7);
        setCounterEnabled(z9);
        setHelperText(text2);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f18522i.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f18522i.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f18522i.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f18522i.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f18522i.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f18517e.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f18517e.s(drawable);
    }

    public void setHint(int i7) {
        setHint(i7 != 0 ? getResources().getText(i7) : null);
    }
}
