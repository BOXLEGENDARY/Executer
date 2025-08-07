package com.appsflyer.internal;

public final class AFh1nSDK extends AFh1tSDK {
    @Override
    public final boolean component4() {
        return true;
    }

    @Override
    public final AFe1uSDK getMediationNetwork() {
        return this.component1 == 1 ? AFe1uSDK.CONVERSION : AFe1uSDK.LAUNCH;
    }
}
