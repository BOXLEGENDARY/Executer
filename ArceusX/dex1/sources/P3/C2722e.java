package p3;

import I3.f;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import m3.InterfaceC2572c;
import m3.InterfaceC2577h;
import n3.C2644b;
import n3.C2656n;

public final class C2722e extends com.google.android.gms.common.internal.c {

    private final C2656n f22680b0;

    public C2722e(Context context, Looper looper, C2644b c2644b, C2656n c2656n, InterfaceC2572c interfaceC2572c, InterfaceC2577h interfaceC2577h) {
        super(context, looper, 270, c2644b, interfaceC2572c, interfaceC2577h);
        this.f22680b0 = c2656n;
    }

    @Override
    protected final Bundle A() {
        return this.f22680b0.b();
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override
    protected final String F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override
    protected final boolean I() {
        return true;
    }

    @Override
    public final int l() {
        return 203400000;
    }

    @Override
    protected final IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C2718a ? (C2718a) iInterfaceQueryLocalInterface : new C2718a(iBinder);
    }

    @Override
    public final Feature[] v() {
        return f.f1690b;
    }
}
