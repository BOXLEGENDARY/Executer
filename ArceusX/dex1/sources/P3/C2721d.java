package p3;

import I3.f;
import a4.C1574k;
import android.content.Context;
import android.os.RemoteException;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import com.google.android.gms.common.api.internal.AbstractC1808h;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;
import l3.AbstractC2531f;
import l3.C2526a;
import m3.InterfaceC2578i;
import n3.C2656n;
import n3.InterfaceC2655m;

public final class C2721d extends AbstractC2531f implements InterfaceC2655m {

    private static final C2526a.g f22676k;

    private static final C2526a.AbstractC0203a f22677l;

    private static final C2526a f22678m;

    public static final int f22679n = 0;

    static {
        C2526a.g gVar = new C2526a.g();
        f22676k = gVar;
        C2720c c2720c = new C2720c();
        f22677l = c2720c;
        f22678m = new C2526a(KwdswzaUHE.iMos, c2720c, gVar);
    }

    public C2721d(Context context, C2656n c2656n) {
        super(context, (C2526a<C2656n>) f22678m, c2656n, AbstractC2531f.a.f21797c);
    }

    @Override
    public final Task<Void> c(final TelemetryData telemetryData) {
        AbstractC1808h.a aVarA = AbstractC1808h.a();
        aVarA.d(f.f1689a);
        aVarA.c(false);
        aVarA.b(new InterfaceC2578i() {
            @Override
            public final void accept(Object obj, Object obj2) throws RemoteException {
                int i7 = C2721d.f22679n;
                ((C2718a) ((C2722e) obj).D()).h3(telemetryData);
                ((C1574k) obj2).c(null);
            }
        });
        return o(aVarA.a());
    }
}
