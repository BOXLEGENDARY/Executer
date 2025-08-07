package com.google.android.gms.internal.measurement;

public final class M6 implements L6 {

    public static final P2<Boolean> f14898a = new M2(F2.a("com.google.android.gms.measurement")).e("measurement.scheduler.task_thread.cleanup_on_exit", false);

    @Override
    public final boolean zza() {
        return f14898a.b().booleanValue();
    }
}
