package k9;

import android.content.Context;
import android.content.res.Resources;
import com.roblox.client.personasdk.R;
import ha.C0471p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)V", "shared_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0612b {
    public static final void a(@NotNull Context context) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            context.getResources().getLayout(C0471p.c);
        } catch (Resources.NotFoundException unused) {
            C4.a.b(context);
        }
    }
}
