package H8;

import android.content.Context;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u0004\"\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Landroid/content/Context;", "context", "LH8/b;", "c", "(Landroid/content/Context;)LH8/b;", "", "d", "(Landroid/content/Context;)V", "e", "a", "b", "LH8/b;", "errorHandler", "inquiry-internal_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class c {
    private static b a;

    public static final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        c(context).b();
    }

    private static final synchronized b b(Context context) {
        b bVar = a;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(context);
        a = bVar2;
        return bVar2;
    }

    @NotNull
    public static final b c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        b bVar = a;
        return bVar == null ? b(context) : bVar;
    }

    public static final void d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        c(context).d();
    }

    public static final void e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        c(context).f();
    }
}
