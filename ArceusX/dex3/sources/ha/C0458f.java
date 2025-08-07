package ha;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.roblox.client.personasdk.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001c\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0015\u0010\u000b\u001a\u00020\t*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n\"\u0015\u0010\r\u001a\u00020\t*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\f\u0010\n\"\u0015\u0010\u000f\u001a\u00020\t*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n\"\u0015\u0010\u0012\u001a\u00020\u0001*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0016\u001a\u00020\u0013*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u0018\u001a\u00020\u0013*\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"", "", "g", "(I)Ljava/lang/String;", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "a", "Landroid/util/DisplayMetrics;", "displayMetrics", "", "(D)D", "dpToPx", "c", "pxToDp", "d", "spToPx", "b", "(Ljava/lang/String;)Ljava/lang/String;", "formattedResourceName", "", "e", "(Ljava/lang/String;)Z", "isFallbackInquiryId", "f", "isRegularInquiryId", "shared_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0458f {
    private static final DisplayMetrics a = Resources.getSystem().getDisplayMetrics();

    public static final double a(double d) {
        return d * a.density;
    }

    @NotNull
    public static final String b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return new Regex("[- ]").replace(lowerCase, "_");
    }

    public static final double c(double d) {
        return d / a.density;
    }

    public static final double d(double d) {
        return d * a.scaledDensity;
    }

    public static final boolean e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.D(str, "iqfs", true);
    }

    public static final boolean f(String str) {
        if (str != null) {
            return StringsKt.D(str, "inq_", true);
        }
        return false;
    }

    @NotNull
    public static final String g(int i) {
        C c = C.a;
        String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
