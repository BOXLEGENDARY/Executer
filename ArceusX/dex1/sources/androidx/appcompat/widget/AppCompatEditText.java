package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.C1611d;
import androidx.core.view.K;
import androidx.core.view.Z;
import g.C2447a;

public class AppCompatEditText extends EditText implements K, EmojiCompatConfigurationView {
    private final f mAppCompatEmojiEditTextHelper;
    private final C1598c mBackgroundTintHelper;
    private final androidx.core.widget.k mDefaultOnReceiveContentListener;
    private a mSuperCaller;
    private final m mTextClassifierHelper;
    private final n mTextHelper;

    class a {
        a() {
        }

        public TextClassifier a() {
            return AppCompatEditText.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            AppCompatEditText.super.setTextClassifier(textClassifier);
        }
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    private a getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new a();
        }
        return this.mSuperCaller;
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
    public TextClassifier getTextClassifier() {
        m mVar;
        return (Build.VERSION.SDK_INT >= 28 || (mVar = this.mTextClassifierHelper) == null) ? getSuperCaller().a() : mVar.a();
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
        String[] strArrC;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionA = h.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionA != null && Build.VERSION.SDK_INT <= 30 && (strArrC = Z.C(this)) != null) {
            A0.a.c(editorInfo, strArrC);
            inputConnectionA = A0.c.c(this, inputConnectionA, editorInfo);
        }
        return this.mAppCompatEmojiEditTextHelper.e(inputConnectionA, editorInfo);
    }

    @Override
    public boolean onDragEvent(DragEvent dragEvent) {
        if (k.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override
    public C1611d onReceiveContent(C1611d c1611d) {
        return this.mDefaultOnReceiveContentListener.a(this, c1611d);
    }

    @Override
    public boolean onTextContextMenuItem(int i7) {
        if (k.b(this, i7)) {
            return true;
        }
        return super.onTextContextMenuItem(i7);
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.u(this, callback));
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

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        m mVar;
        if (Build.VERSION.SDK_INT >= 28 || (mVar = this.mTextClassifierHelper) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            mVar.b(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2447a.f20524E);
    }

    @Override
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i7) {
        super(TintContextWrapper.wrap(context), attributeSet, i7);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        C1598c c1598c = new C1598c(this);
        this.mBackgroundTintHelper = c1598c;
        c1598c.e(attributeSet, i7);
        n nVar = new n(this);
        this.mTextHelper = nVar;
        nVar.m(attributeSet, i7);
        nVar.b();
        this.mTextClassifierHelper = new m(this);
        this.mDefaultOnReceiveContentListener = new androidx.core.widget.k();
        f fVar = new f(this);
        this.mAppCompatEmojiEditTextHelper = fVar;
        fVar.d(attributeSet, i7);
        initEmojiKeyListener(fVar);
    }
}
