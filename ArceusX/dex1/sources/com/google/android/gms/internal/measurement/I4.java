package com.google.android.gms.internal.measurement;

final class I4 implements InterfaceC1989u4 {

    private final InterfaceC2021y4 f14788a;

    private final String f14789b;

    private final Object[] f14790c;

    private final int f14791d;

    I4(InterfaceC2021y4 interfaceC2021y4, String str, Object[] objArr) {
        this.f14788a = interfaceC2021y4;
        this.f14789b = str;
        this.f14790c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f14791d = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i8 = 13;
        int i9 = 1;
        while (true) {
            int i10 = i9 + 1;
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 55296) {
                this.f14791d = i7 | (cCharAt2 << i8);
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i8;
                i8 += 13;
                i9 = i10;
            }
        }
    }

    @Override
    public final int a() {
        return (this.f14791d & 1) == 1 ? 1 : 2;
    }

    final String b() {
        return this.f14789b;
    }

    final Object[] c() {
        return this.f14790c;
    }

    @Override
    public final InterfaceC2021y4 zza() {
        return this.f14788a;
    }

    @Override
    public final boolean zzb() {
        return (this.f14791d & 2) == 2;
    }
}
