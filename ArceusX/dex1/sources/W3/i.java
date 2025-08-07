package W3;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C2234j1;
import com.google.android.gms.measurement.internal.N1;
import n3.C2651i;
import t4.gYZ.uCYQMIHsy;

public final class i {

    private final h f7648a;

    public i(h hVar) {
        C2651i.l(hVar);
        this.f7648a = hVar;
    }

    public final void a(Context context, Intent intent) {
        N1 n1H = N1.H(context, null, null);
        C2234j1 c2234j1B = n1H.b();
        if (intent == null) {
            c2234j1B.w().a(uCYQMIHsy.poBpfECF);
            return;
        }
        n1H.d();
        String action = intent.getAction();
        c2234j1B.v().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                c2234j1B.w().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            c2234j1B.v().a("Starting wakeful intent.");
            this.f7648a.a(context, className);
        }
    }
}
