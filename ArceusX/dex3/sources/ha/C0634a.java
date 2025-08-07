package ha;

import P9.o;
import P9.p;
import S9.b;
import aa.n;
import android.hardware.camera2.CameraAccessException;
import android.view.View;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.a;
import ha.C0638d;
import ha.M;
import ha.N;
import ha.V0;
import ha.c0;
import ha.z0;
import java.util.concurrent.CancellationException;
import ka.K;
import ka.g;
import ka.i;
import ka.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u5.InterfaceC0620g;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\b*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0018\u0010\u0017J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u0016\u0010*\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020&0\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010.R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u00105\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"Ln8/a;", "Ll8/g;", "Ln8/f;", "camera2ManagerFactory", "<init>", "(Ln8/f;)V", "Lka/K;", "Ln8/d$d;", "Lka/g;", "t", "(Lka/K;)Lka/g;", "", "u", "()V", "f", "", "enable", "a", "(Z)V", "h", "LP9/o;", "Ljava/io/File;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "j", "enableAnalyzer", "i", "Ln8/f;", "Lha/L;", "b", "Lha/L;", "coroutineScope", "Ln8/d;", "c", "Ln8/d;", "currentManager", "Lka/y;", "Lcom/withpersona/sdk2/camera/a;", "Lka/y;", "_previewState", "Z", "recordingOngoing", "Lha/z0;", "Lha/z0;", "currentStateCollectJob", "()Lka/K;", "cameraState", "Landroid/view/View;", "g", "()Landroid/view/View;", "previewView", "Lcom/withpersona/sdk2/camera/CameraProperties;", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0634a implements InterfaceC0620g {

    @NotNull
    private final C0645f camera2ManagerFactory;

    @NotNull
    private final ha.L coroutineScope;

    @NotNull
    private C0638d currentManager;

    @NotNull
    private y<a> _previewState;

    private boolean recordingOngoing;

    private z0 currentStateCollectJob;

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$completeWhenDestroyed$1", f = "Camera2Controller.kt", l = {127}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lka/h;", "Ln8/d$d;", "state", "", "<anonymous>", "(Lka/h;Ln8/d$d;)Z"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class h extends k implements n<ka.h<? super C0638d.InterfaceC0249d>, C0638d.InterfaceC0249d, Continuation<? super Boolean>, Object> {
        int d;
        private Object e;
        Object i;

        h(Continuation<? super h> continuation) {
            super(3, continuation);
        }

        public final Object invoke(@NotNull ka.h<? super C0638d.InterfaceC0249d> hVar, @NotNull C0638d.InterfaceC0249d interfaceC0249d, Continuation<? super Boolean> continuation) {
            h hVar2 = new h(continuation);
            hVar2.e = hVar;
            hVar2.i = interfaceC0249d;
            return hVar2.invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            C0638d.InterfaceC0249d interfaceC0249d;
            Object objC = b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                ka.h hVar = (ka.h) this.e;
                C0638d.InterfaceC0249d interfaceC0249d2 = (C0638d.InterfaceC0249d) this.i;
                this.e = interfaceC0249d2;
                this.d = 1;
                if (hVar.c(interfaceC0249d2, this) == objC) {
                    return objC;
                }
                interfaceC0249d = interfaceC0249d2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC0249d = (C0638d.InterfaceC0249d) this.e;
                p.b(obj);
            }
            return kotlin.coroutines.jvm.internal.b.a(!Intrinsics.b(interfaceC0249d, C0638d.InterfaceC0249d.b.a));
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$prepare$1", f = "Camera2Controller.kt", l = {53}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln8/d$d;", "it", "", "a", "(Ln8/d$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0248a<T> implements ka.h {
            final C0634a d;

            C0248a(C0634a c0634a) {
                this.d = c0634a;
            }

            public final Object c(@NotNull C0638d.InterfaceC0249d interfaceC0249d, @NotNull Continuation<? super Unit> continuation) {
                if (!Intrinsics.b(interfaceC0249d, C0638d.InterfaceC0249d.a.a)) {
                    if (Intrinsics.b(interfaceC0249d, C0638d.InterfaceC0249d.C0250d.a)) {
                        this.d._previewState.setValue(a.e.a);
                    } else if (Intrinsics.b(interfaceC0249d, C0638d.InterfaceC0249d.b.a)) {
                        this.d._previewState.setValue(new a.Closed(this.d.recordingOngoing));
                        C0634a c0634a = this.d;
                        c0634a.currentManager = c0634a.camera2ManagerFactory.a();
                        this.d.recordingOngoing = false;
                    } else if (interfaceC0249d instanceof C0638d.InterfaceC0249d.Error) {
                        C0638d.c error = ((C0638d.InterfaceC0249d.Error) interfaceC0249d).getError();
                        if (error instanceof C0638d.c.a) {
                            if (this.d.camera2ManagerFactory.b()) {
                                z0 z0Var = this.d.currentStateCollectJob;
                                if (z0Var != null) {
                                    z0.a.a(z0Var, (CancellationException) null, 1, (Object) null);
                                }
                                this.d.u();
                            } else {
                                this.d._previewState.setValue(a.b.a);
                            }
                        } else if (error instanceof C0638d.c.b) {
                            this.d._previewState.setValue(a.c.a);
                        }
                    }
                }
                return Unit.a;
            }
        }

        L(Continuation<? super L> continuation) {
            super(2, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return C0634a.this.new L(continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                C0634a c0634a = C0634a.this;
                g gVarE = i.e(c0634a.t(c0634a.currentManager.K()));
                C0248a c0248a = new C0248a(C0634a.this);
                this.d = 1;
                if (gVarE.a(c0248a, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            return Unit.a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$retryPrepareWithNewCameraManager$1", f = "Camera2Controller.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0635c extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;

        C0635c(Continuation<? super C0635c> continuation) {
            super(2, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return C0634a.this.new C0635c(continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            C0634a.this._previewState.setValue(a.c.a);
            C0634a.this.f();
            return Unit.a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", f = "Camera2Controller.kt", l = {103}, m = "startVideo")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {
        Object d;
        Object e;
        int v;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.v |= Integer.MIN_VALUE;
            return C0634a.this.d(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", f = "Camera2Controller.kt", l = {114}, m = "stopVideo-IoAF18A")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class e extends kotlin.coroutines.jvm.internal.d {
        Object d;
        int i;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.i |= Integer.MIN_VALUE;
            Object objJ = C0634a.this.j(this);
            return objJ == b.c() ? objJ : o.a(objJ);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", f = "Camera2Controller.kt", l = {96}, m = "takePicture-IoAF18A")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class f extends kotlin.coroutines.jvm.internal.d {
        Object d;
        int i;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.i |= Integer.MIN_VALUE;
            Object objE = C0634a.this.e(this);
            return objE == b.c() ? objE : o.a(objE);
        }
    }

    public C0634a(@NotNull C0645f c0645f) {
        Intrinsics.checkNotNullParameter(c0645f, "camera2ManagerFactory");
        this.camera2ManagerFactory = c0645f;
        this.coroutineScope = M.a(c0.a().K(V0.b((z0) null, 1, (Object) null)));
        this.currentManager = c0645f.a();
        this._previewState = ka.M.a(a.c.a);
    }

    public final g<C0638d.InterfaceC0249d> t(K<? extends C0638d.InterfaceC0249d> k) {
        return i.L(k, new h(null));
    }

    public final void u() {
        this.currentManager = this.camera2ManagerFactory.a();
        g.d(this.coroutineScope, c0.c(), (N) null, new C0635c(null), 2, (Object) null);
    }

    @Override
    public void a(boolean enable) throws CameraAccessException {
        this.currentManager.G(enable);
    }

    @Override
    @NotNull
    public K<a> b() {
        return this._previewState;
    }

    @Override
    @NotNull
    public CameraProperties c() {
        return this.currentManager.getCameraProperties();
    }

    @Override
    public java.lang.Object d(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r5) {
        throw new UnsupportedOperationException("Method not decompiled: ha.C0634a.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override
    public java.lang.Object e(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super P9.o<? extends java.io.File>> r5) {
        throw new UnsupportedOperationException("Method not decompiled: ha.C0634a.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override
    public void f() {
        if (Intrinsics.b(this._previewState.getValue(), a.c.a) || (this._previewState.getValue() instanceof a.Closed)) {
            z0 z0Var = this.currentStateCollectJob;
            if (z0Var != null) {
                z0.a.a(z0Var, (CancellationException) null, 1, (Object) null);
            }
            this._previewState.setValue(a.d.a);
            this.currentStateCollectJob = g.d(this.coroutineScope, (CoroutineContext) null, (N) null, new L(null), 3, (Object) null);
            this.currentManager.T();
        }
    }

    @Override
    @NotNull
    public View getPreviewView() {
        return this.currentManager.getPreviewView();
    }

    @Override
    public void h() throws CameraAccessException {
        this.currentManager.H();
    }

    @Override
    public void i(boolean enableAnalyzer) {
        this.currentManager.S(enableAnalyzer);
    }

    @Override
    public java.lang.Object j(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super P9.o<? extends java.io.File>> r5) {
        throw new UnsupportedOperationException("Method not decompiled: ha.C0634a.j(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
