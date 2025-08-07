package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.appcompat.app.FN.krlBPZZeK;
import java.lang.reflect.InvocationTargetException;

final class I3 implements Runnable {

    final long f16335d;

    final long f16336e;

    final J3 f16337i;

    I3(J3 j32, long j7, long j8) {
        this.f16337i = j32;
        this.f16335d = j7;
        this.f16336e = j8;
    }

    @Override
    public final void run() throws IllegalStateException {
        this.f16337i.f16350b.f16818a.a().z(new Runnable() {
            @Override
            public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                I3 i32 = this.f16325d;
                J3 j32 = i32.f16337i;
                long j7 = i32.f16335d;
                long j8 = i32.f16336e;
                j32.f16350b.h();
                j32.f16350b.f16818a.b().q().a(krlBPZZeK.zlbDxfiFI);
                boolean z7 = true;
                j32.f16350b.f16818a.F().f17095q.a(true);
                Bundle bundle = new Bundle();
                if (!j32.f16350b.f16818a.z().D()) {
                    j32.f16350b.f16453e.b(j8);
                    if (j32.f16350b.f16818a.z().B(null, Y0.f16621h0)) {
                        M3 m32 = j32.f16350b.f16453e;
                        long j9 = m32.f16387b;
                        m32.f16387b = j8;
                        bundle.putLong("_et", j8 - j9);
                        i4.x(j32.f16350b.f16818a.K().t(true), bundle, true);
                    } else {
                        z7 = false;
                    }
                    j32.f16350b.f16453e.d(false, z7, j8);
                }
                j32.f16350b.f16818a.I().v("auto", "_ab", j7, bundle);
            }
        });
    }
}
