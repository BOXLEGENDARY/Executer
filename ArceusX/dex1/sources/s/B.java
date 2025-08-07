package S;

import C.F0;
import C.H0;
import C.b1;
import C.h1;
import S.AbstractC1229k;
import S.H;
import S.h0;
import S.i0;
import S9.Gvmm.CAqKeu;
import W0.JWp.kNUgEaOjcPdX;
import X.C1534e;
import X.InterfaceC1535f;
import X.InterfaceC1538i;
import X.InterfaceC1539j;
import X.InterfaceC1540k;
import X.InterfaceC1541l;
import X.k0;
import X.m0;
import android.media.MediaMuxer;
import android.net.Uri;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.concurrent.futures.c;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import x0.InterfaceC2984a;
import z.C3043d0;
import z.C3070z;
import z.F0;
import z.InterfaceC3060o;

public final class B implements h0 {

    private static final Set<i> f6082f0 = Collections.unmodifiableSet(EnumSet.of(i.PENDING_RECORDING, i.f6182i));

    private static final Set<i> f6083g0 = Collections.unmodifiableSet(EnumSet.of(i.CONFIGURING, i.IDLING, i.RESETTING, i.STOPPING, i.ERROR));

    public static final C1233o f6084h0;

    private static final i0 f6085i0;

    private static final AbstractC1229k f6086j0;

    private static final Exception f6087k0;

    static final InterfaceC1541l f6088l0;

    private static final Executor f6089m0;

    static int f6090n0;

    static long f6091o0;

    final F0<AbstractC1229k> f6092A;

    InterfaceC1538i f6093B;

    X.e0 f6094C;

    InterfaceC1538i f6095D;

    X.e0 f6096E;

    e f6097F;

    Uri f6098G;

    long f6099H;

    long f6100I;

    long f6101J;

    int f6102K;

    Range<Integer> f6103L;

    long f6104M;

    long f6105N;

    long f6106O;

    long f6107P;

    long f6108Q;

    int f6109R;

    Throwable f6110S;

    InterfaceC1535f f6111T;

    final L.c<InterfaceC1535f> f6112U;

    Throwable f6113V;

    boolean f6114W;

    h0.a f6115X;

    ScheduledFuture<?> f6116Y;

    private boolean f6117Z;

    private final F0<H> f6118a;

    g0 f6119a0;

    private final F0<Boolean> f6120b;

    g0 f6121b0;

    private final Executor f6122c;

    double f6123c0;

    private final Executor f6124d;

    private boolean f6125d0;

    final Executor f6126e;

    private h f6127e0;

    private final InterfaceC1541l f6128f;

    private final InterfaceC1541l f6129g;

    private final Object f6130h = new Object();

    private final boolean f6131i;

    private final int f6132j;

    private i f6133k;

    private i f6134l;

    int f6135m;

    private long f6136n;

    boolean f6137o;

    private F0.h f6138p;

    private F0.h f6139q;

    private U.g f6140r;

    final List<com.google.common.util.concurrent.p<Void>> f6141s;

    Integer f6142t;

    Integer f6143u;

    z.F0 f6144v;

    h1 f6145w;

    Surface f6146x;

    Surface f6147y;

    MediaMuxer f6148z;

    class a implements G.c<InterfaceC1538i> {

        final g0 f6149a;

        a(g0 g0Var) {
            this.f6149a = g0Var;
        }

        @Override
        public void onSuccess(InterfaceC1538i interfaceC1538i) {
            InterfaceC1538i interfaceC1538i2;
            C3043d0.a(kNUgEaOjcPdX.YbBpvmjt, "VideoEncoder can be released: " + interfaceC1538i);
            if (interfaceC1538i == null) {
                return;
            }
            ScheduledFuture<?> scheduledFuture = B.this.f6116Y;
            if (scheduledFuture != null && scheduledFuture.cancel(false) && (interfaceC1538i2 = B.this.f6093B) != null && interfaceC1538i2 == interfaceC1538i) {
                B.S(interfaceC1538i2);
            }
            B b2 = B.this;
            b2.f6121b0 = this.f6149a;
            b2.h0(null);
            B b3 = B.this;
            b3.a0(4, null, b3.G());
        }

