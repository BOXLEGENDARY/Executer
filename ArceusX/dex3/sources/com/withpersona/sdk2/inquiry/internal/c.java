package com.withpersona.sdk2.inquiry.internal;

import J8.p;
import J8.q;
import P9.C0872a;
import P9.GovernmentIdHintWorker;
import android.content.Context;
import android.net.Uri;
import android.view.Window;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.E;
import b9.InterfaceC0482a;
import bb.C0425b;
import bb.C0426c;
import bb.C0427d;
import bb.C0758a;
import bb.C0874a;
import bb.C0896b;
import bb.InterfaceC0424a;
import bb.InterfaceC0759b;
import bb.InterfaceC0875b;
import bb.InterfaceC0895a;
import bb.c;
import bb.u;
import com.squareup.moshi.h;
import com.squareup.workflow1.ui.C;
import com.withpersona.sdk2.camera.b;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.network.a;
import com.withpersona.sdk2.inquiry.document.network.b;
import com.withpersona.sdk2.inquiry.document.network.c;
import com.withpersona.sdk2.inquiry.document.network.d;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker;
import com.withpersona.sdk2.inquiry.internal.a;
import com.withpersona.sdk2.inquiry.internal.b;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.f;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.i;
import com.withpersona.sdk2.inquiry.internal.i;
import com.withpersona.sdk2.inquiry.internal.k;
import com.withpersona.sdk2.inquiry.internal.n;
import com.withpersona.sdk2.inquiry.network.JsonAdapterBinding;
import com.withpersona.sdk2.inquiry.network.NetworkModule;
import com.withpersona.sdk2.inquiry.network.NetworkModule_InterceptorFactory;
import com.withpersona.sdk2.inquiry.network.NetworkModule_KeyInflectionFactory;
import com.withpersona.sdk2.inquiry.network.NetworkModule_MoshiFactory;
import com.withpersona.sdk2.inquiry.network.NetworkModule_OkhttpClientFactory;
import com.withpersona.sdk2.inquiry.network.NetworkModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.network.NetworkModule_ResponseInterceptorFactory;
import com.withpersona.sdk2.inquiry.network.NetworkModule_RetrofitFactory;
import com.withpersona.sdk2.inquiry.network.NetworkModule_UseServerStylesFactory;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderConfig;
import com.withpersona.sdk2.inquiry.nfc.b;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.a;
import com.withpersona.sdk2.inquiry.permissions.c;
import com.withpersona.sdk2.inquiry.selfie.c;
import com.withpersona.sdk2.inquiry.ui.b;
import com.withpersona.sdk2.inquiry.ui.g;
import com.withpersona.sdk2.inquiry.ui.network.b;
import d9.InterfaceC0550a;
import f9.InterfaceC0574a;
import ha.C0326a;
import ha.C0328c;
import ha.C0337C;
import ha.C0343e;
import ha.C0371C;
import ha.C0374F;
import ha.C0378a;
import ha.C0379b;
import ha.C0382e;
import ha.C0384g;
import ha.C0389l;
import ha.C0390m;
import ha.C0391n;
import ha.C0392o;
import ha.C0395r;
import ha.C0397t;
import ha.C0399v;
import ha.C0401w;
import ha.C0403z;
import ha.C0428a;
import ha.C0442A;
import ha.C0443B;
import ha.C0444C;
import ha.C0445D;
import ha.C0462j;
import ha.C0466k;
import ha.C0475t;
import ha.C0479x;
import ha.C0480y;
import ha.C0481z;
import ha.C0553c;
import ha.C0554d;
import ha.C0556f;
import ha.C0557g;
import ha.C0586a;
import ha.C0587b;
import ha.C0645f;
import ha.C0646g;
import ha.C0647h;
import ha.EnumC0342d;
import ha.InterfaceC0459g;
import ha.InterfaceC0555e;
import ha.InterfaceC0883h;
import ha.w;
import i9.C0594a;
import java.util.Map;
import java.util.Set;
import ka.x;
import o8.InterfaceC0723a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import q8.C0736b;
import u5.C0625k;
import u5.C0626l;
import u5.C0627m;
import u5.C0628n;
import u5.D;
import u5.H;
import u5.I;
import u5.J;
import u5.K;
import u5.L;
import u5.t;
import u8.InterfaceC0808a;
import v8.C0846n;
import v8.C0851s;
import v8.C0852t;
import w8.C0855a;
import w9.A;
import w9.C0862a;

