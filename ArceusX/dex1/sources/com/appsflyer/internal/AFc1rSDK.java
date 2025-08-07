package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class AFc1rSDK implements AFc1tSDK {
    private final AFc1hSDK AFAdRevenueData;

    public AFc1rSDK(AFc1hSDK aFc1hSDK) {
        this.AFAdRevenueData = aFc1hSDK;
    }

    @Override
    public final java.lang.String getCurrencyIso4217Code(com.appsflyer.internal.AFc1uSDK r10) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1rSDK.getCurrencyIso4217Code(com.appsflyer.internal.AFc1uSDK):java.lang.String");
    }

    @Override
    public final void getMediationNetwork() {
        try {
            if (new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache").exists()) {
                return;
            }
            new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache").mkdir();
        } catch (Exception e7) {
            AFLogger.afErrorLog("CACHE: Could not create cache directory", e7);
        }
    }

    @Override
    public final List<AFc1uSDK> getRevenue() {
        File[] fileArrListFiles;
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            }
            fileArrListFiles = file.listFiles();
        } catch (Exception e7) {
            AFLogger.afErrorLog("CACHE: Could not get cached requests", e7);
        }
        if (fileArrListFiles == null) {
            return arrayList;
        }
        for (File file2 : fileArrListFiles) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1zSDK aFh1zSDK = AFh1zSDK.CACHE;
            StringBuilder sb = new StringBuilder("Found cached request");
            sb.append(file2.getName());
            aFLogger.i(aFh1zSDK, sb.toString());
            arrayList.add(getMediationNetwork(file2));
        }
        return arrayList;
    }

    private static com.appsflyer.internal.AFc1uSDK getMediationNetwork(java.io.File r5) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1rSDK.getMediationNetwork(java.io.File):com.appsflyer.internal.AFc1uSDK");
    }

    @Override
    public final boolean getRevenue(String str) {
        File file = new File(new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache"), str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1zSDK aFh1zSDK = AFh1zSDK.CACHE;
        StringBuilder sb = new StringBuilder("Deleting ");
        sb.append(str);
        sb.append(" from cache");
        aFLogger.i(aFh1zSDK, sb.toString());
        if (!file.exists()) {
            return true;
        }
        try {
            return file.delete();
        } catch (Exception e7) {
            StringBuilder sb2 = new StringBuilder("CACHE: Could not delete ");
            sb2.append(str);
            sb2.append(" from cache");
            AFLogger.afErrorLog(sb2.toString(), e7);
            return false;
        }
    }

    @Override
    public final void getCurrencyIso4217Code() {
        try {
            File file = new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1zSDK aFh1zSDK = AFh1zSDK.CACHE;
                StringBuilder sb = new StringBuilder("Found cached request");
                sb.append(file2.getName());
                aFLogger.i(aFh1zSDK, sb.toString());
                StringBuilder sb2 = new StringBuilder("Deleting ");
                sb2.append(file2.getName());
                sb2.append(" from cache");
                aFLogger.i(aFh1zSDK, sb2.toString());
                file2.delete();
            }
        } catch (Exception e7) {
            AFLogger.afErrorLog("CACHE: Could not cache request", e7);
        }
    }
}
