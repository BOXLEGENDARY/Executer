package com.google.androidgamesdk.gametextinput;

import android.view.inputmethod.EditorInfo;

public final class a {

    public static final class C0166a {

        int f18902a;

        int f18903b;

        C0166a(int i7, int i8) {
            this.f18902a = i7;
            this.f18903b = i8;
        }
    }

    public static final void a(EditorInfo editorInfo, EditorInfo editorInfo2) {
        if (editorInfo == null || editorInfo2 == null) {
            return;
        }
        CharSequence charSequence = editorInfo.hintText;
        if (charSequence != null) {
            editorInfo2.hintText = charSequence;
        }
        editorInfo2.inputType = editorInfo.inputType;
        editorInfo2.imeOptions = editorInfo.imeOptions;
        editorInfo2.label = editorInfo.label;
        editorInfo2.initialCapsMode = editorInfo.initialCapsMode;
        editorInfo2.privateImeOptions = editorInfo.privateImeOptions;
        String str = editorInfo.packageName;
        if (str != null) {
            editorInfo2.packageName = str;
        }
        editorInfo2.fieldId = editorInfo.fieldId;
        String str2 = editorInfo.fieldName;
        if (str2 != null) {
            editorInfo2.fieldName = str2;
        }
        editorInfo2.initialSelStart = editorInfo.initialSelStart;
        editorInfo2.initialSelEnd = editorInfo.initialSelEnd;
    }
}
