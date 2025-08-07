package com.google.android.gms.internal.play_billing;

import Za.qhkq.dHkZSUxHu;
import com.github.luben.zstd.BuildConfig;

public final class Y4 extends R2 implements InterfaceC2161v3 {
    private static final Y4 zzb;
    private int zzd;
    private int zzf;
    private V2 zze = R2.u();
    private String zzg = BuildConfig.FLAVOR;

    static {
        Y4 y42 = new Y4();
        zzb = y42;
        R2.z(Y4.class, y42);
    }

    private Y4() {
    }

    @Override
    protected final Object m(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return R2.w(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", dHkZSUxHu.AcBnzaMlJzBF, "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new Y4();
        }
        X4 x42 = null;
        if (i8 == 4) {
            return new W4(x42);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
