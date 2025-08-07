package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lsa/g;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class EnumC0785g {
    public static final EnumC0785g d = new EnumC0785g("AM", 0);
    public static final EnumC0785g e = new EnumC0785g("PM", 1);
    private static final EnumC0785g[] i;
    private static final T9.a v;

    static {
        EnumC0785g[] enumC0785gArrC = c();
        i = enumC0785gArrC;
        v = T9.b.a(enumC0785gArrC);
    }

    private EnumC0785g(String str, int i2) {
    }

    private static final EnumC0785g[] c() {
        return new EnumC0785g[]{d, e};
    }

    public static EnumC0785g valueOf(String str) {
        return (EnumC0785g) Enum.valueOf(EnumC0785g.class, str);
    }

    public static EnumC0785g[] values() {
        return (EnumC0785g[]) i.clone();
    }
}
