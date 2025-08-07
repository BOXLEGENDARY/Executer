package com.appsflyer.internal;

import java.util.HashMap;

public class AFa1nSDK extends HashMap<Integer, String> {
    private static AFa1nSDK getMonetizationNetwork;
    private final Object getCurrencyIso4217Code = new Object();

    private AFa1nSDK() {
    }

    public static synchronized AFa1nSDK afErrorLog() {
        try {
            if (getMonetizationNetwork == null) {
                getMonetizationNetwork = new AFa1nSDK();
            }
        } catch (Throwable th) {
            throw th;
        }
        return getMonetizationNetwork;
    }

    @Override
    public String put(Integer num, String str) {
        String str2;
        synchronized (this.getCurrencyIso4217Code) {
            str2 = (String) super.put((AFa1nSDK) num, (Integer) str);
        }
        return str2;
    }

    @Override
    public boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.getCurrencyIso4217Code) {
            zRemove = super.remove(obj, obj2);
        }
        return zRemove;
    }

    @Override
    public String remove(Object obj) {
        String str;
        synchronized (this.getCurrencyIso4217Code) {
            str = (String) super.remove(obj);
        }
        return str;
    }
}
