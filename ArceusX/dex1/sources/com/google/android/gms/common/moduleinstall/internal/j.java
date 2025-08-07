package com.google.android.gms.common.moduleinstall.internal;

import I3.k;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import m3.InterfaceC2572c;
import m3.InterfaceC2577h;
import n3.C2644b;

public final class j extends com.google.android.gms.common.internal.c {
    protected j(Context context, Looper looper, C2644b c2644b, InterfaceC2572c interfaceC2572c, InterfaceC2577h interfaceC2577h) {
        super(context, looper, 308, c2644b, interfaceC2572c, interfaceC2577h);
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override
    protected final String F() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override
    protected final boolean I() {
        return true;
    }

    @Override
    public final boolean S() {
        return true;
    }

    @Override
    public final int l() {
        return 17895000;
    }

    @Override
    protected final IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder);
    }

    @Override
    public final Feature[] v() {
        return k.f1694b;
    }
}
