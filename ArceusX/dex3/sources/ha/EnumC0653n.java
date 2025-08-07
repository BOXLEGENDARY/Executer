package ha;

import T9.a;
import T9.b;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Ln8/n;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class EnumC0653n {
    public static final EnumC0653n d = new EnumC0653n("FRONT", 0);
    public static final EnumC0653n e = new EnumC0653n("BACK", 1);
    private static final EnumC0653n[] i;
    private static final a v;

    static {
        EnumC0653n[] enumC0653nArrC = c();
        i = enumC0653nArrC;
        v = b.a(enumC0653nArrC);
    }

    private EnumC0653n(String str, int i2) {
    }

    private static final EnumC0653n[] c() {
        return new EnumC0653n[]{d, e};
    }

    public static EnumC0653n valueOf(String str) {
        return (EnumC0653n) Enum.valueOf(EnumC0653n.class, str);
    }

    public static EnumC0653n[] values() {
        return (EnumC0653n[]) i.clone();
    }
}
