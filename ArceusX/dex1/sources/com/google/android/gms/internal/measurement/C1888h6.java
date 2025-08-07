package com.google.android.gms.internal.measurement;

public final class C1888h6 implements InterfaceC1880g6 {

    public static final P2<Boolean> f15175a;

    public static final P2<Boolean> f15176b;

    public static final P2<Long> f15177c;

    static {
        M2 m22 = new M2(F2.a("com.google.android.gms.measurement"));
        f15175a = m22.e("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f15176b = m22.e("measurement.collection.redundant_engagement_removal_enabled", false);
        f15177c = m22.c("measurement.id.collection.redundant_engagement_removal_enabled", 0L);
    }

    @Override
    public final boolean zza() {
        return f15176b.b().booleanValue();
    }
}
