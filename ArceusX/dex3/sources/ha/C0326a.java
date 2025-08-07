package ha;

import P9.p;
import android.content.Context;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.b;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.m;
import com.withpersona.sdk2.inquiry.governmentid.o;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import ha.C0586a;
import ha.C0645f;
import ha.W;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k8.AlertContainerScreen;
import ka.C0562B;
import ka.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;
import p8.EnumC0732a;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJM\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0015\u001a\"0\u0010R\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0012j\u0002`\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LC8/a;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/camera/b$a;", "cameraXControllerFactory", "Ln8/f$a;", "camera2ManagerFactoryFactory", "Lh9/a;", "navigationStateManager", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/b$a;Ln8/f$a;Lh9/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;", "renderState", "Lf8/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lf8/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "context", "LC8/b;", "videoCaptureHelper", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;Lf8/k$a;LC8/b;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "Lcom/withpersona/sdk2/camera/b$a;", "c", "Ln8/f$a;", "d", "Lh9/a;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0326a {

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final b.a cameraXControllerFactory;

    @NotNull
    private final C0645f.a camera2ManagerFactoryFactory;

    @NotNull
    private final C0586a navigationStateManager;

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.governmentid.video_capture.LocalVideoCaptureRenderer$renderFinalizeVideoCapture$1", f = "LocalVideoCaptureRenderer.kt", l = {44}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;
        final GovernmentIdState.FinalizeLocalVideoCapture e;
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0011a extends l implements Function1<r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            public static final C0011a d = new C0011a();

            C0011a() {
                super(1);
            }

            public final void a(@NotNull r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                GovernmentIdState governmentIdStateC = cVar.c();
                GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = governmentIdStateC instanceof GovernmentIdState.FinalizeLocalVideoCapture ? (GovernmentIdState.FinalizeLocalVideoCapture) governmentIdStateC : null;
                if (finalizeLocalVideoCapture == null) {
                    return;
                }
                cVar.e(finalizeLocalVideoCapture.o((255 & 1) != 0 ? finalizeLocalVideoCapture.id : null, (255 & 2) != 0 ? finalizeLocalVideoCapture.uploadingIds : null, (255 & 4) != 0 ? finalizeLocalVideoCapture.currentPart : null, (255 & 8) != 0 ? finalizeLocalVideoCapture.parts : null, (255 & 16) != 0 ? finalizeLocalVideoCapture.partIndex : 0, (255 & 32) != 0 ? finalizeLocalVideoCapture.backState : null, (255 & 64) != 0 ? finalizeLocalVideoCapture.governmentIdRequestArguments : null, (255 & 128) != 0 ? finalizeLocalVideoCapture.minDurationMs : 0L, (255 & 256) != 0 ? finalizeLocalVideoCapture.isDelayComplete : true));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        L(GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, Continuation<? super L> continuation) {
            super(2, continuation);
            this.e = finalizeLocalVideoCapture;
            this.i = aVar;
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
                long minDurationMs = this.e.getMinDurationMs();
                this.d = 1;
                if (W.a(minDurationMs, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            this.i.b().d(C0562B.c(null, C0011a.d, 1, null));
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "<anonymous parameter 0>", "Lcom/withpersona/sdk2/camera/CameraProperties;", "<anonymous parameter 1>", "", "a", "(Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends l implements Function2<List<? extends String>, CameraProperties, Unit> {
        public static final b d = new b();

        b() {
            super(2);
        }

        public final void a(@NotNull List<String> list, @NotNull CameraProperties cameraProperties) {
            Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(cameraProperties, "<anonymous parameter 1>");
        }

        public Object invoke(Object obj, Object obj2) {
            a((List) obj, (CameraProperties) obj2);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends l implements Function0<Unit> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0012a extends l implements Function1<r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            public static final C0012a d = new C0012a();

            C0012a() {
                super(1);
            }

            public final void a(@NotNull r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(o.AbstractC0521b.C0113b.a);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        c(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar) {
            super(0);
            this.d = aVar;
        }

        public Object invoke() {
            m1invoke();
            return Unit.a;
        }

        public final void m1invoke() {
            this.d.b().d(C0562B.c(null, C0012a.d, 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends l implements Function0<Unit> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;

        d(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar) {
            super(0);
            this.d = aVar;
        }

        public Object invoke() {
            m2invoke();
            return Unit.a;
        }

        public final void m2invoke() {
            com.withpersona.sdk2.inquiry.governmentid.p.l(this.d, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class e extends l implements Function1<Throwable, Unit> {
        public static final e d = new e();

        e() {
            super(1);
        }

        public final void a(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
        }

        public Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/io/File;", "file", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "a", "(Ljava/io/File;Lcom/withpersona/sdk2/camera/CameraProperties;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class f extends l implements Function2<File, CameraProperties, Unit> {
        final GovernmentIdState.FinalizeLocalVideoCapture d;
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a e;
        final o.C0520a i;
        final C0327b v;

        f(GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, o.C0520a c0520a, C0327b c0327b) {
            super(2);
            this.d = finalizeLocalVideoCapture;
            this.e = aVar;
            this.i = c0520a;
            this.v = c0327b;
        }

        public final void a(@NotNull File file, @NotNull CameraProperties cameraProperties) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            List<GovernmentId> listL = this.d.l();
            ArrayList arrayList = new ArrayList(CollectionsKt.t(listL, 10));
            Iterator<T> it = listL.iterator();
            while (it.hasNext()) {
                arrayList.add(((GovernmentId) it.next()).getSide());
            }
            GovernmentId.b bVar = GovernmentId.b.d;
            boolean zContains = arrayList.contains(bVar);
            GovernmentId.b bVar2 = GovernmentId.b.e;
            boolean zContains2 = arrayList.contains(bVar2);
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            List listD = CollectionsKt.d(new Frame(absolutePath, "video/*"));
            if (zContains && zContains2) {
                bVar = GovernmentId.b.i;
            } else if (!zContains && zContains2) {
                bVar = bVar2;
            }
            GovernmentId.GovernmentIdVideo governmentIdVideo = new GovernmentId.GovernmentIdVideo(listD, bVar, this.d.getId().getIdClassKey(), GovernmentId.a.e);
            IdConfig id = this.d.getId();
            GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = this.d;
            com.withpersona.sdk2.inquiry.governmentid.p.n(finalizeLocalVideoCapture, this.e, this.i, governmentIdVideo, id, this.v, cameraProperties, (1536 & 128) != 0, (1536 & 256) != 0 ? finalizeLocalVideoCapture.k() : null, (1536 & 512) != 0 ? finalizeLocalVideoCapture.getPartIndex() : 0, (1536 & 1024) != 0 ? null : null);
        }

        public Object invoke(Object obj, Object obj2) {
            a((File) obj, (CameraProperties) obj2);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class g extends l implements Function0<Unit> {
        public static final g d = new g();

        g() {
            super(0);
        }

        public Object invoke() {
            m3invoke();
            return Unit.a;
        }

        public final void m3invoke() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class h extends l implements Function0<Unit> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a e;
        final o.C0520a i;

        h(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, o.C0520a c0520a) {
            super(0);
            this.e = aVar;
            this.i = c0520a;
        }

        public Object invoke() {
            m4invoke();
            return Unit.a;
        }

        public final void m4invoke() {
            com.withpersona.sdk2.inquiry.governmentid.p.m(C0326a.this.applicationContext, this.e, this.i, true);
        }
    }

    public C0326a(@NotNull Context context, @NotNull b.a aVar, @NotNull C0645f.a aVar2, @NotNull C0586a c0586a) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        Intrinsics.checkNotNullParameter(aVar, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(aVar2, "camera2ManagerFactoryFactory");
        Intrinsics.checkNotNullParameter(c0586a, "navigationStateManager");
        this.applicationContext = context;
        this.cameraXControllerFactory = aVar;
        this.camera2ManagerFactoryFactory = aVar2;
        this.navigationStateManager = c0586a;
    }

    @NotNull
    public final Object b(@NotNull o.C0520a renderProps, @NotNull GovernmentIdState.FinalizeLocalVideoCapture renderState, @NotNull ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a context, @NotNull C0327b videoCaptureHelper) {
        IdConfig.b side;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        context.a("finalize_delay", new L(renderState, context, null));
        IdPart currentPart = renderState.getCurrentPart();
        IdPart.SideIdPart sideIdPart = currentPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart : null;
        if (sideIdPart == null || (side = sideIdPart.getSide()) == null) {
            side = IdConfig.b.v;
        }
        IdConfig.b bVar = side;
        IdConfig.IdSideConfig idSideConfigC = renderState.getId().c(bVar);
        String strE = com.withpersona.sdk2.inquiry.governmentid.p.e(renderProps.getStrings(), bVar, renderState.getId().getIdClassKey());
        String capturing = renderProps.getStrings().getCapturing();
        Screen.b.a aVar = Screen.b.a.d;
        bb.b type = renderState.getId().getType();
        Screen.Overlay overlay = idSideConfigC.getOverlay();
        NavigationState navigationStateB = this.navigationStateManager.b();
        List listJ = CollectionsKt.j();
        int partIndex = renderState.getPartIndex();
        Function1<Throwable, Unit> function1D = com.withpersona.sdk2.inquiry.governmentid.p.d(context);
        boolean isDelayComplete = renderState.getIsDelayComplete();
        return new AlertContainerScreen(com.withpersona.sdk2.inquiry.permissions.d.c(m.a(renderProps, strE, capturing, aVar, overlay, type, bVar, navigationStateB, (805437440 & 256) != 0 ? m.a.d : b.d, new c(context), new d(context), false, listJ, renderState, partIndex, this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, (131072 & 805437440) != 0 ? m.b.d : null, (262144 & 805437440) != 0 ? m.c.d : e.d, function1D, (1048576 & 805437440) != 0 ? EnumC0732a.i : EnumC0732a.e, (2097152 & 805437440) != 0, (4194304 & 805437440) != 0 ? false : true, (8388608 & 805437440) != 0 ? false : isDelayComplete, (16777216 & 805437440) != 0 ? m.d.d : new f(renderState, context, renderProps, videoCaptureHelper), (33554432 & 805437440) != 0 ? m.e.d : g.d, new h(context, renderProps), (134217728 & 805437440) != 0 ? renderProps.getImageCaptureCount() : 0, (268435456 & 805437440) != 0 ? null : null, (536870912 & 805437440) != 0 ? null : null, (805437440 & 1073741824) != 0 ? null : null)), null, 2, null);
    }
}
