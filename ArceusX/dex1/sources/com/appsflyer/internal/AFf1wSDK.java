package com.appsflyer.internal;

import android.net.Uri;
import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import com.appsflyer.AFLogger;
import com.github.luben.zstd.BuildConfig;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class AFf1wSDK extends AFe1tSDK<Map<String, Object>> {
    private static final int component3 = (int) TimeUnit.SECONDS.toMillis(2);
    private Map<String, Object> areAllFieldsValid;
    private final AFa1kSDK component1;
    private final AFa1oSDK component2;
    private final Uri component4;
    private final List<String> copydefault;

    public AFf1wSDK(AFa1oSDK aFa1oSDK, AFa1kSDK aFa1kSDK, Uri uri, List<String> list) {
        super(AFe1uSDK.RESOLVE_ESP, new AFe1uSDK[]{AFe1uSDK.RC_CDN}, "ResolveEsp");
        this.component2 = aFa1oSDK;
        this.component1 = aFa1kSDK;
        this.component4 = uri;
        this.copydefault = list;
    }

    private static Map<String, Object> r_(Uri uri) {
        HashMap map = new HashMap();
        try {
            StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
            sb.append(uri.toString());
            AFLogger.afDebugLog(sb.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            int i7 = component3;
            httpURLConnection.setReadTimeout(i7);
            httpURLConnection.setConnectTimeout(i7);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.16.2");
            int responseCode = httpURLConnection.getResponseCode();
            map.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                map.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
        } catch (Throwable th) {
            map.put("error", th.getLocalizedMessage());
            AFLogger.afErrorLog(th.getMessage(), th);
        }
        return map;
    }

    @Override
    public final AFe1rSDK AFAdRevenueData() throws Exception {
        Integer num = null;
        if (!getRevenue(this.component4.toString())) {
            this.component2.i_(this.component1, this.component4, null);
            return AFe1rSDK.SUCCESS;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = this.component4.toString();
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        String str = null;
        while (i7 < 5) {
            Map<String, Object> mapR_ = r_(Uri.parse(string));
            String str2 = (String) mapR_.get("res");
            Integer num2 = (Integer) mapR_.get("status");
            String str3 = (String) mapR_.get("error");
            if (str2 == null || !getRevenue(str2)) {
                str = str3;
                string = str2;
                num = num2;
                break;
            }
            if (i7 < 4) {
                arrayList.add(str2);
            }
            i7++;
            str = str3;
            string = str2;
            num = num2;
        }
        HashMap map = new HashMap();
        map.put("res", string != null ? string : BuildConfig.FLAVOR);
        map.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            map.put("error", str);
        }
        if (!arrayList.isEmpty()) {
            map.put("redirects", arrayList);
        }
        map.put("latency", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        synchronized (this.component1) {
            this.component1.AFAdRevenueData(vxbbqXNtzfMxs.sFNJ, map);
            this.component1.AFAdRevenueData("af_deeplink", this.component4.toString());
        }
        this.component2.i_(this.component1, string != null ? Uri.parse(string) : this.component4, this.component4);
        this.areAllFieldsValid = map;
        return AFe1rSDK.SUCCESS;
    }

    @Override
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override
    public final long getRevenue() {
        return 60000L;
    }

    private boolean getRevenue(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Validate if link ");
        sb.append(str);
        sb.append(" belongs to ESP domains: ");
        sb.append(this.copydefault);
        AFLogger.afRDLog(sb.toString());
        try {
            return this.copydefault.contains(new URL(str).getHost());
        } catch (MalformedURLException e7) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e7);
            return false;
        }
    }
}
