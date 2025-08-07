package ha;

import android.content.Context;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.b;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.m;
import com.withpersona.sdk2.inquiry.governmentid.o;
import com.withpersona.sdk2.inquiry.governmentid.p;
import ha.C0586a;
import ha.C0645f;
import java.util.List;
import k8.AlertContainerScreen;
import ka.C0562B;
import ka.k;
import ka.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;
import p8.EnumC0732a;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJM\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0015\u001a\"0\u0010R\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0012j\u0002`\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LC8/c;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/camera/b$a;", "cameraXControllerFactory", "Ln8/f$a;", "camera2ManagerFactoryFactory", "Lh9/a;", "navigationStateManager", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/b$a;Ln8/f$a;Lh9/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;", "renderState", "Lf8/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lf8/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "context", "LC8/b;", "videoCaptureHelper", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;Lf8/k$a;LC8/b;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "Lcom/withpersona/sdk2/camera/b$a;", "c", "Ln8/f$a;", "d", "Lh9/a;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0328c {

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final b.a cameraXControllerFactory;

    @NotNull
    private final C0645f.a camera2ManagerFactoryFactory;

    @NotNull
    private final C0586a navigationStateManager;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends l implements Function1<String, Unit> {
        final k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;
        final A9.a e;
        final GovernmentIdState.FinalizeWebRtc i;
        final o.C0520a v;
        final C0327b w;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0013a extends l implements Function1<r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final A9.a d;
            final GovernmentIdState.FinalizeWebRtc e;
            final k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a i;
            final o.C0520a v;
            final C0327b w;
            final String y;

            C0013a(A9.a aVar, GovernmentIdState.FinalizeWebRtc finalizeWebRtc, k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar2, o.C0520a c0520a, C0327b c0327b, String str) {
                super(1);
                this.d = aVar;
                this.e = finalizeWebRtc;
                this.i = aVar2;
                this.v = c0520a;
                this.w = c0327b;
                this.y = str;
            }

            public final void a(@NotNull r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                if (this.d.a()) {
                    this.d.c();
                    IdConfig id = this.e.getId();
                    List<IdPart> listK = this.e.k();
                    CameraProperties cameraProperties = this.e.getCameraProperties();
                    GovernmentIdState.FinalizeWebRtc finalizeWebRtc = this.e;
                    p.n(finalizeWebRtc, this.i, this.v, null, id, this.w, cameraProperties, (1536 & 128) != 0, (1536 & 256) != 0 ? finalizeWebRtc.k() : listK, (1536 & 512) != 0 ? finalizeWebRtc.getPartIndex() : 0, (1536 & 1024) != 0 ? null : this.y);
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        a(k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, A9.a aVar2, GovernmentIdState.FinalizeWebRtc finalizeWebRtc, o.C0520a c0520a, C0327b c0327b) {
            super(1);
            this.d = aVar;
            this.e = aVar2;
            this.i = finalizeWebRtc;
            this.v = c0520a;
            this.w = c0327b;
        }

        public final void a(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            this.d.b().d(C0562B.c(null, new C0013a(this.e, this.i, this.d, this.v, this.w, str), 1, null));
        }

        public Object invoke(Object obj) {
            a((String) obj);
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
    static final class C0014c extends l implements Function0<Unit> {
        final k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends l implements Function1<r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            public static final a d = new a();

            a() {
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

        C0014c(k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar) {
            super(0);
            this.d = aVar;
        }

        public Object invoke() {
            m5invoke();
            return Unit.a;
        }

        public final void m5invoke() {
            this.d.b().d(C0562B.c(null, a.d, 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends l implements Function0<Unit> {
        final k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;
        final C0327b e;

        d(k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, C0327b c0327b) {
            super(0);
            this.d = aVar;
            this.e = c0327b;
        }

        public Object invoke() {
            m6invoke();
            return Unit.a;
        }

        public final void m6invoke() {
            p.l(this.d, this.e);
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

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class f extends l implements Function0<Unit> {
        public static final f d = new f();

        f() {
            super(0);
        }

        public Object invoke() {
            m7invoke();
            return Unit.a;
        }

        public final void m7invoke() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class g extends l implements Function0<Unit> {
        final k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a e;
        final o.C0520a i;

        g(k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, o.C0520a c0520a) {
            super(0);
            this.e = aVar;
            this.i = c0520a;
        }

        public Object invoke() {
            m8invoke();
            return Unit.a;
        }

        public final void m8invoke() {
            p.m(C0328c.this.applicationContext, this.e, this.i, true);
        }
    }

    public C0328c(@NotNull Context context, @NotNull b.a aVar, @NotNull C0645f.a aVar2, @NotNull C0586a c0586a) {
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
    public final Object b(@NotNull o.C0520a renderProps, @NotNull GovernmentIdState.FinalizeWebRtc renderState, @NotNull k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a context, @NotNull C0327b videoCaptureHelper) {
        IdConfig.b side;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        A9.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        if (webRtcManager != null) {
            webRtcManager.h(new a(context, webRtcManager, renderState, renderProps, videoCaptureHelper));
        }
        IdPart currentPart = renderState.getCurrentPart();
        IdPart.SideIdPart sideIdPart = currentPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart : null;
        if (sideIdPart == null || (side = sideIdPart.getSide()) == null) {
            side = IdConfig.b.v;
        }
        IdConfig.IdSideConfig idSideConfigC = renderState.getId().c(side);
        String strE = p.e(renderProps.getStrings(), side, renderState.getId().getIdClassKey());
        String capturing = renderProps.getStrings().getCapturing();
        Screen.b.a aVar = Screen.b.a.d;
        bb.b type = renderState.getId().getType();
        return new AlertContainerScreen(com.withpersona.sdk2.inquiry.permissions.d.c(m.a(renderProps, strE, capturing, aVar, idSideConfigC.getOverlay(), type, side, this.navigationStateManager.b(), (805437440 & 256) != 0 ? m.a.d : b.d, new C0014c(context), new d(context, videoCaptureHelper), false, CollectionsKt.j(), renderState, renderState.getPartIndex(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, (131072 & 805437440) != 0 ? m.b.d : null, (262144 & 805437440) != 0 ? m.c.d : e.d, p.d(context), (1048576 & 805437440) != 0 ? EnumC0732a.i : EnumC0732a.d, (2097152 & 805437440) != 0, (4194304 & 805437440) != 0 ? false : true, (8388608 & 805437440) != 0 ? false : false, (16777216 & 805437440) != 0 ? m.d.d : null, (33554432 & 805437440) != 0 ? m.e.d : f.d, new g(context, renderProps), (134217728 & 805437440) != 0 ? renderProps.getImageCaptureCount() : 0, (268435456 & 805437440) != 0 ? null : null, (536870912 & 805437440) != 0 ? null : null, (805437440 & 1073741824) != 0 ? null : webRtcManager)), null, 2, null);
    }
}
