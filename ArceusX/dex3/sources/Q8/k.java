package Q8;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LQ8/k;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class k {
    public static final k d = new k("Success", 0);
    public static final k e = new k("Failure", 1);
    public static final k i = new k("SettingsLaunched", 2);
    private static final k[] v;
    private static final T9.a w;

    static {
        k[] kVarArrC = c();
        v = kVarArrC;
        w = T9.b.a(kVarArrC);
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
