package P8;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LP8/a;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "v", "nfc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class a {
    public static final a d = new a("NotRequested", 0);
    public static final a e = new a("NotSupported", 1);
    public static final a i = new a("Failed", 2);
    public static final a v = new a("Success", 3);
    private static final a[] w;
    private static final T9.a y;

    static {
        a[] aVarArrC = c();
        w = aVarArrC;
        y = T9.b.a(aVarArrC);
    }

    private a(String str, int i2) {
    }

    private static final a[] c() {
        return new a[]{d, e, i, v};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) w.clone();
    }
}
