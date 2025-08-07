package wa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwa/i;", "", "", "position", "Lkotlin/Function0;", "", "message", "<init>", "(ILkotlin/jvm/functions/Function0;)V", "a", "I", "b", "()I", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class i {

    private final int position;

    @NotNull
    private final Function0<String> message;

    public i(int i, @NotNull Function0<String> function0) {
        Intrinsics.checkNotNullParameter(function0, "message");
        this.position = i;
        this.message = function0;
    }

    @NotNull
    public final Function0<String> a() {
        return this.message;
    }

    public final int getPosition() {
        return this.position;
    }
}
