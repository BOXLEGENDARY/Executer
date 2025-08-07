package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.internal.C1804d;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import s3.AbstractBinderC2876f;

final class b extends AbstractBinderC2876f {

    private final C1804d f14378d;

    public b(C1804d c1804d) {
        this.f14378d = c1804d;
    }

    @Override
    public final void G5(ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        this.f14378d.c(new a(this, moduleInstallStatusUpdate));
    }
}
