package gb;

import P9.m;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ra.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lgb/b;", "", "<init>", "()V", "Lgb/a;", "precision", "", "b", "(Lgb/a;)Ljava/lang/String;", "", "c", "(Lgb/a;)I", "isoDate", "Lra/e;", "a", "(Ljava/lang/String;Lgb/a;)Lra/e;", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public class C0232b {
        public static final int[] a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.MILLISECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.MINUTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.HOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.DAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    private final String b(a precision) throws m {
        switch (C0232b.a[precision.ordinal()]) {
            case 1:
                return "";
            case 2:
                return ".001Z";
            case 3:
                return ":00.001Z";
            case 4:
                return ":00:00.001Z";
            case 5:
                return "T00:00:00.001Z";
            case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                return "-01T00:00:00.001Z";
            case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                return "-01-01T00:00:00.001Z";
            default:
                throw new m();
        }
    }

    private final int c(a precision) throws m {
        switch (C0232b.a[precision.ordinal()]) {
            case 1:
                return 24;
            case 2:
                return 19;
            case 3:
                return 16;
            case 4:
                return 13;
            case 5:
                return 10;
            case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                return 7;
            case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                return 4;
            default:
                throw new m();
        }
    }

    @NotNull
    public final e a(@NotNull String isoDate, @NotNull a precision) throws m {
        Intrinsics.checkNotNullParameter(isoDate, "isoDate");
        Intrinsics.checkNotNullParameter(precision, "precision");
        e.Companion companion = e.INSTANCE;
        String strSubstring = isoDate.substring(0, c(precision));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return companion.f(strSubstring + b(precision));
    }
}
