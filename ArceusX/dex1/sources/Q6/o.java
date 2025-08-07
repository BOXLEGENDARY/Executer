package Q6;

import W7.k;
import android.content.Context;
import com.roblox.client.C2374w;
import com.roblox.client.P;
import com.roblox.client.a0;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;

public class o implements k.a {

    private static o f4885a;

    private boolean e(Context context, s sVar) {
        return ((sVar.e(context, "AndroidNotifShowRationalePrefKey") && sVar.b(context, "AndroidNotifShowRationalePrefKey")) || (sVar.e(context, "AndroidNotifUserInteractedPrefKey") && sVar.b(context, "AndroidNotifUserInteractedPrefKey"))) ? false : true;
    }

    public static o f() {
        if (f4885a == null) {
            synchronized (n.class) {
                try {
                    if (f4885a == null) {
                        f4885a = new o();
                    }
                } finally {
                }
            }
        }
        return f4885a;
    }

    public void a(Context context, boolean z7, boolean z8) {
        if (context == null) {
            return;
        }
        s sVar = new s();
        boolean z9 = !sVar.e(context, "AndroidNotifShowRationalePrefKey") ? z7 : z7 != sVar.b(context, "AndroidNotifShowRationalePrefKey");
        if (z7) {
            sVar.f(context, "AndroidNotifShowRationalePrefKey", true);
        }
        if (!z8 && !z9) {
            P.l("sysPromptDismiss", false);
        } else {
            P.l("sysPrompt", z8);
            sVar.f(context, tAjeAKSIqDqzNP.dfaCzMDYLr, true);
        }
    }

    public boolean b(Context context, boolean z7) {
        if (context == null || (!j6.d.a().s1() && h(context))) {
            return false;
        }
        s sVar = new s();
        if (!z7) {
            return e(context, sVar);
        }
        sVar.f(context, "AndroidNotifShowRationalePrefKey", true);
        return false;
    }

    public boolean c(Context context) {
        if (context != null) {
            return j6.d.a().s1() || !h(context);
        }
        return false;
    }

    public boolean d(Context context) {
        if (context == null) {
            return false;
        }
        if (j6.d.a().s1() || !h(context)) {
            return e(context, new s());
        }
        return false;
    }

    public n g(Context context) {
        if (h(context)) {
            return null;
        }
        n nVarM = C2374w.h().m();
        return nVarM == null ? h7.n.d() ? new K5.a() : new com.roblox.client.fcm.a() : nVarM;
    }

    public boolean h(Context context) {
        return a0.t(context);
    }
}
