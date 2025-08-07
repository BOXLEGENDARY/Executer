package S;

import C.AbstractC0324e0;
import C.AbstractC0345p;
import C.D0;
import C.E0;
import C.H0;
import C.InterfaceC0336k0;
import C.InterfaceC0349r0;
import C.InterfaceC0351s0;
import C.InterfaceC0364z;
import C.J0;
import C.X0;
import C.c1;
import C.h1;
import C.o1;
import C.p1;
import M.C0523t;
import M.W;
import S.H;
import S.h0;
import X.k0;
import X.m0;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import androidx.concurrent.futures.c;
import f6.ck.ZJZXBWla;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import n.InterfaceC2621a;
import z.C3043d0;
import z.C3070z;
import z.F0;
import z.G0;
import z.InterfaceC3060o;

public final class W<T extends h0> extends G0 {

    private static final e f6219E = new e();

    private boolean f6220A;

    private f f6221B;

    private X0.c f6222C;

    private final H0.a<H> f6223D;

    AbstractC0324e0 f6224q;

    private M.N f6225r;

    H f6226s;

    X0.b f6227t;

    com.google.common.util.concurrent.p<Void> f6228u;

    private F0 f6229v;

    h0.a f6230w;

    private M.W f6231x;

    private Rect f6232y;

    private int f6233z;

    class a implements H0.a<H> {
        a() {
        }

        @Override
        public void a(H h7) {
            if (h7 == null) {
                throw new IllegalArgumentException("StreamInfo can't be null");
            }
            if (W.this.f6230w == h0.a.INACTIVE) {
                return;
            }
            C3043d0.a("VideoCapture", "Stream info update: old: " + W.this.f6226s + " new: " + h7);
            W w8 = W.this;
            H h8 = w8.f6226s;
            w8.f6226s = h7;
            c1 c1Var = (c1) x0.g.g(w8.e());
            if (W.this.H0(h8.a(), h7.a()) || W.this.d1(h8, h7)) {
                W.this.Q0();
                return;
            }
            if ((h8.a() != -1 && h7.a() == -1) || (h8.a() == -1 && h7.a() != -1)) {
                W w9 = W.this;
                w9.t0(w9.f6227t, h7, c1Var);
                W w10 = W.this;
                w10.X(z.F.a(new Object[]{w10.f6227t.o()}));
                W.this.G();
                return;
            }
            if (h8.c() != h7.c()) {
                W w11 = W.this;
                w11.t0(w11.f6227t, h7, c1Var);
                W w12 = W.this;
                w12.X(z.F.a(new Object[]{w12.f6227t.o()}));
                W.this.I();
            }
        }

        @Override
        public void onError(Throwable th) {
            C3043d0.m("VideoCapture", "Receive onError from StreamState observer", th);
        }
    }

    class b extends AbstractC0345p {

        private boolean f6235a = true;

        final AtomicBoolean f6236b;

        final c.a f6237c;

        final X0.b f6238d;

        b(AtomicBoolean atomicBoolean, c.a aVar, X0.b bVar) {
            this.f6236b = atomicBoolean;
            this.f6237c = aVar;
            this.f6238d = bVar;
        }

        public void f(X0.b bVar) {
            bVar.s(this);
        }

