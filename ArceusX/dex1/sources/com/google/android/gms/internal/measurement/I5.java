package com.google.android.gms.internal.measurement;

public final class I5 implements H5 {

    public static final P2<Boolean> f14792a;

    public static final P2<Boolean> f14793b;

    public static final P2<Boolean> f14794c;

    public static final P2<Long> f14795d;

    static {
        M2 m22 = new M2(F2.a("com.google.android.gms.measurement"));
        f14792a = m22.e("measurement.client.consent_state_v1", true);
        f14793b = m22.e("measurement.client.3p_consent_state_v1", true);
        f14794c = m22.e("measurement.service.consent_state_v1_W36", true);
        f14795d = m22.c("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override
    public final long zza() {
        return f14795d.b().longValue();
    }
}
