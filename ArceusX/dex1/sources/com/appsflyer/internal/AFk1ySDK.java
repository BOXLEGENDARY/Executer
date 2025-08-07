package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class AFk1ySDK extends FilterInputStream {
    private static final short getMediationNetwork = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private int AFAdRevenueData;
    private int AFKeystoreWrapper;
    private int areAllFieldsValid;
    private int component1;
    private int component2;
    private int component3;
    private int component4;
    private final int copy;
    private int copydefault;
    private int equals;
    private byte[] getCurrencyIso4217Code;
    private byte[] getMonetizationNetwork;
    private byte[] getRevenue;
    private final int hashCode;
    private int toString;

    public AFk1ySDK(InputStream inputStream, int[] iArr, int i7, byte[] bArr, int i8, int i9) throws IOException {
        this(inputStream, iArr, i7, bArr, i8, i9, (byte) 0);
    }

    private int getMonetizationNetwork() throws IOException {
        if (this.component3 == Integer.MAX_VALUE) {
            this.component3 = ((FilterInputStream) this).in.read();
        }
        if (this.AFAdRevenueData == 8) {
            byte[] bArr = this.getMonetizationNetwork;
            int i7 = this.component3;
            bArr[0] = (byte) i7;
            if (i7 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i8 = 1;
            do {
                int i9 = ((FilterInputStream) this).in.read(this.getMonetizationNetwork, i8, 8 - i8);
                if (i9 <= 0) {
                    break;
                }
                i8 += i9;
            } while (i8 < 8);
            if (i8 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i10 = this.hashCode;
            if (i10 == this.copy) {
                getRevenue();
            } else {
                if (this.AFKeystoreWrapper <= i10) {
                    getRevenue();
                }
                int i11 = this.AFKeystoreWrapper;
                if (i11 < this.copy) {
                    this.AFKeystoreWrapper = i11 + 1;
                } else {
                    this.AFKeystoreWrapper = 1;
                }
            }
            int i12 = ((FilterInputStream) this).in.read();
            this.component3 = i12;
            this.AFAdRevenueData = 0;
            this.areAllFieldsValid = i12 < 0 ? 8 - (this.getMonetizationNetwork[7] & 255) : 8;
        }
        return this.areAllFieldsValid;
    }

    private void getRevenue() {
        if (this.component2 == 3) {
            byte[] bArr = this.getMonetizationNetwork;
            System.arraycopy(bArr, 0, this.getRevenue, 0, bArr.length);
        }
        byte[] bArr2 = this.getMonetizationNetwork;
        int i7 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i8 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i9 = 0;
        while (true) {
            int i10 = this.component1;
            if (i9 >= i10) {
                break;
            }
            short s7 = getMediationNetwork;
            i8 -= ((((i10 - i9) * s7) + i7) ^ ((i7 << 4) + this.toString)) ^ ((i7 >>> 5) + this.copydefault);
            i7 -= (((i8 << 4) + this.component4) ^ ((s7 * (i10 - i9)) + i8)) ^ ((i8 >>> 5) + this.equals);
            i9++;
        }
        byte[] bArr3 = this.getMonetizationNetwork;
        bArr3[0] = (byte) (i7 >> 24);
        bArr3[1] = (byte) (i7 >> 16);
        bArr3[2] = (byte) (i7 >> 8);
        bArr3[3] = (byte) i7;
        bArr3[4] = (byte) (i8 >> 24);
        bArr3[5] = (byte) (i8 >> 16);
        bArr3[6] = (byte) (i8 >> 8);
        bArr3[7] = (byte) i8;
        if (this.component2 == 3) {
            for (int i11 = 0; i11 < 8; i11++) {
                byte[] bArr4 = this.getMonetizationNetwork;
                bArr4[i11] = (byte) (bArr4[i11] ^ this.getCurrencyIso4217Code[i11]);
            }
            byte[] bArr5 = this.getRevenue;
            System.arraycopy(bArr5, 0, this.getCurrencyIso4217Code, 0, bArr5.length);
        }
    }

    @Override
    public final int available() throws IOException {
        getMonetizationNetwork();
        return this.areAllFieldsValid - this.AFAdRevenueData;
    }

    @Override
    public final boolean markSupported() {
        return false;
    }

    @Override
    public final int read() throws IOException {
        getMonetizationNetwork();
        int i7 = this.AFAdRevenueData;
        if (i7 >= this.areAllFieldsValid) {
            return -1;
        }
        byte[] bArr = this.getMonetizationNetwork;
        this.AFAdRevenueData = i7 + 1;
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

    private AFk1ySDK(InputStream inputStream, int[] iArr, int i7, byte[] bArr, int i8, int i9, byte b2) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.component3 = Integer.MAX_VALUE;
        this.AFKeystoreWrapper = 1;
        this.getMonetizationNetwork = new byte[8];
        this.getCurrencyIso4217Code = new byte[8];
        this.getRevenue = new byte[8];
        this.AFAdRevenueData = 8;
        this.areAllFieldsValid = 8;
        this.component1 = Math.min(Math.max(i8, 5), 16);
        this.component2 = i9;
        if (i9 == 3) {
            System.arraycopy(bArr, 0, this.getCurrencyIso4217Code, 0, 8);
        }
        long j7 = (iArr[1] & 4294967295L) | ((iArr[0] & 4294967295L) << 32);
        if (i7 == 0) {
            this.component4 = (int) j7;
            long j8 = j7 >> 3;
            short s7 = getMediationNetwork;
            this.equals = (int) ((s7 * j8) >> 32);
            this.toString = (int) (j7 >> 32);
            this.copydefault = (int) (j8 + s7);
        } else {
            int i10 = (int) j7;
            this.component4 = i10;
            this.equals = i10 * i7;
            this.toString = i7 ^ i10;
            this.copydefault = (int) (j7 >> 32);
        }
        this.hashCode = 100;
        this.copy = 100;
    }

    @Override
    public final int read(byte[] bArr, int i7, int i8) throws IOException {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            getMonetizationNetwork();
            int i11 = this.AFAdRevenueData;
            if (i11 >= this.areAllFieldsValid) {
                if (i10 == i7) {
                    return -1;
                }
                return i8 - (i9 - i10);
            }
            byte[] bArr2 = this.getMonetizationNetwork;
            this.AFAdRevenueData = i11 + 1;
            bArr[i10] = bArr2[i11];
        }
        return i8;
    }
}
