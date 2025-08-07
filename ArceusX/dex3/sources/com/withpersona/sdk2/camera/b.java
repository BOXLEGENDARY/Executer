package com.withpersona.sdk2.camera;

import P9.o;
import P9.p;
import android.content.Context;
import android.view.View;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.x;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.a;
import java.io.File;
import ka.K;
import ka.M;
import ka.y;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Intrinsics;
import o8.InterfaceC0723a;
import org.jetbrains.annotations.NotNull;
import u5.C;
import u5.InterfaceC0620g;
import u5.s;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u001a\u0010\u0019J\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010&R\u0016\u0010(\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020*0.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010/R\u0014\u00103\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u00102\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Lcom/withpersona/sdk2/camera/b;", "Ll8/g;", "Landroid/content/Context;", "context", "Lo8/a;", "cameraStatsManager", "Lcom/withpersona/sdk2/camera/CameraPreview;", "cameraPreview", "Landroidx/camera/view/PreviewView;", "previewView", "Ll8/s;", "cameraXBinder", "<init>", "(Landroid/content/Context;Lo8/a;Lcom/withpersona/sdk2/camera/CameraPreview;Landroidx/camera/view/PreviewView;Ll8/s;)V", "", "f", "()V", "", "enable", "a", "(Z)V", "h", "LP9/o;", "Ljava/io/File;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "j", "enableAnalyzer", "i", "Landroid/content/Context;", "b", "Lo8/a;", "c", "Lcom/withpersona/sdk2/camera/CameraPreview;", "Landroidx/camera/view/PreviewView;", "m", "()Landroidx/camera/view/PreviewView;", "Ll8/s;", "Z", "isBound", "Lka/y;", "Lcom/withpersona/sdk2/camera/a;", "g", "Lka/y;", "_previewState", "Lka/K;", "()Lka/K;", "cameraState", "Lcom/withpersona/sdk2/camera/CameraProperties;", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class b implements InterfaceC0620g {

    @NotNull
    private final Context context;

    @NotNull
    private final InterfaceC0723a cameraStatsManager;

    @NotNull
    private final CameraPreview cameraPreview;

    @NotNull
    private final PreviewView previewView;

    @NotNull
    private final s cameraXBinder;

    private boolean isBound;

    @NotNull
    private y<com.withpersona.sdk2.camera.a> _previewState;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/camera/b$a;", "", "Lcom/withpersona/sdk2/camera/CameraPreview;", "cameraPreview", "Landroidx/camera/view/PreviewView;", "previewView", "Ll8/s;", "cameraXBinder", "Lcom/withpersona/sdk2/camera/b;", "a", "(Lcom/withpersona/sdk2/camera/CameraPreview;Landroidx/camera/view/PreviewView;Ll8/s;)Lcom/withpersona/sdk2/camera/b;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface a {
        @NotNull
        b a(@NotNull CameraPreview cameraPreview, @NotNull PreviewView previewView, @NotNull s cameraXBinder);
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/withpersona/sdk2/camera/b$b", "Landroidx/lifecycle/x;", "Landroidx/camera/view/PreviewView$e;", "value", "", "b", "(Landroidx/camera/view/PreviewView$e;)V", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class C0076b implements x<PreviewView.e> {
        C0076b() {
        }

        public void a(@NotNull PreviewView.e value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (value == PreviewView.e.e) {
                b.this._previewState.setValue(a.e.a);
                b.this.getPreviewView().getPreviewStreamState().n(this);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/withpersona/sdk2/camera/b$c", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override
        public void onViewAttachedToWindow(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            b.this.cameraStatsManager.d();
        }

        @Override
        public void onViewDetachedFromWindow(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            b.this.cameraStatsManager.c();
        }
    }

    @f(c = "com.withpersona.sdk2.camera.CameraXController", f = "CameraXController.kt", l = {81}, m = "takePicture-IoAF18A")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {
        Object d;
        int i;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.i |= Integer.MIN_VALUE;
            Object objE = b.this.e(this);
            return objE == S9.b.c() ? objE : o.a(objE);
        }
    }

    public b(@NotNull Context context, @NotNull InterfaceC0723a interfaceC0723a, @NotNull CameraPreview cameraPreview, @NotNull PreviewView previewView, @NotNull s sVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interfaceC0723a, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(sVar, "cameraXBinder");
        this.context = context;
        this.cameraStatsManager = interfaceC0723a;
        this.cameraPreview = cameraPreview;
        this.previewView = previewView;
        this.cameraXBinder = sVar;
        this._previewState = M.a(a.c.a);
    }

    @Override
    public void a(boolean enable) {
        this.cameraPreview.c(enable);
    }

    @Override
    @NotNull
    public K<com.withpersona.sdk2.camera.a> b() {
        return this._previewState;
    }

    @Override
    @NotNull
    public CameraProperties c() {
        return this.cameraPreview.e();
    }

    @Override
    public Object d(@NotNull Continuation<? super Boolean> continuation) {
        return kotlin.coroutines.jvm.internal.b.a(false);
    }

    @Override
    public java.lang.Object e(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super P9.o<? extends java.io.File>> r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.camera.b.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override
    public void f() {
        if (this.isBound) {
            return;
        }
        this._previewState.setValue(a.d.a);
        this.isBound = true;
        this.cameraXBinder.a();
        getPreviewView().getPreviewStreamState().j(new C0076b());
        getPreviewView().addOnAttachStateChangeListener(new c());
    }

    @Override
    public void h() {
        this.cameraPreview.d(getPreviewView());
    }

    @Override
    public void i(boolean enableAnalyzer) {
    }

    @Override
    public Object j(@NotNull Continuation<? super o<? extends File>> continuation) {
        o.a aVar = o.e;
        return o.b(p.a(new C()));
    }

    @Override
    @NotNull
    public PreviewView getPreviewView() {
        return this.previewView;
    }
}
