package com.google.android.gms.internal.measurement;

public final class U5 implements T5 {

    public static final P2<Boolean> f15050a = new M2(F2.a("com.google.android.gms.measurement")).e("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override
    public final boolean zza() {
        return true;
    }

    @Override
    public final boolean zzb() {
        return f15050a.b().booleanValue();
    }
}
