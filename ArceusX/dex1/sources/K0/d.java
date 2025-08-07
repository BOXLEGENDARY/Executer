package K0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class d implements InputFilter {

    private final TextView f1744a;

    private f.e f1745b;

    private static class a extends f.e {

        private final Reference<TextView> f1746a;

        private final Reference<d> f1747b;

        a(TextView textView, d dVar) {
            this.f1746a = new WeakReference(textView);
            this.f1747b = new WeakReference(dVar);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public void b() {
            CharSequence text;
            CharSequence charSequenceO;
            super.b();
            TextView textView = this.f1746a.get();
            if (c(textView, this.f1747b.get()) && textView.isAttachedToWindow() && text != (charSequenceO = androidx.emoji2.text.f.b().o((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceO);
                int selectionEnd = Selection.getSelectionEnd(charSequenceO);
                textView.setText(charSequenceO);
                if (charSequenceO instanceof Spannable) {
                    d.b((Spannable) charSequenceO, selectionStart, selectionEnd);
                }
            }
        }
    }

    d(TextView textView) {
        this.f1744a = textView;
    }

    private f.e a() {
        if (this.f1745b == null) {
            this.f1745b = new a(this.f1744a, this);
        }
        return this.f1745b;
    }

    static void b(Spannable spannable, int i7, int i8) {
        if (i7 >= 0 && i8 >= 0) {
            Selection.setSelection(spannable, i7, i8);
        } else if (i7 >= 0) {
            Selection.setSelection(spannable, i7);
        } else if (i8 >= 0) {
            Selection.setSelection(spannable, i8);
        }
    }

    @Override
    public CharSequence filter(CharSequence charSequence, int i7, int i8, Spanned spanned, int i9, int i10) {
        if (this.f1744a.isInEditMode()) {
            return charSequence;
        }
        int iD = androidx.emoji2.text.f.b().d();
        if (iD != 0) {
            if (iD == 1) {
                if ((i10 == 0 && i9 == 0 && spanned.length() == 0 && charSequence == this.f1744a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i7 != 0 || i8 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i7, i8);
                }
                return androidx.emoji2.text.f.b().p(charSequence, 0, charSequence.length());
            }
            if (iD != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.f.b().s(a());
        return charSequence;
    }
}
