package com.google.android.gms.internal.measurement;

public final class O5 implements N5 {

    public static final P2<Boolean> f14980a = new M2(F2.a("com.google.android.gms.measurement")).e("measurement.config.fix_feature_flags_from_config", true);

    @Override
    public final boolean zza() {
        return f14980a.b().booleanValue();
    }
}
