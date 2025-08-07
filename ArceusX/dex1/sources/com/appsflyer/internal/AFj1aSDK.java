package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class AFj1aSDK extends FilterInputStream {
    private final int AFAdRevenueData;
    private int areAllFieldsValid;
    private byte[] component1;
    private long[] component2;
    private short component3;
    private int component4;
    private int copydefault;
    private long[] getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final int getMonetizationNetwork;
    private int getRevenue;

    public AFj1aSDK(InputStream inputStream, int i7, int i8, short s7, int i9, int i10) throws IOException {
        this(inputStream, i7, i8, s7, i9, i10, (byte) 0);
    }

    private int getMediationNetwork() throws IOException {
        int i7;
        if (this.component4 == Integer.MAX_VALUE) {
            this.component4 = ((FilterInputStream) this).in.read();
        }
        if (this.areAllFieldsValid == this.getMonetizationNetwork) {
            byte[] bArr = this.component1;
            int i8 = this.component4;
            bArr[0] = (byte) i8;
            if (i8 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i9 = 1;
            do {
                int i10 = ((FilterInputStream) this).in.read(this.component1, i9, this.getMonetizationNetwork - i9);
                if (i10 <= 0) {
                    break;
                }
                i9 += i10;
            } while (i9 < this.getMonetizationNetwork);
            if (i9 < this.getMonetizationNetwork) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = this.AFAdRevenueData;
            if (i11 == this.getMediationNetwork) {
                getMonetizationNetwork();
            } else {
                if (this.getRevenue <= i11) {
                    getMonetizationNetwork();
                }
                int i12 = this.getRevenue;
                if (i12 < this.getMediationNetwork) {
                    this.getRevenue = i12 + 1;
                } else {
                    this.getRevenue = 1;
                }
            }
            int i13 = ((FilterInputStream) this).in.read();
            this.component4 = i13;
            this.areAllFieldsValid = 0;
            if (i13 < 0) {
                int i14 = this.getMonetizationNetwork;
                i7 = i14 - (this.component1[i14 - 1] & 255);
            } else {
                i7 = this.getMonetizationNetwork;
            }
            this.copydefault = i7;
        }
        return this.copydefault;
    }

    private void getMonetizationNetwork() {
        long[] jArr = this.getCurrencyIso4217Code;
        long[] jArr2 = this.component2;
        short s7 = this.component3;
        long j7 = jArr[s7 % 4] * 2147483085;
        long j8 = jArr2[(s7 + 2) % 4];
        int i7 = (s7 + 3) % 4;
        jArr2[i7] = ((jArr[i7] * 2147483085) + j8) / 2147483647L;
        jArr[i7] = (j7 + j8) % 2147483647L;
        for (int i8 = 0; i8 < this.getMonetizationNetwork; i8++) {
            this.component1[i8] = (byte) (r1[i8] ^ ((this.getCurrencyIso4217Code[this.component3] >> (i8 << 3)) & 255));
        }
        this.component3 = (short) ((this.component3 + 1) % 4);
    }

    @Override
    public final int available() throws IOException {
        getMediationNetwork();
        return this.copydefault - this.areAllFieldsValid;
    }

    @Override
    public final boolean markSupported() {
        return false;
    }

    @Override
    public final int read() throws IOException {
        getMediationNetwork();
        int i7 = this.areAllFieldsValid;
        if (i7 >= this.copydefault) {
            return -1;
        }
        byte[] bArr = this.component1;
        this.areAllFieldsValid = i7 + 1;
        return bArr[i7] & 255;
    }

    @Override
    public final long skip(long j7) throws IOException {
        long j8 = 0;
        while (j8 < j7 && read() != -1) {
            j8++;
        }
        return j8;
    }

    private AFj1aSDK(InputStream inputStream, int i7, int i8, short s7, int i9, int i10, byte b2) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.getRevenue = 1;
        this.component4 = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max((int) s7, 4), 8);
        this.getMonetizationNetwork = iMin;
        this.component1 = new byte[iMin];
        this.getCurrencyIso4217Code = new long[4];
        this.component2 = new long[4];
        this.areAllFieldsValid = iMin;
        this.copydefault = iMin;
        this.getCurrencyIso4217Code = AFk1xSDK.getRevenue(i7 ^ i10, iMin ^ i10);
        this.component2 = AFk1xSDK.getRevenue(i8 ^ i10, i9 ^ i10);
        this.AFAdRevenueData = 100;
        this.getMediationNetwork = 100;
    }

    @Override
    public final int read(byte[] bArr, int i7, int i8) throws IOException {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            getMediationNetwork();
            int i11 = this.areAllFieldsValid;
            if (i11 >= this.copydefault) {
                if (i10 == i7) {
                    return -1;
                }
                return i8 - (i9 - i10);
            }
            byte[] bArr2 = this.component1;
            this.areAllFieldsValid = i11 + 1;
            bArr[i10] = bArr2[i11];
        }
        return i8;
    }
}
