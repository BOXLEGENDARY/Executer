package com.appsflyer.internal;

import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AFd1cSDK<Body> implements ResponseNetwork<Body> {
    final Map<String, List<String>> AFAdRevenueData;
    public final AFd1gSDK getCurrencyIso4217Code;
    private final Body getMediationNetwork;
    final int getMonetizationNetwork;
    final boolean getRevenue;

    public AFd1cSDK(Body body, int i7, boolean z7, Map<String, List<String>> map, AFd1gSDK aFd1gSDK) {
        this.getMediationNetwork = body;
        this.getMonetizationNetwork = i7;
        this.getRevenue = z7;
        this.AFAdRevenueData = new HashMap(map);
        this.getCurrencyIso4217Code = aFd1gSDK;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFd1cSDK aFd1cSDK = (AFd1cSDK) obj;
        if (this.getMonetizationNetwork == aFd1cSDK.getMonetizationNetwork && this.getRevenue == aFd1cSDK.getRevenue && this.getMediationNetwork.equals(aFd1cSDK.getMediationNetwork) && this.AFAdRevenueData.equals(aFd1cSDK.AFAdRevenueData)) {
            return this.getCurrencyIso4217Code.equals(aFd1cSDK.getCurrencyIso4217Code);
        }
        return false;
    }

    @Override
    public Body getBody() {
        return this.getMediationNetwork;
    }

    @Override
    public List<String> getHeaderField(String str) {
        for (String str2 : this.AFAdRevenueData.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.AFAdRevenueData.get(str2);
            }
        }
        return null;
    }

    public final String getRevenue(String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it = headerField.iterator();
        StringBuilder sb = new StringBuilder(it.next());
        while (it.hasNext()) {
            sb.append(", ");
            sb.append(it.next());
        }
        return sb.toString();
    }

    @Override
    public int getStatusCode() {
        return this.getMonetizationNetwork;
    }

    public int hashCode() {
        return (((((((this.getMediationNetwork.hashCode() * 31) + this.getMonetizationNetwork) * 31) + (this.getRevenue ? 1 : 0)) * 31) + this.AFAdRevenueData.hashCode()) * 31) + this.getCurrencyIso4217Code.hashCode();
    }

    @Override
    public boolean isSuccessful() {
        return this.getRevenue;
    }
}
