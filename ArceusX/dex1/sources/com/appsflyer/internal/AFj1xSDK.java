package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import com.appsflyer.AFLogger;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

public final class AFj1xSDK extends AFi1fSDK {
    private final ExecutorService getRevenue;

    public AFj1xSDK(ExecutorService executorService, AFc1kSDK aFc1kSDK, Runnable runnable) {
        super("preload", "samsung", aFc1kSDK, runnable);
        Intrinsics.checkNotNullParameter(executorService, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFc1kSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(runnable, BuildConfig.FLAVOR);
        this.getRevenue = executorService;
    }

    private static boolean A_(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("RESULT");
        if (columnIndex != -1) {
            return Boolean.parseBoolean(cursor.getString(columnIndex));
        }
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.SAMSUNG_PRELOAD_REFERRER, "No such column", false, 4, null);
        return false;
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().resolveContentProvider("com.samsung.android.mapsagent.providers.apptracking", 0) != null;
    }

    public static final void getMediationNetwork(com.appsflyer.internal.AFj1xSDK r11, android.content.Context r12) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1xSDK.getMediationNetwork(com.appsflyer.internal.AFj1xSDK, android.content.Context):void");
    }

    @Override
    protected final void AFAdRevenueData() {
    }

    @Override
    public final void getRevenue(final Context context) {
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        if (AFAdRevenueData(context)) {
            this.getRevenue.execute(new Runnable() {
                @Override
                public final void run() {
                    AFj1xSDK.getMediationNetwork(this.f13621d, context);
                }
            });
        }
    }

    private final boolean AFAdRevenueData(Context context) {
        if (!getRevenue()) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        if (getCurrencyIso4217Code(context)) {
            return true;
        }
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by missing content provider.", false, 4, null);
        return false;
    }
}
