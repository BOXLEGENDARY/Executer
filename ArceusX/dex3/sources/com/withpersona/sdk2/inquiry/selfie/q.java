package com.withpersona.sdk2.inquiry.selfie;

import V8.s;
import android.content.Context;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.p;
import ha.C0456d;
import java.util.ArrayList;
import java.util.List;
import ka.C0562B;
import ka.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u5.AbstractC0622i;
import u5.B;
import u5.C;
import u5.E;
import u5.F;
import u5.N;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00140\u0000R\u0010\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aY\u0010\u0012\u001a\u00020\u0002*\u00160\u0000R\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a=\u0010\u001c\u001a\u00020\u001b*\"0\u0014R\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016j\u0002`\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aC\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001b0\u001ej\u0002` *\"0\u0014R\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016j\u0002`\u0015H\u0000¢\u0006\u0004\b!\u0010\"\u001aO\u0010(\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020#2&\u0010%\u001a\"0\u0014R\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016j\u0002`\u00152\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0003H\u0000¢\u0006\u0004\b(\u0010)\u001a\u0013\u0010+\u001a\u00020**\u00020\u0007H\u0000¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "addCurrentState", "a", "(Lf8/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "g", "(Lf8/r$c;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lf8/k$a;", "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;", "Lf8/k;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "LA9/a;", "webRtcManagerBridge", "", "d", "(Lf8/k$a;LA9/a;)V", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "c", "(Lf8/k$a;)Lkotlin/jvm/functions/Function1;", "Landroid/content/Context;", "context", "renderContext", "renderProps", "useVideoCapture", "e", "(Landroid/content/Context;Lf8/k$a;Lcom/withpersona/sdk2/inquiry/selfie/p$b;Z)V", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$a;", "f", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;)Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$a;", "selfie_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class q {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cameraError", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.jvm.internal.l implements Function1<Throwable, Unit> {
        final ka.k<p.Input, SelfieState, p.AbstractC0527c, Object>.a d;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0178a extends kotlin.jvm.internal.l implements Function1<r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c, Unit> {
            final Throwable d;

            C0178a(Throwable th) {
                super(1);
                this.d = th;
            }

            public final void a(@NotNull r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(new p.AbstractC0527c.Error(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + this.d.getClass().getCanonicalName())));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c, Unit> {
            public static final b d = new b();

            b() {
                super(1);
            }

            public final void a(@NotNull r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(new p.AbstractC0527c.Error(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class c extends kotlin.jvm.internal.l implements Function1<r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c, Unit> {
            public static final c d = new c();

            c() {
                super(1);
            }

            public final void a(@NotNull r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                s.a(cVar.c());
                cVar.e(new SelfieState.RestartCamera(false, false, q.a(cVar, false), 3, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class d extends kotlin.jvm.internal.l implements Function1<r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c, Unit> {
            public static final d d = new d();

            d() {
                super(1);
            }

            public final void a(@NotNull r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(new p.AbstractC0527c.Error(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class e extends kotlin.jvm.internal.l implements Function1<r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c, Unit> {
            public static final e d = new e();

            e() {
                super(1);
            }

            public final void a(@NotNull r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                s.a(cVar.c());
                cVar.e(new SelfieState.RestartCamera(false, false, q.a(cVar, false), 3, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        a(ka.k<? super p.Input, SelfieState, ? extends p.AbstractC0527c, ? extends Object>.a aVar) {
            super(1);
            this.d = aVar;
        }

        public final void a(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "cameraError");
            if (!(th instanceof AbstractC0622i)) {
                this.d.b().d(C0562B.c(null, new C0178a(th), 1, null));
                return;
            }
            AbstractC0622i abstractC0622i = (AbstractC0622i) th;
            if (abstractC0622i instanceof B) {
                return;
            }
            if (abstractC0622i instanceof C) {
                this.d.b().d(C0562B.c(null, b.d, 1, null));
                return;
            }
            if (abstractC0622i instanceof F) {
                this.d.b().d(C0562B.c(null, c.d, 1, null));
            } else if (abstractC0622i instanceof N) {
                this.d.b().d(C0562B.c(null, d.d, 1, null));
            } else if (abstractC0622i instanceof E) {
                this.d.b().d(C0562B.c(null, e.d, 1, null));
            }
        }

        public Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends kotlin.jvm.internal.l implements Function1<r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c, Unit> {
        final A9.a d;

        b(A9.a aVar) {
            super(1);
            this.d = aVar;
        }

        public final void a(@NotNull r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            SelfieState backState = cVar.c().getBackState();
            A9.a aVar = this.d;
            if (aVar != null) {
                aVar.c();
            }
            if (backState != null) {
                backState.p(true);
                cVar.e(backState);
            } else if (cVar.b().getBackStepEnabled()) {
                cVar.d(p.AbstractC0527c.a.a);
            } else {
                cVar.d(p.AbstractC0527c.b.a);
            }
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends kotlin.jvm.internal.l implements Function1<r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c, Unit> {
        final List<Q8.l> d;

        c(List<? extends Q8.l> list) {
            super(1);
            this.d = list;
        }

        public final void a(@NotNull r<? super p.Input, SelfieState, ? extends p.AbstractC0527c>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            SelfieState selfieStateC = cVar.c();
            if (selfieStateC instanceof SelfieState.WaitForCameraFeed) {
                cVar.e(SelfieState.WaitForCameraFeed.r((SelfieState.WaitForCameraFeed) selfieStateC, !this.d.contains(Q8.l.d), !this.d.contains(Q8.l.e), null, null, null, 28, null));
            } else {
                s.a(cVar.c());
                cVar.e(new SelfieState.RestartCamera(false, false, q.a(cVar, false), 3, null));
            }
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    public static final SelfieState a(@NotNull r<?, SelfieState, ?>.c cVar, boolean z) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return z ? cVar.c() : cVar.c().getBackState();
    }

    public static SelfieState b(r.c cVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return a(cVar, z);
    }

    @NotNull
    public static final Function1<Throwable, Unit> c(@NotNull ka.k<? super p.Input, SelfieState, ? extends p.AbstractC0527c, ? extends Object>.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new a(aVar);
    }

    public static final void d(@NotNull ka.k<? super p.Input, SelfieState, ? extends p.AbstractC0527c, ? extends Object>.a aVar, A9.a aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.b().d(C0562B.c(null, new b(aVar2), 1, null));
    }

    public static final void e(@NotNull Context context, @NotNull ka.k<? super p.Input, SelfieState, ? extends p.AbstractC0527c, ? extends Object>.a aVar, @NotNull p.Input input, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aVar, "renderContext");
        Intrinsics.checkNotNullParameter(input, "renderProps");
        List listO = CollectionsKt.o(new Q8.l[]{Q8.l.d});
        if (z && C0456d.f(context) && input.getVideoCaptureConfig().getRecordAudio()) {
            listO.add(Q8.l.e);
        }
        List<Q8.l> listA = com.withpersona.sdk2.inquiry.permissions.d.a(context, listO);
        if (listA.isEmpty()) {
            return;
        }
        aVar.b().d(C0562B.c(null, new c(listA), 1, null));
    }

    @NotNull
    public static final p.AbstractC0528d.a.AssetOverrides f(@NotNull p.Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        NextStep.Selfie.AssetConfig.RecordPage recordPage = input.getAssetConfig().getRecordPage();
        RemoteImage selfieLeftPictograph = recordPage != null ? recordPage.getSelfieLeftPictograph() : null;
        NextStep.Selfie.AssetConfig.RecordPage recordPage2 = input.getAssetConfig().getRecordPage();
        return new p.AbstractC0528d.a.AssetOverrides(selfieLeftPictograph, recordPage2 != null ? recordPage2.getSelfieRightPictograph() : null);
    }

    @NotNull
    public static final SelfieState g(@NotNull r<? super p.Input, SelfieState, ?>.c cVar, @NotNull List<? extends Selfie> list, String str, @NotNull CameraProperties cameraProperties, long j, SelfieState selfieState) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "selfies");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Selfie selfie = (Selfie) obj;
            if (selfie instanceof Selfie.SelfieImage ? cVar.b().getPoseConfigs().a(((Selfie.SelfieImage) selfie).getPose()).getAllowReview() : false) {
                arrayList.add(obj);
            }
        }
        return !arrayList.isEmpty() ? new SelfieState.ReviewCaptures(list, arrayList, str, cameraProperties, j, selfieState) : new SelfieState.Submit(list, str, cameraProperties, j, selfieState);
    }
}
