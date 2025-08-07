package K3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import l3.AbstractC2532g;
import n3.C2644b;

public final class a1 extends com.google.android.gms.common.internal.c {
    public a1(Context context, Looper looper, C2644b c2644b, AbstractC2532g.a aVar, AbstractC2532g.b bVar) {
        super(context, looper, 148, c2644b, aVar, bVar);
    }

    @Override
    protected final Bundle A() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override
    protected final String F() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override
    public final boolean S() {
        return true;
    }

    @Override
    public final int l() {
        return 13000000;
    }

    @Override
    protected final IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return iInterfaceQueryLocalInterface instanceof d1 ? (d1) iInterfaceQueryLocalInterface : new d1(iBinder);
    }

    @Override
    public final Feature[] v() {
        return new Feature[]{A3.b.f95h, A3.b.f94g};
    }
}
