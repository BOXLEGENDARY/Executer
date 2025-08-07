package o5;

import S4.C1529d;
import a4.C1575l;
import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.concurrent.Executor;
import n3.C2651i;

public class C2692i {

    private static final Object f22441b = new Object();

    private static C2692i f22442c;

    private S4.n f22443a;

    private C2692i() {
    }

    public static C2692i c() {
        C2692i c2692i;
        synchronized (f22441b) {
            C2651i.q(f22442c != null, "MlKitContext has not been initialized");
            c2692i = (C2692i) C2651i.l(f22442c);
        }
        return c2692i;
    }

    public static C2692i d(Context context) {
        C2692i c2692iE;
        synchronized (f22441b) {
            c2692iE = e(context, C1575l.f8317a);
        }
        return c2692iE;
    }

    public static C2692i e(Context context, Executor executor) {
        C2692i c2692i;
        synchronized (f22441b) {
            C2651i.q(f22442c == null, "MlKitContext is already initialized");
            C2692i c2692i2 = new C2692i();
            f22442c = c2692i2;
            Context contextF = f(context);
            S4.n nVarE = S4.n.h(executor).d(S4.g.c(contextF, MlKitComponentDiscoveryService.class).b()).b(C1529d.p(contextF, Context.class, new Class[0])).b(C1529d.p(c2692i2, C2692i.class, new Class[0])).e();
            c2692i2.f22443a = nVarE;
            nVarE.k(true);
            c2692i = f22442c;
        }
        return c2692i;
    }

    private static Context f(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public <T> T a(Class<T> cls) {
        C2651i.q(f22442c == this, "MlKitContext has been deleted");
        C2651i.l(this.f22443a);
        return (T) this.f22443a.a(cls);
    }

    public Context b() {
        return (Context) a(Context.class);
    }
}
