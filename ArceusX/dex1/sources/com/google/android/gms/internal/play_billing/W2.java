package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class W2 {

    static final Charset f15950a;

    public static final byte[] f15951b;

    static {
        Charset.forName("US-ASCII");
        f15950a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f15951b = bArr;
        ByteBuffer.wrap(bArr);
        int i7 = C2148t2.f16151a;
        try {
            new C2136r2(bArr, 0, 0, false, null).c(0);
        } catch (Y2 e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static int a(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    static int b(int i7, byte[] bArr, int i8, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            i7 = (i7 * 31) + bArr[i10];
        }
        return i7;
    }

    static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }
}
