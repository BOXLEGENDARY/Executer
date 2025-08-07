package n3;

import android.os.Bundle;
import l3.C2526a;

public class C2656n implements C2526a.d {

    public static final C2656n f22287e = a().a();

    private final String f22288d;

    public static class a {

        private String f22289a;

        a(C2659q c2659q) {
        }

        public C2656n a() {
            return new C2656n(this.f22289a, null);
        }

        public a b(String str) {
            this.f22289a = str;
            return this;
        }
    }

    C2656n(String str, C2660r c2660r) {
        this.f22288d = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f22288d;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2656n) {
            return C2649g.b(this.f22288d, ((C2656n) obj).f22288d);
        }
        return false;
    }

    public final int hashCode() {
        return C2649g.c(this.f22288d);
    }
}
