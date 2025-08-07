package com.google.android.gms.internal.measurement;

public final class F1 extends T3<F1, E1> implements InterfaceC2029z4 {
    private static final F1 zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        F1 f12 = new F1();
        zza = f12;
        T3.o(F1.class, f12);
    }

    private F1() {
    }

    static void B(F1 f12, int i7) {
        f12.zze |= 1;
        f12.zzf = i7;
    }

    static void C(F1 f12, long j7) {
        f12.zze |= 2;
        f12.zzg = j7;
    }

    public static E1 y() {
        return zza.p();
    }

    public final boolean D() {
        return (this.zze & 2) != 0;
    }

    public final boolean E() {
        return (this.zze & 1) != 0;
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new F1();
        }
        C2018y1 c2018y1 = null;
        if (i8 == 4) {
            return new E1(c2018y1);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final int w() {
        return this.zzf;
    }

    public final long x() {
        return this.zzg;
    }
}
