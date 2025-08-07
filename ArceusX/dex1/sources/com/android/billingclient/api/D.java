package com.android.billingclient.api;

import com.appsflyer.R;
import com.google.android.gms.internal.play_billing.C2046c1;
import com.google.android.gms.internal.play_billing.InterfaceC2112n1;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

final class D implements InterfaceC2112n1 {

    final Consumer f13328a;

    final Runnable f13329b;

    final G f13330c;

    final int f13331d;

    D(G g7, int i7, Consumer consumer, Runnable runnable) {
        this.f13331d = i7;
        this.f13328a = consumer;
        this.f13329b = runnable;
        this.f13330c = g7;
    }

    @Override
    public final void a(Throwable th) {
        if (th instanceof TimeoutException) {
            this.f13330c.e1(R.styleable.AppCompatTheme_tooltipForegroundColor, 28, J.f13347G);
            C2046c1.k("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            this.f13330c.e1(107, 28, J.f13347G);
            C2046c1.k("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.f13329b.run();
    }

    @Override
    public final void c(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        G g7 = this.f13330c;
        if (!G.b1(iIntValue)) {
            this.f13329b.run();
        } else {
            this.f13328a.accept(g7.c1(this.f13331d, num.intValue()));
        }
    }
}
