package v8;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lv8/b;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class EnumC0834b {
    public static final EnumC0834b d = new EnumC0834b("IdTypeRejected", 0);
    public static final EnumC0834b e = new EnumC0834b("UnableToClassify", 1);
    private static final EnumC0834b[] i;
    private static final T9.a v;

    static {
        EnumC0834b[] enumC0834bArrC = c();
        i = enumC0834bArrC;
        v = T9.b.a(enumC0834bArrC);
    }

    private EnumC0834b(String str, int i2) {
    }

    private static final EnumC0834b[] c() {
        return new EnumC0834b[]{d, e};
    }

    public static EnumC0834b valueOf(String str) {
        return (EnumC0834b) Enum.valueOf(EnumC0834b.class, str);
    }

    public static EnumC0834b[] values() {
        return (EnumC0834b[]) i.clone();
    }
}
