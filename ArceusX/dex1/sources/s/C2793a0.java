package s;

import B.InterfaceC0275k;
import C.AbstractC0345p;
import C.C0316a0;
import C.InterfaceC0364z;
import C.V;
import S9.Gvmm.CAqKeu;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import androidx.concurrent.futures.c;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import g1.kQwt.YGBtcyQ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ka.oik.UJEa;
import n.InterfaceC2621a;
import r.C2739a;
import s.C2793a0;
import s.C2852u;
import w.C2954A;
import w.C2955B;
import z.C3043d0;
import z.T;

class C2793a0 {

    private final C2852u f23220a;

    private final C2955B f23221b;

    private final boolean f23222c;

    private final C.R0 f23223d;

    private final Executor f23224e;

    private final ScheduledExecutorService f23225f;

    private final boolean f23226g;

    private int f23227h = 1;

    static class a implements e {

        private final C2852u f23228a;

        private final w.n f23229b;

        private final int f23230c;

        private boolean f23231d = false;

        a(C2852u c2852u, int i7, w.n nVar) {
            this.f23228a = c2852u;
            this.f23230c = i7;
            this.f23229b = nVar;
        }

        public Object f(c.a aVar) throws Exception {
            this.f23228a.F().T(aVar);
            this.f23229b.b();
            return "AePreCapture";
        }

        public static Boolean g(Void r02) {
            return Boolean.TRUE;
        }

