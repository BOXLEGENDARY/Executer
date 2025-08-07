package com.google.android.gms.internal.play_billing;

final class E3 implements InterfaceC2137r3 {

    private final InterfaceC2155u3 f15794a;

    private final String f15795b;

    private final Object[] f15796c;

    private final int f15797d;

    E3(InterfaceC2155u3 interfaceC2155u3, String str, Object[] objArr) {
        this.f15794a = interfaceC2155u3;
        this.f15795b = str;
        this.f15796c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f15797d = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i8 = 1;
        int i9 = 13;
        while (true) {
            int i10 = i8 + 1;
            char cCharAt2 = str.charAt(i8);
            if (cCharAt2 < 55296) {
                this.f15797d = i7 | (cCharAt2 << i9);
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i9;
                i9 += 13;
                i8 = i10;
            }
        }
    }

    @Override
    public final int a() {
        int i7 = this.f15797d;
        if ((i7 & 1) != 0) {
            return 1;
        }
        return (i7 & 4) == 4 ? 3 : 2;
    }

    final String b() {
        return this.f15795b;
    }

    final Object[] c() {
        return this.f15796c;
    }

    @Override
    public final InterfaceC2155u3 zza() {
        return this.f15794a;
    }

    @Override
    public final boolean zzb() {
        return (this.f15797d & 2) == 2;
    }
}
