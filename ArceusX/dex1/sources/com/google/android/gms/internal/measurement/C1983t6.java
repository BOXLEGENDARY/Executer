package com.google.android.gms.internal.measurement;

public final class C1983t6 implements InterfaceC1975s6 {

    public static final P2<Long> f15333a;

    public static final P2<Boolean> f15334b;

    public static final P2<Boolean> f15335c;

    public static final P2<Boolean> f15336d;

    public static final P2<Long> f15337e;

    static {
        M2 m22 = new M2(F2.a("com.google.android.gms.measurement"));
        f15333a = m22.c("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f15334b = m22.e("measurement.lifecycle.app_backgrounded_engagement", false);
        f15335c = m22.e("measurement.lifecycle.app_backgrounded_tracking", true);
        f15336d = m22.e("measurement.lifecycle.app_in_background_parameter", false);
        f15337e = m22.c("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override
    public final boolean zza() {
        return f15334b.b().booleanValue();
    }

    @Override
    public final boolean zzb() {
        return f15336d.b().booleanValue();
    }
}
