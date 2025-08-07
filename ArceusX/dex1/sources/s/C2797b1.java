package s;

import C.AbstractC0324e0;
import C.AbstractC0345p;
import C.V;
import C.X0;
import S9.Gvmm.CAqKeu;
import Z.tNT.PexNRiLSd;
import Za.qhkq.dHkZSUxHu;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.utils.SurfaceUtil;
import androidx.concurrent.futures.c;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import r.C2739a;
import s.L0;
import s.P1;
import s.a2;
import u.C2923d;
import u.C2926g;
import z.C3043d0;
import z.C3070z;

final class C2797b1 implements InterfaceC2800c1 {

    final Object f23271a;

    private final List<C.V> f23272b;

    private final d f23273c;

    P1.a f23274d;

    P1 f23275e;

    C.X0 f23276f;

    private final Map<AbstractC0324e0, Surface> f23277g;

    List<AbstractC0324e0> f23278h;

    c f23279i;

    com.google.common.util.concurrent.p<Void> f23280j;

    c.a<Void> f23281k;

    private Map<AbstractC0324e0, Long> f23282l;

    private final w.v f23283m;

    private final w.z f23284n;

    private final w.s f23285o;

    private final C2926g f23286p;

    private final w.y f23287q;

    private final boolean f23288r;

    class a implements G.c<Void> {
        a() {
        }

        @Override
        public void onSuccess(Void r1) {
        }

        @Override
        public void onFailure(Throwable th) {
            synchronized (C2797b1.this.f23271a) {
                try {
                    C2797b1.this.f23274d.stop();
                    int iOrdinal = C2797b1.this.f23279i.ordinal();
                    if ((iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 6) && !(th instanceof CancellationException)) {
                        C3043d0.m("CaptureSession", "Opening session with fail " + C2797b1.this.f23279i, th);
                        C2797b1.this.r();
                    }
                } finally {
                }
            }
        }
    }

    class b extends CameraCaptureSession.CaptureCallback {
        b() {
        }

