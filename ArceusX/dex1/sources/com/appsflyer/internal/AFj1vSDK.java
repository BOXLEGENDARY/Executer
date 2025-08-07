package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.appsflyer.AFLogger;

public final class AFj1vSDK extends AFj1ySDK {
    private final AFc1fSDK getMediationNetwork;
    final ProviderInfo getRevenue;

    public AFj1vSDK(ProviderInfo providerInfo, Runnable runnable, AFc1fSDK aFc1fSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.getMediationNetwork = aFc1fSDK;
        this.getRevenue = providerInfo;
    }

    public static ContentProviderClient z_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e7) {
            AFLogger.INSTANCE.e(AFh1zSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e7, false, true, false);
            return null;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1zSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th, false, true, false);
            return null;
        }
    }

    @Override
    public final void getRevenue(final Context context) {
        this.getMediationNetwork.AFAdRevenueData().execute(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1vSDK.AnonymousClass1.run():void");
            }
        });
    }
}
