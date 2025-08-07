package com.google.android.gms.internal.measurement;

public final class D6 implements C6 {

    public static final P2<Boolean> f14699a;

    public static final P2<Double> f14700b;

    public static final P2<Long> f14701c;

    public static final P2<Long> f14702d;

    public static final P2<String> f14703e;

    static {
        M2 m22 = new M2(F2.a("com.google.android.gms.measurement"));
        f14699a = m22.e("measurement.test.boolean_flag", false);
        f14700b = m22.b("measurement.test.double_flag", -3.0d);
        f14701c = m22.c("measurement.test.int_flag", -2L);
        f14702d = m22.c("measurement.test.long_flag", -1L);
        f14703e = m22.d("measurement.test.string_flag", "---");
    }

    @Override
    public final long a() {
        return f14702d.b().longValue();
    }

    @Override
    public final boolean b() {
        return f14699a.b().booleanValue();
    }

    @Override
    public final String d() {
        return f14703e.b();
    }

    @Override
    public final double zza() {
        return f14700b.b().doubleValue();
    }

    @Override
    public final long zzb() {
        return f14701c.b().longValue();
    }
}
