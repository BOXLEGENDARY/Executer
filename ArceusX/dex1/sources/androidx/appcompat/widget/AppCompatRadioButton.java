package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import g.C2447a;
import h.C2473a;

public class AppCompatRadioButton extends RadioButton implements androidx.core.widget.l, EmojiCompatConfigurationView {
    private g mAppCompatEmojiTextHelper;
    private final C1598c mBackgroundTintHelper;
    private final e mCompoundButtonHelper;
    private final n mTextHelper;

    public AppCompatRadioButton(Context context) {
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
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        e eVar = this.mCompoundButtonHelper;
        return eVar != null ? eVar.b(compoundPaddingLeft) : compoundPaddingLeft;
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

    @Override
    public ColorStateList getSupportButtonTintList() {
        e eVar = this.mCompoundButtonHelper;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        e eVar = this.mCompoundButtonHelper;
        if (eVar != null) {
            return eVar.d();
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
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().d(z7);
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
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        e eVar = this.mCompoundButtonHelper;
        if (eVar != null) {
            eVar.f();
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
    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().e(z7);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
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

    @Override
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        e eVar = this.mCompoundButtonHelper;
        if (eVar != null) {
            eVar.g(colorStateList);
        }
    }

    @Override
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        e eVar = this.mCompoundButtonHelper;
        if (eVar != null) {
            eVar.h(mode);
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

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2447a.f20530K);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i7) {
        super(TintContextWrapper.wrap(context), attributeSet, i7);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        e eVar = new e(this);
        this.mCompoundButtonHelper = eVar;
        eVar.e(attributeSet, i7);
        C1598c c1598c = new C1598c(this);
        this.mBackgroundTintHelper = c1598c;
        c1598c.e(attributeSet, i7);
        n nVar = new n(this);
        this.mTextHelper = nVar;
        nVar.m(attributeSet, i7);
        getEmojiTextViewHelper().c(attributeSet, i7);
    }

    @Override
    public void setButtonDrawable(int i7) {
        setButtonDrawable(C2473a.b(getContext(), i7));
    }
}
