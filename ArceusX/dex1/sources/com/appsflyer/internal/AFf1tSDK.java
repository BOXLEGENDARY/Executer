package com.appsflyer.internal;

import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import org.json.JSONObject;

public class AFf1tSDK extends AFe1kSDK<String> {
    private static final AFe1uSDK[] AFInAppEventType = {AFe1uSDK.DLSDK, AFe1uSDK.ONELINK, AFe1uSDK.REGISTER};
    private final AFc1hSDK AFInAppEventParameterName;
    private final AFf1eSDK AFKeystoreWrapper;
    public final AFh1tSDK component1;
    private final AFf1mSDK copy;
    private final AFe1ySDK copydefault;
    private final AFc1kSDK equals;
    protected final AFg1tSDK hashCode;
    protected final AFc1sSDK toString;

    public AFf1tSDK(AFh1tSDK aFh1tSDK, AFc1fSDK aFc1fSDK) {
        this(aFh1tSDK, aFc1fSDK, null);
    }

    protected static Map<String, Object> component1(AFh1tSDK aFh1tSDK) {
        Map<String, Object> map = (Map) aFh1tSDK.getMonetizationNetwork.get("meta");
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        aFh1tSDK.getMonetizationNetwork.put("meta", map2);
        return map2;
    }

    protected void AFAdRevenueData(AFh1tSDK aFh1tSDK) {
        this.hashCode.getMonetizationNetwork(aFh1tSDK);
    }

    @Override
    protected final AppsFlyerRequestListener component2() {
        return this.component1.AFAdRevenueData;
    }

    protected void component3(AFh1tSDK aFh1tSDK) {
        this.hashCode.getMediationNetwork(aFh1tSDK);
    }

    @Override
    protected boolean copydefault() {
        return true;
    }

    protected void getCurrencyIso4217Code(AFh1tSDK aFh1tSDK) {
        this.hashCode.getCurrencyIso4217Code(aFh1tSDK);
    }

    @Override
    protected final com.appsflyer.internal.AFd1mSDK<java.lang.String> getMediationNetwork(java.lang.String r20) throws org.json.JSONException {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1tSDK.getMediationNetwork(java.lang.String):com.appsflyer.internal.AFd1mSDK");
    }

    protected void getMonetizationNetwork(AFh1tSDK aFh1tSDK) {
        this.hashCode.getMediationNetwork(aFh1tSDK.getMonetizationNetwork);
    }

    protected void getRevenue(AFh1tSDK aFh1tSDK) {
        try {
            try {
                getMediationNetwork(aFh1tSDK);
                getMonetizationNetwork(aFh1tSDK);
                AFAdRevenueData(aFh1tSDK);
                getCurrencyIso4217Code(aFh1tSDK);
                component3(aFh1tSDK);
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFh1zSDK.QUEUE, "Error while collecting payload params", th, true, true, false);
            }
            if (aFh1tSDK.getMonetizationNetwork()) {
                aFh1tSDK.getCurrencyIso4217Code(((AFe1kSDK) this).component4.getMediationNetwork(aFh1tSDK.getMonetizationNetwork));
                aFh1tSDK.getCurrencyIso4217Code(((AFe1kSDK) this).component4.getRevenue(aFh1tSDK.getMonetizationNetwork));
                if (this.equals.getRevenue("com.appsflyer.security.enable", false)) {
                    AFf1iSDK.getMonetizationNetwork(aFh1tSDK);
                }
            }
            if (aFh1tSDK.component1()) {
                aFh1tSDK.getCurrencyIso4217Code(((AFe1kSDK) this).component4.getCurrencyIso4217Code());
            }
            Set<AFe1uSDK> set = this.AFAdRevenueData;
            boolean z7 = set.contains(AFe1uSDK.LAUNCH) || set.contains(AFe1uSDK.CONVERSION);
            if (areAllFieldsValid() && z7) {
                aFh1tSDK.getRevenue(this.toString.AFAdRevenueData(vxbbqXNtzfMxs.hpL, 0));
            }
            if (aFh1tSDK.component4()) {
                Map<String, Object> mapComponent1 = component1(aFh1tSDK);
                AFe1ySDK aFe1ySDK = this.copydefault;
                HostMeta hostMeta = new HostMeta(aFe1ySDK.AFAdRevenueData(), aFe1ySDK.getCurrencyIso4217Code(), AFe1ySDK.getRevenue() ? AFe1wSDK.DEFAULT : AFe1wSDK.API);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", hostMeta.name);
                AFe1wSDK aFe1wSDK = hostMeta.method;
                if (aFe1wSDK != AFe1wSDK.DEFAULT) {
                    jSONObject.put("method", aFe1wSDK.AFAdRevenueData);
                }
                String str = hostMeta.prefix;
                if (str != null && !StringsKt.Y(str)) {
                    jSONObject.put("prefix", hostMeta.prefix);
                }
                mapComponent1.put("host", jSONObject);
            }
            if (this.equals.getRevenue("AF_PREINSTALL_DISABLED", false)) {
                component1(aFh1tSDK).put("preinstall_disabled", Boolean.TRUE);
            }
            this.AFKeystoreWrapper.getMediationNetwork(aFh1tSDK.getMonetizationNetwork, aFh1tSDK.getMediationNetwork());
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFh1zSDK.QUEUE, "Error while preparing to send event", th2, true, true, false);
        }
    }

    public AFf1tSDK(AFh1tSDK aFh1tSDK, AFc1fSDK aFc1fSDK, String str) {
        super(aFh1tSDK.getMediationNetwork(), new AFe1uSDK[]{AFe1uSDK.RC_CDN, AFe1uSDK.FETCH_ADVERTISING_ID}, aFc1fSDK, str);
        this.component1 = aFh1tSDK;
        this.copydefault = aFc1fSDK.AFInAppEventType();
        this.toString = aFc1fSDK.component1();
        this.copy = aFc1fSDK.component4();
        this.AFInAppEventParameterName = aFc1fSDK.AFLogger();
        this.equals = aFc1fSDK.getRevenue();
        this.hashCode = aFc1fSDK.component3();
        this.AFKeystoreWrapper = aFc1fSDK.v();
        for (AFe1uSDK aFe1uSDK : AFInAppEventType) {
            if (this.getMonetizationNetwork == aFe1uSDK) {
                return;
            }
        }
        int i7 = this.component1.component1;
        AFe1uSDK aFe1uSDK2 = this.getMonetizationNetwork;
        if (i7 > 0) {
            this.getRevenue.add(AFe1uSDK.CONVERSION);
        } else {
            AFe1uSDK aFe1uSDK3 = AFe1uSDK.CONVERSION;
            if (aFe1uSDK2 != aFe1uSDK3) {
                this.AFAdRevenueData.add(aFe1uSDK3);
            }
        }
    }

    protected void getMediationNetwork(AFh1tSDK aFh1tSDK) {
        this.hashCode.getRevenue(aFh1tSDK);
    }
}
