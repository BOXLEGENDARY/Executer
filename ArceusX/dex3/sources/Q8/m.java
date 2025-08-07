package Q8;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LQ8/m;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class m {
    public static final m d = new m("PermissionGranted", 0);
    public static final m e = new m("PermissionRejected", 1);
    public static final m i = new m("SettingsLaunched", 2);
    private static final m[] v;
    private static final T9.a w;

    static {
        m[] mVarArrC = c();
        v = mVarArrC;
        w = T9.b.a(mVarArrC);
    }

    private m(String str, int i2) {
    }

    private static final m[] c() {
        return new m[]{d, e, i};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) v.clone();
    }
}
