package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import g.C2456j;

class f {

    private final EditText f9286a;

    private final K0.a f9287b;

    f(EditText editText) {
        this.f9286a = editText;
        this.f9287b = new K0.a(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f9287b.a(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    boolean c() {
        return this.f9287b.b();
    }

    void d(AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = this.f9286a.getContext().obtainStyledAttributes(attributeSet, C2456j.f20829i0, i7, 0);
        try {
            int i8 = C2456j.f20886w0;
            boolean z7 = typedArrayObtainStyledAttributes.hasValue(i8) ? typedArrayObtainStyledAttributes.getBoolean(i8, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            f(z7);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    InputConnection e(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f9287b.c(inputConnection, editorInfo);
    }

    void f(boolean z7) {
        this.f9287b.d(z7);
    }
}
