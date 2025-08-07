package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.C0494f;
import com.squareup.workflow1.ui.E;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.b;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import ha.C0634a;
import ha.C0645f;
import ha.C0648i;
import ha.CameraChoices;
import ha.EnumC0653n;
import i9.C0594a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;
import p8.EnumC0732a;
import u5.C;
import u5.InterfaceC0620g;
import u5.s;
import u5.w;
import z8.C0889b;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u001a8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/h;", "Lcom/squareup/workflow1/ui/A;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "Ll8/w;", "governmentIdFeed", "Lcom/withpersona/sdk2/camera/CameraPreview;", "cameraPreview", "Li9/a;", "systemUiController", "<init>", "(Ll8/w;Lcom/withpersona/sdk2/camera/CameraPreview;Li9/a;)V", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "a", "Ll8/w;", "Lcom/withpersona/sdk2/camera/CameraPreview;", "c", "Li9/a;", "Lfa/c;", "getType", "()Lfa/c;", "type", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class h implements A<Screen.b> {

    @NotNull
    private final w governmentIdFeed;

    @NotNull
    private final CameraPreview cameraPreview;

    @NotNull
    private final C0594a systemUiController;
    private final C0494f<Screen.b> d;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.jvm.internal.l implements aa.o<Screen.b, ViewEnvironment, Context, ViewGroup, View> {
        final w d;
        final CameraPreview e;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class C0107a extends kotlin.jvm.internal.j implements Function2<Screen.b, ViewEnvironment, Unit> {
            C0107a(Object obj) {
                super(2, obj, CameraScreenRunner.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            public final void f(@NotNull Screen.b bVar, @NotNull ViewEnvironment viewEnvironment) {
                Intrinsics.checkNotNullParameter(bVar, "p0");
                Intrinsics.checkNotNullParameter(viewEnvironment, "p1");
                ((CameraScreenRunner) ((kotlin.jvm.internal.d) this).receiver).a(bVar, viewEnvironment);
            }

            public Object invoke(Object obj, Object obj2) {
                f((Screen.b) obj, (ViewEnvironment) obj2);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/withpersona/sdk2/inquiry/governmentid/h$a$b", "Ll8/s;", "", "a", "()V", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class b implements s {
            final C0889b a;
            final Screen.b b;
            final CameraPreview c;
            final w d;

            b(C0889b c0889b, Screen.b bVar, CameraPreview cameraPreview, w wVar) {
                this.a = c0889b;
                this.b = bVar;
                this.c = cameraPreview;
                this.d = wVar;
            }

            @Override
            public void a() {
                PreviewView previewView = this.a.y;
                CameraPreview.a aVar = CameraPreview.a.e;
                Function1<Throwable, Unit> function1X = this.b.x();
                CameraPreview cameraPreview = this.c;
                Intrinsics.d(previewView);
                cameraPreview.f(previewView, aVar, this.d, true, function1X);
            }
        }

        a(w wVar, CameraPreview cameraPreview) {
            super(4);
            this.d = wVar;
            this.e = cameraPreview;
        }

        @NotNull
        public final View h(@NotNull Screen.b bVar, @NotNull ViewEnvironment viewEnvironment, @NotNull Context context, ViewGroup viewGroup) throws CameraAccessException {
            InterfaceC0620g c0634a;
            InterfaceC0620g interfaceC0620gA;
            Intrinsics.checkNotNullParameter(bVar, "initialRendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(context, "context");
            Context context2 = viewGroup != null ? viewGroup.getContext() : null;
            if (context2 == null) {
                context2 = context;
            }
            LayoutInflater layoutInflaterCloneInContext = LayoutInflater.from(context2).cloneInContext(context);
            w wVar = this.d;
            CameraPreview cameraPreview = this.e;
            C0889b c0889bD = C0889b.d(layoutInflaterCloneInContext);
            if (bVar.getVideoCaptureMethod() == EnumC0732a.e || bVar.getVideoCaptureMethod() == EnumC0732a.d) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                CameraChoices cameraChoicesA = C0648i.a(applicationContext, EnumC0653n.e);
                if (cameraChoicesA == null) {
                    bVar.x().invoke(new C());
                    Camera2PreviewView camera2PreviewView = c0889bD.c;
                    Intrinsics.checkNotNullExpressionValue(camera2PreviewView, "camera2Preview");
                    c0634a = new com.withpersona.sdk2.camera.d(camera2PreviewView);
                } else {
                    C0645f.a camera2ManagerFactoryFactory = bVar.getCamera2ManagerFactoryFactory();
                    Camera2PreviewView camera2PreviewView2 = c0889bD.c;
                    Intrinsics.checkNotNullExpressionValue(camera2PreviewView2, "camera2Preview");
                    c0634a = new C0634a(camera2ManagerFactoryFactory.a(cameraChoicesA, camera2PreviewView2, wVar, bVar.getVideoCaptureMethod(), bVar.getWebRtcManager(), bVar.getIsAudioRequired()));
                }
                interfaceC0620gA = c0634a;
            } else {
                b.a cameraXControllerFactory = bVar.getCameraXControllerFactory();
                PreviewView previewView = c0889bD.y;
                Intrinsics.checkNotNullExpressionValue(previewView, "previewView");
                interfaceC0620gA = cameraXControllerFactory.a(cameraPreview, previewView, new b(c0889bD, bVar, cameraPreview, wVar));
            }
            FrameLayout frameLayoutC = c0889bD.a();
            Intrinsics.checkNotNullExpressionValue(frameLayoutC, "getRoot(...)");
            Intrinsics.d(c0889bD);
            E.a(frameLayoutC, bVar, viewEnvironment, new C0107a(new CameraScreenRunner(c0889bD, interfaceC0620gA, wVar)));
            FrameLayout frameLayoutC2 = c0889bD.a();
            Intrinsics.checkNotNullExpressionValue(frameLayoutC2, "let(...)");
            return frameLayoutC2;
        }
    }

    public h(@NotNull w wVar, @NotNull CameraPreview cameraPreview, @NotNull C0594a c0594a) {
        Intrinsics.checkNotNullParameter(wVar, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(c0594a, "systemUiController");
        this.governmentIdFeed = wVar;
        this.cameraPreview = cameraPreview;
        this.systemUiController = c0594a;
        this.d = new C0494f<>(z.b(Screen.b.class), new a(wVar, cameraPreview));
    }

    @Override
    @NotNull
    public View a(@NotNull Screen.b initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        return this.d.a(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override
    @NotNull
    public fa.c<? super Screen.b> getType() {
        return this.d.getType();
    }
}
