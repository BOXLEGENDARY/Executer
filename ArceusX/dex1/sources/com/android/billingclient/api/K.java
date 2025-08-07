package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.C2046c1;
import com.google.android.gms.internal.play_billing.C2085i4;
import com.google.android.gms.internal.play_billing.C2115n4;
import com.google.android.gms.internal.play_billing.C2162v4;
import com.google.android.gms.internal.play_billing.C4;
import com.google.android.gms.internal.play_billing.E4;
import com.google.android.gms.internal.play_billing.T4;
import com.google.android.gms.internal.play_billing.V4;
import com.google.android.gms.internal.play_billing.b5;
import com.google.android.gms.internal.play_billing.f5;

final class K implements I {

    private E4 f13374b;

    private final L f13375c;

    K(Context context, E4 e42) {
        this.f13375c = new L(context);
        this.f13374b = e42;
    }

    @Override
    public final void a(C2162v4 c2162v4) {
        try {
            T4 t4K = V4.K();
            t4K.t(this.f13374b);
            t4K.s(c2162v4);
            this.f13375c.a((V4) t4K.l());
        } catch (Throwable th) {
            C2046c1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public final void b(f5 f5Var) {
        if (f5Var == null) {
            return;
        }
        try {
            T4 t4K = V4.K();
            t4K.t(this.f13374b);
            t4K.w(f5Var);
            this.f13375c.a((V4) t4K.l());
        } catch (Throwable th) {
            C2046c1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public final void c(b5 b5Var) {
        try {
            L l7 = this.f13375c;
            T4 t4K = V4.K();
            t4K.t(this.f13374b);
            t4K.v(b5Var);
            l7.a((V4) t4K.l());
        } catch (Throwable th) {
            C2046c1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public final void d(C2085i4 c2085i4) {
        if (c2085i4 == null) {
            return;
        }
        try {
            T4 t4K = V4.K();
            t4K.t(this.f13374b);
            t4K.q(c2085i4);
            this.f13375c.a((V4) t4K.l());
        } catch (Throwable th) {
            C2046c1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public final void e(C2085i4 c2085i4, int i7) {
        try {
            C4 c42 = (C4) this.f13374b.p();
            c42.q(i7);
            this.f13374b = (E4) c42.l();
            d(c2085i4);
        } catch (Throwable th) {
            C2046c1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public final void f(C2115n4 c2115n4, int i7) {
        try {
            C4 c42 = (C4) this.f13374b.p();
            c42.q(i7);
            this.f13374b = (E4) c42.l();
            g(c2115n4);
        } catch (Throwable th) {
            C2046c1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public final void g(C2115n4 c2115n4) {
        if (c2115n4 == null) {
            return;
        }
        try {
            T4 t4K = V4.K();
            t4K.t(this.f13374b);
            t4K.r(c2115n4);
            this.f13375c.a((V4) t4K.l());
        } catch (Throwable th) {
            C2046c1.k("BillingLogger", "Unable to log.", th);
        }
    }
}
