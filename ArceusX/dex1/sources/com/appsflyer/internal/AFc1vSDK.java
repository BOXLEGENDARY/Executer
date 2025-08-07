package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.github.luben.zstd.BuildConfig;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/AFc1vSDK;", "Ljava/util/concurrent/ThreadPoolExecutor;", BuildConfig.FLAVOR, "p0", "p1", BuildConfig.FLAVOR, "p2", "Ljava/util/concurrent/TimeUnit;", "p3", "Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "p4", "Ljava/util/Queue;", "p5", "<init>", "(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/Queue;)V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "afterExecute", "(Ljava/lang/Runnable;Ljava/lang/Throwable;)V", "getRevenue", "Ljava/util/Queue;", "AFAdRevenueData"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFc1vSDK extends ThreadPoolExecutor {

    private final Queue<Runnable> AFAdRevenueData;

    public AFc1vSDK(int i7, int i8, long j7, TimeUnit timeUnit, BlockingQueue blockingQueue, Queue queue, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, i8, j7, timeUnit, blockingQueue, (i9 & 32) != 0 ? new LinkedList() : queue);
    }

    public static final void AFAdRevenueData(Queue queue, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        Intrinsics.checkNotNullParameter(queue, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(runnable, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(threadPoolExecutor, BuildConfig.FLAVOR);
        queue.add(runnable);
    }

    @Override
    protected final void afterExecute(Runnable p02, Throwable p1) {
        Intrinsics.checkNotNullParameter(p02, BuildConfig.FLAVOR);
        super.afterExecute(p02, p1);
        Intrinsics.checkNotNullParameter(p02, BuildConfig.FLAVOR);
        if (p1 != null) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.AF_EXECUTOR, "Error while executing task: " + p02, p1, true, true, true, false, 64, null);
            return;
        }
        synchronized (this) {
            try {
                int size = this.AFAdRevenueData.size();
                for (int i7 = 0; i7 < size; i7++) {
                    Runnable runnablePoll = this.AFAdRevenueData.poll();
                    if (runnablePoll != null) {
                        execute(runnablePoll);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private AFc1vSDK(int i7, int i8, long j7, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, final Queue<Runnable> queue) {
        super(i7, i8, j7, timeUnit, blockingQueue, new RejectedExecutionHandler() {
            @Override
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                AFc1vSDK.AFAdRevenueData(queue, runnable, threadPoolExecutor);
            }
        });
        Intrinsics.checkNotNullParameter(timeUnit, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(blockingQueue, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(queue, BuildConfig.FLAVOR);
        this.AFAdRevenueData = queue;
    }
}
