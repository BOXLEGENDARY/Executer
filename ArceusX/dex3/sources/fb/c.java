package fb;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lfb/c;", "Lfb/k;", "Lfb/j;", "replaceData", "", "times", "<init>", "(Lfb/j;I)V", "", "b", "()Ljava/lang/String;", "e", "Lfb/j;", "a", "()Lfb/j;", "i", "I", "getTimes", "()I", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
final class c extends k {

    @NotNull
    private final ReplaceData replaceData;

    private final int times;

    public c(@NotNull ReplaceData replaceData, int i) {
        super(null);
        Intrinsics.checkNotNullParameter(replaceData, "replaceData");
        this.replaceData = replaceData;
        this.times = i;
    }

    @NotNull
    public ReplaceData getReplaceData() {
        return this.replaceData;
    }

    @NotNull
    public String invoke() {
        return l.b(getReplaceData().getReplaceCandidate(), getReplaceData().getOldString(), getReplaceData().getNewString(), this.times);
    }
}
