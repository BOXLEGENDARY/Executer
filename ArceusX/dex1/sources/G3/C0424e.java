package G3;

import a4.C1574k;
import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.internal.AbstractC1808h;
import com.google.android.gms.tasks.Task;
import f3.InterfaceC2441a;
import l3.AbstractC2531f;
import l3.C2526a;
import m3.InterfaceC2578i;
import n3.C2651i;

public final class C0424e extends AbstractC2531f implements InterfaceC2441a {

    private static final C2526a.g f1335l;

    private static final C2526a.AbstractC0203a f1336m;

    private static final C2526a f1337n;

    private final String f1338k;

    static {
        C2526a.g gVar = new C2526a.g();
        f1335l = gVar;
        C0422c c0422c = new C0422c();
        f1336m = c0422c;
        f1337n = new C2526a("Auth.Api.Identity.CredentialSaving.API", c0422c, gVar);
    }

    public C0424e(Activity activity, f3.e eVar) {
        super(activity, (C2526a<f3.e>) f1337n, eVar, AbstractC2531f.a.f21797c);
        this.f1338k = r.a();
    }

    @Override
    public final Task<SavePasswordResult> f(SavePasswordRequest savePasswordRequest) {
        C2651i.l(savePasswordRequest);
        SavePasswordRequest.a aVarO = SavePasswordRequest.o(savePasswordRequest);
        aVarO.c(this.f1338k);
        final SavePasswordRequest savePasswordRequestA = aVarO.a();
        return p(AbstractC1808h.a().d(q.f1359e).b(new InterfaceC2578i() {
            @Override
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((A) ((x) obj).D()).V0(new BinderC0423d(this.f1332a, (C1574k) obj2), (SavePasswordRequest) C2651i.l(savePasswordRequestA));
            }
        }).c(false).e(1536).a());
    }
}
