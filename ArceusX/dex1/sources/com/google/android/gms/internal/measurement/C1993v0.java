package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import n3.C2651i;
import y3.BinderC3024b;

final class C1993v0 extends M0 {

    final Bundle f15345A;

    final W0 f15346B;

    final String f15347w;

    final String f15348y;

    final Context f15349z;

    C1993v0(W0 w02, String str, String str2, Context context, Bundle bundle) {
        super(w02, true);
        this.f15346B = w02;
        this.f15347w = str;
        this.f15348y = str2;
        this.f15349z = context;
        this.f15345A = bundle;
    }

    @Override
    public final void a() {
        String str;
        String str2;
        String str3;
        try {
            W0 w02 = this.f15346B;
            if (W0.m(this.f15347w, this.f15348y)) {
                str3 = this.f15348y;
                str2 = this.f15347w;
                str = this.f15346B.f15058a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            C2651i.l(this.f15349z);
            W0 w03 = this.f15346B;
            w03.f15066i = w03.s(this.f15349z, true);
            if (this.f15346B.f15066i == null) {
                Log.w(this.f15346B.f15058a, "Failed to connect to measurement client.");
                return;
            }
            int iA = DynamiteModule.a(this.f15349z, ModuleDescriptor.MODULE_ID);
            ((InterfaceC1882h0) C2651i.l(this.f15346B.f15066i)).initialize(BinderC3024b.h3(this.f15349z), new zzcl(46000L, Math.max(iA, r0), DynamiteModule.c(this.f15349z, ModuleDescriptor.MODULE_ID) < iA, str, str2, str3, this.f15345A, W3.k.a(this.f15349z)), this.f14828d);
        } catch (Exception e7) {
            this.f15346B.j(e7, true, false);
        }
    }
}
