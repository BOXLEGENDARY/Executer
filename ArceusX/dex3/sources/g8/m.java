package g8;

import P9.p;
import com.roblox.client.personasdk.R;
import ha.L;
import ja.u;
import java.util.concurrent.CancellationException;
import ka.C0569g;
import ka.C0573m;
import ka.K;
import ka.WorkflowOutput;
import ka.q;
import ka.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004BI\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010 \u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000(8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b)\u0010*\u0012\u0004\b+\u0010,R0\u00100\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lg8/m;", "PropsT", "OutputT", "RenderingT", "", "Lha/L;", "scope", "Lf8/q;", "protoWorkflow", "Lka/K;", "props", "Lf8/m;", "snapshot", "Lf8/t;", "interceptor", "<init>", "(Lha/L;Lf8/q;Lka/K;Lf8/m;Lf8/t;)V", "Lf8/g;", "g", "()Lf8/g;", "Lf8/v;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "e", "(Ljava/util/concurrent/CancellationException;)V", "Lf8/k;", "a", "Lf8/k;", "workflow", "Lg8/d;", "b", "Lg8/d;", "idCounter", "c", "Ljava/lang/Object;", "currentProps", "Lja/u;", "d", "Lja/u;", "getPropsChannel$annotations", "()V", "propsChannel", "Lg8/j;", "Lg8/j;", "rootNode", "wf1-workflow-runtime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class m<PropsT, OutputT, RenderingT> {

    @NotNull
    private final ka.k<PropsT, ?, OutputT, RenderingT> workflow;

    @NotNull
    private final d idCounter;

    private PropsT currentProps;

    @NotNull
    private final u<PropsT> propsChannel;

    @NotNull
    private final j<PropsT, ? extends Object, OutputT, RenderingT> rootNode;

    @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.internal.WorkflowRunner$nextOutput$2$1", f = "WorkflowRunner.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"PropsT", "OutputT", "RenderingT", "Lja/h;", "channelResult", "Lf8/v;", "<anonymous>", "(Lja/h;)Lf8/v;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<ja.h<? extends PropsT>, Continuation<? super WorkflowOutput<? extends OutputT>>, Object> {
        int d;
        Object e;
        final m<PropsT, OutputT, RenderingT> i;

        a(m<PropsT, OutputT, RenderingT> mVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.i = mVar;
        }

        public final Object a(@NotNull Object obj, Continuation<? super WorkflowOutput<? extends OutputT>> continuation) {
            return create(ja.h.b(obj), continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.i, continuation);
            aVar.e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return a(((ja.h) obj).k(), (Continuation) obj2);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            S9.b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            Object objK = ((ja.h) this.e).k();
            Throwable thE = ja.h.e(objK);
            if (thE != null) {
                throw thE;
            }
            Object objF = ja.h.f(objK);
            if (objF == null) {
                return null;
            }
            m<PropsT, OutputT, RenderingT> mVar = this.i;
            if (Intrinsics.b(((m) mVar).currentProps, objF)) {
                return null;
            }
            ((m) mVar).currentProps = objF;
            return null;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.internal.WorkflowRunner$propsChannel$1", f = "WorkflowRunner.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "PropsT", "OutputT", "RenderingT", "it"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.k implements Function2<PropsT, Continuation<? super Boolean>, Object> {
        int d;
        Object e;
        final m<PropsT, OutputT, RenderingT> i;

        b(m<PropsT, OutputT, RenderingT> mVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.i = mVar;
        }

        public final Object invoke(PropsT propst, Continuation<? super Boolean> continuation) {
            return create(propst, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.i, continuation);
            bVar.e = obj;
            return bVar;
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            S9.b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(Intrinsics.b(this.e, ((m) this.i).currentProps));
        }
    }

    public m(@NotNull L l, @NotNull q<? super PropsT, ? extends OutputT, ? extends RenderingT> qVar, @NotNull K<? extends PropsT> k, C0573m c0573m, @NotNull t tVar) {
        Intrinsics.checkNotNullParameter(l, "scope");
        Intrinsics.checkNotNullParameter(qVar, "protoWorkflow");
        Intrinsics.checkNotNullParameter(k, "props");
        Intrinsics.checkNotNullParameter(tVar, "interceptor");
        ka.k<? super PropsT, ?, ? extends OutputT, ? extends RenderingT> kVarA = qVar.a();
        this.workflow = kVarA;
        d dVar = new d();
        this.idCounter = dVar;
        this.currentProps = (PropsT) k.getValue();
        this.propsChannel = ka.i.D(ka.i.n(k, new b(this, null)), l);
        this.rootNode = new j<>(l.b(kVarA, null, 1, null), kVarA, this.currentProps, c0573m, l.H0(), null, null, tVar, dVar, 96, null);
    }

    public final void e(CancellationException cause) {
        this.rootNode.d(cause);
    }

    public final Object f(@NotNull Continuation<? super WorkflowOutput<? extends OutputT>> continuation) {
        pa.d dVar = new pa.d(continuation);
        try {
            if (!this.propsChannel.a()) {
                dVar.a(this.propsChannel.d(), new a(this, null));
            }
            this.rootNode.o(dVar);
        } catch (Throwable th) {
            dVar.F(th);
        }
        Object objE = dVar.E();
        if (objE == S9.b.c()) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return objE;
    }

    @NotNull
    public final C0569g<RenderingT> g() {
        return new C0569g<>(this.rootNode.l(this.workflow, this.currentProps), this.rootNode.n(this.workflow));
    }
}
