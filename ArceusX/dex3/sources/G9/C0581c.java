package g9;

import P9.m;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg9/b;", "", "a", "(Lg9/b;)Ljava/lang/String;", "shared_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0581c {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;

        static {
            int[] iArr = new int[EnumC0580b.values().length];
            try {
                iArr[EnumC0580b.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0580b.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @NotNull
    public static final String a(@NotNull EnumC0580b enumC0580b) throws m {
        Intrinsics.checkNotNullParameter(enumC0580b, "<this>");
        int i = a.a[enumC0580b.ordinal()];
        if (i == 1) {
            return "rough";
        }
        if (i == 2) {
            return "precise";
        }
        throw new m();
    }
}
