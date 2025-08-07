package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.android.billingclient.api.C1761e;
import com.appsflyer.R;
import com.google.android.gms.internal.play_billing.A1;
import com.google.android.gms.internal.play_billing.C2046c1;
import com.google.android.gms.internal.play_billing.C2085i4;
import com.google.android.gms.internal.play_billing.C2115n4;
import com.google.android.gms.internal.play_billing.C2124p1;
import com.google.android.gms.internal.play_billing.G1;
import com.google.android.gms.internal.play_billing.InterfaceC2086j;
import com.google.android.gms.internal.play_billing.InterfaceFutureC2177y1;
import com.google.android.gms.internal.play_billing.o5;
import com.google.android.gms.internal.play_billing.s5;
import e2.C2412a;
import e2.C2415d;
import e2.InterfaceC2411A;
import e2.InterfaceC2413b;
import e2.InterfaceC2414c;
import e2.InterfaceC2416e;
import e2.InterfaceC2417f;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

final class G extends C1759c {

    private final Context f13334G;

    private volatile int f13335H;

    private volatile InterfaceC2086j f13336I;

    private volatile F f13337J;

    private volatile A1 f13338K;

    G(String str, Context context, I i7, ExecutorService executorService) {
        super(null, context, null, null);
        this.f13335H = 0;
        this.f13334G = context;
    }

