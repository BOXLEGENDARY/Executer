package okio;

import T9.a;
import T9.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LB1/k;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k {
    public static final k d = new k("IGNORE", 0);
    public static final k e = new k("RESPECT_PERFORMANCE", 1);
    public static final k i = new k("RESPECT_ALL", 2);
    private static final k[] v;
    private static final a w;

    static {
        k[] kVarArrC = c();
        v = kVarArrC;
        w = b.a(kVarArrC);
    }

    private k(String str, int i2) {
    }

    private static final k[] c() {
        return new k[]{d, e, i};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) v.clone();
    }
}
