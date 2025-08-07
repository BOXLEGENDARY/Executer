package com.google.android.gms.internal.measurement;

public final class C2007w6 implements InterfaceC1999v6 {

    public static final P2<Boolean> f15370a;

    public static final P2<Long> f15371b;

    static {
        M2 m22 = new M2(F2.a("com.google.android.gms.measurement"));
        f15370a = m22.e("measurement.validation.internal_limits_internal_event_params", false);
        f15371b = m22.c("measurement.id.validation.internal_limits_internal_event_params", 0L);
    }

    @Override
    public final boolean zza() {
        return f15370a.b().booleanValue();
    }
}
