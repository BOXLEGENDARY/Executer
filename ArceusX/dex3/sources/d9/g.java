package d9;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f¨\u0006\u0012"}, d2 = {"Ld9/g;", "Ld9/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "a", "()Z", "Landroid/content/Context;", "", "b", "()Ljava/lang/String;", "manufacturer", "d", "model", "c", "versionRelease", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class g implements b {

    @NotNull
    private final Context context;

    public g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override
    public boolean a() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    @Override
    @NotNull
    public String b() {
        String str = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(str, "MANUFACTURER");
        return str;
    }

    @Override
    @NotNull
    public String c() {
        String str = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(str, "RELEASE");
        return str;
    }

    @Override
    @NotNull
    public String d() {
        String str = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str, "MODEL");
        return str;
    }
}
