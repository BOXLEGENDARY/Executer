package ha;

import T9.a;
import T9.b;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LF8/u;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class u {
    public static final u d = new u("Background", 0);
    public static final u e = new u("Blocking", 1);
    private static final u[] i;
    private static final a v;

    static {
        u[] uVarArrC = c();
        i = uVarArrC;
        v = b.a(uVarArrC);
    }

    private u(String str, int i2) {
    }

    private static final u[] c() {
        return new u[]{d, e};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) i.clone();
    }
}
