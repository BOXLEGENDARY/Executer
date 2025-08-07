package G3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import e3.C2424f;
import e3.C2425g;
import l3.AbstractC2532g;
import n3.C2644b;

public final class v extends com.google.android.gms.common.internal.c {

    private final C2425g f1366b0;

    public v(Context context, Looper looper, C2644b c2644b, C2425g c2425g, AbstractC2532g.a aVar, AbstractC2532g.b bVar) {
        super(context, looper, 68, c2644b, aVar, bVar);
        C2424f c2424f = new C2424f(c2425g == null ? C2425g.f20423v : c2425g);
        c2424f.a(r.a());
        this.f1366b0 = new C2425g(c2424f);
    }

    @Override
    protected final Bundle A() {
        return this.f1366b0.a();
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override
    protected final String F() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override
    public final int l() {
        return 12800000;
    }

    @Override
    protected final IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new w(iBinder);
    }
}
