package K4;

import java.util.logging.Logger;

final class f {

    private static final Logger f1909a = Logger.getLogger(f.class.getName());

    private static final e f1910b = b();

    private static final class b implements e {
        private b() {
        }
    }

    private f() {
    }

    static String a(String str) {
        if (c(str)) {
            return null;
        }
        return str;
    }

    private static e b() {
        return new b();
    }

    static boolean c(String str) {
        return str == null || str.isEmpty();
    }
}
