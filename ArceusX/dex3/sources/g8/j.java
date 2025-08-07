package g8;

import P9.p;
import com.roblox.client.personasdk.R;
import g8.e;
import g8.f;
import ha.D0;
import ha.K;
import ha.L;
import ha.M;
import ha.N;
import ha.z0;
import java.util.Map;
import java.util.concurrent.CancellationException;
import ka.C0567e;
import ka.C0573m;
import ka.WorkflowOutput;
import ka.r;
import ka.s;
import ka.t;
import ka.u;
import ka.w;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0083\u0001\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001c\u001a\u00028\u00032\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n2\u0006\u0010\u001b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010 \u001a\u00020\u001f2\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n2\u0006\u0010\u001e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b \u0010!J5\u0010%\u001a\u0004\u0018\u00018\u0004\"\b\b\u0004\u0010\"*\u00020\u00122\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020#H\u0002¢\u0006\u0004\b%\u0010&J>\u0010-\u001a\u00020,2\u0006\u0010(\u001a\u00020'2\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0*\u0012\u0006\u0012\u0004\u0018\u00010\u00120)H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020'H\u0016¢\u0006\u0004\b/\u00100J3\u00102\u001a\u00028\u00032\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n2\u0006\u00101\u001a\u00028\u0000¢\u0006\u0004\b2\u0010\u001dJ%\u00103\u001a\u00020\r2\u0016\u0010\u000b\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n¢\u0006\u0004\b3\u00104J>\u00105\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020'2\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0*\u0012\u0006\u0012\u0004\u0018\u00010\u00120)H\u0016ø\u0001\u0000¢\u0006\u0004\b5\u00106J)\u0010:\u001a\u00020\u001f\"\u0004\b\u0004\u0010\"2\u0014\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0004\u0018\u00010807¢\u0006\u0004\b:\u0010;J\u001f\u0010?\u001a\u00020\u001f2\u0010\b\u0002\u0010>\u001a\n\u0018\u00010<j\u0004\u0018\u0001`=¢\u0006\u0004\b?\u0010@R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b?\u0010A\u001a\u0004\bB\u0010CR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bF\u0010HR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010O\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010U\u001a\u00020P8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR&\u0010Y\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020,0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010`\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R,\u0010d\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020#0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010f\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010_R\u0014\u0010j\u001a\u00020g8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006m"}, d2 = {"Lg8/j;", "PropsT", "StateT", "OutputT", "RenderingT", "Lha/L;", "Lg8/f$b;", "Lf8/t$c;", "Lg8/k;", "id", "Lf8/k;", "workflow", "initialProps", "Lf8/m;", "snapshot", "Lkotlin/coroutines/CoroutineContext;", "baseContext", "Lkotlin/Function1;", "", "emitOutputToParent", "parent", "Lf8/t;", "interceptor", "Lg8/d;", "idCounter", "<init>", "(Lg8/k;Lf8/k;Ljava/lang/Object;Lf8/m;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lf8/t$c;Lf8/t;Lg8/d;)V", "props", "m", "(Lf8/k;Ljava/lang/Object;)Ljava/lang/Object;", "newProps", "", "p", "(Lf8/k;Ljava/lang/Object;)V", "T", "Lf8/r;", "action", "c", "(Lf8/r;)Ljava/lang/Object;", "", "key", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "sideEffect", "Lg8/g;", "f", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lg8/g;", "toString", "()Ljava/lang/String;", "input", "l", "n", "(Lf8/k;)Lf8/m;", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lpa/c;", "Lf8/v;", "selector", "o", "(Lpa/c;)V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "d", "(Ljava/util/concurrent/CancellationException;)V", "Lg8/k;", "g", "()Lg8/k;", "e", "Lkotlin/jvm/functions/Function1;", "i", "Lf8/t$c;", "()Lf8/t$c;", "v", "Lf8/t;", "w", "Lkotlin/coroutines/CoroutineContext;", "H0", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "y", "J", "k", "()J", "sessionId", "Lg8/h;", "z", "Lg8/h;", "subtreeManager", "Lg8/a;", "A", "Lg8/a;", "sideEffects", "B", "Ljava/lang/Object;", "lastProps", "Lja/d;", "C", "Lja/d;", "eventActionsChannel", "D", "state", "Lf8/s;", "h", "()Lf8/s;", "identifier", "j", "renderKey", "wf1-workflow-runtime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class j<PropsT, StateT, OutputT, RenderingT> implements L, f.b, t.c {

    @NotNull
    private final C0576a<g> sideEffects;

    private PropsT lastProps;

    @NotNull
    private final ja.d<r<PropsT, StateT, OutputT>> eventActionsChannel;

    private StateT state;

    @NotNull
    private final WorkflowNodeId id;

    @NotNull
    private final Function1<OutputT, Object> emitOutputToParent;

    private final t.c parent;

    @NotNull
    private final t interceptor;

    @NotNull
    private final CoroutineContext coroutineContext;

    private final long sessionId;

    @NotNull
    private final h<PropsT, StateT, OutputT> subtreeManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"PropsT", "StateT", "OutputT", "RenderingT", "it", "Lf8/v;", "a", "(Ljava/lang/Object;)Lf8/v;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class a extends kotlin.jvm.internal.l implements Function1<OutputT, WorkflowOutput<? extends OutputT>> {
        public static final a d = new a();

        a() {
            super(1);
        }

        @NotNull
        public final WorkflowOutput<OutputT> invoke(OutputT outputt) {
            return new WorkflowOutput<>(outputt);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"PropsT", "StateT", "OutputT", "RenderingT", "", "Lg8/k;", "Lf8/m;", "a", "()Ljava/util/Map;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class b extends kotlin.jvm.internal.l implements Function0<Map<WorkflowNodeId, ? extends C0573m>> {
        final Map<WorkflowNodeId, C0573m> d;

        b(Map<WorkflowNodeId, C0573m> map) {
            super(0);
            this.d = map;
        }

        @NotNull
        public final Map<WorkflowNodeId, C0573m> invoke() {
            return this.d;
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    class c extends kotlin.jvm.internal.j implements Function1<r<? super PropsT, StateT, ? extends OutputT>, Object> {
        c(Object obj) {
            super(1, obj, j.class, "applyAction", "applyAction(Lcom/squareup/workflow1/WorkflowAction;)Ljava/lang/Object;", 0);
        }

        public final Object invoke(@NotNull r<? super PropsT, StateT, ? extends OutputT> rVar) {
            Intrinsics.checkNotNullParameter(rVar, "p0");
            return ((j) ((kotlin.jvm.internal.d) this).receiver).c(rVar);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.internal.WorkflowNode$tick$1$1", f = "WorkflowNode.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005H\u008a@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"T", "PropsT", "StateT", "OutputT", "RenderingT", "Lf8/r;", "action", "Lf8/v;", "<anonymous>", "(Lf8/r;)Lf8/v;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class d<T> extends kotlin.coroutines.jvm.internal.k implements Function2<r<? super PropsT, StateT, ? extends OutputT>, Continuation<? super WorkflowOutput<? extends T>>, Object> {
        int d;
        Object e;
        final j<PropsT, StateT, OutputT, RenderingT> i;

        d(j<PropsT, StateT, OutputT, RenderingT> jVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.i = jVar;
        }

        public final Object invoke(@NotNull r<? super PropsT, StateT, ? extends OutputT> rVar, Continuation<? super WorkflowOutput<? extends T>> continuation) {
            return create(rVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            d dVar = new d(this.i, continuation);
            dVar.e = obj;
            return dVar;
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            S9.b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            return this.i.c((r) this.e);
        }
    }

    public j(@NotNull WorkflowNodeId workflowNodeId, @NotNull ka.k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> kVar, PropsT propst, C0573m c0573m, @NotNull CoroutineContext coroutineContext, @NotNull Function1<? super OutputT, ? extends Object> function1, t.c cVar, @NotNull t tVar, g8.d dVar) {
        Intrinsics.checkNotNullParameter(workflowNodeId, "id");
        Intrinsics.checkNotNullParameter(kVar, "workflow");
        Intrinsics.checkNotNullParameter(coroutineContext, "baseContext");
        Intrinsics.checkNotNullParameter(function1, "emitOutputToParent");
        Intrinsics.checkNotNullParameter(tVar, "interceptor");
        this.id = workflowNodeId;
        this.emitOutputToParent = function1;
        this.parent = cVar;
        this.interceptor = tVar;
        this.coroutineContext = coroutineContext.K(D0.a(coroutineContext.e(z0.s))).K(new K(workflowNodeId.toString()));
        this.sessionId = dVar == null ? 0L : dVar.a();
        this.subtreeManager = new h<>(c0573m == null ? null : c0573m.a(), getCoroutineContext(), new c(this), this, tVar, dVar);
        this.sideEffects = new C0576a<>();
        this.lastProps = propst;
        this.eventActionsChannel = ja.g.b(Integer.MAX_VALUE, (ja.a) null, (Function1) null, 6, (Object) null);
        tVar.a(this, this);
        this.state = (StateT) u.a(tVar, kVar, this).d(propst, c0573m != null ? c0573m.b() : null);
    }

    public final <T> T c(r<? super PropsT, StateT, ? extends OutputT> action) {
        Pair pairH = w.h(action, this.lastProps, this.state);
        StateT statet = (StateT) pairH.a();
        WorkflowOutput workflowOutput = (WorkflowOutput) pairH.b();
        this.state = statet;
        if (workflowOutput == null) {
            return null;
        }
        return (T) this.emitOutputToParent.invoke(workflowOutput.a());
    }

    public static void e(j jVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        jVar.d(cancellationException);
    }

    private final g f(String key, Function2<? super L, ? super Continuation<? super Unit>, ? extends Object> sideEffect) {
        return new g(key, ha.g.d(M.i(this, new K("sideEffect[" + key + "] for " + this.id)), (CoroutineContext) null, N.e, sideEffect, 1, (Object) null));
    }

    private final RenderingT m(ka.k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> workflow, PropsT props) {
        p(workflow, props);
        f fVar = new f(this.subtreeManager, this, this.eventActionsChannel);
        RenderingT renderingt = (RenderingT) u.a(this.interceptor, workflow, this).f(props, this.state, w.a(fVar, workflow));
        fVar.f();
        this.subtreeManager.c();
        for (e.a aVarB = ((C0576a) this.sideEffects).staging.b(); aVarB != null; aVarB = aVarB.a()) {
            ((g) aVarB).getJob().start();
        }
        C0576a<g> c0576a = this.sideEffects;
        for (e.a aVarB2 = ((C0576a) c0576a).active.b(); aVarB2 != null; aVarB2 = aVarB2.a()) {
            z0.a.a(((g) aVarB2).getJob(), (CancellationException) null, 1, (Object) null);
        }
        e eVar = ((C0576a) c0576a).active;
        ((C0576a) c0576a).active = ((C0576a) c0576a).staging;
        ((C0576a) c0576a).staging = eVar;
        ((C0576a) c0576a).staging.a();
        return renderingt;
    }

    private final void p(ka.k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> workflow, PropsT newProps) {
        if (!Intrinsics.b(newProps, this.lastProps)) {
            this.state = (StateT) u.a(this.interceptor, workflow, this).e(this.lastProps, newProps, this.state);
        }
        this.lastProps = newProps;
    }

    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override
    public void a(@NotNull String key, @NotNull Function2<? super L, ? super Continuation<? super Unit>, ? extends Object> sideEffect) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        for (e.a aVarB = ((C0576a) this.sideEffects).staging.b(); aVarB != null; aVarB = aVarB.a()) {
            if (Intrinsics.b(key, ((g) aVarB).getKey())) {
                throw new IllegalArgumentException(("Expected side effect keys to be unique: \"" + key + '\"').toString());
            }
        }
        C0576a<g> c0576a = this.sideEffects;
        e eVar = ((C0576a) c0576a).active;
        e.a aVarB2 = eVar.b();
        e.a aVarF = null;
        e.a aVar = null;
        while (true) {
            if (aVarB2 == null) {
                break;
            }
            if (Intrinsics.b(key, ((g) aVarB2).getKey())) {
                if (aVar == null) {
                    eVar.e(aVarB2.a());
                } else {
                    aVar.b(aVarB2.a());
                }
                if (Intrinsics.b(eVar.c(), aVarB2)) {
                    eVar.f(aVar);
                }
                aVarB2.b(null);
                aVarF = aVarB2;
            } else {
                aVar = aVarB2;
                aVarB2 = aVarB2.a();
            }
        }
        if (aVarF == null) {
            aVarF = f(key, sideEffect);
        }
        ((C0576a) c0576a).staging.d(aVarF);
    }

    public final void d(CancellationException cause) {
        D0.c(getCoroutineContext(), cause);
    }

    @NotNull
    public final WorkflowNodeId getId() {
        return this.id;
    }

    @NotNull
    public s h() {
        return this.id.getIdentifier();
    }

    public t.c getParent() {
        return this.parent;
    }

    @NotNull
    public String j() {
        return this.id.getName();
    }

    public long getSessionId() {
        return this.sessionId;
    }

    public final RenderingT l(@NotNull ka.k<? super PropsT, ?, ? extends OutputT, ? extends RenderingT> workflow, PropsT input) {
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        return m(workflow, input);
    }

    @NotNull
    public final C0573m n(@NotNull ka.k<?, ?, ?, ?> workflow) {
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        return new C0573m(u.a(this.interceptor, workflow, this).g(this.state), new b(this.subtreeManager.f()));
    }

    public final <T> void o(@NotNull pa.c<? super WorkflowOutput<? extends T>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.subtreeManager.g(selector);
        selector.a(this.eventActionsChannel.c(), new d(this, null));
    }

    @NotNull
    public String toString() {
        return "WorkflowInstance(identifier=" + h() + ", renderKey=" + j() + ", instanceId=" + getSessionId() + ", parent=" + ((Object) (getParent() == null ? null : "WorkflowInstance(…)")) + ')';
    }

    public j(WorkflowNodeId workflowNodeId, ka.k kVar, Object obj, C0573m c0573m, CoroutineContext coroutineContext, Function1 function1, t.c cVar, t tVar, g8.d dVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(workflowNodeId, kVar, obj, c0573m, coroutineContext, (i & 32) != 0 ? a.d : function1, (i & 64) != 0 ? null : cVar, (i & 128) != 0 ? C0567e.a : tVar, (i & 256) != 0 ? null : dVar);
    }
}
