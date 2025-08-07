package com.google.android.gms.internal.measurement;

public final class C1840b6 implements InterfaceC1832a6 {

    public static final P2<Boolean> f15108a;

    public static final P2<Boolean> f15109b;

    public static final P2<Boolean> f15110c;

    public static final P2<Boolean> f15111d;

    static {
        M2 m22 = new M2(F2.a("com.google.android.gms.measurement"));
        f15108a = m22.e("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f15109b = m22.e("measurement.audience.refresh_event_count_filters_timestamp", false);
        f15110c = m22.e("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f15111d = m22.e("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override
    public final boolean a() {
        return f15110c.b().booleanValue();
    }

    @Override
    public final boolean d() {
        return f15111d.b().booleanValue();
    }

    @Override
    public final boolean zza() {
        return true;
    }

    @Override
    public final boolean zzb() {
        return f15109b.b().booleanValue();
    }
}
