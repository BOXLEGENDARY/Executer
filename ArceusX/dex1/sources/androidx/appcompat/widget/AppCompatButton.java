package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import g.C2447a;

public class AppCompatButton extends Button implements androidx.core.widget.b, EmojiCompatConfigurationView {
    private g mAppCompatEmojiTextHelper;
    private final C1598c mBackgroundTintHelper;
    private final n mTextHelper;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    private g getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new g(this);
        }
        return this.mAppCompatEmojiTextHelper;
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
            return super.getAutoSizeMaxTextSize();
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
            return super.getAutoSizeMinTextSize();
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
            return super.getAutoSizeStepGranularity();
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
            return super.getAutoSizeTextAvailableSizes();
        }
        n nVar = this.mTextHelper;
        return nVar != null ? nVar.h() : new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
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
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
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
            super.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
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
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
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
            super.setAutoSizeTextTypeWithDefaults(i7);
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

    public void setSupportAllCaps(boolean z7) {
        n nVar = this.mTextHelper;
        if (nVar != null) {
            nVar.s(z7);
        }
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

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2447a.f20557s);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i7) {
        super(TintContextWrapper.wrap(context), attributeSet, i7);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        C1598c c1598c = new C1598c(this);
        this.mBackgroundTintHelper = c1598c;
        c1598c.e(attributeSet, i7);
        n nVar = new n(this);
        this.mTextHelper = nVar;
        nVar.m(attributeSet, i7);
        nVar.b();
        getEmojiTextViewHelper().c(attributeSet, i7);
    }
}
