package com.appsflyer.internal;

public abstract class AFh1jSDK extends AFh1qSDK {
    AFh1jSDK() {
        this(null, null);
    }

    @Override
    public final boolean areAllFieldsValid() {
        return false;
    }

    @Override
    public final boolean component1() {
        return false;
    }

    @Override
    public final boolean getMonetizationNetwork() {
        return false;
    }

    AFh1jSDK(String str, Boolean bool) {
        super(str, Boolean.FALSE, bool);
    }
}
