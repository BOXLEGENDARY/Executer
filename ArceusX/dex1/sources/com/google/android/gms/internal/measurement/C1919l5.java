package com.google.android.gms.internal.measurement;

final class C1919l5 extends AbstractC1911k5 {
    C1919l5() {
    }

    @Override
    final int a(int i7, byte[] bArr, int i8, int i9) {
        while (i8 < i9 && bArr[i8] >= 0) {
            i8++;
        }
        if (i8 >= i9) {
            return 0;
        }
        while (i8 < i9) {
            int i10 = i8 + 1;
            byte b2 = bArr[i8];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i10 >= i9) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i8 += 2;
                        if (bArr[i10] > -65) {
                        }
                    }
                    return -1;
                }
                if (b2 >= -16) {
                    if (i10 >= i9 - 2) {
                        return C1935n5.a(bArr, i10, i9);
                    }
                    int i11 = i8 + 2;
                    byte b3 = bArr[i10];
                    if (b3 <= -65 && (((b2 << 28) + (b3 + 112)) >> 30) == 0) {
                        int i12 = i8 + 3;
                        if (bArr[i11] <= -65) {
                            i8 += 4;
                            if (bArr[i12] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i10 >= i9 - 1) {
                    return C1935n5.a(bArr, i10, i9);
                }
                int i13 = i8 + 2;
                byte b8 = bArr[i10];
                if (b8 <= -65 && ((b2 != -32 || b8 >= -96) && (b2 != -19 || b8 < -96))) {
                    i8 += 3;
                    if (bArr[i13] > -65) {
                    }
                }
                return -1;
            }
            i8 = i10;
        }
        return 0;
    }
}
