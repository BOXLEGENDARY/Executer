package com.appsflyer.internal;

public abstract class AFh1qSDK extends AFh1tSDK {
    private final boolean copydefault;
    private final boolean equals;

    AFh1qSDK() {
        this(null, null, null);
    }

    protected AFh1qSDK(String str, Boolean bool, Boolean bool2) {
        super(str, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
        this.copydefault = bool != null ? bool.booleanValue() : true;
        this.equals = true;
    }
}
