package com.appsflyer.internal;

public class AFk1tSDK {
    public static void getMonetizationNetwork(byte[] bArr, byte b2, long j7) {
        for (int i7 = 0; i7 < bArr.length; i7++) {
            if (((1 << i7) & j7) != 0) {
                bArr[i7] = (byte) (bArr[i7] ^ b2);
            }
        }
    }
}
