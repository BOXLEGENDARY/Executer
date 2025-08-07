package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import g.C2447a;
import h.C2473a;

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements EmojiCompatConfigurationView {
    private static final int[] TINT_ATTRS = {R.attr.popupBackground};
    private final f mAppCompatEmojiEditTextHelper;
    private final C1598c mBackgroundTintHelper;
    private final n mTextHelper;

    public AppCompatMultiAutoCompleteTextView(Context context) {
        this(context, null);
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

    void initEmojiKeyListener(f fVar) {
        KeyListener keyListener = getKeyListener();
        if (fVar.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = fVar.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override
    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.c();
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.mAppCompatEmojiEditTextHelper.e(h.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
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
    public void setDropDownBackgroundResource(int i7) {
        setDropDownBackgroundDrawable(C2473a.b(getContext(), i7));
    }

    @Override
    public void setEmojiCompatEnabled(boolean z7) {
        this.mAppCompatEmojiEditTextHelper.f(z7);
    }

    @Override
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.a(keyListener));
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

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2447a.f20556r);
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i7) {
        super(TintContextWrapper.wrap(context), attributeSet, i7);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, TINT_ATTRS, i7, 0);
        if (tintTypedArrayObtainStyledAttributes.hasValue(0)) {
            setDropDownBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(0));
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        C1598c c1598c = new C1598c(this);
        this.mBackgroundTintHelper = c1598c;
        c1598c.e(attributeSet, i7);
        n nVar = new n(this);
        this.mTextHelper = nVar;
        nVar.m(attributeSet, i7);
        nVar.b();
        f fVar = new f(this);
        this.mAppCompatEmojiEditTextHelper = fVar;
        fVar.d(attributeSet, i7);
        initEmojiKeyListener(fVar);
    }
}
