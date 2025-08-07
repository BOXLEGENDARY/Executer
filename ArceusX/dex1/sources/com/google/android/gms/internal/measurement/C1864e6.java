package com.google.android.gms.internal.measurement;

public final class C1864e6 implements InterfaceC1856d6 {

    public static final P2<Boolean> f15146a;

    public static final P2<Boolean> f15147b;

    public static final P2<Boolean> f15148c;

    static {
        M2 m22 = new M2(F2.a("com.google.android.gms.measurement"));
        f15146a = m22.e("measurement.client.sessions.check_on_reset_and_enable2", true);
        f15147b = m22.e("measurement.client.sessions.check_on_startup", true);
        f15148c = m22.e("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override
    public final boolean zza() {
        return true;
    }

    @Override
    public final boolean zzb() {
        return f15146a.b().booleanValue();
    }
}
