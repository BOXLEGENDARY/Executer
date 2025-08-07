package com.google.android.gms.internal.measurement;

final class C1996v3 extends C2012x3 {

    private final byte[] f15358b;

    private int f15359c;

    private int f15360d;

    private int f15361e;

    C1996v3(byte[] bArr, int i7, int i8, boolean z7, C1988u3 c1988u3) {
        super(null);
        this.f15361e = Integer.MAX_VALUE;
        this.f15358b = bArr;
        this.f15359c = 0;
    }

    public final int c(int i7) throws C1854d4 {
        int i8 = this.f15361e;
        this.f15361e = 0;
        int i9 = this.f15359c + this.f15360d;
        this.f15359c = i9;
        if (i9 > 0) {
            this.f15360d = i9;
            this.f15359c = 0;
        } else {
            this.f15360d = 0;
        }
        return i8;
    }
}
