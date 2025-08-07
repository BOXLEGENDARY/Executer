package u0;

import android.content.res.Configuration;
import android.os.LocaleList;

public final class f {

    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    public static i a(Configuration configuration) {
        return i.h(a.a(configuration));
    }
}
