package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class C1838b4 {

    static final Charset f15099a = Charset.forName("US-ASCII");

    static final Charset f15100b = Charset.forName("UTF-8");

    static final Charset f15101c = Charset.forName("ISO-8859-1");

    public static final byte[] f15102d;

    public static final ByteBuffer f15103e;

    public static final C2012x3 f15104f;

    static {
        byte[] bArr = new byte[0];
        f15102d = bArr;
        f15103e = ByteBuffer.wrap(bArr);
        int i7 = C2012x3.f15374a;
        C1996v3 c1996v3 = new C1996v3(bArr, 0, 0, false, null);
        try {
            c1996v3.c(0);
            f15104f = c1996v3;
        } catch (C1854d4 e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static int a(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int iD = d(length, bArr, 0, length);
        if (iD == 0) {
            return 1;
        }
        return iD;
    }

    public static int c(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    static int d(int i7, byte[] bArr, int i8, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            i7 = (i7 * 31) + bArr[i10];
        }
        return i7;
    }

    static <T> T e(T t7) {
        t7.getClass();
        return t7;
    }

    static <T> T f(T t7, String str) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(str);
    }

    static Object g(Object obj, Object obj2) {
        return ((InterfaceC2021y4) obj).c().K((InterfaceC2021y4) obj2).A();
    }

    public static String h(byte[] bArr) {
        return new String(bArr, f15100b);
    }

    public static boolean i(byte[] bArr) {
        return C1935n5.e(bArr);
    }
}
