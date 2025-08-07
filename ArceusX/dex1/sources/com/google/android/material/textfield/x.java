package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import c4.C1749e;
import c4.C1753i;

class x extends s {

    private int f18663e;

    private EditText f18664f;

    private final View.OnClickListener f18665g;

    x(r rVar, int i7) {
        super(rVar);
        this.f18663e = C1749e.f12838a;
        this.f18665g = new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f18662d.y(view);
            }
        };
        if (i7 != 0) {
            this.f18663e = i7;
        }
    }

    private boolean w() {
        EditText editText = this.f18664f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean x(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    public void y(View view) {
        EditText editText = this.f18664f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (w()) {
            this.f18664f.setTransformationMethod(null);
        } else {
            this.f18664f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            this.f18664f.setSelection(selectionEnd);
        }
        r();
    }

    @Override
    void b(CharSequence charSequence, int i7, int i8, int i9) {
        r();
    }

    @Override
    int c() {
        return C1753i.f12943v;
    }

    @Override
    int d() {
        return this.f18663e;
    }

    @Override
    View.OnClickListener f() {
        return this.f18665g;
    }

    @Override
    boolean l() {
        return true;
    }

    @Override
    boolean m() {
        return !w();
    }

    @Override
    void n(EditText editText) {
        this.f18664f = editText;
        r();
    }

    @Override
    void s() {
        if (x(this.f18664f)) {
            this.f18664f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override
    void u() {
        EditText editText = this.f18664f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
