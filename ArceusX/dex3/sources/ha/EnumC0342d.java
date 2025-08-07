package ha;

import T9.a;
import T9.b;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LF8/d;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class EnumC0342d {
    public static final EnumC0342d d = new EnumC0342d("PRODUCTION", 0);
    public static final EnumC0342d e = new EnumC0342d("SANDBOX", 1);
    private static final EnumC0342d[] i;
    private static final a v;

    static {
        EnumC0342d[] enumC0342dArrC = c();
        i = enumC0342dArrC;
        v = b.a(enumC0342dArrC);
    }

    private EnumC0342d(String str, int i2) {
    }

    private static final EnumC0342d[] c() {
        return new EnumC0342d[]{d, e};
    }

    public static EnumC0342d valueOf(String str) {
        return (EnumC0342d) Enum.valueOf(EnumC0342d.class, str);
    }

    public static EnumC0342d[] values() {
        return (EnumC0342d[]) i.clone();
    }
}
