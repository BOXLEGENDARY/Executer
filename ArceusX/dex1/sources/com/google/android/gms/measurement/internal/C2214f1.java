package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.b;

public final class C2214f1 extends com.google.android.gms.common.internal.b<W3.d> {
    public C2214f1(Context context, Looper looper, b.a aVar, b.InterfaceC0152b interfaceC0152b) {
        super(context, looper, 93, aVar, interfaceC0152b, null);
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override
    protected final String F() {
        return "com.google.android.gms.measurement.START";
    }

    @Override
    public final int l() {
        return 12451000;
    }

    @Override
    public final IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof W3.d ? (W3.d) iInterfaceQueryLocalInterface : new Z0(iBinder);
    }
}
