package K3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.appsflyer.R;
import l3.AbstractC2532g;
import n3.C2644b;
import w7.Jld.EZYiRMRTxKdo;

public final class C0459d extends com.google.android.gms.common.internal.c {
    public C0459d(Context context, Looper looper, C2644b c2644b, AbstractC2532g.a aVar, AbstractC2532g.b bVar) {
        super(context, looper, R.styleable.AppCompatTheme_windowActionModeOverlay, c2644b, aVar, bVar);
    }

    @Override
    protected final Bundle A() {
        Bundle bundle = new Bundle();
        bundle.putString(EZYiRMRTxKdo.VHmVhFlK, "com.google.android.gms.fido.u2f.zeroparty.START");
        return bundle;
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService";
    }

    @Override
    protected final String F() {
        return "com.google.android.gms.fido.u2f.zeroparty.START";
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
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
        return iInterfaceQueryLocalInterface instanceof e1 ? (e1) iInterfaceQueryLocalInterface : new e1(iBinder);
    }
}
