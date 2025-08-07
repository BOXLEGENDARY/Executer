package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.S5;
import java.lang.reflect.InvocationTargetException;

final class N3 {

    final O3 f16440a;

    N3(O3 o32) {
        this.f16440a = o32;
    }

    final void a() {
        this.f16440a.h();
        if (this.f16440a.f16818a.F().v(this.f16440a.f16818a.c().a())) {
            this.f16440a.f16818a.F().f17090l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f16440a.f16818a.b().v().a("Detected application was in foreground");
                c(this.f16440a.f16818a.c().a(), false);
            }
        }
    }

    final void b(long j7, boolean z7) {
        this.f16440a.h();
        this.f16440a.s();
        if (this.f16440a.f16818a.F().v(j7)) {
            this.f16440a.f16818a.F().f17090l.a(true);
        }
        this.f16440a.f16818a.F().f17093o.b(j7);
        if (this.f16440a.f16818a.F().f17090l.b()) {
            c(j7, z7);
        }
    }

    final void c(long j7, boolean z7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f16440a.h();
        if (this.f16440a.f16818a.o()) {
            this.f16440a.f16818a.F().f17093o.b(j7);
            this.f16440a.f16818a.b().v().b("Session started, time", Long.valueOf(this.f16440a.f16818a.c().b()));
            long j8 = j7 / 1000;
            this.f16440a.f16818a.I().N("auto", "_sid", Long.valueOf(j8), j7);
            this.f16440a.f16818a.F().f17090l.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j8);
            if (this.f16440a.f16818a.z().B(null, Y0.f16617f0) && z7) {
                bundle.putLong("_aib", 1L);
            }
            this.f16440a.f16818a.I().v("auto", "_s", j7, bundle);
            S5.b();
            if (this.f16440a.f16818a.z().B(null, Y0.f16625j0)) {
                String strA = this.f16440a.f16818a.F().f17098t.a();
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strA);
                this.f16440a.f16818a.I().v("auto", "_ssr", j7, bundle2);
            }
        }
    }
}
