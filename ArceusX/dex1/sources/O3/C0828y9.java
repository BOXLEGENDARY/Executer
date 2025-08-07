package O3;

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

public final class C0828y9 {

    private static AbstractC0633h0 f3663k;

    private static final AbstractC0655j0 f3664l = AbstractC0655j0.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    private final String f3665a;

    private final String f3666b;

    private final InterfaceC0719o9 f3667c;

    private final o5.n f3668d;

    private final Task f3669e;

    private final Task f3670f;

    private final String f3671g;

    private final int f3672h;

    private final Map f3673i = new HashMap();

    private final Map f3674j = new HashMap();

    public C0828y9(Context context, final o5.n nVar, InterfaceC0719o9 interfaceC0719o9, String str) {
        this.f3665a = context.getPackageName();
        this.f3666b = C2686c.a(context);
        this.f3668d = nVar;
        this.f3667c = interfaceC0719o9;
        L9.a();
        this.f3671g = str;
        this.f3669e = C2690g.a().b(new Callable() {
            @Override
            public final Object call() {
                return this.f3599d.b();
            }
        });
        C2690g c2690gA = C2690g.a();
        Objects.requireNonNull(nVar);
        this.f3670f = c2690gA.b(new Callable() {
            @Override
            public final Object call() {
                return nVar.a();
            }
        });
        AbstractC0655j0 abstractC0655j0 = f3664l;
        this.f3672h = abstractC0655j0.containsKey(str) ? DynamiteModule.c(context, (String) abstractC0655j0.get(str)) : -1;
    }

    static long a(List list, double d7) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d7 / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    private static synchronized AbstractC0633h0 i() {
        try {
            AbstractC0633h0 abstractC0633h0 = f3663k;
            if (abstractC0633h0 != null) {
                return abstractC0633h0;
            }
            u0.i iVarA = u0.f.a(Resources.getSystem().getConfiguration());
            C0600e0 c0600e0 = new C0600e0();
            for (int i7 = 0; i7 < iVarA.f(); i7++) {
                c0600e0.e(C2686c.b(iVarA.c(i7)));
            }
            AbstractC0633h0 abstractC0633h0G = c0600e0.g();
            f3663k = abstractC0633h0G;
            return abstractC0633h0G;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final String j() {
        if (this.f3669e.o()) {
            return (String) this.f3669e.k();
        }
        return C2648f.a().b(this.f3671g);
    }

    private final boolean k(N6 n62, long j7, long j8) {
        return this.f3673i.get(n62) == null || j7 - ((Long) this.f3673i.get(n62)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    final String b() throws Exception {
        return C2648f.a().b(this.f3671g);
    }

    final void c(InterfaceC0708n9 interfaceC0708n9, N6 n62, String str) {
        interfaceC0708n9.b(n62);
        String strD = interfaceC0708n9.d();
        J8 j8 = new J8();
        j8.b(this.f3665a);
        j8.c(this.f3666b);
        j8.h(i());
        j8.g(Boolean.TRUE);
        j8.l(strD);
        j8.j(str);
        j8.i(this.f3670f.o() ? (String) this.f3670f.k() : this.f3668d.a());
        j8.d(10);
        j8.k(Integer.valueOf(this.f3672h));
        interfaceC0708n9.c(j8);
        this.f3667c.a(interfaceC0708n9);
    }

    public final void d(InterfaceC0708n9 interfaceC0708n9, N6 n62) {
        e(interfaceC0708n9, n62, j());
    }

    public final void e(final InterfaceC0708n9 interfaceC0708n9, final N6 n62, final String str) {
        C2690g.d().execute(new Runnable() {
            @Override
            public final void run() {
                this.f3570d.c(interfaceC0708n9, n62, str);
            }
        });
    }

    public final void f(InterfaceC0817x9 interfaceC0817x9, N6 n62) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(n62, jElapsedRealtime, 30L)) {
            this.f3673i.put(n62, Long.valueOf(jElapsedRealtime));
            e(interfaceC0817x9.zza(), n62, j());
        }
    }

    final void g(N6 n62, com.google.mlkit.vision.barcode.internal.h hVar) {
        InterfaceC0688m0 interfaceC0688m0 = (InterfaceC0688m0) this.f3674j.get(n62);
        if (interfaceC0688m0 != null) {
            for (Object obj : interfaceC0688m0.C()) {
                ArrayList arrayList = new ArrayList(interfaceC0688m0.a(obj));
                Collections.sort(arrayList);
                C0694m6 c0694m6 = new C0694m6();
                Iterator it = arrayList.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                c0694m6.a(Long.valueOf(jLongValue / arrayList.size()));
                c0694m6.c(Long.valueOf(a(arrayList, 100.0d)));
                c0694m6.f(Long.valueOf(a(arrayList, 75.0d)));
                c0694m6.d(Long.valueOf(a(arrayList, 50.0d)));
                c0694m6.b(Long.valueOf(a(arrayList, 25.0d)));
                c0694m6.e(Long.valueOf(a(arrayList, 0.0d)));
                e(hVar.a(obj, arrayList.size(), c0694m6.g()), n62, j());
            }
            this.f3674j.remove(n62);
        }
    }

    final void h(final N6 n62, Object obj, long j7, final com.google.mlkit.vision.barcode.internal.h hVar) {
        if (!this.f3674j.containsKey(n62)) {
            this.f3674j.put(n62, J.m());
        }
        ((InterfaceC0688m0) this.f3674j.get(n62)).D(obj, Long.valueOf(j7));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(n62, jElapsedRealtime, 30L)) {
            this.f3673i.put(n62, Long.valueOf(jElapsedRealtime));
            C2690g.d().execute(new Runnable() {
                @Override
                public final void run() {
                    this.f3590d.g(n62, hVar);
                }
            });
        }
    }
}
