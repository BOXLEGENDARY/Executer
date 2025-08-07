package z;

import B.C0288y;
import B.InterfaceC0287x;
import C.C0348q0;
import C.InterfaceC0349r0;
import C.InterfaceC0351s0;
import C.InterfaceC0353t0;
import C.X;
import C.X0;
import C.Z0;
import C.c1;
import C.o1;
import C.p1;
import K0.wJ.BtcVLuo;
import P.c;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import java.io.File;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import k0.BAKp.xAQOwX;
import n.InterfaceC2621a;

public final class T extends G0 {

    public static final c f24568C = new c();

    static final K.b f24569D = new K.b();

    private X0.c f24570A;

    private final InterfaceC0287x f24571B;

    private final InterfaceC0353t0.a f24572q;

    private final int f24573r;

    private final AtomicReference<Integer> f24574s;

    private final int f24575t;

    private int f24576u;

    private Rational f24577v;

    private H.j f24578w;

    X0.b f24579x;

    private C0288y f24580y;

    private B.Z f24581z;

    class a implements InterfaceC0287x {
        a() {
        }

        @Override
        public com.google.common.util.concurrent.p<Void> a(List<C.V> list) {
            return T.this.G0(list);
        }

        @Override
        public void b() {
            T.this.y0();
        }

        @Override
        public void c() {
            T.this.K0();
        }
    }

    public static final class b implements o1.a<T, C0348q0, b>, InterfaceC0351s0.a<b> {

        private final C.E0 f24583a;

        public b() {
            this(C.E0.d0());
        }

        public static b g(C.X x7) {
            return new b(C.E0.e0(x7));
        }

        @Override
        public C.D0 c() {
            return this.f24583a;
        }

