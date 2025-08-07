package com.google.android.gms.internal.measurement;

import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;

public final class C1998v5 implements InterfaceC1990u5 {

    public static final P2<Boolean> f15363a;

    public static final P2<Boolean> f15364b;

    static {
        M2 m22 = new M2(F2.a(wtzgsqRsIZB.mXsOvapIkrPt));
        f15363a = m22.e("measurement.androidId.delete_feature", true);
        f15364b = m22.e("measurement.log_androidId_enabled", false);
    }

    @Override
    public final boolean zza() {
        return f15363a.b().booleanValue();
    }
}
