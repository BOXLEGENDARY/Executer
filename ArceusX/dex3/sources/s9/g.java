package s9;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ls9/g;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
final class g {
    public static final g d = new g("BASE", 0);
    public static final g e = new g("ACTIVE", 1);
    public static final g i = new g("DISABLED", 2);
    private static final g[] v;
    private static final T9.a w;

    static {
        g[] gVarArrC = c();
        v = gVarArrC;
        w = T9.b.a(gVarArrC);
    }

    private g(String str, int i2) {
    }

    private static final g[] c() {
        return new g[]{d, e, i};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) v.clone();
    }
}
