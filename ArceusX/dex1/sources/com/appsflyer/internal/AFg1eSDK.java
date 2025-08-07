package com.appsflyer.internal;

import Za.qhkq.dHkZSUxHu;
import android.util.Log;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJG\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\fJ1\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\fJ'\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\fR\u0014\u0010\u0018\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/appsflyer/internal/AFg1eSDK;", "Lcom/appsflyer/internal/AFg1gSDK;", "<init>", "()V", "Lcom/appsflyer/internal/AFh1zSDK;", "p0", BuildConfig.FLAVOR, "p1", BuildConfig.FLAVOR, "p2", BuildConfig.FLAVOR, "d", "(Lcom/appsflyer/internal/AFh1zSDK;Ljava/lang/String;Z)V", BuildConfig.FLAVOR, "p3", "p4", "p5", "p6", "e", "(Lcom/appsflyer/internal/AFh1zSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFh1zSDK;Ljava/lang/String;)V", "i", "Lcom/appsflyer/AFLogger$LogLevel;", "getCurrencyIso4217Code", "(Lcom/appsflyer/AFLogger$LogLevel;Lcom/appsflyer/internal/AFh1zSDK;Ljava/lang/String;Ljava/lang/Throwable;)V", "getMonetizationNetwork", "(Lcom/appsflyer/AFLogger$LogLevel;)Z", "v", "w", "getShouldExtendMsg", "()Z", "AFa1uSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFg1eSDK extends AFg1gSDK {

    public class AFa1tSDK {
        public static final int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFLogger.LogLevel.values().length];
            try {
                iArr[AFLogger.LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFLogger.LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFLogger.LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AFLogger.LogLevel.VERBOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AFLogger.LogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AFLogger.LogLevel.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            getMediationNetwork = iArr;
        }
    }

    private final void getCurrencyIso4217Code(AFLogger.LogLevel p02, AFh1zSDK p1, String p22, Throwable p32) {
        if (getMonetizationNetwork(p02)) {
            String monetizationNetwork = getMonetizationNetwork(p22, p1);
            int i7 = AFa1tSDK.getMediationNetwork[p02.ordinal()];
            if (i7 == 1) {
                Log.d("AppsFlyer_6.16.2", monetizationNetwork);
                return;
            }
            if (i7 == 2) {
                Log.i("AppsFlyer_6.16.2", monetizationNetwork);
                return;
            }
            if (i7 == 3) {
                Log.w("AppsFlyer_6.16.2", monetizationNetwork);
            } else if (i7 == 4) {
                Log.v("AppsFlyer_6.16.2", monetizationNetwork);
            } else {
                if (i7 != 5) {
                    return;
                }
                Log.e("AppsFlyer_6.16.2", monetizationNetwork, p32);
            }
        }
    }

    private static boolean getMonetizationNetwork(AFLogger.LogLevel p02) {
        return p02.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    @Override
    public final void d(AFh1zSDK p02, String p1, boolean p22) {
        Intrinsics.checkNotNullParameter(p02, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(p1, BuildConfig.FLAVOR);
        getCurrencyIso4217Code(AFLogger.LogLevel.DEBUG, p02, p1, null);
    }

    @Override
    public final void e(AFh1zSDK p02, String p1, Throwable p22, boolean p32, boolean p42, boolean p52, boolean p62) {
        Intrinsics.checkNotNullParameter(p02, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(p1, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(p22, BuildConfig.FLAVOR);
        if (p42) {
            getCurrencyIso4217Code(AFLogger.LogLevel.ERROR, p02, p1, p22);
        } else if (p32) {
            getCurrencyIso4217Code(AFLogger.LogLevel.DEBUG, p02, p1, null);
        }
    }

    @Override
    public final void force(AFh1zSDK p02, String p1) {
        Intrinsics.checkNotNullParameter(p02, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(p1, BuildConfig.FLAVOR);
        if (AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            return;
        }
        Log.d("AppsFlyer_6.16.2", withTag$SDK_prodRelease(p1, p02));
    }

    @Override
    public final boolean getShouldExtendMsg() {
        return AFLogger.LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    @Override
    public final void i(AFh1zSDK p02, String p1, boolean p22) {
        Intrinsics.checkNotNullParameter(p02, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(p1, BuildConfig.FLAVOR);
        getCurrencyIso4217Code(AFLogger.LogLevel.INFO, p02, p1, null);
    }

    @Override
    public final void v(AFh1zSDK p02, String p1, boolean p22) {
        Intrinsics.checkNotNullParameter(p02, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(p1, BuildConfig.FLAVOR);
        getCurrencyIso4217Code(AFLogger.LogLevel.VERBOSE, p02, p1, null);
    }

    @Override
    public final void w(AFh1zSDK p02, String p1, boolean p22) {
        String str = dHkZSUxHu.eZbVLqCMe;
        Intrinsics.checkNotNullParameter(p02, str);
        Intrinsics.checkNotNullParameter(p1, str);
        getCurrencyIso4217Code(AFLogger.LogLevel.WARNING, p02, p1, null);
    }
}
