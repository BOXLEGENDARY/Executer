package com.appsflyer.internal;

import java.util.List;

public interface AFc1tSDK {
    String getCurrencyIso4217Code(AFc1uSDK aFc1uSDK);

    void getCurrencyIso4217Code();

    void getMediationNetwork();

    List<AFc1uSDK> getRevenue();

    boolean getRevenue(String str);
}
