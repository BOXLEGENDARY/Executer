package l6;

import h7.l;
import java.util.HashMap;

public class C2554j {

    private static C2554j f21874c;

    private HashMap<String, Long> f21876b = new HashMap<>();

    private long f21875a = 180000;

    private C2554j() {
    }

    public static C2554j b() {
        C2554j c2554j = f21874c;
        if (c2554j != null) {
            return c2554j;
        }
        synchronized (C2554j.class) {
            try {
                if (f21874c == null) {
                    f21874c = new C2554j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f21874c;
    }

    public boolean a(String str) {
        l.g("WebFragmentRefreshHelper", "Checking is refresh is needed. url=" + str);
        if (this.f21876b.containsKey(str)) {
            long jLongValue = this.f21876b.get(str).longValue();
            this.f21876b.put(str, Long.valueOf(System.currentTimeMillis()));
            z = System.currentTimeMillis() - jLongValue >= this.f21875a;
            l.g("WebFragmentRefreshHelper", "Needs refresh=" + z);
        }
        return z;
    }

    public void c(String str) {
        this.f21876b.put(str, Long.MAX_VALUE);
    }

    public void d(long j7) {
        this.f21875a = j7;
    }
}
