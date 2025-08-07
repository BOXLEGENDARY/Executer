package u0;

import android.os.Build;
import android.os.Bundle;

public final class c {

    static class a {
        static <T> T a(Bundle bundle, String str, Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }
    }

    public static <T> T a(Bundle bundle, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.a(bundle, str, cls);
        }
        T t7 = (T) bundle.getParcelable(str);
        if (cls.isInstance(t7)) {
            return t7;
        }
        return null;
    }
}
