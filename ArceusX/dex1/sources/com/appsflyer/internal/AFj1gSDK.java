package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/appsflyer/internal/AFj1gSDK;", BuildConfig.FLAVOR, "<init>", "()V", "Ljava/util/concurrent/ScheduledExecutorService;", "p0", "Ljava/lang/Runnable;", "p1", BuildConfig.FLAVOR, "p2", "Ljava/util/concurrent/TimeUnit;", "p3", BuildConfig.FLAVOR, "getMediationNetwork", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFj1gSDK {
    public static final AFj1gSDK INSTANCE = new AFj1gSDK();

    private AFj1gSDK() {
    }

    public static final void getMediationNetwork(ScheduledExecutorService p02, Runnable p1, long p22, TimeUnit p32) {
        Intrinsics.checkNotNullParameter(p02, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(p1, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(p32, BuildConfig.FLAVOR);
        try {
            p02.schedule(p1, p22, p32);
        } catch (RejectedExecutionException e7) {
            AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e7);
        } catch (Throwable th) {
            AFLogger.afErrorLog("scheduleJob failed with Exception", th);
        }
    }
}
