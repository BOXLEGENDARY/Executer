package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.AbstractC1694h;
import android.view.C1672F;
import android.view.C1675I;
import android.view.C1681O;
import android.view.C1683Q;
import android.view.C1703q;
import android.view.InterfaceC1684S;
import android.view.InterfaceC1693g;

class F implements InterfaceC1693g, b1.d, InterfaceC1684S {

    private final Fragment f10969d;

    private final C1683Q f10970e;

    private C1681O.b f10971i;

    private C1703q f10972v = null;

    private b1.c f10973w = null;

    F(Fragment fragment, C1683Q c1683q) {
        this.f10969d = fragment;
        this.f10970e = c1683q;
    }

    void a(AbstractC1694h.a aVar) {
        this.f10972v.j(aVar);
    }

    void b() {
        if (this.f10972v == null) {
            this.f10972v = new C1703q(this);
            b1.c cVarA = b1.c.a(this);
            this.f10973w = cVarA;
            cVarA.c();
        }
    }

    boolean c() {
        return this.f10972v != null;
    }

    void d(Bundle bundle) {
        this.f10973w.d(bundle);
    }

    void e(Bundle bundle) {
        this.f10973w.e(bundle);
    }

    void f(AbstractC1694h.b bVar) {
        this.f10972v.o(bVar);
    }

    @Override
    public R0.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f10969d.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        R0.d dVar = new R0.d();
        if (application != null) {
            dVar.c(C1681O.a.f11332h, application);
        }
        dVar.c(C1672F.f11269a, this.f10969d);
        dVar.c(C1672F.f11270b, this);
        if (this.f10969d.getArguments() != null) {
            dVar.c(C1672F.f11271c, this.f10969d.getArguments());
        }
        return dVar;
    }

    @Override
    public C1681O.b getDefaultViewModelProviderFactory() {
        Application application;
        C1681O.b defaultViewModelProviderFactory = this.f10969d.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f10969d.mDefaultFactory)) {
            this.f10971i = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f10971i == null) {
            Context applicationContext = this.f10969d.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            Fragment fragment = this.f10969d;
            this.f10971i = new C1675I(application, fragment, fragment.getArguments());
        }
        return this.f10971i;
    }

    @Override
    public AbstractC1694h getLifecycle() {
        b();
        return this.f10972v;
    }

    @Override
    public androidx.savedstate.a getSavedStateRegistry() {
        b();
        return this.f10973w.getSavedStateRegistry();
    }

    @Override
    public C1683Q getViewModelStore() {
        b();
        return this.f10970e;
    }
}
