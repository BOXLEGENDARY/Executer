package g9;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lg9/b;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class EnumC0580b {
    public static final EnumC0580b d = new EnumC0580b("ROUGH", 0);
    public static final EnumC0580b e = new EnumC0580b("PRECISE", 1);
    private static final EnumC0580b[] i;
    private static final T9.a v;

    static {
        EnumC0580b[] enumC0580bArrC = c();
        i = enumC0580bArrC;
        v = T9.b.a(enumC0580bArrC);
    }

    private EnumC0580b(String str, int i2) {
    }

    private static final EnumC0580b[] c() {
        return new EnumC0580b[]{d, e};
    }

    public static EnumC0580b valueOf(String str) {
        return (EnumC0580b) Enum.valueOf(EnumC0580b.class, str);
    }

    public static EnumC0580b[] values() {
        return (EnumC0580b[]) i.clone();
    }
}
