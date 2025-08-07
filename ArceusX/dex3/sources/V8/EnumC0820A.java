package v8;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lv8/A;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "v", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class EnumC0820A {
    public static final EnumC0820A d = new EnumC0820A("World", 0);
    public static final EnumC0820A e = new EnumC0820A("Card", 1);
    public static final EnumC0820A i = new EnumC0820A("Flag", 2);
    public static final EnumC0820A v = new EnumC0820A("House", 3);
    private static final EnumC0820A[] w;
    private static final T9.a y;

    static {
        EnumC0820A[] enumC0820AArrC = c();
        w = enumC0820AArrC;
        y = T9.b.a(enumC0820AArrC);
    }

    private EnumC0820A(String str, int i2) {
    }

    private static final EnumC0820A[] c() {
        return new EnumC0820A[]{d, e, i, v};
    }

    public static EnumC0820A valueOf(String str) {
        return (EnumC0820A) Enum.valueOf(EnumC0820A.class, str);
    }

    public static EnumC0820A[] values() {
        return (EnumC0820A[]) w.clone();
    }
}
