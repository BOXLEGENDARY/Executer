package j3;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import l3.AbstractC2532g;
import n3.C2644b;

public final class C2498g extends com.google.android.gms.common.internal.c {

    private final GoogleSignInOptions f21136b0;

    public C2498g(Context context, Looper looper, C2644b c2644b, GoogleSignInOptions googleSignInOptions, AbstractC2532g.a aVar, AbstractC2532g.b bVar) {
        super(context, looper, 91, c2644b, aVar, bVar);
        GoogleSignInOptions.a aVar2 = googleSignInOptions != null ? new GoogleSignInOptions.a(googleSignInOptions) : new GoogleSignInOptions.a();
        aVar2.e(G3.r.a());
        if (!c2644b.d().isEmpty()) {
            Iterator<Scope> it = c2644b.d().iterator();
            while (it.hasNext()) {
                aVar2.d(it.next(), new Scope[0]);
            }
        }
        this.f21136b0 = aVar2.a();
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override
    protected final String F() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override
    public final int l() {
        return 12451000;
    }

    public final GoogleSignInOptions m0() {
        return this.f21136b0;
    }

    @Override
    protected final IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof s ? (s) iInterfaceQueryLocalInterface : new s(iBinder);
    }
}
