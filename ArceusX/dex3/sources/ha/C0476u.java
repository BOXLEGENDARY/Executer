package ha;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.roblox.client.personasdk.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\b\u0001\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroid/content/Context;", "", "attrColor", "Landroid/util/TypedValue;", "typedValue", "", "resolveRefs", "c", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)I", "attrBool", "defaultValue", "a", "(Landroid/content/Context;ILandroid/util/TypedValue;ZZ)Z", "attrImage", "e", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)Ljava/lang/Integer;", "", "resourceName", "La9/v;", "resourceType", "g", "(Landroid/content/Context;Ljava/lang/String;La9/v;)Ljava/lang/Integer;", "shared_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0476u {
    public static final boolean a(@NotNull Context context, int i, @NotNull TypedValue typedValue, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        return (context.getTheme().resolveAttribute(i, typedValue, z) && typedValue.type == 18) ? typedValue.data != 0 : z2;
    }

    public static boolean b(Context context, int i, TypedValue typedValue, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        return a(context, i, typedValue, z, z2);
    }

    public static final int c(@NotNull Context context, int i, @NotNull TypedValue typedValue, boolean z) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        context.getTheme().resolveAttribute(i, typedValue, z);
        return typedValue.data;
    }

    public static int d(Context context, int i, TypedValue typedValue, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        return c(context, i, typedValue, z);
    }

    public static final Integer e(@NotNull Context context, int i, @NotNull TypedValue typedValue, boolean z) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        context.getTheme().resolveAttribute(i, typedValue, z);
        if (typedValue.type == 0) {
            return null;
        }
        return Integer.valueOf(typedValue.resourceId);
    }

    public static Integer f(Context context, int i, TypedValue typedValue, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        return e(context, i, typedValue, z);
    }

    public static final Integer g(@NotNull Context context, @NotNull String str, @NotNull EnumC0477v enumC0477v) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(str, "resourceName");
        Intrinsics.checkNotNullParameter(enumC0477v, "resourceType");
        String strB = C0458f.b(str);
        String resourcePackageName = context.getResources().getResourcePackageName(C0470o.i);
        int identifier = context.getResources().getIdentifier(strB, enumC0477v.name(), resourcePackageName);
        if (identifier <= 0) {
            Resources resources = context.getResources();
            String lowerCase = enumC0477v.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            identifier = resources.getIdentifier(strB, lowerCase, resourcePackageName);
        }
        if (identifier > 0) {
            return Integer.valueOf(identifier);
        }
        return null;
    }
}
