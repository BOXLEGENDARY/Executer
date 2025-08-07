package l3;

import a4.C1574k;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.AbstractC1802b;
import com.google.android.gms.common.api.internal.AbstractC1808h;
import com.google.android.gms.common.api.internal.C1803c;
import com.google.android.gms.common.api.internal.C1804d;
import com.google.android.gms.common.api.internal.C1805e;
import com.google.android.gms.common.api.internal.C1807g;
import com.google.android.gms.common.api.internal.C1813m;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;
import l3.C2526a;
import l3.C2526a.d;
import m3.BinderC2564E;
import m3.C2570a;
import m3.C2571b;
import m3.InterfaceC2580k;
import m3.ServiceConnectionC2576g;
import n3.C2644b;
import n3.C2651i;

public abstract class AbstractC2531f<O extends C2526a.d> implements InterfaceC2533h<O> {

    private final Context f21787a;

    private final String f21788b;

    private final C2526a f21789c;

    private final C2526a.d f21790d;

    private final C2571b f21791e;

    private final Looper f21792f;

    private final int f21793g;

    private final AbstractC2532g f21794h;

    private final InterfaceC2580k f21795i;

    protected final C1803c f21796j;

    public static class a {

        public static final a f21797c = new C0205a().a();

        public final InterfaceC2580k f21798a;

        public final Looper f21799b;

        public static class C0205a {

            private InterfaceC2580k f21800a;

            private Looper f21801b;

            public a a() {
                if (this.f21800a == null) {
                    this.f21800a = new C2570a();
                }
                if (this.f21801b == null) {
                    this.f21801b = Looper.getMainLooper();
                }
                return new a(this.f21800a, this.f21801b);
            }

            public C0205a b(Looper looper) {
                C2651i.m(looper, "Looper must not be null.");
                this.f21801b = looper;
                return this;
            }

            public C0205a c(InterfaceC2580k interfaceC2580k) {
                C2651i.m(interfaceC2580k, "StatusExceptionMapper must not be null.");
                this.f21800a = interfaceC2580k;
                return this;
            }
        }

        private a(InterfaceC2580k interfaceC2580k, Account account, Looper looper) {
            this.f21798a = interfaceC2580k;
            this.f21799b = looper;
        }
    }

    public AbstractC2531f(Activity activity, C2526a<O> c2526a, O o2, a aVar) {
        this(activity, activity, c2526a, o2, aVar);
    }

    private final AbstractC1802b C(int i7, AbstractC1802b abstractC1802b) {
        abstractC1802b.j();
        this.f21796j.E(this, i7, abstractC1802b);
        return abstractC1802b;
    }

    private final Task D(int i7, AbstractC1808h abstractC1808h) {
        C1574k c1574k = new C1574k();
        this.f21796j.F(this, i7, abstractC1808h, c1574k, this.f21795i);
        return c1574k.a();
    }

    public final C2526a.f A(Looper looper, com.google.android.gms.common.api.internal.t tVar) {
        C2644b c2644bA = n().a();
        C2526a.f fVarA = ((C2526a.AbstractC0203a) C2651i.l(this.f21789c.a())).a(this.f21787a, looper, c2644bA, this.f21790d, tVar, tVar);
        String strW = w();
        if (strW != null && (fVarA instanceof com.google.android.gms.common.internal.b)) {
            ((com.google.android.gms.common.internal.b) fVarA).P(strW);
        }
        if (strW != null && (fVarA instanceof ServiceConnectionC2576g)) {
            ((ServiceConnectionC2576g) fVarA).r(strW);
        }
        return fVarA;
    }

    public final BinderC2564E B(Context context, Handler handler) {
        return new BinderC2564E(context, handler, n().a());
    }

    @Override
    public final C2571b<O> l() {
        return this.f21791e;
    }

    public AbstractC2532g m() {
        return this.f21794h;
    }

