package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import com.github.luben.zstd.BuildConfig;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class AFi1qSDK implements AFi1rSDK {
    private String getMediationNetwork;

    private static String AFAdRevenueData(Activity activity) {
        Uri uriJ_ = AFb1rSDK.j_(activity != null ? activity.getIntent() : null);
        String string = uriJ_ != null ? uriJ_.toString() : null;
        if (string == null) {
            string = BuildConfig.FLAVOR;
        }
        if (AFAdRevenueData(string)) {
            return null;
        }
        return string;
    }

    @Override
    public final String getMediationNetwork(Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String string = referrer != null ? referrer.toString() : null;
        return string == null ? BuildConfig.FLAVOR : string;
    }

    @Override
    public final void getMonetizationNetwork(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, BuildConfig.FLAVOR);
        String str = this.getMediationNetwork;
        if (str == null || str.length() == 0) {
            this.getMediationNetwork = AFAdRevenueData(activity);
        }
    }

    @Override
    public final String getRevenue(Activity activity) {
        String str = this.getMediationNetwork;
        this.getMediationNetwork = null;
        return (str == null || str.length() == 0) ? AFAdRevenueData(activity) : str;
    }

    private static boolean AFAdRevenueData(String str) {
        return StringsKt.F(str, "android-app://", false, 2, (Object) null);
    }
}
