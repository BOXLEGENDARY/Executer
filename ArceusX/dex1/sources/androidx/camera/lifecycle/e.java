package androidx.camera.lifecycle;

import C.B;
import C.C0338l0;
import C.D;
import C.E;
import C.G;
import C.I;
import C.J;
import C.V0;
import G.n;
import H.f;
import android.content.Context;
import android.view.InterfaceC1701o;
import androidx.camera.lifecycle.e;
import androidx.concurrent.futures.c;
import com.github.luben.zstd.BuildConfig;
import com.google.common.util.concurrent.p;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import n.InterfaceC2621a;
import x0.g;
import z.AbstractC3056k;
import z.C3041c0;
import z.C3061p;
import z.C3066v;
import z.C3067w;
import z.G0;
import z.H0;
import z.I0;
import z.InterfaceC3052i;
import z.InterfaceC3059n;
import z.InterfaceC3060o;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 X2\u00020\u0001:\u00014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a0\u0019\"\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"Jk\u0010-\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\n2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010(2\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*2\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a0\u0019\"\u0004\u0018\u00010\u001aH\u0001¢\u0006\u0004\b-\u0010.J'\u0010/\u001a\u00020\u00122\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a0\u0019\"\u0004\u0018\u00010\u001aH\u0017¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0012H\u0017¢\u0006\u0004\b1\u0010\u0003J\u0017\u00102\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010A\u001a\u0010\u0012\f\u0012\n ?*\u0004\u0018\u00010>0>0\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010<R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N0L8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bO\u0010PR$\u0010S\u001a\u00020R2\u0006\u0010S\u001a\u00020R8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Landroidx/camera/lifecycle/e;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/google/common/util/concurrent/p;", "Lz/v;", "u", "(Landroid/content/Context;)Lcom/google/common/util/concurrent/p;", "Lz/p;", "cameraSelector", "Lz/o;", "cameraInfo", "LC/B;", "q", "(Lz/p;Lz/o;)LC/B;", "cameraX", BuildConfig.FLAVOR, "y", "(Lz/v;)V", "z", "(Landroid/content/Context;)V", "Landroidx/lifecycle/o;", "lifecycleOwner", BuildConfig.FLAVOR, "Lz/G0;", "useCases", "Lz/i;", "o", "(Landroidx/lifecycle/o;Lz/p;[Lz/G0;)Lz/i;", "Lz/H0;", "useCaseGroup", "n", "(Landroidx/lifecycle/o;Lz/p;Lz/H0;)Lz/i;", "primaryCameraSelector", "secondaryCameraSelector", "Lz/c0;", "primaryLayoutSettings", "secondaryLayoutSettings", "Lz/I0;", "viewPort", BuildConfig.FLAVOR, "Lz/k;", "effects", "p", "(Landroidx/lifecycle/o;Lz/p;Lz/p;Lz/c0;Lz/c0;Lz/I0;Ljava/util/List;[Lz/G0;)Lz/i;", "A", "([Lz/G0;)V", "B", "r", "(Lz/p;)Lz/o;", "a", "Ljava/lang/Object;", "mLock", "Lz/w$b;", "b", "Lz/w$b;", "mCameraXConfigProvider", "c", "Lcom/google/common/util/concurrent/p;", "mCameraXInitializeFuture", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "d", "mCameraXShutdownFuture", "Landroidx/camera/lifecycle/LifecycleCameraRepository;", "e", "Landroidx/camera/lifecycle/LifecycleCameraRepository;", "mLifecycleCameraRepository", "f", "Lz/v;", "mCameraX", "g", "Landroid/content/Context;", "mContext", BuildConfig.FLAVOR, "LH/f$b;", "LC/V0;", "h", "Ljava/util/Map;", "mCameraInfoMap", BuildConfig.FLAVOR, "cameraOperatingMode", "s", "()I", "x", "(I)V", "i", "camera-lifecycle_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    public static final Companion INSTANCE = new Companion(null);

    private static final e f9542j = new e();

    private final Object mLock = new Object();

    private C3067w.b mCameraXConfigProvider;

    private p<C3066v> mCameraXInitializeFuture;

    private p<Void> mCameraXShutdownFuture;

    private final LifecycleCameraRepository mLifecycleCameraRepository;

    private C3066v mCameraX;

    private Context mContext;

    private final Map<f.b, V0> mCameraInfoMap;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/camera/lifecycle/e$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/google/common/util/concurrent/p;", "Landroidx/camera/lifecycle/e;", "b", "(Landroid/content/Context;)Lcom/google/common/util/concurrent/p;", "sAppInstance", "Landroidx/camera/lifecycle/e;", "camera-lifecycle_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz/v;", "kotlin.jvm.PlatformType", "cameraX", "Landroidx/camera/lifecycle/e;", "a", "(Lz/v;)Landroidx/camera/lifecycle/e;"}, k = 3, mv = {1, 8, 0})
        static final class C0073a extends l implements Function1<C3066v, e> {

            final Context f9551d;

            C0073a(Context context) {
                super(1);
                this.f9551d = context;
            }

            public final e invoke(C3066v c3066v) {
                e eVar = e.f9542j;
                Intrinsics.checkNotNullExpressionValue(c3066v, "cameraX");
                eVar.y(c3066v);
                e eVar2 = e.f9542j;
                Context contextA = E.e.a(this.f9551d);
                Intrinsics.checkNotNullExpressionValue(contextA, "getApplicationContext(context)");
                eVar2.z(contextA);
                return e.f9542j;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final e c(Function1 function1, Object obj) {
            Intrinsics.checkNotNullParameter(function1, "$tmp0");
            return (e) function1.invoke(obj);
        }

        public final p<e> b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            g.g(context);
            p pVarU = e.f9542j.u(context);
            final C0073a c0073a = new C0073a(context);
            p<e> pVarG = n.G(pVarU, new InterfaceC2621a() {
                @Override
                public final Object apply(Object obj) {
                    return e.Companion.c(c0073a, obj);
                }
            }, F.a.a());
            Intrinsics.checkNotNullExpressionValue(pVarG, "context: Context): Liste…tExecutor()\n            )");
            return pVarG;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/camera/lifecycle/e$b", "LG/c;", "Ljava/lang/Void;", "result", BuildConfig.FLAVOR, "a", "(Ljava/lang/Void;)V", BuildConfig.FLAVOR, "t", "onFailure", "(Ljava/lang/Throwable;)V", "camera-lifecycle_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements G.c<Void> {

        final c.a<C3066v> f9552a;

        final C3066v f9553b;

        b(c.a<C3066v> aVar, C3066v c3066v) {
            this.f9552a = aVar;
            this.f9553b = c3066v;
        }

        @Override
        public void onSuccess(Void result) {
            this.f9552a.c(this.f9553b);
        }

        @Override
        public void onFailure(Throwable t7) {
            Intrinsics.checkNotNullParameter(t7, "t");
            this.f9552a.f(t7);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00000\u00000\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Void;", "it", "Lcom/google/common/util/concurrent/p;", "kotlin.jvm.PlatformType", "a", "(Ljava/lang/Void;)Lcom/google/common/util/concurrent/p;"}, k = 3, mv = {1, 8, 0})
    static final class c extends l implements Function1<Void, p<Void>> {

        final C3066v f9554d;

        c(C3066v c3066v) {
            super(1);
            this.f9554d = c3066v;
        }

        public final p<Void> invoke(Void r1) {
            return this.f9554d.i();
        }
    }

    private e() {
        p<Void> pVarP = n.p(null);
        Intrinsics.checkNotNullExpressionValue(pVarP, "immediateFuture<Void>(null)");
        this.mCameraXShutdownFuture = pVarP;
        this.mLifecycleCameraRepository = new LifecycleCameraRepository();
        this.mCameraInfoMap = new HashMap();
    }

    public final B q(C3061p cameraSelector, InterfaceC3060o cameraInfo) {
        Iterator<InterfaceC3059n> it = cameraSelector.c().iterator();
        B b2 = null;
        while (it.hasNext()) {
            InterfaceC3059n next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "cameraSelector.cameraFilterSet");
            InterfaceC3059n interfaceC3059n = next;
            if (!Intrinsics.b(interfaceC3059n.a(), InterfaceC3059n.f24669a)) {
                D dA = C0338l0.a(interfaceC3059n.a());
                Context context = this.mContext;
                Intrinsics.d(context);
                B bA = dA.a(cameraInfo, context);
                if (bA == null) {
                    continue;
                } else {
                    if (b2 != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    b2 = bA;
                }
            }
        }
        return b2 == null ? E.a() : b2;
    }

    public final int s() {
        C3066v c3066v = this.mCameraX;
        if (c3066v == null) {
            return 0;
        }
        Intrinsics.d(c3066v);
        return c3066v.e().d().b();
    }

    public static final p<e> t(Context context) {
        return INSTANCE.b(context);
    }

    public final p<C3066v> u(Context context) {
        synchronized (this.mLock) {
            p<C3066v> pVar = this.mCameraXInitializeFuture;
            if (pVar != null) {
                Intrinsics.e(pVar, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX>");
                return pVar;
            }
            final C3066v c3066v = new C3066v(context, this.mCameraXConfigProvider);
            p<C3066v> pVarA = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
                @Override
                public final Object a(c.a aVar) {
                    return e.v(this.f9537a, c3066v, aVar);
                }
            });
            this.mCameraXInitializeFuture = pVarA;
            Intrinsics.e(pVarA, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX>");
            return pVarA;
        }
    }

    public static final Object v(e eVar, C3066v c3066v, c.a aVar) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        Intrinsics.checkNotNullParameter(c3066v, "$cameraX");
        Intrinsics.checkNotNullParameter(aVar, "completer");
        synchronized (eVar.mLock) {
            G.d dVarA = G.d.a(eVar.mCameraXShutdownFuture);
            final c cVar = new c(c3066v);
            G.d dVarG = dVarA.g(new G.a() {
                @Override
                public final p apply(Object obj) {
                    return e.w(cVar, obj);
                }
            }, F.a.a());
            Intrinsics.checkNotNullExpressionValue(dVarG, "cameraX = CameraX(contex…                        )");
            n.j(dVarG, new b(aVar, c3066v), F.a.a());
            Unit unit = Unit.a;
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    public static final p w(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        return (p) function1.invoke(obj);
    }

    public final void x(int i7) {
        C3066v c3066v = this.mCameraX;
        if (c3066v == null) {
            return;
        }
        Intrinsics.d(c3066v);
        c3066v.e().d().d(i7);
    }

    public final void y(C3066v cameraX) {
        this.mCameraX = cameraX;
    }

    public final void z(Context context) {
        this.mContext = context;
    }

    public void A(G0... useCases) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        h1.a.a("CX:unbind");
        try {
            E.p.a();
            if (s() == 2) {
                throw new UnsupportedOperationException("Unbind usecase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            this.mLifecycleCameraRepository.k(CollectionsKt.m(Arrays.copyOf(useCases, useCases.length)));
            Unit unit = Unit.a;
        } finally {
            h1.a.b();
        }
    }

    public void B() {
        h1.a.a("CX:unbindAll");
        try {
            E.p.a();
            x(0);
            this.mLifecycleCameraRepository.l();
            Unit unit = Unit.a;
        } finally {
            h1.a.b();
        }
    }

    public final InterfaceC3052i n(InterfaceC1701o lifecycleOwner, C3061p cameraSelector, H0 useCaseGroup) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCaseGroup, "useCaseGroup");
        h1.a.a("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (s() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
            }
            x(1);
            C3041c0 c3041c0 = C3041c0.f24613f;
            Intrinsics.checkNotNullExpressionValue(c3041c0, "DEFAULT");
            Intrinsics.checkNotNullExpressionValue(c3041c0, "DEFAULT");
            I0 i0C = useCaseGroup.c();
            List<AbstractC3056k> listA = useCaseGroup.a();
            Intrinsics.checkNotNullExpressionValue(listA, "useCaseGroup.effects");
            List<G0> listB = useCaseGroup.b();
            Intrinsics.checkNotNullExpressionValue(listB, "useCaseGroup.useCases");
            G0[] g0Arr = (G0[]) listB.toArray(new G0[0]);
            return p(lifecycleOwner, cameraSelector, null, c3041c0, c3041c0, i0C, listA, (G0[]) Arrays.copyOf(g0Arr, g0Arr.length));
        } finally {
            h1.a.b();
        }
    }

    public final InterfaceC3052i o(InterfaceC1701o lifecycleOwner, C3061p cameraSelector, G0... useCases) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        h1.a.a("CX:bindToLifecycle");
        try {
            if (s() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            x(1);
            C3041c0 c3041c0 = C3041c0.f24613f;
            Intrinsics.checkNotNullExpressionValue(c3041c0, "DEFAULT");
            Intrinsics.checkNotNullExpressionValue(c3041c0, "DEFAULT");
            return p(lifecycleOwner, cameraSelector, null, c3041c0, c3041c0, null, CollectionsKt.j(), (G0[]) Arrays.copyOf(useCases, useCases.length));
        } finally {
            h1.a.b();
        }
    }

    public final InterfaceC3052i p(InterfaceC1701o lifecycleOwner, C3061p primaryCameraSelector, C3061p secondaryCameraSelector, C3041c0 primaryLayoutSettings, C3041c0 secondaryLayoutSettings, I0 viewPort, List<? extends AbstractC3056k> effects, G0... useCases) {
        J j7;
        V0 v02;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(primaryCameraSelector, "primaryCameraSelector");
        Intrinsics.checkNotNullParameter(primaryLayoutSettings, "primaryLayoutSettings");
        Intrinsics.checkNotNullParameter(secondaryLayoutSettings, "secondaryLayoutSettings");
        Intrinsics.checkNotNullParameter(effects, "effects");
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        h1.a.a("CX:bindToLifecycle-internal");
        try {
            E.p.a();
            C3066v c3066v = this.mCameraX;
            Intrinsics.d(c3066v);
            J jE = primaryCameraSelector.e(c3066v.f().a());
            Intrinsics.checkNotNullExpressionValue(jE, "primaryCameraSelector.se…cameraRepository.cameras)");
            jE.p(true);
            InterfaceC3060o interfaceC3060oR = r(primaryCameraSelector);
            Intrinsics.e(interfaceC3060oR, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
            V0 v03 = (V0) interfaceC3060oR;
            if (secondaryCameraSelector != null) {
                C3066v c3066v2 = this.mCameraX;
                Intrinsics.d(c3066v2);
                J jE2 = secondaryCameraSelector.e(c3066v2.f().a());
                jE2.p(false);
                InterfaceC3060o interfaceC3060oR2 = r(secondaryCameraSelector);
                Intrinsics.e(interfaceC3060oR2, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
                j7 = jE2;
                v02 = (V0) interfaceC3060oR2;
            } else {
                j7 = null;
                v02 = null;
            }
            LifecycleCamera lifecycleCameraC = this.mLifecycleCameraRepository.c(lifecycleOwner, f.B(v03, v02));
            Collection<LifecycleCamera> collectionE = this.mLifecycleCameraRepository.e();
            for (G0 g02 : i.x(useCases)) {
                for (LifecycleCamera lifecycleCamera : collectionE) {
                    Intrinsics.checkNotNullExpressionValue(lifecycleCamera, "lifecycleCameras");
                    LifecycleCamera lifecycleCamera2 = lifecycleCamera;
                    if (lifecycleCamera2.w(g02) && !Intrinsics.b(lifecycleCamera2, lifecycleCameraC)) {
                        C c2 = C.a;
                        String str = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{g02}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                        throw new IllegalStateException(str);
                    }
                }
            }
            if (lifecycleCameraC == null) {
                LifecycleCameraRepository lifecycleCameraRepository = this.mLifecycleCameraRepository;
                C3066v c3066v3 = this.mCameraX;
                Intrinsics.d(c3066v3);
                A.a aVarD = c3066v3.e().d();
                C3066v c3066v4 = this.mCameraX;
                Intrinsics.d(c3066v4);
                G gD = c3066v4.d();
                C3066v c3066v5 = this.mCameraX;
                Intrinsics.d(c3066v5);
                lifecycleCameraC = lifecycleCameraRepository.b(lifecycleOwner, new f(jE, j7, v03, v02, primaryLayoutSettings, secondaryLayoutSettings, aVarD, gD, c3066v5.h()));
            }
            if (useCases.length == 0) {
                Intrinsics.d(lifecycleCameraC);
            } else {
                LifecycleCameraRepository lifecycleCameraRepository2 = this.mLifecycleCameraRepository;
                Intrinsics.d(lifecycleCameraC);
                List listM = CollectionsKt.m(Arrays.copyOf(useCases, useCases.length));
                C3066v c3066v6 = this.mCameraX;
                Intrinsics.d(c3066v6);
                lifecycleCameraRepository2.a(lifecycleCameraC, viewPort, effects, listM, c3066v6.e().d());
            }
            h1.a.b();
            return lifecycleCameraC;
        } catch (Throwable th) {
            h1.a.b();
            throw th;
        }
    }

    public InterfaceC3060o r(C3061p cameraSelector) {
        Object v02;
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        h1.a.a("CX:getCameraInfo");
        try {
            C3066v c3066v = this.mCameraX;
            Intrinsics.d(c3066v);
            I iQ = cameraSelector.e(c3066v.f().a()).q();
            Intrinsics.checkNotNullExpressionValue(iQ, "cameraSelector.select(mC…meras).cameraInfoInternal");
            B bQ = q(cameraSelector, iQ);
            f.b bVarA = f.b.a(iQ.d(), bQ.N());
            Intrinsics.checkNotNullExpressionValue(bVarA, "create(\n                …ilityId\n                )");
            synchronized (this.mLock) {
                try {
                    v02 = this.mCameraInfoMap.get(bVarA);
                    if (v02 == null) {
                        v02 = new V0(iQ, bQ);
                        this.mCameraInfoMap.put(bVarA, v02);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return (V0) v02;
        } finally {
            h1.a.b();
        }
    }
}
