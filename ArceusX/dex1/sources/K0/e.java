package K0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

final class e implements KeyListener {

    private final KeyListener f1748a;

    private final a f1749b;

    public static class a {
        public boolean a(Editable editable, int i7, KeyEvent keyEvent) {
            return androidx.emoji2.text.f.f(editable, i7, keyEvent);
        }
    }

    e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override
    public void clearMetaKeyState(View view, Editable editable, int i7) {
        this.f1748a.clearMetaKeyState(view, editable, i7);
    }

    @Override
    public int getInputType() {
        return this.f1748a.getInputType();
    }

    @Override
    public boolean onKeyDown(View view, Editable editable, int i7, KeyEvent keyEvent) {
        return this.f1749b.a(editable, i7, keyEvent) || this.f1748a.onKeyDown(view, editable, i7, keyEvent);
    }

    @Override
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f1748a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public boolean onKeyUp(View view, Editable editable, int i7, KeyEvent keyEvent) {
        return this.f1748a.onKeyUp(view, editable, i7, keyEvent);
    }

    e(KeyListener keyListener, a aVar) {
        this.f1748a = keyListener;
        this.f1749b = aVar;
    }
}
