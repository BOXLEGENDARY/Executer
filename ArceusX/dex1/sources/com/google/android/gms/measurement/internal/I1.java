package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import n3.C2651i;

final class I1 implements Thread.UncaughtExceptionHandler {

    private final String f16328a;

    final L1 f16329b;

    public I1(L1 l1, String str) {
        this.f16329b = l1;
        C2651i.l(str);
        this.f16328a = str;
    }

    @Override
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f16329b.f16818a.b().r().b(this.f16328a, th);
    }
}
