package P8;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LP8/b;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "v", "nfc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class b {
    public static final b d = new b("Dg1", 0);
    public static final b e = new b("Dg2", 1);
    public static final b i = new b("Dg14", 2);
    public static final b v = new b("Sod", 3);
    private static final b[] w;
    private static final T9.a y;

    static {
        b[] bVarArrC = c();
        w = bVarArrC;
        y = T9.b.a(bVarArrC);
    }

    private b(String str, int i2) {
    }

    private static final b[] c() {
        return new b[]{d, e, i, v};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) w.clone();
    }
}
