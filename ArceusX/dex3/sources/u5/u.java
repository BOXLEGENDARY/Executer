package u5;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.appcompat.app.d;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "Landroidx/appcompat/app/d;", "a", "(Landroid/content/Context;)Landroidx/appcompat/app/d;", "b", "camera_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class u {
    public static final d a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context instanceof d) {
            return (d) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
        return a(baseContext);
    }

    @NotNull
    public static final d b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        d dVarA = a(context);
        if (dVarA != null) {
            return dVarA;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
