package com.google.android.gms.internal.location;

import U3.s;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import l3.AbstractC2532g;
import n3.C2644b;

public class m extends com.google.android.gms.common.internal.c<M3.d> {

    private final String f14617b0;

    protected final M3.g<M3.d> f14618c0;

    public m(Context context, Looper looper, AbstractC2532g.a aVar, AbstractC2532g.b bVar, String str, C2644b c2644b) {
        super(context, looper, 23, c2644b, aVar, bVar);
        this.f14618c0 = new l(this);
        this.f14617b0 = str;
    }

    @Override
    protected final Bundle A() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f14617b0);
        return bundle;
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override
    protected final String F() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override
    public final int l() {
        return 11717000;
    }

    @Override
    protected final IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof M3.d ? (M3.d) iInterfaceQueryLocalInterface : new b(iBinder);
    }

    @Override
    public final Feature[] v() {
        return s.f7506f;
    }
}
