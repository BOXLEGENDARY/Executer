package J8;

import com.roblox.client.personasdk.R;
import ha.EnumC0342d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LF8/d;", "", "a", "(LF8/d;)Ljava/lang/String;", "inquiry-internal_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;

        static {
            int[] iArr = new int[EnumC0342d.values().length];
            try {
                iArr[EnumC0342d.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0342d.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @NotNull
    public static final String a(@NotNull EnumC0342d enumC0342d) throws P9.m {
        Intrinsics.checkNotNullParameter(enumC0342d, "<this>");
        int i = a.a[enumC0342d.ordinal()];
        if (i == 1) {
            return "production";
        }
        if (i == 2) {
            return "sandbox";
        }
        throw new P9.m();
    }
}
