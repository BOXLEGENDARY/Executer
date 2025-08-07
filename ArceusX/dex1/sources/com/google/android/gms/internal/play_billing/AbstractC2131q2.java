package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import k0.BAKp.xAQOwX;

public abstract class AbstractC2131q2 implements Iterable, Serializable {

    public static final AbstractC2131q2 f16138e = new C2119o2(W2.f15951b);

    private int f16139d = 0;

    static {
        int i7 = C2053d2.f16004a;
    }

    AbstractC2131q2() {
    }

    static int m(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i7 + " < 0");
        }
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i7 + ", " + i8);
        }
        throw new IndexOutOfBoundsException("End index: " + i8 + " >= " + i9);
    }

    public static AbstractC2131q2 o(byte[] bArr, int i7, int i8) {
        m(i7, i7 + i8, bArr.length);
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        return new C2119o2(bArr2);
    }

    public abstract byte d(int i7);

    abstract byte e(int i7);

    public abstract boolean equals(Object obj);

    public abstract int g();

    public final int hashCode() {
        int iJ = this.f16139d;
        if (iJ == 0) {
            int iG = g();
            iJ = j(iG, 0, iG);
            if (iJ == 0) {
                iJ = 1;
            }
            this.f16139d = iJ;
        }
        return iJ;
    }

    @Override
    public final Iterator iterator() {
        return new C2089j2(this);
    }

    protected abstract int j(int i7, int i8, int i9);

    public abstract AbstractC2131q2 k(int i7, int i8);

    abstract void l(C2083i2 c2083i2) throws IOException;

    protected final int n() {
        return this.f16139d;
    }

    public final String toString() {
        return String.format(Locale.ROOT, xAQOwX.fMsxsgjOfcmqN, Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(g()), g() <= 50 ? Q3.a(this) : Q3.a(k(0, 47)).concat("..."));
    }
}
