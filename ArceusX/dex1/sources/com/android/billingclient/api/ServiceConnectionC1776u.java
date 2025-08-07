package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.appsflyer.R;
import com.google.android.gms.internal.play_billing.AbstractBinderC2044c;
import com.google.android.gms.internal.play_billing.C2046c1;
import com.google.android.gms.internal.play_billing.C2073g4;
import com.google.android.gms.internal.play_billing.C2085i4;
import com.google.android.gms.internal.play_billing.C2121o4;
import com.google.android.gms.internal.play_billing.C2144s4;
import com.google.android.gms.internal.play_billing.C2162v4;
import com.google.android.gms.internal.play_billing.f5;
import e2.InterfaceC2414c;
import java.util.concurrent.Callable;

final class ServiceConnectionC1776u implements ServiceConnection {

    private final InterfaceC2414c f13558d;

    final C1759c f13559e;

    ServiceConnectionC1776u(C1759c c1759c, InterfaceC2414c interfaceC2414c, e2.p pVar) {
        this.f13559e = c1759c;
        this.f13558d = interfaceC2414c;
    }

    private final void c(C1761e c1761e) {
        synchronized (this.f13559e.f13431a) {
            try {
                if (this.f13559e.f13432b == 3) {
                    return;
                }
                this.f13558d.a(c1761e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final java.lang.Object a() throws java.lang.Exception {
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ServiceConnectionC1776u.a():java.lang.Object");
    }

    final void b() {
        this.f13559e.R(0);
        C1761e c1761e = J.f13361n;
        this.f13559e.t0(24, 6, c1761e);
        c(c1761e);
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        C2046c1.j("BillingClient", "Billing service died.");
        try {
            if (C1759c.k0(this.f13559e)) {
                I i7 = this.f13559e.f13437g;
                C2073g4 c2073g4I = C2085i4.I();
                c2073g4I.s(6);
                C2121o4 c2121o4I = C2144s4.I();
                c2121o4I.t(R.styleable.AppCompatTheme_windowFixedWidthMajor);
                c2073g4I.q(c2121o4I);
                i7.d((C2085i4) c2073g4I.l());
            } else {
                this.f13559e.f13437g.a(C2162v4.C());
            }
        } catch (Throwable th) {
            C2046c1.k("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f13559e.f13431a) {
            if (this.f13559e.f13432b != 3 && this.f13559e.f13432b != 0) {
                this.f13559e.R(0);
                this.f13559e.S();
                this.f13558d.b();
            }
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C2046c1.i("BillingClient", "Billing service connected.");
        synchronized (this.f13559e.f13431a) {
            try {
                if (this.f13559e.f13432b == 3) {
                    return;
                }
                this.f13559e.f13438h = AbstractBinderC2044c.O0(iBinder);
                C1759c c1759c = this.f13559e;
                if (C1759c.m(new Callable() {
                    @Override
                    public final Object call() throws Exception {
                        this.f13556d.a();
                        return null;
                    }
                }, 30000L, new Runnable() {
                    @Override
                    public final void run() {
                        this.f13557d.b();
                    }
                }, c1759c.p0(), c1759c.L()) == null) {
                    C1759c c1759c2 = this.f13559e;
                    C1761e c1761eI = c1759c2.I();
                    c1759c2.t0(25, 6, c1761eI);
                    c(c1761eI);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        C2046c1.j("BillingClient", "Billing service disconnected.");
        try {
            if (C1759c.k0(this.f13559e)) {
                I i7 = this.f13559e.f13437g;
                C2073g4 c2073g4I = C2085i4.I();
                c2073g4I.s(6);
                C2121o4 c2121o4I = C2144s4.I();
                c2121o4I.t(R.styleable.AppCompatTheme_windowFixedHeightMinor);
                c2073g4I.q(c2121o4I);
                i7.d((C2085i4) c2073g4I.l());
            } else {
                this.f13559e.f13437g.b(f5.C());
            }
        } catch (Throwable th) {
            C2046c1.k("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f13559e.f13431a) {
            try {
                if (this.f13559e.f13432b == 3) {
                    return;
                }
                this.f13559e.R(0);
                this.f13558d.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
