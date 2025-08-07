package com.google.android.gms.internal.play_billing;

final class C2136r2 extends C2148t2 {

    private int f16142b;

    private int f16143c;

    private int f16144d;

    C2136r2(byte[] bArr, int i7, int i8, boolean z7, C2142s2 c2142s2) {
        super(null);
        this.f16144d = Integer.MAX_VALUE;
        this.f16142b = 0;
    }

    public final int c(int i7) throws Y2 {
        int i8 = this.f16144d;
        this.f16144d = 0;
        int i9 = this.f16142b + this.f16143c;
        this.f16142b = i9;
        if (i9 > 0) {
            this.f16143c = i9;
            this.f16142b = 0;
        } else {
            this.f16143c = 0;
        }
        return i8;
    }
}
