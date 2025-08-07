package com.appsflyer.internal;

import com.github.luben.zstd.BuildConfig;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class AFd1rSDK {
    public static boolean AFAdRevenueData(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        int currencyIso4217Code = AFj1cSDK.getCurrencyIso4217Code(str);
        int currencyIso4217Code2 = AFj1cSDK.getCurrencyIso4217Code(str2);
        Pair<Integer, Integer> revenue = AFd1pSDK.getRevenue(str2);
        Pair<Integer, Integer> currencyIso4217Code3 = AFd1pSDK.getCurrencyIso4217Code(str2);
        return (currencyIso4217Code2 == -1 || revenue != null) ? currencyIso4217Code3 != null ? ((Number) currencyIso4217Code3.c()).intValue() <= currencyIso4217Code && currencyIso4217Code <= ((Number) currencyIso4217Code3.d()).intValue() : revenue != null && ((Number) revenue.c()).intValue() <= currencyIso4217Code && currencyIso4217Code <= ((Number) revenue.d()).intValue() : currencyIso4217Code2 == currencyIso4217Code;
    }
}
