package G3;

import a4.C1574k;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1808h;
import com.google.android.gms.common.api.internal.C1803c;
import com.google.android.gms.tasks.Task;
import f3.InterfaceC2443c;
import java.util.Iterator;
import l3.AbstractC2531f;
import l3.AbstractC2532g;
import l3.C2526a;
import l3.C2527b;
import m3.InterfaceC2578i;
import n3.C2651i;
import o3.C2680c;

public final class o extends AbstractC2531f implements InterfaceC2443c {

    private static final C2526a.g f1350l;

    private static final C2526a.AbstractC0203a f1351m;

    private static final C2526a f1352n;

    private final String f1353k;

    static {
        C2526a.g gVar = new C2526a.g();
        f1350l = gVar;
        j jVar = new j();
        f1351m = jVar;
        f1352n = new C2526a("Auth.Api.Identity.SignIn.API", jVar, gVar);
    }

    public o(Activity activity, f3.h hVar) {
        super(activity, (C2526a<f3.h>) f1352n, hVar, AbstractC2531f.a.f21797c);
        this.f1353k = r.a();
    }

    final void E(GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, p pVar, C1574k c1574k) throws RemoteException {
        ((H) pVar.D()).h3(new n(this, c1574k), getPhoneNumberHintIntentRequest, this.f1353k);
    }

    final void F(p pVar, C1574k c1574k) throws RemoteException {
        ((H) pVar.D()).S5(new l(this, c1574k), this.f1353k);
    }

    @Override
    public final Task<PendingIntent> a(GetSignInIntentRequest getSignInIntentRequest) {
        C2651i.l(getSignInIntentRequest);
        GetSignInIntentRequest.a aVarR = GetSignInIntentRequest.r(getSignInIntentRequest);
        aVarR.f(this.f1353k);
        final GetSignInIntentRequest getSignInIntentRequestA = aVarR.a();
        return p(AbstractC1808h.a().d(q.f1360f).b(new InterfaceC2578i() {
            @Override
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((H) ((p) obj).D()).n3(new m(this.f1344a, (C1574k) obj2), (GetSignInIntentRequest) C2651i.l(getSignInIntentRequestA));
            }
        }).e(1555).a());
    }

    @Override
    public final SignInCredential e(Intent intent) throws C2527b {
        if (intent == null) {
            throw new C2527b(Status.f14054A);
        }
        Status status = (Status) C2680c.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new C2527b(Status.f14056C);
        }
        if (!status.r()) {
            throw new C2527b(status);
        }
        SignInCredential signInCredential = (SignInCredential) C2680c.b(intent, "sign_in_credential", SignInCredential.CREATOR);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new C2527b(Status.f14054A);
    }

    @Override
    public final String g(Intent intent) throws C2527b {
        if (intent == null) {
            throw new C2527b(Status.f14054A);
        }
        Status status = (Status) C2680c.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new C2527b(Status.f14056C);
        }
        if (!status.r()) {
            throw new C2527b(status);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new C2527b(Status.f14054A);
    }

    @Override
    public final Task<PendingIntent> i(final GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest) {
        C2651i.l(getPhoneNumberHintIntentRequest);
        return p(AbstractC1808h.a().d(q.f1362h).b(new InterfaceC2578i() {
            @Override
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.f1339a.E(getPhoneNumberHintIntentRequest, (p) obj, (C1574k) obj2);
            }
        }).e(1653).a());
    }

    @Override
    public final Task<Void> j() {
        v().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Iterator<AbstractC2532g> it = AbstractC2532g.b().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        C1803c.a();
        return t(AbstractC1808h.a().d(q.f1356b).b(new InterfaceC2578i() {
            @Override
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.f1341a.F((p) obj, (C1574k) obj2);
            }
        }).c(false).e(1554).a());
    }

    @Override
    public final Task<BeginSignInResult> k(BeginSignInRequest beginSignInRequest) {
        C2651i.l(beginSignInRequest);
        BeginSignInRequest.a aVarT = BeginSignInRequest.t(beginSignInRequest);
        aVarT.h(this.f1353k);
        final BeginSignInRequest beginSignInRequestA = aVarT.a();
        return p(AbstractC1808h.a().d(new Feature("auth_api_credentials_begin_sign_in", 8L)).b(new InterfaceC2578i() {
            @Override
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((H) ((p) obj).D()).V0(new k(this.f1342a, (C1574k) obj2), (BeginSignInRequest) C2651i.l(beginSignInRequestA));
            }
        }).c(false).e(1553).a());
    }

    public o(Context context, f3.h hVar) {
        super(context, (C2526a<f3.h>) f1352n, hVar, AbstractC2531f.a.f21797c);
        this.f1353k = r.a();
    }
}