    protected C2644b.a n() {
        Account accountK;
        GoogleSignInAccount googleSignInAccountG;
        GoogleSignInAccount googleSignInAccountG2;
        C2644b.a aVar = new C2644b.a();
        C2526a.d dVar = this.f21790d;
        if (!(dVar instanceof C2526a.d.b) || (googleSignInAccountG2 = ((C2526a.d.b) dVar).g()) == null) {
            C2526a.d dVar2 = this.f21790d;
            accountK = dVar2 instanceof C2526a.d.InterfaceC0204a ? ((C2526a.d.InterfaceC0204a) dVar2).k() : null;
        } else {
            accountK = googleSignInAccountG2.k();
        }
        aVar.d(accountK);
        C2526a.d dVar3 = this.f21790d;
        Set<Scope> setEmptySet = (!(dVar3 instanceof C2526a.d.b) || (googleSignInAccountG = ((C2526a.d.b) dVar3).g()) == null) ? Collections.emptySet() : googleSignInAccountG.t();
        aVar.c(setEmptySet);
        aVar.e(this.f21787a.getClass().getName());
        aVar.b(this.f21787a.getPackageName());
        return aVar;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends C2526a.b> Task<TResult> o(AbstractC1808h<A, TResult> abstractC1808h) {
        return D(2, abstractC1808h);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends C2526a.b> Task<TResult> p(AbstractC1808h<A, TResult> abstractC1808h) {
        return D(0, abstractC1808h);
    }

    @ResultIgnorabilityUnspecified
    public <A extends C2526a.b> Task<Void> q(C1807g<A, ?> c1807g) {
        C2651i.l(c1807g);
        C2651i.m(c1807g.f14138a.b(), "Listener has already been released.");
        C2651i.m(c1807g.f14139b.a(), "Listener has already been released.");
        return this.f21796j.y(this, c1807g.f14138a, c1807g.f14139b, c1807g.f14140c);
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> r(C1804d.a<?> aVar, int i7) {
        C2651i.m(aVar, "Listener key cannot be null.");
        return this.f21796j.z(this, aVar, i7);
    }

    public <A extends C2526a.b, T extends AbstractC1802b<? extends InterfaceC2540o, A>> T s(T t7) {
        C(1, t7);
        return t7;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends C2526a.b> Task<TResult> t(AbstractC1808h<A, TResult> abstractC1808h) {
        return D(1, abstractC1808h);
    }

    protected String u(Context context) {
        return null;
    }

    public Context v() {
        return this.f21787a;
    }

    protected String w() {
        return this.f21788b;
    }

    public Looper x() {
        return this.f21792f;
    }

    public <L> C1804d<L> y(L l7, String str) {
        return C1805e.a(l7, this.f21792f, str);
    }

    public final int z() {
        return this.f21793g;
    }

    @Deprecated
    public AbstractC2531f(Activity activity, C2526a<O> c2526a, O o2, InterfaceC2580k interfaceC2580k) {
        a.C0205a c0205a = new a.C0205a();
        c0205a.c(interfaceC2580k);
        c0205a.b(activity.getMainLooper());
        this(activity, (C2526a) c2526a, (C2526a.d) o2, c0205a.a());
    }

    private AbstractC2531f(Context context, Activity activity, C2526a c2526a, C2526a.d dVar, a aVar) {
        String strU;
        C2651i.m(context, "Null context is not permitted.");
        C2651i.m(c2526a, "Api must not be null.");
        C2651i.m(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) C2651i.m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f21787a = context2;
        if (Build.VERSION.SDK_INT >= 30) {
            strU = context.getAttributionTag();
        } else {
            strU = u(context);
        }
        this.f21788b = strU;
        this.f21789c = c2526a;
        this.f21790d = dVar;
        this.f21792f = aVar.f21799b;
        C2571b c2571bA = C2571b.a(c2526a, dVar, strU);
        this.f21791e = c2571bA;
        this.f21794h = new m3.q(this);
        C1803c c1803cV = C1803c.v(context2);
        this.f21796j = c1803cV;
        this.f21793g = c1803cV.l();
        this.f21795i = aVar.f21798a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C1813m.u(activity, c1803cV, c2571bA);
        }
        c1803cV.J(this);
    }

    public AbstractC2531f(Context context, C2526a<O> c2526a, O o2, a aVar) {
        this(context, null, c2526a, o2, aVar);
    }
}
