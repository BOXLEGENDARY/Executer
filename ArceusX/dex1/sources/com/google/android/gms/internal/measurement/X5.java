package com.google.android.gms.internal.measurement;

public final class X5 implements W5 {

    public static final P2<Boolean> f15073a;

    public static final P2<Boolean> f15074b;

    static {
        M2 m22 = new M2(F2.a("com.google.android.gms.measurement"));
        f15073a = m22.e("measurement.client.consent.suppress_1p_in_ga4f_install", true);
        f15074b = m22.e("measurement.client.consent.gmpappid_worker_thread_fix", true);
    }

    @Override
    public final boolean a() {
        return f15074b.b().booleanValue();
    }

    @Override
    public final boolean zza() {
        return true;
    }

    @Override
    public final boolean zzb() {
        return f15073a.b().booleanValue();
    }
}
