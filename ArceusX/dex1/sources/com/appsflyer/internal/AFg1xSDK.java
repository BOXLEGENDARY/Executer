package com.appsflyer.internal;

public final class AFg1xSDK extends AFh1tSDK {
    public AFg1xSDK() {
        super("Register", null, Boolean.FALSE);
    }

    @Override
    public final AFe1uSDK getMediationNetwork() {
        return AFe1uSDK.REGISTER;
    }

    @Override
    public final boolean getMonetizationNetwork() {
        return false;
    }
}