        @Override
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            synchronized (C2797b1.this.f23271a) {
                try {
                    C.X0 x02 = C2797b1.this.f23276f;
                    if (x02 == null) {
                        return;
                    }
                    C.V vK = x02.k();
                    C3043d0.a("CaptureSession", "Submit FLASH_MODE_OFF request");
                    C2797b1 c2797b1 = C2797b1.this;
                    c2797b1.f(Collections.singletonList(c2797b1.f23284n.a(vK)));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    enum c {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    final class d extends P1.c {
        d() {
        }

        @Override
        public void r(P1 p1) {
            synchronized (C2797b1.this.f23271a) {
                try {
                    switch (C2797b1.this.f23279i) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + C2797b1.this.f23279i);
                        case OPENING:
                        case CLOSED:
                        case RELEASING:
                            C2797b1.this.r();
                            break;
                        case RELEASED:
                            C3043d0.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                    }
                    C3043d0.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + C2797b1.this.f23279i);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override
        public void s(P1 p1) {
            synchronized (C2797b1.this.f23271a) {
                try {
                    switch (C2797b1.this.f23279i) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                        case RELEASED:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + C2797b1.this.f23279i);
                        case OPENING:
                            C2797b1 c2797b1 = C2797b1.this;
                            c2797b1.f23279i = c.OPENED;
                            c2797b1.f23275e = p1;
                            C3043d0.a("CaptureSession", "Attempting to send capture request onConfigured");
                            C2797b1 c2797b12 = C2797b1.this;
                            c2797b12.x(c2797b12.f23276f);
                            C2797b1.this.w();
                            break;
                        case CLOSED:
                            C2797b1.this.f23275e = p1;
                            break;
                        case RELEASING:
                            p1.close();
                            break;
                    }
                    C3043d0.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C2797b1.this.f23279i);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override
        public void t(P1 p1) {
            synchronized (C2797b1.this.f23271a) {
                try {
                    if (C2797b1.this.f23279i.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + C2797b1.this.f23279i);
                    }
                    C3043d0.a("CaptureSession", "CameraCaptureSession.onReady() " + C2797b1.this.f23279i);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override
        public void u(P1 p1) {
            synchronized (C2797b1.this.f23271a) {
                try {
                    if (C2797b1.this.f23279i == c.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + C2797b1.this.f23279i);
                    }
                    C3043d0.a("CaptureSession", "onSessionFinished()");
                    C2797b1.this.r();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    C2797b1(C2926g c2926g) {
        this(c2926g, false);
    }

    public Object B(c.a aVar) throws Exception {
        String str;
        synchronized (this.f23271a) {
            x0.g.j(this.f23281k == null, "Release completer expected to be null");
            this.f23281k = aVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    public com.google.common.util.concurrent.p<Void> A(List<Surface> list, C.X0 x02, CameraDevice cameraDevice) {
        synchronized (this.f23271a) {
            try {
                int iOrdinal = this.f23279i.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        this.f23277g.clear();
                        for (int i7 = 0; i7 < list.size(); i7++) {
                            this.f23277g.put(this.f23278h.get(i7), list.get(i7));
                        }
                        this.f23279i = c.OPENING;
                        C3043d0.a("CaptureSession", "Opening capture session.");
                        P1.c cVarW = a2.w(this.f23273c, new a2.a(x02.l()));
                        C2739a c2739a = new C2739a(x02.f());
                        V.a aVarK = V.a.k(x02.k());
                        Map map = new HashMap();
                        if (this.f23288r && Build.VERSION.SDK_INT >= 35) {
                            map = q(u(x02.h()), this.f23277g);
                        }
                        ArrayList arrayList = new ArrayList();
                        String strD0 = c2739a.d0(null);
                        for (X0.f fVar : x02.h()) {
                            u.k kVarS = (!this.f23288r || Build.VERSION.SDK_INT < 35) ? null : (u.k) map.get(fVar);
                            if (kVarS == null) {
                                kVarS = s(fVar, this.f23277g, strD0);
                                if (this.f23282l.containsKey(fVar.f())) {
                                    kVarS.h(this.f23282l.get(fVar.f()).longValue());
                                }
                            }
                            arrayList.add(kVarS);
                        }
                        u.q qVarG = this.f23274d.g(x02.m(), t(arrayList), cVarW);
                        if (x02.p() == 5 && x02.g() != null) {
                            qVarG.f(u.j.b(x02.g()));
                        }
                        try {
                            CaptureRequest captureRequestF = C2767E0.f(aVarK.h(), cameraDevice, this.f23287q);
                            if (captureRequestF != null) {
                                qVarG.g(captureRequestF);
                            }
                            return this.f23274d.e(cameraDevice, qVarG, this.f23278h);
                        } catch (CameraAccessException e7) {
                            return G.n.n(e7);
                        }
                    }
                    if (iOrdinal != 4) {
                        return G.n.n(new CancellationException("openCaptureSession() not execute in state: " + this.f23279i));
                    }
                }
                return G.n.n(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f23279i));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private CameraCaptureSession.CaptureCallback o(List<AbstractC0345p> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator<AbstractC0345p> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(U0.a(it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return C2786U.a(arrayList);
    }

    private static List<OutputConfiguration> p(List<MultiResolutionStreamInfo> list, int i7) {
        try {
            return (List) OutputConfiguration.class.getMethod(dHkZSUxHu.XHWtYCi, Collection.class, Integer.TYPE).invoke(null, list, Integer.valueOf(i7));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
            C3043d0.c("CaptureSession", "Failed to create instances for multi-resolution output, " + e7.getMessage());
            return null;
        }
    }

    private static Map<X0.f, u.k> q(Map<Integer, List<X0.f>> map, Map<AbstractC0324e0, Surface> map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.intValue();
            ArrayList arrayList = new ArrayList();
            int i7 = 0;
            for (X0.f fVar : map.get(num)) {
                SurfaceUtil.a aVarA = SurfaceUtil.a(map2.get(fVar.f()));
                if (i7 == 0) {
                    i7 = aVarA.f9475a;
                }
                W0.a();
                int i8 = aVarA.f9476b;
                int i9 = aVarA.f9477c;
                String strD = fVar.d();
                Objects.requireNonNull(strD);
                arrayList.add(V0.a(i8, i9, strD));
            }
            if (i7 == 0 || arrayList.isEmpty()) {
                C3043d0.c("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: " + i7 + ", streamInfos size: " + arrayList.size());
            } else {
                List<OutputConfiguration> listP = p(arrayList, i7);
                if (listP != null) {
                    for (X0.f fVar2 : map.get(num)) {
                        OutputConfiguration outputConfigurationRemove = listP.remove(0);
                        outputConfigurationRemove.addSurface(map2.get(fVar2.f()));
                        map3.put(fVar2, new u.k(outputConfigurationRemove));
                    }
                }
            }
        }
        return map3;
    }

    private u.k s(X0.f fVar, Map<AbstractC0324e0, Surface> map, String str) {
        long jLongValue;
        DynamicRangeProfiles dynamicRangeProfilesD;
        Surface surface = map.get(fVar.f());
        x0.g.h(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        u.k kVar = new u.k(fVar.g(), surface);
        if (str != null) {
            kVar.g(str);
        } else {
            kVar.g(fVar.d());
        }
        if (fVar.c() == 0) {
            kVar.f(1);
        } else if (fVar.c() == 1) {
            kVar.f(2);
        }
        if (!fVar.e().isEmpty()) {
            kVar.b();
            Iterator<AbstractC0324e0> it = fVar.e().iterator();
            while (it.hasNext()) {
                Surface surface2 = map.get(it.next());
                x0.g.h(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                kVar.a(surface2);
            }
        }
        if (Build.VERSION.SDK_INT < 33 || (dynamicRangeProfilesD = this.f23286p.d()) == null) {
            jLongValue = 1;
        } else {
            C3070z c3070zB = fVar.b();
            Long lA = C2923d.a(c3070zB, dynamicRangeProfilesD);
            if (lA == null) {
                C3043d0.c("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + c3070zB);
                jLongValue = 1;
            } else {
                jLongValue = lA.longValue();
            }
        }
        kVar.e(jLongValue);
        return kVar;
    }

    private List<u.k> t(List<u.k> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (u.k kVar : list) {
            if (!arrayList.contains(kVar.d())) {
                arrayList.add(kVar.d());
                arrayList2.add(kVar);
            }
        }
        return arrayList2;
    }

    private static Map<Integer, List<X0.f>> u(Collection<X0.f> collection) {
        HashMap map = new HashMap();
        for (X0.f fVar : collection) {
            if (fVar.g() > 0 && fVar.e().isEmpty()) {
                List arrayList = (List) map.get(Integer.valueOf(fVar.g()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Integer.valueOf(fVar.g()), arrayList);
                }
                arrayList.add(fVar);
            }
        }
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            num.intValue();
            if (((List) map.get(num)).size() >= 2) {
                map2.put(num, (List) map.get(num));
            }
        }
        return map2;
    }

    public void y(CameraCaptureSession cameraCaptureSession, int i7, boolean z7) {
        synchronized (this.f23271a) {
            try {
                if (this.f23279i == c.OPENED) {
                    x(this.f23276f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this.f23271a) {
            if (this.f23272b.isEmpty()) {
                return;
            }
            try {
                v(this.f23272b);
            } finally {
                this.f23272b.clear();
            }
        }
    }

    @Override
    public com.google.common.util.concurrent.p<Void> a(final C.X0 x02, final CameraDevice cameraDevice, P1.a aVar) {
        synchronized (this.f23271a) {
            try {
                if (this.f23279i.ordinal() == 1) {
                    this.f23279i = c.GET_SURFACE;
                    ArrayList arrayList = new ArrayList(x02.o());
                    this.f23278h = arrayList;
                    this.f23274d = aVar;
                    G.d dVarG = G.d.a(aVar.m(arrayList, 5000L)).g(new G.a() {
                        @Override
                        public final com.google.common.util.concurrent.p apply(Object obj) {
                            return this.f23203a.A(x02, cameraDevice, (List) obj);
                        }
                    }, this.f23274d.a());
                    G.n.j(dVarG, new a(), this.f23274d.a());
                    return G.n.B(dVarG);
                }
                C3043d0.c("CaptureSession", "Open not allowed in state: " + this.f23279i);
                return G.n.n(new IllegalStateException("open() should not allow the state: " + this.f23279i));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public void b(C.X0 x02) {
        synchronized (this.f23271a) {
            try {
                switch (this.f23279i) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f23279i);
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f23276f = x02;
                        break;
                    case OPENED:
                        this.f23276f = x02;
                        if (x02 != null) {
                            if (!this.f23277g.keySet().containsAll(x02.o())) {
                                C3043d0.c(PexNRiLSd.enchUSZ, "Does not have the proper configured lists");
                                return;
                            } else {
                                C3043d0.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                                x(this.f23276f);
                                break;
                            }
                        } else {
                            return;
                        }
                    case CLOSED:
                    case RELEASING:
                    case RELEASED:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override
    public void c() {
        ArrayList<C.V> arrayList;
        synchronized (this.f23271a) {
            try {
                if (this.f23272b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.f23272b);
                    this.f23272b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            for (C.V v7 : arrayList) {
                Iterator<AbstractC0345p> it = v7.c().iterator();
                while (it.hasNext()) {
                    it.next().a(v7.f());
                }
            }
        }
    }

    @Override
    public void close() {
        synchronized (this.f23271a) {
            try {
                int iOrdinal = this.f23279i.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.f23279i);
                }
                if (iOrdinal == 1) {
                    this.f23279i = c.RELEASED;
                } else if (iOrdinal == 2) {
                    x0.g.h(this.f23274d, "The Opener shouldn't null in state:" + this.f23279i);
                    this.f23274d.stop();
                    this.f23279i = c.RELEASED;
                } else if (iOrdinal == 3 || iOrdinal == 4) {
                    x0.g.h(this.f23274d, "The Opener shouldn't null in state:" + this.f23279i);
                    this.f23274d.stop();
                    this.f23279i = c.CLOSED;
                    this.f23285o.i();
                    this.f23276f = null;
                }
            } finally {
            }
        }
    }

    @Override
    public com.google.common.util.concurrent.p<Void> d(boolean z7) {
        synchronized (this.f23271a) {
            switch (this.f23279i) {
                case UNINITIALIZED:
                    throw new IllegalStateException("release() should not be possible in state: " + this.f23279i);
                case GET_SURFACE:
                    x0.g.h(this.f23274d, "The Opener shouldn't null in state:" + this.f23279i);
                    this.f23274d.stop();
                case INITIALIZED:
                    this.f23279i = c.RELEASED;
                    return G.n.p(null);
                case OPENED:
                case CLOSED:
                    P1 p1 = this.f23275e;
                    if (p1 != null) {
                        if (z7) {
                            try {
                                p1.j();
                            } catch (CameraAccessException e7) {
                                C3043d0.d("CaptureSession", "Unable to abort captures.", e7);
                            }
                        }
                        this.f23275e.close();
                    }
                case OPENING:
                    this.f23279i = c.RELEASING;
                    this.f23285o.i();
                    x0.g.h(this.f23274d, "The Opener shouldn't null in state:" + this.f23279i);
                    if (this.f23274d.stop()) {
                        r();
                        return G.n.p(null);
                    }
                case RELEASING:
                    if (this.f23280j == null) {
                        this.f23280j = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
                            @Override
                            public final Object a(c.a aVar) {
                                return this.f23200a.B(aVar);
                            }
                        });
                    }
                    return this.f23280j;
                default:
                    return G.n.p(null);
            }
        }
    }

    @Override
    public List<C.V> e() {
        List<C.V> listUnmodifiableList;
        synchronized (this.f23271a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f23272b);
        }
        return listUnmodifiableList;
    }

    @Override
    public void f(List<C.V> list) {
        synchronized (this.f23271a) {
            try {
                switch (this.f23279i) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f23279i);
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f23272b.addAll(list);
                        break;
                    case OPENED:
                        this.f23272b.addAll(list);
                        w();
                        break;
                    case CLOSED:
                    case RELEASING:
                    case RELEASED:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override
    public C.X0 g() {
        C.X0 x02;
        synchronized (this.f23271a) {
            x02 = this.f23276f;
        }
        return x02;
    }

    @Override
    public boolean h() {
        boolean z7;
        synchronized (this.f23271a) {
            try {
                c cVar = this.f23279i;
                z7 = cVar == c.OPENED || cVar == c.OPENING;
            } finally {
            }
        }
        return z7;
    }

    @Override
    public void i(Map<AbstractC0324e0, Long> map) {
        synchronized (this.f23271a) {
            this.f23282l = map;
        }
    }

    void r() {
        c cVar = this.f23279i;
        c cVar2 = c.RELEASED;
        if (cVar == cVar2) {
            C3043d0.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f23279i = cVar2;
        this.f23275e = null;
        c.a<Void> aVar = this.f23281k;
        if (aVar != null) {
            aVar.c(null);
            this.f23281k = null;
        }
    }

    int v(List<C.V> list) {
        L0 l02;
        ArrayList arrayList;
        boolean z7;
        synchronized (this.f23271a) {
            try {
                if (this.f23279i != c.OPENED) {
                    C3043d0.a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return -1;
                }
                if (list.isEmpty()) {
                    return -1;
                }
                try {
                    l02 = new L0();
                    arrayList = new ArrayList();
                    C3043d0.a("CaptureSession", "Issuing capture request.");
                    z7 = false;
                    for (C.V v7 : list) {
                        if (v7.i().isEmpty()) {
                            C3043d0.a("CaptureSession", "Skipping issuing empty capture request.");
                        } else {
                            Iterator<AbstractC0324e0> it = v7.i().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    AbstractC0324e0 next = it.next();
                                    if (!this.f23277g.containsKey(next)) {
                                        C3043d0.a("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                        break;
                                    }
                                } else {
                                    if (v7.k() == 2) {
                                        z7 = true;
                                    }
                                    V.a aVarK = V.a.k(v7);
                                    if (v7.k() == 5 && v7.d() != null) {
                                        aVarK.p(v7.d());
                                    }
                                    C.X0 x02 = this.f23276f;
                                    if (x02 != null) {
                                        aVarK.e(x02.k().g());
                                    }
                                    aVarK.e(v7.g());
                                    CaptureRequest captureRequestE = C2767E0.e(aVarK.h(), this.f23275e.k(), this.f23277g, false, this.f23287q);
                                    if (captureRequestE == null) {
                                        C3043d0.a("CaptureSession", "Skipping issuing request without surface.");
                                        return -1;
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator<AbstractC0345p> it2 = v7.c().iterator();
                                    while (it2.hasNext()) {
                                        U0.b(it2.next(), arrayList2);
                                    }
                                    l02.a(captureRequestE, arrayList2);
                                    arrayList.add(captureRequestE);
                                }
                            }
                        }
                    }
                } catch (CameraAccessException e7) {
                    C3043d0.c("CaptureSession", "Unable to access camera: " + e7.getMessage());
                    Thread.dumpStack();
                }
                if (arrayList.isEmpty()) {
                    C3043d0.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                    return -1;
                }
                if (this.f23283m.a(arrayList, z7)) {
                    this.f23275e.b();
                    l02.c(new L0.a() {
                        @Override
                        public final void a(CameraCaptureSession cameraCaptureSession, int i7, boolean z8) {
                            this.f23267a.y(cameraCaptureSession, i7, z8);
                        }
                    });
                }
                if (this.f23284n.b(arrayList, z7)) {
                    l02.a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new b()));
                }
                return this.f23275e.f(arrayList, l02);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void w() {
        this.f23285o.e().c(new Runnable() {
            @Override
            public final void run() {
                this.f23210d.z();
            }
        }, F.a.a());
    }

    int x(C.X0 x02) {
        synchronized (this.f23271a) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            if (x02 == null) {
                C3043d0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            if (this.f23279i != c.OPENED) {
                C3043d0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return -1;
            }
            C.V vK = x02.k();
            if (vK.i().isEmpty()) {
                C3043d0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f23275e.b();
                } catch (CameraAccessException e7) {
                    C3043d0.c(CAqKeu.DEbEwUWdxWXZBd, "Unable to access camera: " + e7.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                C3043d0.a("CaptureSession", JmBUOGMwkkxg.kwGGB);
                CaptureRequest captureRequestE = C2767E0.e(vK, this.f23275e.k(), this.f23277g, true, this.f23287q);
                if (captureRequestE == null) {
                    C3043d0.a("CaptureSession", "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.f23275e.l(captureRequestE, this.f23285o.d(o(vK.c(), new CameraCaptureSession.CaptureCallback[0])));
            } catch (CameraAccessException e8) {
                C3043d0.c("CaptureSession", "Unable to access camera: " + e8.getMessage());
                Thread.dumpStack();
                return -1;
            }
            throw th;
        }
    }

    C2797b1(C2926g c2926g, boolean z7) {
        this(c2926g, new C.R0(Collections.emptyList()), z7);
    }

    C2797b1(C2926g c2926g, C.R0 r02) {
        this(c2926g, r02, false);
    }

    C2797b1(C2926g c2926g, C.R0 r02, boolean z7) {
        this.f23271a = new Object();
        this.f23272b = new ArrayList();
        this.f23277g = new HashMap();
        this.f23278h = Collections.emptyList();
        this.f23279i = c.UNINITIALIZED;
        this.f23282l = new HashMap();
        this.f23283m = new w.v();
        this.f23284n = new w.z();
        this.f23279i = c.INITIALIZED;
        this.f23286p = c2926g;
        this.f23273c = new d();
        this.f23285o = new w.s(r02.a(CaptureNoResponseQuirk.class));
        this.f23287q = new w.y(r02);
        this.f23288r = z7;
    }
}
