package Q8;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LQ8/l;", "", "b", "(LQ8/l;)Ljava/lang/String;", "LQ8/j;", "a", "(LQ8/l;)LQ8/j;", "permissions_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    @NotNull
    public static final j a(@NotNull l lVar) throws P9.m {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        int i = a.a[lVar.ordinal()];
        if (i == 1) {
            return j.d;
        }
        if (i == 2) {
            return j.e;
        }
        if (i == 3) {
            return j.i;
        }
        if (i == 4) {
            return j.v;
        }
        throw new P9.m();
    }

    @NotNull
    public static final String b(@NotNull l lVar) throws P9.m {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        int i = a.a[lVar.ordinal()];
        if (i == 1) {
            return "android.permission.CAMERA";
        }
        if (i == 2) {
            return "android.permission.RECORD_AUDIO";
        }
        if (i == 3) {
            return "android.permission.ACCESS_COARSE_LOCATION";
        }
        if (i == 4) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        throw new P9.m();
    }
}
