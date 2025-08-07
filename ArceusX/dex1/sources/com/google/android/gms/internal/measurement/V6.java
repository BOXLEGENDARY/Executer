package com.google.android.gms.internal.measurement;

public final class V6 implements U6 {

    public static final P2<Boolean> f15055a = new M2(F2.a("com.google.android.gms.measurement")).e("measurement.integration.disable_firebase_instance_id", false);

    @Override
    public final boolean zza() {
        return true;
    }

    @Override
    public final boolean zzb() {
        return f15055a.b().booleanValue();
    }
}
