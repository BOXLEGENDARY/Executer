package com.google.android.gms.internal.measurement;

public final class G6 implements F6 {

    public static final P2<Boolean> f14774a;

    public static final P2<Boolean> f14775b;

    static {
        M2 m22 = new M2(F2.a("com.google.android.gms.measurement"));
        f14774a = m22.e("measurement.module.pixie.ees", true);
        f14775b = m22.e("measurement.module.pixie.fix_array", true);
    }

    @Override
    public final boolean a() {
        return f14775b.b().booleanValue();
    }

    @Override
    public final boolean zza() {
        return true;
    }

    @Override
    public final boolean zzb() {
        return f14774a.b().booleanValue();
    }
}
