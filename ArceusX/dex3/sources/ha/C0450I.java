package ha;

import com.roblox.client.personasdk.R;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"La9/I;", "", "", "baseType", "<init>", "(I)V", "a", "()I", "I", "Ljava/util/concurrent/atomic/AtomicInteger;", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextViewType", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0450I {

    private final int baseType;

    @NotNull
    private AtomicInteger nextViewType = new AtomicInteger(0);

    public C0450I(int i) {
        this.baseType = i;
    }

    public final int a() {
        return this.baseType + this.nextViewType.getAndIncrement();
    }
}
