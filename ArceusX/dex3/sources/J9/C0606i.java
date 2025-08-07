package j9;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lj9/i;", "", "screen", "Lj9/h;", "transition", "<init>", "(Ljava/lang/Object;Lj9/h;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "Lj9/h;", "()Lj9/h;", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0606i {

    @NotNull
    private final Object screen;

    @NotNull
    private final EnumC0605h transition;

    public C0606i(@NotNull Object obj, @NotNull EnumC0605h enumC0605h) {
        Intrinsics.checkNotNullParameter(obj, "screen");
        Intrinsics.checkNotNullParameter(enumC0605h, "transition");
        this.screen = obj;
        this.transition = enumC0605h;
    }

    @NotNull
    public final Object getScreen() {
        return this.screen;
    }

    @NotNull
    public final EnumC0605h getTransition() {
        return this.transition;
    }
}
