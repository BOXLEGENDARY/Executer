package Y0;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LY0/B;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ljava/lang/Runnable;", "command", BuildConfig.FLAVOR, "execute", "(Ljava/lang/Runnable;)V", "c", "()V", "d", "Ljava/util/concurrent/Executor;", "Ljava/util/ArrayDeque;", "e", "Ljava/util/ArrayDeque;", "tasks", "i", "Ljava/lang/Runnable;", "active", BuildConfig.FLAVOR, "v", "Ljava/lang/Object;", "syncLock", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class B implements Executor {

    private final Executor executor;

    private final ArrayDeque<Runnable> tasks;

    private Runnable active;

    private final Object syncLock;

    public B(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.executor = executor;
        this.tasks = new ArrayDeque<>();
        this.syncLock = new Object();
    }

    public static final void b(Runnable runnable, B b2) {
        Intrinsics.checkNotNullParameter(runnable, "$command");
        Intrinsics.checkNotNullParameter(b2, "this$0");
        try {
            runnable.run();
        } finally {
            b2.c();
        }
    }

    public final void c() {
        synchronized (this.syncLock) {
            try {
                Runnable runnablePoll = this.tasks.poll();
                Runnable runnable = runnablePoll;
                this.active = runnable;
                if (runnablePoll != null) {
                    this.executor.execute(runnable);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public void execute(final Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        synchronized (this.syncLock) {
            try {
                this.tasks.offer(new Runnable() {
                    @Override
                    public final void run() {
                        B.b(command, this);
                    }
                });
                if (this.active == null) {
                    c();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
