package H;

import C.AbstractC0315a;
import C.AbstractC0344o0;
import C.B;
import C.C0348q0;
import C.E0;
import C.F;
import C.G;
import C.I;
import C.J;
import C.M0;
import C.U0;
import C.V0;
import C.X;
import C.X0;
import C.c1;
import C.o1;
import C.p1;
import E.q;
import M.a0;
import Y3.qE.KpBmp;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import x0.InterfaceC2984a;
import z.AbstractC3056k;
import z.C3041c0;
import z.C3043d0;
import z.C3070z;
import z.F0;
import z.G0;
import z.I0;
import z.InterfaceC3052i;
import z.InterfaceC3054j;
import z.InterfaceC3060o;
import z.T;
import z.o0;

public final class f implements InterfaceC3052i {

    private final A.a f1484A;

    private I0 f1485B;

    private final B f1487D;

    private G0 f1491H;

    private Q.h f1492I;

    private final U0 f1493J;

    private final V0 f1494K;

    private final V0 f1495L;

    private final C3041c0 f1496M;

    private final C3041c0 f1497N;

    private final J f1498d;

    private final J f1499e;

    private final G f1500i;

    private final p1 f1501v;

    private final b f1502w;

    private final List<G0> f1503y = new ArrayList();

    private final List<G0> f1504z = new ArrayList();

    private List<AbstractC3056k> f1486C = Collections.emptyList();

    private final Object f1488E = new Object();

    private boolean f1489F = true;

    private X f1490G = null;

    public static final class a extends Exception {
        public a(Throwable th) {
            super(th);
        }
    }

    public static abstract class b {
        public static b a(String str, AbstractC0344o0 abstractC0344o0) {
            return new H.a(str, abstractC0344o0);
        }

        public abstract AbstractC0344o0 b();

        public abstract String c();
    }

    private static class c {

        o1<?> f1505a;

        o1<?> f1506b;

        c(o1<?> o1Var, o1<?> o1Var2) {
            this.f1505a = o1Var;
            this.f1506b = o1Var2;
        }
    }

    public f(J j7, J j8, V0 v02, V0 v03, C3041c0 c3041c0, C3041c0 c3041c02, A.a aVar, G g7, p1 p1Var) {
        this.f1498d = j7;
        this.f1499e = j8;
        this.f1496M = c3041c0;
        this.f1497N = c3041c02;
        this.f1484A = aVar;
        this.f1500i = g7;
        this.f1501v = p1Var;
        B bR = v02.r();
        this.f1487D = bR;
        this.f1493J = new U0(j7.h(), bR.P(null));
        this.f1494K = v02;
        this.f1495L = v03;
        this.f1502w = B(v02, v03);
    }

    public static b B(V0 v02, V0 v03) {
        StringBuilder sb = new StringBuilder();
        sb.append(v02.d());
        sb.append(v03 == null ? BuildConfig.FLAVOR : v03.d());
        return b.a(sb.toString(), v02.r().N());
    }

    private static o1<?> C(p1 p1Var, Q.h hVar) {
        o1<?> o1VarK = new o0.a().f().k(false, p1Var);
        if (o1VarK == null) {
            return null;
        }
        E0 e02 = E0.e0(o1VarK);
        e02.f0(m.f1524G);
        return hVar.z(e02).d();
    }

