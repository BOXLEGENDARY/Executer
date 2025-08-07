package T8;

import T8.c;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u0018\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u001f\u0010$¨\u0006%"}, d2 = {"LT8/i;", "", "R", "mainScreen", "Lkotlin/Function0;", "", "onFabClick", "LT8/c$b;", "getCurrentForcedStatus", "", "simulateGovIdNfc", "Lkotlin/Function1;", "onSimulateGovIdNfcChanged", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Lkotlin/jvm/functions/Function0;", "c", "()Lkotlin/jvm/functions/Function0;", "d", "Z", "e", "()Z", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "sandbox_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class SandboxScreen<R> {

    @NotNull
    private final R mainScreen;

    @NotNull
    private final Function0<Unit> onFabClick;

    @NotNull
    private final Function0<c.b> getCurrentForcedStatus;

    private final boolean simulateGovIdNfc;

    @NotNull
    private final Function1<Boolean, Unit> onSimulateGovIdNfcChanged;

    public SandboxScreen(@NotNull R r, @NotNull Function0<Unit> function0, @NotNull Function0<? extends c.b> function02, boolean z, @NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(r, "mainScreen");
        Intrinsics.checkNotNullParameter(function0, "onFabClick");
        Intrinsics.checkNotNullParameter(function02, "getCurrentForcedStatus");
        Intrinsics.checkNotNullParameter(function1, "onSimulateGovIdNfcChanged");
        this.mainScreen = r;
        this.onFabClick = function0;
        this.getCurrentForcedStatus = function02;
        this.simulateGovIdNfc = z;
        this.onSimulateGovIdNfcChanged = function1;
    }

    @NotNull
    public final Function0<c.b> a() {
        return this.getCurrentForcedStatus;
    }

    @NotNull
    public final R b() {
        return this.mainScreen;
    }

    @NotNull
    public final Function0<Unit> c() {
        return this.onFabClick;
    }

    @NotNull
    public final Function1<Boolean, Unit> d() {
        return this.onSimulateGovIdNfcChanged;
    }

    public final boolean getSimulateGovIdNfc() {
        return this.simulateGovIdNfc;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SandboxScreen)) {
            return false;
        }
        SandboxScreen sandboxScreen = (SandboxScreen) other;
        return Intrinsics.b(this.mainScreen, sandboxScreen.mainScreen) && Intrinsics.b(this.onFabClick, sandboxScreen.onFabClick) && Intrinsics.b(this.getCurrentForcedStatus, sandboxScreen.getCurrentForcedStatus) && this.simulateGovIdNfc == sandboxScreen.simulateGovIdNfc && Intrinsics.b(this.onSimulateGovIdNfcChanged, sandboxScreen.onSimulateGovIdNfcChanged);
    }

    public int hashCode() {
        return (((((((this.mainScreen.hashCode() * 31) + this.onFabClick.hashCode()) * 31) + this.getCurrentForcedStatus.hashCode()) * 31) + Boolean.hashCode(this.simulateGovIdNfc)) * 31) + this.onSimulateGovIdNfcChanged.hashCode();
    }

    @NotNull
    public String toString() {
        return "SandboxScreen(mainScreen=" + this.mainScreen + ", onFabClick=" + this.onFabClick + ", getCurrentForcedStatus=" + this.getCurrentForcedStatus + ", simulateGovIdNfc=" + this.simulateGovIdNfc + ", onSimulateGovIdNfcChanged=" + this.onSimulateGovIdNfcChanged + ")";
    }
}