        @Override
        public com.google.common.util.concurrent.p<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (!C2793a0.e(this.f23230c, totalCaptureResult)) {
                return G.n.p(Boolean.FALSE);
            }
            C3043d0.a("Camera2CapturePipeline", "Trigger AE");
            this.f23231d = true;
            return G.d.a(androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
                @Override
                public final Object a(c.a aVar) {
                    return this.f23202a.f(aVar);
                }
            })).e(new InterfaceC2621a() {
                @Override
                public final Object apply(Object obj) {
                    return C2793a0.a.g((Void) obj);
                }
            }, F.a.a());
        }

        @Override
        public boolean b() {
            return this.f23230c == 0;
        }

        @Override
        public void c() {
            if (this.f23231d) {
                C3043d0.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f23228a.F().o(false, true);
                this.f23229b.a();
            }
        }
    }

    static class b implements e {

        private final C2852u f23232a;

        private boolean f23233b = false;

        b(C2852u c2852u) {
            this.f23232a = c2852u;
        }

        @Override
        public com.google.common.util.concurrent.p<Boolean> a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            com.google.common.util.concurrent.p<Boolean> pVarP = G.n.p(Boolean.TRUE);
            if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
                return pVarP;
            }
            int iIntValue = num.intValue();
            if (iIntValue == 1 || iIntValue == 2) {
                C3043d0.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    C3043d0.a("Camera2CapturePipeline", "Trigger AF");
                    this.f23233b = true;
                    this.f23232a.F().f0(null, false);
                }
            }
            return pVarP;
        }

        @Override
        public boolean b() {
            return true;
        }

        @Override
        public void c() {
            if (this.f23233b) {
                C3043d0.a(CAqKeu.XFdlszdI, "cancel TriggerAF");
                this.f23232a.F().o(true, false);
            }
        }
    }

    static class c implements InterfaceC0275k {

        private final Executor f23234a;

        private final d f23235b;

        private int f23236c;

        c(d dVar, Executor executor, int i7) {
            this.f23235b = dVar;
            this.f23234a = executor;
            this.f23236c = i7;
        }

        public Object e(c.a aVar) throws Exception {
            this.f23235b.j();
            aVar.c(null);
            return "invokePostCaptureFuture";
        }

        public static Void f(TotalCaptureResult totalCaptureResult) {
            return null;
        }

        @Override
        public com.google.common.util.concurrent.p<Void> a() {
            C3043d0.a("Camera2CapturePipeline", "invokePreCapture");
            return G.d.a(this.f23235b.k(this.f23236c)).e(new InterfaceC2621a() {
                @Override
                public final Object apply(Object obj) {
                    return C2793a0.c.f((TotalCaptureResult) obj);
                }
            }, this.f23234a);
        }

        @Override
        public com.google.common.util.concurrent.p<Void> b() {
            return androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
                @Override
                public final Object a(c.a aVar) {
                    return this.f23270a.e(aVar);
                }
            });
        }
    }

    static class d {

        private static final long f23237j;

        private static final long f23238k;

        private final int f23239a;

        private final Executor f23240b;

        private final ScheduledExecutorService f23241c;

        private final C2852u f23242d;

        private final w.n f23243e;

        private final boolean f23244f;

        private long f23245g = f23237j;

        final List<e> f23246h = new ArrayList();

        private final e f23247i = new a();

        class a implements e {
            a() {
            }

            public static Boolean e(List list) {
                return Boolean.valueOf(list.contains(Boolean.TRUE));
            }

            @Override
            public com.google.common.util.concurrent.p<Boolean> a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator<e> it = d.this.f23246h.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().a(totalCaptureResult));
                }
                return G.n.G(G.n.k(arrayList), new InterfaceC2621a() {
                    @Override
                    public final Object apply(Object obj) {
                        return C2793a0.d.a.e((List) obj);
                    }
                }, F.a.a());
            }

            @Override
            public boolean b() {
                Iterator<e> it = d.this.f23246h.iterator();
                while (it.hasNext()) {
                    if (it.next().b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override
            public void c() {
                Iterator<e> it = d.this.f23246h.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
            }
        }

        class b extends AbstractC0345p {

            final c.a f23249a;

            b(c.a aVar) {
                this.f23249a = aVar;
            }

            @Override
            public void a(int i7) {
                this.f23249a.f(new z.U(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override
            public void b(int i7, InterfaceC0364z interfaceC0364z) {
                this.f23249a.c(null);
            }

            @Override
            public void c(int i7, C.r rVar) {
                this.f23249a.f(new z.U(2, "Capture request failed with reason " + rVar.a(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f23237j = timeUnit.toNanos(1L);
            f23238k = timeUnit.toNanos(5L);
        }

        d(int i7, Executor executor, ScheduledExecutorService scheduledExecutorService, C2852u c2852u, boolean z7, w.n nVar) {
            this.f23239a = i7;
            this.f23240b = executor;
            this.f23241c = scheduledExecutorService;
            this.f23242d = c2852u;
            this.f23244f = z7;
            this.f23243e = nVar;
        }

        private void g(V.a aVar) {
            C2739a.C0218a c0218a = new C2739a.C0218a();
            c0218a.f(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.e(c0218a.a());
        }

        private void h(V.a aVar, C.V v7) {
            int i7 = (this.f23239a != 3 || this.f23244f) ? (v7.k() == -1 || v7.k() == 5) ? 2 : -1 : 4;
            if (i7 != -1) {
                aVar.v(i7);
            }
        }

        public com.google.common.util.concurrent.p l(List list, int i7, TotalCaptureResult totalCaptureResult) throws Exception {
            return r(list, i7);
        }

        public com.google.common.util.concurrent.p m(int i7, TotalCaptureResult totalCaptureResult) throws Exception {
            if (C2793a0.e(i7, totalCaptureResult)) {
                q(f23238k);
            }
            return this.f23247i.a(totalCaptureResult);
        }

        public static boolean n(TotalCaptureResult totalCaptureResult) {
            return C2793a0.d(totalCaptureResult, false);
        }

        public com.google.common.util.concurrent.p o(Boolean bool) throws Exception {
            return Boolean.TRUE.equals(bool) ? C2793a0.j(this.f23245g, this.f23241c, this.f23242d, new f.a() {
                @Override
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return C2793a0.d.n(totalCaptureResult);
                }
            }) : G.n.p(null);
        }

        public Object p(V.a aVar, c.a aVar2) throws Exception {
            aVar.c(new b(aVar2));
            return "submitStillCapture";
        }

        private void q(long j7) {
            this.f23245g = j7;
        }

        void f(e eVar) {
            this.f23246h.add(eVar);
        }

        com.google.common.util.concurrent.p<List<Void>> i(final List<C.V> list, final int i7) {
            G.d dVarG = G.d.a(k(i7)).g(new G.a() {
                @Override
                public final com.google.common.util.concurrent.p apply(Object obj) {
                    return this.f23323a.l(list, i7, (TotalCaptureResult) obj);
                }
            }, this.f23240b);
            dVarG.c(new Runnable() {
                @Override
                public final void run() {
                    this.f23331d.j();
                }
            }, this.f23240b);
            return dVarG;
        }

        public void j() {
            this.f23247i.c();
        }

        public com.google.common.util.concurrent.p<TotalCaptureResult> k(final int i7) {
            com.google.common.util.concurrent.p<TotalCaptureResult> pVarP = G.n.p(null);
            if (this.f23246h.isEmpty()) {
                return pVarP;
            }
            return G.d.a(this.f23247i.b() ? C2793a0.k(this.f23242d, null) : G.n.p(null)).g(new G.a() {
                @Override
                public final com.google.common.util.concurrent.p apply(Object obj) {
                    return this.f23356a.m(i7, (TotalCaptureResult) obj);
                }
            }, this.f23240b).g(new G.a() {
                @Override
                public final com.google.common.util.concurrent.p apply(Object obj) {
                    return this.f23373a.o((Boolean) obj);
                }
            }, this.f23240b);
        }

        com.google.common.util.concurrent.p<List<Void>> r(List<C.V> list, int i7) {
            androidx.camera.core.n nVarF;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C.V v7 : list) {
                final V.a aVarK = V.a.k(v7);
                InterfaceC0364z interfaceC0364zA = (v7.k() != 5 || this.f23242d.T().c() || this.f23242d.T().a() || (nVarF = this.f23242d.T().f()) == null || !this.f23242d.T().g(nVarF)) ? null : C.A.a(nVarF.D0());
                if (interfaceC0364zA != null) {
                    aVarK.p(interfaceC0364zA);
                } else {
                    h(aVarK, v7);
                }
                if (this.f23243e.c(i7)) {
                    g(aVarK);
                }
                arrayList.add(androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
                    @Override
                    public final Object a(c.a aVar) {
                        return this.f23348a.p(aVarK, aVar);
                    }
                }));
                arrayList2.add(aVarK.h());
            }
            this.f23242d.r0(arrayList2);
            return G.n.k(arrayList);
        }
    }

    interface e {
        com.google.common.util.concurrent.p<Boolean> a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    static class f implements C2852u.c {

        private c.a<TotalCaptureResult> f23251a;

        private final com.google.common.util.concurrent.p<TotalCaptureResult> f23252b = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f23389a.d(aVar);
            }
        });

        private final a f23253c;

        interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        f(a aVar) {
            this.f23253c = aVar;
        }

        public Object d(c.a aVar) throws Exception {
            this.f23251a = aVar;
            return "waitFor3AResult";
        }

        @Override
        public boolean a(TotalCaptureResult totalCaptureResult) {
            a aVar = this.f23253c;
            if (aVar != null && !aVar.a(totalCaptureResult)) {
                return false;
            }
            this.f23251a.c(totalCaptureResult);
            return true;
        }

        public com.google.common.util.concurrent.p<TotalCaptureResult> c() {
            return this.f23252b;
        }
    }

    static class g implements e {

        private static final long f23254f = TimeUnit.SECONDS.toNanos(2);

        private final C2852u f23255a;

        private final Executor f23256b;

        private final ScheduledExecutorService f23257c;

        private final T.i f23258d;

        private final C2954A f23259e;

        g(C2852u c2852u, Executor executor, ScheduledExecutorService scheduledExecutorService, C2954A c2954a) {
            this.f23255a = c2852u;
            this.f23256b = executor;
            this.f23257c = scheduledExecutorService;
            this.f23259e = c2954a;
            T.i iVarJ = c2852u.J();
            Objects.requireNonNull(iVarJ);
            this.f23258d = iVarJ;
        }

        public com.google.common.util.concurrent.p A(com.google.common.util.concurrent.p pVar, Object obj) throws Exception {
            return G.n.A(TimeUnit.SECONDS.toMillis(3L), this.f23257c, null, true, pVar);
        }

        public com.google.common.util.concurrent.p B(Void r1) throws Exception {
            return this.f23255a.F().d0();
        }

        public static boolean C(TotalCaptureResult totalCaptureResult) {
            return C2793a0.d(totalCaptureResult, false);
        }

        public static void q() {
            Log.d(YGBtcyQ.Twqd, "enableExternalFlashAeMode disabled");
        }

        public static void r(c.a aVar) {
            C3043d0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
            aVar.c(null);
        }

        public static Object s(AtomicReference atomicReference, final c.a aVar) throws Exception {
            atomicReference.set(new T.j() {
                @Override
                public final void a() {
                    C2793a0.g.r(aVar);
                }
            });
            return "OnScreenFlashUiApplied";
        }

        public com.google.common.util.concurrent.p t(Void r52) throws Exception {
            return C2793a0.j(f23254f, this.f23257c, this.f23255a, new f.a() {
                @Override
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return C2793a0.g.C(totalCaptureResult);
                }
            });
        }

        public static Boolean u(TotalCaptureResult totalCaptureResult) {
            return Boolean.FALSE;
        }

        public void v(AtomicReference atomicReference, c.a aVar) {
            C3043d0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            this.f23258d.a(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(3L), (T.j) atomicReference.get());
            aVar.c(null);
        }

        public Object w(final AtomicReference atomicReference, final c.a aVar) throws Exception {
            F.a.d().execute(new Runnable() {
                @Override
                public final void run() {
                    this.f23534d.v(atomicReference, aVar);
                }
            });
            return "OnScreenFlashStart";
        }

        public com.google.common.util.concurrent.p x(Void r22) throws Exception {
            return this.f23255a.F().v(true);
        }

        public Object y(c.a aVar) throws Exception {
            if (!this.f23259e.a()) {
                aVar.c(null);
                return "EnableTorchInternal";
            }
            C3043d0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
            this.f23255a.C(true);
            aVar.c(null);
            return "EnableTorchInternal";
        }

        public com.google.common.util.concurrent.p z(Void r1) throws Exception {
            return androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
                @Override
                public final Object a(c.a aVar) {
                    return this.f23528a.y(aVar);
                }
            });
        }

        @Override
        public com.google.common.util.concurrent.p<Boolean> a(TotalCaptureResult totalCaptureResult) {
            C3043d0.a("Camera2CapturePipeline", KwdswzaUHE.scZOnIGXNEK);
            final AtomicReference atomicReference = new AtomicReference();
            final com.google.common.util.concurrent.p pVarA = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
                @Override
                public final Object a(c.a aVar) {
                    return C2793a0.g.s(atomicReference, aVar);
                }
            });
            return G.d.a(androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
                @Override
                public final Object a(c.a aVar) {
                    return this.f23440a.w(atomicReference, aVar);
                }
            })).g(new G.a() {
                @Override
                public final com.google.common.util.concurrent.p apply(Object obj) {
                    return this.f23447a.x((Void) obj);
                }
            }, this.f23256b).g(new G.a() {
                @Override
                public final com.google.common.util.concurrent.p apply(Object obj) {
                    return this.f23452a.z((Void) obj);
                }
            }, this.f23256b).g(new G.a() {
                @Override
                public final com.google.common.util.concurrent.p apply(Object obj) {
                    return this.f23459a.A(pVarA, obj);
                }
            }, this.f23256b).g(new G.a() {
                @Override
                public final com.google.common.util.concurrent.p apply(Object obj) {
                    return this.f23493a.B((Void) obj);
                }
            }, this.f23256b).g(new G.a() {
                @Override
                public final com.google.common.util.concurrent.p apply(Object obj) {
                    return this.f23510a.t((Void) obj);
                }
            }, this.f23256b).e(new InterfaceC2621a() {
                @Override
                public final Object apply(Object obj) {
                    return C2793a0.g.u((TotalCaptureResult) obj);
                }
            }, F.a.a());
        }

        @Override
        public boolean b() {
            return false;
        }

        @Override
        public void c() {
            C3043d0.a("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
            if (this.f23259e.a()) {
                this.f23255a.C(false);
            }
            this.f23255a.F().v(false).c(new Runnable() {
                @Override
                public final void run() {
                    C2793a0.g.q();
                }
            }, this.f23256b);
            this.f23255a.F().o(false, true);
            ScheduledExecutorService scheduledExecutorServiceD = F.a.d();
            final T.i iVar = this.f23258d;
            Objects.requireNonNull(iVar);
            scheduledExecutorServiceD.execute(new Runnable() {
                @Override
                public final void run() {
                    iVar.clear();
                }
            });
        }
    }

    static class h implements e {

        private static final long f23260g = TimeUnit.SECONDS.toNanos(2);

        private final C2852u f23261a;

        private final int f23262b;

        private boolean f23263c = false;

        private final Executor f23264d;

        private final ScheduledExecutorService f23265e;

        private final boolean f23266f;

        h(C2852u c2852u, int i7, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z7) {
            this.f23261a = c2852u;
            this.f23262b = i7;
            this.f23264d = executor;
            this.f23265e = scheduledExecutorService;
            this.f23266f = z7;
        }

        public Object i(c.a aVar) throws Exception {
            this.f23261a.Q().g(aVar, true);
            return "TorchOn";
        }

        public com.google.common.util.concurrent.p j(Void r1) throws Exception {
            return this.f23266f ? this.f23261a.F().d0() : G.n.p(null);
        }

        public static boolean k(TotalCaptureResult totalCaptureResult) {
            return C2793a0.d(totalCaptureResult, true);
        }

        public com.google.common.util.concurrent.p l(Void r52) throws Exception {
            return C2793a0.j(f23260g, this.f23265e, this.f23261a, new f.a() {
                @Override
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return C2793a0.h.k(totalCaptureResult);
                }
            });
        }

        public static Boolean m(TotalCaptureResult totalCaptureResult) {
            return Boolean.FALSE;
        }

        @Override
        public com.google.common.util.concurrent.p<Boolean> a(TotalCaptureResult totalCaptureResult) {
            C3043d0.a("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + C2793a0.e(this.f23262b, totalCaptureResult));
            if (C2793a0.e(this.f23262b, totalCaptureResult)) {
                if (!this.f23261a.Z()) {
                    C3043d0.a("Camera2CapturePipeline", "Turn on torch");
                    this.f23263c = true;
                    return G.d.a(androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
                        @Override
                        public final Object a(c.a aVar) {
                            return this.f23571a.i(aVar);
                        }
                    })).g(new G.a() {
                        @Override
                        public final com.google.common.util.concurrent.p apply(Object obj) {
                            return this.f22930a.j((Void) obj);
                        }
                    }, this.f23264d).g(new G.a() {
                        @Override
                        public final com.google.common.util.concurrent.p apply(Object obj) {
                            return this.f22934a.l((Void) obj);
                        }
                    }, this.f23264d).e(new InterfaceC2621a() {
                        @Override
                        public final Object apply(Object obj) {
                            return C2793a0.h.m((TotalCaptureResult) obj);
                        }
                    }, F.a.a());
                }
                C3043d0.a("Camera2CapturePipeline", "Torch already on, not turn on");
            }
            return G.n.p(Boolean.FALSE);
        }

        @Override
        public boolean b() {
            return this.f23262b == 0;
        }

        @Override
        public void c() {
            if (this.f23263c) {
                this.f23261a.Q().g(null, false);
                C3043d0.a("Camera2CapturePipeline", "Turning off torch");
                if (this.f23266f) {
                    this.f23261a.F().o(false, true);
                }
            }
        }
    }

    C2793a0(C2852u c2852u, t.B b2, C.R0 r02, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f23220a = c2852u;
        Integer num = (Integer) b2.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f23226g = num != null && num.intValue() == 2;
        this.f23224e = executor;
        this.f23225f = scheduledExecutorService;
        this.f23223d = r02;
        this.f23221b = new C2955B(r02);
        this.f23222c = w.g.a(new C2789X(b2));
    }

    static boolean d(TotalCaptureResult totalCaptureResult, boolean z7) {
        if (totalCaptureResult == null) {
            return false;
        }
        return C0316a0.a(new C2810g(totalCaptureResult), z7);
    }

    static boolean e(int i7, TotalCaptureResult totalCaptureResult) {
        C3043d0.a("Camera2CapturePipeline", "isFlashRequired: flashMode = " + i7);
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    return false;
                }
                if (i7 != 3) {
                    throw new AssertionError(i7);
                }
            }
            return true;
        }
        Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
        C3043d0.a("Camera2CapturePipeline", "isFlashRequired: aeState = " + num);
        return num != null && num.intValue() == 4;
    }

    private boolean f(int i7) {
        return this.f23221b.a() || this.f23227h == 3 || i7 == 1;
    }

    static com.google.common.util.concurrent.p<TotalCaptureResult> j(long j7, ScheduledExecutorService scheduledExecutorService, C2852u c2852u, f.a aVar) {
        return G.n.A(TimeUnit.NANOSECONDS.toMillis(j7), scheduledExecutorService, null, true, k(c2852u, aVar));
    }

    static com.google.common.util.concurrent.p<TotalCaptureResult> k(final C2852u c2852u, f.a aVar) {
        final f fVar = new f(aVar);
        c2852u.z(fVar);
        com.google.common.util.concurrent.p<TotalCaptureResult> pVarC = fVar.c();
        pVarC.c(new Runnable() {
            @Override
            public final void run() {
                c2852u.k0(fVar);
            }
        }, c2852u.f23465c);
        return pVarC;
    }

    d b(int i7, int i8, int i9) {
        w.n nVar = new w.n(this.f23223d);
        d dVar = new d(this.f23227h, this.f23224e, this.f23225f, this.f23220a, this.f23226g, nVar);
        if (i7 == 0) {
            dVar.f(new b(this.f23220a));
        }
        if (i8 == 3) {
            dVar.f(new g(this.f23220a, this.f23224e, this.f23225f, new C2954A(this.f23223d)));
        } else if (this.f23222c) {
            if (f(i9)) {
                dVar.f(new h(this.f23220a, i8, this.f23224e, this.f23225f, (this.f23221b.a() || this.f23220a.W()) ? false : true));
            } else {
                dVar.f(new a(this.f23220a, i8, nVar));
            }
        }
        C3043d0.a(UJEa.qEJS, "createPipeline: captureMode = " + i7 + ", flashMode = " + i8 + ", flashType = " + i9 + ", pipeline tasks = " + dVar.f23246h);
        return dVar;
    }

    InterfaceC0275k c(int i7, int i8, int i9) {
        return new c(b(i7, i8, i9), this.f23224e, i8);
    }

    public void h(int i7) {
        this.f23227h = i7;
    }

    public com.google.common.util.concurrent.p<List<Void>> i(List<C.V> list, int i7, int i8, int i9) {
        return G.n.B(b(i7, i8, i9).i(list, i8));
    }
}
