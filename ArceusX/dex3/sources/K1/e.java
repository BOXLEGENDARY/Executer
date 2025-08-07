package K1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LK1/e;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {
    public static final e d = new e("EXACT", 0);
    public static final e e = new e("INEXACT", 1);
    public static final e i = new e("AUTOMATIC", 2);
    private static final e[] v;
    private static final T9.a w;

    static {
        e[] eVarArrC = c();
        v = eVarArrC;
        w = T9.b.a(eVarArrC);
    }

    private e(String str, int i2) {
    }

    private static final e[] c() {
        return new e[]{d, e, i};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) v.clone();
    }
}
