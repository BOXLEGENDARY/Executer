package N9;

import android.text.Spanned;

public abstract class c {
    public static boolean a(int i, CharSequence charSequence, Object obj) {
        return (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(obj) == i;
    }

    public static boolean b(int i, CharSequence charSequence, Object obj) {
        return (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(obj) == i;
    }
}
