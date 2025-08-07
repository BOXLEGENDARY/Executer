package com.withpersona.sdk2.inquiry.governmentid;

import P9.C0872a;
import android.content.Context;
import android.os.Parcel;
import bb.c;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.governmentid.digitalId.DigitalIdConfig;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.o;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import ha.AbstractC0559i;
import ha.C0326a;
import ha.C0327b;
import ha.C0328c;
import ha.C0397t;
import ha.C0456d;
import ha.C0553c;
import ha.C0586a;
import ha.EnumC0329d;
import ha.InterfaceC0455c;
import ha.InterfaceC0558h;
import ha.InterfaceC0883h;
import ha.L;
import j9.C0606i;
import j9.EnumC0605h;
import java.util.List;
import java.util.Map;
import k8.AlertContainerScreen;
import ka.InterfaceC0570h;
import ka.Snapshot;
import ka.k;
import ka.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o8.InterfaceC0723a;
import org.jetbrains.annotations.NotNull;
import u5.C0623j;
import v8.C0826G;
import v8.ChooseCaptureMethodView;
import v8.ReviewSelectedImageView;
import w8.C0855a;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0006:\u0002TVBi\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#JC\u0010(\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00032\"\u0010'\u001a\u001e0&R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b(\u0010)J;\u0010+\u001a\u00020!2\"\u0010'\u001a\u001e0&R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010*\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010,J-\u00100\u001a\u00020!2\u001c\u0010/\u001a\u00180-R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040.H\u0002¢\u0006\u0004\b0\u00101J\u001b\u00103\u001a\u000202*\u00020\u00052\u0006\u0010%\u001a\u00020\u0003H\u0002¢\u0006\u0004\b3\u00104J!\u00108\u001a\b\u0012\u0004\u0012\u00020\u000507*\u00020\u00052\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b8\u00109J\u0013\u0010;\u001a\u00020:*\u00020\u0003H\u0002¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u0004\u0018\u000105*\u00020\u0003H\u0002¢\u0006\u0004\b=\u0010>J#\u0010C\u001a\u000205*\u00020?2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u000205H\u0002¢\u0006\u0004\bC\u0010DJ#\u0010E\u001a\u000205*\u00020?2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u000205H\u0002¢\u0006\u0004\bE\u0010DJ#\u0010F\u001a\u000205*\u00020?2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u000205H\u0002¢\u0006\u0004\bF\u0010DJ\u001b\u0010G\u001a\u000205*\u00020?2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bG\u0010HJ\u001b\u0010I\u001a\u000205*\u00020?2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bI\u0010HJ!\u0010M\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u00022\b\u0010L\u001a\u0004\u0018\u00010KH\u0016¢\u0006\u0004\bM\u0010NJC\u0010O\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00032\"\u0010'\u001a\u001e0&R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\bO\u0010)J\u0017\u0010Q\u001a\u00020K2\u0006\u0010P\u001a\u00020\u0003H\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020!H\u0016¢\u0006\u0004\bS\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010n¨\u0006p"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/o;", "Lf8/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "La9/c;", "Landroid/content/Context;", "applicationContext", "Lz1/h;", "imageLoader", "LB8/c$a;", "submitVerificationWorkerFactory", "LL8/t;", "documentSelectWorker", "LC8/a;", "localVideoCaptureRenderer", "LC8/c;", "webRtcRenderer", "Lx8/a;", "captureRenderer", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "autoClassifyWorkerFactory", "Lw8/a;", "autoClassificationRenderer", "Lo8/a;", "cameraStatsManager", "Lh9/a;", "navigationStateManager", "Le9/c;", "externalEventLogger", "<init>", "(Landroid/content/Context;Lz1/h;LB8/c$a;LL8/t;LC8/a;LC8/c;Lx8/a;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;Lw8/a;Lo8/a;Lh9/a;Le9/c;)V", "", "x", "()V", "renderProps", "renderState", "Lf8/k$a;", "context", "z", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lf8/k$a;)Ljava/lang/Object;", "output", "E", "(Lf8/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/o$b;)V", "Lf8/r$c;", "Lf8/r;", "updater", "F", "(Lf8/r$c;)V", "Lj9/i;", "I", "(Ljava/lang/Object;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lj9/i;", "", "name", "Lcom/squareup/workflow1/ui/m;", "w", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/squareup/workflow1/ui/m;", "", "H", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Z", "u", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "selectedId", "q", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a$a;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;)Ljava/lang/String;", "p", "r", "t", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a$a;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Ljava/lang/String;", "s", "props", "Lf8/i;", "snapshot", "v", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a;Lf8/i;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "y", "state", "G", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lf8/i;", "close", "a", "Landroid/content/Context;", "b", "Lz1/h;", "c", "LB8/c$a;", "d", "LL8/t;", "e", "LC8/a;", "f", "LC8/c;", "g", "Lx8/a;", "h", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "i", "Lw8/a;", "j", "Lo8/a;", "k", "Lh9/a;", "l", "Le9/c;", "LC8/b;", "m", "LC8/b;", "videoCaptureHelper", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class o extends ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object> implements InterfaceC0455c {

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final InterfaceC0883h imageLoader;

    @NotNull
    private final c.a submitVerificationWorkerFactory;

    @NotNull
    private final C0397t documentSelectWorker;

    @NotNull
    private final C0326a localVideoCaptureRenderer;

    @NotNull
    private final C0328c webRtcRenderer;

    @NotNull
    private final C0872a captureRenderer;

    @NotNull
    private final AutoClassifyWorker.b autoClassifyWorkerFactory;

    @NotNull
    private final C0855a autoClassificationRenderer;

    @NotNull
    private final InterfaceC0723a cameraStatsManager;

    @NotNull
    private final C0586a navigationStateManager;

    @NotNull
    private final C0553c externalEventLogger;

    @NotNull
    private final C0327b videoCaptureHelper;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class A extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a d;
        final o e;
        final GovernmentIdState i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c, Unit> {
            final o d;
            final GovernmentIdState e;

            a(o oVar, GovernmentIdState governmentIdState) {
                super(1);
                this.d = oVar;
                this.e = governmentIdState;
            }

            public final void a(@NotNull ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                this.d.documentSelectWorker.d();
                cVar.e(GovernmentIdState.ChooseCaptureMethod.p((GovernmentIdState.ChooseCaptureMethod) this.e, null, null, null, 0, null, true, null, null, 223, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        A(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, o oVar, GovernmentIdState governmentIdState) {
            super(0);
            this.d = aVar;
            this.e = oVar;
            this.i = governmentIdState;
        }

        public Object invoke() {
            m59invoke();
            return Unit.a;
        }

        public final void m59invoke() {
            InterfaceC0570h<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>> interfaceC0570hB = this.d.b();
            o oVar = this.e;
            interfaceC0570hB.d(ka.z.d(oVar, null, new a(oVar, this.i), 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class B extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a d;
        final o e;

        B(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, o oVar) {
            super(0);
            this.d = aVar;
            this.e = oVar;
        }

        public Object invoke() {
            m60invoke();
            return Unit.a;
        }

        public final void m60invoke() {
            com.withpersona.sdk2.inquiry.governmentid.p.l(this.d, this.e.videoCaptureHelper);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C extends kotlin.jvm.internal.l implements Function1<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c, Unit> {
        final GovernmentIdState d;
        final GovernmentId.GovernmentIdImage e;
        final String i;

        C(GovernmentIdState governmentIdState, GovernmentId.GovernmentIdImage governmentIdImage, String str) {
            super(1);
            this.d = governmentIdState;
            this.e = governmentIdImage;
            this.i = str;
        }

        public final void a(@NotNull ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            GovernmentIdState governmentIdStateC = cVar.c();
            GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = governmentIdStateC instanceof GovernmentIdState.ChooseCaptureMethod ? (GovernmentIdState.ChooseCaptureMethod) governmentIdStateC : null;
            if (chooseCaptureMethod == null) {
                return;
            }
            cVar.e(new GovernmentIdState.ReviewSelectedImage(((GovernmentIdState.ChooseCaptureMethod) this.d).getCurrentPart(), this.d.l(), ((GovernmentIdState.ChooseCaptureMethod) this.d).getCaptureConfig(), this.e, this.i, chooseCaptureMethod.k(), chooseCaptureMethod.getPartIndex(), com.withpersona.sdk2.inquiry.governmentid.p.c(cVar, false, 1, null), null, null, false, 1792, null));
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class D extends kotlin.jvm.internal.l implements Function1<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c, Unit> {
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a e;
        final AbstractC0521b i;

        D(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, AbstractC0521b abstractC0521b) {
            super(1);
            this.e = aVar;
            this.i = abstractC0521b;
        }

        public final void a(@NotNull ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            o.this.E(this.e, this.i);
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\u0018\u00002\u00020\u0001:\u0001+BÛ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u0010.R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b7\u0010.R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b9\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b3\u0010:\u001a\u0004\b1\u0010;R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b<\u0010:\u001a\u0004\b5\u0010;R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00058\u0006¢\u0006\f\n\u0004\b=\u00102\u001a\u0004\b8\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b9\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b7\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010,\u001a\u0004\b<\u0010.R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b=\u0010.R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bH\u0010JR\u0017\u0010\u001a\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bK\u0010:\u001a\u0004\bL\u0010;R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b-\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bL\u0010T\u001a\u0004\b+\u0010UR\u0017\u0010 \u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bB\u0010:\u001a\u0004\bV\u0010;R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b?\u0010W\u001a\u0004\b/\u0010XR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bR\u0010Y\u001a\u0004\bM\u0010ZR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\bV\u0010[\u001a\u0004\bK\u0010\\R\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0011\u0010a\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bD\u0010;¨\u0006b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "", "", "sessionToken", "countryCode", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "enabledIdClasses", "inquiryId", "fromStep", "fromComponent", "", "backStepEnabled", "cancelButtonEnabled", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "enabledCaptureOptionsNativeMobile", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a$a;", "strings", "", "imageCaptureCount", "fieldKeyDocument", "fieldKeyIdClass", "", "manualCaptureButtonDelayMs", "shouldSkipReviewScreen", "theme", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "videoCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "assetConfig", "isEnabled", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "autoClassificationConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "reviewCaptureButtonsAxis", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "digitalIdConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/governmentid/o$a$a;ILjava/lang/String;Ljava/lang/String;JZLjava/lang/Integer;Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;ZLcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;)V", "a", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "b", "e", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", "d", "n", "k", "f", "j", "Z", "()Z", "h", "i", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "u", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a$a;", "t", "()Lcom/withpersona/sdk2/inquiry/governmentid/o$a$a;", "l", "I", "m", "()I", "o", "J", "()J", "p", "s", "q", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "v", "()Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "w", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "x", "Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "getDigitalIdConfig", "()Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "hasMultipleCaptureOptions", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class C0520a {

        @NotNull
        private final String sessionToken;

        @NotNull
        private final String countryCode;

        @NotNull
        private final List<IdConfig> enabledIdClasses;

        @NotNull
        private final String inquiryId;

        @NotNull
        private final String fromStep;

        @NotNull
        private final String fromComponent;

        private final boolean backStepEnabled;

        private final boolean cancelButtonEnabled;

        @NotNull
        private final List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile;

        private final StepStyles.GovernmentIdStepStyle styles;

        @NotNull
        private final C0112a strings;

        private final int imageCaptureCount;

        @NotNull
        private final String fieldKeyDocument;

        @NotNull
        private final String fieldKeyIdClass;

        private final long manualCaptureButtonDelayMs;

        private final boolean shouldSkipReviewScreen;

        private final Integer theme;

        @NotNull
        private final VideoCaptureConfig videoCaptureConfig;

        @NotNull
        private final NextStep.GovernmentId.AssetConfig assetConfig;

        private final boolean isEnabled;

        @NotNull
        private final AutoClassificationConfig autoClassificationConfig;

        @NotNull
        private final StyleElements.Axis reviewCaptureButtonsAxis;

        @NotNull
        private final PendingPageTextPosition pendingPageTextVerticalPosition;

        private final DigitalIdConfig digitalIdConfig;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\bb\u0018\u00002\u00020\u0001Bë\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\b\u00100\u001a\u0004\u0018\u00010\u0002\u0012\b\u00101\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u00010\u0002\u0012\b\u00103\u001a\u0004\u0018\u00010\u0002\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\b\u00105\u001a\u0004\u0018\u00010\u0002\u0012\b\u00106\u001a\u0004\u0018\u00010\u0002\u0012\b\u00107\u001a\u0004\u0018\u00010\u0002\u0012\b\u00108\u001a\u0004\u0018\u00010\u0002\u0012\b\u00109\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010AR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010?\u001a\u0004\bG\u0010AR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\bM\u0010KR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u0010?\u001a\u0004\bO\u0010AR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\bP\u0010I\u001a\u0004\bQ\u0010KR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bR\u0010?\u001a\u0004\bS\u0010AR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u0010?\u001a\u0004\bN\u0010AR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u0010?\u001a\u0004\bL\u0010AR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\bS\u0010I\u001a\u0004\bV\u0010KR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010?\u001a\u0004\bW\u0010AR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010?\u001a\u0004\bX\u0010AR#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\bE\u0010I\u001a\u0004\bY\u0010KR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\bZ\u0010I\u001a\u0004\b[\u0010KR#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\\\u0010I\u001a\u0004\bZ\u0010KR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b[\u0010?\u001a\u0004\b\\\u0010AR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u0010?\u001a\u0004\b]\u0010AR#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\bQ\u0010I\u001a\u0004\b^\u0010KR#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\bV\u0010I\u001a\u0004\b_\u0010KR\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b`\u0010?\u001a\u0004\ba\u0010AR\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bb\u0010?\u001a\u0004\bc\u0010AR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bd\u0010?\u001a\u0004\bU\u0010AR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\be\u0010?\u001a\u0004\bT\u0010AR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bf\u0010?\u001a\u0004\bP\u0010AR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bg\u0010?\u001a\u0004\bR\u0010AR\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bh\u0010?\u001a\u0004\bi\u0010AR\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bj\u0010?\u001a\u0004\bk\u0010AR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bl\u0010?\u001a\u0004\bm\u0010AR\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bn\u0010?\u001a\u0004\bo\u0010AR\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bp\u0010?\u001a\u0004\bd\u0010AR\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bY\u0010?\u001a\u0004\be\u0010AR\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bq\u0010?\u001a\u0004\bb\u0010AR\u0019\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\br\u0010?\u001a\u0004\bH\u0010AR\u0019\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bs\u0010?\u001a\u0004\bF\u0010AR\u0019\u0010)\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bt\u0010?\u001a\u0004\bD\u0010AR\u0019\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u0010?\u001a\u0004\bB\u0010AR\u0019\u0010+\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bu\u0010?\u001a\u0004\bt\u0010AR\u0019\u0010,\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bv\u0010?\u001a\u0004\bs\u0010AR\u0019\u0010-\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bm\u0010?\u001a\u0004\br\u0010AR\u0019\u0010.\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bo\u0010?\u001a\u0004\bq\u0010AR\u0019\u0010/\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bk\u0010?\u001a\u0004\bj\u0010AR\u0019\u00100\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bi\u0010?\u001a\u0004\bh\u0010AR\u0019\u00101\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bX\u0010?\u001a\u0004\bg\u0010AR\u0019\u00102\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bW\u0010?\u001a\u0004\bf\u0010AR\u0019\u00103\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\bw\u0010AR\u0019\u00104\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b_\u0010?\u001a\u0004\bx\u0010AR\u0019\u00105\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bc\u0010?\u001a\u0004\bp\u0010AR\u0019\u00106\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\ba\u0010?\u001a\u0004\bn\u0010AR\u0019\u00107\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b^\u0010?\u001a\u0004\b`\u0010AR\u0019\u00108\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bM\u0010?\u001a\u0004\bl\u0010AR\u0019\u00109\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u0010?\u001a\u0004\bv\u0010AR\u0019\u0010:\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bx\u0010?\u001a\u0004\bu\u0010AR\u0019\u0010;\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bw\u0010?\u001a\u0004\b>\u0010A¨\u0006y"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/o$a$a;", "", "", Title.type, "prompt", "choose", "instructionsDisclaimer", "", "captureScreenTitle", "scanInstructions", "capturing", "confirmCapture", "captureDisclaimer", "buttonSubmit", "buttonRetake", "confirmCaptureTitle", "processingTitle", "processingDescription", "idClassToName", "chooseCaptureMethodTitle", "chooseCaptureMethodBody", "chooseCaptureMethodCameraButton", "chooseCaptureMethodUploadButton", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "reviewSelectedImageTitle", "reviewSelectedImageBody", "reviewSelectedImageConfirmButton", "reviewSelectedImageChooseAnotherButton", "cameraPermissionsTitle", "cameraPermissionsPrompt", "cameraPermissionsAllowButtonText", "cameraPermissionsCancelButtonText", "microphonePermissionsTitle", "microphonePermissionsPrompt", "microphonePermissionsAllowButtonText", "microphonePermissionsCancelButtonText", "hintHoldStill", "hintLowLight", "helpButtonText", "barcodeHelpModalTitle", "barcodeHelpModalPrompt", "barcodeHelpModalHints", "barcodeHelpModalContinueButtonText", "idFrontHelpModalTitle", "idFrontHelpModalPrompt", "idFrontHelpModalHints", "idFrontHelpModalContinueButtonText", "idBackHelpModalTitle", "idBackHelpModalPrompt", "idBackHelpModalHints", "idBackHelpModalContinueButtonText", "unableToClassifyDocumentTitle", "unableToClassifyDocumentContinueButtonText", "idClassRejectedTitle", "idClassRejectedContinueButtonText", "countryInputTitle", "idClassInputTitle", "manualClassificationTitle", "manualClassificationContinueButtonText", "autoClassificationCaptureTipText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "a0", "()Ljava/lang/String;", "b", "U", "c", "o", "d", "L", "e", "Ljava/util/Map;", "m", "()Ljava/util/Map;", "f", "Z", "g", "n", "h", "t", "i", "l", "j", "k", "u", "T", "S", "G", "p", "r", "q", "s", "Y", "V", "v", "X", "w", "W", "x", "y", "z", "A", "B", "R", "C", "Q", "D", "O", "E", "P", "F", "H", "I", "J", "K", "M", "N", "c0", "b0", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0112a {

            private final String cameraPermissionsCancelButtonText;

            private final String microphonePermissionsTitle;

            private final String microphonePermissionsPrompt;

            private final String microphonePermissionsAllowButtonText;

            private final String microphonePermissionsCancelButtonText;

            private final String hintHoldStill;

            private final String hintLowLight;

            private final String helpButtonText;

            private final String barcodeHelpModalTitle;

            private final String barcodeHelpModalPrompt;

            private final String barcodeHelpModalHints;

            private final String barcodeHelpModalContinueButtonText;

            private final String idFrontHelpModalTitle;

            private final String idFrontHelpModalPrompt;

            private final String idFrontHelpModalHints;

            private final String idFrontHelpModalContinueButtonText;

            private final String idBackHelpModalTitle;

            private final String idBackHelpModalPrompt;

            private final String idBackHelpModalHints;

            private final String idBackHelpModalContinueButtonText;

            private final String unableToClassifyDocumentTitle;

            private final String unableToClassifyDocumentContinueButtonText;

            private final String idClassRejectedTitle;

            private final String idClassRejectedContinueButtonText;

            private final String countryInputTitle;

            private final String idClassInputTitle;

            @NotNull
            private final String title;

            private final String manualClassificationTitle;

            @NotNull
            private final String prompt;

            private final String manualClassificationContinueButtonText;

            @NotNull
            private final String choose;

            private final String autoClassificationCaptureTipText;

            @NotNull
            private final String instructionsDisclaimer;

            @NotNull
            private final Map<String, String> captureScreenTitle;

            @NotNull
            private final Map<String, String> scanInstructions;

            @NotNull
            private final String capturing;

            @NotNull
            private final Map<String, String> confirmCapture;

            @NotNull
            private final String captureDisclaimer;

            @NotNull
            private final String buttonSubmit;

            @NotNull
            private final String buttonRetake;

            @NotNull
            private final Map<String, String> confirmCaptureTitle;

            @NotNull
            private final String processingTitle;

            @NotNull
            private final String processingDescription;

            @NotNull
            private final Map<String, String> idClassToName;

            @NotNull
            private final Map<String, String> chooseCaptureMethodTitle;

            @NotNull
            private final Map<String, String> chooseCaptureMethodBody;

            @NotNull
            private final String chooseCaptureMethodCameraButton;

            @NotNull
            private final String chooseCaptureMethodUploadButton;

            @NotNull
            private final Map<IdConfig.b, String> reviewSelectedImageTitle;

            @NotNull
            private final Map<IdConfig.b, String> reviewSelectedImageBody;

            @NotNull
            private final String reviewSelectedImageConfirmButton;

            @NotNull
            private final String reviewSelectedImageChooseAnotherButton;

            private final String cameraPermissionsTitle;

            private final String cameraPermissionsPrompt;

            private final String cameraPermissionsAllowButtonText;

            public C0112a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Map<String, String> map, @NotNull Map<String, String> map2, @NotNull String str5, @NotNull Map<String, String> map3, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull Map<String, String> map4, @NotNull String str9, @NotNull String str10, @NotNull Map<String, String> map5, @NotNull Map<String, String> map6, @NotNull Map<String, String> map7, @NotNull String str11, @NotNull String str12, @NotNull Map<IdConfig.b, String> map8, @NotNull Map<IdConfig.b, String> map9, @NotNull String str13, @NotNull String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46) {
                Intrinsics.checkNotNullParameter(str, Title.type);
                Intrinsics.checkNotNullParameter(str2, "prompt");
                Intrinsics.checkNotNullParameter(str3, "choose");
                Intrinsics.checkNotNullParameter(str4, "instructionsDisclaimer");
                Intrinsics.checkNotNullParameter(map, "captureScreenTitle");
                Intrinsics.checkNotNullParameter(map2, "scanInstructions");
                Intrinsics.checkNotNullParameter(str5, "capturing");
                Intrinsics.checkNotNullParameter(map3, "confirmCapture");
                Intrinsics.checkNotNullParameter(str6, "captureDisclaimer");
                Intrinsics.checkNotNullParameter(str7, "buttonSubmit");
                Intrinsics.checkNotNullParameter(str8, "buttonRetake");
                Intrinsics.checkNotNullParameter(map4, "confirmCaptureTitle");
                Intrinsics.checkNotNullParameter(str9, "processingTitle");
                Intrinsics.checkNotNullParameter(str10, "processingDescription");
                Intrinsics.checkNotNullParameter(map5, "idClassToName");
                Intrinsics.checkNotNullParameter(map6, "chooseCaptureMethodTitle");
                Intrinsics.checkNotNullParameter(map7, "chooseCaptureMethodBody");
                Intrinsics.checkNotNullParameter(str11, "chooseCaptureMethodCameraButton");
                Intrinsics.checkNotNullParameter(str12, "chooseCaptureMethodUploadButton");
                Intrinsics.checkNotNullParameter(map8, "reviewSelectedImageTitle");
                Intrinsics.checkNotNullParameter(map9, "reviewSelectedImageBody");
                Intrinsics.checkNotNullParameter(str13, "reviewSelectedImageConfirmButton");
                Intrinsics.checkNotNullParameter(str14, "reviewSelectedImageChooseAnotherButton");
                this.title = str;
                this.prompt = str2;
                this.choose = str3;
                this.instructionsDisclaimer = str4;
                this.captureScreenTitle = map;
                this.scanInstructions = map2;
                this.capturing = str5;
                this.confirmCapture = map3;
                this.captureDisclaimer = str6;
                this.buttonSubmit = str7;
                this.buttonRetake = str8;
                this.confirmCaptureTitle = map4;
                this.processingTitle = str9;
                this.processingDescription = str10;
                this.idClassToName = map5;
                this.chooseCaptureMethodTitle = map6;
                this.chooseCaptureMethodBody = map7;
                this.chooseCaptureMethodCameraButton = str11;
                this.chooseCaptureMethodUploadButton = str12;
                this.reviewSelectedImageTitle = map8;
                this.reviewSelectedImageBody = map9;
                this.reviewSelectedImageConfirmButton = str13;
                this.reviewSelectedImageChooseAnotherButton = str14;
                this.cameraPermissionsTitle = str15;
                this.cameraPermissionsPrompt = str16;
                this.cameraPermissionsAllowButtonText = str17;
                this.cameraPermissionsCancelButtonText = str18;
                this.microphonePermissionsTitle = str19;
                this.microphonePermissionsPrompt = str20;
                this.microphonePermissionsAllowButtonText = str21;
                this.microphonePermissionsCancelButtonText = str22;
                this.hintHoldStill = str23;
                this.hintLowLight = str24;
                this.helpButtonText = str25;
                this.barcodeHelpModalTitle = str26;
                this.barcodeHelpModalPrompt = str27;
                this.barcodeHelpModalHints = str28;
                this.barcodeHelpModalContinueButtonText = str29;
                this.idFrontHelpModalTitle = str30;
                this.idFrontHelpModalPrompt = str31;
                this.idFrontHelpModalHints = str32;
                this.idFrontHelpModalContinueButtonText = str33;
                this.idBackHelpModalTitle = str34;
                this.idBackHelpModalPrompt = str35;
                this.idBackHelpModalHints = str36;
                this.idBackHelpModalContinueButtonText = str37;
                this.unableToClassifyDocumentTitle = str38;
                this.unableToClassifyDocumentContinueButtonText = str39;
                this.idClassRejectedTitle = str40;
                this.idClassRejectedContinueButtonText = str41;
                this.countryInputTitle = str42;
                this.idClassInputTitle = str43;
                this.manualClassificationTitle = str44;
                this.manualClassificationContinueButtonText = str45;
                this.autoClassificationCaptureTipText = str46;
            }

            public final String getIdBackHelpModalHints() {
                return this.idBackHelpModalHints;
            }

            public final String getIdBackHelpModalPrompt() {
                return this.idBackHelpModalPrompt;
            }

            public final String getIdBackHelpModalTitle() {
                return this.idBackHelpModalTitle;
            }

            public final String getIdClassInputTitle() {
                return this.idClassInputTitle;
            }

            public final String getIdClassRejectedContinueButtonText() {
                return this.idClassRejectedContinueButtonText;
            }

            public final String getIdClassRejectedTitle() {
                return this.idClassRejectedTitle;
            }

            @NotNull
            public final Map<String, String> G() {
                return this.idClassToName;
            }

            public final String getIdFrontHelpModalContinueButtonText() {
                return this.idFrontHelpModalContinueButtonText;
            }

            public final String getIdFrontHelpModalHints() {
                return this.idFrontHelpModalHints;
            }

            public final String getIdFrontHelpModalPrompt() {
                return this.idFrontHelpModalPrompt;
            }

            public final String getIdFrontHelpModalTitle() {
                return this.idFrontHelpModalTitle;
            }

            @NotNull
            public final String getInstructionsDisclaimer() {
                return this.instructionsDisclaimer;
            }

            public final String getManualClassificationContinueButtonText() {
                return this.manualClassificationContinueButtonText;
            }

            public final String getManualClassificationTitle() {
                return this.manualClassificationTitle;
            }

            public final String getMicrophonePermissionsAllowButtonText() {
                return this.microphonePermissionsAllowButtonText;
            }

            public final String getMicrophonePermissionsCancelButtonText() {
                return this.microphonePermissionsCancelButtonText;
            }

            public final String getMicrophonePermissionsPrompt() {
                return this.microphonePermissionsPrompt;
            }

            public final String getMicrophonePermissionsTitle() {
                return this.microphonePermissionsTitle;
            }

            @NotNull
            public final String getProcessingDescription() {
                return this.processingDescription;
            }

            @NotNull
            public final String getProcessingTitle() {
                return this.processingTitle;
            }

            @NotNull
            public final String getPrompt() {
                return this.prompt;
            }

            @NotNull
            public final Map<IdConfig.b, String> V() {
                return this.reviewSelectedImageBody;
            }

            @NotNull
            public final String getReviewSelectedImageChooseAnotherButton() {
                return this.reviewSelectedImageChooseAnotherButton;
            }

            @NotNull
            public final String getReviewSelectedImageConfirmButton() {
                return this.reviewSelectedImageConfirmButton;
            }

            @NotNull
            public final Map<IdConfig.b, String> Y() {
                return this.reviewSelectedImageTitle;
            }

            @NotNull
            public final Map<String, String> Z() {
                return this.scanInstructions;
            }

            public final String getAutoClassificationCaptureTipText() {
                return this.autoClassificationCaptureTipText;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public final String getBarcodeHelpModalContinueButtonText() {
                return this.barcodeHelpModalContinueButtonText;
            }

            public final String getUnableToClassifyDocumentContinueButtonText() {
                return this.unableToClassifyDocumentContinueButtonText;
            }

            public final String getBarcodeHelpModalHints() {
                return this.barcodeHelpModalHints;
            }

            public final String getUnableToClassifyDocumentTitle() {
                return this.unableToClassifyDocumentTitle;
            }

            public final String getBarcodeHelpModalPrompt() {
                return this.barcodeHelpModalPrompt;
            }

            public final String getBarcodeHelpModalTitle() {
                return this.barcodeHelpModalTitle;
            }

            @NotNull
            public final String getButtonRetake() {
                return this.buttonRetake;
            }

            @NotNull
            public final String getButtonSubmit() {
                return this.buttonSubmit;
            }

            public final String getCameraPermissionsAllowButtonText() {
                return this.cameraPermissionsAllowButtonText;
            }

            public final String getCameraPermissionsCancelButtonText() {
                return this.cameraPermissionsCancelButtonText;
            }

            public final String getCameraPermissionsPrompt() {
                return this.cameraPermissionsPrompt;
            }

            public final String getCameraPermissionsTitle() {
                return this.cameraPermissionsTitle;
            }

            @NotNull
            public final String getCaptureDisclaimer() {
                return this.captureDisclaimer;
            }

            @NotNull
            public final Map<String, String> m() {
                return this.captureScreenTitle;
            }

            @NotNull
            public final String getCapturing() {
                return this.capturing;
            }

            @NotNull
            public final String getChoose() {
                return this.choose;
            }

            @NotNull
            public final Map<String, String> p() {
                return this.chooseCaptureMethodBody;
            }

            @NotNull
            public final String getChooseCaptureMethodCameraButton() {
                return this.chooseCaptureMethodCameraButton;
            }

            @NotNull
            public final Map<String, String> r() {
                return this.chooseCaptureMethodTitle;
            }

            @NotNull
            public final String getChooseCaptureMethodUploadButton() {
                return this.chooseCaptureMethodUploadButton;
            }

            @NotNull
            public final Map<String, String> t() {
                return this.confirmCapture;
            }

            @NotNull
            public final Map<String, String> u() {
                return this.confirmCaptureTitle;
            }

            public final String getCountryInputTitle() {
                return this.countryInputTitle;
            }

            public final String getHelpButtonText() {
                return this.helpButtonText;
            }

            public final String getHintHoldStill() {
                return this.hintHoldStill;
            }

            public final String getHintLowLight() {
                return this.hintLowLight;
            }

            public final String getIdBackHelpModalContinueButtonText() {
                return this.idBackHelpModalContinueButtonText;
            }
        }

        public C0520a(@NotNull String str, @NotNull String str2, @NotNull List<IdConfig> list, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, boolean z2, @NotNull List<? extends CaptureOptionNativeMobile> list2, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @NotNull C0112a c0112a, int i, @NotNull String str6, @NotNull String str7, long j, boolean z3, Integer num, @NotNull VideoCaptureConfig videoCaptureConfig, @NotNull NextStep.GovernmentId.AssetConfig assetConfig, boolean z4, @NotNull AutoClassificationConfig autoClassificationConfig, @NotNull StyleElements.Axis axis, @NotNull PendingPageTextPosition pendingPageTextPosition, DigitalIdConfig digitalIdConfig) {
            Intrinsics.checkNotNullParameter(str, "sessionToken");
            Intrinsics.checkNotNullParameter(str2, "countryCode");
            Intrinsics.checkNotNullParameter(list, "enabledIdClasses");
            Intrinsics.checkNotNullParameter(str3, "inquiryId");
            Intrinsics.checkNotNullParameter(str4, "fromStep");
            Intrinsics.checkNotNullParameter(str5, "fromComponent");
            Intrinsics.checkNotNullParameter(list2, "enabledCaptureOptionsNativeMobile");
            Intrinsics.checkNotNullParameter(c0112a, "strings");
            Intrinsics.checkNotNullParameter(str6, "fieldKeyDocument");
            Intrinsics.checkNotNullParameter(str7, "fieldKeyIdClass");
            Intrinsics.checkNotNullParameter(videoCaptureConfig, "videoCaptureConfig");
            Intrinsics.checkNotNullParameter(assetConfig, "assetConfig");
            Intrinsics.checkNotNullParameter(autoClassificationConfig, "autoClassificationConfig");
            Intrinsics.checkNotNullParameter(axis, "reviewCaptureButtonsAxis");
            Intrinsics.checkNotNullParameter(pendingPageTextPosition, "pendingPageTextVerticalPosition");
            this.sessionToken = str;
            this.countryCode = str2;
            this.enabledIdClasses = list;
            this.inquiryId = str3;
            this.fromStep = str4;
            this.fromComponent = str5;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.enabledCaptureOptionsNativeMobile = list2;
            this.styles = governmentIdStepStyle;
            this.strings = c0112a;
            this.imageCaptureCount = i;
            this.fieldKeyDocument = str6;
            this.fieldKeyIdClass = str7;
            this.manualCaptureButtonDelayMs = j;
            this.shouldSkipReviewScreen = z3;
            this.theme = num;
            this.videoCaptureConfig = videoCaptureConfig;
            this.assetConfig = assetConfig;
            this.isEnabled = z4;
            this.autoClassificationConfig = autoClassificationConfig;
            this.reviewCaptureButtonsAxis = axis;
            this.pendingPageTextVerticalPosition = pendingPageTextPosition;
            this.digitalIdConfig = digitalIdConfig;
        }

        @NotNull
        public final NextStep.GovernmentId.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        @NotNull
        public final AutoClassificationConfig getAutoClassificationConfig() {
            return this.autoClassificationConfig;
        }

        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @NotNull
        public final String getCountryCode() {
            return this.countryCode;
        }

        @NotNull
        public final List<CaptureOptionNativeMobile> f() {
            return this.enabledCaptureOptionsNativeMobile;
        }

        @NotNull
        public final List<IdConfig> g() {
            return this.enabledIdClasses;
        }

        @NotNull
        public final String getFieldKeyDocument() {
            return this.fieldKeyDocument;
        }

        @NotNull
        public final String getFieldKeyIdClass() {
            return this.fieldKeyIdClass;
        }

        @NotNull
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        public final String getFromStep() {
            return this.fromStep;
        }

        public final boolean l() {
            return this.enabledCaptureOptionsNativeMobile.size() > 1;
        }

        public final int getImageCaptureCount() {
            return this.imageCaptureCount;
        }

        @NotNull
        public final String getInquiryId() {
            return this.inquiryId;
        }

        public final long getManualCaptureButtonDelayMs() {
            return this.manualCaptureButtonDelayMs;
        }

        @NotNull
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        @NotNull
        public final StyleElements.Axis getReviewCaptureButtonsAxis() {
            return this.reviewCaptureButtonsAxis;
        }

        @NotNull
        public final String getSessionToken() {
            return this.sessionToken;
        }

        public final boolean getShouldSkipReviewScreen() {
            return this.shouldSkipReviewScreen;
        }

        @NotNull
        public final C0112a getStrings() {
            return this.strings;
        }

        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        public final VideoCaptureConfig getVideoCaptureConfig() {
            return this.videoCaptureConfig;
        }

        public final boolean getIsEnabled() {
            return this.isEnabled;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b$d;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class AbstractC0521b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/o$b$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a extends AbstractC0521b {

            @NotNull
            public static final a a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1411335115;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/o$b$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0113b extends AbstractC0521b {

            @NotNull
            public static final C0113b a = new C0113b();

            private C0113b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0113b);
            }

            public int hashCode() {
                return 1649914237;
            }

            @NotNull
            public String toString() {
                return "Canceled";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/o$b$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class c extends AbstractC0521b {

            @NotNull
            private final InternalErrorInfo cause;

            public c(@NotNull InternalErrorInfo internalErrorInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(internalErrorInfo, "cause");
                this.cause = internalErrorInfo;
            }

            @NotNull
            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/o$b$d;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class d extends AbstractC0521b {

            @NotNull
            public static final d a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 1099427158;
            }

            @NotNull
            public String toString() {
                return "Finished";
            }
        }

        public AbstractC0521b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0521b() {
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class C0522c {
        public static final int[] a;

        static {
            int[] iArr = new int[IdConfig.b.values().length];
            try {
                iArr[IdConfig.b.v.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.b.w.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdConfig.b.y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdConfig.b.z.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdConfig.b.A.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$render$2", f = "GovernmentIdWorkflow.kt", l = {136}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0523d extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;

        C0523d(Continuation<? super C0523d> continuation) {
            super(2, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return o.this.new C0523d(continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                P9.p.b(obj);
                C0623j c0623j = C0623j.a;
                Context context = o.this.applicationContext;
                this.d = 1;
                if (c0623j.a(context, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P9.p.b(obj);
            }
            o.this.videoCaptureHelper.a();
            return Unit.a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$render$3", f = "GovernmentIdWorkflow.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class e extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a e;
        final o i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c, Unit> {
            final o d;

            a(o oVar) {
                super(1);
                this.d = oVar;
            }

            public final void a(@NotNull ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                this.d.F(cVar);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        e(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, o oVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.e = aVar;
            this.i = oVar;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.e, this.i, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            S9.b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P9.p.b(obj);
            InterfaceC0570h<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>> interfaceC0570hB = this.e.b();
            o oVar = this.i;
            interfaceC0570hB.d(ka.z.d(oVar, null, new a(oVar), 1, null));
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a d;

        f(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar) {
            super(0);
            this.d = aVar;
        }

        public Object invoke() {
            m61invoke();
            return Unit.a;
        }

        public final void m61invoke() {
            com.withpersona.sdk2.inquiry.governmentid.p.a(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a d;
        final o e;
        final GovernmentIdState i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c, Unit> {
            final GovernmentIdState d;

            a(GovernmentIdState governmentIdState) {
                super(1);
                this.d = governmentIdState;
            }

            public final void a(@NotNull ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(GovernmentIdState.ChooseCaptureMethod.p((GovernmentIdState.ChooseCaptureMethod) this.d, null, null, null, 0, null, false, null, null, 127, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        g(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, o oVar, GovernmentIdState governmentIdState) {
            super(0);
            this.d = aVar;
            this.e = oVar;
            this.i = governmentIdState;
        }

        public Object invoke() {
            m62invoke();
            return Unit.a;
        }

        public final void m62invoke() {
            this.d.b().d(ka.z.d(this.e, null, new a(this.i), 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class i extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a d;
        final o e;
        final GovernmentIdState i;
        final CaptureConfig v;
        final C0520a w;

        i(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, o oVar, GovernmentIdState governmentIdState, CaptureConfig captureConfig, C0520a c0520a) {
            super(0);
            this.d = aVar;
            this.e = oVar;
            this.i = governmentIdState;
            this.v = captureConfig;
            this.w = c0520a;
        }

        public final void m64invoke() {
            InterfaceC0570h<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>> interfaceC0570hB = this.d.b();
            o oVar = this.e;
            interfaceC0570hB.d(ka.z.d(oVar, null, new a(this.i, this.v, this.w, this.d, oVar), 1, null));
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c, Unit> {
            final GovernmentIdState d;
            final CaptureConfig e;
            final C0520a i;
            final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a v;
            final o w;

            a(GovernmentIdState governmentIdState, CaptureConfig captureConfig, C0520a c0520a, ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, o oVar) {
                super(1);
                this.d = governmentIdState;
                this.e = captureConfig;
                this.i = c0520a;
                this.v = aVar;
                this.w = oVar;
            }

            public final void a(@NotNull ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                GovernmentIdState governmentIdStateC = cVar.c();
                GovernmentIdState governmentIdState = governmentIdStateC instanceof GovernmentIdState ? governmentIdStateC : null;
                if (governmentIdState == null) {
                    return;
                }
                GovernmentIdState.WaitForAutocapture waitForAutocapture = new GovernmentIdState.WaitForAutocapture(((GovernmentIdState.ReviewCapturedImage) this.d).getCurrentPart(), cVar.c().l(), this.e, com.withpersona.sdk2.inquiry.governmentid.p.i(cVar.b(), ((GovernmentIdState.ReviewCapturedImage) this.d).getCurrentPart().getSide()), governmentIdState.k(), governmentIdState.getPartIndex(), com.withpersona.sdk2.inquiry.governmentid.p.b(cVar, false), EnumC0329d.i, this.i.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, null, new C0114a(this.v, this.w), 7680, null);
                waitForAutocapture.n(true);
                cVar.e(waitForAutocapture);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }

            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            static final class C0114a extends kotlin.jvm.internal.l implements Function0<Unit> {
                final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a d;
                final o e;

                @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
                static final class C0115a extends kotlin.jvm.internal.l implements Function1<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c, Unit> {
                    final o d;

                    C0115a(o oVar) {
                        super(1);
                        this.d = oVar;
                    }

                    public final void a(@NotNull ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c cVar) {
                        Intrinsics.checkNotNullParameter(cVar, "$this$action");
                        GovernmentIdState governmentIdStateC = cVar.c();
                        GovernmentIdState.WaitForAutocapture waitForAutocapture = governmentIdStateC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) governmentIdStateC : null;
                        if (waitForAutocapture != null) {
                            cVar.e(GovernmentIdState.WaitForAutocapture.p(waitForAutocapture, null, null, null, null, null, 0, null, this.d.videoCaptureHelper.d() ? EnumC0329d.e : EnumC0329d.i, null, null, false, false, null, null, 16255, null));
                        }
                    }

                    public Object invoke(Object obj) {
                        a((r.c) obj);
                        return Unit.a;
                    }
                }

                C0114a(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, o oVar) {
                    super(0);
                    this.d = aVar;
                    this.e = oVar;
                }

                public final void m65invoke() {
                    InterfaceC0570h<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>> interfaceC0570hB = this.d.b();
                    o oVar = this.e;
                    interfaceC0570hB.d(ka.z.d(oVar, null, new C0115a(oVar), 1, null));
                }

                public Object invoke() {
                    m65invoke();
                    return Unit.a;
                }
            }
        }

        public Object invoke() {
            m64invoke();
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class j extends kotlin.jvm.internal.l implements Function0<Unit> {
        final InterfaceC0570h<AbstractC0521b> d;

        j(InterfaceC0570h<? super AbstractC0521b> interfaceC0570h) {
            super(0);
            this.d = interfaceC0570h;
        }

        public final void m66invoke() {
            this.d.d(AbstractC0521b.C0113b.a);
        }

        public Object invoke() {
            m66invoke();
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class l extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0520a d;
        final GovernmentIdState e;
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a i;
        final o v;

        l(C0520a c0520a, GovernmentIdState governmentIdState, ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, o oVar) {
            super(0);
            this.d = c0520a;
            this.e = governmentIdState;
            this.i = aVar;
            this.v = oVar;
        }

        public Object invoke() {
            m68invoke();
            return Unit.a;
        }

        public final void m68invoke() {
            com.withpersona.sdk2.inquiry.governmentid.r.a(this.d, (GovernmentIdState.ReviewImageState) this.e, this.i, this.v.videoCaptureHelper);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class m extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a d;
        final o e;

        m(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, o oVar) {
            super(0);
            this.d = aVar;
            this.e = oVar;
        }

        public Object invoke() {
            m69invoke();
            return Unit.a;
        }

        public final void m69invoke() {
            com.withpersona.sdk2.inquiry.governmentid.p.l(this.d, this.e.videoCaptureHelper);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class n extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a d;
        final o e;

        n(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, o oVar) {
            super(0);
            this.d = aVar;
            this.e = oVar;
        }

        public Object invoke() {
            m70invoke();
            return Unit.a;
        }

        public final void m70invoke() {
            com.withpersona.sdk2.inquiry.governmentid.p.l(this.d, this.e.videoCaptureHelper);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0116o extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a d;

        C0116o(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar) {
            super(0);
            this.d = aVar;
        }

        public Object invoke() {
            m71invoke();
            return Unit.a;
        }

        public final void m71invoke() {
            com.withpersona.sdk2.inquiry.governmentid.p.a(this.d);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$renderScreen$1", f = "GovernmentIdWorkflow.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class p extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final C0520a e;
        final o i;
        final GovernmentIdState v;
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a w;

        p(C0520a c0520a, o oVar, GovernmentIdState governmentIdState, ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, Continuation<? super p> continuation) {
            super(2, continuation);
            this.e = c0520a;
            this.i = oVar;
            this.v = governmentIdState;
            this.w = aVar;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new p(this.e, this.i, this.v, this.w, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            S9.b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P9.p.b(obj);
            if (this.e.g().size() == 1) {
                o oVar = this.i;
                GovernmentIdState governmentIdState = this.v;
                ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a aVar = this.w;
                C0520a c0520a = this.e;
                o.C(oVar, governmentIdState, aVar, c0520a, (IdConfig) CollectionsKt.M(c0520a.g()), false);
            }
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class q extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a d;
        final o e;
        final GovernmentIdState i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c, Unit> {
            final GovernmentIdState d;

            a(GovernmentIdState governmentIdState) {
                super(1);
                this.d = governmentIdState;
            }

            public final void a(@NotNull ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(GovernmentIdState.ReviewSelectedImage.v((GovernmentIdState.ReviewSelectedImage) this.d, null, null, null, null, null, null, 0, null, null, null, false, 1535, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        q(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, o oVar, GovernmentIdState governmentIdState) {
            super(0);
            this.d = aVar;
            this.e = oVar;
            this.i = governmentIdState;
        }

        public Object invoke() {
            m72invoke();
            return Unit.a;
        }

        public final void m72invoke() {
            this.d.b().d(ka.z.d(this.e, null, new a(this.i), 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LB8/c$b;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "a", "(LB8/c$b;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class r extends kotlin.jvm.internal.l implements Function1<c.b, ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>> {
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c, Unit> {
            final o d;
            final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a e;

            a(o oVar, ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar) {
                super(1);
                this.d = oVar;
                this.e = aVar;
            }

            public final void a(@NotNull ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                this.d.E(this.e, AbstractC0521b.d.a);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c, Unit> {
            final String d;

            b(String str) {
                super(1);
                this.d = str;
            }

            public final void a(@NotNull ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                GovernmentIdState backState = cVar.c().getBackState();
                if (backState != null) {
                    cVar.e(backState.c(this.d));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class c extends kotlin.jvm.internal.l implements Function1<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c, Unit> {
            final c.b d;
            final o e;
            final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a i;

            c(c.b bVar, o oVar, ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar) {
                super(1);
                this.d = bVar;
                this.e = oVar;
                this.i = aVar;
            }

            public final void a(@NotNull ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                GovernmentIdState backState = cVar.c().getBackState();
                if (!((c.b.a) this.d).getCause().isRecoverable() || backState == null) {
                    this.e.E(this.i, new AbstractC0521b.c(((c.b.a) this.d).getCause()));
                    return;
                }
                String string = this.e.applicationContext.getString(S8.e.x);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                cVar.e(backState.c(string));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        r(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar) {
            super(1);
            this.e = aVar;
        }

        @NotNull
        public final ka.r<C0520a, GovernmentIdState, AbstractC0521b> invoke(@NotNull c.b bVar) throws P9.m {
            String string;
            Intrinsics.checkNotNullParameter(bVar, "it");
            if (bVar instanceof c.b.C0006c) {
                o oVar = o.this;
                return ka.z.d(oVar, null, new a(oVar, this.e), 1, null);
            }
            if (!(bVar instanceof c.b.C0005b)) {
                if (!(bVar instanceof c.b.a)) {
                    throw new P9.m();
                }
                o oVar2 = o.this;
                return ka.z.d(oVar2, null, new c(bVar, oVar2, this.e), 1, null);
            }
            c.b.C0005b c0005b = (c.b.C0005b) bVar;
            if (c0005b.getCause() instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) {
                string = o.this.applicationContext.getString(S8.e.p, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) c0005b.getCause()).getDetails().getMinDimensionSize()));
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            } else {
                string = o.this.applicationContext.getString(S8.e.q);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            return ka.z.d(o.this, null, new b(string), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class s extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a e;

        s(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() {
            m73invoke();
            return Unit.a;
        }

        public final void m73invoke() {
            o.this.E(this.e, AbstractC0521b.C0113b.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class t extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a e;

        t(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() {
            m74invoke();
            return Unit.a;
        }

        public final void m74invoke() {
            o.this.E(this.e, AbstractC0521b.C0113b.a);
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    class u extends kotlin.jvm.internal.a implements Function1<IdConfig, Unit> {
        final GovernmentIdState B;
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a C;
        final C0520a D;

        u(GovernmentIdState governmentIdState, ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, C0520a c0520a) {
            super(1, Intrinsics.a.class, "selectIdClass", "renderScreen$selectIdClass(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V", 0);
            this.B = governmentIdState;
            this.C = aVar;
            this.D = c0520a;
        }

        public final void a(@NotNull IdConfig idConfig) {
            Intrinsics.checkNotNullParameter(idConfig, "p0");
            o.D(o.this, this.B, this.C, this.D, idConfig, false, 32, null);
        }

        public Object invoke(Object obj) {
            a((IdConfig) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class v extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a d;
        final o e;

        v(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, o oVar) {
            super(0);
            this.d = aVar;
            this.e = oVar;
        }

        public Object invoke() {
            m75invoke();
            return Unit.a;
        }

        public final void m75invoke() {
            com.withpersona.sdk2.inquiry.governmentid.p.l(this.d, this.e.videoCaptureHelper);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class w extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a d;

        w(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar) {
            super(0);
            this.d = aVar;
        }

        public Object invoke() {
            m76invoke();
            return Unit.a;
        }

        public final void m76invoke() {
            com.withpersona.sdk2.inquiry.governmentid.p.a(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class x extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a d;
        final o e;
        final GovernmentIdState i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c, Unit> {
            final GovernmentIdState d;

            a(GovernmentIdState governmentIdState) {
                super(1);
                this.d = governmentIdState;
            }

            public final void a(@NotNull ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(GovernmentIdState.ShowInstructions.p((GovernmentIdState.ShowInstructions) this.d, null, null, null, null, 0, null, null, 63, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        x(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, o oVar, GovernmentIdState governmentIdState) {
            super(0);
            this.d = aVar;
            this.e = oVar;
            this.i = governmentIdState;
        }

        public Object invoke() {
            m77invoke();
            return Unit.a;
        }

        public final void m77invoke() {
            this.d.b().d(ka.z.d(this.e, null, new a(this.i), 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LL8/t$a;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "a", "(LL8/t$a;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class y extends kotlin.jvm.internal.l implements Function1<C0397t.a, ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>> {
        final IdPart.SideIdPart e;
        final GovernmentIdState i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c, Unit> {
            final GovernmentIdState d;

            a(GovernmentIdState governmentIdState) {
                super(1);
                this.d = governmentIdState;
            }

            public final void a(@NotNull ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(GovernmentIdState.ChooseCaptureMethod.p((GovernmentIdState.ChooseCaptureMethod) this.d, null, null, null, 0, null, false, null, null, 223, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        y(IdPart.SideIdPart sideIdPart, GovernmentIdState governmentIdState) {
            super(1);
            this.e = sideIdPart;
            this.i = governmentIdState;
        }

        @NotNull
        public final ka.r<C0520a, GovernmentIdState, AbstractC0521b> invoke(@NotNull C0397t.a aVar) throws P9.m {
            Intrinsics.checkNotNullParameter(aVar, "it");
            if (aVar instanceof C0397t.a.b) {
                C0397t.a.b bVar = (C0397t.a.b) aVar;
                return o.B(this.e, this.i, o.this, bVar.getAbsoluteFilePath(), bVar.getFileName());
            }
            if (Intrinsics.b(aVar, C0397t.a.C0030a.a)) {
                return ka.z.d(o.this, null, new a(this.i), 1, null);
            }
            throw new P9.m();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class z extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a d;
        final o e;
        final GovernmentIdState i;
        final C0520a v;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c, Unit> {
            final GovernmentIdState d;
            final C0520a e;
            final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a i;
            final o v;

            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            static final class C0117a extends kotlin.jvm.internal.l implements Function0<Unit> {
                final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a d;
                final o e;

                @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
                static final class C0118a extends kotlin.jvm.internal.l implements Function1<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c, Unit> {
                    final o d;

                    C0118a(o oVar) {
                        super(1);
                        this.d = oVar;
                    }

                    public final void a(@NotNull ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c cVar) {
                        Intrinsics.checkNotNullParameter(cVar, "$this$action");
                        GovernmentIdState governmentIdStateC = cVar.c();
                        GovernmentIdState.WaitForAutocapture waitForAutocapture = governmentIdStateC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) governmentIdStateC : null;
                        if (waitForAutocapture != null) {
                            cVar.e(GovernmentIdState.WaitForAutocapture.p(waitForAutocapture, null, null, null, null, null, 0, null, this.d.videoCaptureHelper.d() ? EnumC0329d.e : EnumC0329d.i, null, null, false, false, null, null, 16255, null));
                        }
                    }

                    public Object invoke(Object obj) {
                        a((r.c) obj);
                        return Unit.a;
                    }
                }

                C0117a(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, o oVar) {
                    super(0);
                    this.d = aVar;
                    this.e = oVar;
                }

                public Object invoke() {
                    m79invoke();
                    return Unit.a;
                }

                public final void m79invoke() {
                    InterfaceC0570h<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>> interfaceC0570hB = this.d.b();
                    o oVar = this.e;
                    interfaceC0570hB.d(ka.z.d(oVar, null, new C0118a(oVar), 1, null));
                }
            }

            a(GovernmentIdState governmentIdState, C0520a c0520a, ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, o oVar) {
                super(1);
                this.d = governmentIdState;
                this.e = c0520a;
                this.i = aVar;
                this.v = oVar;
            }

            public final void a(@NotNull ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                GovernmentIdState governmentIdStateC = cVar.c();
                GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = governmentIdStateC instanceof GovernmentIdState.ChooseCaptureMethod ? (GovernmentIdState.ChooseCaptureMethod) governmentIdStateC : null;
                if (chooseCaptureMethod == null) {
                    return;
                }
                cVar.e(new GovernmentIdState.WaitForAutocapture(((GovernmentIdState.ChooseCaptureMethod) this.d).getCurrentPart(), this.d.l(), ((GovernmentIdState.ChooseCaptureMethod) this.d).getCaptureConfig(), com.withpersona.sdk2.inquiry.governmentid.p.i(this.e, ((GovernmentIdState.ChooseCaptureMethod) this.d).getCurrentPart().getSide()), chooseCaptureMethod.k(), chooseCaptureMethod.getPartIndex(), com.withpersona.sdk2.inquiry.governmentid.p.c(cVar, false, 1, null), EnumC0329d.i, this.e.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, null, new C0117a(this.i, this.v), 7680, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        z(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, o oVar, GovernmentIdState governmentIdState, C0520a c0520a) {
            super(0);
            this.d = aVar;
            this.e = oVar;
            this.i = governmentIdState;
            this.v = c0520a;
        }

        public Object invoke() {
            m78invoke();
            return Unit.a;
        }

        public final void m78invoke() {
            InterfaceC0570h<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>> interfaceC0570hB = this.d.b();
            o oVar = this.e;
            interfaceC0570hB.d(ka.z.d(oVar, null, new a(this.i, this.v, this.d, oVar), 1, null));
        }
    }

    public o(@NotNull Context context, @NotNull InterfaceC0883h interfaceC0883h, @NotNull c.a aVar, @NotNull C0397t c0397t, @NotNull C0326a c0326a, @NotNull C0328c c0328c, @NotNull C0872a c0872a, @NotNull AutoClassifyWorker.b bVar, @NotNull C0855a c0855a, @NotNull InterfaceC0723a interfaceC0723a, @NotNull C0586a c0586a, @NotNull C0553c c0553c) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        Intrinsics.checkNotNullParameter(interfaceC0883h, "imageLoader");
        Intrinsics.checkNotNullParameter(aVar, "submitVerificationWorkerFactory");
        Intrinsics.checkNotNullParameter(c0397t, "documentSelectWorker");
        Intrinsics.checkNotNullParameter(c0326a, "localVideoCaptureRenderer");
        Intrinsics.checkNotNullParameter(c0328c, "webRtcRenderer");
        Intrinsics.checkNotNullParameter(c0872a, "captureRenderer");
        Intrinsics.checkNotNullParameter(bVar, "autoClassifyWorkerFactory");
        Intrinsics.checkNotNullParameter(c0855a, "autoClassificationRenderer");
        Intrinsics.checkNotNullParameter(interfaceC0723a, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(c0586a, "navigationStateManager");
        Intrinsics.checkNotNullParameter(c0553c, "externalEventLogger");
        this.applicationContext = context;
        this.imageLoader = interfaceC0883h;
        this.submitVerificationWorkerFactory = aVar;
        this.documentSelectWorker = c0397t;
        this.localVideoCaptureRenderer = c0326a;
        this.webRtcRenderer = c0328c;
        this.captureRenderer = c0872a;
        this.autoClassifyWorkerFactory = bVar;
        this.autoClassificationRenderer = c0855a;
        this.cameraStatsManager = interfaceC0723a;
        this.navigationStateManager = c0586a;
        this.externalEventLogger = c0553c;
        this.videoCaptureHelper = new C0327b(null, 1, null);
    }

    public static final void A(k.a aVar, o oVar, AbstractC0521b abstractC0521b) {
        Intrinsics.checkNotNullParameter(aVar, "$context");
        Intrinsics.checkNotNullParameter(oVar, "this$0");
        Intrinsics.checkNotNullParameter(abstractC0521b, "it");
        aVar.b().d(ka.z.d(oVar, null, oVar.new D(aVar, abstractC0521b), 1, null));
    }

    public static final ka.r<C0520a, GovernmentIdState, AbstractC0521b> B(IdPart.SideIdPart sideIdPart, GovernmentIdState governmentIdState, o oVar, String str, String str2) {
        return ka.z.d(oVar, null, new C(governmentIdState, new GovernmentId.GovernmentIdImage(CollectionsKt.d(new Frame(str, null, 2, null)), com.withpersona.sdk2.inquiry.governmentid.p.q(sideIdPart.getSide()), c.b(((GovernmentIdState.ChooseCaptureMethod) governmentIdState).getCaptureConfig()), GovernmentId.a.i, null, null, 32, null), str2), 1, null);
    }

    public static final void C(o oVar, GovernmentIdState governmentIdState, ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, C0520a c0520a, IdConfig idConfig, boolean z2) {
        com.withpersona.sdk2.inquiry.governmentid.p.n(governmentIdState, aVar, c0520a, null, idConfig, oVar.videoCaptureHelper, new CameraProperties(null, null, null, 0, 15, null), (1536 & 128) != 0 ? true : z2, (1536 & 256) != 0 ? governmentIdState.k() : idConfig.b(), (1536 & 512) != 0 ? governmentIdState.getPartIndex() : 0, (1536 & 1024) != 0 ? null : null);
    }

    static void D(o oVar, GovernmentIdState governmentIdState, k.a aVar, C0520a c0520a, IdConfig idConfig, boolean z2, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            z2 = true;
        }
        C(oVar, governmentIdState, aVar, c0520a, idConfig, z2);
    }

    public final void E(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a context, AbstractC0521b output) {
        com.withpersona.sdk2.inquiry.governmentid.p.p(context, output, this.videoCaptureHelper);
    }

    public final void F(ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c updater) {
        updater.d(new AbstractC0521b.c(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
    }

    private final boolean H(GovernmentIdState governmentIdState) throws P9.m {
        if (governmentIdState instanceof GovernmentIdState.CountdownToCapture ? true : governmentIdState instanceof GovernmentIdState.FinalizeWebRtc ? true : governmentIdState instanceof GovernmentIdState.WaitForAutocapture ? true : governmentIdState instanceof GovernmentIdState.FinalizeLocalVideoCapture) {
            return true;
        }
        if (governmentIdState instanceof GovernmentIdState.ChooseCaptureMethod ? true : governmentIdState instanceof GovernmentIdState.ReviewSelectedImage ? true : governmentIdState instanceof GovernmentIdState.ShowInstructions ? true : governmentIdState instanceof GovernmentIdState.Submit ? true : governmentIdState instanceof GovernmentIdState.ReviewCapturedImage ? true : governmentIdState instanceof GovernmentIdState.AutoClassificationError ? true : governmentIdState instanceof GovernmentIdState.AutoClassificationManualSelect) {
            return false;
        }
        throw new P9.m();
    }

    private final C0606i I(Object obj, GovernmentIdState governmentIdState) {
        return new C0606i(obj, governmentIdState.getDidGoBack() ? EnumC0605h.e : EnumC0605h.d);
    }

    private final String p(C0520a.C0112a c0112a, IdConfig.b bVar, String str) {
        String str2 = c0112a.p().get(bVar.getKey() + "-" + str);
        if (str2 != null) {
            return str2;
        }
        String str3 = c0112a.p().get(bVar.getKey());
        if (str3 != null) {
            return str3;
        }
        String string = this.applicationContext.getString(S8.e.n);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final String q(C0520a.C0112a c0112a, IdConfig.b bVar, String str) {
        String str2 = c0112a.r().get(bVar.getKey() + "-" + str);
        if (str2 != null) {
            return str2;
        }
        String str3 = c0112a.r().get(bVar.getKey());
        if (str3 != null) {
            return str3;
        }
        String string = this.applicationContext.getString(S8.e.o);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final String r(C0520a.C0112a c0112a, IdConfig.b bVar, String str) {
        String str2 = c0112a.u().get(bVar.getKey() + "-" + str);
        if (str2 != null) {
            return str2;
        }
        String str3 = c0112a.u().get(bVar.getKey());
        return str3 == null ? "" : str3;
    }

    private final String s(C0520a.C0112a c0112a, IdConfig.b bVar) {
        String str = c0112a.V().get(bVar);
        if (str != null) {
            return str;
        }
        String string = this.applicationContext.getString(S8.e.r);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final String t(C0520a.C0112a c0112a, IdConfig.b bVar) {
        String str = c0112a.Y().get(bVar);
        if (str != null) {
            return str;
        }
        String string = this.applicationContext.getString(S8.e.s);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final String u(GovernmentIdState governmentIdState) throws P9.m {
        if (governmentIdState instanceof GovernmentIdState.CountdownToCapture ? true : governmentIdState instanceof GovernmentIdState.ReviewCapturedImage ? true : governmentIdState instanceof GovernmentIdState.WaitForAutocapture ? true : governmentIdState instanceof GovernmentIdState.FinalizeLocalVideoCapture ? true : governmentIdState instanceof GovernmentIdState.FinalizeWebRtc) {
            return "camera_screen";
        }
        if (governmentIdState instanceof GovernmentIdState.ChooseCaptureMethod ? true : governmentIdState instanceof GovernmentIdState.ReviewSelectedImage ? true : governmentIdState instanceof GovernmentIdState.ShowInstructions ? true : governmentIdState instanceof GovernmentIdState.Submit ? true : governmentIdState instanceof GovernmentIdState.AutoClassificationError ? true : governmentIdState instanceof GovernmentIdState.AutoClassificationManualSelect) {
            return null;
        }
        throw new P9.m();
    }

    private final com.squareup.workflow1.ui.m<Object> w(Object obj, String str) {
        return new com.squareup.workflow1.ui.m<>(obj, str);
    }

    private final void x() {
        this.videoCaptureHelper.a();
        this.cameraStatsManager.b();
    }

    private final Object z(C0520a renderProps, GovernmentIdState renderState, final ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a context) throws P9.m {
        InterfaceC0558h checkUpload;
        RemoteImage idFrontPictograph;
        RemoteImage remoteImage;
        InterfaceC0570h<? super AbstractC0521b> interfaceC0570h = new InterfaceC0570h() {
            @Override
            public final void d(Object obj) {
                com.withpersona.sdk2.inquiry.governmentid.o.A(context, this, (o.AbstractC0521b) obj);
            }
        };
        this.navigationStateManager.c(renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), renderProps.getIsEnabled() && !(renderState instanceof GovernmentIdState.Submit));
        C0553c c0553c = this.externalEventLogger;
        String fromStep = renderProps.getFromStep();
        boolean z2 = renderState instanceof GovernmentIdState.AutoClassificationError;
        if (z2) {
            checkUpload = InterfaceC0558h.a.a;
        } else if (renderState instanceof GovernmentIdState.AutoClassificationManualSelect) {
            checkUpload = InterfaceC0558h.b.a;
        } else if (renderState instanceof GovernmentIdState.ShowInstructions) {
            checkUpload = InterfaceC0558h.g.a;
        } else if (renderState instanceof GovernmentIdState.ChooseCaptureMethod) {
            checkUpload = new InterfaceC0558h.Prompt(renderState.getPartIndex());
        } else {
            if (renderState instanceof GovernmentIdState.WaitForAutocapture ? true : renderState instanceof GovernmentIdState.CountdownToCapture ? true : renderState instanceof GovernmentIdState.FinalizeLocalVideoCapture ? true : renderState instanceof GovernmentIdState.FinalizeWebRtc) {
                checkUpload = new InterfaceC0558h.TakePhoto(renderState.getPartIndex());
            } else if (renderState instanceof GovernmentIdState.ReviewCapturedImage) {
                checkUpload = new InterfaceC0558h.Check(renderState.getPartIndex());
            } else if (renderState instanceof GovernmentIdState.ReviewSelectedImage) {
                checkUpload = new InterfaceC0558h.CheckUpload(renderState.getPartIndex());
            } else {
                if (!(renderState instanceof GovernmentIdState.Submit)) {
                    throw new P9.m();
                }
                checkUpload = InterfaceC0558h.e.a;
            }
        }
        c0553c.c(new AbstractC0559i.c(fromStep, checkUpload));
        if (renderState instanceof GovernmentIdState.ShowInstructions) {
            context.a("check_if_single_id_class", new p(renderProps, this, renderState, context, null));
            return new Screen.c(renderProps.getStrings().getTitle(), renderProps.getStrings().getPrompt(), renderProps.getStrings().getChoose(), renderProps.getStrings().getInstructionsDisclaimer(), com.withpersona.sdk2.inquiry.governmentid.p.h(renderProps), this.navigationStateManager.b(), new u(renderState, context, renderProps), renderProps.getStyles(), renderProps.getAssetConfig().getSelectPage(), renderProps.getIsEnabled(), new v(context, this), new w(context), ((GovernmentIdState.ShowInstructions) renderState).getError(), new x(context, this, renderState));
        }
        if (!(renderState instanceof GovernmentIdState.ChooseCaptureMethod)) {
            if (renderState instanceof GovernmentIdState.WaitForAutocapture) {
                return this.captureRenderer.f(renderProps, (GovernmentIdState.WaitForAutocapture) renderState, context, this.videoCaptureHelper, interfaceC0570h);
            }
            if (renderState instanceof GovernmentIdState.CountdownToCapture) {
                return this.captureRenderer.e(renderProps, (GovernmentIdState.CountdownToCapture) renderState, context, this.videoCaptureHelper, interfaceC0570h);
            }
            if (renderState instanceof GovernmentIdState.ReviewCapturedImage) {
                GovernmentIdState.ReviewCapturedImage reviewCapturedImage = (GovernmentIdState.ReviewCapturedImage) renderState;
                CaptureConfig captureConfig = reviewCapturedImage.getCaptureConfig();
                IdConfig.IdSideConfig idSideConfigD = c.d(captureConfig, reviewCapturedImage.getCurrentPart().getSide());
                Frame frame = (Frame) CollectionsKt.M(reviewCapturedImage.getIdForReview().b1());
                if (reviewCapturedImage.getSubmittingForAutoClassification()) {
                    com.withpersona.sdk2.inquiry.governmentid.r.b(renderProps, (GovernmentIdState.ReviewImageState) renderState, context, this.videoCaptureHelper, this.autoClassifyWorkerFactory);
                }
                return new AlertContainerScreen(com.withpersona.sdk2.inquiry.permissions.d.c(new Screen.d(this.imageLoader, com.withpersona.sdk2.inquiry.governmentid.p.g(renderProps.getStrings(), reviewCapturedImage.getCurrentPart().getSide(), c.b(reviewCapturedImage.getCaptureConfig())), renderProps.getStrings().getCaptureDisclaimer(), idSideConfigD.getOverlay(), frame.getAbsoluteFilePath(), reviewCapturedImage.getCurrentPart().getSide(), c.a(captureConfig), this.navigationStateManager.b(), new h(renderProps, renderState, context, this), renderProps.getStrings().getButtonSubmit(), new i(context, this, renderState, captureConfig, renderProps), renderProps.getStrings().getButtonRetake(), r(renderProps.getStrings(), reviewCapturedImage.getCurrentPart().getSide(), c.b(reviewCapturedImage.getCaptureConfig())), new j(interfaceC0570h), renderProps.getStyles(), reviewCapturedImage.getError(), new k(context, this, renderState), renderProps.getAssetConfig().getCapturePage(), renderProps.getIsEnabled() && !reviewCapturedImage.getSubmittingForAutoClassification(), reviewCapturedImage.getSubmittingForAutoClassification(), renderProps.getReviewCaptureButtonsAxis())), null, 2, null);
            }
            if (renderState instanceof GovernmentIdState.ReviewSelectedImage) {
                GovernmentIdState.ReviewSelectedImage reviewSelectedImage = (GovernmentIdState.ReviewSelectedImage) renderState;
                IdPart.SideIdPart currentPart = reviewSelectedImage.getCurrentPart();
                if (reviewSelectedImage.getSubmittingForAutoClassification()) {
                    com.withpersona.sdk2.inquiry.governmentid.r.b(renderProps, (GovernmentIdState.ReviewImageState) renderState, context, this.videoCaptureHelper, this.autoClassifyWorkerFactory);
                }
                return new ReviewSelectedImageView(this.imageLoader, t(renderProps.getStrings(), currentPart.getSide()), s(renderProps.getStrings(), currentPart.getSide()), renderProps.getStrings().getReviewSelectedImageConfirmButton(), renderProps.getStrings().getReviewSelectedImageChooseAnotherButton(), ((Frame) CollectionsKt.M(reviewSelectedImage.getIdForReview().b1())).getAbsoluteFilePath(), ((Frame) CollectionsKt.M(reviewSelectedImage.getIdForReview().b1())).getMimeType(), reviewSelectedImage.getFileName(), this.navigationStateManager.b(), new l(renderProps, renderState, context, this), new m(context, this), new n(context, this), new C0116o(context), reviewSelectedImage.getError(), new q(context, this, renderState), renderProps.getStyles(), reviewSelectedImage.getSubmittingForAutoClassification());
            }
            if (renderState instanceof GovernmentIdState.Submit) {
                GovernmentIdState.Submit submit = (GovernmentIdState.Submit) renderState;
                ka.w.l(context, this.submitVerificationWorkerFactory.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromComponent(), renderProps.getFromStep(), submit.getGovernmentIdRequestArguments(), submit.getWebRtcObjectId(), submit.getCameraProperties()), kotlin.jvm.internal.z.j(bb.c.class), "", new r(context));
                C0586a.d(this.navigationStateManager, false, false, false, 4, null);
                return new Screen.e(renderProps.getStrings().getProcessingTitle(), renderProps.getStrings().getProcessingDescription(), renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), this.navigationStateManager.b(), new s(context), new t(context), renderProps.getPendingPageTextVerticalPosition());
            }
            if (renderState instanceof GovernmentIdState.FinalizeLocalVideoCapture) {
                return this.localVideoCaptureRenderer.b(renderProps, (GovernmentIdState.FinalizeLocalVideoCapture) renderState, context, this.videoCaptureHelper);
            }
            if (renderState instanceof GovernmentIdState.FinalizeWebRtc) {
                return this.webRtcRenderer.b(renderProps, (GovernmentIdState.FinalizeWebRtc) renderState, context, this.videoCaptureHelper);
            }
            if (z2) {
                return this.autoClassificationRenderer.a(renderProps, (GovernmentIdState.AutoClassificationError) renderState, context, this.videoCaptureHelper);
            }
            if (renderState instanceof GovernmentIdState.AutoClassificationManualSelect) {
                return this.autoClassificationRenderer.b(renderProps, (GovernmentIdState.AutoClassificationManualSelect) renderState, context, this.videoCaptureHelper);
            }
            throw new P9.m();
        }
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = (GovernmentIdState.ChooseCaptureMethod) renderState;
        IdPart.SideIdPart currentPart2 = chooseCaptureMethod.getCurrentPart();
        if (chooseCaptureMethod.getChoosingDocumentToUpload()) {
            ka.w.l(context, this.documentSelectWorker, kotlin.jvm.internal.z.j(C0397t.class), "", new y(currentPart2, renderState));
        }
        NextStep.GovernmentId.AssetConfig.PromptPage promptPage = renderProps.getAssetConfig().getPromptPage();
        List<CaptureOptionNativeMobile> listF = renderProps.f();
        String strQ = q(renderProps.getStrings(), currentPart2.getSide(), c.b(chooseCaptureMethod.getCaptureConfig()));
        String strP = p(renderProps.getStrings(), currentPart2.getSide(), c.b(chooseCaptureMethod.getCaptureConfig()));
        String chooseCaptureMethodCameraButton = renderProps.getStrings().getChooseCaptureMethodCameraButton();
        String chooseCaptureMethodUploadButton = renderProps.getStrings().getChooseCaptureMethodUploadButton();
        NavigationState navigationStateB = this.navigationStateManager.b();
        z zVar = new z(context, this, renderState, renderProps);
        A a = new A(context, this, renderState);
        B b = new B(context, this);
        f fVar = new f(context);
        String error = chooseCaptureMethod.getError();
        g gVar = new g(context, this, renderState);
        StepStyles.GovernmentIdStepStyle styles = renderProps.getStyles();
        IdConfig.b side = chooseCaptureMethod.getCurrentPart().getSide();
        int[] iArr = C0522c.a;
        int i2 = iArr[side.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new P9.m();
                        }
                        if (promptPage != null) {
                            idFrontPictograph = promptPage.getPassportSignaturePictograph();
                            remoteImage = idFrontPictograph;
                        }
                    } else if (promptPage != null) {
                        idFrontPictograph = promptPage.getBarcodePdf417Pictograph();
                        remoteImage = idFrontPictograph;
                    }
                }
                remoteImage = null;
            } else {
                if (promptPage != null) {
                    idFrontPictograph = promptPage.getIdBackPictograph();
                    remoteImage = idFrontPictograph;
                }
                remoteImage = null;
            }
        } else if (c.a(chooseCaptureMethod.getCaptureConfig()) == bb.b.C) {
            if (promptPage != null) {
                idFrontPictograph = promptPage.getPassportFrontPictograph();
                remoteImage = idFrontPictograph;
            }
            remoteImage = null;
        } else {
            if (promptPage != null) {
                idFrontPictograph = promptPage.getIdFrontPictograph();
                remoteImage = idFrontPictograph;
            }
            remoteImage = null;
        }
        int i3 = iArr[chooseCaptureMethod.getCurrentPart().getSide().ordinal()];
        return new ChooseCaptureMethodView(listF, strQ, strP, chooseCaptureMethodCameraButton, chooseCaptureMethodUploadButton, navigationStateB, zVar, a, b, fVar, error, gVar, styles, remoteImage, i3 != 1 ? (i3 == 2 || i3 == 4) ? C0826G.d : C0826G.e : c.a(chooseCaptureMethod.getCaptureConfig()) == bb.b.C ? C0826G.f : C0826G.e);
    }

    @Override
    @NotNull
    public Snapshot g(@NotNull GovernmentIdState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return com.squareup.workflow1.ui.q.a(state);
    }

    @Override
    public void close() {
        x();
    }

    @Override
    @NotNull
    public GovernmentIdState d(@NotNull C0520a props, Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        GovernmentIdState governmentIdState = null;
        if (snapshot != null) {
            okio.h hVarB = snapshot.b();
            if (hVarB.E() <= 0) {
                hVarB = null;
            }
            if (hVarB != null) {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] bArrJ = hVarB.J();
                parcelObtain.unmarshall(bArrJ, 0, bArrJ.length);
                parcelObtain.setDataPosition(0);
                ?? parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.d((Object) parcelable);
                Intrinsics.checkNotNullExpressionValue((Object) parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
                governmentIdState = parcelable;
            }
            governmentIdState = governmentIdState;
        }
        if (governmentIdState != null) {
            return governmentIdState;
        }
        if (props.getAutoClassificationConfig().getIsEnabled() && !this.videoCaptureHelper.c(props)) {
            if (!props.l()) {
                return new GovernmentIdState.WaitForAutocapture(new IdPart.SideIdPart(IdConfig.b.v), CollectionsKt.j(), new CaptureConfig.AutoClassifyConfig(props.getAutoClassificationConfig()), Screen.b.a.e, CollectionsKt.j(), 0, null, EnumC0329d.i, props.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, null, null, 15872, null);
            }
            return new GovernmentIdState.ChooseCaptureMethod(new IdPart.SideIdPart(IdConfig.b.v), CollectionsKt.j(), CollectionsKt.j(), 0, new CaptureConfig.AutoClassifyConfig(props.getAutoClassificationConfig()), false, null, null, 160, null);
        }
        return new GovernmentIdState.ShowInstructions(null, null, null, null, 0, null, null, 127, null);
    }

    @Override
    @NotNull
    public Object f(@NotNull C0520a renderProps, @NotNull GovernmentIdState renderState, @NotNull ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a context) throws P9.m {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Object objZ = z(renderProps, renderState, context);
        String strU = u(renderState);
        if (strU != null) {
            objZ = w(objZ, strU);
        }
        if (!H(renderState)) {
            context.a("close_camera", new C0523d(null));
        }
        if (!this.videoCaptureHelper.f(renderProps) && C0456d.e(this.applicationContext)) {
            context.a("output_webrtc_error", new e(context, this, null));
        }
        return I(objZ, renderState);
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class k extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a d;
        final o e;
        final GovernmentIdState i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c, Unit> {
            final GovernmentIdState d;

            a(GovernmentIdState governmentIdState) {
                super(1);
                this.d = governmentIdState;
            }

            public final void a(@NotNull ka.r<? super C0520a, GovernmentIdState, ? extends AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(GovernmentIdState.ReviewCapturedImage.v((GovernmentIdState.ReviewCapturedImage) this.d, null, null, null, null, null, 0, null, null, null, false, 767, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        k(ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, o oVar, GovernmentIdState governmentIdState) {
            super(0);
            this.d = aVar;
            this.e = oVar;
            this.i = governmentIdState;
        }

        public final void m67invoke() {
            this.d.b().d(ka.z.d(this.e, null, new a(this.i), 1, null));
        }

        public Object invoke() {
            m67invoke();
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0520a d;
        final GovernmentIdState e;
        final ka.k<C0520a, GovernmentIdState, AbstractC0521b, Object>.a i;
        final o v;

        h(C0520a c0520a, GovernmentIdState governmentIdState, ka.k<? super C0520a, GovernmentIdState, ? extends AbstractC0521b, ? extends Object>.a aVar, o oVar) {
            super(0);
            this.d = c0520a;
            this.e = governmentIdState;
            this.i = aVar;
            this.v = oVar;
        }

        public final void m63invoke() {
            com.withpersona.sdk2.inquiry.governmentid.r.a(this.d, (GovernmentIdState.ReviewImageState) this.e, this.i, this.v.videoCaptureHelper);
        }

        public Object invoke() {
            m63invoke();
            return Unit.a;
        }
    }
}