        @Override
        public void b(int i7, InterfaceC0364z interfaceC0364z) {
            Object objD;
            super.b(i7, interfaceC0364z);
            if (this.f6235a) {
                this.f6235a = false;
                C3043d0.a("VideoCapture", "cameraCaptureResult timestampNs = " + interfaceC0364z.d() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
            }
            if (this.f6236b.get() || (objD = interfaceC0364z.b().d("androidx.camera.video.VideoCapture.streamUpdate")) == null || ((Integer) objD).intValue() != this.f6237c.hashCode() || !this.f6237c.c(null) || this.f6236b.getAndSet(true)) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceD = F.a.d();
            final X0.b bVar = this.f6238d;
            scheduledExecutorServiceD.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f6251d.f(bVar);
                }
            });
        }
    }

    class c implements G.c<Void> {

        final com.google.common.util.concurrent.p f6240a;

        final boolean f6241b;

        c(com.google.common.util.concurrent.p pVar, boolean z7) {
            this.f6240a = pVar;
            this.f6241b = z7;
        }

        @Override
        public void onSuccess(Void r32) {
            com.google.common.util.concurrent.p<Void> pVar = this.f6240a;
            W w8 = W.this;
            if (pVar != w8.f6228u || w8.f6230w == h0.a.INACTIVE) {
                return;
            }
            w8.V0(this.f6241b ? h0.a.ACTIVE_STREAMING : h0.a.ACTIVE_NON_STREAMING);
        }

        @Override
        public void onFailure(Throwable th) {
            if (th instanceof CancellationException) {
                return;
            }
            C3043d0.d("VideoCapture", "Surface update completed with unexpected exception", th);
        }
    }

    public static final class d<T extends h0> implements o1.a<W<T>, T.a<T>, d<T>>, InterfaceC0351s0.a<d<T>> {

        private final E0 f6243a;

        public d(T t7) {
            this(g(t7));
        }

        private static <T extends h0> E0 g(T t7) {
            E0 e0D0 = E0.d0();
            e0D0.l(T.a.f7445J, t7);
            return e0D0;
        }

        static d<? extends h0> h(C.X x7) {
            return new d<>(E0.e0(x7));
        }

        @Override
        public D0 c() {
            return this.f6243a;
        }

        public W<T> f() {
            return new W<>(d());
        }

        @Override
        public T.a<T> d() {
            return new T.a<>(J0.b0(this.f6243a));
        }

        public d<T> j(p1.b bVar) {
            c().l(o1.f663B, bVar);
            return this;
        }

        public d<T> k(C3070z c3070z) {
            c().l(InterfaceC0349r0.f707i, c3070z);
            return this;
        }

        public d<T> l(int i7) {
            c().l(InterfaceC0351s0.f719m, Integer.valueOf(i7));
            return this;
        }

        @Override
        public d<T> a(P.c cVar) {
            c().l(InterfaceC0351s0.f724r, cVar);
            return this;
        }

        public d<T> n(int i7) {
            c().l(o1.f670x, Integer.valueOf(i7));
            return this;
        }

        public d<T> o(Class<W<T>> cls) {
            c().l(H.m.f1524G, cls);
            if (c().a(H.m.f1523F, null) == null) {
                q(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public d<T> p(Range<Integer> range) {
            c().l(o1.f671y, range);
            return this;
        }

        public d<T> q(String str) {
            c().l(H.m.f1523F, str);
            return this;
        }

        @Override
        public d<T> b(Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        @Override
        public d<T> e(int i7) {
            c().l(InterfaceC0351s0.f717k, Integer.valueOf(i7));
            return this;
        }

        d<T> t(InterfaceC2621a<X.i0, k0> interfaceC2621a) {
            c().l(T.a.f7446K, interfaceC2621a);
            return this;
        }

        private d(E0 e02) {
            this.f6243a = e02;
            if (!e02.b(T.a.f7445J)) {
                throw new IllegalArgumentException("VideoOutput is required");
            }
            Class cls = (Class) e02.a(H.m.f1524G, null);
            if (cls == null || cls.equals(W.class)) {
                j(p1.b.VIDEO_CAPTURE);
                o(W.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public static final class e {

        private static final h0 f6244a;

        private static final T.a<?> f6245b;

        private static final InterfaceC2621a<X.i0, k0> f6246c;

        static final Range<Integer> f6247d;

        static final C3070z f6248e;

        static {
            h0 h0Var = new h0() {
                @Override
                public final void a(F0 f02) {
                    f02.G();
                }
            };
            f6244a = h0Var;
            InterfaceC2621a<X.i0, k0> interfaceC2621a = m0.f7861d;
            f6246c = interfaceC2621a;
            f6247d = new Range<>(30, 30);
            C3070z c3070z = C3070z.f24773d;
            f6248e = c3070z;
            f6245b = new d(h0Var).n(5).t(interfaceC2621a).k(c3070z).d();
        }

        public T.a<?> a() {
            return f6245b;
        }
    }

    static class f implements H0.a<Boolean> {

        private C.F f6249a;

        private boolean f6250b = false;

        f(C.F f7) {
            this.f6249a = f7;
        }

        private void d(boolean z7) {
            if (this.f6250b == z7) {
                return;
            }
            this.f6250b = z7;
            C.F f7 = this.f6249a;
            if (f7 == null) {
                C3043d0.a("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            } else if (z7) {
                f7.o();
            } else {
                f7.d();
            }
        }

        public void b() {
            x0.g.j(E.p.c(), "SourceStreamRequirementObserver can be closed from main thread only");
            C3043d0.a("VideoCapture", "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.f6250b);
            if (this.f6249a == null) {
                C3043d0.a("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
            } else {
                d(false);
                this.f6249a = null;
            }
        }

        @Override
        public void a(Boolean bool) {
            x0.g.j(E.p.c(), "SourceStreamRequirementObserver can be updated from main thread only");
            d(Boolean.TRUE.equals(bool));
        }

        @Override
        public void onError(Throwable th) {
            C3043d0.m("VideoCapture", "SourceStreamRequirementObserver#onError", th);
        }
    }

    W(T.a<T> aVar) {
        super(aVar);
        this.f6226s = H.f6197a;
        this.f6227t = new X0.b();
        this.f6228u = null;
        this.f6230w = h0.a.INACTIVE;
        this.f6220A = false;
        this.f6223D = new a();
    }

    private static k0 A0(InterfaceC2621a<X.i0, k0> interfaceC2621a, U.g gVar, C3070z c3070z, AbstractC1229k abstractC1229k, Size size, Range<Integer> range) {
        k0 k0VarT0;
        int iB;
        if (c3070z.e()) {
            return T0(interfaceC2621a, gVar, abstractC1229k, size, c3070z, range);
        }
        k0 k0Var = null;
        int i7 = Integer.MIN_VALUE;
        for (InterfaceC0336k0.c cVar : gVar.d()) {
            if (Y.b.f(cVar, c3070z) && (k0VarT0 = T0(interfaceC2621a, gVar, abstractC1229k, size, new C3070z(Y.b.h(cVar.g()), Y.b.g(cVar.b())), range)) != null && (iB = L.d.b(((Integer) k0VarT0.h().getUpper()).intValue(), ((Integer) k0VarT0.j().getUpper()).intValue())) > i7) {
                k0Var = k0VarT0;
                i7 = iB;
            }
        }
        return k0Var;
    }

    private int B0(C.J j7) {
        boolean zC = C(j7);
        int iR = r(j7, zC);
        if (!Y0()) {
            return iR;
        }
        F0.h hVarB = this.f6226s.b();
        Objects.requireNonNull(hVarB);
        int iB = hVarB.b();
        if (zC != hVarB.f()) {
            iB = -iB;
        }
        return E.q.w(iR - iB);
    }

    private AbstractC1229k D0() {
        return (AbstractC1229k) y0(E0().e(), null);
    }

    private I F0(InterfaceC3060o interfaceC3060o) {
        return E0().d(interfaceC3060o);
    }

    private boolean G0(C.J j7, T.a<?> aVar, Rect rect, Size size) {
        return l() != null || a1(j7, aVar) || b1(j7) || Z0(rect, size) || c1(j7) || Y0();
    }

    public static int I0(Rect rect, Size size, Size size2) {
        return (Math.abs(size.getWidth() - rect.width()) + Math.abs(size.getHeight() - rect.height())) - (Math.abs(size2.getWidth() - rect.width()) + Math.abs(size2.getHeight() - rect.height()));
    }

    public void L0(AbstractC0324e0 abstractC0324e0) {
        if (abstractC0324e0 == this.f6224q) {
            v0();
        }
    }

    public void M0(X0 x02, X0.g gVar) {
        Q0();
    }

    public static void N0(AtomicBoolean atomicBoolean, X0.b bVar, AbstractC0345p abstractC0345p) {
        x0.g.j(E.p.c(), "Surface update cancellation should only occur on main thread.");
        atomicBoolean.set(true);
        bVar.s(abstractC0345p);
    }

    public Object O0(final X0.b bVar, c.a aVar) throws Exception {
        bVar.n("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final b bVar2 = new b(atomicBoolean, aVar, bVar);
        aVar.a(new Runnable() {
            @Override
            public final void run() {
                W.N0(atomicBoolean, bVar, bVar2);
            }
        }, F.a.a());
        bVar.j(bVar2);
        return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
    }

    public void K0(M.N n7, C.J j7, T.a<T> aVar, h1 h1Var) {
        if (j7 == g()) {
            this.f6229v = n7.k(j7);
            aVar.a0().b(this.f6229v, h1Var);
            U0();
        }
    }

    private static Range<Integer> R0(c1 c1Var) {
        Range<Integer> rangeC = c1Var.c();
        return Objects.equals(rangeC, c1.f534a) ? e.f6247d : rangeC;
    }

    private static h1 S0(C.J j7, M.W w8) {
        return (w8 == null && j7.o()) ? h1.UPTIME : j7.q().i();
    }

    private static k0 T0(InterfaceC2621a<X.i0, k0> interfaceC2621a, U.g gVar, AbstractC1229k abstractC1229k, Size size, C3070z c3070z, Range<Integer> range) {
        k0 k0VarApply = interfaceC2621a.apply(W.c.c(W.c.d(abstractC1229k, c3070z, gVar), h1.UPTIME, abstractC1229k.d(), size, c3070z, range));
        if (k0VarApply != null) {
            return Z.d.l(k0VarApply, gVar != null ? new Size(gVar.k().k(), gVar.k().h()) : null);
        }
        C3043d0.l("VideoCapture", "Can't find videoEncoderInfo");
        return null;
    }

    private void U0() {
        C.J jG = g();
        M.N n7 = this.f6225r;
        if (jG == null || n7 == null) {
            return;
        }
        int iB0 = B0(jG);
        this.f6233z = iB0;
        n7.D(iB0, d());
    }

    private void X0(final X0.b bVar, boolean z7) {
        com.google.common.util.concurrent.p<Void> pVar = this.f6228u;
        if (pVar != null && pVar.cancel(false)) {
            C3043d0.a("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        com.google.common.util.concurrent.p<Void> pVarA = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f6204a.O0(bVar, aVar);
            }
        });
        this.f6228u = pVarA;
        G.n.j(pVarA, new c(pVarA, z7), F.a.d());
    }

    private boolean Y0() {
        return this.f6226s.b() != null;
    }

    private static boolean Z0(Rect rect, Size size) {
        return (size.getWidth() == rect.width() && size.getHeight() == rect.height()) ? false : true;
    }

    private static <T extends h0> boolean a1(C.J j7, T.a<T> aVar) {
        return j7.o() && aVar.b0();
    }

    private static boolean b1(C.J j7) {
        return j7.o() && (SurfaceProcessingQuirk.a(androidx.camera.video.internal.compat.quirk.a.c()) || SurfaceProcessingQuirk.a(j7.q().o()));
    }

    private boolean c1(C.J j7) {
        return j7.o() && C(j7);
    }

    private void e1(C.I i7, o1.a<?, ?, ?> aVar) throws IllegalArgumentException {
        AbstractC1229k abstractC1229kD0 = D0();
        x0.g.b(abstractC1229kD0 != null, "Unable to update target resolution by null MediaSpec.");
        C3070z c3070zC0 = C0();
        I iF0 = F0(i7);
        List<C1230l> listB = iF0.b(c3070zC0);
        if (listB.isEmpty()) {
            C3043d0.l("VideoCapture", "Can't find any supported quality on the device.");
            return;
        }
        i0 i0VarD = abstractC1229kD0.d();
        C1233o c1233oE = i0VarD.e();
        List<C1230l> listD = c1233oE.d(listB);
        C3043d0.a("VideoCapture", "Found selectedQualities " + listD + " by " + c1233oE);
        if (listD.isEmpty()) {
            throw new IllegalArgumentException("Unable to find supported quality by QualitySelector");
        }
        int iB = i0VarD.b();
        Map<C1230l, Size> mapF = C1233o.f(iF0, c3070zC0);
        C1232n c1232n = new C1232n(i7.p(m()), mapF);
        ArrayList arrayList = new ArrayList();
        Iterator<C1230l> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.addAll(c1232n.g(it.next(), iB));
        }
        List<Size> listZ0 = z0((T.a) aVar.d(), abstractC1229kD0, c3070zC0, iF0, arrayList, mapF);
        C3043d0.a("VideoCapture", "Set custom ordered resolutions = " + listZ0);
        aVar.c().l(InterfaceC0351s0.f725s, listZ0);
    }

    private static void l0(Set<Size> set, int i7, int i8, Size size, k0 k0Var) {
        if (i7 > size.getWidth() || i8 > size.getHeight()) {
            return;
        }
        try {
            set.add(new Size(i7, ((Integer) k0Var.f(i7).clamp(Integer.valueOf(i8))).intValue()));
        } catch (IllegalArgumentException e7) {
            C3043d0.m("VideoCapture", "No supportedHeights for width: " + i7, e7);
        }
        try {
            set.add(new Size(((Integer) k0Var.e(i8).clamp(Integer.valueOf(i7))).intValue(), i8));
        } catch (IllegalArgumentException e8) {
            C3043d0.m("VideoCapture", "No supportedWidths for height: " + i8, e8);
        }
    }

    private static Rect m0(Rect rect, int i7, boolean z7, k0 k0Var) {
        SizeCannotEncodeVideoQuirk sizeCannotEncodeVideoQuirk = (SizeCannotEncodeVideoQuirk) androidx.camera.video.internal.compat.quirk.a.b(SizeCannotEncodeVideoQuirk.class);
        if (sizeCannotEncodeVideoQuirk == null) {
            return rect;
        }
        if (!z7) {
            i7 = 0;
        }
        return sizeCannotEncodeVideoQuirk.f(rect, i7, k0Var);
    }

    private static Rect n0(final Rect rect, Size size, k0 k0Var) {
        C3043d0.a("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", E.q.n(rect), Integer.valueOf(k0Var.b()), Integer.valueOf(k0Var.g()), k0Var.h(), k0Var.j()));
        if ((!k0Var.h().contains((Range<Integer>) Integer.valueOf(rect.width())) || !k0Var.j().contains((Range<Integer>) Integer.valueOf(rect.height()))) && k0Var.d() && k0Var.j().contains((Range<Integer>) Integer.valueOf(rect.width())) && k0Var.h().contains((Range<Integer>) Integer.valueOf(rect.height()))) {
            k0Var = new X.f0(k0Var);
        }
        int iB = k0Var.b();
        int iG = k0Var.g();
        Range<Integer> rangeH = k0Var.h();
        Range<Integer> rangeJ = k0Var.j();
        int iR0 = r0(rect.width(), iB, rangeH);
        int iS0 = s0(rect.width(), iB, rangeH);
        int iR02 = r0(rect.height(), iG, rangeJ);
        int iS02 = s0(rect.height(), iG, rangeJ);
        HashSet hashSet = new HashSet();
        l0(hashSet, iR0, iR02, size, k0Var);
        l0(hashSet, iR0, iS02, size, k0Var);
        l0(hashSet, iS0, iR02, size, k0Var);
        l0(hashSet, iS0, iS02, size, k0Var);
        if (hashSet.isEmpty()) {
            C3043d0.l("VideoCapture", ZJZXBWla.FDDUkMs);
            return rect;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        C3043d0.a("VideoCapture", "candidatesList = " + arrayList);
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return W.I0(rect, (Size) obj, (Size) obj2);
            }
        });
        C3043d0.a("VideoCapture", "sorted candidatesList = " + arrayList);
        Size size2 = (Size) arrayList.get(0);
        int width = size2.getWidth();
        int height = size2.getHeight();
        if (width == rect.width() && height == rect.height()) {
            C3043d0.a("VideoCapture", "No need to adjust cropRect because crop size is valid.");
            return rect;
        }
        x0.g.i(width % 2 == 0 && height % 2 == 0 && width <= size.getWidth() && height <= size.getHeight());
        Rect rect2 = new Rect(rect);
        if (width != rect.width()) {
            int iMax = Math.max(0, rect.centerX() - (width / 2));
            rect2.left = iMax;
            int i7 = iMax + width;
            rect2.right = i7;
            if (i7 > size.getWidth()) {
                int width2 = size.getWidth();
                rect2.right = width2;
                rect2.left = width2 - width;
            }
        }
        if (height != rect.height()) {
            int iMax2 = Math.max(0, rect.centerY() - (height / 2));
            rect2.top = iMax2;
            int i8 = iMax2 + height;
            rect2.bottom = i8;
            if (i8 > size.getHeight()) {
                int height2 = size.getHeight();
                rect2.bottom = height2;
                rect2.top = height2 - height;
            }
        }
        C3043d0.a("VideoCapture", String.format("Adjust cropRect from %s to %s", E.q.n(rect), E.q.n(rect2)));
        return rect2;
    }

    private Rect o0(Rect rect, int i7) {
        return Y0() ? E.q.r(E.q.f(((F0.h) x0.g.g(this.f6226s.b())).a(), i7)) : rect;
    }

    private Size p0(Size size, Rect rect, Rect rect2) {
        if (!Y0() || rect2.equals(rect)) {
            return size;
        }
        float fHeight = rect2.height() / rect.height();
        return new Size((int) Math.ceil(size.getWidth() * fHeight), (int) Math.ceil(size.getHeight() * fHeight));
    }

    private static int q0(boolean z7, int i7, int i8, Range<Integer> range) {
        int i9 = i7 % i8;
        if (i9 != 0) {
            i7 = z7 ? i7 - i9 : i7 + (i8 - i9);
        }
        return ((Integer) range.clamp(Integer.valueOf(i7))).intValue();
    }

    private static int r0(int i7, int i8, Range<Integer> range) {
        return q0(true, i7, i8, range);
    }

    private static int s0(int i7, int i8, Range<Integer> range) {
        return q0(false, i7, i8, range);
    }

    private Rect u0(Size size, k0 k0Var) {
        Rect rectA = A() != null ? A() : new Rect(0, 0, size.getWidth(), size.getHeight());
        return (k0Var == null || k0Var.a(rectA.width(), rectA.height())) ? rectA : n0(rectA, size, k0Var);
    }

    private void v0() {
        E.p.a();
        X0.c cVar = this.f6222C;
        if (cVar != null) {
            cVar.b();
            this.f6222C = null;
        }
        AbstractC0324e0 abstractC0324e0 = this.f6224q;
        if (abstractC0324e0 != null) {
            abstractC0324e0.d();
            this.f6224q = null;
        }
        M.W w8 = this.f6231x;
        if (w8 != null) {
            w8.i();
            this.f6231x = null;
        }
        M.N n7 = this.f6225r;
        if (n7 != null) {
            n7.i();
            this.f6225r = null;
        }
        this.f6232y = null;
        this.f6229v = null;
        this.f6226s = H.f6197a;
        this.f6233z = 0;
        this.f6220A = false;
    }

    private M.W w0(C.J j7, T.a<T> aVar, Rect rect, Size size, C3070z c3070z) {
        if (!G0(j7, aVar, rect, size)) {
            return null;
        }
        C3043d0.a("VideoCapture", "Surface processing is enabled.");
        C.J jG = g();
        Objects.requireNonNull(jG);
        return new M.W(jG, l() != null ? l().a() : C0523t.a.a(c3070z));
    }

    private X0.b x0(final T.a<T> aVar, c1 c1Var) {
        E.p.a();
        final C.J j7 = (C.J) x0.g.g(g());
        Size sizeE = c1Var.e();
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f6206d.G();
            }
        };
        Range<Integer> rangeR0 = R0(c1Var);
        AbstractC1229k abstractC1229kD0 = D0();
        Objects.requireNonNull(abstractC1229kD0);
        I iF0 = F0(j7.c());
        C3070z c3070zB = c1Var.b();
        k0 k0VarT0 = T0(aVar.Z(), iF0.d(sizeE, c3070zB), abstractC1229kD0, sizeE, c3070zB, rangeR0);
        this.f6233z = B0(j7);
        Rect rectU0 = u0(sizeE, k0VarT0);
        Rect rectO0 = o0(rectU0, this.f6233z);
        this.f6232y = rectO0;
        Size sizeP0 = p0(sizeE, rectU0, rectO0);
        if (Y0()) {
            this.f6220A = true;
        }
        Rect rect = this.f6232y;
        Rect rectM0 = m0(rect, this.f6233z, G0(j7, aVar, rect, sizeE), k0VarT0);
        this.f6232y = rectM0;
        M.W wW0 = w0(j7, aVar, rectM0, sizeE, c3070zB);
        this.f6231x = wW0;
        final h1 h1VarS0 = S0(j7, wW0);
        C3043d0.a("VideoCapture", "camera timebase = " + j7.q().i() + ", processing timebase = " + h1VarS0);
        c1 c1VarA = c1Var.g().e(sizeP0).c(rangeR0).a();
        x0.g.i(this.f6225r == null);
        M.N n7 = new M.N(2, 34, c1VarA, v(), j7.o(), this.f6232y, this.f6233z, d(), c1(j7));
        this.f6225r = n7;
        n7.e(runnable);
        if (this.f6231x != null) {
            O.f fVarJ = O.f.j(this.f6225r);
            final M.N n8 = this.f6231x.m(W.b.c(this.f6225r, Collections.singletonList(fVarJ))).get(fVarJ);
            Objects.requireNonNull(n8);
            n8.e(new Runnable() {
                @Override
                public final void run() {
                    this.f6207d.K0(n8, j7, aVar, h1VarS0);
                }
            });
            this.f6229v = n8.k(j7);
            final AbstractC0324e0 abstractC0324e0O = this.f6225r.o();
            this.f6224q = abstractC0324e0O;
            abstractC0324e0O.k().c(new Runnable() {
                @Override
                public final void run() {
                    this.f6212d.L0(abstractC0324e0O);
                }
            }, F.a.d());
        } else {
            F0 f0K = this.f6225r.k(j7);
            this.f6229v = f0K;
            this.f6224q = f0K.m();
        }
        aVar.a0().b(this.f6229v, h1VarS0);
        U0();
        this.f6224q.s(MediaCodec.class);
        X0.b bVarQ = X0.b.q(aVar, c1Var.e());
        bVarQ.u(c1Var.c());
        bVarQ.A(aVar.G());
        X0.c cVar = this.f6222C;
        if (cVar != null) {
            cVar.b();
        }
        X0.c cVar2 = new X0.c(new X0.d() {
            @Override
            public final void a(X0 x02, X0.g gVar) {
                this.f6214a.M0(x02, gVar);
            }
        });
        this.f6222C = cVar2;
        bVarQ.t(cVar2);
        if (c1Var.d() != null) {
            bVarQ.g(c1Var.d());
        }
        return bVarQ;
    }

    private static <T> T y0(H0<T> h02, T t7) {
        com.google.common.util.concurrent.p<T> pVarD = h02.d();
        if (!pVarD.isDone()) {
            return t7;
        }
        try {
            return pVarD.get();
        } catch (InterruptedException | ExecutionException e7) {
            throw new IllegalStateException(e7);
        }
    }

    private static List<Size> z0(T.a<?> aVar, AbstractC1229k abstractC1229k, C3070z c3070z, I i7, List<Size> list, Map<C1230l, Size> map) {
        U.g gVarD;
        if (list.isEmpty()) {
            return list;
        }
        Iterator<Size> it = list.iterator();
        while (it.hasNext()) {
            Size next = it.next();
            if (!map.containsValue(next) && (gVarD = i7.d(next, c3070z)) != null) {
                InterfaceC2621a<X.i0, k0> interfaceC2621aZ = aVar.Z();
                Range<Integer> rangeH = aVar.H(e.f6247d);
                Objects.requireNonNull(rangeH);
                k0 k0VarA0 = A0(interfaceC2621aZ, gVarD, c3070z, abstractC1229k, next, rangeH);
                if (k0VarA0 != null && !k0VarA0.a(next.getWidth(), next.getHeight())) {
                    it.remove();
                }
            }
        }
        return list;
    }

    public C3070z C0() {
        return j().u() ? j().o() : e.f6248e;
    }

    public T E0() {
        return (T) ((T.a) j()).a0();
    }

    boolean H0(int i7, int i8) {
        Set<Integer> set = H.f6198b;
        return (set.contains(Integer.valueOf(i7)) || set.contains(Integer.valueOf(i8)) || i7 == i8) ? false : true;
    }

    @Override
    protected o1<?> L(C.I i7, o1.a<?, ?, ?> aVar) throws IllegalArgumentException {
        e1(i7, aVar);
        return aVar.d();
    }

    @Override
    public void M() {
        super.M();
        C3043d0.a("VideoCapture", "VideoCapture#onStateAttached: cameraID = " + i());
        if (e() == null || this.f6229v != null) {
            return;
        }
        c1 c1Var = (c1) x0.g.g(e());
        this.f6226s = (H) y0(E0().f(), H.f6197a);
        X0.b bVarX0 = x0((T.a) j(), c1Var);
        this.f6227t = bVarX0;
        t0(bVarX0, this.f6226s, c1Var);
        X(z.F.a(new Object[]{this.f6227t.o()}));
        E();
        E0().f().a(F.a.d(), this.f6223D);
        f fVar = this.f6221B;
        if (fVar != null) {
            fVar.b();
        }
        this.f6221B = new f(h());
        E0().g().a(F.a.d(), this.f6221B);
        V0(h0.a.ACTIVE_NON_STREAMING);
    }

    @Override
    public void N() {
        C3043d0.a("VideoCapture", "VideoCapture#onStateDetached");
        x0.g.j(E.p.c(), "VideoCapture can only be detached on the main thread.");
        if (this.f6221B != null) {
            E0().g().b(this.f6221B);
            this.f6221B.b();
            this.f6221B = null;
        }
        V0(h0.a.INACTIVE);
        E0().f().b(this.f6223D);
        com.google.common.util.concurrent.p<Void> pVar = this.f6228u;
        if (pVar != null && pVar.cancel(false)) {
            C3043d0.a("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        v0();
    }

    @Override
    protected c1 O(C.X x7) {
        this.f6227t.g(x7);
        X(z.F.a(new Object[]{this.f6227t.o()}));
        c1 c1VarE = e();
        Objects.requireNonNull(c1VarE);
        return c1VarE.g().d(x7).a();
    }

    @Override
    protected c1 P(c1 c1Var, c1 c1Var2) {
        C3043d0.a("VideoCapture", "onSuggestedStreamSpecUpdated: " + c1Var);
        List<Size> listS = ((T.a) j()).s(null);
        if (listS != null && !listS.contains(c1Var.e())) {
            C3043d0.l("VideoCapture", "suggested resolution " + c1Var.e() + " is not in custom ordered resolutions " + listS);
        }
        return c1Var;
    }

    void Q0() {
        if (g() == null) {
            return;
        }
        v0();
        X0.b bVarX0 = x0((T.a) j(), (c1) x0.g.g(e()));
        this.f6227t = bVarX0;
        t0(bVarX0, this.f6226s, e());
        X(z.F.a(new Object[]{this.f6227t.o()}));
        G();
    }

    @Override
    public void V(Rect rect) {
        super.V(rect);
        U0();
    }

    void V0(h0.a aVar) {
        if (aVar != this.f6230w) {
            this.f6230w = aVar;
            E0().c(aVar);
        }
    }

    public void W0(int i7) {
        if (U(i7)) {
            U0();
        }
    }

    boolean d1(H h7, H h8) {
        return this.f6220A && h7.b() != null && h8.b() == null;
    }

    @Override
    public o1<?> k(boolean z7, p1 p1Var) {
        e eVar = f6219E;
        C.X xA = p1Var.a(eVar.a().F(), 1);
        if (z7) {
            xA = C.X.Q(xA, eVar.a());
        }
        if (xA == null) {
            return null;
        }
        return z(xA).d();
    }

    void t0(X0.b bVar, H h7, c1 c1Var) {
        AbstractC0324e0 abstractC0324e0;
        boolean z7 = h7.a() == -1;
        boolean z8 = h7.c() == H.a.f6200d;
        if (z7 && z8) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        bVar.p();
        C3070z c3070zB = c1Var.b();
        if (!z7 && (abstractC0324e0 = this.f6224q) != null) {
            if (z8) {
                bVar.m(abstractC0324e0, c3070zB, null, -1);
            } else {
                bVar.i(abstractC0324e0, c3070zB);
            }
        }
        X0(bVar, z8);
    }

    public String toString() {
        return "VideoCapture:" + o();
    }

    @Override
    public Set<Integer> x() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override
    public o1.a<?, ?, ?> z(C.X x7) {
        return d.h(x7);
    }
}
