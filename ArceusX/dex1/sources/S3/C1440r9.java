package S3;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import n3.C2648f;
import o5.C2686c;
import o5.C2690g;

public final class C1440r9 {

    private static M f7107k;

    private static final O f7108l = O.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    private final String f7109a;

    private final String f7110b;

    private final InterfaceC1320g9 f7111c;

    private final o5.n f7112d;

    private final Task f7113e;

    private final Task f7114f;

    private final String f7115g;

    private final int f7116h;

    private final Map f7117i = new HashMap();

    private final Map f7118j = new HashMap();

    public C1440r9(Context context, final o5.n nVar, InterfaceC1320g9 interfaceC1320g9, String str) {
        this.f7109a = context.getPackageName();
        this.f7110b = C2686c.a(context);
        this.f7112d = nVar;
        this.f7111c = interfaceC1320g9;
        D9.a();
        this.f7115g = str;
        this.f7113e = C2690g.a().b(new Callable() {
            @Override
            public final Object call() {
                return this.f7036d.b();
            }
        });
        C2690g c2690gA = C2690g.a();
        Objects.requireNonNull(nVar);
        this.f7114f = c2690gA.b(new Callable() {
            @Override
            public final Object call() {
                return nVar.a();
            }
        });
        O o2 = f7108l;
        this.f7116h = o2.containsKey(str) ? DynamiteModule.c(context, (String) o2.get(str)) : -1;
    }

    static long a(List list, double d7) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d7 / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    private static synchronized M i() {
        try {
            M m7 = f7107k;
            if (m7 != null) {
                return m7;
            }
            u0.i iVarA = u0.f.a(Resources.getSystem().getConfiguration());
            J j7 = new J();
            for (int i7 = 0; i7 < iVarA.f(); i7++) {
                j7.a(C2686c.b(iVarA.c(i7)));
            }
            M mB = j7.b();
            f7107k = mB;
            return mB;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final String j() {
        if (this.f7113e.o()) {
            return (String) this.f7113e.k();
        }
        return C2648f.a().b(this.f7115g);
    }

    private final boolean k(G6 g62, long j7, long j8) {
        return this.f7117i.get(g62) == null || j7 - ((Long) this.f7117i.get(g62)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    final String b() throws Exception {
        return C2648f.a().b(this.f7115g);
    }

    final void c(InterfaceC1309f9 interfaceC1309f9, G6 g62, String str) {
        interfaceC1309f9.c(g62);
        String strD = interfaceC1309f9.d();
        E8 e8 = new E8();
        e8.b(this.f7109a);
        e8.c(this.f7110b);
        e8.h(i());
        e8.g(Boolean.TRUE);
        e8.l(strD);
        e8.j(str);
        e8.i(this.f7114f.o() ? (String) this.f7114f.k() : this.f7112d.a());
        e8.d(10);
        e8.k(Integer.valueOf(this.f7116h));
        interfaceC1309f9.b(e8);
        this.f7111c.a(interfaceC1309f9);
    }

    public final void d(InterfaceC1309f9 interfaceC1309f9, G6 g62) {
        e(interfaceC1309f9, g62, j());
    }

    public final void e(final InterfaceC1309f9 interfaceC1309f9, final G6 g62, final String str) {
        C2690g.d().execute(new Runnable() {
            @Override
            public final void run() {
                this.f6997d.c(interfaceC1309f9, g62, str);
            }
        });
    }

    public final void f(InterfaceC1430q9 interfaceC1430q9, G6 g62) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(g62, jElapsedRealtime, 30L)) {
            this.f7117i.put(g62, Long.valueOf(jElapsedRealtime));
            e(interfaceC1430q9.zza(), g62, j());
        }
    }

    final void g(G6 g62, com.google.mlkit.vision.text.internal.o oVar) {
        S s7 = (S) this.f7118j.get(g62);
        if (s7 != null) {
            for (Object obj : s7.l()) {
                ArrayList arrayList = new ArrayList(s7.a(obj));
                Collections.sort(arrayList);
                C1295e6 c1295e6 = new C1295e6();
                Iterator it = arrayList.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                c1295e6.a(Long.valueOf(jLongValue / arrayList.size()));
                c1295e6.c(Long.valueOf(a(arrayList, 100.0d)));
                c1295e6.f(Long.valueOf(a(arrayList, 75.0d)));
                c1295e6.d(Long.valueOf(a(arrayList, 50.0d)));
                c1295e6.b(Long.valueOf(a(arrayList, 25.0d)));
                c1295e6.e(Long.valueOf(a(arrayList, 0.0d)));
                e(oVar.a(obj, arrayList.size(), c1295e6.g()), g62, j());
            }
            this.f7118j.remove(g62);
        }
    }

    final void h(final G6 g62, Object obj, long j7, final com.google.mlkit.vision.text.internal.o oVar) {
        if (!this.f7118j.containsKey(g62)) {
            this.f7118j.put(g62, C1409p.p());
        }
        ((S) this.f7118j.get(g62)).b(obj, Long.valueOf(j7));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(g62, jElapsedRealtime, 30L)) {
            this.f7117i.put(g62, Long.valueOf(jElapsedRealtime));
            C2690g.d().execute(new Runnable() {
                @Override
                public final void run() {
                    this.f7014d.g(g62, oVar);
                }
            });
        }
    }
}
