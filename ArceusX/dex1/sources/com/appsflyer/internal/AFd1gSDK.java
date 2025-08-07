package com.appsflyer.internal;

public class AFd1gSDK {
    public final long getMonetizationNetwork;

    public AFd1gSDK(long j7) {
        this.getMonetizationNetwork = j7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.getMonetizationNetwork == ((AFd1gSDK) obj).getMonetizationNetwork;
    }

    public int hashCode() {
        long j7 = this.getMonetizationNetwork;
        return (int) (j7 ^ (j7 >>> 32));
    }
}
