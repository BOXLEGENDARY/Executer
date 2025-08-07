package P9;

import P9.p;
import android.content.Context;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.ImageLightCondition;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.HoldStillHint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.LowLightHint;
import ka.g;
import ka.i;
import ka.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u5.D;
import u5.w;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u0000 &2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003\u0012!#B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010%¨\u0006'"}, d2 = {"LA8/a;", "Lf8/o;", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "Landroid/content/Context;", "context", "Ll8/w;", "governmentIdFeed", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "<init>", "(Landroid/content/Context;Ll8/w;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)V", "Ll8/D;", "it", "LA8/a$c;", "d", "(Ll8/D;)LA8/a$c;", "otherWorker", "", "a", "(Lf8/o;)Z", "Lka/g;", "run", "()Lka/g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Landroid/content/Context;", "c", "Ll8/w;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "e", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class GovernmentIdHintWorker implements o<Hint> {

    @NotNull
    private final Context context;

    @NotNull
    private final w governmentIdFeed;

    @NotNull
    private final IdConfig.b side;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LA8/a$b;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "LA8/a;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)LA8/a;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface b {
        @NotNull
        GovernmentIdHintWorker a(@NotNull IdConfig.b side);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LA8/a$c;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "hint", "", "minDurationMs", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "()Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "b", "J", "()J", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    private static final class HintEvent {

        @NotNull
        private final Hint hint;

        private final long minDurationMs;

        public HintEvent(@NotNull Hint hint, long j) {
            Intrinsics.checkNotNullParameter(hint, "hint");
            this.hint = hint;
            this.minDurationMs = j;
        }

        @NotNull
        public final Hint getHint() {
            return this.hint;
        }

        public final long getMinDurationMs() {
            return this.minDurationMs;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HintEvent)) {
                return false;
            }
            HintEvent hintEvent = (HintEvent) other;
            return Intrinsics.b(this.hint, hintEvent.hint) && this.minDurationMs == hintEvent.minDurationMs;
        }

        public int hashCode() {
            return (this.hint.hashCode() * 31) + Long.hashCode(this.minDurationMs);
        }

        @NotNull
        public String toString() {
            return "HintEvent(hint=" + this.hint + ", minDurationMs=" + this.minDurationMs + ")";
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1", f = "GovernmentIdHintWorker.kt", l = {92}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class h extends k implements Function2<ka.h<? super Hint>, Continuation<? super Unit>, Object> {
        int d;
        private Object e;
        final g<HintEvent> i;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA8/a$c;", "eventHint", "", "a", "(LA8/a$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0001a<T> implements ka.h {
            final ka.h<Hint> d;

            @f(c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1$1", f = "GovernmentIdHintWorker.kt", l = {93, 94}, m = "emit")
            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            static final class C0002a extends d {
                Object d;
                Object e;
                final C0001a<T> i;
                int v;

                C0002a(C0001a<? super T> c0001a, Continuation<? super C0002a> continuation) {
                    super(continuation);
                    this.i = c0001a;
                }

                public final Object invokeSuspend(@NotNull Object obj) {
                    this.e = obj;
                    this.v |= Integer.MIN_VALUE;
                    return this.i.c(null, this);
                }
            }

            C0001a(ka.h<? super Hint> hVar) {
                this.d = hVar;
            }

            public final java.lang.Object c(P9.GovernmentIdHintWorker.HintEvent r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                throw new UnsupportedOperationException("Method not decompiled: P9.GovernmentIdHintWorker.h.C0001a.c(A8.a$c, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        h(g<HintEvent> gVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.i = gVar;
        }

        public final Object invoke(@NotNull ka.h<? super Hint> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            h hVar = new h(this.i, continuation);
            hVar.e = obj;
            return hVar;
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                ka.h hVar = (ka.h) this.e;
                g gVarJ = i.j(this.i);
                C0001a c0001a = new C0001a(hVar);
                this.d = 1;
                if (gVarJ.a(c0001a, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            return Unit.a;
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$hintFlow$1", f = "GovernmentIdHintWorker.kt", l = {76}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "LA8/a$c;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0324e extends k implements Function2<ka.h<? super HintEvent>, Continuation<? super Unit>, Object> {
        int d;
        private Object e;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LP9/o;", "Ll8/D;", "result", "", "c", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class o<T> implements ka.h {
            final ka.h<HintEvent> d;
            final GovernmentIdHintWorker e;

            o(ka.h<? super HintEvent> hVar, GovernmentIdHintWorker governmentIdHintWorker) {
                this.d = hVar;
                this.e = governmentIdHintWorker;
            }

            public final Object c(@NotNull Object obj, @NotNull Continuation<? super Unit> continuation) {
                Object objJ = ((P9.o) obj).j();
                ka.h<HintEvent> hVar = this.d;
                GovernmentIdHintWorker governmentIdHintWorker = this.e;
                if (P9.o.e(objJ) == null) {
                    Object objC = hVar.c(governmentIdHintWorker.d((D) objJ), continuation);
                    if (objC == S9.b.c()) {
                        return objC;
                    }
                } else {
                    Object objC2 = hVar.c((Object) null, continuation);
                    if (objC2 == S9.b.c()) {
                        return objC2;
                    }
                }
                return Unit.a;
            }
        }

        C0324e(Continuation<? super C0324e> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull ka.h<? super HintEvent> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            C0324e c0324e = GovernmentIdHintWorker.this.new C0324e(continuation);
            c0324e.e = obj;
            return c0324e;
        }

        public final Object invokeSuspend(@NotNull Object obj) throws d {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                ka.h hVar = (ka.h) this.e;
                w wVar = GovernmentIdHintWorker.this.governmentIdFeed;
                o oVar = new o(hVar, GovernmentIdHintWorker.this);
                this.d = 1;
                if (wVar.a(oVar, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            throw new d();
        }
    }

    public GovernmentIdHintWorker(@NotNull Context context, @NotNull w wVar, @NotNull IdConfig.b bVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wVar, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(bVar, "side");
        this.context = context;
        this.governmentIdFeed = wVar;
        this.side = bVar;
    }

    public final HintEvent d(D it) {
        if (it instanceof D.ParsedIdSide) {
            return new HintEvent(HoldStillHint.d, 1000L);
        }
        ImageLightCondition imageLightCondition = it.getImageLightCondition();
        if (imageLightCondition == null) {
            return null;
        }
        boolean z = imageLightCondition.getRmsContrast() < 0.2d || imageLightCondition.getLowHighContrast() < 0.2d;
        boolean z2 = imageLightCondition.getRmsContrast() > 0.3d && imageLightCondition.getLowHighContrast() > 0.5d;
        if ((imageLightCondition.getLuminosity() >= 0.34d || z2) && (imageLightCondition.getLuminosity() >= 0.45d || !z)) {
            return null;
        }
        return new HintEvent(LowLightHint.d, 1000L);
    }

    @Override
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof GovernmentIdHintWorker) && ((GovernmentIdHintWorker) otherWorker).side == this.side;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdHintWorker)) {
            return false;
        }
        GovernmentIdHintWorker governmentIdHintWorker = (GovernmentIdHintWorker) other;
        return Intrinsics.b(this.context, governmentIdHintWorker.context) && Intrinsics.b(this.governmentIdFeed, governmentIdHintWorker.governmentIdFeed) && this.side == governmentIdHintWorker.side;
    }

    public int hashCode() {
        return (((this.context.hashCode() * 31) + this.governmentIdFeed.hashCode()) * 31) + this.side.hashCode();
    }

    @Override
    @NotNull
    public g<Hint> run() {
        return i.l(i.v(new h(i.v(new C0324e(null)), null)));
    }

    @NotNull
    public String toString() {
        return "GovernmentIdHintWorker(context=" + this.context + ", governmentIdFeed=" + this.governmentIdFeed + ", side=" + this.side + ")";
    }
}
