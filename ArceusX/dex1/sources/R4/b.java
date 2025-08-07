package R4;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.W0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import n3.C2651i;

public class b implements a {

    private static volatile a f6065c;

    final V3.a f6066a;

    final Map<String, Object> f6067b;

    b(V3.a aVar) {
        C2651i.l(aVar);
        this.f6066a = aVar;
        this.f6067b = new ConcurrentHashMap();
    }

    public static a c(Q4.c cVar, Context context, Y4.d dVar) {
        C2651i.l(cVar);
        C2651i.l(context);
        C2651i.l(dVar);
        C2651i.l(context.getApplicationContext());
        if (f6065c == null) {
            synchronized (b.class) {
                try {
                    if (f6065c == null) {
                        Bundle bundle = new Bundle(1);
                        if (cVar.r()) {
                            dVar.b(Q4.a.class, new Executor() {
                                @Override
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new Y4.b() {
                                @Override
                                public final void a(Y4.a aVar) {
                                    b.d(aVar);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", cVar.q());
                        }
                        f6065c = new b(W0.t(context, null, null, null, bundle).q());
                    }
                } finally {
                }
            }
        }
        return f6065c;
    }

    static void d(Y4.a aVar) {
        boolean z7 = ((Q4.a) aVar.a()).f4844a;
        synchronized (b.class) {
            ((b) C2651i.l(f6065c)).f6066a.u(z7);
        }
    }

    @Override
    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.d(str) && com.google.firebase.analytics.connector.internal.b.c(str2, bundle) && com.google.firebase.analytics.connector.internal.b.b(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.b.a(str, str2, bundle);
            this.f6066a.n(str, str2, bundle);
        }
    }

    @Override
    public void b(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.d(str) && com.google.firebase.analytics.connector.internal.b.e(str, str2)) {
            this.f6066a.t(str, str2, obj);
        }
    }
}
