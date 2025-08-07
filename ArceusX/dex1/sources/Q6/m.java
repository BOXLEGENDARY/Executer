package Q6;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.P;

public class m {

    private static m f4881c;

    private Bundle f4882a;

    private b f4883b = new a();

    class a implements b {
        a() {
        }

        @Override
        public void a(S6.n nVar, Context context) {
            if (context == null || nVar.a() == null || m.this.h(context) == null) {
                return;
            }
            m.this.s(context, nVar.a(), new s(), m.this.h(context).b());
        }
    }

    public interface b {
        void a(S6.n nVar, Context context);
    }

    public static m c() {
        if (f4881c == null) {
            synchronized (m.class) {
                try {
                    if (f4881c == null) {
                        f4881c = new m();
                    }
                } finally {
                }
            }
        }
        return f4881c;
    }

    private String d(String str, Context context, s sVar, String str2) {
        if (sVar == null || str2 == null) {
            return null;
        }
        String strA = sVar.a(context, str2);
        if (strA == null || !strA.equals(str)) {
            return strA;
        }
        return null;
    }

    public n h(Context context) {
        return o.f().g(context);
    }

    public Bundle b() {
        Bundle bundle = this.f4882a;
        if (bundle != null) {
            this.f4882a = null;
        }
        return bundle;
    }

    public String e(Context context) {
        n nVarH = h(context);
        if (nVarH != null) {
            return nVarH.b();
        }
        return null;
    }

    public S6.k f(Context context) {
        n nVarH = h(context);
        return nVarH != null ? nVarH.a() : S6.k.NONE;
    }

    String g(Context context, String str, s sVar, String str2) {
        String strD = d(str, context, sVar, str2);
        s(context, str, sVar, str2);
        return strD;
    }

    public String i(Context context) {
        n nVarH = h(context);
        if (nVarH != null) {
            return nVarH.c();
        }
        return null;
    }

    public void j(Context context) {
        s sVar = new s();
        boolean zA = androidx.core.app.p.b(context).a();
        h7.l.g("rbx.push", "AndroidNotifState: " + zA);
        if (sVar.e(context, "AndroidNotifStatePrefKey") && zA == sVar.b(context, "AndroidNotifStatePrefKey")) {
            return;
        }
        h7.l.g("rbx.push", "Different value. Reporting new state: " + zA);
        sVar.f(context, "AndroidNotifStatePrefKey", zA);
        P.l("osSettings", zA);
        p(context, zA, new R6.a(), sVar, this.f4883b);
    }

    public boolean k(Bundle bundle) {
        String string = bundle.getString("EXTRA_NOTIFICATION_TYPE", BuildConfig.FLAVOR);
        String string2 = bundle.getString("EXTRA_NOTIFICATION_VERSION", BuildConfig.FLAVOR);
        String string3 = bundle.getString("EXTRA_NOTIFICATION_ID", BuildConfig.FLAVOR);
        if (string2.isEmpty()) {
            return false;
        }
        h7.l.a("rbx.push", "... Will handle this Push bundle using Linking protocol.");
        String string4 = bundle.getString("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", BuildConfig.FLAVOR);
        U7.e.n().c(string4);
        P.m(string, string3, string2, string4);
        return true;
    }

    public boolean l() {
        return this.f4882a != null;
    }

    public void m(S6.l lVar) {
        if (lVar.a() == null || lVar.b() == null) {
            return;
        }
        h7.l.a("rbx.push", lVar.b());
        s sVar = new s();
        Context contextA = lVar.a();
        n nVarH = h(contextA);
        if (nVarH != null) {
            String strC = nVarH.c();
            String strB = lVar.b();
            q(contextA, strB, g(contextA, strB, sVar, strC), lVar.c(), new R6.a(), this.f4883b);
        }
    }

    public void n(Context context, boolean z7) {
        if (context != null) {
            o(context, z7, h(context));
        }
    }

    void o(Context context, boolean z7, n nVar) {
        if (nVar != null) {
            nVar.d(context, z7);
        }
    }

    public void p(Context context, boolean z7, R6.a aVar, s sVar, b bVar) {
        if (!z7) {
            aVar.a();
            return;
        }
        n nVarH = h(context);
        if (nVarH == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            n(context, true);
            return;
        }
        String strC = nVarH.c();
        String strD = d(null, context, sVar, strC);
        if (strD == null || strC == null) {
            return;
        }
        q(context, strD, null, true, aVar, bVar);
    }

    void q(Context context, String str, String str2, boolean z7, R6.a aVar, b bVar) {
        if (aVar == null || str == null || bVar == null) {
            return;
        }
        aVar.f(context, str, str2, z7, bVar);
    }

    public void r(Bundle bundle) {
        this.f4882a = bundle;
    }

    void s(Context context, String str, s sVar, String str2) {
        if (str2 == null || sVar == null) {
            return;
        }
        h7.l.a("rbx.push", str2 + " " + str);
        sVar.g(context, str2, str);
    }
}
