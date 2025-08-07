package E3;

import a4.C1574k;
import a4.C1576m;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.appset.zza;
import com.google.android.gms.common.C1819d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1808h;
import com.google.android.gms.tasks.Task;
import d3.C2384c;
import d3.C2387f;
import d3.InterfaceC2383b;
import l3.AbstractC2531f;
import l3.C2526a;
import l3.C2527b;
import m3.InterfaceC2578i;

public final class p extends AbstractC2531f<C2526a.d.c> implements InterfaceC2383b {

    private static final C2526a.g<d> f1089m;

    private static final C2526a.AbstractC0203a<d, C2526a.d.c> f1090n;

    private static final C2526a<C2526a.d.c> f1091o;

    private final Context f1092k;

    private final C1819d f1093l;

    static {
        C2526a.g<d> gVar = new C2526a.g<>();
        f1089m = gVar;
        n nVar = new n();
        f1090n = nVar;
        f1091o = new C2526a<>("AppSet.API", nVar, gVar);
    }

    p(Context context, C1819d c1819d) {
        super(context, f1091o, C2526a.d.f21784x, AbstractC2531f.a.f21797c);
        this.f1092k = context;
        this.f1093l = c1819d;
    }

    @Override
    public final Task<C2384c> b() {
        return this.f1093l.h(this.f1092k, 212800000) == 0 ? p(AbstractC1808h.a().d(C2387f.f20310a).b(new InterfaceC2578i() {
            @Override
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((g) ((d) obj).D()).V0(new zza(null, null), new o(this.f1087a, (C1574k) obj2));
            }
        }).c(false).e(27601).a()) : C1576m.e(new C2527b(new Status(17)));
    }
}
