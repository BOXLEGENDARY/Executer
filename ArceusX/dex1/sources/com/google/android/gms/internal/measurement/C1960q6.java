package com.google.android.gms.internal.measurement;

public final class C1960q6 implements InterfaceC1952p6 {

    public static final P2<Boolean> f15278a;

    public static final P2<Boolean> f15279b;

    public static final P2<Boolean> f15280c;

    public static final P2<Long> f15281d;

    static {
        M2 m22 = new M2(F2.a("com.google.android.gms.measurement"));
        f15278a = m22.e("measurement.sdk.collection.enable_extend_user_property_size", true);
        f15279b = m22.e("measurement.sdk.collection.last_deep_link_referrer2", true);
        f15280c = m22.e("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f15281d = m22.c("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override
    public final boolean zza() {
        return f15278a.b().booleanValue();
    }

    @Override
    public final boolean zzb() {
        return f15280c.b().booleanValue();
    }
}
