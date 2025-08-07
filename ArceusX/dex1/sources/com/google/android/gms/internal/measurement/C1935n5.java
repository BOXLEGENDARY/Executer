package com.google.android.gms.internal.measurement;

final class C1935n5 {

    private static final AbstractC1911k5 f15216a;

    static {
        if (C1895i5.C() && C1895i5.D()) {
            int i7 = C1869f3.f15154a;
        }
        f15216a = new C1919l5();
    }

    static int a(byte[] bArr, int i7, int i8) {
        byte b2 = bArr[i7 - 1];
        int i9 = i8 - i7;
        if (i9 != 0) {
            if (i9 == 1) {
                byte b3 = bArr[i7];
                if (b2 <= -12 && b3 <= -65) {
                    return b2 ^ (b3 << 8);
                }
            } else {
                if (i9 != 2) {
                    throw new AssertionError();
                }
                byte b8 = bArr[i7];
                byte b9 = bArr[i7 + 1];
                if (b2 <= -12 && b8 <= -65 && b9 <= -65) {
                    return ((b8 << 8) ^ b2) ^ (b9 << 16);
                }
            }
        } else if (b2 <= -12) {
            return b2;
        }
        return -1;
    }

    static int b(CharSequence charSequence, byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        char cCharAt;
        int length = charSequence.length();
        int i11 = i8 + i7;
        int i12 = 0;
        while (i12 < length && (i10 = i12 + i7) < i11 && (cCharAt = charSequence.charAt(i12)) < 128) {
            bArr[i10] = (byte) cCharAt;
            i12++;
        }
        if (i12 == length) {
            return i7 + length;
        }
        int i13 = i7 + i12;
        while (i12 < length) {
            char cCharAt2 = charSequence.charAt(i12);
            if (cCharAt2 < 128 && i13 < i11) {
                bArr[i13] = (byte) cCharAt2;
                i13++;
            } else if (cCharAt2 < 2048 && i13 <= i11 - 2) {
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((cCharAt2 >>> 6) | 960);
                i13 += 2;
                bArr[i14] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i13 > i11 - 3) {
                    if (i13 > i11 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i9 = i12 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i9)))) {
                            throw new C1927m5(i12, length);
                        }
                        StringBuilder sb = new StringBuilder(37);
                        sb.append("Failed writing ");
                        sb.append(cCharAt2);
                        sb.append(" at index ");
                        sb.append(i13);
                        throw new ArrayIndexOutOfBoundsException(sb.toString());
                    }
                    int i15 = i12 + 1;
                    if (i15 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i15);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i13] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i13 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i16 = i13 + 3;
                            bArr[i13 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i13 += 4;
                            bArr[i16] = (byte) ((codePoint & 63) | 128);
                            i12 = i15;
                        } else {
                            i12 = i15;
                        }
                    }
                    throw new C1927m5(i12 - 1, length);
                }
                bArr[i13] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i17 = i13 + 2;
                bArr[i13 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i13 += 3;
                bArr[i17] = (byte) ((cCharAt2 & '?') | 128);
            }
            i12++;
        }
        return i13;
    }

    static int c(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        int i8 = 0;
        while (i8 < length && charSequence.charAt(i8) < 128) {
            i8++;
        }
        int i9 = length;
        while (true) {
            if (i8 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i8);
            if (cCharAt < 2048) {
                i9 += (127 - cCharAt) >>> 31;
                i8++;
            } else {
                int length2 = charSequence.length();
                while (i8 < length2) {
                    char cCharAt2 = charSequence.charAt(i8);
                    if (cCharAt2 < 2048) {
                        i7 += (127 - cCharAt2) >>> 31;
                    } else {
                        i7 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i8) < 65536) {
                                throw new C1927m5(i8, length2);
                            }
                            i8++;
                        }
                    }
                    i8++;
                }
                i9 += i7;
            }
        }
        if (i9 >= length) {
            return i9;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(i9 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    static String d(byte[] bArr, int i7, int i8) throws C1854d4 {
        int length = bArr.length;
        if ((i7 | i8 | ((length - i7) - i8)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        int i9 = i7 + i8;
        char[] cArr = new char[i8];
        int i10 = 0;
        while (i7 < i9) {
            byte b2 = bArr[i7];
            if (!C1903j5.d(b2)) {
                break;
            }
            i7++;
            cArr[i10] = (char) b2;
            i10++;
        }
        int i11 = i10;
        while (i7 < i9) {
            int i12 = i7 + 1;
            byte b3 = bArr[i7];
            if (C1903j5.d(b3)) {
                cArr[i11] = (char) b3;
                i11++;
                i7 = i12;
                while (i7 < i9) {
                    byte b8 = bArr[i7];
                    if (!C1903j5.d(b8)) {
                        break;
                    }
                    i7++;
                    cArr[i11] = (char) b8;
                    i11++;
                }
            } else if (b3 < -32) {
                if (i12 >= i9) {
                    throw C1854d4.c();
                }
                i7 += 2;
                C1903j5.b(b3, bArr[i12], cArr, i11);
                i11++;
            } else if (b3 < -16) {
                if (i12 >= i9 - 1) {
                    throw C1854d4.c();
                }
                int i13 = i7 + 2;
                i7 += 3;
                C1903j5.c(b3, bArr[i12], bArr[i13], cArr, i11);
                i11++;
            } else {
                if (i12 >= i9 - 2) {
                    throw C1854d4.c();
                }
                int i14 = i7 + 2;
                int i15 = i7 + 3;
                i7 += 4;
                C1903j5.a(b3, bArr[i12], bArr[i14], bArr[i15], cArr, i11);
                i11 += 2;
            }
        }
        return new String(cArr, 0, i11);
    }

    public static boolean e(byte[] bArr) {
        return f15216a.b(bArr, 0, bArr.length);
    }

    public static boolean f(byte[] bArr, int i7, int i8) {
        return f15216a.b(bArr, i7, i8);
    }
}
