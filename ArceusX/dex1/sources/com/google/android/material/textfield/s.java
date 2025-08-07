package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import y0.C3002c;
import y0.C3019t;

abstract class s {

    final TextInputLayout f18624a;

    final r f18625b;

    final Context f18626c;

    final CheckableImageButton f18627d;

    s(r rVar) {
        this.f18624a = rVar.f18610d;
        this.f18625b = rVar;
        this.f18626c = rVar.getContext();
        this.f18627d = rVar.r();
    }

    void a(Editable editable) {
    }

    void b(CharSequence charSequence, int i7, int i8, int i9) {
    }

    int c() {
        return 0;
    }

    int d() {
        return 0;
    }

    View.OnFocusChangeListener e() {
        return null;
    }

    View.OnClickListener f() {
        return null;
    }

    View.OnFocusChangeListener g() {
        return null;
    }

    C3002c.a h() {
        return null;
    }

    boolean i(int i7) {
        return true;
    }

    boolean j() {
        return false;
    }

    boolean k() {
        return false;
    }

    boolean l() {
        return false;
    }

    boolean m() {
        return false;
    }

    void n(EditText editText) {
    }

    void o(View view, C3019t c3019t) {
    }

    void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    void q(boolean z7) {
    }

    final void r() {
        this.f18625b.L(false);
    }

    void s() {
    }

    boolean t() {
        return false;
    }

    void u() {
    }
}
