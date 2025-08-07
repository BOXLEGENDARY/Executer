package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.R;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import kotlin.jvm.internal.Intrinsics;

public final class AFf1gSDK implements AFf1cSDK {
    private final Context AFAdRevenueData;
    private final AppsFlyerProperties getMediationNetwork;

    public AFf1gSDK(Context context, AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(appsFlyerProperties, BuildConfig.FLAVOR);
        this.AFAdRevenueData = context;
        this.getMediationNetwork = appsFlyerProperties;
    }

    @Override
    public final AFf1fSDK getMediationNetwork() {
        String string;
        if (!Boolean.parseBoolean(this.getMediationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.AFAdRevenueData);
            int i7 = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i8 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i9 = defaultSharedPreferences.getInt(JmBUOGMwkkxg.dVshXtjCQH, -1);
            int i10 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = BuildConfig.FLAVOR;
            if (i7 == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", BuildConfig.FLAVOR)) != null) {
                Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
                str = string;
            }
            return new AFf1fSDK(i9, i7, i8, i10, str);
        } catch (Exception e7) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.DMA, "TCF data collection exception", e7, false, false, false, false, R.styleable.AppCompatTheme_windowFixedHeightMajor, null);
            return null;
        }
    }
}
