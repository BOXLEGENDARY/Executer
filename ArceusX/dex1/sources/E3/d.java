package E3;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import d3.C2387f;
import m3.InterfaceC2572c;
import m3.InterfaceC2577h;
import n3.C2644b;

public final class d extends com.google.android.gms.common.internal.c<g> {
    protected d(Context context, Looper looper, C2644b c2644b, InterfaceC2572c interfaceC2572c, InterfaceC2577h interfaceC2577h) {
        super(context, looper, 300, c2644b, interfaceC2572c, interfaceC2577h);
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override
    protected final String F() {
        return "com.google.android.gms.appset.service.START";
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
        return 212800000;
    }

    @Override
    protected final IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override
    public final Feature[] v() {
        return C2387f.f20311b;
    }
}
