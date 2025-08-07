package V8;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LV8/n;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class n {
    public static final n d = new n("Center", 0);
    public static final n e = new n("Left", 1);
    public static final n i = new n("Right", 2);
    private static final n[] v;
    private static final T9.a w;

    static {
        n[] nVarArrC = c();
        v = nVarArrC;
        w = T9.b.a(nVarArrC);
    }

    private n(String str, int i2) {
    }

    private static final n[] c() {
        return new n[]{d, e, i};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) v.clone();
    }
}
