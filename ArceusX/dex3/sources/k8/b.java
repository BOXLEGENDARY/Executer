package K8;

import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.InterfaceC0495g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0014¨\u0006\u0016"}, d2 = {"LK8/b;", "Lcom/squareup/workflow1/ui/g;", "", "screen", "", "isEnabled", "", "name", "<init>", "(Ljava/lang/Object;ZLjava/lang/String;)V", "b", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "c", "Z", "()Z", "d", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "compatibilityKey", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class b implements InterfaceC0495g {

    @NotNull
    private final Object screen;

    private final boolean isEnabled;

    @NotNull
    private final String name;

    public b(@NotNull Object obj, boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(obj, "screen");
        Intrinsics.checkNotNullParameter(str, "name");
        this.screen = obj;
        this.isEnabled = z;
        this.name = str;
    }

    @NotNull
    public final Object getScreen() {
        return this.screen;
    }

    @Override
    @NotNull
    public String getName() {
        return this.name;
    }

    public final boolean getIsEnabled() {
        return this.isEnabled;
    }
}
