package com.google.android.gms.internal.measurement;

final class C1903j5 {
    static void a(byte b2, byte b3, byte b8, byte b9, char[] cArr, int i7) throws C1854d4 {
        if (e(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || e(b8) || e(b9)) {
            throw C1854d4.c();
        }
        int i8 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
        cArr[i7] = (char) ((i8 >>> 10) + 55232);
        cArr[i7 + 1] = (char) ((i8 & 1023) + 56320);
    }

    static void b(byte b2, byte b3, char[] cArr, int i7) throws C1854d4 {
        if (b2 < -62 || e(b3)) {
            throw C1854d4.c();
        }
        cArr[i7] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    static void c(byte r2, byte r3, byte r4, char[] r5, int r6) throws com.google.android.gms.internal.measurement.C1854d4 {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1903j5.c(byte, byte, byte, char[], int):void");
    }

    static boolean d(byte b2) {
        return b2 >= 0;
    }

    private static boolean e(byte b2) {
        return b2 > -65;
    }
}
