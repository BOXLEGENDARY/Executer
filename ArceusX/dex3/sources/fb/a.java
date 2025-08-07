package fb;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lfb/a;", "Lfb/k;", "Lfb/j;", "replaceData", "<init>", "(Lfb/j;)V", "", "b", "()Ljava/lang/String;", "e", "Lfb/j;", "a", "()Lfb/j;", "i", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
final class a extends k {

    @NotNull
    private final ReplaceData replaceData;

    public a(@NotNull ReplaceData replaceData) {
        super(null);
        Intrinsics.checkNotNullParameter(replaceData, "replaceData");
        this.replaceData = replaceData;
    }

    @NotNull
    public ReplaceData getReplaceData() {
        return this.replaceData;
    }

    @NotNull
    public String invoke() {
        return StringsKt.z(getReplaceData().getReplaceCandidate(), getReplaceData().getOldString(), getReplaceData().getNewString(), false, 4, (Object) null);
    }
}
