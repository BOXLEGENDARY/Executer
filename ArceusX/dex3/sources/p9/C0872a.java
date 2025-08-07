package P9;

import A9.a;
import M8.i;
import P9.GovernmentIdHintWorker;
import P9.t;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.util.Size;
import bb.C0896b;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.b;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.governmentid.m;
import com.withpersona.sdk2.inquiry.governmentid.o;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import ha.C0327b;
import ha.C0456d;
import ha.C0586a;
import ha.C0645f;
import ha.C0648i;
import ha.CameraChoice;
import ha.CameraChoices;
import ha.EnumC0329d;
import ha.EnumC0653n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k8.AlertContainerScreen;
import k8.AlertScreen;
import ka.C0562B;
import ka.InterfaceC0570h;
import ka.o;
import ka.r;
import ka.w;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p8.EnumC0732a;
import y8.CaptureTipsViewModel;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013JQ\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162&\u0010\u001d\u001a\"0\u0018R\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u001aj\u0002`\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b!\u0010\"Jg\u0010+\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u001b2&\u0010\u001d\u001a\"0\u0018R\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u001aj\u0002`\u00192\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J[\u0010/\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162&\u0010\u001d\u001a\"0\u0018R\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u001aj\u0002`\u00192\u0006\u0010&\u001a\u00020%2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0-¢\u0006\u0004\b/\u00100J[\u00102\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u0002012&\u0010\u001d\u001a\"0\u0018R\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u001aj\u0002`\u00192\u0006\u0010&\u001a\u00020%2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0-¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010;R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010<R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010=R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lx8/a;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a;", "governmentIdAnalyzeWorkerFactory", "LA8/a$b;", "governmentIdHintWorkerFactory", "Lz9/b$a;", "webRtcWorkerFactory", "Lcom/withpersona/sdk2/camera/b$a;", "cameraXControllerFactory", "Ln8/f$a;", "camera2ManagerFactoryFactory", "Lh9/a;", "navigationStateManager", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/e$a;LA8/a$b;Lz9/b$a;Lcom/withpersona/sdk2/camera/b$a;Ln8/f$a;Lh9/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;", "renderState", "Lf8/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lf8/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "context", "LA9/a;", "webRtcManager", "", "g", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lf8/k$a;LA9/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "LC8/b;", "videoCaptureHelper", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "capturedId", "d", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lf8/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;LC8/b;Lcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;)V", "Lf8/h;", "sink", "f", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lf8/k$a;LC8/b;Lf8/h;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;", "e", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;Lf8/k$a;LC8/b;Lf8/h;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "c", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a;", "LA8/a$b;", "Lz9/b$a;", "Lcom/withpersona/sdk2/camera/b$a;", "Ln8/f$a;", "h", "Lh9/a;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0872a {

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final PermissionRequestWorkflow permissionRequestWorkflow;

    @NotNull
    private final GovernmentIdAnalyzeWorker.a governmentIdAnalyzeWorkerFactory;

    @NotNull
    private final GovernmentIdHintWorker.b governmentIdHintWorkerFactory;

    @NotNull
    private final C0896b.a webRtcWorkerFactory;

    @NotNull
    private final b.a cameraXControllerFactory;

    @NotNull
    private final C0645f.a camera2ManagerFactoryFactory;

    @NotNull
    private final C0586a navigationStateManager;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0301a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
        final GovernmentIdState d;
        final CaptureConfig e;
        final GovernmentId.GovernmentIdImage i;
        final GovernmentIdState.WaitForAutocapture v;
        final CameraProperties w;

        C0301a(GovernmentIdState governmentIdState, CaptureConfig captureConfig, GovernmentId.GovernmentIdImage governmentIdImage, GovernmentIdState.WaitForAutocapture waitForAutocapture, CameraProperties cameraProperties) {
            super(1);
            this.d = governmentIdState;
            this.e = captureConfig;
            this.i = governmentIdImage;
            this.v = waitForAutocapture;
            this.w = cameraProperties;
        }

        public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            IdPart currentPart = this.d.getCurrentPart();
            IdPart.SideIdPart sideIdPart = currentPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart : null;
            if (sideIdPart == null) {
                return;
            }
            cVar.e(new GovernmentIdState.ReviewCapturedImage(sideIdPart, cVar.c().l(), this.e, this.i, cVar.c().k(), cVar.c().getPartIndex(), this.v, this.w, null, false, 768, null));
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;
        final C0327b e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0302a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final C0327b d;

            C0302a(C0327b c0327b) {
                super(1);
                this.d = c0327b;
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                GovernmentIdState governmentIdStateC = cVar.c();
                GovernmentIdState.WaitForAutocapture waitForAutocapture = governmentIdStateC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) governmentIdStateC : null;
                if (waitForAutocapture != null) {
                    cVar.e(GovernmentIdState.WaitForAutocapture.p(waitForAutocapture, null, null, null, null, null, 0, null, this.d.d() ? EnumC0329d.e : EnumC0329d.i, null, null, false, false, null, null, 16255, null));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        b(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, C0327b c0327b) {
            super(0);
            this.d = aVar;
            this.e = c0327b;
        }

        public Object invoke() {
            m712invoke();
            return Unit.a;
        }

        public final void m712invoke() {
            this.d.b().d(C0562B.c(null, new C0302a(this.e), 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "hint", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends kotlin.jvm.internal.l implements Function1<Hint, ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>> {
        public static final c d = new c();

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0303a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final Hint d;

            C0303a(Hint hint) {
                super(1);
                this.d = hint;
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                GovernmentIdState governmentIdStateC = cVar.c();
                GovernmentIdState.CountdownToCapture countdownToCapture = governmentIdStateC instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) governmentIdStateC : null;
                if (countdownToCapture == null) {
                    return;
                }
                cVar.e(countdownToCapture.o((127 & 1) != 0 ? countdownToCapture.currentPart : null, (127 & 2) != 0 ? countdownToCapture.uploadingIds : null, (127 & 4) != 0 ? countdownToCapture.captureConfig : null, (127 & 8) != 0 ? countdownToCapture.idForReview : null, (127 & 16) != 0 ? countdownToCapture.parts : null, (127 & 32) != 0 ? countdownToCapture.partIndex : 0, (127 & 64) != 0 ? countdownToCapture.backState : null, (127 & 128) != 0 ? countdownToCapture.hint : this.d));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        c() {
            super(1);
        }

        @NotNull
        public final ka.r<o.C0520a, GovernmentIdState, o.AbstractC0521b> invoke(Hint hint) {
            return C0562B.c(null, new C0303a(hint), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.l implements Function0<Unit> {
        final InterfaceC0570h<o.AbstractC0521b> d;

        d(InterfaceC0570h<? super o.AbstractC0521b> interfaceC0570h) {
            super(0);
            this.d = interfaceC0570h;
        }

        public Object invoke() {
            m713invoke();
            return Unit.a;
        }

        public final void m713invoke() {
            this.d.d(o.AbstractC0521b.C0113b.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;
        final C0327b e;

        e(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, C0327b c0327b) {
            super(0);
            this.d = aVar;
            this.e = c0327b;
        }

        public Object invoke() {
            m714invoke();
            return Unit.a;
        }

        public final void m714invoke() {
            com.withpersona.sdk2.inquiry.governmentid.p.l(this.d, this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "absolutePaths", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "a", "(Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class f extends kotlin.jvm.internal.l implements Function2<List<? extends String>, CameraProperties, Unit> {
        final GovernmentIdState.CountdownToCapture d;
        final C0872a e;
        final o.C0520a i;
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a v;
        final C0327b w;

        f(GovernmentIdState.CountdownToCapture countdownToCapture, C0872a c0872a, o.C0520a c0520a, ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, C0327b c0327b) {
            super(2);
            this.d = countdownToCapture;
            this.e = c0872a;
            this.i = c0520a;
            this.v = aVar;
            this.w = c0327b;
        }

        public final void a(@NotNull List<String> list, @NotNull CameraProperties cameraProperties) throws P9.m {
            Intrinsics.checkNotNullParameter(list, "absolutePaths");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            List<Frame> listB1 = this.d.getIdForReview().b1();
            ArrayList arrayList = new ArrayList(CollectionsKt.t(listB1, 10));
            Iterator<T> it = listB1.iterator();
            while (it.hasNext()) {
                arrayList.add(((Frame) it.next()).getAbsoluteFilePath());
            }
            List listE0 = CollectionsKt.e0(arrayList, list);
            C0872a c0872a = this.e;
            o.C0520a c0520a = this.i;
            GovernmentIdState.CountdownToCapture countdownToCapture = this.d;
            ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a aVar = this.v;
            CaptureConfig captureConfig = countdownToCapture.getCaptureConfig();
            C0327b c0327b = this.w;
            GovernmentId.GovernmentIdImage idForReview = this.d.getIdForReview();
            List list2 = listE0;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.t(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new Frame((String) it2.next(), null, 2, null));
            }
            c0872a.d(c0520a, countdownToCapture, aVar, captureConfig, c0327b, cameraProperties, GovernmentId.GovernmentIdImage.b(idForReview, arrayList2, null, null, null, null, null, 62, null));
        }

        public Object invoke(Object obj, Object obj2) throws P9.m {
            a((List) obj, (CameraProperties) obj2);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class g extends kotlin.jvm.internal.l implements Function1<Throwable, Unit> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;
        final GovernmentIdState.CountdownToCapture e;
        final o.C0520a i;
        final C0327b v;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0304a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final GovernmentIdState.CountdownToCapture d;
            final o.C0520a e;
            final Throwable i;
            final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a v;
            final C0327b w;

            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            static final class C0305a extends kotlin.jvm.internal.l implements Function0<Unit> {
                final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;
                final C0327b e;

                @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
                static final class C0306a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
                    final C0327b d;

                    C0306a(C0327b c0327b) {
                        super(1);
                        this.d = c0327b;
                    }

                    public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                        Intrinsics.checkNotNullParameter(cVar, "$this$action");
                        GovernmentIdState governmentIdStateC = cVar.c();
                        GovernmentIdState.WaitForAutocapture waitForAutocapture = governmentIdStateC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) governmentIdStateC : null;
                        if (waitForAutocapture != null) {
                            cVar.e(GovernmentIdState.WaitForAutocapture.p(waitForAutocapture, null, null, null, null, null, 0, null, this.d.d() ? EnumC0329d.e : EnumC0329d.i, null, null, false, false, null, null, 16255, null));
                        }
                    }

                    public Object invoke(Object obj) {
                        a((r.c) obj);
                        return Unit.a;
                    }
                }

                C0305a(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, C0327b c0327b) {
                    super(0);
                    this.d = aVar;
                    this.e = c0327b;
                }

                public Object invoke() {
                    m715invoke();
                    return Unit.a;
                }

                public final void m715invoke() {
                    this.d.b().d(C0562B.c(null, new C0306a(this.e), 1, null));
                }
            }

            C0304a(GovernmentIdState.CountdownToCapture countdownToCapture, o.C0520a c0520a, Throwable th, ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, C0327b c0327b) {
                super(1);
                this.d = countdownToCapture;
                this.e = c0520a;
                this.i = th;
                this.v = aVar;
                this.w = c0327b;
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                GovernmentIdState governmentIdStateC = cVar.c();
                GovernmentIdState.CountdownToCapture countdownToCapture = governmentIdStateC instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) governmentIdStateC : null;
                if (countdownToCapture == null) {
                    return;
                }
                cVar.e(new GovernmentIdState.WaitForAutocapture(this.d.getCurrentPart(), this.d.l(), this.d.getCaptureConfig(), com.withpersona.sdk2.inquiry.governmentid.p.i(cVar.b(), this.d.getCurrentPart().getSide()), countdownToCapture.k(), countdownToCapture.getPartIndex(), com.withpersona.sdk2.inquiry.governmentid.p.b(cVar, false), EnumC0329d.i, this.e.getVideoCaptureConfig().getWebRtcJwt(), this.i, false, false, null, new C0305a(this.v, this.w), 7168, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        g(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, GovernmentIdState.CountdownToCapture countdownToCapture, o.C0520a c0520a, C0327b c0327b) {
            super(1);
            this.d = aVar;
            this.e = countdownToCapture;
            this.i = c0520a;
            this.v = c0327b;
        }

        public final void a(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "error");
            this.d.b().d(C0562B.c(null, new C0304a(this.e, this.i, th, this.d, this.v), 1, null));
        }

        public Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a e;
        final o.C0520a i;
        final C0327b v;

        h(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, o.C0520a c0520a, C0327b c0327b) {
            super(0);
            this.e = aVar;
            this.i = c0520a;
            this.v = c0327b;
        }

        public Object invoke() {
            m716invoke();
            return Unit.a;
        }

        public final void m716invoke() {
            Context context = C0872a.this.applicationContext;
            ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a aVar = this.e;
            o.C0520a c0520a = this.i;
            com.withpersona.sdk2.inquiry.governmentid.p.m(context, aVar, c0520a, this.v.c(c0520a));
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LP9/o;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "result", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "a", "(Ljava/lang/Object;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class o extends kotlin.jvm.internal.l implements Function1<P9.o<? extends GovernmentId.GovernmentIdImage>, ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>> {
        final GovernmentIdState.WaitForAutocapture d;
        final CaptureConfig e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0307a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final GovernmentIdState.WaitForAutocapture d;
            final CaptureConfig e;
            final GovernmentId.GovernmentIdImage i;

            C0307a(GovernmentIdState.WaitForAutocapture waitForAutocapture, CaptureConfig captureConfig, GovernmentId.GovernmentIdImage governmentIdImage) {
                super(1);
                this.d = waitForAutocapture;
                this.e = captureConfig;
                this.i = governmentIdImage;
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                GovernmentIdState governmentIdStateC = cVar.c();
                GovernmentIdState.WaitForAutocapture waitForAutocapture = governmentIdStateC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) governmentIdStateC : null;
                if (waitForAutocapture == null) {
                    return;
                }
                cVar.e(new GovernmentIdState.CountdownToCapture(this.d.getCurrentPart(), cVar.c().l(), this.e, this.i, waitForAutocapture.k(), waitForAutocapture.getPartIndex(), com.withpersona.sdk2.inquiry.governmentid.p.b(cVar, false), waitForAutocapture.getHint()));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            public static final b d = new b();

            b() {
                super(1);
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(new o.AbstractC0521b.c(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class c extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final GovernmentIdState.WaitForAutocapture d;

            c(GovernmentIdState.WaitForAutocapture waitForAutocapture) {
                super(1);
                this.d = waitForAutocapture;
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                if (this.d.getManualCapture() == Screen.b.a.i) {
                    cVar.e(GovernmentIdState.WaitForAutocapture.p(this.d, null, null, null, Screen.b.a.e, null, 0, null, null, null, null, false, false, null, null, 16375, null));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        o(GovernmentIdState.WaitForAutocapture waitForAutocapture, CaptureConfig captureConfig) {
            super(1);
            this.d = waitForAutocapture;
            this.e = captureConfig;
        }

        @NotNull
        public final ka.r<o.C0520a, GovernmentIdState, o.AbstractC0521b> a(@NotNull Object obj) {
            GovernmentIdState.WaitForAutocapture waitForAutocapture = this.d;
            CaptureConfig captureConfig = this.e;
            Throwable thE = P9.o.e(obj);
            if (thE == null) {
                return C0562B.c(null, new C0307a(waitForAutocapture, captureConfig, (GovernmentId.GovernmentIdImage) obj), 1, null);
            }
            String message = thE.getMessage();
            return (message == null || !StringsKt.K(message, "ENOSPC", false, 2, (Object) null)) ? C0562B.c(null, new c(waitForAutocapture), 1, null) : C0562B.c(null, b.d, 1, null);
        }

        public Object invoke(Object obj) {
            return a(((P9.o) obj).j());
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "hint", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class j extends kotlin.jvm.internal.l implements Function1<Hint, ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>> {
        public static final j d = new j();

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0308a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final Hint d;

            C0308a(Hint hint) {
                super(1);
                this.d = hint;
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                GovernmentIdState governmentIdStateC = cVar.c();
                GovernmentIdState.WaitForAutocapture waitForAutocapture = governmentIdStateC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) governmentIdStateC : null;
                if (waitForAutocapture == null) {
                    return;
                }
                cVar.e(GovernmentIdState.WaitForAutocapture.p(waitForAutocapture, null, null, null, null, null, 0, null, null, null, null, false, false, this.d, null, 12287, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        j() {
            super(1);
        }

        @NotNull
        public final ka.r<o.C0520a, GovernmentIdState, o.AbstractC0521b> invoke(Hint hint) {
            return C0562B.c(null, new C0308a(hint), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "a", "(Lkotlin/Unit;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class k extends kotlin.jvm.internal.l implements Function1<Unit, ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>> {
        final GovernmentIdState.WaitForAutocapture d;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0309a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final GovernmentIdState.WaitForAutocapture d;

            C0309a(GovernmentIdState.WaitForAutocapture waitForAutocapture) {
                super(1);
                this.d = waitForAutocapture;
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                if (this.d.getManualCapture() == Screen.b.a.i) {
                    cVar.e(GovernmentIdState.WaitForAutocapture.p(this.d, null, null, null, Screen.b.a.e, null, 0, null, null, null, null, false, false, null, null, 16375, null));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        k(GovernmentIdState.WaitForAutocapture waitForAutocapture) {
            super(1);
            this.d = waitForAutocapture;
        }

        @NotNull
        public final ka.r<o.C0520a, GovernmentIdState, o.AbstractC0521b> invoke(@NotNull Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "it");
            return C0562B.c(null, new C0309a(this.d), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk8/d$b;", "it", "", "a", "(Lk8/d$b;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class l extends kotlin.jvm.internal.l implements Function1<AlertScreen.b, Unit> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0310a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            public static final C0310a d = new C0310a();

            C0310a() {
                super(1);
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                GovernmentIdState governmentIdStateC = cVar.c();
                if (governmentIdStateC instanceof GovernmentIdState.WaitForAutocapture) {
                    cVar.e(GovernmentIdState.WaitForAutocapture.p((GovernmentIdState.WaitForAutocapture) governmentIdStateC, null, null, null, null, null, 0, null, null, null, null, false, false, null, null, 15871, null));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        l(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar) {
            super(1);
            this.d = aVar;
        }

        public final void a(@NotNull AlertScreen.b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "it");
            this.d.b().d(C0562B.c(null, C0310a.d, 1, null));
        }

        public Object invoke(Object obj) {
            a((AlertScreen.b) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "absolutePaths", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "a", "(Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class m extends kotlin.jvm.internal.l implements Function2<List<? extends String>, CameraProperties, Unit> {
        final GovernmentIdState.WaitForAutocapture d;
        final CaptureConfig e;
        final C0872a i;
        final o.C0520a v;
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a w;
        final C0327b y;

        m(GovernmentIdState.WaitForAutocapture waitForAutocapture, CaptureConfig captureConfig, C0872a c0872a, o.C0520a c0520a, ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, C0327b c0327b) {
            super(2);
            this.d = waitForAutocapture;
            this.e = captureConfig;
            this.i = c0872a;
            this.v = c0520a;
            this.w = aVar;
            this.y = c0327b;
        }

        public final void a(@NotNull List<String> list, @NotNull CameraProperties cameraProperties) throws P9.m {
            Intrinsics.checkNotNullParameter(list, "absolutePaths");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.t(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new Frame((String) it.next(), null, 2, null));
            }
            GovernmentId.GovernmentIdImage governmentIdImage = new GovernmentId.GovernmentIdImage(arrayList, com.withpersona.sdk2.inquiry.governmentid.p.q(this.d.getCurrentPart().getSide()), com.withpersona.sdk2.inquiry.governmentid.c.b(this.e), GovernmentId.a.e, null, null, 32, null);
            C0872a c0872a = this.i;
            o.C0520a c0520a = this.v;
            GovernmentIdState.WaitForAutocapture waitForAutocapture = this.d;
            c0872a.d(c0520a, waitForAutocapture, this.w, waitForAutocapture.getCaptureConfig(), this.y, cameraProperties, governmentIdImage);
        }

        public Object invoke(Object obj, Object obj2) throws P9.m {
            a((List) obj, (CameraProperties) obj2);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class n extends kotlin.jvm.internal.l implements Function0<Unit> {
        final InterfaceC0570h<o.AbstractC0521b> d;

        n(InterfaceC0570h<? super o.AbstractC0521b> interfaceC0570h) {
            super(0);
            this.d = interfaceC0570h;
        }

        public Object invoke() {
            m717invoke();
            return Unit.a;
        }

        public final void m717invoke() {
            this.d.d(o.AbstractC0521b.C0113b.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0873o extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;
        final C0327b e;

        C0873o(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, C0327b c0327b) {
            super(0);
            this.d = aVar;
            this.e = c0327b;
        }

        public Object invoke() {
            m718invoke();
            return Unit.a;
        }

        public final void m718invoke() {
            com.withpersona.sdk2.inquiry.governmentid.p.l(this.d, this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class p extends kotlin.jvm.internal.l implements Function1<Throwable, Unit> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0311a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final Throwable d;

            C0311a(Throwable th) {
                super(1);
                this.d = th;
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                GovernmentIdState governmentIdStateC = cVar.c();
                GovernmentIdState.WaitForAutocapture waitForAutocapture = governmentIdStateC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) governmentIdStateC : null;
                if (waitForAutocapture == null) {
                    return;
                }
                cVar.e(GovernmentIdState.WaitForAutocapture.p(waitForAutocapture, null, null, null, Screen.b.a.e, null, 0, null, null, null, this.d, false, false, null, null, 15863, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        p(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar) {
            super(1);
            this.d = aVar;
        }

        public final void a(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "error");
            this.d.b().d(C0562B.c(null, new C0311a(th), 1, null));
        }

        public Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class q extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;
        final GovernmentIdState.WaitForAutocapture e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0312a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final GovernmentIdState.WaitForAutocapture d;

            C0312a(GovernmentIdState.WaitForAutocapture waitForAutocapture) {
                super(1);
                this.d = waitForAutocapture;
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(GovernmentIdState.WaitForAutocapture.p(this.d, null, null, null, Screen.b.a.d, null, 0, null, null, null, null, false, false, null, null, 16375, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        q(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, GovernmentIdState.WaitForAutocapture waitForAutocapture) {
            super(0);
            this.d = aVar;
            this.e = waitForAutocapture;
        }

        public Object invoke() {
            m719invoke();
            return Unit.a;
        }

        public final void m719invoke() {
            this.d.b().d(C0562B.c(null, new C0312a(this.e), 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class r extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a e;
        final o.C0520a i;
        final C0327b v;

        r(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, o.C0520a c0520a, C0327b c0327b) {
            super(0);
            this.e = aVar;
            this.i = c0520a;
            this.v = c0327b;
        }

        public Object invoke() {
            m720invoke();
            return Unit.a;
        }

        public final void m720invoke() {
            Context context = C0872a.this.applicationContext;
            ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a aVar = this.e;
            o.C0520a c0520a = this.i;
            com.withpersona.sdk2.inquiry.governmentid.p.m(context, aVar, c0520a, this.v.c(c0520a));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lz9/b$b;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "a", "(Lz9/b$b;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class s extends kotlin.jvm.internal.l implements Function1<C0896b.AbstractC0322b, ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>> {
        final a e;
        final GovernmentIdState.WaitForAutocapture i;
        final o.C0520a v;
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a w;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0313a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final a d;
            final C0872a e;
            final CameraChoices i;
            final C0896b.AbstractC0322b v;
            final GovernmentIdState.WaitForAutocapture w;
            final o.C0520a y;
            final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a z;

            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            static final class C0314a extends kotlin.jvm.internal.l implements Function0<Unit> {
                final GovernmentIdState.WaitForAutocapture d;

                C0314a(GovernmentIdState.WaitForAutocapture waitForAutocapture) {
                    super(0);
                    this.d = waitForAutocapture;
                }

                public Object invoke() {
                    m721invoke();
                    return Unit.a;
                }

                public final void m721invoke() {
                    this.d.y().invoke();
                }
            }

            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            static final class b extends kotlin.jvm.internal.l implements Function0<Unit> {
                final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;
                final a e;

                @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
                static final class C0315a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
                    final a d;

                    C0315a(a aVar) {
                        super(1);
                        this.d = aVar;
                    }

                    public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                        Intrinsics.checkNotNullParameter(cVar, "$this$action");
                        this.d.b();
                        cVar.e(new GovernmentIdState.ShowInstructions(null, null, null, null, 0, null, null, 127, null));
                    }

                    public Object invoke(Object obj) {
                        a((r.c) obj);
                        return Unit.a;
                    }
                }

                b(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, a aVar2) {
                    super(0);
                    this.d = aVar;
                    this.e = aVar2;
                }

                public Object invoke() {
                    m722invoke();
                    return Unit.a;
                }

                public final void m722invoke() {
                    this.d.b().d(C0562B.c(null, new C0315a(this.e), 1, null));
                }
            }

            C0313a(a aVar, C0872a c0872a, CameraChoices cameraChoices, C0896b.AbstractC0322b abstractC0322b, GovernmentIdState.WaitForAutocapture waitForAutocapture, o.C0520a c0520a, ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar2) {
                super(1);
                this.d = aVar;
                this.e = c0872a;
                this.i = cameraChoices;
                this.v = abstractC0322b;
                this.w = waitForAutocapture;
                this.y = c0520a;
                this.z = aVar2;
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                CameraChoices cameraChoices;
                int i;
                int i2;
                CameraChoice primaryChoice;
                CameraChoice primaryChoice2;
                CameraChoice primaryChoice3;
                Size size;
                CameraChoice primaryChoice4;
                Size size2;
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                GovernmentIdState governmentIdStateC = cVar.c();
                GovernmentIdState.WaitForAutocapture waitForAutocapture = governmentIdStateC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) governmentIdStateC : null;
                if (waitForAutocapture == null || waitForAutocapture.getWebRtcState() != EnumC0329d.d) {
                    if (waitForAutocapture != null) {
                        cVar.e(GovernmentIdState.WaitForAutocapture.p(waitForAutocapture, null, null, null, null, null, 0, null, EnumC0329d.d, null, null, false, false, null, null, 16255, null));
                    }
                    a aVar = this.d;
                    if (aVar != null) {
                        aVar.f(this.e.webRtcWorkerFactory.getService());
                    }
                    a aVar2 = this.d;
                    if (aVar2 != null) {
                        aVar2.g(this.e.applicationContext);
                    }
                    CameraChoices cameraChoices2 = this.i;
                    int height = 0;
                    int width = (cameraChoices2 == null || (primaryChoice4 = cameraChoices2.getPrimaryChoice()) == null || (size2 = primaryChoice4.getSize()) == null) ? 0 : size2.getWidth();
                    CameraChoices cameraChoices3 = this.i;
                    if (cameraChoices3 != null && (primaryChoice3 = cameraChoices3.getPrimaryChoice()) != null && (size = primaryChoice3.getSize()) != null) {
                        height = size.getHeight();
                    }
                    CameraChoices cameraChoices4 = this.i;
                    if ((cameraChoices4 == null || (primaryChoice2 = cameraChoices4.getPrimaryChoice()) == null || primaryChoice2.getRotation() != 90) && ((cameraChoices = this.i) == null || (primaryChoice = cameraChoices.getPrimaryChoice()) == null || primaryChoice.getRotation() != 270)) {
                        i = width;
                        i2 = height;
                    } else {
                        i2 = width;
                        i = height;
                    }
                    a aVar3 = this.d;
                    if (aVar3 != null) {
                        aVar3.e(((C0896b.AbstractC0322b.C0323b) this.v).getResult().getUsername(), ((C0896b.AbstractC0322b.C0323b) this.v).getResult().getCredential(), ((C0896b.AbstractC0322b.C0323b) this.v).getResult().getServerUrl(), this.w.getWebRtcJwt(), i, i2, this.y.getVideoCaptureConfig().getRecordAudio(), new C0314a(this.w), new b(this.z, this.d));
                    }
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;
            final a e;

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class C0316a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
                final a d;

                C0316a(a aVar) {
                    super(1);
                    this.d = aVar;
                }

                public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                    Intrinsics.checkNotNullParameter(cVar, "$this$action");
                    a aVar = this.d;
                    if (aVar != null) {
                        aVar.b();
                    }
                    cVar.e(new GovernmentIdState.ShowInstructions(null, null, null, null, 0, null, null, 127, null));
                }

                public Object invoke(Object obj) {
                    a((r.c) obj);
                    return Unit.a;
                }
            }

            b(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, a aVar2) {
                super(1);
                this.d = aVar;
                this.e = aVar2;
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                GovernmentIdState governmentIdStateC = cVar.c();
                GovernmentIdState.WaitForAutocapture waitForAutocapture = governmentIdStateC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) governmentIdStateC : null;
                if (waitForAutocapture == null || waitForAutocapture.getWebRtcState() == EnumC0329d.d) {
                    return;
                }
                this.d.b().d(C0562B.c(null, new C0316a(this.e), 1, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        s(a aVar, GovernmentIdState.WaitForAutocapture waitForAutocapture, o.C0520a c0520a, ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar2) {
            super(1);
            this.e = aVar;
            this.i = waitForAutocapture;
            this.v = c0520a;
            this.w = aVar2;
        }

        @NotNull
        public final ka.r<o.C0520a, GovernmentIdState, o.AbstractC0521b> invoke(@NotNull C0896b.AbstractC0322b abstractC0322b) throws CameraAccessException, P9.m {
            Intrinsics.checkNotNullParameter(abstractC0322b, "it");
            CameraChoices cameraChoicesA = C0648i.a(C0872a.this.applicationContext, EnumC0653n.d);
            if (abstractC0322b instanceof C0896b.AbstractC0322b.C0323b) {
                return C0562B.c(null, new C0313a(this.e, C0872a.this, cameraChoicesA, abstractC0322b, this.i, this.v, this.w), 1, null);
            }
            if (abstractC0322b instanceof C0896b.AbstractC0322b.Error) {
                return C0562B.c(null, new b(this.w, this.e), 1, null);
            }
            throw new P9.m();
        }
    }

    public C0872a(@NotNull Context context, @NotNull PermissionRequestWorkflow permissionRequestWorkflow, @NotNull GovernmentIdAnalyzeWorker.a aVar, @NotNull GovernmentIdHintWorker.b bVar, @NotNull C0896b.a aVar2, @NotNull b.a aVar3, @NotNull C0645f.a aVar4, @NotNull C0586a c0586a) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(aVar, "governmentIdAnalyzeWorkerFactory");
        Intrinsics.checkNotNullParameter(bVar, "governmentIdHintWorkerFactory");
        Intrinsics.checkNotNullParameter(aVar2, "webRtcWorkerFactory");
        Intrinsics.checkNotNullParameter(aVar3, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(aVar4, "camera2ManagerFactoryFactory");
        Intrinsics.checkNotNullParameter(c0586a, "navigationStateManager");
        this.applicationContext = context;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.governmentIdAnalyzeWorkerFactory = aVar;
        this.governmentIdHintWorkerFactory = bVar;
        this.webRtcWorkerFactory = aVar2;
        this.cameraXControllerFactory = aVar3;
        this.camera2ManagerFactoryFactory = aVar4;
        this.navigationStateManager = c0586a;
    }

    public final void d(o.C0520a renderProps, GovernmentIdState renderState, ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a context, CaptureConfig captureConfig, C0327b videoCaptureHelper, CameraProperties cameraProperties, GovernmentId.GovernmentIdImage capturedId) throws P9.m {
        IdConfig idConfigC = com.withpersona.sdk2.inquiry.governmentid.c.c(captureConfig);
        if (videoCaptureHelper.c(renderProps) && idConfigC != null) {
            com.withpersona.sdk2.inquiry.governmentid.p.n(renderState, context, renderProps, capturedId, idConfigC, videoCaptureHelper, cameraProperties, (1536 & 128) != 0, (1536 & 256) != 0 ? renderState.k() : null, (1536 & 512) != 0 ? renderState.getPartIndex() : 0, (1536 & 1024) != 0 ? null : null);
            return;
        }
        if (renderProps.getShouldSkipReviewScreen() && idConfigC != null) {
            com.withpersona.sdk2.inquiry.governmentid.p.n(renderState, context, renderProps, capturedId, idConfigC, videoCaptureHelper, cameraProperties, (1536 & 128) != 0, (1536 & 256) != 0 ? renderState.k() : null, (1536 & 512) != 0 ? renderState.getPartIndex() : 0, (1536 & 1024) != 0 ? null : null);
            return;
        }
        IdPart currentPart = renderState.getCurrentPart();
        IdPart.SideIdPart sideIdPart = currentPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart : null;
        if (sideIdPart == null) {
            return;
        }
        context.b().d(C0562B.c(null, new C0301a(renderState, captureConfig, capturedId, new GovernmentIdState.WaitForAutocapture(sideIdPart, renderState.l(), captureConfig, com.withpersona.sdk2.inquiry.governmentid.p.i(renderProps, sideIdPart.getSide()), renderState.k(), renderState.getPartIndex(), renderState.getBackState(), EnumC0329d.i, renderProps.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, null, new b(context, videoCaptureHelper), 7680, null), cameraProperties), 1, null));
    }

    private final void g(o.C0520a renderProps, GovernmentIdState.WaitForAutocapture renderState, ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a context, a webRtcManager) {
        w.l(context, this.webRtcWorkerFactory.a(renderProps.getVideoCaptureConfig().getWebRtcJwt()), z.j(C0896b.class), "", new s(webRtcManager, renderState, renderProps, context));
    }

    @NotNull
    public final Object e(@NotNull o.C0520a renderProps, @NotNull GovernmentIdState.CountdownToCapture renderState, @NotNull ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a context, @NotNull C0327b videoCaptureHelper, @NotNull InterfaceC0570h<? super o.AbstractC0521b> sink) throws P9.m {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        IdConfig.IdSideConfig idSideConfigD = com.withpersona.sdk2.inquiry.governmentid.c.d(renderState.getCaptureConfig(), renderState.getCurrentPart().getSide());
        w.l(context, this.governmentIdHintWorkerFactory.a(renderState.getCurrentPart().getSide()), z.j(GovernmentIdHintWorker.class), "", c.d);
        String strE = com.withpersona.sdk2.inquiry.governmentid.p.e(renderProps.getStrings(), renderState.getCurrentPart().getSide(), com.withpersona.sdk2.inquiry.governmentid.c.b(renderState.getCaptureConfig()));
        String capturing = renderProps.getStrings().getCapturing();
        IdConfig.b side = renderState.getCurrentPart().getSide();
        Screen.b.a aVar = Screen.b.a.d;
        Screen.Overlay overlay = idSideConfigD.getOverlay();
        bb.b bVarA = com.withpersona.sdk2.inquiry.governmentid.c.a(renderState.getCaptureConfig());
        NavigationState navigationStateB = this.navigationStateManager.b();
        List<AutoCaptureRule> listA = idSideConfigD.getAutoCaptureConfig().getRuleSet().a();
        int partIndex = renderState.getPartIndex();
        int imageCaptureCount = renderProps.getImageCaptureCount() - 1;
        Function1<Throwable, Unit> function1D = com.withpersona.sdk2.inquiry.governmentid.p.d(context);
        EnumC0732a enumC0732aE = videoCaptureHelper.e(renderProps);
        String strK = com.withpersona.sdk2.inquiry.governmentid.p.k(renderProps.getStrings(), renderState.getHint());
        a webRtcManager = videoCaptureHelper.getWebRtcManager();
        return new AlertContainerScreen(com.withpersona.sdk2.inquiry.permissions.d.c(com.withpersona.sdk2.inquiry.governmentid.m.a(renderProps, strE, capturing, aVar, overlay, bVarA, side, navigationStateB, (805437440 & 256) != 0 ? m.a.d : null, new d(sink), new e(context, videoCaptureHelper), true, listA, renderState, partIndex, this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, (131072 & 805437440) != 0 ? m.b.d : new f(renderState, this, renderProps, context, videoCaptureHelper), (262144 & 805437440) != 0 ? m.c.d : new g(context, renderState, renderProps, videoCaptureHelper), function1D, (1048576 & 805437440) != 0 ? EnumC0732a.i : enumC0732aE, (2097152 & 805437440) != 0, (4194304 & 805437440) != 0 ? false : false, (8388608 & 805437440) != 0 ? false : false, (16777216 & 805437440) != 0 ? m.d.d : null, (33554432 & 805437440) != 0 ? m.e.d : null, new h(context, renderProps, videoCaptureHelper), (134217728 & 805437440) != 0 ? renderProps.getImageCaptureCount() : imageCaptureCount, (268435456 & 805437440) != 0 ? null : strK, (536870912 & 805437440) != 0 ? null : null, (805437440 & 1073741824) != 0 ? null : webRtcManager)), null, 2, null);
    }

    @NotNull
    public final Object f(@NotNull o.C0520a renderProps, @NotNull GovernmentIdState.WaitForAutocapture renderState, @NotNull ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a context, @NotNull C0327b videoCaptureHelper, @NotNull InterfaceC0570h<? super o.AbstractC0521b> sink) throws P9.m {
        i<Object, Object> iVarC;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        CaptureConfig captureConfig = renderState.getCaptureConfig();
        IdConfig.IdSideConfig idSideConfigD = com.withpersona.sdk2.inquiry.governmentid.c.d(captureConfig, renderState.getCurrentPart().getSide());
        String strB = com.withpersona.sdk2.inquiry.governmentid.c.b(captureConfig);
        boolean z = captureConfig instanceof CaptureConfig.AutoClassifyConfig;
        w.l(context, this.governmentIdAnalyzeWorkerFactory.a(renderState.getCurrentPart().getSide(), strB), z.j(GovernmentIdAnalyzeWorker.class), "", new o(renderState, captureConfig));
        w.l(context, this.governmentIdHintWorkerFactory.a(renderState.getCurrentPart().getSide()), z.j(GovernmentIdHintWorker.class), "", j.d);
        EnumC0732a enumC0732aE = videoCaptureHelper.e(renderProps);
        EnumC0732a enumC0732a = EnumC0732a.d;
        boolean z2 = enumC0732aE == enumC0732a && !videoCaptureHelper.d();
        if (idSideConfigD.getManualCaptureConfig().getIsEnabled() && !z2) {
            w.l(context, o.Companion.b(ka.o.INSTANCE, kotlin.ranges.b.d(idSideConfigD.getManualCaptureConfig().getDelayMs(), 0L), null, 2, null), z.k(ka.o.class, KTypeProjection.c.a(z.j(Unit.class))), idSideConfigD.getSideKey(), new k(renderState));
        }
        ArrayList arrayList = new ArrayList();
        if (renderState.getError() != null) {
            Map mapF = F.f(t.a(AlertScreen.a.POSITIVE, this.applicationContext.getString(android.R.string.ok)));
            String string = this.applicationContext.getString(S8.e.k);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            arrayList.add(new AlertScreen(mapF, string, null, false, new l(context), 12, null));
        }
        String strE = com.withpersona.sdk2.inquiry.governmentid.p.e(renderProps.getStrings(), renderState.getCurrentPart().getSide(), strB);
        String strJ = com.withpersona.sdk2.inquiry.governmentid.p.j(renderProps.getStrings(), renderState.getCurrentPart().getSide(), strB, z);
        IdConfig.b side = renderState.getCurrentPart().getSide();
        Screen.b.a manualCapture = renderState.getManualCapture();
        Screen.Overlay overlay = idSideConfigD.getOverlay();
        bb.b bVarA = com.withpersona.sdk2.inquiry.governmentid.c.a(captureConfig);
        NavigationState navigationStateB = this.navigationStateManager.b();
        List<AutoCaptureRule> listA = idSideConfigD.getAutoCaptureConfig().getRuleSet().a();
        int partIndex = renderState.getPartIndex();
        Function1<Throwable, Unit> function1D = com.withpersona.sdk2.inquiry.governmentid.p.d(context);
        EnumC0732a enumC0732aE2 = videoCaptureHelper.e(renderProps);
        String strK = com.withpersona.sdk2.inquiry.governmentid.p.k(renderProps.getStrings(), renderState.getHint());
        CaptureTipsViewModel captureTipsViewModelF = com.withpersona.sdk2.inquiry.governmentid.p.f(renderProps, renderState.getCurrentPart().getSide());
        a webRtcManager = videoCaptureHelper.getWebRtcManager();
        Screen.b bVarA2 = com.withpersona.sdk2.inquiry.governmentid.m.a(renderProps, strE, strJ, manualCapture, overlay, bVarA, side, navigationStateB, (805437440 & 256) != 0 ? m.a.d : new m(renderState, captureConfig, this, renderProps, context, videoCaptureHelper), new n(sink), new C0873o(context, videoCaptureHelper), false, listA, renderState, partIndex, this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, (131072 & 805437440) != 0 ? m.b.d : null, (262144 & 805437440) != 0 ? m.c.d : new p(context), function1D, (1048576 & 805437440) != 0 ? EnumC0732a.i : enumC0732aE2, (2097152 & 805437440) != 0, (4194304 & 805437440) != 0 ? false : false, (8388608 & 805437440) != 0 ? false : false, (16777216 & 805437440) != 0 ? m.d.d : null, (33554432 & 805437440) != 0 ? m.e.d : new q(context, renderState), new r(context, renderProps, videoCaptureHelper), (134217728 & 805437440) != 0 ? renderProps.getImageCaptureCount() : 0, (268435456 & 805437440) != 0 ? null : strK, (536870912 & 805437440) != 0 ? null : captureTipsViewModelF, (805437440 & 1073741824) != 0 ? null : webRtcManager);
        if (renderState.getCheckCameraPermissions()) {
            iVarC = com.withpersona.sdk2.inquiry.governmentid.p.s(bVarA2, this.applicationContext, context, renderProps, true, this.permissionRequestWorkflow);
        } else if (renderState.getCheckAudioPermissions() && videoCaptureHelper.c(renderProps) && C0456d.f(this.applicationContext) && renderProps.getVideoCaptureConfig().getRecordAudio()) {
            iVarC = com.withpersona.sdk2.inquiry.governmentid.p.r(bVarA2, this.applicationContext, context, renderProps, true, this.permissionRequestWorkflow);
        } else if (videoCaptureHelper.e(renderProps) == enumC0732a && renderState.getWebRtcState() == EnumC0329d.i) {
            g(renderProps, renderState, context, videoCaptureHelper.getWebRtcManager());
            iVarC = com.withpersona.sdk2.inquiry.permissions.d.c(bVarA2);
        } else {
            iVarC = com.withpersona.sdk2.inquiry.permissions.d.c(bVarA2);
        }
        return new AlertContainerScreen(iVarC, arrayList);
    }
}
