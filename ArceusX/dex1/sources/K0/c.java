package K0;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

final class c extends InputConnectionWrapper {

    private final TextView f1742d;

    private final a f1743e;

    public static class a {
        public boolean a(InputConnection inputConnection, Editable editable, int i7, int i8, boolean z7) {
            return androidx.emoji2.text.f.e(inputConnection, editable, i7, i8, z7);
        }

        public void b(EditorInfo editorInfo) {
            if (androidx.emoji2.text.f.h()) {
                androidx.emoji2.text.f.b().u(editorInfo);
            }
        }
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    private Editable a() {
        return this.f1742d.getEditableText();
    }

    @Override
    public boolean deleteSurroundingText(int i7, int i8) {
        return this.f1743e.a(this, a(), i7, i8, false) || super.deleteSurroundingText(i7, i8);
    }

    @Override
    public boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        return this.f1743e.a(this, a(), i7, i8, true) || super.deleteSurroundingTextInCodePoints(i7, i8);
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f1742d = textView;
        this.f1743e = aVar;
        aVar.b(editorInfo);
    }
}
