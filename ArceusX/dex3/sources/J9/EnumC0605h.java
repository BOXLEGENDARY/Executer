package j9;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lj9/h;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class EnumC0605h {
    public static final EnumC0605h d = new EnumC0605h("SLIDE_IN", 0);
    public static final EnumC0605h e = new EnumC0605h("SLIDE_OUT", 1);
    public static final EnumC0605h i = new EnumC0605h("NONE", 2);
    private static final EnumC0605h[] v;
    private static final T9.a w;

    static {
        EnumC0605h[] enumC0605hArrC = c();
        v = enumC0605hArrC;
        w = T9.b.a(enumC0605hArrC);
    }

    private EnumC0605h(String str, int i2) {
    }

    private static final EnumC0605h[] c() {
        return new EnumC0605h[]{d, e, i};
    }

    public static EnumC0605h valueOf(String str) {
        return (EnumC0605h) Enum.valueOf(EnumC0605h.class, str);
    }

    public static EnumC0605h[] values() {
        return (EnumC0605h[]) v.clone();
    }
}
