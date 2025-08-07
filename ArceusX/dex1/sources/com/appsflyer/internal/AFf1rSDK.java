package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1ySDK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class AFf1rSDK extends AFf1tSDK {
    private final AFa1lSDK AFInAppEventParameterName;
    private final AFf1mSDK AFInAppEventType;
    private final AFh1uSDK AFKeystoreWrapper;
    private final AppsFlyerProperties AFLogger;
    public Map<String, Object> copy;
    private final AFj1zSDK copydefault;
    private final AFc1sSDK equals;

    static class AnonymousClass5 {
        static final int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AFj1ySDK.AFa1vSDK.values().length];
            getCurrencyIso4217Code = iArr;
            try {
                iArr[AFj1ySDK.AFa1vSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getCurrencyIso4217Code[AFj1ySDK.AFa1vSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFf1rSDK(AFh1tSDK aFh1tSDK, AFc1fSDK aFc1fSDK) {
        super(aFh1tSDK, aFc1fSDK);
        this.copydefault = aFc1fSDK.AFInAppEventParameterName();
        this.equals = aFc1fSDK.component1();
        this.AFKeystoreWrapper = aFc1fSDK.component2();
        this.AFInAppEventType = aFc1fSDK.component4();
        this.AFLogger = AppsFlyerProperties.getInstance();
        this.AFInAppEventParameterName = aFc1fSDK.afErrorLogForExcManagerOnly();
        this.getRevenue.add(AFe1uSDK.RESOLVE_ESP);
        this.getRevenue.add(AFe1uSDK.DLSDK);
    }

    @Override
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        AFh1uSDK aFh1uSDK = this.AFKeystoreWrapper;
        int i7 = ((AFf1tSDK) this).component1.component1;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i7 == 1) {
            long j7 = aFh1uSDK.component4;
            if (j7 == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFh1uSDK.getMediationNetwork.put("net", Long.valueOf(jCurrentTimeMillis - j7));
            aFh1uSDK.getRevenue.getRevenue("first_launch", new JSONObject(aFh1uSDK.getMediationNetwork).toString());
        }
    }

    protected void getMediationNetwork(int i7) {
        this.AFKeystoreWrapper.getRevenue(i7);
    }

    @Override
    protected void getRevenue(AFh1tSDK aFh1tSDK) {
        super.getRevenue(aFh1tSDK);
        int i7 = aFh1tSDK.component1;
        getMediationNetwork(i7);
        Map map = (Map) aFh1tSDK.getMonetizationNetwork.get("meta");
        if (map == null) {
            map = new HashMap();
            aFh1tSDK.getMonetizationNetwork.put("meta", map);
        }
        if (!aFh1tSDK.getMonetizationNetwork.containsKey("af_deeplink")) {
            aFh1tSDK.getCurrencyIso4217Code(this.AFInAppEventParameterName.getCurrencyIso4217Code());
        }
        AFh1cSDK revenue = this.AFInAppEventType.getRevenue();
        if (revenue != null) {
            HashMap map2 = new HashMap();
            map2.put("cdn_token", revenue.getCurrencyIso4217Code);
            String str = revenue.getMediationNetwork;
            if (str != null) {
                map2.put("c_ver", str);
            }
            long j7 = revenue.getRevenue;
            if (j7 > 0) {
                map2.put("latency", Long.valueOf(j7));
            }
            long j8 = revenue.getMonetizationNetwork;
            if (j8 > 0) {
                map2.put("delay", Long.valueOf(j8));
            }
            int i8 = revenue.AFAdRevenueData;
            if (i8 > 0) {
                map2.put("res_code", Integer.valueOf(i8));
            }
            if (revenue.component1 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(revenue.component1.getClass().getSimpleName());
                sb.append(": ");
                sb.append(revenue.component1.getMessage());
                map2.put("error", sb.toString());
            }
            AFh1dSDK aFh1dSDK = revenue.component3;
            if (aFh1dSDK != null) {
                map2.put("sig", aFh1dSDK.toString());
            }
            String str2 = revenue.areAllFieldsValid;
            if (str2 != null) {
                map2.put("cdn_cache_status", str2);
            }
            map.put("rc", map2);
        }
        ((AFf1tSDK) this).hashCode.getCurrencyIso4217Code(aFh1tSDK.getMonetizationNetwork);
        if (i7 == 1) {
            if (this.AFLogger.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFh1tSDK.getMonetizationNetwork.put("wait_cid", Boolean.toString(true));
            }
            HashMap map3 = new HashMap(this.AFKeystoreWrapper.AFAdRevenueData);
            this.AFKeystoreWrapper.getRevenue.getMediationNetwork("ddl");
            if (!map3.isEmpty()) {
                map.put("ddl", map3);
            }
            HashMap map4 = new HashMap(this.AFKeystoreWrapper.getMediationNetwork);
            if (!map4.isEmpty()) {
                map.put("first_launch", map4);
            }
        } else if (i7 == 2) {
            HashMap map5 = new HashMap(this.AFKeystoreWrapper.getMediationNetwork);
            if (!map5.isEmpty()) {
                map.put("first_launch", map5);
            }
            this.AFKeystoreWrapper.getRevenue.getMediationNetwork("first_launch");
        }
        if (map.isEmpty()) {
            aFh1tSDK.getMonetizationNetwork.remove("meta");
        }
        if (i7 <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFj1ySDK aFj1ySDK : this.copydefault.getRevenue()) {
                boolean z7 = aFj1ySDK instanceof AFi1iSDK;
                int i9 = AnonymousClass5.getCurrencyIso4217Code[aFj1ySDK.component1.ordinal()];
                if (i9 == 1) {
                    if (z7) {
                        aFh1tSDK.getMonetizationNetwork("rfr", ((AFi1iSDK) aFj1ySDK).getMediationNetwork);
                        this.equals.getCurrencyIso4217Code(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFj1ySDK.AFAdRevenueData);
                } else if (i9 == 2 && i7 == 2 && !z7) {
                    HashMap map6 = new HashMap();
                    map6.put("source", aFj1ySDK.component4);
                    map6.put("response", "TIMEOUT");
                    map6.put("type", aFj1ySDK.component2);
                    arrayList.add(map6);
                }
            }
            if (!arrayList.isEmpty()) {
                aFh1tSDK.getMonetizationNetwork("referrers", arrayList);
            }
            Object obj = this.copy;
            if (obj != null) {
                aFh1tSDK.getMonetizationNetwork("fb_ddl", obj);
            }
        }
        ((AFf1tSDK) this).hashCode.AFAdRevenueData(aFh1tSDK);
    }
}
