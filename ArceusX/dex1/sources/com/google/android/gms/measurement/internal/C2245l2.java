package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcl;
import n3.C2651i;

public final class C2245l2 {

    final Context f16884a;

    String f16885b;

    String f16886c;

    String f16887d;

    Boolean f16888e;

    long f16889f;

    zzcl f16890g;

    boolean f16891h;

    final Long f16892i;

    String f16893j;

    public C2245l2(Context context, zzcl zzclVar, Long l7) {
        this.f16891h = true;
        C2651i.l(context);
        Context applicationContext = context.getApplicationContext();
        C2651i.l(applicationContext);
        this.f16884a = applicationContext;
        this.f16892i = l7;
        if (zzclVar != null) {
            this.f16890g = zzclVar;
            this.f16885b = zzclVar.f15394y;
            this.f16886c = zzclVar.f15393w;
            this.f16887d = zzclVar.f15392v;
            this.f16891h = zzclVar.f15391i;
            this.f16889f = zzclVar.f15390e;
            this.f16893j = zzclVar.f15388A;
            Bundle bundle = zzclVar.f15395z;
            if (bundle != null) {
                this.f16888e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