    private final int Y0(InterfaceFutureC2177y1 interfaceFutureC2177y1) {
        try {
            return ((Integer) interfaceFutureC2177y1.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e7) {
            e1(R.styleable.AppCompatTheme_tooltipForegroundColor, 28, J.f13347G);
            C2046c1.k("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e7);
            return 0;
        } catch (Exception e8) {
            if (e8 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            e1(107, 28, J.f13347G);
            C2046c1.k("BillingClientTesting", "An error occurred while retrieving billing override.", e8);
            return 0;
        }
    }

    private final synchronized A1 Z0() {
        try {
            if (this.f13338K == null) {
                this.f13338K = G1.b(Executors.newSingleThreadScheduledExecutor());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f13338K;
    }

    private final synchronized void a1() {
        if (T0()) {
            C2046c1.i("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            f1(26);
            return;
        }
        int i7 = 1;
        if (this.f13335H == 1) {
            C2046c1.j("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.f13335H == 3) {
            C2046c1.j("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            e1(38, 26, J.a(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.f13335H = 1;
        C2046c1.i("BillingClientTesting", "Starting Billing Override Service setup.");
        this.f13337J = new F(this, null);
        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        List<ResolveInfo> listQueryIntentServices = this.f13334G.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i7 = 41;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                    C2046c1.j("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (this.f13334G.bindService(intent2, this.f13337J, 1)) {
                        C2046c1.i("BillingClientTesting", "Billing Override Service was bonded successfully.");
                        return;
                    }
                    C2046c1.j("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                }
                i7 = 39;
            }
        }
        this.f13335H = 0;
        C2046c1.i("BillingClientTesting", "Billing Override Service unavailable on device.");
        e1(i7, 26, J.a(2, "Billing Override Service unavailable on device."));
    }

    public static final boolean b1(int i7) {
        return i7 > 0;
    }

    public final C1761e c1(int i7, int i8) {
        C1761e c1761eA = J.a(i8, "Billing override value was set by a license tester.");
        e1(105, i7, c1761eA);
        return c1761eA;
    }

    private final InterfaceFutureC2177y1 d1(int i7) {
        if (T0()) {
            return s5.a(new A(this, i7));
        }
        C2046c1.j("BillingClientTesting", "Billing Override Service is not ready.");
        e1(106, 28, J.a(-1, "Billing Override Service connection is disconnected."));
        return C2124p1.a(0);
    }

    public final void e1(int i7, int i8, C1761e c1761e) {
        C2085i4 c2085i4B = H.b(i7, i8, c1761e);
        Objects.requireNonNull(c2085i4B, "ApiFailure should not be null");
        E0().d(c2085i4B);
    }

    public final void f1(int i7) {
        C2115n4 c2115n4D = H.d(i7);
        Objects.requireNonNull(c2115n4D, "ApiSuccess should not be null");
        E0().g(c2115n4D);
    }

    private final void g1(int i7, Consumer consumer, Runnable runnable) {
        C2124p1.c(C2124p1.b(d1(i7), 28500L, TimeUnit.MILLISECONDS, Z0()), new D(this, i7, consumer, runnable), I0());
    }

    final void O0(C2412a c2412a, InterfaceC2413b interfaceC2413b) {
        super.a(c2412a, interfaceC2413b);
    }

    final void P0(C2415d c2415d, InterfaceC2416e interfaceC2416e) {
        super.b(c2415d, interfaceC2416e);
    }

    final void Q0(C1761e c1761e) {
        super.G0(c1761e);
    }

    final void R0(C1764h c1764h, InterfaceC2417f interfaceC2417f) {
        super.g(c1764h, interfaceC2417f);
    }

    public final synchronized boolean T0() {
        if (this.f13335H == 2 && this.f13336I != null) {
            if (this.f13337J != null) {
                return true;
            }
        }
        return false;
    }

    final Object V0(int i7, o5 o5Var) throws Exception {
        String str;
        try {
            if (this.f13336I == null) {
                throw null;
            }
            InterfaceC2086j interfaceC2086j = this.f13336I;
            String packageName = this.f13334G.getPackageName();
            switch (i7) {
                case 2:
                    str = "LAUNCH_BILLING_FLOW";
                    break;
                case 3:
                    str = "ACKNOWLEDGE_PURCHASE";
                    break;
                case 4:
                    str = "CONSUME_ASYNC";
                    break;
                case 5:
                    str = "IS_FEATURE_SUPPORTED";
                    break;
                case 6:
                    str = "START_CONNECTION";
                    break;
                case 7:
                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                    break;
                default:
                    str = "QUERY_SKU_DETAILS_ASYNC";
                    break;
            }
            interfaceC2086j.m2(packageName, str, new E(o5Var));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e7) {
            e1(107, 28, J.f13347G);
            C2046c1.k("BillingClientTesting", "An error occurred while retrieving billing override.", e7);
            o5Var.b(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override
    public final void a(final C2412a c2412a, final InterfaceC2413b interfaceC2413b) {
        Objects.requireNonNull(interfaceC2413b);
        g1(3, new Consumer() {
            @Override
            public final void accept(Object obj) {
                interfaceC2413b.a((C1761e) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                this.f13324d.O0(c2412a, interfaceC2413b);
            }
        });
    }

    @Override
    public final void b(final C2415d c2415d, final InterfaceC2416e interfaceC2416e) {
        g1(4, new Consumer() {
            @Override
            public final void accept(Object obj) {
                interfaceC2416e.a((C1761e) obj, c2415d.a());
            }
        }, new Runnable() {
            @Override
            public final void run() {
                this.f13571d.P0(c2415d, interfaceC2416e);
            }
        });
    }

    @Override
    public final C1761e e(final Activity activity, final C1760d c1760d) {
        Consumer consumer = new Consumer() {
            @Override
            public final void accept(Object obj) {
                this.f13327a.Q0((C1761e) obj);
            }
        };
        Callable callable = new Callable() {
            @Override
            public final Object call() {
                return this.f13565d.h1(activity, c1760d);
            }
        };
        int iY0 = Y0(d1(2));
        if (b1(iY0)) {
            C1761e c1761eC1 = c1(2, iY0);
            consumer.accept(c1761eC1);
            return c1761eC1;
        }
        try {
            return (C1761e) callable.call();
        } catch (Exception e7) {
            C1761e c1761e = J.f13358k;
            e1(R.styleable.AppCompatTheme_tooltipFrameBackground, 2, c1761e);
            C2046c1.k("BillingClientTesting", "An internal error occurred.", e7);
            return c1761e;
        }
    }

    @Override
    public final void g(final C1764h c1764h, final InterfaceC2417f interfaceC2417f) {
        g1(7, new Consumer() {
            @Override
            public final void accept(Object obj) {
                ArrayList arrayList = new ArrayList();
                interfaceC2417f.a((C1761e) obj, arrayList);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                this.f13568d.R0(c1764h, interfaceC2417f);
            }
        });
    }

    final C1761e h1(Activity activity, C1760d c1760d) throws Exception {
        return super.e(activity, c1760d);
    }

    @Override
    public final void j(InterfaceC2414c interfaceC2414c) {
        a1();
        super.j(interfaceC2414c);
    }

    G(String str, C1762f c1762f, Context context, InterfaceC2411A interfaceC2411A, I i7, ExecutorService executorService) {
        super(null, c1762f, context, null, null, null);
        this.f13335H = 0;
        this.f13334G = context;
    }

    G(String str, C1762f c1762f, Context context, e2.i iVar, e2.o oVar, I i7, ExecutorService executorService) {
        super(null, c1762f, context, iVar, null, null, null);
        this.f13335H = 0;
        this.f13334G = context;
    }
}
