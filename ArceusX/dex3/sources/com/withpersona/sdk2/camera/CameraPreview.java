package com.withpersona.sdk2.camera;

import P9.o;
import P9.p;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.f;
import androidx.camera.lifecycle.e;
import androidx.camera.view.PreviewView;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.CameraProperties;
import ha.C0456d;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u5.AbstractC0622i;
import u5.C;
import u5.r;
import u5.u;
import y.h;
import z.B;
import z.H0;
import z.T;
import z.U;
import z.i;
import z.o0;
import z.p;
import z.y;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001#B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJE\u0010\u0015\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0011\u0010(\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Lcom/withpersona/sdk2/camera/CameraPreview;", "", "<init>", "()V", "Lz/i;", "camera", "Lcom/withpersona/sdk2/camera/CameraProperties;", "i", "(Lz/i;)Lcom/withpersona/sdk2/camera/CameraProperties;", "Landroidx/camera/view/PreviewView;", "previewView", "Lcom/withpersona/sdk2/camera/CameraPreview$a;", "cameraDirection", "Landroidx/camera/core/f$a;", "imageAnalyzer", "", "useCameraCapture", "Lkotlin/Function1;", "Ll8/i;", "", "onCameraError", "f", "(Landroidx/camera/view/PreviewView;Lcom/withpersona/sdk2/camera/CameraPreview$a;Landroidx/camera/core/f$a;ZLkotlin/jvm/functions/Function1;)V", "enable", "c", "(Z)V", "d", "(Landroidx/camera/view/PreviewView;)V", "Landroid/content/Context;", "context", "LP9/o;", "Ljava/io/File;", "j", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll8/r;", "a", "Ll8/r;", "currentCameraSession", "e", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class CameraPreview {

    private r currentCameraSession;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/camera/CameraPreview$a;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {
        public static final a d = new a("FRONT", 0);
        public static final a e = new a("BACK", 1);
        private static final a[] i;
        private static final T9.a v;

        static {
            a[] aVarArrC = c();
            i = aVarArrC;
            v = T9.b.a(aVarArrC);
        }

        private a(String str, int i2) {
        }

        private static final a[] c() {
            return new a[]{d, e};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) i.clone();
        }
    }

    @f(c = "com.withpersona.sdk2.camera.CameraPreview", f = "CameraPreview.kt", l = {163}, m = "takePicture-gIAlu-s")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {
        Object d;
        Object e;
        Object i;
        int w;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.i = obj;
            this.w |= Integer.MIN_VALUE;
            Object objJ = CameraPreview.this.j(null, this);
            return objJ == S9.b.c() ? objJ : o.a(objJ);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/withpersona/sdk2/camera/CameraPreview$c", "Lz/T$f;", "Lz/T$h;", "outputFileResults", "", "e", "(Lz/T$h;)V", "Lz/U;", "exception", "d", "(Lz/U;)V", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class c implements T.f {
        final Continuation<o<? extends File>> a;
        final File b;

        c(Continuation<? super o<? extends File>> continuation, File file) {
            this.a = continuation;
            this.b = file;
        }

        public void d(@NotNull U exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            Continuation<o<? extends File>> continuation = this.a;
            o.a aVar = o.e;
            continuation.resumeWith(o.b(o.a(o.b(p.a(exception)))));
        }

        public void e(@NotNull T.h outputFileResults) {
            Intrinsics.checkNotNullParameter(outputFileResults, "outputFileResults");
            Continuation<o<? extends File>> continuation = this.a;
            o.a aVar = o.e;
            continuation.resumeWith(o.b(o.a(o.b(this.b))));
        }
    }

    public static final void g(final PreviewView previewView, final boolean z, final f.a aVar, final z.p pVar, final CameraPreview cameraPreview, final Function1 function1) {
        Intrinsics.checkNotNullParameter(previewView, "$previewView");
        Intrinsics.checkNotNullParameter(pVar, "$cameraSelector");
        Intrinsics.checkNotNullParameter(cameraPreview, "this$0");
        Intrinsics.checkNotNullParameter(function1, "$onCameraError");
        if (previewView.isAttachedToWindow()) {
            Context context = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            androidx.appcompat.app.a supportActionBar = u.b(context).getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.f();
            }
            final int rotation = previewView.getDisplay().getRotation();
            final ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            e.a aVar2 = e.i;
            Context context2 = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            final com.google.common.util.concurrent.p pVarB = aVar2.b(context2);
            pVarB.c(new Runnable() {
                @Override
                public final void run() {
                    CameraPreview.h(pVarB, rotation, z, aVar, executorServiceNewSingleThreadExecutor, previewView, pVar, cameraPreview, function1);
                }
            }, androidx.core.content.a.h(previewView.getContext()));
        }
    }

    public static final void h(com.google.common.util.concurrent.p pVar, int i, boolean z, f.a aVar, final ExecutorService executorService, PreviewView previewView, z.p pVar2, CameraPreview cameraPreview, Function1 function1) {
        T tF;
        Intrinsics.checkNotNullParameter(pVar, "$cameraProviderFuture");
        Intrinsics.checkNotNullParameter(previewView, "$previewView");
        Intrinsics.checkNotNullParameter(pVar2, "$cameraSelector");
        Intrinsics.checkNotNullParameter(cameraPreview, "this$0");
        Intrinsics.checkNotNullParameter(function1, "$onCameraError");
        e eVar = (e) pVar.get();
        o0 o0VarF = new o0.a().q(i).f();
        Intrinsics.checkNotNullExpressionValue(o0VarF, "build(...)");
        H0.a aVar2 = new H0.a();
        aVar2.b(o0VarF);
        if (z) {
            tF = new T.b().i(1).t(i).f();
            aVar2.b(tF);
        } else {
            tF = null;
        }
        if (aVar != null) {
            androidx.camera.core.f fVarF = new f.c().n(0).u(new Size(2000, 2000)).v(i).f();
            Intrinsics.checkNotNullExpressionValue(fVarF, "build(...)");
            fVarF.q0(executorService, aVar);
            aVar2.b(fVarF);
        }
        eVar.B();
        try {
            Context context = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            androidx.appcompat.app.d dVarB = u.b(context);
            H0 h0C = aVar2.c();
            Intrinsics.checkNotNullExpressionValue(h0C, "build(...)");
            i iVarN = eVar.n(dVarB, pVar2, h0C);
            cameraPreview.currentCameraSession = new r(iVarN, tF, cameraPreview.i(iVarN));
            Context context2 = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            C0456d.i(context2).getLifecycle().a(new androidx.lifecycle.d() {
                public void onDestroy(@NotNull androidx.lifecycle.o owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    executorService.shutdown();
                }
            });
            o0VarF.o0(previewView.getSurfaceProvider());
        } catch (IllegalArgumentException unused) {
            function1.invoke(new C());
        }
    }

    private final CameraProperties i(i camera) {
        try {
            z.o oVarC = camera.c();
            Intrinsics.checkNotNullExpressionValue(oVarC, "getCameraInfo(...)");
            h hVarA = h.a(oVarC);
            Intrinsics.checkNotNullExpressionValue(hVarA, "from(...)");
            String strC = hVarA.c();
            Intrinsics.checkNotNullExpressionValue(strC, "getCameraId(...)");
            Rect rect = (Rect) hVarA.b(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            if (rect == null) {
                rect = new Rect();
            }
            Size size = new Size(rect.width(), rect.height());
            Integer num = (Integer) hVarA.b(CameraCharacteristics.LENS_FACING);
            CameraProperties.b bVar = (num != null && num.intValue() == 1) ? CameraProperties.b.e : (num != null && num.intValue() == 0) ? CameraProperties.b.d : CameraProperties.b.i;
            Range[] rangeArr = (Range[]) hVarA.b(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            int iIntValue = 0;
            if (rangeArr != null && rangeArr.length != 0) {
                Iterator itA = kotlin.jvm.internal.c.a(rangeArr);
                while (itA.hasNext()) {
                    Integer num2 = (Integer) ((Range) itA.next()).getUpper();
                    Intrinsics.d(num2);
                    if (num2.intValue() > iIntValue) {
                        iIntValue = num2.intValue();
                    }
                }
            }
            return new CameraProperties(strC, bVar, size, iIntValue);
        } catch (IllegalArgumentException unused) {
            return new CameraProperties(null, null, null, 0, 15, null);
        }
    }

    public final void c(boolean enable) {
        i camera;
        r rVar = this.currentCameraSession;
        if (rVar == null || (camera = rVar.getCamera()) == null) {
            return;
        }
        camera.a().a(enable);
    }

    public final void d(@NotNull PreviewView previewView) {
        i camera;
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        r rVar = this.currentCameraSession;
        if (rVar == null || (camera = rVar.getCamera()) == null) {
            return;
        }
        camera.a().l(new B.a(new y(previewView.getDisplay(), camera.c(), previewView.getWidth(), previewView.getHeight()).b(previewView.getWidth() / 2.0f, previewView.getHeight() / 2.0f), 1).b());
    }

    @NotNull
    public final CameraProperties e() {
        CameraProperties cameraProperties;
        r rVar = this.currentCameraSession;
        return (rVar == null || (cameraProperties = rVar.getCameraProperties()) == null) ? new CameraProperties(null, null, null, 0, 15, null) : cameraProperties;
    }

    public final void f(@NotNull final PreviewView previewView, @NotNull a cameraDirection, final f.a imageAnalyzer, final boolean useCameraCapture, @NotNull final Function1<? super AbstractC0622i, Unit> onCameraError) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(cameraDirection, "cameraDirection");
        Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
        final z.p pVarA = new p.a().b(cameraDirection == a.d ? 0 : 1).a();
        Intrinsics.checkNotNullExpressionValue(pVarA, "build(...)");
        previewView.post(new Runnable() {
            @Override
            public final void run() {
                CameraPreview.g(previewView, useCameraCapture, imageAnalyzer, pVarA, this, onCameraError);
            }
        });
    }

    public final java.lang.Object j(@org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super P9.o<? extends java.io.File>> r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.camera.CameraPreview.j(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
