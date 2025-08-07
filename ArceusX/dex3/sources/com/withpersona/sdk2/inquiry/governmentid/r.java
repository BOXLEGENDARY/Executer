package com.withpersona.sdk2.inquiry.governmentid;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.o;
import ha.C0327b;
import ka.C0562B;
import ka.r;
import ka.w;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;
import v8.EnumC0834b;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022&\u0010\n\u001a\"0\u0004R\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001aU\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022&\u0010\n\u001a\"0\u0004R\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "renderState", "Lf8/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lf8/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "context", "LC8/b;", "videoCaptureHelper", "", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lf8/k$a;LC8/b;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "autoClassifyWorkerFactory", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lf8/k$a;LC8/b;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;)V", "government-id_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class r {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
        public static final a d = new a();

        a() {
            super(1);
        }

        public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            GovernmentIdState governmentIdStateC = cVar.c();
            GovernmentIdState.ReviewImageState reviewImageState = governmentIdStateC instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) governmentIdStateC : null;
            if (reviewImageState == null) {
                return;
            }
            cVar.e(reviewImageState.s(true));
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends kotlin.jvm.internal.l implements Function1<AutoClassifyWorker.c, ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;
        final C0327b e;
        final o.C0520a i;
        final GovernmentIdState.ReviewImageState v;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;
            final AutoClassifyWorker.c e;
            final C0327b i;

            a(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, AutoClassifyWorker.c cVar, C0327b c0327b) {
                super(1);
                this.d = aVar;
                this.e = cVar;
                this.i = c0327b;
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                p.p(this.d, new o.AbstractC0521b.c(((AutoClassifyWorker.c.a) this.e).getCause()), this.i);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0123b extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;
            final o.C0520a e;
            final GovernmentIdState.ReviewImageState i;
            final AutoClassifyWorker.a v;
            final C0327b w;

            C0123b(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, o.C0520a c0520a, GovernmentIdState.ReviewImageState reviewImageState, AutoClassifyWorker.a aVar2, C0327b c0327b) {
                super(1);
                this.d = aVar;
                this.e = c0520a;
                this.i = reviewImageState;
                this.v = aVar2;
                this.w = c0327b;
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                GovernmentIdState governmentIdStateC = cVar.c();
                GovernmentIdState.ReviewImageState reviewImageState = governmentIdStateC instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) governmentIdStateC : null;
                if (reviewImageState == null) {
                    return;
                }
                cVar.e(reviewImageState.s(false));
                p.n(reviewImageState, this.d, this.e, this.i.getIdForReview(), ((AutoClassifyWorker.a.C0111a) this.v).getIdConfig(), this.w, new CameraProperties(null, null, null, 0, 15, null), (1536 & 128) != 0, (1536 & 256) != 0 ? reviewImageState.k() : ((AutoClassifyWorker.a.C0111a) this.v).getIdConfig().b(), (1536 & 512) != 0 ? reviewImageState.getPartIndex() : 0, (1536 & 1024) != 0 ? null : null);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class c extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final GovernmentIdState.ReviewImageState d;
            final AutoClassifyWorker.a e;

            c(GovernmentIdState.ReviewImageState reviewImageState, AutoClassifyWorker.a aVar) {
                super(1);
                this.d = reviewImageState;
                this.e = aVar;
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                GovernmentIdState governmentIdStateC = cVar.c();
                GovernmentIdState.ReviewImageState reviewImageState = governmentIdStateC instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) governmentIdStateC : null;
                if (reviewImageState == null) {
                    return;
                }
                cVar.e(new GovernmentIdState.AutoClassificationError(reviewImageState.getCurrentPart(), reviewImageState.l(), reviewImageState.k(), reviewImageState.getPartIndex(), p.b(cVar, false), this.d.getIdForReview().b1(), new CameraProperties(null, null, null, 0, 15, null), ((AutoClassifyWorker.a.b) this.e).a(), null, null, EnumC0834b.d, 768, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class d extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final GovernmentIdState.ReviewImageState d;
            final AutoClassifyWorker.a e;

            d(GovernmentIdState.ReviewImageState reviewImageState, AutoClassifyWorker.a aVar) {
                super(1);
                this.d = reviewImageState;
                this.e = aVar;
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                GovernmentIdState governmentIdStateC = cVar.c();
                GovernmentIdState.ReviewImageState reviewImageState = governmentIdStateC instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) governmentIdStateC : null;
                if (reviewImageState == null) {
                    return;
                }
                cVar.e(new GovernmentIdState.AutoClassificationError(reviewImageState.getCurrentPart(), reviewImageState.l(), reviewImageState.k(), reviewImageState.getPartIndex(), p.b(cVar, false), this.d.getIdForReview().b1(), new CameraProperties(null, null, null, 0, 15, null), ((AutoClassifyWorker.a.c) this.e).a(), null, null, EnumC0834b.e, 768, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        b(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, C0327b c0327b, o.C0520a c0520a, GovernmentIdState.ReviewImageState reviewImageState) {
            super(1);
            this.d = aVar;
            this.e = c0327b;
            this.i = c0520a;
            this.v = reviewImageState;
        }

        @NotNull
        public final ka.r<o.C0520a, GovernmentIdState, o.AbstractC0521b> invoke(@NotNull AutoClassifyWorker.c cVar) throws P9.m {
            Intrinsics.checkNotNullParameter(cVar, "it");
            if (cVar instanceof AutoClassifyWorker.c.a) {
                return C0562B.c(null, new a(this.d, cVar, this.e), 1, null);
            }
            if (!(cVar instanceof AutoClassifyWorker.c.b)) {
                throw new P9.m();
            }
            AutoClassifyWorker.a autoClassificationResult = ((AutoClassifyWorker.c.b) cVar).getAutoClassificationResult();
            if (autoClassificationResult instanceof AutoClassifyWorker.a.C0111a) {
                return C0562B.c(null, new C0123b(this.d, this.i, this.v, autoClassificationResult, this.e), 1, null);
            }
            if (autoClassificationResult instanceof AutoClassifyWorker.a.b) {
                return C0562B.c(null, new c(this.v, autoClassificationResult), 1, null);
            }
            if (autoClassificationResult instanceof AutoClassifyWorker.a.c) {
                return C0562B.c(null, new d(this.v, autoClassificationResult), 1, null);
            }
            throw new P9.m();
        }
    }

    public static final void a(@NotNull o.C0520a c0520a, @NotNull GovernmentIdState.ReviewImageState reviewImageState, @NotNull ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, @NotNull C0327b c0327b) {
        Intrinsics.checkNotNullParameter(c0520a, "renderProps");
        Intrinsics.checkNotNullParameter(reviewImageState, "renderState");
        Intrinsics.checkNotNullParameter(aVar, "context");
        Intrinsics.checkNotNullParameter(c0327b, "videoCaptureHelper");
        CaptureConfig captureConfig = reviewImageState.getCaptureConfig();
        if (captureConfig instanceof CaptureConfig.AutoClassifyConfig) {
            aVar.b().d(C0562B.c(null, a.d, 1, null));
        } else if (captureConfig instanceof CaptureConfig.IdCaptureConfig) {
            p.n(reviewImageState, aVar, c0520a, reviewImageState.getIdForReview(), ((CaptureConfig.IdCaptureConfig) captureConfig).getId(), c0327b, reviewImageState.getCameraProperties(), (1536 & 128) != 0, (1536 & 256) != 0 ? reviewImageState.k() : null, (1536 & 512) != 0 ? reviewImageState.getPartIndex() : 0, (1536 & 1024) != 0 ? null : null);
        }
    }

    public static final void b(@NotNull o.C0520a c0520a, @NotNull GovernmentIdState.ReviewImageState reviewImageState, @NotNull ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, @NotNull C0327b c0327b, @NotNull AutoClassifyWorker.b bVar) {
        Intrinsics.checkNotNullParameter(c0520a, "renderProps");
        Intrinsics.checkNotNullParameter(reviewImageState, "renderState");
        Intrinsics.checkNotNullParameter(aVar, "context");
        Intrinsics.checkNotNullParameter(c0327b, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(bVar, "autoClassifyWorkerFactory");
        w.l(aVar, bVar.a(c0520a.getSessionToken(), c0520a.getInquiryId(), c0520a.getFromStep(), c0520a.getFromComponent(), reviewImageState.getIdForReview(), new AutoClassifyWorker.SupplementaryData(), c0520a.getManualCaptureButtonDelayMs(), c0520a.getAutoClassificationConfig().getExtractTextFromImage()), z.j(AutoClassifyWorker.class), "", new b(aVar, c0327b, c0520a, reviewImageState));
    }
}
