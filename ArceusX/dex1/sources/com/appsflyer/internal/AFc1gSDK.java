package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class AFc1gSDK implements AFc1fSDK {
    private static final int getMonetizationNetwork = (int) TimeUnit.SECONDS.toMillis(30);
    private AFf1iSDK AFInAppEventParameterName;
    private AFc1tSDK AFInAppEventType;
    private AFe1ySDK AFKeystoreWrapper;
    private AFc1dSDK AFLogger;
    private AFb1zSDK afDebugLog;
    private AFi1rSDK afErrorLog;
    private AFg1bSDK afErrorLogForExcManagerOnly;
    private AFg1vSDK afInfoLog;
    private AFf1eSDK afLogForce;
    private AFe1vSDK afVerboseLog;
    private AFi1kSDK afWarnLog;
    private AFf1mSDK areAllFieldsValid;
    private AFc1qSDK component1;
    private PurchaseHandler component2;
    private AFd1nSDK component3;
    private AFc1kSDK component4;
    private AFd1sSDK copy;
    private AFe1sSDK copydefault;

    private AFi1ySDK f13588d;

    private AFi1sSDK f13589e;
    private AFj1rSDK equals;
    private AFa1oSDK force;
    private ExecutorService getCurrencyIso4217Code;
    private AFg1ySDK getLevel;
    private ScheduledExecutorService getMediationNetwork;
    private ExecutorService getRevenue;
    private AFh1uSDK hashCode;

    private AFj1kSDK f13590i;
    private AFj1zSDK registerClient;
    private AFg1tSDK toString;
    private AFf1aSDK unregisterClient;

    private AFa1lSDK f13591v;
    private AFc1oSDK values;

    private AFb1aSDK f13592w;
    private String afRDLog = null;
    public final AFc1hSDK AFAdRevenueData = new AFc1hSDK();

    static class AFa1zSDK implements ThreadFactory {
        private static final AtomicInteger getCurrencyIso4217Code = new AtomicInteger();
        private final AtomicInteger getMonetizationNetwork = new AtomicInteger();

        public AFa1zSDK() {
            getCurrencyIso4217Code.incrementAndGet();
        }

        @Override
        public final Thread newThread(Runnable runnable) {
            int i7 = getCurrencyIso4217Code.get();
            int iIncrementAndGet = this.getMonetizationNetwork.incrementAndGet();
            StringBuilder sb = new StringBuilder("queue-");
            sb.append(i7);
            sb.append("-");
            sb.append(iIncrementAndGet);
            return new Thread(runnable, sb.toString());
        }
    }

    private synchronized AFg1ySDK AFLoggerLogLevel() {
        try {
            if (this.getLevel == null) {
                this.getLevel = new AFg1ySDK(AFLogger(), getRevenue());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.getLevel;
    }

    private synchronized AFj1kSDK AFPurchaseDetails() {
        try {
            if (this.f13590i == null) {
                this.f13590i = new AFj1kSDK(getRevenue());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f13590i;
    }

    private String afVerboseLog() {
        if (this.afRDLog == null) {
            this.afRDLog = new AFa1ySDK().getMediationNetwork();
        }
        return this.afRDLog;
    }

    private synchronized AFd1nSDK afWarnLog() {
        try {
            if (this.component3 == null) {
                this.component3 = new AFd1nSDK(new AFd1jSDK(getMonetizationNetwork), AFAdRevenueData());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.component3;
    }

    @Override
    public synchronized AFc1dSDK afRDLog() {
        try {
            if (this.AFLogger == null) {
                this.AFLogger = new AFc1dSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFLogger;
    }

    public SharedPreferences m_() {
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        if (context != null) {
            return com.appsflyer.internal.AFa1zSDK.c_(context);
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    private synchronized ExecutorService valueOf() {
        try {
            if (this.getRevenue == null) {
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, BuildConfig.FLAVOR);
                this.getRevenue = executorServiceNewSingleThreadExecutor;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.getRevenue;
    }

    @Override
    public final synchronized ExecutorService AFAdRevenueData() {
        try {
            if (this.getCurrencyIso4217Code == null) {
                this.getCurrencyIso4217Code = new AFc1vSDK(0, 5, 60L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.getCurrencyIso4217Code;
    }

    @Override
    public final synchronized AFj1zSDK AFInAppEventParameterName() {
        try {
            if (this.registerClient == null) {
                this.registerClient = new AFj1zSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.registerClient;
    }

    @Override
    public final synchronized AFe1ySDK AFInAppEventType() {
        try {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = new AFe1ySDK(getRevenue(), component1());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFKeystoreWrapper;
    }

    @Override
    public final synchronized AFf1iSDK AFKeystoreWrapper() {
        try {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = new AFf1iSDK(AFLogger(), new AFf1lSDK());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFInAppEventParameterName;
    }

    @Override
    public final synchronized AFc1hSDK AFLogger() {
        return this.AFAdRevenueData;
    }

    @Override
    public final AFb1aSDK afDebugLog() {
        if (this.f13592w == null) {
            ExecutorService executorServiceValueOf = valueOf();
            ScheduledExecutorService monetizationNetwork = getMonetizationNetwork();
            AFa1oSDK aFa1oSDKE = e();
            if (this.afErrorLog == null) {
                this.afErrorLog = new AFi1qSDK();
            }
            this.f13592w = new AFb1gSDK(executorServiceValueOf, monetizationNetwork, aFa1oSDKE, this.afErrorLog);
        }
        return this.f13592w;
    }

    @Override
    public final AFc1oSDK afErrorLog() {
        if (this.values == null) {
            this.values = new AFc1oSDK();
        }
        return this.values;
    }

    @Override
    public final AFa1lSDK afErrorLogForExcManagerOnly() {
        if (this.f13591v == null) {
            this.f13591v = new AFa1jSDK(component1());
        }
        return this.f13591v;
    }

    @Override
    public final AFi1kSDK afInfoLog() {
        String message = BuildConfig.FLAVOR;
        try {
            if (this.afWarnLog == null) {
                try {
                    Object[] objArr = {getRevenue(), AFLogger(), AFKeystoreWrapper()};
                    Map map = AFi1mSDK.f13603d;
                    Object declaredConstructor = map.get(119728278);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFi1mSDK.getRevenue((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (-1) - Process.getGidForName(BuildConfig.FLAVOR), TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 37)).getDeclaredConstructor(AFc1kSDK.class, AFc1hSDK.class, AFf1iSDK.class);
                        map.put(119728278, declaredConstructor);
                    }
                    this.afWarnLog = (AFi1kSDK) ((Constructor) declaredConstructor).newInstance(objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1zSDK aFh1zSDK = AFh1zSDK.PLAY_INTEGRITY_API;
            if (th2.getMessage() != null) {
                message = th2.getMessage();
            }
            aFLogger.e(aFh1zSDK, message, th2, false, false);
        }
        return this.afWarnLog;
    }

    @Override
    public final AFb1hSDK afLogForce() {
        if (this.values == null) {
            this.values = new AFc1oSDK();
        }
        return new AFb1bSDK(this.values, AFLogger(), AFKeystoreWrapper());
    }

    @Override
    public final synchronized PurchaseHandler areAllFieldsValid() {
        try {
            if (this.component2 == null) {
                this.component2 = new PurchaseHandler(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.component2;
    }

    @Override
    public final AFc1sSDK component1() {
        if (this.component1 == null) {
            this.component1 = new AFc1qSDK(new AFc1iSDK(new Function0() {
                public final Object invoke() {
                    return this.f13655d.m_();
                }
            }));
        }
        return this.component1;
    }

    @Override
    public final synchronized AFh1uSDK component2() {
        try {
            if (this.hashCode == null) {
                this.hashCode = new AFh1uSDK(component1());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.hashCode;
    }

    @Override
    public final AFg1tSDK component3() {
        if (this.toString == null) {
            String strAfVerboseLog = afVerboseLog();
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.f13589e == null) {
                this.f13589e = new AFi1pSDK();
            }
            AFi1sSDK aFi1sSDK = this.f13589e;
            if (this.unregisterClient == null) {
                this.unregisterClient = new AFg1sSDK();
            }
            AFf1aSDK aFf1aSDK = this.unregisterClient;
            if (this.equals == null) {
                Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                if (context2 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.equals = new AFj1uSDK(context2, valueOf());
            }
            AFj1rSDK aFj1rSDK = this.equals;
            if (this.afInfoLog == null) {
                this.afInfoLog = new AFg1wSDK();
            }
            AFg1vSDK aFg1vSDK = this.afInfoLog;
            AFh1uSDK aFh1uSDKComponent2 = component2();
            AFc1sSDK aFc1sSDKComponent1 = component1();
            AFc1kSDK revenue = getRevenue();
            if (this.f13588d == null) {
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                if (context3 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.f13588d = new AFi1ySDK(context3);
            }
            AFi1ySDK aFi1ySDK = this.f13588d;
            AFf1iSDK aFf1iSDKAFKeystoreWrapper = AFKeystoreWrapper();
            AFc1hSDK aFc1hSDKAFLogger = AFLogger();
            AFg1ySDK aFg1ySDKAFLoggerLogLevel = AFLoggerLogLevel();
            if (this.values == null) {
                this.values = new AFc1oSDK();
            }
            this.toString = new AFg1uSDK(strAfVerboseLog, context, aFi1sSDK, aFf1aSDK, aFj1rSDK, aFg1vSDK, aFh1uSDKComponent2, aFc1sSDKComponent1, revenue, aFi1ySDK, aFf1iSDKAFKeystoreWrapper, aFc1hSDKAFLogger, aFg1ySDKAFLoggerLogLevel, this.values);
        }
        return this.toString;
    }

    @Override
    public final synchronized AFf1mSDK component4() {
        try {
            if (this.areAllFieldsValid == null) {
                AFf1nSDK aFf1nSDK = new AFf1nSDK(component1());
                this.areAllFieldsValid = new AFf1mSDK(new AFf1oSDK(), getRevenue(), AFKeystoreWrapper(), aFf1nSDK, new AFd1lSDK(afWarnLog(), getRevenue(), AppsFlyerProperties.getInstance(), AFInAppEventType(), AFPurchaseDetails()), new AFf1pSDK(getRevenue(), aFf1nSDK), equals());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.areAllFieldsValid;
    }

    @Override
    public final synchronized AFd1sSDK copy() {
        try {
            if (this.copy == null) {
                this.copy = new AFd1tSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.copy;
    }

    @Override
    public final AFj1rSDK copydefault() {
        if (this.equals == null) {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.equals = new AFj1uSDK(context, valueOf());
        }
        return this.equals;
    }

    @Override
    public final synchronized AFb1zSDK d() {
        try {
            if (this.afDebugLog == null) {
                this.afDebugLog = new AFa1aSDK(AFLogger());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afDebugLog;
    }

    @Override
    public final synchronized AFa1oSDK e() {
        try {
            if (this.force == null) {
                this.force = new AFa1oSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.force;
    }

    @Override
    public final synchronized AFe1sSDK equals() {
        try {
            if (this.copydefault == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() {
                    @Override
                    public boolean offer(Runnable runnable) {
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, new AFa1zSDK());
                threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() {
                    @Override
                    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) throws InterruptedException {
                        AFc1gSDK.getMediationNetwork(runnable, threadPoolExecutor2);
                    }
                });
                this.copydefault = new AFe1sSDK(threadPoolExecutor);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.copydefault;
    }

    @Override
    public final AFg1bSDK force() {
        if (this.afErrorLogForExcManagerOnly == null) {
            this.afErrorLogForExcManagerOnly = new AFh1ySDK(this);
        }
        return this.afErrorLogForExcManagerOnly;
    }

    @Override
    public final AFe1vSDK getCurrencyIso4217Code() {
        if (this.afVerboseLog == null) {
            this.afVerboseLog = new AFe1vSDK(component1(), AFLogger(), getRevenue(), AFAdRevenueData(), component3(), AFKeystoreWrapper(), equals());
        }
        return this.afVerboseLog;
    }

    @Override
    public final AFd1lSDK getMediationNetwork() {
        return new AFd1lSDK(afWarnLog(), getRevenue(), AppsFlyerProperties.getInstance(), AFInAppEventType(), AFPurchaseDetails());
    }

    @Override
    public final synchronized ScheduledExecutorService getMonetizationNetwork() {
        try {
            if (this.getMediationNetwork == null) {
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
                Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, BuildConfig.FLAVOR);
                this.getMediationNetwork = scheduledExecutorServiceNewScheduledThreadPool;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.getMediationNetwork;
    }

    @Override
    public final synchronized AFc1kSDK getRevenue() {
        try {
            if (this.component4 == null) {
                AFc1hSDK aFc1hSDKAFLogger = AFLogger();
                AFc1sSDK aFc1sSDKComponent1 = component1();
                if (this.values == null) {
                    this.values = new AFc1oSDK();
                }
                this.component4 = new AFc1kSDK(aFc1hSDKAFLogger, aFc1sSDKComponent1, this.values, AFAdRevenueData());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.component4;
    }

    @Override
    public final AFi1sSDK i() {
        if (this.f13589e == null) {
            this.f13589e = new AFi1pSDK();
        }
        return this.f13589e;
    }

    @Override
    public final synchronized AFc1tSDK registerClient() {
        try {
            if (this.AFInAppEventType == null) {
                this.AFInAppEventType = new AFc1rSDK(AFLogger());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFInAppEventType;
    }

    @Override
    public final AFi1rSDK unregisterClient() {
        if (this.afErrorLog == null) {
            this.afErrorLog = new AFi1qSDK();
        }
        return this.afErrorLog;
    }

    @Override
    public final AFf1eSDK v() {
        if (this.afLogForce == null) {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            AFf1gSDK aFf1gSDK = new AFf1gSDK(context, AppsFlyerProperties.getInstance());
            if (this.values == null) {
                this.values = new AFc1oSDK();
            }
            this.afLogForce = new AFf1dSDK(aFf1gSDK, this.values, AppsFlyerProperties.getInstance());
        }
        return this.afLogForce;
    }

    @Override
    public final AFi1ySDK w() {
        if (this.f13588d == null) {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.f13588d = new AFi1ySDK(context);
        }
        return this.f13588d;
    }

    public static void getMediationNetwork(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) throws InterruptedException {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e7) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e7);
            Thread.currentThread().interrupt();
        }
    }
}
