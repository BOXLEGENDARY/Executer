package com.google.android.gms.common.moduleinstall.internal;

import a4.C1574k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1805e;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import java.util.concurrent.atomic.AtomicReference;
import m3.m;
import r3.InterfaceC2743a;
import s3.BinderC2871a;

final class g extends BinderC2871a {

    final AtomicReference f14386d;

    final C1574k f14387e;

    final InterfaceC2743a f14388i;

    final i f14389v;

    g(i iVar, AtomicReference atomicReference, C1574k c1574k, InterfaceC2743a interfaceC2743a) {
        this.f14389v = iVar;
        this.f14386d = atomicReference;
        this.f14387e = c1574k;
        this.f14388i = interfaceC2743a;
    }

    @Override
    public final void W3(Status status, ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.f14386d.set(moduleInstallResponse);
        }
        m.c(status, null, this.f14387e);
        if (!status.r() || (moduleInstallResponse != null && moduleInstallResponse.n())) {
            this.f14389v.r(C1805e.c(this.f14388i, InterfaceC2743a.class.getSimpleName()), 27306);
        }
    }
}
