package ha;

import T9.a;
import T9.b;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"La9/i;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class EnumC0461i {
    public static final EnumC0461i d = new EnumC0461i("Debug", 0);
    public static final EnumC0461i e = new EnumC0461i("Warning", 1);
    public static final EnumC0461i i = new EnumC0461i("Error", 2);
    private static final EnumC0461i[] v;
    private static final a w;

    static {
        EnumC0461i[] enumC0461iArrC = c();
        v = enumC0461iArrC;
        w = b.a(enumC0461iArrC);
    }

    private EnumC0461i(String str, int i2) {
    }

    private static final EnumC0461i[] c() {
        return new EnumC0461i[]{d, e, i};
    }

    public static EnumC0461i valueOf(String str) {
        return (EnumC0461i) Enum.valueOf(EnumC0461i.class, str);
    }

    public static EnumC0461i[] values() {
        return (EnumC0461i[]) v.clone();
    }
}
