package ka;

import aa.n;
import com.roblox.client.personasdk.R;
import ka.t;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ak\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\u00020\u00042\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"P", "S", "O", "R", "Lf8/t;", "Lf8/k;", "workflow", "Lf8/t$c;", "workflowSession", "a", "(Lf8/t;Lf8/k;Lf8/t$c;)Lf8/k;", "wf1-workflow-runtime"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class u {

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0001J!\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJC\u0010\u0010\u001a\u00028\u00032\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00012\"\u0010\u000f\u001a\u001e0\u000eR\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"f8/u$a", "Lf8/k;", "props", "Lf8/i;", "snapshot", "d", "(Ljava/lang/Object;Lf8/i;)Ljava/lang/Object;", "old", "new", "state", "e", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "renderProps", "renderState", "Lf8/k$a;", "context", "f", "(Ljava/lang/Object;Ljava/lang/Object;Lf8/k$a;)Ljava/lang/Object;", "g", "(Ljava/lang/Object;)Lf8/i;", "", "toString", "()Ljava/lang/String;", "wf1-workflow-runtime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class InterceptedWorkflow<O, P, R, S> extends k<P, S, O, R> {
        final t a;
        final k<P, S, O, R> b;
        final t.c c;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
        class C0227a extends j implements Function2<P, Snapshot, S> {
            C0227a(Object obj) {
                super(2, obj, k.class, "initialState", "initialState(Ljava/lang/Object;Lcom/squareup/workflow1/Snapshot;)Ljava/lang/Object;", 0);
            }

            public final S invoke(P p, Snapshot snapshot) {
                return (S) ((k) ((kotlin.jvm.internal.d) this).receiver).d(p, snapshot);
            }
        }

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
        class b extends j implements n<P, P, S, S> {
            b(Object obj) {
                super(3, obj, k.class, "onPropsChanged", "onPropsChanged(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
            }

            public final S invoke(P p, P p2, S s) {
                return (S) ((k) ((kotlin.jvm.internal.d) this).receiver).e(p, p2, s);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"P", "S", "O", "R", "props", "state", "Lf8/t$b;", "interceptor", "a", "(Ljava/lang/Object;Ljava/lang/Object;Lf8/t$b;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
        static final class c extends l implements n<P, S, t.b<P, S, O>, R> {
            final k<P, S, O, R>.a d;
            final k<P, S, O, R> e;
            final InterceptedWorkflow i;

            c(k<? super P, S, ? extends O, ? extends R>.a aVar, k<? super P, S, ? extends O, ? extends R> kVar, InterceptedWorkflow interceptedWorkflow) {
                super(3);
                this.d = aVar;
                this.e = kVar;
                this.i = interceptedWorkflow;
            }

            public final R invoke(P p, S s, t.b<P, S, O> bVar) {
                InterfaceC0563a c0566d = bVar == null ? null : new C0566d(this.d, bVar);
                if (c0566d == null) {
                    c0566d = this.d;
                }
                return this.e.f(p, s, w.a(c0566d, this.i));
            }
        }

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
        class d extends j implements Function1<S, Snapshot> {
            d(Object obj) {
                super(1, obj, k.class, "snapshotState", "snapshotState(Ljava/lang/Object;)Lcom/squareup/workflow1/Snapshot;", 0);
            }

            public final Snapshot invoke(S s) {
                return ((k) ((kotlin.jvm.internal.d) this).receiver).g(s);
            }
        }

        InterceptedWorkflow(t tVar, k<? super P, S, ? extends O, ? extends R> kVar, t.c cVar) {
            this.a = tVar;
            this.b = kVar;
            this.c = cVar;
        }

        @Override
        public S d(P props, Snapshot snapshot) {
            return (S) this.a.c(props, snapshot, new C0227a(this.b), this.c);
        }

        @Override
        public S e(P old, P p, S state) {
            return (S) this.a.d(old, p, state, new b(this.b), this.c);
        }

        @Override
        public R f(P renderProps, S renderState, @NotNull k<? super P, S, ? extends O, ? extends R>.a context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return (R) this.a.b(renderProps, renderState, context, new c(context, this.b, this), this.c);
        }

        @Override
        public Snapshot g(S state) {
            return this.a.e(state, new d(this.b), this.c);
        }

        @NotNull
        public String toString() {
            return "InterceptedWorkflow(" + this.b + ", " + this + "@intercept)";
        }
    }

    @NotNull
    public static final <P, S, O, R> k<P, S, O, R> a(@NotNull t tVar, @NotNull k<? super P, S, ? extends O, ? extends R> kVar, @NotNull t.c cVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(kVar, "workflow");
        Intrinsics.checkNotNullParameter(cVar, "workflowSession");
        return tVar == C0567e.a ? kVar : new InterceptedWorkflow(tVar, kVar, cVar);
    }
}
