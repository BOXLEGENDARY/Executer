package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.internal.AFi1aSDK;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

public final class AFi1cSDK extends AFi1fSDK {
    private final Runnable component3;
    private String equals;
    private final AFi1eSDK getCurrencyIso4217Code;
    private final AFc1kSDK getMediationNetwork;
    private final ExecutorService getRevenue;

    public class AFa1zSDK {
        public static final int[] getMonetizationNetwork;

        static {
            int[] iArr = new int[AFi1eSDK.values().length];
            try {
                iArr[AFi1eSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFi1eSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFi1eSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getMonetizationNetwork = iArr;
        }
    }

    public AFi1cSDK(AFc1kSDK aFc1kSDK, ExecutorService executorService, AFi1eSDK aFi1eSDK, Runnable runnable, Runnable runnable2) throws P9.m {
        String str;
        Intrinsics.checkNotNullParameter(aFc1kSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(executorService, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFi1eSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(runnable, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(runnable2, BuildConfig.FLAVOR);
        int i7 = AFi1aSDK.AFa1tSDK.getRevenue[aFi1eSDK.ordinal()];
        if (i7 == 1) {
            str = "facebook";
        } else if (i7 == 2) {
            str = "instagram";
        } else {
            if (i7 != 3) {
                throw new P9.m();
            }
            str = "facebook_lite";
        }
        super("app", str, aFc1kSDK, runnable);
        this.getMediationNetwork = aFc1kSDK;
        this.getRevenue = executorService;
        this.getCurrencyIso4217Code = aFi1eSDK;
        this.component3 = runnable2;
    }

    private final boolean AFAdRevenueData(Context context) throws P9.m {
        int i7 = AFa1zSDK.getMonetizationNetwork[this.getCurrencyIso4217Code.ordinal()];
        if (i7 == 1) {
            return getCurrencyIso4217Code(context);
        }
        if (i7 == 2) {
            return getMediationNetwork(context);
        }
        if (i7 == 3) {
            return component3(context);
        }
        throw new P9.m();
    }

    private static boolean component3(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean getMediationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    private final boolean getMonetizationNetwork(android.content.Context r12) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1cSDK.getMonetizationNetwork(android.content.Context):boolean");
    }

    @Override
    public final void getRevenue(final Context context) {
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        if (getMonetizationNetwork(context)) {
            this.getRevenue.execute(new Runnable() {
                @Override
                public final void run() {
                    AFi1cSDK.getMonetizationNetwork(this.f13608d, context);
                }
            });
        } else {
            this.component3.run();
        }
    }

    public static final void getMonetizationNetwork(com.appsflyer.internal.AFi1cSDK r26, android.content.Context r27) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1cSDK.getMonetizationNetwork(com.appsflyer.internal.AFi1cSDK, android.content.Context):void");
    }
}
