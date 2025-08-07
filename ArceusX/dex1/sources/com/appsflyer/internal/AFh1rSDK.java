package com.appsflyer.internal;

public final class AFh1rSDK extends AFh1tSDK {
    public final AFe1uSDK toString;

    @Deprecated
    public AFh1rSDK() {
        this.toString = null;
    }

    @Override
    public final AFe1uSDK getMediationNetwork() {
        AFe1uSDK aFe1uSDK = this.toString;
        return aFe1uSDK != null ? aFe1uSDK : AFe1uSDK.CACHED_EVENT;
    }

    public AFh1rSDK(String str, byte[] bArr, String str2, AFe1uSDK aFe1uSDK) {
        super(null, str, Boolean.FALSE);
        this.getCurrencyIso4217Code = str2;
        getMediationNetwork(bArr);
        this.toString = aFe1uSDK;
    }
}
