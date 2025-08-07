package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.C0494f;
import com.squareup.workflow1.ui.E;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.b;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.selfie.p;
import ha.C0634a;
import ha.C0645f;
import ha.C0648i;
import ha.CameraChoices;
import ha.EnumC0653n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;
import p8.EnumC0732a;
import u5.AbstractC0622i;
import u5.C;
import u5.H;
import u5.InterfaceC0620g;
import u5.s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u001c\u0010\u0019\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/f;", "Lcom/squareup/workflow1/ui/A;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a;", "Lcom/withpersona/sdk2/camera/CameraPreview;", "cameraPreview", "Ll8/H;", "selfieDirectionFeed", "<init>", "(Lcom/withpersona/sdk2/camera/CameraPreview;Ll8/H;)V", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/selfie/p$d$a;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "a", "Lcom/withpersona/sdk2/camera/CameraPreview;", "Ll8/H;", "Lfa/c;", "getType", "()Lfa/c;", "type", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class f implements A<p.AbstractC0528d.a> {

    @NotNull
    private final CameraPreview cameraPreview;

    @NotNull
    private final H selfieDirectionFeed;
    private final C0494f<p.AbstractC0528d.a> c;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$d$a;", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/p$d$a;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.jvm.internal.l implements aa.o<p.AbstractC0528d.a, ViewEnvironment, Context, ViewGroup, View> {
        final H d;
        final CameraPreview e;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class C0159a extends kotlin.jvm.internal.j implements Function2<p.AbstractC0528d.a, ViewEnvironment, Unit> {
            C0159a(Object obj) {
                super(2, obj, CameraScreenRunner.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            public final void f(@NotNull p.AbstractC0528d.a aVar, @NotNull ViewEnvironment viewEnvironment) {
                Intrinsics.checkNotNullParameter(aVar, "p0");
                Intrinsics.checkNotNullParameter(viewEnvironment, "p1");
                ((CameraScreenRunner) ((kotlin.jvm.internal.d) this).receiver).a(aVar, viewEnvironment);
            }

            public Object invoke(Object obj, Object obj2) {
                f((p.AbstractC0528d.a) obj, (ViewEnvironment) obj2);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/f$a$b", "Ll8/s;", "", "a", "()V", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class b implements s {
            final W8.a a;
            final CameraPreview b;
            final H c;
            final p.AbstractC0528d.a d;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll8/i;", "it", "", "a", "(Ll8/i;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class C0160a extends kotlin.jvm.internal.l implements Function1<AbstractC0622i, Unit> {
                final p.AbstractC0528d.a d;

                C0160a(p.AbstractC0528d.a aVar) {
                    super(1);
                    this.d = aVar;
                }

                public final void a(@NotNull AbstractC0622i abstractC0622i) {
                    Intrinsics.checkNotNullParameter(abstractC0622i, "it");
                    this.d.h().invoke(abstractC0622i);
                }

                public Object invoke(Object obj) {
                    a((AbstractC0622i) obj);
                    return Unit.a;
                }
            }

            b(W8.a aVar, CameraPreview cameraPreview, H h, p.AbstractC0528d.a aVar2) {
                this.a = aVar;
                this.b = cameraPreview;
                this.c = h;
                this.d = aVar2;
            }

            @Override
            public void a() {
                PreviewView previewView = this.a.k;
                CameraPreview.a aVar = CameraPreview.a.d;
                CameraPreview cameraPreview = this.b;
                Intrinsics.d(previewView);
                cameraPreview.f(previewView, aVar, this.c, true, new C0160a(this.d));
            }
        }

        a(H h, CameraPreview cameraPreview) {
            super(4);
            this.d = h;
            this.e = cameraPreview;
        }

        @NotNull
        public final View h(@NotNull p.AbstractC0528d.a aVar, @NotNull ViewEnvironment viewEnvironment, @NotNull Context context, ViewGroup viewGroup) throws CameraAccessException {
            InterfaceC0620g interfaceC0620gA;
            Intrinsics.checkNotNullParameter(aVar, "initialRendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(context, "context");
            Context context2 = viewGroup != null ? viewGroup.getContext() : null;
            if (context2 == null) {
                context2 = context;
            }
            LayoutInflater layoutInflaterCloneInContext = LayoutInflater.from(context2).cloneInContext(context);
            H h = this.d;
            CameraPreview cameraPreview = this.e;
            W8.a aVarD = W8.a.d(layoutInflaterCloneInContext);
            if (aVar.getVideoCaptureMethod() != EnumC0732a.i) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                CameraChoices cameraChoicesA = C0648i.a(applicationContext, EnumC0653n.d);
                if (cameraChoicesA == null) {
                    aVar.h().invoke(new C());
                    Camera2PreviewView camera2PreviewView = aVarD.c;
                    Intrinsics.checkNotNullExpressionValue(camera2PreviewView, "camera2Preview");
                    interfaceC0620gA = new com.withpersona.sdk2.camera.d(camera2PreviewView);
                } else {
                    C0645f.a aVarB = aVar.getCamera2ManagerFactoryFactory();
                    Camera2PreviewView camera2PreviewView2 = aVarD.c;
                    Intrinsics.checkNotNullExpressionValue(camera2PreviewView2, "camera2Preview");
                    interfaceC0620gA = new C0634a(aVarB.a(cameraChoicesA, camera2PreviewView2, h, EnumC0732a.valueOf(aVar.getVideoCaptureMethod().toString()), aVar.getWebRtcManager(), aVar.getIsAudioRequired()));
                }
            } else {
                b.a aVarC = aVar.getCameraXControllerFactory();
                PreviewView previewView = aVarD.k;
                Intrinsics.checkNotNullExpressionValue(previewView, "previewviewSelfieCamera");
                interfaceC0620gA = aVarC.a(cameraPreview, previewView, new b(aVarD, cameraPreview, h, aVar));
            }
            ConstraintLayout constraintLayoutA = aVarD.a();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
            Intrinsics.d(aVarD);
            E.a(constraintLayoutA, aVar, viewEnvironment, new C0159a(new CameraScreenRunner(aVarD, interfaceC0620gA, h)));
            ConstraintLayout constraintLayoutA2 = aVarD.a();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutA2, "let(...)");
            return constraintLayoutA2;
        }
    }

    public f(@NotNull CameraPreview cameraPreview, @NotNull H h) {
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(h, "selfieDirectionFeed");
        this.cameraPreview = cameraPreview;
        this.selfieDirectionFeed = h;
        this.c = new C0494f<>(z.b(p.AbstractC0528d.a.class), new a(h, cameraPreview));
    }

    @Override
    @NotNull
    public View a(@NotNull p.AbstractC0528d.a initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        return this.c.a(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override
    @NotNull
    public fa.c<? super p.AbstractC0528d.a> getType() {
        return this.c.getType();
    }
}
