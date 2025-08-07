package com.appsflyer.internal;

public final class AFk1nSDK {
    public int getMediationNetwork;
    public int getRevenue;

    public static char[] AFAdRevenueData(long j7, char[] cArr, int i7) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i8 = 0;
        int i9 = 0;
        int i10 = 4;
        while (i8 < cArr.length) {
            if ((((j7 >>> i8) & 1) != i7 || i9 >= 4) && i10 < length) {
                cArr2[i10] = cArr[i8];
                i10++;
                i8++;
            } else {
                cArr2[i9] = cArr[i8];
                i9++;
                i8++;
            }
        }
        return cArr2;
    }
}
