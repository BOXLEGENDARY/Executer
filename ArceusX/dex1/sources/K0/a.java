package K0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

public final class a {

    private final b f1734a;

    private int f1735b = Integer.MAX_VALUE;

    private int f1736c = 0;

    private static class C0028a extends b {

        private final EditText f1737a;

        private final g f1738b;

        C0028a(EditText editText, boolean z7) {
            this.f1737a = editText;
            g gVar = new g(editText, z7);
            this.f1738b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(K0.b.getInstance());
        }

        @Override
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override
        boolean b() {
            return this.f1738b.b();
        }

        @Override
        InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f1737a, inputConnection, editorInfo);
        }

        @Override
        void d(boolean z7) {
            this.f1738b.d(z7);
        }
    }

    static class b {
        b() {
        }

        KeyListener a(KeyListener keyListener) {
            throw null;
        }

        boolean b() {
            throw null;
        }

        InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        void d(boolean z7) {
            throw null;
        }
    }

    public a(EditText editText, boolean z7) {
        x0.g.h(editText, "editText cannot be null");
        this.f1734a = new C0028a(editText, z7);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f1734a.a(keyListener);
    }

    public boolean b() {
        return this.f1734a.b();
    }

    public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f1734a.c(inputConnection, editorInfo);
    }

    public void d(boolean z7) {
        this.f1734a.d(z7);
    }
}
