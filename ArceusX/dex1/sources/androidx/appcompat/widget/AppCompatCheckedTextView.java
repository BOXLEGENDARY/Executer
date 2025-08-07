package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import g.C2447a;
import h.C2473a;

public class AppCompatCheckedTextView extends CheckedTextView implements EmojiCompatConfigurationView {
    private g mAppCompatEmojiTextHelper;
    private final C1598c mBackgroundTintHelper;
    private final d mCheckedHelper;
    private final n mTextHelper;

    public AppCompatCheckedTextView(Context context) {
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
        n nVar = this.mTextHelper;
        if (nVar != null) {
            nVar.b();
        }
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            c1598c.b();
        }
        d dVar = this.mCheckedHelper;
        if (dVar != null) {
            dVar.a();
        }
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

    public ColorStateList getSupportCheckMarkTintList() {
        d dVar = this.mCheckedHelper;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        d dVar = this.mCheckedHelper;
        if (dVar != null) {
            return dVar.c();
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
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return h.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
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
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        d dVar = this.mCheckedHelper;
        if (dVar != null) {
            dVar.e();
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.u(this, callback));
    }

    @Override
    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().e(z7);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        d dVar = this.mCheckedHelper;
        if (dVar != null) {
            dVar.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        d dVar = this.mCheckedHelper;
        if (dVar != null) {
            dVar.g(mode);
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

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2447a.f20559u);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i7) {
        super(TintContextWrapper.wrap(context), attributeSet, i7);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        n nVar = new n(this);
        this.mTextHelper = nVar;
        nVar.m(attributeSet, i7);
        nVar.b();
        C1598c c1598c = new C1598c(this);
        this.mBackgroundTintHelper = c1598c;
        c1598c.e(attributeSet, i7);
        d dVar = new d(this);
        this.mCheckedHelper = dVar;
        dVar.d(attributeSet, i7);
        getEmojiTextViewHelper().c(attributeSet, i7);
    }

    @Override
    public void setCheckMarkDrawable(int i7) {
        setCheckMarkDrawable(C2473a.b(getContext(), i7));
    }
}
