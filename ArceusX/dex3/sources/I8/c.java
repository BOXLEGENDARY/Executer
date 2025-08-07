package I8;

import androidx.lifecycle.E;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.FallbackMode;
import ha.EnumC0342d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u8.InterfaceC0808a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017¨\u0006\u0018"}, d2 = {"LI8/c;", "", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "fallbackMode", "LF8/d;", "environment", "Landroidx/lifecycle/E;", "savedStateHandle", "<init>", "(Lcom/withpersona/sdk2/inquiry/FallbackMode;LF8/d;Landroidx/lifecycle/E;)V", "LI8/i;", "fallbackModeManager", "Lu8/a;", "c", "(LI8/i;)Lu8/a;", "b", "()Lcom/withpersona/sdk2/inquiry/FallbackMode;", "a", "()LF8/d;", "d", "()Landroidx/lifecycle/E;", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "LF8/d;", "Landroidx/lifecycle/E;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class c {

    @NotNull
    private final FallbackMode fallbackMode;

    @NotNull
    private final EnumC0342d environment;

    @NotNull
    private final E savedStateHandle;

    public c(@NotNull FallbackMode fallbackMode, @NotNull EnumC0342d enumC0342d, @NotNull E e) {
        Intrinsics.checkNotNullParameter(fallbackMode, "fallbackMode");
        Intrinsics.checkNotNullParameter(enumC0342d, "environment");
        Intrinsics.checkNotNullParameter(e, "savedStateHandle");
        this.fallbackMode = fallbackMode;
        this.environment = enumC0342d;
        this.savedStateHandle = e;
    }

    @NotNull
    public final EnumC0342d getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final FallbackMode getFallbackMode() {
        return this.fallbackMode;
    }

    @NotNull
    public final InterfaceC0808a c(@NotNull i fallbackModeManager) {
        Intrinsics.checkNotNullParameter(fallbackModeManager, "fallbackModeManager");
        return fallbackModeManager;
    }

    @NotNull
    public final E getSavedStateHandle() {
        return this.savedStateHandle;
    }
}
