package com.appsflyer.internal;

import Za.qhkq.dHkZSUxHu;
import androidx.room.kU.HguUe;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFj1ySDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class AFf1zSDK extends AFe1kSDK<DdlResponse> {
    private final List<AFj1ySDK> AFInAppEventParameterName;
    private final CountDownLatch AFInAppEventType;
    private int AFKeystoreWrapper;
    private int AFLogger;
    private final AFa1pSDK component1;
    private final AFh1uSDK copy;
    private final AFa1oSDK copydefault;
    private final AFj1zSDK equals;
    private final AFc1oSDK hashCode;
    private int registerClient;
    private final AFc1kSDK toString;

    public class AFa1uSDK {
        public static final int[] AFAdRevenueData;
        public static final int[] getRevenue;

        static {
            int[] iArr = new int[AFe1rSDK.values().length];
            try {
                iArr[AFe1rSDK.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1rSDK.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getRevenue = iArr;
            int[] iArr2 = new int[AFj1ySDK.AFa1vSDK.values().length];
            try {
                iArr2[AFj1ySDK.AFa1vSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AFj1ySDK.AFa1vSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            AFAdRevenueData = iArr2;
        }
    }

    public AFf1zSDK(AFa1pSDK aFa1pSDK, AFc1fSDK aFc1fSDK) {
        super(AFe1uSDK.DLSDK, new AFe1uSDK[]{AFe1uSDK.RC_CDN, AFe1uSDK.FETCH_ADVERTISING_ID}, aFc1fSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFa1pSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFc1fSDK, BuildConfig.FLAVOR);
        this.component1 = aFa1pSDK;
        this.AFInAppEventType = new CountDownLatch(1);
        this.AFInAppEventParameterName = new ArrayList();
        AFc1kSDK revenue = aFc1fSDK.getRevenue();
        Intrinsics.checkNotNullExpressionValue(revenue, BuildConfig.FLAVOR);
        this.toString = revenue;
        AFc1oSDK aFc1oSDKAfErrorLog = aFc1fSDK.afErrorLog();
        Intrinsics.checkNotNullExpressionValue(aFc1oSDKAfErrorLog, BuildConfig.FLAVOR);
        this.hashCode = aFc1oSDKAfErrorLog;
        AFa1oSDK aFa1oSDKE = aFc1fSDK.e();
        Intrinsics.checkNotNullExpressionValue(aFa1oSDKE, BuildConfig.FLAVOR);
        this.copydefault = aFa1oSDKE;
        AFh1uSDK aFh1uSDKComponent2 = aFc1fSDK.component2();
        Intrinsics.checkNotNullExpressionValue(aFh1uSDKComponent2, BuildConfig.FLAVOR);
        this.copy = aFh1uSDKComponent2;
        AFj1zSDK aFj1zSDKAFInAppEventParameterName = aFc1fSDK.AFInAppEventParameterName();
        Intrinsics.checkNotNullExpressionValue(aFj1zSDKAFInAppEventParameterName, BuildConfig.FLAVOR);
        this.equals = aFj1zSDKAFInAppEventParameterName;
        AFj1ySDK[] revenue2 = aFj1zSDKAFInAppEventParameterName.getRevenue();
        Intrinsics.checkNotNullExpressionValue(revenue2, BuildConfig.FLAVOR);
        ArrayList<AFj1ySDK> arrayList = new ArrayList();
        for (AFj1ySDK aFj1ySDK : revenue2) {
            if (aFj1ySDK != null && aFj1ySDK.component1 != AFj1ySDK.AFa1vSDK.NOT_STARTED) {
                arrayList.add(aFj1ySDK);
            }
        }
        this.AFLogger = arrayList.size();
        for (final AFj1ySDK aFj1ySDK2 : arrayList) {
            AFj1ySDK.AFa1vSDK aFa1vSDK = aFj1ySDK2.component1;
            int i7 = aFa1vSDK == null ? -1 : AFa1uSDK.AFAdRevenueData[aFa1vSDK.ordinal()];
            if (i7 == 1) {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.DDL, aFj1ySDK2.AFAdRevenueData.get(dHkZSUxHu.fsZZexNgfeuo) + " referrer collected earlier", false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFj1ySDK2, BuildConfig.FLAVOR);
                AFAdRevenueData(aFj1ySDK2);
            } else if (i7 == 2) {
                aFj1ySDK2.addObserver(new Observer() {
                    @Override
                    public final void update(Observable observable, Object obj) {
                        AFf1zSDK.AFAdRevenueData(aFj1ySDK2, this, observable, obj);
                    }
                });
            }
        }
    }

    private final boolean copy() {
        Object obj = this.component1.getMonetizationNetwork.get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.AFLogger && !this.component1.getMonetizationNetwork.containsKey("referrers");
    }

    @Override
    public final AFe1rSDK AFAdRevenueData() throws InterruptedException {
        AFe1rSDK aFe1rSDK = AFe1rSDK.FAILURE;
        try {
            AFe1rSDK aFe1rSDKAFAdRevenueData = super.AFAdRevenueData();
            Intrinsics.checkNotNullExpressionValue(aFe1rSDKAFAdRevenueData, BuildConfig.FLAVOR);
            try {
                AFh1uSDK aFh1uSDK = this.copy;
                int i7 = this.AFKeystoreWrapper;
                if (i7 <= 0 || i7 > 2) {
                    AFLogger.afErrorLogForExcManagerOnly(HguUe.lCcLgHPDrhVmHii, new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i7))));
                } else {
                    int i8 = i7 - 1;
                    aFh1uSDK.areAllFieldsValid[i8] = System.currentTimeMillis();
                    long j7 = aFh1uSDK.component1[i8];
                    if (j7 != 0) {
                        long[] jArr = aFh1uSDK.component2;
                        jArr[i8] = aFh1uSDK.areAllFieldsValid[i8] - j7;
                        aFh1uSDK.AFAdRevenueData.put("net", jArr);
                        aFh1uSDK.getRevenue.getRevenue("ddl", new JSONObject(aFh1uSDK.AFAdRevenueData).toString());
                    } else {
                        StringBuilder sb = new StringBuilder("Metrics: ddlStart[");
                        sb.append(i8);
                        sb.append("] ts is missing");
                        AFLogger.afInfoLog(sb.toString());
                    }
                }
                int i9 = AFa1uSDK.getRevenue[aFe1rSDKAFAdRevenueData.ordinal()];
                if (i9 != 1) {
                    if (i9 != 2) {
                        return aFe1rSDKAFAdRevenueData;
                    }
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFh1zSDK aFh1zSDK = AFh1zSDK.DDL;
                    ResponseNetwork responseNetwork = ((AFe1kSDK) this).component2;
                    AFg1gSDK.d$default(aFLogger, aFh1zSDK, "Error occurred. Server response code = " + (responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null), false, 4, null);
                    DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                    this.copy.AFAdRevenueData(deepLinkResult, this.copydefault.component1);
                    this.copydefault.getCurrencyIso4217Code(deepLinkResult);
                    return aFe1rSDKAFAdRevenueData;
                }
                ResponseNetwork responseNetwork2 = ((AFe1kSDK) this).component2;
                Intrinsics.d(responseNetwork2);
                Object body = responseNetwork2.getBody();
                Intrinsics.checkNotNullExpressionValue(body, BuildConfig.FLAVOR);
                DdlResponse ddlResponse = (DdlResponse) body;
                DeepLink deepLink = ddlResponse.deepLink;
                if (deepLink != null) {
                    DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                    this.copy.AFAdRevenueData(deepLinkResult2, this.copydefault.component1);
                    this.copydefault.getCurrencyIso4217Code(deepLinkResult2);
                    return aFe1rSDKAFAdRevenueData;
                }
                if (this.AFKeystoreWrapper > 1 || !ddlResponse.getSecondPing() || !copy()) {
                    DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                    this.copy.AFAdRevenueData(deepLinkResult3, this.copydefault.component1);
                    this.copydefault.getCurrencyIso4217Code(deepLinkResult3);
                    return aFe1rSDKAFAdRevenueData;
                }
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.DDL, "Waiting for referrers...", false, 4, null);
                this.AFInAppEventType.await();
                AFh1uSDK aFh1uSDK2 = this.copy;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j8 = aFh1uSDK2.areAllFieldsValid[0];
                if (j8 != 0) {
                    aFh1uSDK2.AFAdRevenueData.put("rfr_wait", Long.valueOf(jCurrentTimeMillis - j8));
                    aFh1uSDK2.getRevenue.getRevenue("ddl", new JSONObject(aFh1uSDK2.AFAdRevenueData).toString());
                } else {
                    AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                }
                if (this.registerClient != this.AFLogger) {
                    return AFAdRevenueData();
                }
                DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
                this.copy.AFAdRevenueData(deepLinkResult4, this.copydefault.component1);
                this.copydefault.getCurrencyIso4217Code(deepLinkResult4);
                return AFe1rSDK.SUCCESS;
            } catch (Exception e7) {
                e = e7;
                aFe1rSDK = aFe1rSDKAFAdRevenueData;
                Throwable cause = e.getCause();
                if (!(cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException)) {
                    if (cause instanceof IOException) {
                        AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                        DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                        this.copy.AFAdRevenueData(deepLinkResult5, this.copydefault.component1);
                        this.copydefault.getCurrencyIso4217Code(deepLinkResult5);
                    } else {
                        AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.DDL, "Unexpected Exception: " + e, false, 4, null);
                        DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                        this.copy.AFAdRevenueData(deepLinkResult6, this.copydefault.component1);
                        this.copydefault.getCurrencyIso4217Code(deepLinkResult6);
                    }
                    return aFe1rSDK;
                }
                AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.DDL, "Timeout, didn't manage to find deferred deeplink after " + this.AFKeystoreWrapper + " attempt(s) within " + this.copydefault.component1 + " milliseconds", false, 4, null);
                DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                this.copy.AFAdRevenueData(deepLinkResult7, this.copydefault.component1);
                this.copydefault.getCurrencyIso4217Code(deepLinkResult7);
                return AFe1rSDK.TIMEOUT;
            }
        } catch (Exception e8) {
            e = e8;
        }
    }

    @Override
    protected final boolean a_() {
        return false;
    }

    @Override
    public final AppsFlyerRequestListener component2() {
        return null;
    }

    @Override
    protected final boolean copydefault() {
        return false;
    }

    @Override
    protected final com.appsflyer.internal.AFd1mSDK<com.appsflyer.internal.DdlResponse> getMediationNetwork(java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1zSDK.getMediationNetwork(java.lang.String):com.appsflyer.internal.AFd1mSDK");
    }

    @Override
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override
    public final long getRevenue() {
        return this.copydefault.component1;
    }

    private static boolean getMonetizationNetwork(AFj1ySDK aFj1ySDK) {
        Object obj = aFj1ySDK.AFAdRevenueData.get("click_ts");
        Long l7 = obj instanceof Long ? (Long) obj : null;
        if (l7 != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l7.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }

    private static Map<String, String> getMediationNetwork(AFb1lSDK aFb1lSDK) {
        String str;
        if (aFb1lSDK == null || (str = aFb1lSDK.getMonetizationNetwork) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, BuildConfig.FLAVOR);
        Boolean bool = aFb1lSDK.getCurrencyIso4217Code;
        if (bool == null || !bool.booleanValue()) {
            return kotlin.collections.F.k(new Pair[]{P9.t.a("type", "unhashed"), P9.t.a("value", str)});
        }
        return null;
    }

    private final void AFAdRevenueData(AFj1ySDK aFj1ySDK) {
        if (getMonetizationNetwork(aFj1ySDK)) {
            this.AFInAppEventParameterName.add(aFj1ySDK);
            this.AFInAppEventType.countDown();
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.DDL, "Added non-organic " + aFj1ySDK.getClass().getSimpleName(), false, 4, null);
            return;
        }
        int i7 = this.registerClient + 1;
        this.registerClient = i7;
        if (i7 == this.AFLogger) {
            this.AFInAppEventType.countDown();
        }
    }

    public static final void AFAdRevenueData(AFj1ySDK aFj1ySDK, AFf1zSDK aFf1zSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFf1zSDK, BuildConfig.FLAVOR);
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.DDL, aFj1ySDK.AFAdRevenueData.get("source") + " referrer collected via observer", false, 4, null);
        Intrinsics.e(observable, BuildConfig.FLAVOR);
        aFf1zSDK.AFAdRevenueData((AFj1ySDK) observable);
    }
}
