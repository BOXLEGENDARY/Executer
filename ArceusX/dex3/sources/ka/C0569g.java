package ka;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lf8/g;", "RenderingT", "", "rendering", "Lf8/m;", "snapshot", "<init>", "(Ljava/lang/Object;Lf8/m;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "Lf8/m;", "()Lf8/m;", "wf1-workflow-runtime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class C0569g<RenderingT> {

    private final RenderingT rendering;

    @NotNull
    private final C0573m snapshot;

    public C0569g(RenderingT renderingt, @NotNull C0573m c0573m) {
        Intrinsics.checkNotNullParameter(c0573m, "snapshot");
        this.rendering = renderingt;
        this.snapshot = c0573m;
    }

    public final RenderingT a() {
        return this.rendering;
    }

    @NotNull
    public final C0573m getSnapshot() {
        return this.snapshot;
    }
}
