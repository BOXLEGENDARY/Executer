package ha;

import android.content.Context;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.b;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.n;
import com.withpersona.sdk2.inquiry.selfie.p;
import com.withpersona.sdk2.inquiry.selfie.q;
import ha.C0586a;
import ha.C0645f;
import ha.W;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
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

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u0016\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0015\u001a\"0\u0010R\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0012j\u0002`\u0011H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LY8/a;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/camera/b$a;", "cameraXControllerFactory", "Ln8/f$a;", "camera2ManagerFactoryFactory", "Lh9/a;", "navigationStateManager", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/b$a;Ln8/f$a;Lh9/a;)V", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "renderProps", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;", "renderState", "Lf8/k$a;", "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;", "Lf8/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "context", "b", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;Lf8/k$a;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "Lcom/withpersona/sdk2/camera/b$a;", "c", "Ln8/f$a;", "d", "Lh9/a;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0428a {

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final b.a cameraXControllerFactory;

    @NotNull
    private final C0645f.a camera2ManagerFactoryFactory;

    @NotNull
    private final C0586a navigationStateManager;

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer$renderFinalizeVideoCapture$1", f = "LocalVideoCaptureRenderer.kt", l = {36}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;
        final SelfieState.FinalizeLocalVideoCapture e;
        final ka.k<p.Input, SelfieState, p.AbstractC0527c, Object>.a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0054a extends l implements Function1<r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c, Unit> {
            public static final C0054a d = new C0054a();

            C0054a() {
                super(1);
            }

            public final void a(@NotNull r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                SelfieState selfieStateC = cVar.c();
                SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = selfieStateC instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) selfieStateC : null;
                if (finalizeLocalVideoCapture == null) {
                    return;
                }
                cVar.e(finalizeLocalVideoCapture.q((123 & 1) != 0 ? finalizeLocalVideoCapture.selfies : null, (123 & 2) != 0 ? finalizeLocalVideoCapture.minDurationMs : 0L, (123 & 4) != 0 ? finalizeLocalVideoCapture.isDelayComplete : true, (123 & 8) != 0 ? finalizeLocalVideoCapture.isFinalizeComplete : false, (123 & 16) != 0 ? finalizeLocalVideoCapture.cameraProperties : null, (123 & 32) != 0 ? finalizeLocalVideoCapture.startSelfieTimestamp : 0L, (123 & 64) != 0 ? finalizeLocalVideoCapture.backState : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        L(SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, ka.k<? super p.Input, SelfieState, ? extends p.AbstractC0527c, ? extends Object>.a aVar, Continuation<? super L> continuation) {
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
                P9.p.b(obj);
                long minDurationMs = this.e.getMinDurationMs();
                this.d = 1;
                if (W.a(minDurationMs, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P9.p.b(obj);
            }
            this.i.b().d(C0562B.c(null, C0054a.d, 1, null));
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/File;", "it", "", "a", "(Ljava/io/File;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends l implements Function1<File, Unit> {
        final ka.k<p.Input, SelfieState, p.AbstractC0527c, Object>.a d;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0055a extends l implements Function1<r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c, Unit> {
            final List<Selfie> d;

            C0055a(List<Selfie> list) {
                super(1);
                this.d = list;
            }

            public final void a(@NotNull r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                SelfieState selfieStateC = cVar.c();
                SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = selfieStateC instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) selfieStateC : null;
                if (finalizeLocalVideoCapture == null) {
                    return;
                }
                cVar.e(finalizeLocalVideoCapture.q((123 & 1) != 0 ? finalizeLocalVideoCapture.selfies : CollectionsKt.e0(cVar.c().o(), this.d), (123 & 2) != 0 ? finalizeLocalVideoCapture.minDurationMs : 0L, (123 & 4) != 0 ? finalizeLocalVideoCapture.isDelayComplete : false, (123 & 8) != 0 ? finalizeLocalVideoCapture.isFinalizeComplete : true, (123 & 16) != 0 ? finalizeLocalVideoCapture.cameraProperties : null, (123 & 32) != 0 ? finalizeLocalVideoCapture.startSelfieTimestamp : 0L, (123 & 64) != 0 ? finalizeLocalVideoCapture.backState : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        b(ka.k<? super p.Input, SelfieState, ? extends p.AbstractC0527c, ? extends Object>.a aVar) {
            super(1);
            this.d = aVar;
        }

        public final void a(@NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "it");
            ArrayList arrayList = new ArrayList();
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            arrayList.add(new Selfie.SelfieVideo(absolutePath, Selfie.a.i));
            this.d.b().d(C0562B.c(null, new C0055a(arrayList), 1, null));
        }

        public Object invoke(Object obj) {
            a((File) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends l implements Function0<Unit> {
        final ka.k<p.Input, SelfieState, p.AbstractC0527c, Object>.a d;
        final SelfieState.FinalizeLocalVideoCapture e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0056a extends l implements Function1<r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c, Unit> {
            final SelfieState.FinalizeLocalVideoCapture d;

            C0056a(SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture) {
                super(1);
                this.d = finalizeLocalVideoCapture;
            }

            public final void a(@NotNull r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                SelfieState selfieStateC = cVar.c();
                SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = selfieStateC instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) selfieStateC : null;
                if (finalizeLocalVideoCapture != null && finalizeLocalVideoCapture.getIsFinalizeComplete()) {
                    cVar.e(q.g(cVar, cVar.c().o(), null, this.d.getCameraProperties(), this.d.getStartSelfieTimestamp(), q.a(cVar, false)));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        c(ka.k<? super p.Input, SelfieState, ? extends p.AbstractC0527c, ? extends Object>.a aVar, SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture) {
            super(0);
            this.d = aVar;
            this.e = finalizeLocalVideoCapture;
        }

        public Object invoke() {
            m18invoke();
            return Unit.a;
        }

        public final void m18invoke() {
            this.d.b().d(C0562B.c(null, new C0056a(this.e), 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends l implements Function0<Unit> {
        final ka.k<p.Input, SelfieState, p.AbstractC0527c, Object>.a d;

        d(ka.k<? super p.Input, SelfieState, ? extends p.AbstractC0527c, ? extends Object>.a aVar) {
            super(0);
            this.d = aVar;
        }

        public Object invoke() {
            m19invoke();
            return Unit.a;
        }

        public final void m19invoke() {
            q.d(this.d, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class e extends l implements Function0<Unit> {
        final ka.k<p.Input, SelfieState, p.AbstractC0527c, Object>.a d;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0057a extends l implements Function1<r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c, Unit> {
            public static final C0057a d = new C0057a();

            C0057a() {
                super(1);
            }

            public final void a(@NotNull r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(p.AbstractC0527c.b.a);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        e(ka.k<? super p.Input, SelfieState, ? extends p.AbstractC0527c, ? extends Object>.a aVar) {
            super(0);
            this.d = aVar;
        }

        public Object invoke() {
            m20invoke();
            return Unit.a;
        }

        public final void m20invoke() {
            this.d.b().d(C0562B.c(null, C0057a.d, 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class f extends l implements Function0<Unit> {
        final ka.k<p.Input, SelfieState, p.AbstractC0527c, Object>.a e;
        final p.Input i;

        f(ka.k<? super p.Input, SelfieState, ? extends p.AbstractC0527c, ? extends Object>.a aVar, p.Input input) {
            super(0);
            this.e = aVar;
            this.i = input;
        }

        public Object invoke() {
            m21invoke();
            return Unit.a;
        }

        public final void m21invoke() {
            q.e(C0428a.this.applicationContext, this.e, this.i, true);
        }
    }

    public C0428a(@NotNull Context context, @NotNull b.a aVar, @NotNull C0645f.a aVar2, @NotNull C0586a c0586a) {
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
    public final Object b(@NotNull p.Input renderProps, @NotNull SelfieState.FinalizeLocalVideoCapture renderState, @NotNull ka.k<? super p.Input, SelfieState, ? extends p.AbstractC0527c, ? extends Object>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        context.a("finalize_delay", new L(renderState, context, null));
        return new p.AbstractC0528d.a(renderProps.getStrings().getCapturePageTitle(), null, new p.AbstractC0528d.a.b.c(new b(context), new c(context, renderState), renderState.getIsDelayComplete(), renderState.getIsFinalizeComplete() ? p.AbstractC0528d.a.c.E : p.AbstractC0528d.a.c.C, !Intrinsics.b(renderProps.getSelfieType(), n.b.a)), renderProps.getStyles(), q.f(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new d(context), new e(context), q.c(context), new f(context, renderProps), EnumC0732a.e, null, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory);
    }
}
