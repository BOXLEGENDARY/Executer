package G3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import m3.InterfaceC2572c;
import m3.InterfaceC2577h;
import n3.C2644b;

public final class p extends com.google.android.gms.common.internal.c {

    private final Bundle f1354b0;

    public p(Context context, Looper looper, f3.h hVar, C2644b c2644b, InterfaceC2572c interfaceC2572c, InterfaceC2577h interfaceC2577h) {
        super(context, looper, 212, c2644b, interfaceC2572c, interfaceC2577h);
        this.f1354b0 = new Bundle();
    }

    @Override
    protected final Bundle A() {
        return this.f1354b0;
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override
    protected final String F() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
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
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof H ? (H) iInterfaceQueryLocalInterface : new H(iBinder);
    }

    @Override
    public final Feature[] v() {
        return q.f1363i;
    }
}
