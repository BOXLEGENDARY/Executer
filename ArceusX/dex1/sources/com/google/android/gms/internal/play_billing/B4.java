package com.google.android.gms.internal.play_billing;

import com.github.luben.zstd.BuildConfig;

public final class B4 extends R2 implements InterfaceC2161v3 {
    private static final B4 zzb;
    private int zzd;
    private int zzf;
    private C2144s4 zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = BuildConfig.FLAVOR;
    private U2 zzg = R2.t();
    private V2 zzh = R2.u();

    static {
        B4 b42 = new B4();
        zzb = b42;
        R2.z(B4.class, b42);
    }

    private B4() {
    }

    @Override
    protected final Object m(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return R2.w(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", C2186z4.f16199a, "zzg", C2168w4.f16160a, "zzh", Y4.class, "zzi", "zzj", "zzk"});
        }
        if (i8 == 3) {
            return new B4();
        }
        A4 a42 = null;
        if (i8 == 4) {
            return new C2180y4(a42);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
