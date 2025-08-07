package com.google.firebase.installations;

import Z.tNT.PexNRiLSd;
import a4.C1574k;
import a4.C1576m;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.c;
import g5.d;
import g5.f;
import j5.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import n3.C2651i;

public class b implements d5.c {

    private static final Object f19095m = new Object();

    private static final ThreadFactory f19096n = new a();

    private final Q4.c f19097a;

    private final g5.c f19098b;

    private final f5.c f19099c;

    private final f f19100d;

    private final f5.b f19101e;

    private final d5.e f19102f;

    private final Object f19103g;

    private final ExecutorService f19104h;

    private final ExecutorService f19105i;

    private String f19106j;

    private Set<e5.a> f19107k;

    private final List<e> f19108l;

    class a implements ThreadFactory {

        private final AtomicInteger f19109a = new AtomicInteger(1);

        a() {
        }

        @Override
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f19109a.getAndIncrement())));
        }
    }

    static class C0170b {

        static final int[] f19110a;

        static final int[] f19111b;

        static {
            int[] iArr = new int[f.b.values().length];
            f19111b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19111b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19111b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f19110a = iArr2;
            try {
                iArr2[d.b.f20984d.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19110a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    b(Q4.c cVar, c5.b<i> bVar, c5.b<Z4.f> bVar2) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f19096n), cVar, new g5.c(cVar.h(), bVar, bVar2), new f5.c(cVar), f.c(), new f5.b(cVar), new d5.e());
    }

    private Task<String> c() {
        C1574k c1574k = new C1574k();
        d(new d(c1574k));
        return c1574k.a();
    }

    private void d(e eVar) {
        synchronized (this.f19103g) {
            this.f19108l.add(eVar);
        }
    }

    public void r(boolean z7) {
        f5.d dVarV;
        f5.d dVarN = n();
        try {
            if (dVarN.i() || dVarN.l()) {
                dVarV = v(dVarN);
            } else {
                if (!z7 && !this.f19100d.f(dVarN)) {
                    return;
                }
                dVarV = g(dVarN);
            }
            q(dVarV);
            z(dVarN, dVarV);
            if (dVarV.k()) {
                y(dVarV.d());
            }
            if (dVarV.i()) {
                w(new c(c.a.BAD_CONFIG));
            } else if (dVarV.j()) {
                w(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                x(dVarV);
            }
        } catch (c e7) {
            w(e7);
        }
    }

    private final void f(final boolean z7) {
        f5.d dVarO = o();
        if (z7) {
            dVarO = dVarO.p();
        }
        x(dVarO);
        this.f19105i.execute(new Runnable() {
            @Override
            public final void run() {
                this.f20336d.r(z7);
            }
        });
    }

    private f5.d g(f5.d dVar) throws c {
        g5.f fVarE = this.f19098b.e(h(), dVar.d(), p(), dVar.f());
        int i7 = C0170b.f19111b[fVarE.b().ordinal()];
        if (i7 == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.f19100d.b());
        }
        if (i7 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i7 != 3) {
            throw new c("Firebase Installations Service is unavailable. Please try again later.", c.a.UNAVAILABLE);
        }
        y(null);
        return dVar.r();
    }

    private synchronized String j() {
        return this.f19106j;
    }

    public static b l() {
        return m(Q4.c.i());
    }

    public static b m(Q4.c cVar) {
        C2651i.b(cVar != null, "Null is not a valid value of FirebaseApp.");
        return (b) cVar.g(d5.c.class);
    }

    private f5.d n() {
        f5.d dVarC;
        synchronized (f19095m) {
            try {
                com.google.firebase.installations.a aVarA = com.google.firebase.installations.a.a(this.f19097a.h(), "generatefid.lock");
                try {
                    dVarC = this.f19099c.c();
                    if (aVarA != null) {
                        aVarA.b();
                    }
                } catch (Throwable th) {
                    if (aVarA != null) {
                        aVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVarC;
    }

    private f5.d o() {
        f5.d dVarC;
        synchronized (f19095m) {
            try {
                com.google.firebase.installations.a aVarA = com.google.firebase.installations.a.a(this.f19097a.h(), "generatefid.lock");
                try {
                    dVarC = this.f19099c.c();
                    if (dVarC.j()) {
                        dVarC = this.f19099c.a(dVarC.t(u(dVarC)));
                    }
                    if (aVarA != null) {
                        aVarA.b();
                    }
                } catch (Throwable th) {
                    if (aVarA != null) {
                        aVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVarC;
    }

    private void q(f5.d dVar) {
        synchronized (f19095m) {
            try {
                com.google.firebase.installations.a aVarA = com.google.firebase.installations.a.a(this.f19097a.h(), PexNRiLSd.rUuYtcHaom);
                try {
                    this.f19099c.a(dVar);
                    if (aVarA != null) {
                        aVarA.b();
                    }
                } catch (Throwable th) {
                    if (aVarA != null) {
                        aVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void s() {
        f(false);
    }

    private void t() {
        C2651i.g(i(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2651i.g(p(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2651i.g(h(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2651i.b(f.h(i()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2651i.b(f.g(h()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String u(f5.d dVar) {
        if ((!this.f19097a.j().equals("CHIME_ANDROID_SDK") && !this.f19097a.r()) || !dVar.m()) {
            return this.f19102f.a();
        }
        String strF = this.f19101e.f();
        return TextUtils.isEmpty(strF) ? this.f19102f.a() : strF;
    }

    private f5.d v(f5.d dVar) throws c {
        g5.d dVarD = this.f19098b.d(h(), dVar.d(), p(), i(), (dVar.d() == null || dVar.d().length() != 11) ? null : this.f19101e.i());
        int i7 = C0170b.f19110a[dVarD.e().ordinal()];
        if (i7 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.f19100d.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i7 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new c("Firebase Installations Service is unavailable. Please try again later.", c.a.UNAVAILABLE);
    }

    private void w(Exception exc) {
        synchronized (this.f19103g) {
            try {
                Iterator<e> it = this.f19108l.iterator();
                while (it.hasNext()) {
                    if (it.next().b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void x(f5.d dVar) {
        synchronized (this.f19103g) {
            try {
                Iterator<e> it = this.f19108l.iterator();
                while (it.hasNext()) {
                    if (it.next().a(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void y(String str) {
        this.f19106j = str;
    }

    private synchronized void z(f5.d dVar, f5.d dVar2) {
        if (this.f19107k.size() != 0 && !dVar.d().equals(dVar2.d())) {
            Iterator<e5.a> it = this.f19107k.iterator();
            while (it.hasNext()) {
                it.next().a(dVar2.d());
            }
        }
    }

    String h() {
        return this.f19097a.k().b();
    }

    String i() {
        return this.f19097a.k().c();
    }

    public Task<String> k() {
        t();
        String strJ = j();
        if (strJ != null) {
            return C1576m.f(strJ);
        }
        Task<String> taskC = c();
        this.f19104h.execute(new Runnable() {
            @Override
            public final void run() {
                this.f20335d.s();
            }
        });
        return taskC;
    }

    String p() {
        return this.f19097a.k().e();
    }

    b(ExecutorService executorService, Q4.c cVar, g5.c cVar2, f5.c cVar3, f fVar, f5.b bVar, d5.e eVar) {
        this.f19103g = new Object();
        this.f19107k = new HashSet();
        this.f19108l = new ArrayList();
        this.f19097a = cVar;
        this.f19098b = cVar2;
        this.f19099c = cVar3;
        this.f19100d = fVar;
        this.f19101e = bVar;
        this.f19102f = eVar;
        this.f19104h = executorService;
        this.f19105i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f19096n);
    }
}
