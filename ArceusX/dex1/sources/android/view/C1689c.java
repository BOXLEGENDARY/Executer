package android.view;

import com.github.luben.zstd.BuildConfig;
import ha.D0;
import ha.L;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/c;", "Ljava/io/Closeable;", "Lha/L;", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", BuildConfig.FLAVOR, "close", "()V", "d", "Lkotlin/coroutines/CoroutineContext;", "H0", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "lifecycle-viewmodel-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C1689c implements Closeable, L {

    private final CoroutineContext coroutineContext;

    public C1689c(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "context");
        this.coroutineContext = coroutineContext;
    }

    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override
    public void close() {
        D0.d(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }
}
