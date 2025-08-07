package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import c4.C1746b;
import c4.C1754j;
import c4.C1755k;
import com.github.luben.zstd.BuildConfig;
import x4.C2990a;

public class TextInputEditText extends AppCompatEditText {

    private final Rect f18467d;

    private boolean f18468e;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1746b.f12752o);
    }

    private boolean a(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f18468e;
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!a(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f18467d);
        rect.bottom = this.f18467d.bottom;
    }

    @Override
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!a(textInputLayout)) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    @Override
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.R()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.R() && super.getHint() == null && com.google.android.material.internal.i.b()) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!a(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f18467d.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f18467d);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z7) {
        this.f18468e = z7;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i7) {
        super(C2990a.c(context, attributeSet, i7, 0), attributeSet, i7);
        this.f18467d = new Rect();
        TypedArray typedArrayI = com.google.android.material.internal.p.i(context, attributeSet, C1755k.f13269t6, i7, C1754j.f12955h, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayI.getBoolean(C1755k.f13276u6, false));
        typedArrayI.recycle();
    }
}
