package s;

import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z.C3043d0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Ls/j2;", BuildConfig.FLAVOR, "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", BuildConfig.FLAVOR, "f", "()V", "c", "h", BuildConfig.FLAVOR, "e", "()I", "a", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/atomic/AtomicInteger;", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "mVideoUsage", "camera-camera2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j2 {

    private final Executor executor;

    private final AtomicInteger mVideoUsage;

    public j2(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.executor = executor;
        this.mVideoUsage = new AtomicInteger(0);
    }

    public static final void d(j2 j2Var) {
        Intrinsics.checkNotNullParameter(j2Var, "this$0");
        int iDecrementAndGet = j2Var.mVideoUsage.decrementAndGet();
        if (iDecrementAndGet >= 0) {
            C3043d0.a("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet);
            return;
        }
        C3043d0.l("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet + ", which is less than 0!");
    }

    public static final void g(j2 j2Var) {
        Intrinsics.checkNotNullParameter(j2Var, "this$0");
        C3043d0.a("VideoUsageControl", "incrementUsage: mVideoUsage = " + j2Var.mVideoUsage.incrementAndGet());
    }

    public final void c() {
        this.executor.execute(new Runnable() {
            @Override
            public final void run() {
                j2.d(this.f23367d);
            }
        });
    }

    public final int e() {
        return this.mVideoUsage.get();
    }

    public final void f() {
        this.executor.execute(new Runnable() {
            @Override
            public final void run() {
                j2.g(this.f23377d);
            }
        });
    }

    public final void h() {
        this.mVideoUsage.set(0);
        C3043d0.a("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
