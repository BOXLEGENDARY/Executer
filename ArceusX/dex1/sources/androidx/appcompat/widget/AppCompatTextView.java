package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import h.C2473a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import w0.p;

public class AppCompatTextView extends TextView implements androidx.core.widget.b, EmojiCompatConfigurationView {
    private final C1598c mBackgroundTintHelper;
    private g mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<w0.p> mPrecomputedTextFuture;
    private a mSuperCaller;
    private final m mTextClassifierHelper;
    private final n mTextHelper;

    private interface a {
        void a(int[] iArr, int i7);

        int[] b();

        TextClassifier c();

        int d();

        void e(TextClassifier textClassifier);

        void f(int i7);

        void g(int i7);

        int getAutoSizeMinTextSize();

        int getAutoSizeStepGranularity();

        int getAutoSizeTextType();

        void h(int i7);

        void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i8, int i9, int i10);
    }

    class b implements a {
        b() {
        }

        @Override
        public void a(int[] iArr, int i7) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
        }

        @Override
        public int[] b() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override
        public TextClassifier c() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override
        public int d() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override
        public void e(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        @Override
        public void f(int i7) {
        }

        @Override
        public void g(int i7) {
        }

        @Override
        public int getAutoSizeMinTextSize() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override
        public int getAutoSizeStepGranularity() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override
        public int getAutoSizeTextType() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override
        public void h(int i7) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i7);
        }

        @Override
        public void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i8, int i9, int i10) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
        }
    }

    class c extends b {
        c() {
            super();
        }

        @Override
        public void f(int i7) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i7);
        }

        @Override
        public void g(int i7) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i7);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<w0.p> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                androidx.core.widget.j.q(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private g getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new g(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            c1598c.b();
        }
        n nVar = this.mTextHelper;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return getSuperCaller().d();
        }
        n nVar = this.mTextHelper;
        if (nVar != null) {
            return nVar.e();
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return getSuperCaller().getAutoSizeMinTextSize();
        }
        n nVar = this.mTextHelper;
        if (nVar != null) {
            return nVar.f();
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return getSuperCaller().getAutoSizeStepGranularity();
        }
        n nVar = this.mTextHelper;
        if (nVar != null) {
            return nVar.g();
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return getSuperCaller().b();
        }
        n nVar = this.mTextHelper;
        return nVar != null ? nVar.h() : new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return getSuperCaller().getAutoSizeTextType() == 1 ? 1 : 0;
        }
        n nVar = this.mTextHelper;
        if (nVar != null) {
            return nVar.i();
        }
        return 0;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.t(super.getCustomSelectionActionModeCallback());
    }

    @Override
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.j.e(this);
    }

    @Override
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.j.f(this);
    }

    a getSuperCaller() {
        if (this.mSuperCaller == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.mSuperCaller = new c();
            } else {
                this.mSuperCaller = new b();
            }
        }
        return this.mSuperCaller;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            return c1598c.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            return c1598c.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.k();
    }

    @Override
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override
    public TextClassifier getTextClassifier() {
        m mVar;
        return (Build.VERSION.SDK_INT >= 28 || (mVar = this.mTextClassifierHelper) == null) ? getSuperCaller().c() : mVar.a();
    }

    public p.a getTextMetricsParamsCompat() {
        return androidx.core.widget.j.i(this);
    }

    @Override
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return h.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        n nVar = this.mTextHelper;
        if (nVar != null) {
            nVar.o(z7, i7, i8, i9, i10);
        }
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i7, i8);
    }

    @Override
    protected void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        n nVar = this.mTextHelper;
        if (nVar == null || ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE || !nVar.l()) {
            return;
        }
        this.mTextHelper.c();
    }

    @Override
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().d(z7);
    }

    @Override
    public void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i8, int i9, int i10) throws IllegalArgumentException {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
            return;
        }
        n nVar = this.mTextHelper;
        if (nVar != null) {
            nVar.t(i7, i8, i9, i10);
        }
    }

    @Override
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) throws IllegalArgumentException {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            getSuperCaller().a(iArr, i7);
            return;
        }
        n nVar = this.mTextHelper;
        if (nVar != null) {
            nVar.u(iArr, i7);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            getSuperCaller().h(i7);
            return;
        }
        n nVar = this.mTextHelper;
        if (nVar != null) {
            nVar.v(i7);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            c1598c.f(drawable);
        }
    }

    @Override
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            c1598c.g(i7);
        }
    }

    @Override
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        n nVar = this.mTextHelper;
        if (nVar != null) {
            nVar.p();
        }
    }

    @Override
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        n nVar = this.mTextHelper;
        if (nVar != null) {
            nVar.p();
        }
    }

    @Override
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        n nVar = this.mTextHelper;
        if (nVar != null) {
            nVar.p();
        }
    }

    @Override
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        n nVar = this.mTextHelper;
        if (nVar != null) {
            nVar.p();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.u(this, callback));
    }

    @Override
    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().e(z7);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override
    public void setFirstBaselineToTopHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().g(i7);
        } else {
            androidx.core.widget.j.n(this, i7);
        }
    }

    @Override
    public void setLastBaselineToBottomHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i7);
        } else {
            androidx.core.widget.j.o(this, i7);
        }
    }

    @Override
    public void setLineHeight(int i7) {
        androidx.core.widget.j.p(this, i7);
    }

    public void setPrecomputedText(w0.p pVar) {
        androidx.core.widget.j.q(this, pVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            c1598c.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            c1598c.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.w(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.x(mode);
        this.mTextHelper.b();
    }

    @Override
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        n nVar = this.mTextHelper;
        if (nVar != null) {
            nVar.q(context, i7);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        m mVar;
        if (Build.VERSION.SDK_INT >= 28 || (mVar = this.mTextClassifierHelper) == null) {
            getSuperCaller().e(textClassifier);
        } else {
            mVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<w0.p> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(p.a aVar) {
        androidx.core.widget.j.s(this, aVar);
    }

    @Override
    public void setTextSize(int i7, float f7) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            super.setTextSize(i7, f7);
            return;
        }
        n nVar = this.mTextHelper;
        if (nVar != null) {
            nVar.A(i7, f7);
        }
    }

    @Override
    public void setTypeface(Typeface typeface, int i7) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface typefaceA = (typeface == null || i7 <= 0) ? null : androidx.core.graphics.f.a(getContext(), typeface, i7);
        this.mIsSetTypefaceProcessing = true;
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        try {
            super.setTypeface(typeface, i7);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i7) {
        super(TintContextWrapper.wrap(context), attributeSet, i7);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        ThemeUtils.checkAppCompatTheme(this, getContext());
        C1598c c1598c = new C1598c(this);
        this.mBackgroundTintHelper = c1598c;
        c1598c.e(attributeSet, i7);
        n nVar = new n(this);
        this.mTextHelper = nVar;
        nVar.m(attributeSet, i7);
        nVar.b();
        this.mTextClassifierHelper = new m(this);
        getEmojiTextViewHelper().c(attributeSet, i7);
    }

    @Override
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i7 != 0 ? C2473a.b(context, i7) : null, i8 != 0 ? C2473a.b(context, i8) : null, i9 != 0 ? C2473a.b(context, i9) : null, i10 != 0 ? C2473a.b(context, i10) : null);
        n nVar = this.mTextHelper;
        if (nVar != null) {
            nVar.p();
        }
    }

    @Override
    public void setCompoundDrawablesWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i7 != 0 ? C2473a.b(context, i7) : null, i8 != 0 ? C2473a.b(context, i8) : null, i9 != 0 ? C2473a.b(context, i9) : null, i10 != 0 ? C2473a.b(context, i10) : null);
        n nVar = this.mTextHelper;
        if (nVar != null) {
            nVar.p();
        }
    }
}
