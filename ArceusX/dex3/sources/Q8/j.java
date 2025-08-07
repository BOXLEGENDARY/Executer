package Q8;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LQ8/j;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "v", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class j {
    public static final j d = new j("Camera", 0);
    public static final j e = new j("RecordAudio", 1);
    public static final j i = new j("RoughLocation", 2);
    public static final j v = new j("PreciseLocation", 3);
    private static final j[] w;
    private static final T9.a y;

    static {
        j[] jVarArrC = c();
        w = jVarArrC;
        y = T9.b.a(jVarArrC);
    }

    private j(String str, int i2) {
    }

    private static final j[] c() {
        return new j[]{d, e, i, v};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) w.clone();
    }
}