        @Override
        public void onFailure(Throwable th) {
            C3043d0.a("Recorder", "Error in ReadyToReleaseFuture: " + th);
        }
    }

    class b implements InterfaceC1539j {

        final c.a f6151b;

        b(c.a aVar, g gVar) {
            this.f6151b = aVar;
        }

        @Override
        public void a() {
        }

        @Override
        public void b() {
            this.f6151b.c(null);
        }

        @Override
        public void c(InterfaceC1535f interfaceC1535f) {
            boolean z7;
            B b2 = B.this;
            if (b2.f6148z != null) {
                try {
                    b2.r0(interfaceC1535f, null);
                    if (interfaceC1535f != null) {
                        interfaceC1535f.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (interfaceC1535f != null) {
                        try {
                            interfaceC1535f.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (b2.f6137o) {
                C3043d0.a("Recorder", "Drop video data since recording is stopping.");
                interfaceC1535f.close();
                return;
            }
            InterfaceC1535f interfaceC1535f2 = b2.f6111T;
            if (interfaceC1535f2 != null) {
                interfaceC1535f2.close();
                B.this.f6111T = null;
                z7 = true;
            } else {
                z7 = false;
            }
            if (!interfaceC1535f.g0()) {
                if (z7) {
                    C3043d0.a("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                }
                C3043d0.a("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                B.this.f6093B.h();
                interfaceC1535f.close();
                return;
            }
            B b3 = B.this;
            b3.f6111T = interfaceC1535f;
            if (!b3.F() || !B.this.f6112U.isEmpty()) {
                C3043d0.a("Recorder", "Received video keyframe. Starting muxer...");
                B.this.k0(null);
            } else if (z7) {
                C3043d0.a("Recorder", "Replaced cached video keyframe with newer keyframe.");
            } else {
                C3043d0.a("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
            }
        }

        @Override
        public void d(C1534e c1534e) {
            this.f6151b.f(c1534e);
        }

        @Override
        public void e(X.e0 e0Var) {
            B.this.f6094C = e0Var;
        }
    }

    class c {

        final InterfaceC2984a f6153a;

        c(InterfaceC2984a interfaceC2984a) {
            this.f6153a = interfaceC2984a;
        }
    }

    class d implements G.c<List<Void>> {
        d() {
        }

        @Override
        public void onSuccess(List<Void> list) {
            C3043d0.a("Recorder", "Encodings end successfully.");
            B b2 = B.this;
            b2.z(b2.f6109R, b2.f6110S);
        }

        @Override
        public void onFailure(Throwable th) {
            B.this.getClass();
            x0.g.j(false, CAqKeu.frObzchAAfHXZ);
            B.this.getClass();
            throw null;
        }
    }

    enum e {
        INITIALIZING,
        IDLING,
        DISABLED,
        f6159v,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    public static final class f {

        private final AbstractC1229k.a f6163a;

        private int f6164b = 0;

        private Executor f6165c = null;

        private InterfaceC1541l f6166d;

        private InterfaceC1541l f6167e;

        public f() {
            InterfaceC1541l interfaceC1541l = B.f6088l0;
            this.f6166d = interfaceC1541l;
            this.f6167e = interfaceC1541l;
            this.f6163a = AbstractC1229k.a();
        }

        public B c() {
            return new B(this.f6165c, this.f6163a.a(), this.f6164b, this.f6166d, this.f6167e);
        }

        public f f(final int i7) {
            this.f6163a.b(new InterfaceC2984a() {
                @Override
                public final void accept(Object obj) {
                    ((i0.a) obj).b(i7);
                }
            });
            return this;
        }

        public f g(final C1233o c1233o) {
            x0.g.h(c1233o, "The specified quality selector can't be null.");
            this.f6163a.b(new InterfaceC2984a() {
                @Override
                public final void accept(Object obj) {
                    ((i0.a) obj).e(c1233o);
                }
            });
            return this;
        }
    }

    static abstract class g implements AutoCloseable {
    }

    class h {

        private final z.F0 f6168a;

        private final h1 f6169b;

        private final int f6170c;

        private boolean f6171d = false;

        private int f6172e = 0;

        private ScheduledFuture<?> f6173f = null;

        class a implements G.c<InterfaceC1538i> {

            final g0 f6175a;

            a(g0 g0Var) {
                this.f6175a = g0Var;
            }

            public void b() {
                if (h.this.f6171d) {
                    return;
                }
                C3043d0.a("Recorder", "Retry setupVideo #" + h.this.f6172e);
                h hVar = h.this;
                hVar.l(hVar.f6168a, h.this.f6169b);
            }

            @Override
            public void onSuccess(InterfaceC1538i interfaceC1538i) {
                C3043d0.a("Recorder", "VideoEncoder is created. " + interfaceC1538i);
                if (interfaceC1538i == null) {
                    return;
                }
                x0.g.i(B.this.f6119a0 == this.f6175a);
                x0.g.i(B.this.f6093B == null);
                B.this.Z(this.f6175a);
                B.this.T();
            }

            @Override
            public void onFailure(Throwable th) {
                C3043d0.m("Recorder", "VideoEncoder Setup error: " + th, th);
                if (h.this.f6172e >= h.this.f6170c) {
                    B.this.U(th);
                    return;
                }
                h.e(h.this);
                h.this.f6173f = B.f0(new Runnable() {
                    @Override
                    public final void run() {
                        this.f6192d.b();
                    }
                }, B.this.f6126e, B.f6091o0, TimeUnit.MILLISECONDS);
            }
        }

        h(z.F0 f02, h1 h1Var, int i7) {
            this.f6168a = f02;
            this.f6169b = h1Var;
            this.f6170c = i7;
        }

        static int e(h hVar) {
            int i7 = hVar.f6172e;
            hVar.f6172e = i7 + 1;
            return i7;
        }

        public void k(z.F0 f02, h1 h1Var) {
            if (!f02.t() && (!B.this.f6119a0.n(f02) || B.this.G())) {
                InterfaceC1541l interfaceC1541l = B.this.f6128f;
                B b2 = B.this;
                g0 g0Var = new g0(interfaceC1541l, b2.f6126e, b2.f6124d);
                B b3 = B.this;
                com.google.common.util.concurrent.p<InterfaceC1538i> pVarI = g0Var.i(f02, h1Var, (AbstractC1229k) b3.B(b3.f6092A), B.this.f6140r);
                B.this.f6119a0 = g0Var;
                G.n.j(pVarI, new a(g0Var), B.this.f6126e);
                return;
            }
            C3043d0.l("Recorder", "Ignore the SurfaceRequest " + f02 + " isServiced: " + f02.t() + " VideoEncoderSession: " + B.this.f6119a0 + " has been configured with a persistent in-progress recording.");
        }

        public void l(final z.F0 f02, final h1 h1Var) {
            B.this.e0().c(new Runnable() {
                @Override
                public final void run() {
                    this.f6189d.k(f02, h1Var);
                }
            }, B.this.f6126e);
        }

        void j() {
            if (this.f6171d) {
                return;
            }
            this.f6171d = true;
            ScheduledFuture<?> scheduledFuture = this.f6173f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f6173f = null;
            }
        }

        void m() {
            l(this.f6168a, this.f6169b);
        }
    }

    enum i {
        CONFIGURING,
        PENDING_RECORDING,
        f6182i,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        C1230l c1230l = C1230l.f6338c;
        C1233o c1233oC = C1233o.c(Arrays.asList(c1230l, C1230l.f6337b, C1230l.f6336a), C1228j.a(c1230l));
        f6084h0 = c1233oC;
        i0 i0VarA = i0.a().e(c1233oC).b(-1).a();
        f6085i0 = i0VarA;
        f6086j0 = AbstractC1229k.a().e(-1).f(i0VarA).a();
        f6087k0 = new RuntimeException("The video frame producer became inactive before any data was received.");
        f6088l0 = new InterfaceC1541l() {
            @Override
            public final InterfaceC1538i a(Executor executor, InterfaceC1540k interfaceC1540k) {
                return new X.E(executor, interfaceC1540k);
            }
        };
        f6089m0 = F.a.f(F.a.c());
        f6090n0 = 3;
        f6091o0 = 1000L;
    }

    B(Executor executor, AbstractC1229k abstractC1229k, int i7, InterfaceC1541l interfaceC1541l, InterfaceC1541l interfaceC1541l2) {
        this.f6131i = androidx.camera.video.internal.compat.quirk.a.b(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.f6133k = i.CONFIGURING;
        this.f6134l = null;
        this.f6135m = 0;
        this.f6136n = 0L;
        this.f6137o = false;
        this.f6138p = null;
        this.f6139q = null;
        this.f6140r = null;
        this.f6141s = new ArrayList();
        this.f6142t = null;
        this.f6143u = null;
        this.f6146x = null;
        this.f6147y = null;
        this.f6148z = null;
        this.f6093B = null;
        this.f6094C = null;
        this.f6095D = null;
        this.f6096E = null;
        this.f6097F = e.INITIALIZING;
        this.f6098G = Uri.EMPTY;
        this.f6099H = 0L;
        this.f6100I = 0L;
        this.f6101J = Long.MAX_VALUE;
        this.f6102K = 0;
        this.f6103L = null;
        this.f6104M = Long.MAX_VALUE;
        this.f6105N = Long.MAX_VALUE;
        this.f6106O = Long.MAX_VALUE;
        this.f6107P = 0L;
        this.f6108Q = 0L;
        this.f6109R = 1;
        this.f6110S = null;
        this.f6111T = null;
        this.f6112U = new L.a(60);
        this.f6113V = null;
        this.f6114W = false;
        this.f6115X = h0.a.INACTIVE;
        this.f6116Y = null;
        this.f6117Z = false;
        this.f6121b0 = null;
        this.f6123c0 = 0.0d;
        this.f6125d0 = false;
        this.f6127e0 = null;
        this.f6122c = executor;
        executor = executor == null ? F.a.c() : executor;
        this.f6124d = executor;
        Executor executorF = F.a.f(executor);
        this.f6126e = executorF;
        this.f6092A = C.F0.h(x(abstractC1229k));
        this.f6132j = i7;
        this.f6118a = C.F0.h(H.d(this.f6135m, E(this.f6133k)));
        this.f6120b = C.F0.h(Boolean.FALSE);
        this.f6128f = interfaceC1541l;
        this.f6129g = interfaceC1541l2;
        this.f6119a0 = new g0(interfaceC1541l, executorF, executor);
    }

    private List<InterfaceC1535f> A(long j7) {
        ArrayList arrayList = new ArrayList();
        while (!this.f6112U.isEmpty()) {
            InterfaceC1535f interfaceC1535fA = this.f6112U.a();
            if (interfaceC1535fA.U0() >= j7) {
                arrayList.add(interfaceC1535fA);
            }
        }
        return arrayList;
    }

    public static I C(InterfaceC3060o interfaceC3060o) {
        return D(interfaceC3060o, 0);
    }

    public static I D(InterfaceC3060o interfaceC3060o, int i7) {
        return new G(i7, (C.I) interfaceC3060o, m0.f7861d);
    }

    private H.a E(i iVar) {
        return (iVar == i.RECORDING || (iVar == i.STOPPING && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) androidx.camera.video.internal.compat.quirk.a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? H.a.f6200d : H.a.INACTIVE;
    }

    public static void H(i0.a aVar) {
        aVar.b(f6085i0.b());
    }

    public void I(F0.h hVar) {
        this.f6139q = hVar;
    }

    public void M(Uri uri) {
        this.f6098G = uri;
    }

    public static void N(InterfaceC1538i interfaceC1538i) {
        C3043d0.a("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
        if (androidx.camera.video.internal.compat.quirk.a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
            S(interfaceC1538i);
        }
    }

    public Object O(g gVar, c.a aVar) throws Exception {
        this.f6093B.f(new b(aVar, gVar), this.f6126e);
        return "videoEncodingFuture";
    }

    public void P(c.a aVar, Throwable th) {
        if (this.f6113V == null) {
            if (th instanceof C1534e) {
                g0(e.ERROR_ENCODER);
            } else {
                g0(e.ERROR_SOURCE);
            }
            this.f6113V = th;
            p0();
            aVar.c(null);
        }
    }

    public Object Q(g gVar, final c.a aVar) throws Exception {
        new c(new InterfaceC2984a() {
            @Override
            public final void accept(Object obj) {
                this.f6353a.P(aVar, (Throwable) obj);
            }
        });
        throw null;
    }

    private g R(i iVar) {
        if (iVar == i.f6182i || iVar == i.PENDING_RECORDING) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
    }

    static void S(InterfaceC1538i interfaceC1538i) {
        if (interfaceC1538i instanceof X.E) {
            ((X.E) interfaceC1538i).o0();
        }
    }

    private void W() {
        boolean z7;
        z.F0 f02;
        synchronized (this.f6130h) {
            try {
                switch (this.f6133k.ordinal()) {
                    case 1:
                    case 2:
                        q0(i.CONFIGURING);
                        z7 = true;
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (G()) {
                            z7 = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        i0(i.CONFIGURING);
                        z7 = true;
                        break;
                    default:
                        z7 = true;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6117Z = false;
        if (!z7 || (f02 = this.f6144v) == null || f02.t()) {
            return;
        }
        y(this.f6144v, this.f6145w, false);
    }

    public void K(z.F0 f02, h1 h1Var) {
        z.F0 f03 = this.f6144v;
        if (f03 != null && !f03.t()) {
            this.f6144v.G();
        }
        this.f6144v = f02;
        this.f6145w = h1Var;
        y(f02, h1Var, true);
    }

    private void b0() {
        if (this.f6095D != null) {
            C3043d0.a("Recorder", "Releasing audio encoder.");
            this.f6095D.a();
            this.f6095D = null;
            this.f6096E = null;
        }
        g0(e.INITIALIZING);
        c0();
    }

    private void c0() {
        if (this.f6093B != null) {
            C3043d0.a("Recorder", "Releasing video encoder.");
            n0();
        }
        W();
    }

    private void d0() {
        if (f6082f0.contains(this.f6133k)) {
            i0(this.f6134l);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.f6133k);
    }

    public com.google.common.util.concurrent.p<Void> e0() {
        C3043d0.a("Recorder", "Try to safely release video encoder: " + this.f6093B);
        return this.f6119a0.w();
    }

    public static ScheduledFuture<?> f0(final Runnable runnable, final Executor executor, long j7, TimeUnit timeUnit) {
        return F.a.d().schedule(new Runnable() {
            @Override
            public final void run() {
                executor.execute(runnable);
            }
        }, j7, timeUnit);
    }

    private void j0(int i7) {
        if (this.f6135m == i7) {
            return;
        }
        C3043d0.a("Recorder", JmBUOGMwkkxg.bCSs + this.f6135m + " --> " + i7);
        this.f6135m = i7;
        this.f6118a.g(H.e(i7, E(this.f6133k), this.f6138p));
    }

    private static int m0(U.g gVar, int i7) {
        if (gVar != null) {
            int iB = gVar.b();
            if (iB == 1) {
                return 2;
            }
            if (iB == 2) {
                return 0;
            }
            if (iB == 9) {
                return 1;
            }
        }
        return i7;
    }

    private void n0() {
        g0 g0Var = this.f6121b0;
        if (g0Var == null) {
            e0();
            return;
        }
        x0.g.i(g0Var.m() == this.f6093B);
        C3043d0.a("Recorder", "Releasing video encoder: " + this.f6093B);
        this.f6121b0.x();
        this.f6121b0 = null;
        this.f6093B = null;
        this.f6094C = null;
        h0(null);
    }

    private void o0(final g gVar, boolean z7) {
        if (!this.f6141s.isEmpty()) {
            com.google.common.util.concurrent.p pVarK = G.n.k(this.f6141s);
            if (!pVarK.isDone()) {
                pVarK.cancel(true);
            }
            this.f6141s.clear();
        }
        this.f6141s.add(androidx.concurrent.futures.c.a(new c.InterfaceC0078c(gVar) {
            @Override
            public final Object a(c.a aVar) {
                return this.f6081a.O(null, aVar);
            }
        }));
        if (F() && !z7) {
            this.f6141s.add(androidx.concurrent.futures.c.a(new c.InterfaceC0078c(gVar) {
                @Override
                public final Object a(c.a aVar) {
                    return this.f6352a.Q(null, aVar);
                }
            }));
        }
        G.n.j(G.n.k(this.f6141s), new d(), F.a.a());
    }

    private void q0(i iVar) {
        if (!f6082f0.contains(this.f6133k)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f6133k);
        }
        if (!f6083g0.contains(iVar)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + iVar);
        }
        if (this.f6134l != iVar) {
            this.f6134l = iVar;
            this.f6118a.g(H.e(this.f6135m, E(iVar), this.f6138p));
        }
    }

    private void w() {
        while (!this.f6112U.isEmpty()) {
            this.f6112U.a();
        }
    }

    private AbstractC1229k x(AbstractC1229k abstractC1229k) {
        AbstractC1229k.a aVarG = abstractC1229k.g();
        if (abstractC1229k.d().b() == -1) {
            aVarG.b(new InterfaceC2984a() {
                @Override
                public final void accept(Object obj) {
                    B.H((i0.a) obj);
                }
            });
        }
        return aVarG.a();
    }

    private void y(z.F0 f02, h1 h1Var, boolean z7) {
        if (f02.t()) {
            C3043d0.l("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        f02.E(this.f6126e, new F0.i() {
            @Override
            public final void a(F0.h hVar) {
                this.f6357a.I(hVar);
            }
        });
        Size sizeP = f02.p();
        C3070z c3070zN = f02.n();
        I iC = C(f02.l().c());
        C1230l c1230lC = iC.c(sizeP, c3070zN);
        C3043d0.a("Recorder", "Using supported quality of " + c1230lC + " for surface size " + sizeP);
        if (c1230lC != C1230l.f6342g) {
            U.g gVarA = iC.a(c1230lC, c3070zN);
            this.f6140r = gVarA;
            if (gVarA == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        h hVar = this.f6127e0;
        if (hVar != null) {
            hVar.j();
        }
        h hVar2 = new h(f02, h1Var, z7 ? f6090n0 : 0);
        this.f6127e0 = hVar2;
        hVar2.m();
    }

    <T> T B(b1<T> b1Var) {
        try {
            return b1Var.d().get();
        } catch (InterruptedException | ExecutionException e7) {
            throw new IllegalStateException(e7);
        }
    }

    boolean F() {
        return this.f6097F == e.f6159v;
    }

    boolean G() {
        return false;
    }

    void T() {
        throw new UnsupportedOperationException("Method not decompiled: S.B.T():void");
    }

    void U(Throwable th) {
        synchronized (this.f6130h) {
            try {
                switch (this.f6133k) {
                    case CONFIGURING:
                    case PENDING_RECORDING:
                    case f6182i:
                        j0(-1);
                        i0(i.ERROR);
                        break;
                    case IDLING:
                    case RECORDING:
                    case PAUSED:
                    case STOPPING:
                    case RESETTING:
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.f6133k + ": " + th);
                }
            } finally {
            }
        }
    }

    void V(g gVar, int i7, Throwable th) {
        boolean z7;
        synchronized (this.f6130h) {
            try {
                z7 = false;
                switch (this.f6133k) {
                    case CONFIGURING:
                    case IDLING:
                    case ERROR:
                        throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.f6133k);
                    case RECORDING:
                    case PAUSED:
                        i0(i.STOPPING);
                        z7 = true;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z7) {
            l0(gVar, -1L, i7, th);
        }
    }

    public void J(h0.a aVar) {
        ScheduledFuture<?> scheduledFuture;
        InterfaceC1538i interfaceC1538i;
        h0.a aVar2 = this.f6115X;
        this.f6115X = aVar;
        if (aVar2 == aVar) {
            C3043d0.a("Recorder", "Video source transitions to the same state: " + aVar);
            return;
        }
        C3043d0.a("Recorder", "Video source has transitioned to state: " + aVar);
        if (aVar != h0.a.INACTIVE) {
            if (aVar != h0.a.ACTIVE_NON_STREAMING || (scheduledFuture = this.f6116Y) == null || !scheduledFuture.cancel(false) || (interfaceC1538i = this.f6093B) == null) {
                return;
            }
            S(interfaceC1538i);
            return;
        }
        if (this.f6147y != null) {
            this.f6117Z = true;
            return;
        }
        h hVar = this.f6127e0;
        if (hVar != null) {
            hVar.j();
            this.f6127e0 = null;
        }
        a0(4, null, false);
    }

    void Z(g0 g0Var) {
        InterfaceC1538i interfaceC1538iM = g0Var.m();
        this.f6093B = interfaceC1538iM;
        this.f6103L = ((k0) interfaceC1538iM.e()).c();
        this.f6102K = this.f6093B.i();
        Surface surfaceK = g0Var.k();
        this.f6147y = surfaceK;
        h0(surfaceK);
        g0Var.v(this.f6126e, new InterfaceC1538i.b.a() {
            @Override
            public final void a(Surface surface) {
                this.f6364a.h0(surface);
            }
        });
        G.n.j(g0Var.l(), new a(g0Var), this.f6126e);
    }

    @Override
    public void a(z.F0 f02) {
        b(f02, h1.UPTIME);
    }

    void a0(int i7, Throwable th, boolean z7) {
        boolean z8;
        boolean z9;
        synchronized (this.f6130h) {
            try {
                z8 = true;
                z9 = false;
                switch (this.f6133k) {
                    case CONFIGURING:
                    case IDLING:
                    case ERROR:
                        break;
                    case PENDING_RECORDING:
                    case f6182i:
                        q0(i.RESETTING);
                        break;
                    case RECORDING:
                    case PAUSED:
                        x0.g.j(false, "In-progress recording shouldn't be null when in state " + this.f6133k);
                        if (!G()) {
                            i0(i.RESETTING);
                            z9 = true;
                            z8 = false;
                            break;
                        } else {
                            break;
                        }
                    case STOPPING:
                        i0(i.RESETTING);
                        z8 = false;
                        break;
                    case RESETTING:
                    default:
                        z8 = false;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z8) {
            if (z9) {
                l0(null, -1L, i7, th);
            }
        } else if (z7) {
            c0();
        } else {
            b0();
        }
    }

    @Override
    public void b(final z.F0 f02, final h1 h1Var) {
        synchronized (this.f6130h) {
            try {
                C3043d0.a("Recorder", "Surface is requested in state: " + this.f6133k + ", Current surface: " + this.f6135m);
                if (this.f6133k == i.ERROR) {
                    i0(i.CONFIGURING);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6126e.execute(new Runnable() {
            @Override
            public final void run() {
                this.f6359d.K(f02, h1Var);
            }
        });
    }

    @Override
    public void c(final h0.a aVar) {
        this.f6126e.execute(new Runnable() {
            @Override
            public final void run() {
                this.f6355d.J(aVar);
            }
        });
    }

    @Override
    public I d(InterfaceC3060o interfaceC3060o) {
        return D(interfaceC3060o, this.f6132j);
    }

    @Override
    public H0<AbstractC1229k> e() {
        return this.f6092A;
    }

    @Override
    public H0<H> f() {
        return this.f6118a;
    }

    @Override
    public H0<Boolean> g() {
        return this.f6120b;
    }

    void g0(e eVar) {
        C3043d0.a("Recorder", "Transitioning audio state: " + this.f6097F + " --> " + eVar);
        this.f6097F = eVar;
    }

    void h0(Surface surface) {
        int iHashCode;
        if (this.f6146x == surface) {
            return;
        }
        this.f6146x = surface;
        synchronized (this.f6130h) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                iHashCode = 0;
            }
            j0(iHashCode);
        }
    }

    void i0(i iVar) {
        if (this.f6133k == iVar) {
            throw new AssertionError("Attempted to transition to state " + iVar + ", but Recorder is already in state " + iVar);
        }
        C3043d0.a("Recorder", "Transitioning Recorder internal state: " + this.f6133k + " --> " + iVar);
        Set<i> set = f6082f0;
        H.a aVarE = null;
        if (set.contains(iVar)) {
            if (!set.contains(this.f6133k)) {
                if (!f6083g0.contains(this.f6133k)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.f6133k);
                }
                i iVar2 = this.f6133k;
                this.f6134l = iVar2;
                aVarE = E(iVar2);
            }
        } else if (this.f6134l != null) {
            this.f6134l = null;
        }
        this.f6133k = iVar;
        if (aVarE == null) {
            aVarE = E(iVar);
        }
        this.f6118a.g(H.e(this.f6135m, aVarE, this.f6138p));
    }

    void k0(g gVar) {
        if (this.f6148z != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        if (F() && this.f6112U.isEmpty()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        InterfaceC1535f interfaceC1535f = this.f6111T;
        if (interfaceC1535f == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            this.f6111T = null;
            List<InterfaceC1535f> listA = A(interfaceC1535f.U0());
            long size = interfaceC1535f.size();
            Iterator<InterfaceC1535f> it = listA.iterator();
            while (it.hasNext()) {
                size += it.next().size();
            }
            long j7 = this.f6107P;
            if (j7 != 0 && size > j7) {
                C3043d0.a("Recorder", String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f6107P)));
                V(gVar, 2, null);
                interfaceC1535f.close();
                return;
            }
            try {
                AbstractC1229k abstractC1229k = (AbstractC1229k) B(this.f6092A);
                if (abstractC1229k.c() == -1) {
                    m0(this.f6140r, AbstractC1229k.e(f6086j0.c()));
                } else {
                    AbstractC1229k.e(abstractC1229k.c());
                }
                new InterfaceC2984a() {
                    @Override
                    public final void accept(Object obj) {
                        this.f6351a.M((Uri) obj);
                    }
                };
                throw null;
            } catch (IOException e7) {
                V(gVar, 5, e7);
                interfaceC1535f.close();
            }
        } catch (Throwable th) {
            if (interfaceC1535f != null) {
                try {
                    interfaceC1535f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    void l0(g gVar, long j7, int i7, Throwable th) {
        if (this.f6137o) {
            return;
        }
        this.f6137o = true;
        this.f6109R = i7;
        this.f6110S = th;
        if (F()) {
            w();
            this.f6095D.b(j7);
        }
        InterfaceC1535f interfaceC1535f = this.f6111T;
        if (interfaceC1535f != null) {
            interfaceC1535f.close();
            this.f6111T = null;
        }
        if (this.f6115X != h0.a.ACTIVE_NON_STREAMING) {
            final InterfaceC1538i interfaceC1538i = this.f6093B;
            this.f6116Y = f0(new Runnable() {
                @Override
                public final void run() {
                    B.N(interfaceC1538i);
                }
            }, this.f6126e, 1000L, TimeUnit.MILLISECONDS);
        } else {
            S(this.f6093B);
        }
        this.f6093B.b(j7);
    }

    void p0() {
    }

    void r0(InterfaceC1535f interfaceC1535f, g gVar) {
        if (this.f6143u == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = this.f6099H + interfaceC1535f.size();
        long j7 = this.f6107P;
        long j8 = 0;
        if (j7 != 0 && size > j7) {
            C3043d0.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f6107P)));
            V(gVar, 2, null);
            return;
        }
        long jU0 = interfaceC1535f.U0();
        long j9 = this.f6101J;
        if (j9 == Long.MAX_VALUE) {
            this.f6101J = jU0;
            C3043d0.a("Recorder", String.format("First video time: %d (%s)", Long.valueOf(jU0), U.d.c(this.f6101J)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(jU0 - Math.min(j9, this.f6104M));
            x0.g.j(this.f6105N != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = timeUnit.toNanos(jU0 - this.f6105N) + nanos;
            long j10 = this.f6108Q;
            if (j10 != 0 && nanos2 > j10) {
                C3043d0.a("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f6108Q)));
                V(gVar, 9, null);
                return;
            }
            j8 = nanos;
        }
        this.f6148z.writeSampleData(this.f6143u.intValue(), interfaceC1535f.F0(), interfaceC1535f.a0());
        this.f6099H = size;
        this.f6100I = j8;
        this.f6105N = jU0;
        p0();
    }

    void z(int i7, Throwable th) {
        throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
    }
}
