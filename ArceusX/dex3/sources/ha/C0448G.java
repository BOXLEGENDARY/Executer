package ha;

import androidx.recyclerview.widget.RecyclerView;
import com.roblox.client.personasdk.R;
import j1.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"La9/G;", "Lj1/a;", "T", "Landroidx/recyclerview/widget/RecyclerView$D;", "binding", "<init>", "(Lj1/a;)V", "u", "Lj1/a;", "O", "()Lj1/a;", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0448G<T extends a> extends RecyclerView.D {

    @NotNull
    private final T binding;

    public C0448G(@NotNull T t) {
        super(t.a());
        Intrinsics.checkNotNullParameter(t, "binding");
        this.binding = t;
    }

    @NotNull
    public final T O() {
        return this.binding;
    }
}
