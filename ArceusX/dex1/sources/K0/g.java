package K0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class g implements TextWatcher {

    private final EditText f1755d;

    private final boolean f1756e;

    private f.e f1757i;

    private int f1758v = Integer.MAX_VALUE;

    private int f1759w = 0;

    private boolean f1760y = true;

    private static class a extends f.e {

        private final Reference<EditText> f1761a;

        a(EditText editText) {
            this.f1761a = new WeakReference(editText);
        }

        @Override
        public void b() {
            super.b();
            g.c(this.f1761a.get(), 1);
        }
    }

    g(EditText editText, boolean z7) {
        this.f1755d = editText;
        this.f1756e = z7;
    }

    private f.e a() {
        if (this.f1757i == null) {
            this.f1757i = new a(this.f1755d);
        }
        return this.f1757i;
    }

    static void c(EditText editText, int i7) {
        if (i7 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.f.b().o(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean e() {
        return (this.f1760y && (this.f1756e || androidx.emoji2.text.f.h())) ? false : true;
    }

    @Override
    public void afterTextChanged(Editable editable) {
    }

    public boolean b() {
        return this.f1760y;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }

    public void d(boolean z7) {
        if (this.f1760y != z7) {
            if (this.f1757i != null) {
                androidx.emoji2.text.f.b().t(this.f1757i);
            }
            this.f1760y = z7;
            if (z7) {
                c(this.f1755d, androidx.emoji2.text.f.b().d());
            }
        }
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        if (this.f1755d.isInEditMode() || e() || i8 > i9 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iD = androidx.emoji2.text.f.b().d();
        if (iD != 0) {
            if (iD == 1) {
                androidx.emoji2.text.f.b().r((Spannable) charSequence, i7, i7 + i9, this.f1758v, this.f1759w);
                return;
            } else if (iD != 3) {
                return;
            }
        }
        androidx.emoji2.text.f.b().s(a());
    }
}
