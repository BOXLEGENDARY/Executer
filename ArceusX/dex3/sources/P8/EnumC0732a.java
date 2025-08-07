package p8;

import T9.b;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lp8/a;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class EnumC0732a {
    public static final EnumC0732a d = new EnumC0732a("Stream", 0);
    public static final EnumC0732a e = new EnumC0732a("Upload", 1);
    public static final EnumC0732a i = new EnumC0732a("None", 2);
    private static final EnumC0732a[] v;
    private static final T9.a w;

    static {
        EnumC0732a[] enumC0732aArrC = c();
        v = enumC0732aArrC;
        w = b.a(enumC0732aArrC);
    }

    private EnumC0732a(String str, int i2) {
    }

    private static final EnumC0732a[] c() {
        return new EnumC0732a[]{d, e, i};
    }

    public static EnumC0732a valueOf(String str) {
        return (EnumC0732a) Enum.valueOf(EnumC0732a.class, str);
    }

    public static EnumC0732a[] values() {
        return (EnumC0732a[]) v.clone();
    }
}
