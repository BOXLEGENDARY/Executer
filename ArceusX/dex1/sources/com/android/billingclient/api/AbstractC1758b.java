package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.C1762f;
import com.google.android.gms.internal.play_billing.C2046c1;
import e2.C2412a;
import e2.C2415d;
import e2.InterfaceC2413b;
import e2.InterfaceC2414c;
import e2.InterfaceC2416e;
import e2.InterfaceC2417f;
import e2.InterfaceC2418g;

public abstract class AbstractC1758b {

    public static final class a {

        private volatile C1762f f13420a;

        private final Context f13421b;

        private volatile e2.i f13422c;

        private volatile boolean f13423d;

        private volatile boolean f13424e;

        a(Context context, e2.G g7) {
            this.f13421b = context;
        }

        private final boolean e() {
            try {
                return this.f13421b.getPackageManager().getApplicationInfo(this.f13421b.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e7) {
                C2046c1.k("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e7);
                return false;
            }
        }

        public AbstractC1758b a() {
            if (this.f13421b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f13422c == null) {
                if (!this.f13423d && !this.f13424e) {
                    throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
                }
                Context context = this.f13421b;
                return e() ? new G(null, context, null, null) : new C1759c(null, context, null, null);
            }
            if (this.f13420a == null || !this.f13420a.a()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.f13422c == null) {
                C1762f c1762f = this.f13420a;
                Context context2 = this.f13421b;
                return e() ? new G(null, c1762f, context2, null, null, null) : new C1759c(null, c1762f, context2, null, null, null);
            }
            C1762f c1762f2 = this.f13420a;
            Context context3 = this.f13421b;
            e2.i iVar = this.f13422c;
            return e() ? new G(null, c1762f2, context3, iVar, null, null, null) : new C1759c(null, c1762f2, context3, iVar, null, null, null);
        }

        @Deprecated
        public a b() {
            C1762f.a aVarC = C1762f.c();
            aVarC.b();
            c(aVarC.a());
            return this;
        }

        public a c(C1762f c1762f) {
            this.f13420a = c1762f;
            return this;
        }

        public a d(e2.i iVar) {
            this.f13422c = iVar;
            return this;
        }
    }

    public static a f(Context context) {
        return new a(context, null);
    }

    public abstract void a(C2412a c2412a, InterfaceC2413b interfaceC2413b);

    public abstract void b(C2415d c2415d, InterfaceC2416e interfaceC2416e);

    public abstract C1761e c(String str);

    public abstract boolean d();

    public abstract C1761e e(Activity activity, C1760d c1760d);

    public abstract void g(C1764h c1764h, InterfaceC2417f interfaceC2417f);

    @Deprecated
    public abstract void h(e2.j jVar, InterfaceC2418g interfaceC2418g);

    public abstract void i(e2.k kVar, e2.h hVar);

    public abstract void j(InterfaceC2414c interfaceC2414c);
}
