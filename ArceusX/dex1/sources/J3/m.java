package j3;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1803c;
import java.util.Iterator;
import l3.AbstractC2532g;
import l3.AbstractC2535j;
import l3.C2536k;
import q3.C2732a;

public final class m {

    private static final C2732a f21139a = new C2732a("GoogleSignInCommon", new String[0]);

    public static AbstractC2535j a(AbstractC2532g abstractC2532g, Context context, boolean z7) {
        f21139a.a("Revoking access", new Object[0]);
        String strE = C2493b.b(context).e();
        c(context);
        return z7 ? RunnableC2495d.a(strE) : abstractC2532g.a(new k(abstractC2532g));
    }

    public static AbstractC2535j b(AbstractC2532g abstractC2532g, Context context, boolean z7) {
        f21139a.a("Signing out", new Object[0]);
        c(context);
        return z7 ? C2536k.b(Status.f14060y, abstractC2532g) : abstractC2532g.a(new C2500i(abstractC2532g));
    }

    private static void c(Context context) {
        n.a(context).b();
        Iterator<AbstractC2532g> it = AbstractC2532g.b().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        C1803c.a();
    }
}
