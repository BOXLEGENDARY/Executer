package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;

public final class J1 extends T3<J1, I1> implements InterfaceC2029z4 {
    private static final J1 zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private long zzg;

    static {
        J1 j12 = new J1();
        zza = j12;
        T3.o(J1.class, j12);
    }

    private J1() {
    }

    public static I1 w() {
        return zza.p();
    }

    static void y(J1 j12, String str) {
        str.getClass();
        j12.zze |= 1;
        j12.zzf = str;
    }

    static void z(J1 j12, long j7) {
        j12.zze |= 2;
        j12.zzg = j7;
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new J1();
        }
        C2018y1 c2018y1 = null;
        if (i8 == 4) {
            return new I1(c2018y1);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }
}
