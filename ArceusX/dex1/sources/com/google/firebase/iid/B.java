package com.google.firebase.iid;

import a4.C1574k;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.common.C1819d;
import com.google.android.gms.tasks.Task;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import java.io.IOException;
import java.util.concurrent.Executor;
import n3.C2648f;

final class B {

    private final Q4.c f18995a;

    private final a5.j f18996b;

    private final C2348f f18997c;

    private final Executor f18998d;

    private final j5.i f18999e;

    B(Q4.c cVar, a5.j jVar, Executor executor, j5.i iVar) {
        this(cVar, jVar, executor, new C2348f(cVar.h(), jVar), iVar);
    }

    private final <T> Task<Void> a(Task<T> task) {
        return task.g(C2343a.b(), new C(this));
    }

    private final Task<Bundle> c(String str, String str2, String str3, final Bundle bundle) throws Throwable {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString(AppsFlyerProperties.APP_ID, str);
        bundle.putString("gmp_app_id", this.f18995a.k().c());
        bundle.putString(tAjeAKSIqDqzNP.efWIqDRhAKBVor, Integer.toString(this.f18996b.g()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f18996b.e());
        bundle.putString("app_ver_name", this.f18996b.f());
        String strB = C2648f.a().b("firebase-iid");
        if ("UNKNOWN".equals(strB)) {
            int i7 = C1819d.f14213a;
            StringBuilder sb = new StringBuilder(19);
            sb.append("unknown_");
            sb.append(i7);
            strB = sb.toString();
        }
        String strValueOf = String.valueOf(strB);
        bundle.putString("cliv", strValueOf.length() != 0 ? "fiid-".concat(strValueOf) : new String("fiid-"));
        bundle.putString("Firebase-Client", this.f18999e.a());
        final C1574k c1574k = new C1574k();
        this.f18998d.execute(new Runnable(this, bundle, c1574k) {

            private final B f19000d;

            private final Bundle f19001e;

            private final C1574k f19002i;

            {
                this.f19000d = this;
                this.f19001e = bundle;
                this.f19002i = c1574k;
            }

            @Override
            public final void run() {
                this.f19000d.f(this.f19001e, this.f19002i);
            }
        });
        return c1574k.a();
    }

    public static String d(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        String strValueOf = String.valueOf(bundle);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 21);
        sb.append("Unexpected response: ");
        sb.append(strValueOf);
        Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    private final Task<String> g(Task<Bundle> task) {
        return task.g(this.f18998d, new E(this));
    }

    public final Task<String> b(String str, String str2, String str3) {
        return g(c(str, str2, str3, new Bundle()));
    }

    final void f(Bundle bundle, C1574k c1574k) {
        try {
            c1574k.c(this.f18997c.a(bundle));
        } catch (IOException e7) {
            c1574k.b(e7);
        }
    }

    public final Task<Void> h(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        String strValueOf2 = String.valueOf(str3);
        return a(g(c(str, str2, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/"), bundle)));
    }

    public final Task<Void> i(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String strValueOf2 = String.valueOf(str3);
        return a(g(c(str, str2, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/"), bundle)));
    }

    private B(Q4.c cVar, a5.j jVar, Executor executor, C2348f c2348f, j5.i iVar) {
        this.f18995a = cVar;
        this.f18996b = jVar;
        this.f18997c = c2348f;
        this.f18998d = executor;
        this.f18999e = iVar;
    }
}
