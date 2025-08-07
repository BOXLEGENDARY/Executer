package m3;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
import l3.AbstractC2532g;
import l3.C2526a;
import n3.C2644b;
import n3.C2651i;

public final class BinderC2564E extends Y3.a implements AbstractC2532g.a, AbstractC2532g.b {

    private static final C2526a.AbstractC0203a f21993A = X3.e.f7919c;

    private final Context f21994d;

    private final Handler f21995e;

    private final C2526a.AbstractC0203a f21996i;

    private final Set f21997v;

    private final C2644b f21998w;

    private X3.f f21999y;

    private InterfaceC2563D f22000z;

    public BinderC2564E(Context context, Handler handler, C2644b c2644b) {
        C2526a.AbstractC0203a abstractC0203a = f21993A;
        this.f21994d = context;
        this.f21995e = handler;
        this.f21998w = (C2644b) C2651i.m(c2644b, "ClientSettings must not be null");
        this.f21997v = c2644b.g();
        this.f21996i = abstractC0203a;
    }

    static void S5(BinderC2564E binderC2564E, zak zakVar) {
        ConnectionResult connectionResultL = zakVar.l();
        if (connectionResultL.q()) {
            zav zavVar = (zav) C2651i.l(zakVar.n());
            ConnectionResult connectionResultL2 = zavVar.l();
            if (!connectionResultL2.q()) {
                String strValueOf = String.valueOf(connectionResultL2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                binderC2564E.f22000z.b(connectionResultL2);
                binderC2564E.f21999y.i();
                return;
            }
            binderC2564E.f22000z.c(zavVar.n(), binderC2564E.f21997v);
        } else {
            binderC2564E.f22000z.b(connectionResultL);
        }
        binderC2564E.f21999y.i();
    }

    @Override
    public final void E0(int i7) {
        this.f22000z.d(i7);
    }

    public final void M6() {
        X3.f fVar = this.f21999y;
        if (fVar != null) {
            fVar.i();
        }
    }

    @Override
    public final void O0(ConnectionResult connectionResult) {
        this.f22000z.b(connectionResult);
    }

    @Override
    public final void V0(Bundle bundle) {
        this.f21999y.b(this);
    }

    @Override
    public final void h2(zak zakVar) {
        this.f21995e.post(new RunnableC2562C(this, zakVar));
    }

    public final void w6(InterfaceC2563D interfaceC2563D) {
        X3.f fVar = this.f21999y;
        if (fVar != null) {
            fVar.i();
        }
        this.f21998w.k(Integer.valueOf(System.identityHashCode(this)));
        C2526a.AbstractC0203a abstractC0203a = this.f21996i;
        Context context = this.f21994d;
        Handler handler = this.f21995e;
        C2644b c2644b = this.f21998w;
        this.f21999y = abstractC0203a.a(context, handler.getLooper(), c2644b, c2644b.h(), this, this);
        this.f22000z = interfaceC2563D;
        Set set = this.f21997v;
        if (set == null || set.isEmpty()) {
            this.f21995e.post(new RunnableC2561B(this));
        } else {
            this.f21999y.p();
        }
    }
}
