package com.appsflyer.internal;

import com.appsflyer.AFInAppEventType;

public final class AFh1eSDK extends AFh1jSDK {
    public AFh1eSDK() {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE);
    }

    @Override
    public final AFe1uSDK getMediationNetwork() {
        return AFe1uSDK.PURCHASE_VALIDATE;
    }
}
