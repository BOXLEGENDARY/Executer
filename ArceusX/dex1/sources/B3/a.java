package B3;

import K3.Z0;
import K3.a1;
import K3.d1;
import a4.C1574k;
import android.app.Activity;
import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.AbstractC1808h;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.tasks.Task;
import l3.AbstractC2531f;
import l3.C2526a;
import m3.C2570a;
import m3.InterfaceC2578i;

public class a extends AbstractC2531f<C2526a.d.c> {

    private static final C2526a.g f353k;

    private static final C2526a f354l;

    static {
        C2526a.g gVar = new C2526a.g();
        f353k = gVar;
        f354l = new C2526a("Fido.FIDO2_API", new Z0(), gVar);
    }

    @Deprecated
    public a(Activity activity) {
        super(activity, (C2526a<C2526a.d.c>) f354l, C2526a.d.f21784x, new C2570a());
    }

    public Task<PendingIntent> E(final PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        return p(AbstractC1808h.a().b(new InterfaceC2578i() {
            @Override
            public final void accept(Object obj, Object obj2) throws RemoteException {
                a aVar = this.f355a;
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions2 = publicKeyCredentialCreationOptions;
                ((d1) ((a1) obj).D()).V0(new c(aVar, (C1574k) obj2), publicKeyCredentialCreationOptions2);
            }
        }).e(5407).a());
    }
}
