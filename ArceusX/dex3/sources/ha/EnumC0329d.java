package ha;

import T9.a;
import T9.b;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LC8/d;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class EnumC0329d {
    public static final EnumC0329d d = new EnumC0329d("Connecting", 0);
    public static final EnumC0329d e = new EnumC0329d("Connected", 1);
    public static final EnumC0329d i = new EnumC0329d("Disconnected", 2);
    private static final EnumC0329d[] v;
    private static final a w;

    static {
        EnumC0329d[] enumC0329dArrC = c();
        v = enumC0329dArrC;
        w = b.a(enumC0329dArrC);
    }

    private EnumC0329d(String str, int i2) {
    }

    private static final EnumC0329d[] c() {
        return new EnumC0329d[]{d, e, i};
    }

    public static EnumC0329d valueOf(String str) {
        return (EnumC0329d) Enum.valueOf(EnumC0329d.class, str);
    }

    public static EnumC0329d[] values() {
        return (EnumC0329d[]) v.clone();
    }
}
