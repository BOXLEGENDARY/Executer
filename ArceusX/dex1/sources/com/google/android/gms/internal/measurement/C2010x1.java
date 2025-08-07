package com.google.android.gms.internal.measurement;

import ka.oik.UJEa;

public final class C2010x1 extends T3<C2010x1, C2002w1> implements InterfaceC2029z4 {
    private static final C2010x1 zza;
    private int zze;
    private String zzf;
    private String zzg;

    static {
        C2010x1 c2010x1 = new C2010x1();
        zza = c2010x1;
        T3.o(C2010x1.class, c2010x1);
    }

    private C2010x1() {
        String str = UJEa.UQsnBSNhoIA;
        this.zzf = str;
        this.zzg = str;
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new C2010x1();
        }
        C1955q1 c1955q1 = null;
        if (i8 == 4) {
            return new C2002w1(c1955q1);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final String x() {
        return this.zzf;
    }

    public final String y() {
        return this.zzg;
    }
}