    private int E() {
        synchronized (this.f1488E) {
            try {
                return this.f1484A.b() == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Map<G0, c> F(Collection<G0> collection, p1 p1Var, p1 p1Var2) {
        HashMap map = new HashMap();
        for (G0 g02 : collection) {
            map.put(g02, new c(Q.h.t0(g02) ? C(p1Var, (Q.h) g02) : g02.k(false, p1Var), g02.k(true, p1Var2)));
        }
        return map;
    }

    private int H(boolean z7) {
        int iG;
        synchronized (this.f1488E) {
            try {
                Iterator<AbstractC3056k> it = this.f1486C.iterator();
                AbstractC3056k abstractC3056k = null;
                while (true) {
                    iG = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC3056k next = it.next();
                    if (a0.d(next.g()) > 1) {
                        x0.g.j(abstractC3056k == null, "Can only have one sharing effect.");
                        abstractC3056k = next;
                    }
                }
                if (abstractC3056k != null) {
                    iG = abstractC3056k.g();
                }
                if (z7) {
                    iG |= 3;
                }
            } finally {
            }
        }
        return iG;
    }

    private Set<G0> I(Collection<G0> collection, boolean z7) {
        HashSet hashSet = new HashSet();
        int iH = H(z7);
        for (G0 g02 : collection) {
            x0.g.b(!Q.h.t0(g02), "Only support one level of sharing for now.");
            if (g02.B(iH)) {
                hashSet.add(g02);
            }
        }
        return hashSet;
    }

    private boolean K() {
        boolean z7;
        synchronized (this.f1488E) {
            z7 = this.f1487D.P(null) != null;
        }
        return z7;
    }

    private static boolean L(c1 c1Var, X0 x02) {
        X xD = c1Var.d();
        X xF = x02.f();
        if (xD.c().size() != x02.f().c().size()) {
            return true;
        }
        for (X.a<?> aVar : xD.c()) {
            if (!xF.b(aVar) || !Objects.equals(xF.f(aVar), xD.f(aVar))) {
                return true;
            }
        }
        return false;
    }

    private static boolean M(Collection<G0> collection) {
        Iterator<G0> it = collection.iterator();
        while (it.hasNext()) {
            if (T(it.next().j().o())) {
                return true;
            }
        }
        return false;
    }

    private static boolean N(Collection<G0> collection) {
        for (G0 g02 : collection) {
            if (S(g02)) {
                o1<?> o1VarJ = g02.j();
                X.a<?> aVar = C0348q0.f693N;
                if (o1VarJ.b(aVar) && ((Integer) x0.g.g((Integer) o1VarJ.f(aVar))).intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean O(Collection<G0> collection) {
        Iterator<G0> it = collection.iterator();
        while (it.hasNext()) {
            if (W(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean P() {
        boolean z7;
        synchronized (this.f1488E) {
            z7 = true;
            if (this.f1487D.E() != 1) {
                z7 = false;
            }
        }
        return z7;
    }

    private static boolean Q(Collection<G0> collection) {
        boolean z7 = false;
        boolean z8 = false;
        for (G0 g02 : collection) {
            if (U(g02) || Q.h.t0(g02)) {
                z7 = true;
            } else if (S(g02)) {
                z8 = true;
            }
        }
        return z7 && !z8;
    }

    private static boolean R(Collection<G0> collection) {
        boolean z7 = false;
        boolean z8 = false;
        for (G0 g02 : collection) {
            if (U(g02) || Q.h.t0(g02)) {
                z8 = true;
            } else if (S(g02)) {
                z7 = true;
            }
        }
        return z7 && !z8;
    }

    private static boolean S(G0 g02) {
        return g02 instanceof T;
    }

    private static boolean T(C3070z c3070z) {
        return (c3070z.a() == 10) || (c3070z.b() != 1 && c3070z.b() != 0);
    }

    private static boolean U(G0 g02) {
        return g02 instanceof o0;
    }

    static boolean V(Collection<G0> collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        for (G0 g02 : collection) {
            for (int i7 = 0; i7 < 3; i7++) {
                int i8 = iArr[i7];
                if (g02.B(i8)) {
                    if (hashSet.contains(Integer.valueOf(i8))) {
                        return false;
                    }
                    hashSet.add(Integer.valueOf(i8));
                }
            }
        }
        return true;
    }

    private static boolean W(G0 g02) {
        if (g02 != null) {
            if (g02.j().b(o1.f663B)) {
                return g02.j().F() == p1.b.VIDEO_CAPTURE;
            }
            Log.e("CameraUseCaseAdapter", g02 + " UseCase does not have capture type.");
        }
        return false;
    }

    public static void X(Surface surface, SurfaceTexture surfaceTexture, F0.g gVar) {
        surface.release();
        surfaceTexture.release();
    }

    public static void Y(F0 f02) throws ExecutionException, InterruptedException {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(f02.p().getWidth(), f02.p().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        f02.D(surface, F.a.a(), new InterfaceC2984a() {
            @Override
            public final void accept(Object obj) {
                f.X(surface, surfaceTexture, (F0.g) obj);
            }
        });
    }

    private void a0() {
        synchronized (this.f1488E) {
            try {
                if (this.f1490G != null) {
                    this.f1498d.h().c(this.f1490G);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static List<AbstractC3056k> c0(List<AbstractC3056k> list, Collection<G0> collection) {
        ArrayList arrayList = new ArrayList(list);
        for (G0 g02 : collection) {
            g02.S(null);
            for (AbstractC3056k abstractC3056k : list) {
                if (g02.B(abstractC3056k.g())) {
                    x0.g.j(g02.l() == null, g02 + " already has effect" + g02.l());
                    g02.S(abstractC3056k);
                    arrayList.remove(abstractC3056k);
                }
            }
        }
        return arrayList;
    }

    static void e0(List<AbstractC3056k> list, Collection<G0> collection, Collection<G0> collection2) {
        List<AbstractC3056k> listC0 = c0(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List<AbstractC3056k> listC02 = c0(listC0, arrayList);
        if (listC02.size() > 0) {
            C3043d0.l("CameraUseCaseAdapter", "Unused effects: " + listC02);
        }
    }

    private void g0(Map<G0, c1> map, Collection<G0> collection) {
        synchronized (this.f1488E) {
            try {
                if (this.f1485B != null && !collection.isEmpty()) {
                    Map<G0, Rect> mapA = o.a(this.f1498d.h().h(), this.f1498d.q().h() == 0, this.f1485B.a(), this.f1498d.q().l(this.f1485B.c()), this.f1485B.d(), this.f1485B.b(), map);
                    for (G0 g02 : collection) {
                        g02.V((Rect) x0.g.g(mapA.get(g02)));
                    }
                }
                for (G0 g03 : collection) {
                    g03.T(u(this.f1498d.h().h(), ((c1) x0.g.g(map.get(g03))).e()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void r() {
        synchronized (this.f1488E) {
            F fH = this.f1498d.h();
            this.f1490G = fH.k();
            fH.m();
        }
    }

    static Collection<G0> s(Collection<G0> collection, G0 g02, Q.h hVar) {
        ArrayList arrayList = new ArrayList(collection);
        if (g02 != null) {
            arrayList.add(g02);
        }
        if (hVar != null) {
            arrayList.add(hVar);
            arrayList.removeAll(hVar.k0());
        }
        return arrayList;
    }

    private z.G0 t(java.util.Collection<z.G0> r3, Q.h r4) {
        throw new UnsupportedOperationException("Method not decompiled: H.f.t(java.util.Collection, Q.h):z.G0");
    }

    private static Matrix u(Rect rect, Size size) {
        x0.g.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    private Map<G0, c1> v(int i7, I i8, Collection<G0> collection, Collection<G0> collection2, Map<G0, c> map) {
        Rect rectH;
        boolean z7;
        ArrayList arrayList = new ArrayList();
        String strD = i8.d();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Iterator<G0> it = collection2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            G0 next = it.next();
            AbstractC0315a abstractC0315aA = AbstractC0315a.a(this.f1500i.a(i7, strD, next.m(), next.f()), next.m(), next.f(), ((c1) x0.g.g(next.e())).b(), Q.h.i0(next), next.e().d(), next.j().H(null));
            arrayList.add(abstractC0315aA);
            map3.put(abstractC0315aA, next);
            map2.put(next, next.e());
        }
        if (!collection.isEmpty()) {
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            try {
                rectH = this.f1498d.h().h();
            } catch (NullPointerException unused) {
                rectH = null;
            }
            k kVar = new k(i8, rectH != null ? q.m(rectH) : null);
            loop1: while (true) {
                z7 = false;
                for (G0 g02 : collection) {
                    c cVar = map.get(g02);
                    o1<?> o1VarD = g02.D(i8, cVar.f1505a, cVar.f1506b);
                    map4.put(o1VarD, g02);
                    map5.put(o1VarD, kVar.m(o1VarD));
                    if (g02.j() instanceof M0) {
                        if (((M0) g02.j()).M() == 2) {
                            z7 = true;
                        }
                    }
                }
            }
            Pair<Map<o1<?>, c1>, Map<AbstractC0315a, c1>> pairB = this.f1500i.b(i7, strD, arrayList, map5, z7, O(collection));
            for (Map.Entry entry : map4.entrySet()) {
                map2.put((G0) entry.getValue(), (c1) ((Map) pairB.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) pairB.second).entrySet()) {
                if (map3.containsKey(entry2.getKey())) {
                    map2.put((G0) map3.get(entry2.getKey()), (c1) entry2.getValue());
                }
            }
        }
        return map2;
    }

    private void w(Collection<G0> collection) throws IllegalArgumentException {
        if (K()) {
            if (M(collection)) {
                throw new IllegalArgumentException(JmBUOGMwkkxg.lbCXTNT);
            }
            if (N(collection)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Ultra HDR image capture.");
            }
        }
        synchronized (this.f1488E) {
            try {
                if (!this.f1486C.isEmpty() && N(collection)) {
                    throw new IllegalArgumentException(KpBmp.zpdk);
                }
            } finally {
            }
        }
    }

    private T x() {
        return new T.b().r("ImageCapture-Extra").f();
    }

    private o0 y() {
        o0 o0VarF = new o0.a().o("Preview-Extra").f();
        o0VarF.o0(new o0.c() {
            @Override
            public final void a(F0 f02) throws ExecutionException, InterruptedException {
                f.Y(f02);
            }
        });
        return o0VarF;
    }

    private Q.h z(Collection<G0> collection, boolean z7) {
        synchronized (this.f1488E) {
            try {
                Set<G0> setI = I(collection, z7);
                if (setI.size() >= 2 || (K() && O(setI))) {
                    Q.h hVar = this.f1492I;
                    if (hVar != null && hVar.k0().equals(setI)) {
                        Q.h hVar2 = this.f1492I;
                        Objects.requireNonNull(hVar2);
                        return hVar2;
                    }
                    if (!V(setI)) {
                        return null;
                    }
                    return new Q.h(this.f1498d, this.f1499e, this.f1496M, this.f1497N, setI, this.f1501v);
                }
                return null;
            } finally {
            }
        }
    }

    public void A() {
        synchronized (this.f1488E) {
            try {
                if (this.f1489F) {
                    this.f1498d.n(new ArrayList(this.f1504z));
                    J j7 = this.f1499e;
                    if (j7 != null) {
                        j7.n(new ArrayList(this.f1504z));
                    }
                    r();
                    this.f1489F = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b D() {
        return this.f1502w;
    }

    public InterfaceC3060o G() {
        return this.f1495L;
    }

    public List<G0> J() {
        ArrayList arrayList;
        synchronized (this.f1488E) {
            arrayList = new ArrayList(this.f1503y);
        }
        return arrayList;
    }

    public void Z(Collection<G0> collection) {
        synchronized (this.f1488E) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f1503y);
            linkedHashSet.removeAll(collection);
            J j7 = this.f1499e;
            f0(linkedHashSet, j7 != null, j7 != null);
        }
    }

    @Override
    public InterfaceC3054j a() {
        return this.f1493J;
    }

    public void b0(List<AbstractC3056k> list) {
        synchronized (this.f1488E) {
            this.f1486C = list;
        }
    }

    @Override
    public InterfaceC3060o c() {
        return this.f1494K;
    }

    public void d0(I0 i02) {
        synchronized (this.f1488E) {
            this.f1485B = i02;
        }
    }

    void f0(Collection<G0> collection, boolean z7, boolean z8) {
        Map<G0, c1> map;
        c1 c1Var;
        X xD;
        synchronized (this.f1488E) {
            try {
                w(collection);
                if (!z7 && K() && O(collection)) {
                    f0(collection, true, z8);
                    return;
                }
                Q.h hVarZ = z(collection, z7);
                G0 g0T = t(collection, hVarZ);
                Collection<G0> collectionS = s(collection, g0T, hVarZ);
                ArrayList<G0> arrayList = new ArrayList(collectionS);
                arrayList.removeAll(this.f1504z);
                ArrayList<G0> arrayList2 = new ArrayList(collectionS);
                arrayList2.retainAll(this.f1504z);
                ArrayList<G0> arrayList3 = new ArrayList(this.f1504z);
                arrayList3.removeAll(collectionS);
                Map<G0, c> mapF = F(arrayList, this.f1487D.k(), this.f1501v);
                Map<G0, c1> mapEmptyMap = Collections.emptyMap();
                try {
                    Map<G0, c> map2 = mapF;
                    Map<G0, c1> mapV = v(E(), this.f1498d.q(), arrayList, arrayList2, map2);
                    if (this.f1499e != null) {
                        int iE = E();
                        J j7 = this.f1499e;
                        Objects.requireNonNull(j7);
                        map = mapV;
                        mapEmptyMap = v(iE, j7.q(), arrayList, arrayList2, map2);
                    } else {
                        map = mapV;
                    }
                    Map<G0, c1> map3 = mapEmptyMap;
                    g0(map, collectionS);
                    e0(this.f1486C, collectionS, collection);
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        ((G0) it.next()).W(this.f1498d);
                    }
                    this.f1498d.n(arrayList3);
                    if (this.f1499e != null) {
                        for (G0 g02 : arrayList3) {
                            J j8 = this.f1499e;
                            Objects.requireNonNull(j8);
                            g02.W(j8);
                        }
                        J j9 = this.f1499e;
                        Objects.requireNonNull(j9);
                        j9.n(arrayList3);
                    }
                    if (arrayList3.isEmpty()) {
                        for (G0 g03 : arrayList2) {
                            if (map.containsKey(g03) && (xD = (c1Var = map.get(g03)).d()) != null && L(c1Var, g03.w())) {
                                g03.Z(xD);
                                if (this.f1489F) {
                                    this.f1498d.d(g03);
                                    J j10 = this.f1499e;
                                    if (j10 != null) {
                                        Objects.requireNonNull(j10);
                                        j10.d(g03);
                                    }
                                }
                            }
                        }
                    }
                    for (G0 g04 : arrayList) {
                        Map<G0, c> map4 = map2;
                        c cVar = map4.get(g04);
                        Objects.requireNonNull(cVar);
                        J j11 = this.f1499e;
                        if (j11 != null) {
                            J j12 = this.f1498d;
                            Objects.requireNonNull(j11);
                            g04.b(j12, j11, cVar.f1505a, cVar.f1506b);
                            g04.Y((c1) x0.g.g(map.get(g04)), map3.get(g04));
                        } else {
                            g04.b(this.f1498d, null, cVar.f1505a, cVar.f1506b);
                            g04.Y((c1) x0.g.g(map.get(g04)), null);
                        }
                        map2 = map4;
                    }
                    if (this.f1489F) {
                        this.f1498d.l(arrayList);
                        J j13 = this.f1499e;
                        if (j13 != null) {
                            Objects.requireNonNull(j13);
                            j13.l(arrayList);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((G0) it2.next()).H();
                    }
                    this.f1503y.clear();
                    this.f1503y.addAll(collection);
                    this.f1504z.clear();
                    this.f1504z.addAll(collectionS);
                    this.f1491H = g0T;
                    this.f1492I = hVarZ;
                } catch (IllegalArgumentException e7) {
                    if (z7 || K() || this.f1484A.b() == 2) {
                        throw e7;
                    }
                    f0(collection, true, z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(Collection<G0> collection) throws a {
        synchronized (this.f1488E) {
            try {
                this.f1498d.f(this.f1487D);
                J j7 = this.f1499e;
                if (j7 != null) {
                    j7.f(this.f1487D);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f1503y);
                linkedHashSet.addAll(collection);
                try {
                    J j8 = this.f1499e;
                    f0(linkedHashSet, j8 != null, j8 != null);
                } catch (IllegalArgumentException e7) {
                    throw new a(e7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(boolean z7) {
        this.f1498d.k(z7);
    }

    public void m() {
        synchronized (this.f1488E) {
            try {
                if (!this.f1489F) {
                    if (!this.f1504z.isEmpty()) {
                        this.f1498d.f(this.f1487D);
                        J j7 = this.f1499e;
                        if (j7 != null) {
                            j7.f(this.f1487D);
                        }
                    }
                    this.f1498d.l(this.f1504z);
                    J j8 = this.f1499e;
                    if (j8 != null) {
                        j8.l(this.f1504z);
                    }
                    a0();
                    Iterator<G0> it = this.f1504z.iterator();
                    while (it.hasNext()) {
                        it.next().H();
                    }
                    this.f1489F = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
