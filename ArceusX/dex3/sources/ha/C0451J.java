package ha;

import com.roblox.client.personasdk.R;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"La9/J;", "", "<init>", "()V", "La9/I;", "a", "()La9/I;", "Ljava/util/concurrent/atomic/AtomicInteger;", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "viewTypeGeneratorCount", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0451J {

    @NotNull
    public static final C0451J a = new C0451J();

    @NotNull
    private static AtomicInteger viewTypeGeneratorCount = new AtomicInteger(0);

    private C0451J() {
    }

    @NotNull
    public final C0450I a() {
        return new C0450I((viewTypeGeneratorCount.getAndIncrement() * 4096) + 268435456);
    }
}
