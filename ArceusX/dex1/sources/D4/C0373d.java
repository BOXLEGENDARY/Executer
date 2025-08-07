package D4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class C0373d {

    private final List f939a;

    private final List f940b;

    public static class a {

        private final List f941a = new ArrayList();

        private final List f942b = new ArrayList();

        a(C0385p c0385p) {
        }

        public a a(String str) {
            this.f941a.add(str);
            return this;
        }

        public C0373d b() {
            return new C0373d(this, null);
        }
    }

    C0373d(a aVar, C0386q c0386q) {
        this.f939a = new ArrayList(aVar.f941a);
        this.f940b = new ArrayList(aVar.f942b);
    }

    public static a c() {
        return new a(null);
    }

    public List<Locale> a() {
        return this.f940b;
    }

    public List<String> b() {
        return this.f939a;
    }

    public String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.f939a, this.f940b);
    }
}
