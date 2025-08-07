package com.google.firebase.iid;

import a4.C1576m;
import a4.InterfaceC1566c;
import a4.InterfaceC1573j;
import a5.InterfaceC1578a;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import w3.ThreadFactoryC2969b;

public class FirebaseInstanceId {

    private static final long f19004i = TimeUnit.HOURS.toSeconds(8);

    private static k f19005j;

    private static ScheduledExecutorService f19006k;

    private final Executor f19007a;

    private final Q4.c f19008b;

    private final a5.j f19009c;

    private final B f19010d;

    private final C2347e f19011e;

    private final n f19012f;

    private boolean f19013g;

    private final a f19014h;

    class a {

        private boolean f19015a;

        private final Y4.d f19016b;

        private boolean f19017c;

        private Y4.b<Q4.a> f19018d;

        private Boolean f19019e;

        a(Y4.d dVar) {
            this.f19016b = dVar;
        }

        private final synchronized void b() {
            try {
                if (this.f19017c) {
                    return;
                }
                this.f19015a = d();
                Boolean boolC = c();
                this.f19019e = boolC;
                if (boolC == null && this.f19015a) {
                    Y4.b<Q4.a> bVar = new Y4.b(this) {

                        private final FirebaseInstanceId.a f18994a;

                        {
                            this.f18994a = this;
                        }

                        @Override
                        public final void a(Y4.a aVar) {
                            FirebaseInstanceId.a aVar2 = this.f18994a;
                            synchronized (aVar2) {
                                try {
                                    if (aVar2.a()) {
                                        FirebaseInstanceId.this.A();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    };
                    this.f19018d = bVar;
                    this.f19016b.a(Q4.a.class, bVar);
                }
                this.f19017c = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        private final Boolean c() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextH = FirebaseInstanceId.this.f19008b.h();
            SharedPreferences sharedPreferences = contextH.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextH.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextH.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        private final boolean d() {
            try {
                int i7 = com.google.firebase.messaging.a.f19126b;
                return true;
            } catch (ClassNotFoundException unused) {
                Context contextH = FirebaseInstanceId.this.f19008b.h();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(contextH.getPackageName());
                ResolveInfo resolveInfoResolveService = contextH.getPackageManager().resolveService(intent, 0);
                return (resolveInfoResolveService == null || resolveInfoResolveService.serviceInfo == null) ? false : true;
            }
        }

        final synchronized boolean a() {
            b();
            Boolean bool = this.f19019e;
            if (bool != null) {
                return bool.booleanValue();
            }
            return this.f19015a && FirebaseInstanceId.this.f19008b.q();
        }
    }

    FirebaseInstanceId(Q4.c cVar, Y4.d dVar, j5.i iVar) {
        this(cVar, new a5.j(cVar.h()), C2343a.c(), C2343a.c(), dVar, iVar);
    }

    public final void A() {
        if (n(o()) || this.f19012f.a()) {
            B();
        }
    }

    private final synchronized void B() {
        if (!this.f19013g) {
            k(0L);
        }
    }

    private static String C() {
        return f19005j.f(BuildConfig.FLAVOR).b();
    }

    public static FirebaseInstanceId a() {
        return getInstance(Q4.c.i());
    }

    private final Task<InterfaceC1578a> f(final String str, String str2) {
        final String strU = u(str2);
        return C1576m.f(null).i(this.f19007a, new InterfaceC1566c(this, str, strU) {

            private final FirebaseInstanceId f19080a;

            private final String f19081b;

            private final String f19082c;

            {
                this.f19080a = this;
                this.f19081b = str;
                this.f19082c = strU;
            }

            @Override
            public final Object a(Task task) {
                return this.f19080a.g(this.f19081b, this.f19082c, task);
            }
        });
    }

    public static FirebaseInstanceId getInstance(Q4.c cVar) {
        return (FirebaseInstanceId) cVar.g(FirebaseInstanceId.class);
    }

    private final <T> T j(Task<T> task) throws IOException {
        try {
            return (T) C1576m.b(task, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    w();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e7);
        }
    }

    static void l(Runnable runnable, long j7) {
        synchronized (FirebaseInstanceId.class) {
            try {
                if (f19006k == null) {
                    f19006k = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC2969b("FirebaseInstanceId"));
                }
                f19006k.schedule(runnable, j7, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static j p(String str, String str2) {
        return f19005j.a(BuildConfig.FLAVOR, str, str2);
    }

    private static String u(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    static boolean v() {
        return Log.isLoggable("FirebaseInstanceId", 3);
    }

    public Task<InterfaceC1578a> b() {
        return f(a5.j.c(this.f19008b), "*");
    }

    public String c(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((InterfaceC1578a) j(f(str, str2))).a();
        }
        throw new IOException("MAIN_THREAD");
    }

    final Q4.c d() {
        return this.f19008b;
    }

    final Task g(final String str, final String str2, Task task) throws Exception {
        final String strC = C();
        j jVarP = p(str, str2);
        return !n(jVarP) ? C1576m.f(new I(strC, jVarP.f19049a)) : this.f19011e.b(str, str2, new InterfaceC2349g(this, strC, str, str2) {

            private final FirebaseInstanceId f19088a;

            private final String f19089b;

            private final String f19090c;

            private final String f19091d;

            {
                this.f19088a = this;
                this.f19089b = strC;
                this.f19090c = str;
                this.f19091d = str2;
            }

            @Override
            public final Task zza() {
                return this.f19088a.h(this.f19089b, this.f19090c, this.f19091d);
            }
        });
    }

    final Task h(final String str, final String str2, final String str3) {
        return this.f19010d.b(str, str2, str3).q(this.f19007a, new InterfaceC1573j(this, str2, str3, str) {

            private final FirebaseInstanceId f19084a;

            private final String f19085b;

            private final String f19086c;

            private final String f19087d;

            {
                this.f19084a = this;
                this.f19085b = str2;
                this.f19086c = str3;
                this.f19087d = str;
            }

            @Override
            public final Task a(Object obj) {
                return this.f19084a.i(this.f19085b, this.f19086c, this.f19087d, (String) obj);
            }
        });
    }

    final Task i(String str, String str2, String str3, String str4) throws Exception {
        f19005j.e(BuildConfig.FLAVOR, str, str2, str4, this.f19009c.e());
        return C1576m.f(new I(str3, str4));
    }

    final synchronized void k(long j7) {
        l(new m(this, this.f19009c, this.f19012f, Math.min(Math.max(30L, j7 << 1), f19004i)), j7);
        this.f19013g = true;
    }

    final synchronized void m(boolean z7) {
        this.f19013g = z7;
    }

    final boolean n(j jVar) {
        return jVar == null || jVar.c(this.f19009c.e());
    }

    final j o() {
        return p(a5.j.c(this.f19008b), "*");
    }

    final void r(String str) throws IOException {
        j jVarO = o();
        if (n(jVarO)) {
            throw new IOException("token not available");
        }
        j(this.f19010d.h(C(), jVarO.f19049a, str));
    }

    final String s() throws IOException {
        return c(a5.j.c(this.f19008b), "*");
    }

    final void t(String str) throws IOException {
        j jVarO = o();
        if (n(jVarO)) {
            throw new IOException("token not available");
        }
        j(this.f19010d.i(C(), jVarO.f19049a, str));
    }

    final synchronized void w() {
        f19005j.g();
        if (this.f19014h.a()) {
            B();
        }
    }

    final boolean x() {
        return this.f19009c.a() != 0;
    }

    final void y() {
        f19005j.i(BuildConfig.FLAVOR);
        B();
    }

    final void z() {
        if (this.f19014h.a()) {
            A();
        }
    }

    private FirebaseInstanceId(Q4.c cVar, a5.j jVar, Executor executor, Executor executor2, Y4.d dVar, j5.i iVar) {
        this.f19013g = false;
        if (a5.j.c(cVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                try {
                    if (f19005j == null) {
                        f19005j = new k(cVar.h());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f19008b = cVar;
            this.f19009c = jVar;
            this.f19010d = new B(cVar, jVar, executor, iVar);
            this.f19007a = executor2;
            this.f19012f = new n(f19005j);
            this.f19014h = new a(dVar);
            this.f19011e = new C2347e(executor);
            executor2.execute(new Runnable(this) {

                private final FirebaseInstanceId f19083d;

                {
                    this.f19083d = this;
                }

                @Override
                public final void run() {
                    this.f19083d.z();
                }
            });
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }
}