public final class c {

    public static final class a {
        private NetworkModule a;
        private com.withpersona.sdk2.inquiry.internal.network.b b;
        private C0392o c;
        private C0625k d;
        private C0401w e;
        private ha.i f;
        private C0379b g;
        private C0384g h;
        private T8.f i;
        private P8.d j;
        private b9.b k;
        private I8.c l;
        private C0479x m;
        private com.withpersona.sdk2.inquiry.internal.fallbackmode.a n;
        private C0556f o;
        private C0371C p;

        public a a(com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar) {
            this.n = (com.withpersona.sdk2.inquiry.internal.fallbackmode.a) C9.g.b(aVar);
            return this;
        }

        public ha.m b() {
            C9.g.a(this.a, NetworkModule.class);
            C9.g.a(this.b, com.withpersona.sdk2.inquiry.internal.network.b.class);
            C9.g.a(this.c, C0392o.class);
            if (this.d == null) {
                this.d = new C0625k();
            }
            C9.g.a(this.e, C0401w.class);
            C9.g.a(this.f, ha.i.class);
            C9.g.a(this.g, C0379b.class);
            C9.g.a(this.h, C0384g.class);
            if (this.i == null) {
                this.i = new T8.f();
            }
            C9.g.a(this.j, P8.d.class);
            C9.g.a(this.k, b9.b.class);
            C9.g.a(this.l, I8.c.class);
            if (this.m == null) {
                this.m = new C0479x();
            }
            C9.g.a(this.n, com.withpersona.sdk2.inquiry.internal.fallbackmode.a.class);
            C9.g.a(this.o, C0556f.class);
            C9.g.a(this.p, C0371C.class);
            return new b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p);
        }

        public a c(C0379b c0379b) {
            this.g = (C0379b) C9.g.b(c0379b);
            return this;
        }

        public a d(b9.b bVar) {
            this.k = (b9.b) C9.g.b(bVar);
            return this;
        }

        public a e(C0384g c0384g) {
            this.h = (C0384g) C9.g.b(c0384g);
            return this;
        }

        public a f(C0392o c0392o) {
            this.c = (C0392o) C9.g.b(c0392o);
            return this;
        }

        public a g(C0556f c0556f) {
            this.o = (C0556f) C9.g.b(c0556f);
            return this;
        }

        public a h(I8.c cVar) {
            this.l = (I8.c) C9.g.b(cVar);
            return this;
        }

        public a i(ha.i iVar) {
            this.f = (ha.i) C9.g.b(iVar);
            return this;
        }

        public a j(com.withpersona.sdk2.inquiry.internal.network.b bVar) {
            this.b = (com.withpersona.sdk2.inquiry.internal.network.b) C9.g.b(bVar);
            return this;
        }

        public a k(NetworkModule networkModule) {
            this.a = (NetworkModule) C9.g.b(networkModule);
            return this;
        }

        public a l(P8.d dVar) {
            this.j = (P8.d) C9.g.b(dVar);
            return this;
        }

        public a m(C0401w c0401w) {
            this.e = (C0401w) C9.g.b(c0401w);
            return this;
        }

        public a n(C0371C c0371c) {
            this.p = (C0371C) C9.g.b(c0371c);
            return this;
        }

        public a o(C0479x c0479x) {
            this.m = (C0479x) C9.g.b(c0479x);
            return this;
        }

