package R3;

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
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import n3.C2648f;
import o5.C2686c;
import o5.C2690g;

public final class C1130n6 {

    private static P f5722k;

    private static final S f5723l = S.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    private final String f5724a;

    private final String f5725b;

    private final InterfaceC1122m6 f5726c;

    private final o5.n f5727d;

    private final Task f5728e;

    private final Task f5729f;

    private final String f5730g;

    private final int f5731h;

    private final Map f5732i = new HashMap();

    private final Map f5733j = new HashMap();

    public C1130n6(Context context, final o5.n nVar, InterfaceC1122m6 interfaceC1122m6, String str) {
        this.f5724a = context.getPackageName();
        this.f5725b = C2686c.a(context);
        this.f5727d = nVar;
        this.f5726c = interfaceC1122m6;
        z6.a();
        this.f5730g = str;
        this.f5728e = C2690g.a().b(new Callable() {
            @Override
            public final Object call() {
                return this.f5530d.b();
            }
        });
        C2690g c2690gA = C2690g.a();
        nVar.getClass();
        this.f5729f = c2690gA.b(new Callable() {
            @Override
            public final Object call() {
                return nVar.a();
            }
        });
        S s7 = f5723l;
        this.f5731h = s7.containsKey(str) ? DynamiteModule.c(context, (String) s7.get(str)) : -1;
    }

    static long a(List list, double d7) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d7 / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    private static synchronized P i() {
        try {
            P p7 = f5722k;
            if (p7 != null) {
                return p7;
            }
            u0.i iVarA = u0.f.a(Resources.getSystem().getConfiguration());
            M m7 = new M();
            for (int i7 = 0; i7 < iVarA.f(); i7++) {
                m7.c(C2686c.b(iVarA.c(i7)));
            }
            P pD = m7.d();
            f5722k = pD;
            return pD;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final String j() {
        return this.f5728e.o() ? (String) this.f5728e.k() : C2648f.a().b(this.f5730g);
    }

    private final boolean k(B4 b42, long j7, long j8) {
        return this.f5732i.get(b42) == null || j7 - ((Long) this.f5732i.get(b42)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    final String b() throws Exception {
        return C2648f.a().b(this.f5730g);
    }

    final void c(InterfaceC1034b6 interfaceC1034b6, B4 b42, String str) {
        interfaceC1034b6.b(b42);
        String strD = interfaceC1034b6.d();
        D5 d52 = new D5();
        d52.b(this.f5724a);
        d52.c(this.f5725b);
        d52.h(i());
        d52.g(Boolean.TRUE);
        d52.l(strD);
        d52.j(str);
        d52.i(this.f5729f.o() ? (String) this.f5729f.k() : this.f5727d.a());
        d52.d(10);
        d52.k(Integer.valueOf(this.f5731h));
        interfaceC1034b6.c(d52);
        this.f5726c.a(interfaceC1034b6);
    }

    public final void d(InterfaceC1034b6 interfaceC1034b6, B4 b42) {
        e(interfaceC1034b6, b42, j());
    }

    public final void e(final InterfaceC1034b6 interfaceC1034b6, final B4 b42, final String str) {
        C2690g.d().execute(new Runnable() {
            @Override
            public final void run() {
                this.f5571d.c(interfaceC1034b6, b42, str);
            }
        });
    }

    public final void f(InterfaceC1114l6 interfaceC1114l6, B4 b42) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(b42, jElapsedRealtime, 30L)) {
            this.f5732i.put(b42, Long.valueOf(jElapsedRealtime));
            e(interfaceC1114l6.zza(), b42, j());
        }
    }

    final void g(B4 b42, com.google.mlkit.vision.face.internal.f fVar) {
        V v7 = (V) this.f5733j.get(b42);
        if (v7 != null) {
            for (Object obj : v7.o()) {
                ArrayList arrayList = new ArrayList(v7.a(obj));
                Collections.sort(arrayList);
                C1024a4 c1024a4 = new C1024a4();
                Iterator it = arrayList.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                c1024a4.a(Long.valueOf(jLongValue / arrayList.size()));
                c1024a4.c(Long.valueOf(a(arrayList, 100.0d)));
                c1024a4.f(Long.valueOf(a(arrayList, 75.0d)));
                c1024a4.d(Long.valueOf(a(arrayList, 50.0d)));
                c1024a4.b(Long.valueOf(a(arrayList, 25.0d)));
                c1024a4.e(Long.valueOf(a(arrayList, 0.0d)));
                e(fVar.a(obj, arrayList.size(), c1024a4.g()), b42, j());
            }
            this.f5733j.remove(b42);
        }
    }

    final void h(final B4 b42, Object obj, long j7, final com.google.mlkit.vision.face.internal.f fVar) {
        if (!this.f5733j.containsKey(b42)) {
            this.f5733j.put(b42, C1170t.r());
        }
        ((V) this.f5733j.get(b42)).b(obj, Long.valueOf(j7));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(b42, jElapsedRealtime, 30L)) {
            this.f5732i.put(b42, Long.valueOf(jElapsedRealtime));
            final byte[] bArr = null;
            C2690g.d().execute(new Runnable(b42, fVar, bArr) {

                public final B4 f5624e;

                public final com.google.mlkit.vision.face.internal.f f5625i;

                @Override
                public final void run() {
                    this.f5623d.g(this.f5624e, this.f5625i);
                }
            });
        }
    }
}
