package com.appsflyer.internal;

public final class AFk1zSDK {
    private static byte[] areAllFieldsValid = new byte[256];
    static final byte[] getMonetizationNetwork = new byte[256];
    static final int[] AFAdRevenueData = new int[256];
    static final int[] getMediationNetwork = new int[256];
    static final int[] getCurrencyIso4217Code = new int[256];
    static final int[] getRevenue = new int[256];
    private static int[] component1 = new int[10];

    static {
        byte[] bArr;
        int i7;
        byte b2 = 1;
        byte b3 = 1;
        do {
            b2 = (byte) (((b2 & 128) != 0 ? 27 : 0) ^ ((b2 << 1) ^ b2));
            byte b8 = (byte) (b3 ^ (b3 << 1));
            byte b9 = (byte) (b8 ^ (b8 << 2));
            byte b10 = (byte) (b9 ^ (b9 << 4));
            b3 = (byte) (b10 ^ ((b10 & 128) != 0 ? (byte) 9 : (byte) 0));
            bArr = areAllFieldsValid;
            i7 = b2 & 255;
            int i8 = b3 & 255;
            bArr[i7] = (byte) (((((b3 ^ 99) ^ ((i8 << 1) | (i8 >> 7))) ^ ((i8 << 2) | (i8 >> 6))) ^ ((i8 << 3) | (i8 >> 5))) ^ ((i8 >> 4) | (i8 << 4)));
        } while (i7 != 1);
        bArr[0] = 99;
        for (int i9 = 0; i9 < 256; i9++) {
            int i10 = areAllFieldsValid[i9] & 255;
            getMonetizationNetwork[i10] = (byte) i9;
            int i11 = i9 << 1;
            if (i11 >= 256) {
                i11 ^= 283;
            }
            int i12 = i11 << 1;
            if (i12 >= 256) {
                i12 ^= 283;
            }
            int i13 = i12 << 1;
            if (i13 >= 256) {
                i13 ^= 283;
            }
            int i14 = i13 ^ i9;
            int i15 = ((i11 ^ (i12 ^ i13)) << 24) | (i14 << 16) | ((i14 ^ i12) << 8) | (i14 ^ i11);
            AFAdRevenueData[i10] = i15;
            getMediationNetwork[i10] = (i15 >>> 8) | (i15 << 24);
            getCurrencyIso4217Code[i10] = (i15 >>> 16) | (i15 << 16);
            getRevenue[i10] = (i15 << 8) | (i15 >>> 24);
        }
        component1[0] = 16777216;
        int i16 = 1;
        for (int i17 = 1; i17 < 10; i17++) {
            i16 <<= 1;
            if (i16 >= 256) {
                i16 ^= 283;
            }
            component1[i17] = i16 << 24;
        }
    }

    public static byte[][] getMediationNetwork(int i7) {
        byte[][] bArr = new byte[4][];
        for (int i8 = 0; i8 < 4; i8++) {
            int i9 = i7 >>> (i8 << 3);
            bArr[i8] = new byte[]{(byte) (i9 & 3), (byte) ((i9 >> 2) & 3), (byte) ((i9 >> 4) & 3), (byte) ((i9 >> 6) & 3)};
        }
        return bArr;
    }

    static int[] getMonetizationNetwork(byte[] bArr, int i7) throws IllegalArgumentException {
        int i8 = i7;
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i9 = 4;
        int i10 = (i8 + 1) * 4;
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = i11 + 3;
            int i14 = ((bArr[i11 + 1] & 255) << 16) | (bArr[i11] << 24) | ((bArr[i11 + 2] & 255) << 8);
            i11 += 4;
            iArr[i12] = i14 | (bArr[i13] & 255);
        }
        int i15 = 4;
        int i16 = 0;
        int i17 = 0;
        while (i15 < i10) {
            int i18 = iArr[i15 - 1];
            if (i16 == 0) {
                byte[] bArr2 = areAllFieldsValid;
                i18 = ((bArr2[i18 >>> 24] & 255) | (((bArr2[(i18 >>> 16) & 255] << 24) | ((bArr2[(i18 >>> 8) & 255] & 255) << 16)) | ((bArr2[i18 & 255] & 255) << 8))) ^ component1[i17];
                i16 = 4;
                i17++;
            }
            iArr[i15] = i18 ^ iArr[i15 - 4];
            i15++;
            i16--;
        }
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int[] iArr2 = new int[i10];
        int i19 = i8 * 4;
        iArr2[0] = iArr[i19];
        int i20 = 1;
        iArr2[1] = iArr[i19 + 1];
        iArr2[2] = iArr[i19 + 2];
        iArr2[3] = iArr[i19 + 3];
        int i21 = i19 - 4;
        while (i20 < i8) {
            int i22 = iArr[i21];
            int[] iArr3 = AFAdRevenueData;
            byte[] bArr3 = areAllFieldsValid;
            int i23 = iArr3[bArr3[i22 >>> 24] & 255];
            int[] iArr4 = getMediationNetwork;
            int i24 = i23 ^ iArr4[bArr3[(i22 >>> 16) & 255] & 255];
            int[] iArr5 = getCurrencyIso4217Code;
            int i25 = i24 ^ iArr5[bArr3[(i22 >>> 8) & 255] & 255];
            int[] iArr6 = getRevenue;
            iArr2[i9] = iArr6[bArr3[i22 & 255] & 255] ^ i25;
            int i26 = iArr[i21 + 1];
            iArr2[i9 + 1] = ((iArr4[bArr3[(i26 >>> 16) & 255] & 255] ^ iArr3[bArr3[i26 >>> 24] & 255]) ^ iArr5[bArr3[(i26 >>> 8) & 255] & 255]) ^ iArr6[bArr3[i26 & 255] & 255];
            int i27 = iArr[i21 + 2];
            int i28 = i9 + 3;
            iArr2[i9 + 2] = iArr6[bArr3[i27 & 255] & 255] ^ ((iArr3[bArr3[i27 >>> 24] & 255] ^ iArr4[bArr3[(i27 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i27 >>> 8) & 255] & 255]);
            int i29 = iArr[i21 + 3];
            i9 += 4;
            iArr2[i28] = iArr6[bArr3[i29 & 255] & 255] ^ ((iArr3[bArr3[i29 >>> 24] & 255] ^ iArr4[bArr3[(i29 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i29 >>> 8) & 255] & 255]);
            i21 -= 4;
            i20++;
            i8 = i7;
        }
        iArr2[i9] = iArr[i21];
        iArr2[i9 + 1] = iArr[i21 + 1];
        iArr2[i9 + 2] = iArr[i21 + 2];
        iArr2[i9 + 3] = iArr[i21 + 3];
        return iArr2;
    }
}