        public T f() {
            Integer num = (Integer) c().a(C0348q0.f692M, null);
            if (num != null) {
                c().l(InterfaceC0349r0.f706h, num);
            } else if (T.s0(c())) {
                c().l(InterfaceC0349r0.f706h, 4101);
                c().l(InterfaceC0349r0.f707i, C3070z.f24772c);
            } else {
                c().l(InterfaceC0349r0.f706h, 256);
            }
            C0348q0 c0348q0D = d();
            InterfaceC0351s0.Y(c0348q0D);
            T t7 = new T(c0348q0D);
            Size size = (Size) c().a(InterfaceC0351s0.f720n, null);
            if (size != null) {
                t7.A0(new Rational(size.getWidth(), size.getHeight()));
            }
            x0.g.h((Executor) c().a(H.h.f1507E, F.a.c()), "The IO executor can't be null");
            C.D0 d0C = c();
            X.a<Integer> aVar = C0348q0.f690K;
            if (d0C.b(aVar)) {
                Integer num2 = (Integer) c().f(aVar);
                if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
                }
                if (num2.intValue() == 3 && c().a(C0348q0.f699T, null) == null) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                }
            }
            return t7;
        }

        @Override
        public C0348q0 d() {
            return new C0348q0(C.J0.b0(this.f24583a));
        }

        public b i(int i7) {
            c().l(C0348q0.f689J, Integer.valueOf(i7));
            return this;
        }

        public b j(p1.b bVar) {
            c().l(o1.f663B, bVar);
            return this;
        }

        public b k(C3070z c3070z) {
            c().l(InterfaceC0349r0.f707i, c3070z);
            return this;
        }

        public b l(Executor executor) {
            c().l(H.h.f1507E, executor);
            return this;
        }

        public b m(int i7) {
            c().l(C0348q0.f693N, Integer.valueOf(i7));
            return this;
        }

        @Override
        public b a(P.c cVar) {
            c().l(InterfaceC0351s0.f724r, cVar);
            return this;
        }

        public b o(int i7) {
            c().l(o1.f670x, Integer.valueOf(i7));
            return this;
        }

        @Deprecated
        public b p(int i7) {
            if (i7 == -1) {
                i7 = 0;
            }
            c().l(InterfaceC0351s0.f716j, Integer.valueOf(i7));
            return this;
        }

        public b q(Class<T> cls) {
            c().l(H.m.f1524G, cls);
            if (c().a(H.m.f1523F, null) == null) {
                r(cls.getCanonicalName() + BtcVLuo.AjlxPOLLI + UUID.randomUUID());
            }
            return this;
        }

        public b r(String str) {
            c().l(H.m.f1523F, str);
            return this;
        }

        @Override
        @Deprecated
        public b b(Size size) {
            c().l(InterfaceC0351s0.f720n, size);
            return this;
        }

        @Override
        public b e(int i7) {
            c().l(InterfaceC0351s0.f717k, Integer.valueOf(i7));
            return this;
        }

        private b(C.E0 e02) {
            this.f24583a = e02;
            Class cls = (Class) e02.a(H.m.f1524G, null);
            if (cls == null || cls.equals(T.class)) {
                j(p1.b.IMAGE_CAPTURE);
                q(T.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public static final class c {

        private static final P.c f24584a;

        private static final C0348q0 f24585b;

        private static final C3070z f24586c;

        static {
            P.c cVarA = new c.a().d(P.a.f3707c).f(P.d.f3719c).a();
            f24584a = cVarA;
            C3070z c3070z = C3070z.f24773d;
            f24586c = c3070z;
            f24585b = new b().o(4).p(0).a(cVarA).m(0).k(c3070z).d();
        }

        public C0348q0 a() {
            return f24585b;
        }
    }

    public static final class d {

        private boolean f24587a;

        private boolean f24588b = false;

        private boolean f24589c;

        private Location f24590d;

        public Location a() {
            return this.f24590d;
        }

        public boolean b() {
            return this.f24587a;
        }

        public boolean c() {
            return this.f24589c;
        }

        public String toString() {
            return "Metadata{mIsReversedHorizontal=" + this.f24587a + ", mIsReversedVertical=" + this.f24589c + ", mLocation=" + this.f24590d + "}";
        }
    }

    public static abstract class e {
        public abstract void a(int i7);

        public abstract void b();

        public abstract void c(androidx.camera.core.n nVar);

        public abstract void d(U u7);

        public abstract void e(Bitmap bitmap);
    }

    public interface f {
        default void a(int i7) {
        }

        default void b(Bitmap bitmap) {
        }

        default void c() {
        }

        void d(U u7);

        void e(h hVar);
    }

    public static final class g {

        private final File f24591a;

        private final ContentResolver f24592b;

        private final Uri f24593c;

        private final ContentValues f24594d;

        private final OutputStream f24595e;

        private final d f24596f;

        public static final class a {

            private File f24597a;

            private ContentResolver f24598b;

            private Uri f24599c;

            private ContentValues f24600d;

            private OutputStream f24601e;

            private d f24602f;

            public a(File file) {
                this.f24597a = file;
            }

            public g a() {
                return new g(this.f24597a, this.f24598b, this.f24599c, this.f24600d, this.f24601e, this.f24602f);
            }
        }

        g(File file, ContentResolver contentResolver, Uri uri, ContentValues contentValues, OutputStream outputStream, d dVar) {
            this.f24591a = file;
            this.f24592b = contentResolver;
            this.f24593c = uri;
            this.f24594d = contentValues;
            this.f24595e = outputStream;
            this.f24596f = dVar == null ? new d() : dVar;
        }

        public ContentResolver a() {
            return this.f24592b;
        }

        public ContentValues b() {
            return this.f24594d;
        }

        public File c() {
            return this.f24591a;
        }

        public d d() {
            return this.f24596f;
        }

        public OutputStream e() {
            return this.f24595e;
        }

        public Uri f() {
            return this.f24593c;
        }

        public String toString() {
            return "OutputFileOptions{mFile=" + this.f24591a + ", mContentResolver=" + this.f24592b + ", mSaveCollection=" + this.f24593c + ", mContentValues=" + this.f24594d + ", mOutputStream=" + this.f24595e + ", mMetadata=" + this.f24596f + "}";
        }
    }

    public static class h {

        private final Uri f24603a;

        public h(Uri uri) {
            this.f24603a = uri;
        }
    }

    public interface i {
        void a(long j7, j jVar);

        void clear();
    }

    public interface j {
        void a();
    }

    T(C0348q0 c0348q0) {
        super(c0348q0);
        this.f24572q = new InterfaceC0353t0.a() {
            @Override
            public final void a(InterfaceC0353t0 interfaceC0353t0) {
                T.v0(interfaceC0353t0);
            }
        };
        this.f24574s = new AtomicReference<>(null);
        this.f24576u = -1;
        this.f24577v = null;
        this.f24571B = new a();
        C0348q0 c0348q02 = (C0348q0) j();
        if (c0348q02.b(C0348q0.f689J)) {
            this.f24573r = c0348q02.a0();
        } else {
            this.f24573r = 1;
        }
        this.f24575t = c0348q02.c0(0);
        this.f24578w = H.j.g(c0348q02.g0());
    }

    private void D0() {
        E0(this.f24578w);
    }

    private void E0(i iVar) {
        h().n(iVar);
    }

    private void I0(Executor executor, e eVar, f fVar, g gVar) {
        E.p.a();
        if (m0() == 3 && this.f24578w.getScreenFlash() == null) {
            throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        Log.d("ImageCapture", "takePictureInternal");
        C.J jG = g();
        if (jG == null) {
            z0(executor, eVar, fVar);
            return;
        }
        B.Z z7 = this.f24581z;
        Objects.requireNonNull(z7);
        z7.j(B.f0.v(executor, eVar, fVar, gVar, p0(), v(), q(jG), n0(), l0(), this.f24579x.r()));
    }

    private void J0() {
        synchronized (this.f24574s) {
            try {
                if (this.f24574s.get() != null) {
                    return;
                }
                h().i(m0());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void e0() {
        this.f24578w.f();
        B.Z z7 = this.f24581z;
        if (z7 != null) {
            z7.e();
        }
    }

    private void g0() {
        h0(false);
    }

    private void h0(boolean z7) {
        B.Z z8;
        Log.d("ImageCapture", "clearPipeline");
        E.p.a();
        X0.c cVar = this.f24570A;
        if (cVar != null) {
            cVar.b();
            this.f24570A = null;
        }
        C0288y c0288y = this.f24580y;
        if (c0288y != null) {
            c0288y.a();
            this.f24580y = null;
        }
        if (z7 || (z8 = this.f24581z) == null) {
            return;
        }
        z8.e();
        this.f24581z = null;
    }

    private C.X0.b i0(java.lang.String r17, C.C0348q0 r18, C.c1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: z.T.i0(java.lang.String, C.q0, C.c1):C.X0$b");
    }

    private int k0() {
        C.J jG = g();
        if (jG != null) {
            return jG.c().h();
        }
        return -1;
    }

    private int n0() {
        C0348q0 c0348q0 = (C0348q0) j();
        if (c0348q0.b(C0348q0.f698S)) {
            return c0348q0.f0();
        }
        int i7 = this.f24573r;
        if (i7 == 0) {
            return 100;
        }
        if (i7 == 1 || i7 == 2) {
            return 95;
        }
        throw new IllegalStateException("CaptureMode " + this.f24573r + " is invalid");
    }

    private Z0 o0() {
        return g().i().P(null);
    }

    private Rect p0() {
        Rect rectA = A();
        Size sizeF = f();
        Objects.requireNonNull(sizeF);
        if (rectA != null) {
            return rectA;
        }
        if (!L.b.i(this.f24577v)) {
            return new Rect(0, 0, sizeF.getWidth(), sizeF.getHeight());
        }
        C.J jG = g();
        Objects.requireNonNull(jG);
        int iQ = q(jG);
        Rational rational = new Rational(this.f24577v.getDenominator(), this.f24577v.getNumerator());
        if (!E.q.i(iQ)) {
            rational = this.f24577v;
        }
        Rect rectA2 = L.b.a(sizeF, rational);
        Objects.requireNonNull(rectA2);
        return rectA2;
    }

    private static boolean r0(List<Pair<Integer, Size[]>> list, int i7) {
        if (list == null) {
            return false;
        }
        Iterator<Pair<Integer, Size[]>> it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) it.next().first).equals(Integer.valueOf(i7))) {
                return true;
            }
        }
        return false;
    }

    public static boolean s0(C.D0 d02) {
        return Objects.equals(d02.a(C0348q0.f693N, null), 1);
    }

    private boolean t0() {
        return (g() == null || g().i().P(null) == null) ? false : true;
    }

    public void u0(X0 x02, X0.g gVar) {
        if (g() == null) {
            return;
        }
        this.f24581z.k();
        h0(true);
        X0.b bVarI0 = i0(i(), (C0348q0) j(), (c1) x0.g.g(e()));
        this.f24579x = bVarI0;
        X(F.a(new Object[]{bVarI0.o()}));
        G();
        this.f24581z.l();
    }

    public static void v0(InterfaceC0353t0 interfaceC0353t0) {
        try {
            androidx.camera.core.n nVarC = interfaceC0353t0.c();
            try {
                Log.d("ImageCapture", "Discarding ImageProxy which was inadvertently acquired: " + nVarC);
                if (nVarC != null) {
                    nVarC.close();
                }
            } finally {
            }
        } catch (IllegalStateException e7) {
            Log.e("ImageCapture", "Failed to acquire latest image.", e7);
        }
    }

    public static Void w0(List list) {
        return null;
    }

    private void z0(Executor executor, e eVar, f fVar) {
        U u7 = new U(4, "Not bound to a valid Camera [" + this + "]", null);
        if (fVar == null) {
            throw new IllegalArgumentException("Must have either in-memory or on-disk callback.");
        }
        fVar.d(u7);
    }

    public void A0(Rational rational) {
        this.f24577v = rational;
    }

    public void B0(int i7) {
        C3043d0.a("ImageCapture", "setFlashMode: flashMode = " + i7);
        if (i7 != 0 && i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                throw new IllegalArgumentException("Invalid flash mode: " + i7);
            }
            if (this.f24578w.getScreenFlash() == null) {
                throw new IllegalArgumentException(GObvYfBKohxpYX.UQrjds);
            }
            if (g() != null && k0() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
        }
        synchronized (this.f24574s) {
            this.f24576u = i7;
            J0();
        }
    }

    public void C0(i iVar) {
        this.f24578w = H.j.g(iVar);
        D0();
    }

    public void F0(int i7) {
        int iQ0 = q0();
        if (!U(i7) || this.f24577v == null) {
            return;
        }
        this.f24577v = L.b.g(Math.abs(E.c.b(i7) - E.c.b(iQ0)), this.f24577v);
    }

    com.google.common.util.concurrent.p<Void> G0(List<C.V> list) {
        E.p.a();
        return G.n.G(h().f(list, this.f24573r, this.f24575t), new InterfaceC2621a() {
            @Override
            public final Object apply(Object obj) {
                return T.w0((List) obj);
            }
        }, F.a.a());
    }

    public void x0(final g gVar, final Executor executor, final f fVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            F.a.d().execute(new Runnable() {
                @Override
                public final void run() {
                    this.f24564d.x0(gVar, executor, fVar);
                }
            });
        } else {
            I0(executor, null, fVar, gVar);
        }
    }

    @Override
    public void J() {
        x0.g.h(g(), xAQOwX.whB);
        if (m0() == 3 && k0() != 0) {
            throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override
    public void K() {
        C3043d0.a("ImageCapture", "onCameraControlReady");
        J0();
        D0();
    }

    void K0() {
        synchronized (this.f24574s) {
            try {
                Integer andSet = this.f24574s.getAndSet(null);
                if (andSet == null) {
                    return;
                }
                if (andSet.intValue() != m0()) {
                    J0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    protected o1<?> L(C.I i7, o1.a<?, ?, ?> aVar) {
        if (i7.o().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            C.D0 d0C = aVar.c();
            X.a<Boolean> aVar2 = C0348q0.f696Q;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(d0C.a(aVar2, bool2))) {
                C3043d0.l("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                C3043d0.e("ImageCapture", "Requesting software JPEG due to device quirk.");
                aVar.c().l(aVar2, bool2);
            }
        }
        boolean zJ0 = j0(aVar.c());
        Integer num = (Integer) aVar.c().a(C0348q0.f692M, null);
        if (num != null) {
            x0.g.b(!t0() || num.intValue() == 256, "Cannot set non-JPEG buffer format with Extensions enabled.");
            aVar.c().l(InterfaceC0349r0.f706h, Integer.valueOf(zJ0 ? 35 : num.intValue()));
        } else if (s0(aVar.c())) {
            aVar.c().l(InterfaceC0349r0.f706h, 4101);
            aVar.c().l(InterfaceC0349r0.f707i, C3070z.f24772c);
        } else if (zJ0) {
            aVar.c().l(InterfaceC0349r0.f706h, 35);
        } else {
            List list = (List) aVar.c().a(InterfaceC0351s0.f723q, null);
            if (list == null || r0(list, 256)) {
                aVar.c().l(InterfaceC0349r0.f706h, 256);
            } else if (r0(list, 35)) {
                aVar.c().l(InterfaceC0349r0.f706h, 35);
            }
        }
        return aVar.d();
    }

    @Override
    public void N() {
        e0();
    }

    @Override
    protected c1 O(C.X x7) {
        this.f24579x.g(x7);
        X(F.a(new Object[]{this.f24579x.o()}));
        return e().g().d(x7).a();
    }

    @Override
    protected c1 P(c1 c1Var, c1 c1Var2) {
        X0.b bVarI0 = i0(i(), (C0348q0) j(), c1Var);
        this.f24579x = bVarI0;
        X(F.a(new Object[]{bVarI0.o()}));
        E();
        return c1Var;
    }

    @Override
    public void Q() {
        e0();
        g0();
        E0(null);
    }

    boolean j0(C.D0 d02) {
        boolean z7;
        Boolean bool = Boolean.TRUE;
        X.a<Boolean> aVar = C0348q0.f696Q;
        Boolean bool2 = Boolean.FALSE;
        boolean z8 = false;
        if (bool.equals(d02.a(aVar, bool2))) {
            if (t0()) {
                C3043d0.l("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z7 = false;
            } else {
                z7 = true;
            }
            Integer num = (Integer) d02.a(C0348q0.f692M, null);
            if (num == null || num.intValue() == 256) {
                z8 = z7;
            } else {
                C3043d0.l("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z8) {
                C3043d0.l("ImageCapture", "Unable to support software JPEG. Disabling.");
                d02.l(aVar, bool2);
            }
        }
        return z8;
    }

    @Override
    public o1<?> k(boolean z7, p1 p1Var) {
        c cVar = f24568C;
        C.X xA = p1Var.a(cVar.a().F(), l0());
        if (z7) {
            xA = C.X.Q(xA, cVar.a());
        }
        if (xA == null) {
            return null;
        }
        return z(xA).d();
    }

    public int l0() {
        return this.f24573r;
    }

    public int m0() {
        int iB0;
        synchronized (this.f24574s) {
            iB0 = this.f24576u;
            if (iB0 == -1) {
                iB0 = ((C0348q0) j()).b0(2);
            }
        }
        return iB0;
    }

    public int q0() {
        return y();
    }

    public String toString() {
        return "ImageCapture:" + o();
    }

    @Override
    public Set<Integer> x() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    void y0() {
        synchronized (this.f24574s) {
            try {
                if (this.f24574s.get() != null) {
                    return;
                }
                this.f24574s.set(Integer.valueOf(m0()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public o1.a<?, ?, ?> z(C.X x7) {
        return b.g(x7);
    }
}
