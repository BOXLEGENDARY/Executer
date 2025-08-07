package u0;

import android.os.LocaleList;
import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;
import java.util.Locale;

public final class i {

    private static final i f23890b = a(new Locale[0]);

    private final j f23891a;

    static class a {

        private static final Locale[] f23892a = {new Locale(jUbDmI.khkFnIjiMiRW, "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    private i(j jVar) {
        this.f23891a = jVar;
    }

    public static i a(Locale... localeArr) {
        return h(b.a(localeArr));
    }

    public static i b(String str) {
        if (str == null || str.isEmpty()) {
            return d();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i7 = 0; i7 < length; i7++) {
            localeArr[i7] = a.a(strArrSplit[i7]);
        }
        return a(localeArr);
    }

    public static i d() {
        return f23890b;
    }

    public static i h(LocaleList localeList) {
        return new i(new k(localeList));
    }

    public Locale c(int i7) {
        return this.f23891a.get(i7);
    }

    public boolean e() {
        return this.f23891a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f23891a.equals(((i) obj).f23891a);
    }

    public int f() {
        return this.f23891a.size();
    }

    public String g() {
        return this.f23891a.a();
    }

    public int hashCode() {
        return this.f23891a.hashCode();
    }

    public String toString() {
        return this.f23891a.toString();
    }
}
