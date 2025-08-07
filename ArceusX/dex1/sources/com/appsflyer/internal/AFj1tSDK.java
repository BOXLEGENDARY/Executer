package com.appsflyer.internal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import z3.AdxZ.bpTQi;

public final class AFj1tSDK {
    public static Date getMediationNetwork(String str, String str2) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(bpTQi.eBXIBhaYqtGAHJd));
            return simpleDateFormat.parse(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
