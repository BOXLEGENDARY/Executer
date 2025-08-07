package com.google.android.gms.internal.measurement;

public final class C1974s5 implements InterfaceC1966r5 {

    public static final P2<Boolean> f15312a;

    public static final P2<Boolean> f15313b;

    public static final P2<Boolean> f15314c;

    public static final P2<Long> f15315d;

    public static final P2<Boolean> f15316e;

    public static final P2<Boolean> f15317f;

    static {
        M2 m2A = new M2(F2.a("com.google.android.gms.measurement")).a();
        f15312a = m2A.e("measurement.adid_zero.app_instance_id_fix", true);
        f15313b = m2A.e("measurement.adid_zero.service", false);
        f15314c = m2A.e("measurement.adid_zero.adid_uid", false);
        f15315d = m2A.c("measurement.id.adid_zero.service", 0L);
        f15316e = m2A.e("measurement.adid_zero.remove_lair_if_adidzero_false", true);
        f15317f = m2A.e("measurement.adid_zero.remove_lair_if_userid_cleared", true);
    }

    @Override
    public final boolean a() {
        return f15313b.b().booleanValue();
    }

    @Override
    public final boolean b() {
        return f15316e.b().booleanValue();
    }

    @Override
    public final boolean c() {
        return f15317f.b().booleanValue();
    }

    @Override
    public final boolean d() {
        return f15314c.b().booleanValue();
    }

    @Override
    public final boolean zza() {
        return true;
    }

    @Override
    public final boolean zzb() {
        return f15312a.b().booleanValue();
    }
}
