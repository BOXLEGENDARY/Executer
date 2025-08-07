package ha;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import com.roblox.client.personasdk.R;
import ha.InterfaceC0883h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0011"}, d2 = {"LF8/i;", "", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroid/content/Context;", "a", "()Landroid/content/Context;", "Landroid/view/Window;", "c", "()Landroid/view/Window;", "context", "Lz1/h;", "b", "(Landroid/content/Context;)Lz1/h;", "Landroid/app/Activity;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class i {

    @NotNull
    private final Activity activity;

    public i(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
    }

    @NotNull
    public final Context a() {
        Context applicationContext = this.activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    @NotNull
    public final InterfaceC0883h b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new InterfaceC0883h.a(context).j(true).d();
    }

    @NotNull
    public final Window c() {
        Window window = this.activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        return window;
    }
}
