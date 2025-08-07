package K1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LK1/h;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {
    public static final h d = new h("FILL", 0);
    public static final h e = new h("FIT", 1);
    private static final h[] i;
    private static final T9.a v;

    static {
        h[] hVarArrC = c();
        i = hVarArrC;
        v = T9.b.a(hVarArrC);
    }

    private h(String str, int i2) {
    }

    private static final h[] c() {
        return new h[]{d, e};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) i.clone();
    }
}
