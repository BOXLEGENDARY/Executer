package D4;

import E4.p0;
import E4.r0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class d0 extends p0 {

    private static d0 f943j;

    private final Handler f944g;

    private final L f945h;

    private final Set f946i;

    public d0(Context context, L l7) {
        super(new r0("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f944g = new Handler(Looper.getMainLooper());
        this.f946i = new LinkedHashSet();
        this.f945h = l7;
    }

    public static synchronized d0 h(Context context) {
        try {
            if (f943j == null) {
                f943j = new d0(context, U.INSTANCE);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f943j;
    }

    @Override
    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        AbstractC0374e abstractC0374eN = AbstractC0374e.n(bundleExtra);
        this.f1157a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", abstractC0374eN);
        M mZza = this.f945h.zza();
        if (abstractC0374eN.i() != 3 || mZza == null) {
            j(abstractC0374eN);
        } else {
            mZza.a(abstractC0374eN.m(), new b0(this, abstractC0374eN, intent, context));
        }
    }

    public final synchronized void j(AbstractC0374e abstractC0374e) {
        try {
            Iterator it = new LinkedHashSet(this.f946i).iterator();
            while (it.hasNext()) {
                ((InterfaceC0375f) it.next()).a(abstractC0374e);
            }
            super.e(abstractC0374e);
        } catch (Throwable th) {
            throw th;
        }
    }
}
