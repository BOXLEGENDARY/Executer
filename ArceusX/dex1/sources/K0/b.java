package K0;

import android.text.Editable;
import androidx.emoji2.text.o;

final class b extends Editable.Factory {

    private static final Object f1739a = new Object();

    private static volatile Editable.Factory f1740b;

    private static Class<?> f1741c;

    private b() {
        try {
            f1741c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f1740b == null) {
            synchronized (f1739a) {
                try {
                    if (f1740b == null) {
                        f1740b = new b();
                    }
                } finally {
                }
            }
        }
        return f1740b;
    }

    @Override
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f1741c;
        return cls != null ? o.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
