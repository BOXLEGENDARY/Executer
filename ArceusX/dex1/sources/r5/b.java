package R5;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LR5/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "enabled", "Lcom/roblox/client/n0$d;", "upgradeCheckResult", "<init>", "(ZLcom/roblox/client/n0$d;)V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "c", "(Landroid/content/Context;)V", "a", "Z", "()Z", "setEnabled", "(Z)V", "b", "Lcom/roblox/client/n0$d;", "()Lcom/roblox/client/n0$d;", "setUpgradeCheckResult", "(Lcom/roblox/client/n0$d;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    private boolean enabled;

    private n0.d upgradeCheckResult;

    public b() {
        n0.d dVar = null;
        this(false, dVar, 3, dVar);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final n0.d getUpgradeCheckResult() {
        return this.upgradeCheckResult;
    }

    public final void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public b(boolean z7, n0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "upgradeCheckResult");
        this.enabled = z7;
        this.upgradeCheckResult = dVar;
    }

    public b(boolean z7, n0.d dVar, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? false : z7, (i7 & 2) != 0 ? new n0.d() : dVar);
    }
}
