package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lsa/F;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class EnumC0766F {
    public static final EnumC0766F d = new EnumC0766F("NONE", 0);
    public static final EnumC0766F e = new EnumC0766F("ZERO", 1);
    public static final EnumC0766F i = new EnumC0766F("SPACE", 2);
    private static final EnumC0766F[] v;
    private static final T9.a w;

    static {
        EnumC0766F[] enumC0766FArrC = c();
        v = enumC0766FArrC;
        w = T9.b.a(enumC0766FArrC);
    }

    private EnumC0766F(String str, int i2) {
    }

    private static final EnumC0766F[] c() {
        return new EnumC0766F[]{d, e, i};
    }

    public static EnumC0766F valueOf(String str) {
        return (EnumC0766F) Enum.valueOf(EnumC0766F.class, str);
    }

    public static EnumC0766F[] values() {
        return (EnumC0766F[]) v.clone();
    }
}
