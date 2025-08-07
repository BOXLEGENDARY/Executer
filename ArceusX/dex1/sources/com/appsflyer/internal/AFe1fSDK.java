package com.appsflyer.internal;

import S5.Cg.XjqcfAbdbc;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1sSDK.AnonymousClass3;

public final class AFe1fSDK extends AFe1tSDK<Boolean> {
    private static volatile boolean component4;
    private final AFc1fSDK areAllFieldsValid;
    private Boolean component1;
    private final AFe1sSDK component2;
    private final AFc1tSDK component3;

    public AFe1fSDK(AFc1fSDK aFc1fSDK) {
        super(AFe1uSDK.LOAD_CACHE, new AFe1uSDK[0], "LoadCachedRequests");
        this.component3 = aFc1fSDK.registerClient();
        this.component2 = aFc1fSDK.equals();
        this.areAllFieldsValid = aFc1fSDK;
    }

    public static boolean component1() {
        return component4;
    }

    private static String getMediationNetwork(AFc1uSDK aFc1uSDK) throws NumberFormatException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j7 = Long.parseLong(aFc1uSDK.getMediationNetwork, 10);
        String str = aFc1uSDK.getCurrencyIso4217Code;
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("isCachedRequest", "true").appendQueryParameter("timeincache", String.valueOf((jCurrentTimeMillis - j7) / 1000)).toString();
        } catch (Exception e7) {
            AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", e7);
            return str;
        }
    }

    @Override
    public final AFe1rSDK AFAdRevenueData() throws Exception {
        for (AFc1uSDK aFc1uSDK : this.component3.getRevenue()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1zSDK aFh1zSDK = AFh1zSDK.CACHE;
            StringBuilder sb = new StringBuilder("resending request: ");
            sb.append(aFc1uSDK.getCurrencyIso4217Code);
            aFLogger.i(aFh1zSDK, sb.toString());
            try {
                AFh1rSDK aFh1rSDK = new AFh1rSDK(getMediationNetwork(aFc1uSDK), aFc1uSDK.getCurrencyIso4217Code(), aFc1uSDK.getMediationNetwork, aFc1uSDK.getMonetizationNetwork);
                AFe1sSDK aFe1sSDK = this.component2;
                aFe1sSDK.getRevenue.execute(aFe1sSDK.new AnonymousClass3(new AFf1ySDK(aFh1rSDK, this.areAllFieldsValid)));
            } catch (Exception e7) {
                AFLogger.INSTANCE.e(AFh1zSDK.QUEUE, XjqcfAbdbc.VZWBoWRg, e7);
            }
        }
        this.component1 = Boolean.TRUE;
        component4 = true;
        return AFe1rSDK.SUCCESS;
    }

    @Override
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override
    public final long getRevenue() {
        return 30000L;
    }
}