        private a() {
        }
    }

    private static final class b implements ha.m {
        private C9.h<q> A;
        private C9.h<H> A0;
        private C9.h<FallbackMode> B;
        private com.withpersona.sdk2.inquiry.selfie.d B0;
        private C9.h<FallbackModeService> C;
        private C9.h<c.b> C0;
        private C9.h<E> D;
        private C9.h<e.c<PassportNfcReaderConfig>> D0;
        private I8.k E;
        private P8.j E0;
        private C9.h<i.a> F;
        private C9.h<b.a> F0;
        private C9.h<com.withpersona.sdk2.inquiry.internal.fallbackmode.d> G;
        private C9.h<InterfaceC0875b> G0;
        private com.withpersona.sdk2.inquiry.internal.fallbackmode.g H;
        private C9.h<e.c<C0378a>> H0;
        private C9.h<f.a> I;
        private C0862a I0;
        private C9.h<I8.a> J;
        private C9.h<b.a> J0;
        private C9.h<EnumC0342d> K;
        private A K0;
        private C9.h<I8.i> L;
        private C9.h<g.a> L0;
        private C9.h<d9.e> M;
        private C9.h<e.c<Uri>> M0;
        private C9.h<InterfaceC0550a> N;
        private C9.h<e.c<String[]>> N0;
        private w O;
        private C9.h<e.c<e.g>> O0;
        private C9.h<i.b> P;
        private C9.h<InterfaceC0759b> P0;
        private C9.h<InterfaceC0808a> Q;
        private C9.h<InterfaceC0459g> Q0;
        private l R;
        private C9.h<Window> R0;
        private C9.h<TransitionWorker.a> S;
        private C9.h<C0594a> S0;
        private C0337C T;
        private C9.h<com.withpersona.sdk2.inquiry.governmentid.h> T0;
        private C9.h<n.a> U;
        private C9.h<Set<com.squareup.workflow1.ui.A<?>>> U0;
        private C9.h<InterfaceC0883h> V;
        private C9.h<com.withpersona.sdk2.inquiry.selfie.f> V0;
        private C9.h<com.withpersona.sdk2.inquiry.governmentid.network.a> W;
        private C9.h<Set<com.squareup.workflow1.ui.A<?>>> W0;
        private C9.h<InterfaceC0482a> X;
        private C9.h<Set<com.squareup.workflow1.ui.A<?>>> X0;
        private C9.h<InterfaceC0574a> Y;
        private C9.h<C> Y0;
        private C9.h<o8.b> Z;
        private C9.h<C0343e> Z0;
        private final ha.i a;
        private C9.h<InterfaceC0723a> a0;
        private final C0625k b;
        private bb.d b0;
        private final b9.b c;
        private C9.h<c.a> c0;
        private final C0556f d;
        private C9.h<e.c<String[]>> d0;
        private final b e;
        private t e0;
        private C9.h<String> f;
        private C9.h<b.a> f0;
        private C9.h<Interceptor> g;
        private C0646g g0;
        private C9.h<Set<Object>> h;
        private C9.h<C0645f.a> h0;
        private C9.h<Set<JsonAdapterBinding<?>>> i;
        private C9.h<InterfaceC0555e> i0;
        private C9.h<Set<h.e>> j;
        private C9.h<C0586a> j0;
        private C9.h<com.squareup.moshi.w> k;
        private C9.h<e.c<String>> k0;
        private C9.h<Interceptor> l;
        private C9.h<e.c<IntentSenderRequest>> l0;
        private C9.h<T8.c> m;
        private Q8.i m0;
        private C9.h<Interceptor> n;
        private C9.h<a.InterfaceC0148a> n0;
        private C9.h<Set<Interceptor>> o;
        private C9.h<x<P9.o<D>>> o0;
        private C9.h<String> p;
        private C9.h<u5.w> p0;
        private C9.h<String> q;
        private com.withpersona.sdk2.inquiry.governmentid.f q0;
        private C9.h<Map<String, String>> r;
        private C9.h<GovernmentIdAnalyzeWorker.a> r0;
        private C9.h<Context> s;
        private P9.b s0;
        private C9.h<d9.j> t;
        private C9.h<GovernmentIdHintWorker.b> t0;
        private C9.h<d9.c> u;
        private C9.h<InterfaceC0895a> u0;
        private C9.h<d9.g> v;
        private C9.h<C0553c> v0;
        private C9.h<d9.b> w;
        private C9.h<InterfaceC0424a> w0;
        private C9.h<C0462j> x;
        private C0426c x0;
        private C9.h<OkHttpClient> y;
        private C9.h<C0425b.a> y0;
        private C9.h<u> z;
        private C9.h<x<P9.o<J>>> z0;

        private void A(NetworkModule networkModule, com.withpersona.sdk2.inquiry.internal.network.b bVar, C0392o c0392o, C0625k c0625k, C0401w c0401w, ha.i iVar, C0379b c0379b, C0384g c0384g, T8.f fVar, P8.d dVar, b9.b bVar2, I8.c cVar, C0479x c0479x, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar, C0556f c0556f, C0371C c0371c) {
            this.d0 = C9.c.c(C0395r.a(c0392o));
            t tVarA = t.a(this.s, this.a0);
            this.e0 = tVarA;
            this.f0 = com.withpersona.sdk2.camera.c.b(tVarA);
            C0646g c0646gA = C0646g.a(this.s, this.a0);
            this.g0 = c0646gA;
            this.h0 = C0647h.b(c0646gA);
            C0557g c0557gA = C0557g.a(c0556f);
            this.i0 = c0557gA;
            this.j0 = C9.c.c(C0587b.a(c0557gA));
            this.k0 = C9.c.c(C0403z.a(c0401w));
            C9.h<e.c<IntentSenderRequest>> hVarC = C9.c.c(C0374F.a(c0371c));
            this.l0 = hVarC;
            Q8.i iVarA = Q8.i.a(hVarC, this.s);
            this.m0 = iVarA;
            this.n0 = com.withpersona.sdk2.inquiry.permissions.b.b(iVarA);
            C9.h<x<P9.o<D>>> hVarC2 = C9.c.c(C0627m.a(c0625k));
            this.o0 = hVarC2;
            u5.x xVarA = u5.x.a(hVarC2);
            this.p0 = xVarA;
            com.withpersona.sdk2.inquiry.governmentid.f fVarA = com.withpersona.sdk2.inquiry.governmentid.f.a(this.s, xVarA);
            this.q0 = fVarA;
            this.r0 = com.withpersona.sdk2.inquiry.governmentid.g.b(fVarA);
            P9.b bVarA = P9.b.a(this.s, this.p0);
            this.s0 = bVarA;
            this.t0 = P9.c.b(bVarA);
            this.u0 = C9.c.c(p.a(bVar, this.z));
            this.v0 = C9.c.c(C0554d.a(this.i0));
            C9.h<InterfaceC0424a> hVarC3 = C9.c.c(J8.l.a(bVar, this.z));
            this.w0 = hVarC3;
            C0426c c0426cA = C0426c.a(this.s, hVarC3, this.X, this.Q, this.Y, this.a0);
            this.x0 = c0426cA;
            this.y0 = C0427d.b(c0426cA);
            this.z0 = C9.c.c(C0628n.a(c0625k));
            I iA = I.a(L.a(), this.z0);
            this.A0 = iA;
            this.B0 = com.withpersona.sdk2.inquiry.selfie.d.a(this.s, iA);
        }

        private void B(NetworkModule networkModule, com.withpersona.sdk2.inquiry.internal.network.b bVar, C0392o c0392o, C0625k c0625k, C0401w c0401w, ha.i iVar, C0379b c0379b, C0384g c0384g, T8.f fVar, P8.d dVar, b9.b bVar2, I8.c cVar, C0479x c0479x, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar, C0556f c0556f, C0371C c0371c) {
            this.C0 = com.withpersona.sdk2.inquiry.selfie.e.b(this.B0);
            C9.h<e.c<PassportNfcReaderConfig>> hVarC = C9.c.c(P8.g.a(dVar));
            this.D0 = hVarC;
            P8.j jVarA = P8.j.a(hVarC, this.s, this.m);
            this.E0 = jVarA;
            this.F0 = com.withpersona.sdk2.inquiry.nfc.c.b(jVarA);
            this.G0 = C9.c.c(J8.n.a(bVar, this.z));
            C9.h<e.c<C0378a>> hVarC2 = C9.c.c(C0382e.a(c0379b));
            this.H0 = hVarC2;
            C0862a c0862aA = C0862a.a(this.G0, this.N, hVarC2);
            this.I0 = c0862aA;
            this.J0 = com.withpersona.sdk2.inquiry.ui.c.b(c0862aA);
            A a = A.a(this.H0, this.G0, this.N);
            this.K0 = a;
            this.L0 = com.withpersona.sdk2.inquiry.ui.h.b(a);
            this.M0 = C9.c.c(C0391n.a(c0384g));
            this.N0 = C9.c.c(C0389l.a(c0384g));
            this.O0 = C9.c.c(C0390m.a(c0384g));
            this.P0 = C9.c.c(J8.d.a(bVar, this.z));
            this.Q0 = C9.c.c(C0443B.a(c0479x, C0475t.a()));
            ha.l lVarA = ha.l.a(iVar);
            this.R0 = lVarA;
            this.S0 = C9.c.c(C0445D.a(c0479x, lVarA));
            C0846n c0846nA = C0846n.a(this.p0, u5.q.a(), this.S0);
            this.T0 = c0846nA;
            this.U0 = C0852t.a(c0846nA);
            V8.k kVarA = V8.k.a(u5.q.a(), this.A0);
            this.V0 = kVarA;
            this.W0 = V8.p.a(kVarA);
            C9.j jVarC = C9.j.a(0, 8).a(J8.k.a()).a(this.U0).a(w9.k.a()).a(this.W0).a(C0736b.a()).a(T8.h.a()).a(M8.l.a()).a(Q8.o.a()).c();
            this.X0 = jVarC;
            this.Y0 = C9.c.c(J8.o.a(jVarC));
            this.Z0 = C9.c.c(ha.f.a(this.A, this.k, this.x));
        }

        private C0326a C() {
            return new C0326a(ha.j.a(this.a), (b.a) this.f0.get(), (C0645f.a) this.h0.get(), (C0586a) this.j0.get());
        }

        private C0428a D() {
            return new C0428a(ha.j.a(this.a), (b.a) this.f0.get(), (C0645f.a) this.h0.get(), (C0586a) this.j0.get());
        }

        private c.a E() {
            return new c.a(ha.j.a(this.a), (e.c) this.k0.get());
        }

        private PermissionRequestWorkflow F() {
            return new PermissionRequestWorkflow(ha.j.a(this.a), E(), n());
        }

        private com.withpersona.sdk2.inquiry.selfie.g G() {
            return new com.withpersona.sdk2.inquiry.selfie.g(H());
        }

        private H H() {
            return new H(new K(), (x) this.z0.get());
        }

        private com.withpersona.sdk2.inquiry.selfie.p I() {
            return new com.withpersona.sdk2.inquiry.selfie.p(ha.j.a(this.a), (C0425b.a) this.y0.get(), O(), (c.b) this.C0.get(), G(), F(), D(), (b.a) this.f0.get(), (C0645f.a) this.h0.get(), i(), (C0586a) this.j0.get(), (C0553c) this.v0.get());
        }

        private k.a J() {
            return new k.a((q) this.A.get(), (I8.i) this.L.get());
        }

        private b.a K() {
            return new b.a((InterfaceC0875b) this.G0.get());
        }

        private C0874a.C0318a L() {
            return new C0874a.C0318a((InterfaceC0875b) this.G0.get());
        }

        private com.withpersona.sdk2.inquiry.ui.f M() {
            return new com.withpersona.sdk2.inquiry.ui.f(ha.j.a(this.a), (b.a) this.F0.get(), (b.a) this.J0.get(), (g.a) this.L0.get(), (C0586a) this.j0.get(), F(), k(), (C0553c) this.v0.get());
        }

        private C0328c N() {
            return new C0328c(ha.j.a(this.a), (b.a) this.f0.get(), (C0645f.a) this.h0.get(), (C0586a) this.j0.get());
        }

        private C0896b.a O() {
            return new C0896b.a((InterfaceC0895a) this.u0.get());
        }

        private C0855a g() {
            return new C0855a((C0586a) this.j0.get());
        }

        private AutoClassifyWorker.b h() {
            return new AutoClassifyWorker.b((com.withpersona.sdk2.inquiry.governmentid.network.a) this.W.get(), (InterfaceC0574a) this.Y.get());
        }

        private InterfaceC0723a i() {
            return C0626l.a(this.b, C9.c.b(this.Z));
        }

        private C0872a j() {
            return new C0872a(ha.j.a(this.a), F(), (GovernmentIdAnalyzeWorker.a) this.r0.get(), (GovernmentIdHintWorker.b) this.t0.get(), O(), (b.a) this.f0.get(), (C0645f.a) this.h0.get(), (C0586a) this.j0.get());
        }

        private com.withpersona.sdk2.inquiry.ui.a k() {
            return new com.withpersona.sdk2.inquiry.ui.a(K(), L());
        }

        private a.C0126a l() {
            return new a.C0126a((q) this.A.get(), (InterfaceC0550a) this.N.get(), (I8.i) this.L.get());
        }

        private b.a m() {
            return new b.a((q) this.A.get(), (I8.i) this.L.get(), (T8.c) this.m.get());
        }

        private DeviceFeatureRequestWorkflow n() {
            return new DeviceFeatureRequestWorkflow(ha.j.a(this.a), (a.InterfaceC0148a) this.n0.get());
        }

        private com.withpersona.sdk2.inquiry.document.a o() {
            return new com.withpersona.sdk2.inquiry.document.a((e.c) this.M0.get(), ha.j.a(this.a));
        }

        private a.C0092a p() {
            return new a.C0092a((InterfaceC0759b) this.P0.get());
        }

        private C0758a.C0268a q() {
            return new C0758a.C0268a((InterfaceC0759b) this.P0.get());
        }

        private b.a r() {
            return new b.a((InterfaceC0759b) this.P0.get(), (InterfaceC0459g) this.Q0.get());
        }

        private c.a s() {
            return new c.a((InterfaceC0759b) this.P0.get());
        }

        private C0397t t() {
            return new C0397t((e.c) this.d0.get(), ha.j.a(this.a));
        }

        private d.a u() {
            return new d.a((InterfaceC0759b) this.P0.get(), (InterfaceC0808a) this.Q.get(), b9.c.b(this.c));
        }

        private DocumentWorkflow v() {
            return new DocumentWorkflow((InterfaceC0883h) this.V.get(), ha.j.a(this.a), F(), o(), w(), p(), s(), r(), q(), u(), (C0586a) this.j0.get(), (C0553c) this.v0.get());
        }

        private C0399v.b w() {
            return new C0399v.b((e.c) this.N0.get(), (e.c) this.O0.get(), ha.j.a(this.a));
        }

        private com.withpersona.sdk2.inquiry.governmentid.o x() {
            return new com.withpersona.sdk2.inquiry.governmentid.o(ha.j.a(this.a), (InterfaceC0883h) this.V.get(), (c.a) this.c0.get(), t(), C(), N(), j(), h(), g(), i(), (C0586a) this.j0.get(), (C0553c) this.v0.get());
        }

        private void y(NetworkModule networkModule, com.withpersona.sdk2.inquiry.internal.network.b bVar, C0392o c0392o, C0625k c0625k, C0401w c0401w, ha.i iVar, C0379b c0379b, C0384g c0384g, T8.f fVar, P8.d dVar, b9.b bVar2, I8.c cVar, C0479x c0479x, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar, C0556f c0556f, C0371C c0371c) {
            this.f = J8.m.a(bVar);
            this.g = NetworkModule_ResponseInterceptorFactory.create(networkModule);
            this.h = C9.j.a(0, 1).a(J8.i.a()).c();
            this.i = C9.j.a(0, 1).a(J8.h.a()).c();
            C9.j jVarC = C9.j.a(0, 3).a(NetworkModule_ProvideMoshiJsonAdapterFactoryFactory.create()).a(J8.j.a()).a(C0851s.a()).c();
            this.j = jVarC;
            C9.h<com.squareup.moshi.w> hVarC = C9.c.c(NetworkModule_MoshiFactory.create(networkModule, this.h, this.i, (C9.h<Set<h.e>>) jVarC));
            this.k = hVarC;
            this.l = NetworkModule_InterceptorFactory.create(networkModule, hVarC);
            C9.h<T8.c> hVarC2 = C9.c.c(T8.d.a());
            this.m = hVarC2;
            this.n = T8.g.a(fVar, hVarC2);
            this.o = C9.j.a(3, 0).b(this.g).b(this.l).b(this.n).c();
            this.p = NetworkModule_KeyInflectionFactory.create(networkModule);
            this.q = NetworkModule_UseServerStylesFactory.create(networkModule);
            this.r = C9.f.b(3).c("Key-Inflection", this.p).c("Persona-Use-Mobile-Server-Styles", this.q).c("User-Agent", com.withpersona.sdk2.inquiry.internal.network.c.a()).b();
            ha.j jVarB = ha.j.b(iVar);
            this.s = jVarB;
            d9.k kVarA = d9.k.a(jVarB);
            this.t = kVarA;
            this.u = C9.c.c(C0480y.b(c0479x, kVarA));
            d9.h hVarA = d9.h.a(this.s);
            this.v = hVarA;
            this.w = C9.c.c(C0442A.a(c0479x, hVarA));
            C0466k c0466kA = C0466k.a(this.s);
            this.x = c0466kA;
            NetworkModule_OkhttpClientFactory networkModule_OkhttpClientFactoryCreate = NetworkModule_OkhttpClientFactory.create(networkModule, this.o, this.r, this.s, this.u, this.w, (C9.h<C0462j>) c0466kA);
            this.y = networkModule_OkhttpClientFactoryCreate;
            C9.h<u> hVarC3 = C9.c.c(NetworkModule_RetrofitFactory.create(networkModule, this.f, (C9.h<OkHttpClient>) networkModule_OkhttpClientFactoryCreate, this.k));
            this.z = hVarC3;
            this.A = C9.c.c(J8.g.a(bVar, hVarC3));
            this.B = I8.e.a(cVar);
            this.C = C9.c.c(J8.e.a(bVar, this.z));
            this.D = I8.g.a(cVar);
        }

        private void z(NetworkModule networkModule, com.withpersona.sdk2.inquiry.internal.network.b bVar, C0392o c0392o, C0625k c0625k, C0401w c0401w, ha.i iVar, C0379b c0379b, C0384g c0384g, T8.f fVar, P8.d dVar, b9.b bVar2, I8.c cVar, C0479x c0479x, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar, C0556f c0556f, C0371C c0371c) {
            I8.k kVarA = I8.k.a(this.D);
            this.E = kVarA;
            C9.h<i.a> hVarB = com.withpersona.sdk2.inquiry.internal.fallbackmode.j.b(kVarA);
            this.F = hVarB;
            this.G = com.withpersona.sdk2.inquiry.internal.fallbackmode.e.a(this.C, this.k, hVarB);
            com.withpersona.sdk2.inquiry.internal.fallbackmode.g gVarA = com.withpersona.sdk2.inquiry.internal.fallbackmode.g.a(this.k, this.s, this.F);
            this.H = gVarA;
            C9.h<f.a> hVarB2 = com.withpersona.sdk2.inquiry.internal.fallbackmode.h.b(gVarA);
            this.I = hVarB2;
            this.J = com.withpersona.sdk2.inquiry.internal.fallbackmode.b.b(aVar, this.G, hVarB2);
            I8.d dVarA = I8.d.a(cVar);
            this.K = dVarA;
            this.L = C9.c.c(I8.j.a(this.B, this.J, dVarA, this.k));
            d9.f fVarA = d9.f.a(this.s);
            this.M = fVarA;
            C9.h<InterfaceC0550a> hVarC = C9.c.c(C0481z.a(c0479x, fVarA));
            this.N = hVarC;
            w wVarA = w.a(this.s, this.A, hVarC, this.m, this.L);
            this.O = wVarA;
            this.P = j.b(wVarA);
            C9.h<InterfaceC0808a> hVarC2 = C9.c.c(I8.f.a(cVar, this.L));
            this.Q = hVarC2;
            l lVarA = l.a(this.A, hVarC2);
            this.R = lVarA;
            this.S = m.b(lVarA);
            C0337C c0337cA = C0337C.a(this.s, this.A);
            this.T = c0337cA;
            this.U = o.b(c0337cA);
            this.V = C9.c.c(ha.k.a(iVar, this.s));
            this.W = C9.c.c(J8.f.a(bVar, this.z));
            this.X = b9.c.a(bVar2);
            this.Y = C9.c.c(C0444C.a(c0479x, f9.c.a()));
            C9.h<o8.b> hVarC3 = C9.c.c(o8.c.a(this.s));
            this.Z = hVarC3;
            C0626l c0626lB = C0626l.b(c0625k, hVarC3);
            this.a0 = c0626lB;
            bb.d dVarA2 = bb.d.a(this.s, this.W, this.X, this.Q, this.Y, c0626lB);
            this.b0 = dVarA2;
            this.c0 = bb.e.b(dVarA2);
        }

        @Override
        public InquiryWorkflow a() {
            return new InquiryWorkflow(ha.j.a(this.a), m(), l(), (i.b) this.P.get(), J(), (TransitionWorker.a) this.S.get(), (n.a) this.U.get(), x(), I(), M(), v(), (T8.c) this.m.get(), C0557g.b(this.d), (C0586a) this.j0.get(), (C0553c) this.v0.get());
        }

        @Override
        public C b() {
            return (C) this.Y0.get();
        }

        @Override
        public d9.c c() {
            return (d9.c) this.u.get();
        }

        @Override
        public C0343e d() {
            return (C0343e) this.Z0.get();
        }

        @Override
        public InterfaceC0883h e() {
            return (InterfaceC0883h) this.V.get();
        }

        @Override
        public C0594a f() {
            return (C0594a) this.S0.get();
        }

        private b(NetworkModule networkModule, com.withpersona.sdk2.inquiry.internal.network.b bVar, C0392o c0392o, C0625k c0625k, C0401w c0401w, ha.i iVar, C0379b c0379b, C0384g c0384g, T8.f fVar, P8.d dVar, b9.b bVar2, I8.c cVar, C0479x c0479x, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar, C0556f c0556f, C0371C c0371c) {
            this.e = this;
            this.a = iVar;
            this.b = c0625k;
            this.c = bVar2;
            this.d = c0556f;
            y(networkModule, bVar, c0392o, c0625k, c0401w, iVar, c0379b, c0384g, fVar, dVar, bVar2, cVar, c0479x, aVar, c0556f, c0371c);
            z(networkModule, bVar, c0392o, c0625k, c0401w, iVar, c0379b, c0384g, fVar, dVar, bVar2, cVar, c0479x, aVar, c0556f, c0371c);
            A(networkModule, bVar, c0392o, c0625k, c0401w, iVar, c0379b, c0384g, fVar, dVar, bVar2, cVar, c0479x, aVar, c0556f, c0371c);
            B(networkModule, bVar, c0392o, c0625k, c0401w, iVar, c0379b, c0384g, fVar, dVar, bVar2, cVar, c0479x, aVar, c0556f, c0371c);
        }
    }

    public static a a() {
        return new a();
    }
}
