package ha;

import T9.a;
import T9.b;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"La9/v;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class EnumC0477v {
    public static final EnumC0477v d = new EnumC0477v("Font", 0);
    public static final EnumC0477v e = new EnumC0477v("Drawable", 1);
    public static final EnumC0477v i = new EnumC0477v("Raw", 2);
    private static final EnumC0477v[] v;
    private static final a w;

    static {
        EnumC0477v[] enumC0477vArrC = c();
        v = enumC0477vArrC;
        w = b.a(enumC0477vArrC);
    }

    private EnumC0477v(String str, int i2) {
    }

    private static final EnumC0477v[] c() {
        return new EnumC0477v[]{d, e, i};
    }

    public static EnumC0477v valueOf(String str) {
        return (EnumC0477v) Enum.valueOf(EnumC0477v.class, str);
    }

    public static EnumC0477v[] values() {
        return (EnumC0477v[]) v.clone();
    }
}
