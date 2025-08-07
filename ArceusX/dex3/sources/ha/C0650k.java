package ha;

import P9.o;
import P9.p;
import android.graphics.Point;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import com.roblox.client.personasdk.R;
import ha.L0;
import ha.M;
import ha.N;
import ha.V0;
import ha.W;
import ha.c0;
import ha.g;
import ha.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0001-B3\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b\"\u0010!J-\u0010*\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u001f¢\u0006\u0004\b,\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00103R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00105R\"\u0010;\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00107\u001a\u0004\b8\u0010\u001e\"\u0004\b9\u0010:R$\u0010B\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010DR\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010F¨\u0006G"}, d2 = {"Ln8/k;", "", "Ln8/l;", "cameraChoice", "", "Landroid/view/Surface;", "targets", "Landroid/os/Handler;", "handler", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "<init>", "(Ln8/l;Ljava/util/List;Landroid/os/Handler;Landroid/hardware/camera2/CameraCharacteristics;)V", "Landroid/hardware/camera2/CameraDevice;", "device", "Landroid/hardware/camera2/CameraCaptureSession;", "f", "(Landroid/hardware/camera2/CameraDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "stateCallback", "", "k", "(Landroid/hardware/camera2/CameraDevice;Ljava/util/List;Landroid/os/Handler;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Z", "session", "previewStabilization", "surfaces", "Landroid/hardware/camera2/CaptureRequest;", "g", "(Landroid/hardware/camera2/CameraCaptureSession;ZLjava/util/List;)Landroid/hardware/camera2/CaptureRequest;", "h", "()Z", "", "d", "()V", "l", "", "x", "y", "Landroid/util/Size;", "size", "", "duration", "j", "(IILandroid/util/Size;J)V", "e", "a", "Ln8/l;", "b", "Ljava/util/List;", "c", "Landroid/os/Handler;", "Landroid/hardware/camera2/CameraCharacteristics;", "Lha/L;", "Lha/L;", "coroutineScope", "Z", "getEnableTorch", "i", "(Z)V", "enableTorch", "Landroid/hardware/camera2/params/MeteringRectangle;", "Landroid/hardware/camera2/params/MeteringRectangle;", "getMeteringRect", "()Landroid/hardware/camera2/params/MeteringRectangle;", "setMeteringRect", "(Landroid/hardware/camera2/params/MeteringRectangle;)V", "meteringRect", "Lha/z0;", "Lha/z0;", "resetFocusJob", "Landroid/hardware/camera2/CameraCaptureSession;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0650k {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final CameraChoice cameraChoice;

    @NotNull
    private final List<Surface> targets;

    private final Handler handler;

    @NotNull
    private final CameraCharacteristics cameraCharacteristics;

    @NotNull
    private final ha.L coroutineScope;

    private boolean enableTorch;

    private MeteringRectangle meteringRect;

    private z0 resetFocusJob;

    private CameraCaptureSession session;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ln8/k$a;", "", "<init>", "()V", "Ln8/l;", "cameraChoice", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "", "Landroid/view/Surface;", "targets", "Landroid/hardware/camera2/CameraDevice;", "device", "Landroid/os/Handler;", "handler", "Ln8/k;", "a", "(Ln8/l;Landroid/hardware/camera2/CameraCharacteristics;Ljava/util/List;Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {

        @f(c = "com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$Companion", f = "CameraCaptureSessionWrapper.kt", l = {42}, m = "create")
        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        static final class C0253a extends d {
            Object d;
            Object e;
            Object i;
            int w;

            C0253a(Continuation<? super C0253a> continuation) {
                super(continuation);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                this.i = obj;
                this.w |= Integer.MIN_VALUE;
                return Companion.this.a(null, null, null, null, null, this);
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.lang.Object a(@org.jetbrains.annotations.NotNull ha.CameraChoice r13, @org.jetbrains.annotations.NotNull android.hardware.camera2.CameraCharacteristics r14, @org.jetbrains.annotations.NotNull java.util.List<? extends android.view.Surface> r15, @org.jetbrains.annotations.NotNull android.hardware.camera2.CameraDevice r16, android.os.Handler r17, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super ha.C0650k> r18) throws android.hardware.camera2.CameraAccessException {
            throw new UnsupportedOperationException("Method not decompiled: ha.C0650k.Companion.a(n8.l, android.hardware.camera2.CameraCharacteristics, java.util.List, android.hardware.camera2.CameraDevice, android.os.Handler, kotlin.coroutines.Continuation):java.lang.Object");
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"n8/k$b", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "Landroid/hardware/camera2/CameraCaptureSession;", "session", "", "onConfigured", "(Landroid/hardware/camera2/CameraCaptureSession;)V", "onConfigureFailed", "onReady", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b extends CameraCaptureSession.StateCallback {
        final Continuation<CameraCaptureSession> a;
        final CameraDevice b;

        b(Continuation<? super CameraCaptureSession> continuation, CameraDevice cameraDevice) {
            this.a = continuation;
            this.b = cameraDevice;
        }

        @Override
        public void onConfigureFailed(@NotNull CameraCaptureSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
            RuntimeException runtimeException = new RuntimeException("Camera " + this.b.getId() + " session configuration failed");
            Continuation<CameraCaptureSession> continuation = this.a;
            o.a aVar = o.e;
            continuation.resumeWith(o.b(p.a(runtimeException)));
        }

        @Override
        public void onConfigured(@NotNull CameraCaptureSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
            this.a.resumeWith(o.b(session));
        }

        @Override
        public void onReady(@NotNull CameraCaptureSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
        }
    }

    @f(c = "com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$setFocus$1", f = "CameraCaptureSessionWrapper.kt", l = {159, 161}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;
        final long e;
        final C0650k i;

        @f(c = "com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$setFocus$1$1", f = "CameraCaptureSessionWrapper.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0254a extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
            int d;
            final C0650k e;

            C0254a(C0650k c0650k, Continuation<? super C0254a> continuation) {
                super(2, continuation);
                this.e = c0650k;
            }

            @NotNull
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C0254a(this.e, continuation);
            }

            public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
                return create(l, continuation).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(@NotNull Object obj) throws CameraAccessException {
                S9.b.c();
                if (this.d != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
                this.e.d();
                this.e.l();
                return Unit.a;
            }
        }

        L(long j, C0650k c0650k, Continuation<? super L> continuation) {
            super(2, continuation);
            this.e = j;
            this.i = c0650k;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new L(this.e, this.i, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                long j = this.e;
                this.d = 1;
                if (W.a(j, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                    return Unit.a;
                }
                p.b(obj);
            }
            L0 l0C = c0.c();
            C0254a c0254a = new C0254a(this.i, null);
            this.d = 2;
            if (g.g(l0C, c0254a, this) == objC) {
                return objC;
            }
            return Unit.a;
        }
    }

    public C0650k(CameraChoice cameraChoice, List list, Handler handler, CameraCharacteristics cameraCharacteristics, DefaultConstructorMarker defaultConstructorMarker) {
        this(cameraChoice, list, handler, cameraCharacteristics);
    }

    public final void d() {
        this.meteringRect = null;
    }

    public final Object f(CameraDevice cameraDevice, Continuation<? super CameraCaptureSession> continuation) throws CameraAccessException {
        kotlin.coroutines.g gVar = new kotlin.coroutines.g(S9.b.b(continuation));
        k(cameraDevice, this.targets, this.handler, new b(gVar, cameraDevice));
        Object objA = gVar.a();
        if (objA == S9.b.c()) {
            h.c(continuation);
        }
        return objA;
    }

    private final CaptureRequest g(CameraCaptureSession session, boolean previewStabilization, List<? extends Surface> surfaces) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest = session.getDevice().createCaptureRequest(1);
        Iterator<T> it = surfaces.iterator();
        while (it.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it.next());
        }
        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, this.cameraChoice.f());
        if (previewStabilization && Build.VERSION.SDK_INT >= 33) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        }
        if (this.enableTorch) {
            builderCreateCaptureRequest.set(CaptureRequest.FLASH_MODE, 2);
        }
        MeteringRectangle meteringRectangle = this.meteringRect;
        if (meteringRectangle != null && h()) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{meteringRectangle});
        }
        CaptureRequest captureRequestBuild = builderCreateCaptureRequest.build();
        Intrinsics.checkNotNullExpressionValue(captureRequestBuild, "build(...)");
        return captureRequestBuild;
    }

    private final boolean h() {
        Integer num = (Integer) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            num = 0;
        }
        return num.intValue() >= 1;
    }

    private final boolean k(CameraDevice device, List<? extends Surface> targets, Handler handler, CameraCaptureSession.StateCallback stateCallback) throws CameraAccessException {
        if (Build.VERSION.SDK_INT < 33) {
            device.createCaptureSession(targets, stateCallback, handler);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Surface> it = targets.iterator();
        while (it.hasNext()) {
            OutputConfiguration outputConfiguration = new OutputConfiguration(it.next());
            outputConfiguration.setDynamicRangeProfile(this.cameraChoice.getAdditionalOptions().getDynamicRange());
            arrayList.add(outputConfiguration);
        }
        device.createCaptureSessionByOutputConfigurations(arrayList, stateCallback, handler);
        return true;
    }

    public final void e() {
        M.e(this.coroutineScope, (CancellationException) null, 1, (Object) null);
    }

    public final void i(boolean z) {
        this.enableTorch = z;
    }

    public final void j(int x, int y, @NotNull Size size, long duration) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.meteringRect = new MeteringRectangle(new Point(x, y), size, 1000);
        z0 z0Var = this.resetFocusJob;
        if (z0Var != null) {
            z0.a.a(z0Var, (CancellationException) null, 1, (Object) null);
        }
        this.resetFocusJob = g.d(this.coroutineScope, (CoroutineContext) null, (N) null, new L(duration, this, null), 3, (Object) null);
    }

    public final void l() throws CameraAccessException {
        CameraCaptureSession cameraCaptureSession = this.session;
        if (cameraCaptureSession == null) {
            Intrinsics.v("session");
            cameraCaptureSession = null;
        }
        CaptureRequest captureRequestG = g(cameraCaptureSession, this.cameraChoice.getAdditionalOptions().getPreviewStabilization(), this.targets);
        CameraCaptureSession cameraCaptureSession2 = this.session;
        if (cameraCaptureSession2 == null) {
            Intrinsics.v("session");
            cameraCaptureSession2 = null;
        }
        cameraCaptureSession2.setRepeatingRequest(captureRequestG, null, this.handler);
    }

    private C0650k(CameraChoice cameraChoice, List<? extends Surface> list, Handler handler, CameraCharacteristics cameraCharacteristics) {
        this.cameraChoice = cameraChoice;
        this.targets = list;
        this.handler = handler;
        this.cameraCharacteristics = cameraCharacteristics;
        this.coroutineScope = M.a(c0.a().K(V0.b((z0) null, 1, (Object) null)));
    }
}
