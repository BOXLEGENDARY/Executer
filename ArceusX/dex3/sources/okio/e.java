package okio;

import T9.a;
import T9.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LB1/e;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "v", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {
    public static final e d = new e("MEMORY_CACHE", 0);
    public static final e e = new e("MEMORY", 1);
    public static final e i = new e("DISK", 2);
    public static final e v = new e("NETWORK", 3);
    private static final e[] w;
    private static final a y;

    static {
        e[] eVarArrC = c();
        w = eVarArrC;
        y = b.a(eVarArrC);
    }

    private e(String str, int i2) {
    }

    private static final e[] c() {
        return new e[]{d, e, i, v};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) w.clone();
    }
}
