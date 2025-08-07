package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class AFk1uSDK extends FilterInputStream {
    private int AFLogger;
    private final byte[] areAllFieldsValid;
    private final int[] component1;
    private final byte[][] component2;
    private final int[] component3;
    private final int component4;
    private final byte[] copy;
    private int copydefault;
    private int equals;
    private final int hashCode;
    private int registerClient;
    private final int toString;
    private static final byte[] getCurrencyIso4217Code = AFk1zSDK.getMonetizationNetwork;
    private static final int[] getMonetizationNetwork = AFk1zSDK.AFAdRevenueData;
    private static final int[] getRevenue = AFk1zSDK.getMediationNetwork;
    private static final int[] AFAdRevenueData = AFk1zSDK.getCurrencyIso4217Code;
    private static final int[] getMediationNetwork = AFk1zSDK.getRevenue;

    public AFk1uSDK(InputStream inputStream, int i7, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i7, bArr, bArr2, (byte) 0);
    }

    private int getCurrencyIso4217Code() throws IOException {
        if (this.equals == Integer.MAX_VALUE) {
            this.equals = ((FilterInputStream) this).in.read();
        }
        if (this.AFLogger == 16) {
            byte[] bArr = this.areAllFieldsValid;
            int i7 = this.equals;
            bArr[0] = (byte) i7;
            if (i7 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i8 = 1;
            do {
                int i9 = ((FilterInputStream) this).in.read(this.areAllFieldsValid, i8, 16 - i8);
                if (i9 <= 0) {
                    break;
                }
                i8 += i9;
            } while (i8 < 16);
            if (i8 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            int i10 = this.hashCode;
            if (i10 == this.toString) {
                getMonetizationNetwork(this.areAllFieldsValid, this.copy);
            } else {
                if (this.copydefault <= i10) {
                    getMonetizationNetwork(this.areAllFieldsValid, this.copy);
                } else {
                    byte[] bArr2 = this.areAllFieldsValid;
                    System.arraycopy(bArr2, 0, this.copy, 0, bArr2.length);
                }
                int i11 = this.copydefault;
                if (i11 < this.toString) {
                    this.copydefault = i11 + 1;
                } else {
                    this.copydefault = 1;
                }
            }
            int i12 = ((FilterInputStream) this).in.read();
            this.equals = i12;
            this.AFLogger = 0;
            this.registerClient = i12 < 0 ? 16 - (this.copy[15] & 255) : 16;
        }
        return this.registerClient;
    }

    private void getMonetizationNetwork(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.component1;
        char c2 = 1;
        int i7 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.component3;
        iArr[0] = i7 ^ iArr2[0];
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        iArr[3] = iArr2[3] ^ (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i8 = 4;
        int i9 = 1;
        while (i9 < this.component4) {
            int[] iArr3 = getMonetizationNetwork;
            int[] iArr4 = this.component1;
            byte[][] bArr3 = this.component2;
            byte[] bArr4 = bArr3[0];
            int i10 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = getRevenue;
            byte[] bArr5 = bArr3[c2];
            int i11 = i10 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = AFAdRevenueData;
            byte[] bArr6 = bArr3[2];
            int i12 = iArr6[(iArr4[bArr6[0]] >>> 8) & 255] ^ i11;
            int[] iArr7 = getMediationNetwork;
            byte[] bArr7 = bArr3[3];
            int i13 = iArr7[iArr4[bArr7[0]] & 255] ^ i12;
            int[] iArr8 = this.component3;
            int i14 = i13 ^ iArr8[i8];
            int i15 = ((iArr6[(iArr4[bArr6[c2]] >>> 8) & 255] ^ (iArr3[iArr4[bArr4[c2]] >>> 24] ^ iArr5[(iArr4[bArr5[c2]] >>> 16) & 255])) ^ iArr7[iArr4[bArr7[c2]] & 255]) ^ iArr8[i8 + 1];
            int i16 = (((iArr5[(iArr4[bArr5[2]] >>> 16) & 255] ^ iArr3[iArr4[bArr4[2]] >>> 24]) ^ iArr6[(iArr4[bArr6[2]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[2]] & 255]) ^ iArr8[i8 + 2];
            int i17 = (((iArr3[iArr4[bArr4[3]] >>> 24] ^ iArr5[(iArr4[bArr5[3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[3]] & 255]) ^ iArr8[i8 + 3];
            iArr4[0] = i14;
            iArr4[1] = i15;
            iArr4[2] = i16;
            iArr4[3] = i17;
            i9++;
            i8 += 4;
            c2 = 1;
        }
        int[] iArr9 = this.component3;
        int i18 = iArr9[i8];
        byte[] bArr8 = getCurrencyIso4217Code;
        int[] iArr10 = this.component1;
        byte[][] bArr9 = this.component2;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i18 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i18 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i18 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[3] = (byte) (bArr8[iArr10[bArr13[0]] & 255] ^ i18);
        int i19 = iArr9[i8 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i19 >>> 24));
        bArr2[5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i19 >>> 16));
        bArr2[6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i19 >>> 8));
        bArr2[7] = (byte) (i19 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i20 = iArr9[i8 + 2];
        bArr2[8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i20 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i20 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i20 >>> 8));
        bArr2[11] = (byte) (i20 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i21 = iArr9[i8 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i21 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i21 >>> 16));
        bArr2[14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i21 >>> 8));
        bArr2[15] = (byte) (i21 ^ bArr8[iArr10[bArr13[3]] & 255]);
    }

    private static byte[][] getRevenue(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i7 = 0; i7 < bArr.length; i7++) {
            bArr2[i7] = new byte[bArr[i7].length];
            int i8 = 0;
            while (true) {
                byte[] bArr3 = bArr[i7];
                if (i8 < bArr3.length) {
                    bArr2[i7][bArr3[i8]] = (byte) i8;
                    i8++;
                }
            }
        }
        return bArr2;
    }

    @Override
    public final int available() throws IOException {
        getCurrencyIso4217Code();
        return this.registerClient - this.AFLogger;
    }

    @Override
    public final void close() throws IOException {
        super.close();
    }

    @Override
    public final synchronized void mark(int i7) {
    }

    @Override
    public final boolean markSupported() {
        return false;
    }

    @Override
    public final int read() throws IOException {
        getCurrencyIso4217Code();
        int i7 = this.AFLogger;
        if (i7 >= this.registerClient) {
            return -1;
        }
        byte[] bArr = this.copy;
        this.AFLogger = i7 + 1;
        return bArr[i7] & 255;
    }

    @Override
    public final synchronized void reset() throws IOException {
    }

    @Override
    public final long skip(long j7) throws IOException {
        long j8 = 0;
        while (j8 < j7 && read() != -1) {
            j8++;
        }
        return j8;
    }

    private AFk1uSDK(InputStream inputStream, int i7, byte[] bArr, byte[][] bArr2, byte b2) {
        super(new BufferedInputStream(inputStream, 4096));
        this.component1 = new int[4];
        this.areAllFieldsValid = new byte[16];
        this.copy = new byte[16];
        this.copydefault = 1;
        this.equals = Integer.MAX_VALUE;
        this.AFLogger = 16;
        this.registerClient = 16;
        this.component4 = i7;
        this.component3 = AFk1zSDK.getMonetizationNetwork(bArr, i7);
        this.component2 = getRevenue(bArr2);
        this.hashCode = 100;
        this.toString = 100;
    }

    @Override
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override
    public final int read(byte[] bArr, int i7, int i8) throws IOException {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            getCurrencyIso4217Code();
            int i11 = this.AFLogger;
            if (i11 >= this.registerClient) {
                if (i10 == i7) {
                    return -1;
                }
                return i8 - (i9 - i10);
            }
            byte[] bArr2 = this.copy;
            this.AFLogger = i11 + 1;
            bArr[i10] = bArr2[i11];
        }
        return i8;
    }
}
