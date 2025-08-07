package g8;

import aa.n;
import aa.o;
import com.roblox.client.personasdk.R;
import ha.L;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import ka.InterfaceC0563a;
import ka.Snapshot;
import ka.q;
import ka.r;
import ka.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005Ji\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\t\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\b*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\t2\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013JQ\u0010\u0019\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00072\u0006\u0010\u0014\u001a\u00028\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00028\u00010\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ[\u0010\u001f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00072\u0006\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u00012\u001e\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u001e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u008d\u0001\u0010&\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\b\"\u0004\b\u0003\u0010!2\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u00012\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020$22\u0010\u0018\u001a.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\t\u0012\u0004\u0012\u00028\u00030\u001e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010'J=\u0010)\u001a\u0004\u0018\u00010\u0015\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u001d\u001a\u00028\u00002\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00150(2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010+¨\u0006,"}, d2 = {"Lg8/b;", "Lf8/t;", "", "interceptors", "<init>", "(Ljava/util/List;)V", "P", "S", "O", "Lf8/t$b;", "inner", "g", "(Lf8/t$b;Lf8/t$b;)Lf8/t$b;", "Lha/L;", "workflowScope", "Lf8/t$c;", "session", "", "a", "(Lha/L;Lf8/t$c;)V", "props", "Lf8/i;", "snapshot", "Lkotlin/Function2;", "proceed", "c", "(Ljava/lang/Object;Lf8/i;Lkotlin/jvm/functions/Function2;Lf8/t$c;)Ljava/lang/Object;", "old", "new", "state", "Lkotlin/Function3;", "d", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Laa/n;Lf8/t$c;)Ljava/lang/Object;", "R", "renderProps", "renderState", "Lf8/a;", "context", "b", "(Ljava/lang/Object;Ljava/lang/Object;Lf8/a;Laa/n;Lf8/t$c;)Ljava/lang/Object;", "Lkotlin/Function1;", "e", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lf8/t$c;)Lf8/i;", "Ljava/util/List;", "wf1-workflow-runtime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class C0577b implements t {

    @NotNull
    private final List<t> interceptors;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"P", "S", "props", "Lf8/i;", "snapshot", "a", "(Ljava/lang/Object;Lf8/i;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class a<P, S> extends kotlin.jvm.internal.l implements Function2<P, Snapshot, S> {
        final t d;
        final Function2<P, Snapshot, S> e;
        final t.c i;

        a(t tVar, Function2<? super P, ? super Snapshot, ? extends S> function2, t.c cVar) {
            super(2);
            this.d = tVar;
            this.e = function2;
            this.i = cVar;
        }

        public final S invoke(P p, Snapshot snapshot) {
            return (S) this.d.c(p, snapshot, this.e, this.i);
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\b\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "S", "P", "old", "new", "state", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    static final class C0230b<P, S> extends kotlin.jvm.internal.l implements n<P, P, S, S> {
        final t d;
        final n<P, P, S, S> e;
        final t.c i;

        C0230b(t tVar, n<? super P, ? super P, ? super S, ? extends S> nVar, t.c cVar) {
            super(3);
            this.d = tVar;
            this.e = nVar;
            this.i = cVar;
        }

        public final S invoke(P p, P p2, S s) {
            return (S) this.d.d(p, p2, s, this.e, this.i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"P", "S", "O", "R", "props", "state", "Lf8/t$b;", "outerContextInterceptor", "a", "(Ljava/lang/Object;Ljava/lang/Object;Lf8/t$b;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class c<O, P, R, S> extends kotlin.jvm.internal.l implements n<P, S, t.b<P, S, O>, R> {
        final t d;
        final InterfaceC0563a<P, S, O> e;
        final t.c i;
        final C0577b v;
        final n<P, S, t.b<P, S, O>, R> w;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"P", "S", "O", "R", "p", "s", "Lf8/t$b;", "innerContextInterceptor", "a", "(Ljava/lang/Object;Ljava/lang/Object;Lf8/t$b;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
        static final class a extends kotlin.jvm.internal.l implements n<P, S, t.b<P, S, O>, R> {
            final C0577b d;
            final t.b<P, S, O> e;
            final n<P, S, t.b<P, S, O>, R> i;

            a(C0577b c0577b, t.b<P, S, O> bVar, n<? super P, ? super S, ? super t.b<P, S, O>, ? extends R> nVar) {
                super(3);
                this.d = c0577b;
                this.e = bVar;
                this.i = nVar;
            }

            public final R invoke(P p, S s, t.b<P, S, O> bVar) {
                return (R) this.i.invoke(p, s, this.d.g(this.e, bVar));
            }
        }

        c(t tVar, InterfaceC0563a<? extends P, S, ? super O> interfaceC0563a, t.c cVar, C0577b c0577b, n<? super P, ? super S, ? super t.b<P, S, O>, ? extends R> nVar) {
            super(3);
            this.d = tVar;
            this.e = interfaceC0563a;
            this.i = cVar;
            this.v = c0577b;
            this.w = nVar;
        }

        public final R invoke(P p, S s, t.b<P, S, O> bVar) {
            return (R) this.d.b(p, s, this.e, new a(this.v, bVar, this.w), this.i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "state", "Lf8/i;", "a", "(Ljava/lang/Object;)Lf8/i;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class d<S> extends kotlin.jvm.internal.l implements Function1<S, Snapshot> {
        final t d;
        final Function1<S, Snapshot> e;
        final t.c i;

        d(t tVar, Function1<? super S, Snapshot> function1, t.c cVar) {
            super(1);
            this.d = tVar;
            this.e = function1;
            this.i = cVar;
        }

        public final Snapshot invoke(S s) {
            return this.d.e(s, this.e, this.i);
        }
    }

    @Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001JO\u0010\u0007\u001a\u00020\u00052\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00022$\u0010\u0006\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJÇ\u0001\u0010\u0013\u001a\u00028\u0005\"\u0004\b\u0003\u0010\t\"\u0004\b\u0004\u0010\n\"\u0004\b\u0005\u0010\u000b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f2\u0006\u0010\u000e\u001a\u00028\u00032\u0006\u0010\u0010\u001a\u00020\u000f2$\u0010\u0011\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00020\u00042T\u0010\u0006\u001aP\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u000f\u0012\"\u0012 \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00020\u0004\u0012\u0004\u0012\u00028\u00050\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014Jh\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u001c\u0010\u0017\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00042.\u0010\u0006\u001a*\u0012\u0004\u0012\u00020\u000f\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0004\u0012\u0004\u0012\u00020\u00050\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR/\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00018\u0006¢\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"g8/b$e", "Lf8/t$b;", "Lf8/r;", "action", "Lkotlin/Function1;", "", "proceed", "a", "(Lf8/r;Lkotlin/jvm/functions/Function1;)V", "CP", "CO", "CR", "Lf8/q;", "child", "childProps", "", "key", "handler", "Lkotlin/Function4;", "b", "(Lf8/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Laa/o;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "", "sideEffect", "Lkotlin/Function2;", "c", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lf8/t$b;", "getOuter", "()Lf8/t$b;", "getOuter$annotations", "()V", "outer", "wf1-workflow-runtime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class e<O, P, S> implements t.b<P, S, O> {

        @NotNull
        private final t.b<P, S, O> outer;
        final t.b<P, S, O> b;
        final t.b<P, S, O> c;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"P", "S", "O", "Lf8/r;", "interceptedAction", "", "a", "(Lf8/r;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super P, S, ? extends O>, Unit> {
            final t.b<P, S, O> d;
            final Function1<r<? super P, S, ? extends O>, Unit> e;

            a(t.b<P, S, O> bVar, Function1<? super r<? super P, S, ? extends O>, Unit> function1) {
                super(1);
                this.d = bVar;
                this.e = function1;
            }

            public final void a(@NotNull r<? super P, S, ? extends O> rVar) {
                Intrinsics.checkNotNullParameter(rVar, "interceptedAction");
                this.d.a(rVar, this.e);
            }

            public Object invoke(Object obj) {
                a((r) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000e\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0004\"\u0004\b\u0005\u0010\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00062\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2$\u0010\r\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f0\u000bH\n¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"CP", "CO", "CR", "P", "S", "O", "Lf8/q;", "c", "p", "", "k", "Lkotlin/Function1;", "Lf8/r;", "h", "a", "(Lf8/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
        static final class C0231b<CO, CP, CR> extends kotlin.jvm.internal.l implements o<q<? super CP, ? extends CO, ? extends CR>, CP, String, Function1<? super CO, ? extends r<? super P, S, ? extends O>>, CR> {
            final t.b<P, S, O> d;
            final o<q<? super CP, ? extends CO, ? extends CR>, CP, String, Function1<? super CO, ? extends r<? super P, S, ? extends O>>, CR> e;

            C0231b(t.b<P, S, O> bVar, o<? super q<? super CP, ? extends CO, ? extends CR>, ? super CP, ? super String, ? super Function1<? super CO, ? extends r<? super P, S, ? extends O>>, ? extends CR> oVar) {
                super(4);
                this.d = bVar;
                this.e = oVar;
            }

            public final CR h(@NotNull q<? super CP, ? extends CO, ? extends CR> qVar, CP cp, @NotNull String str, @NotNull Function1<? super CO, ? extends r<? super P, S, ? extends O>> function1) {
                Intrinsics.checkNotNullParameter(qVar, "c");
                Intrinsics.checkNotNullParameter(str, "k");
                Intrinsics.checkNotNullParameter(function1, "h");
                return (CR) this.d.b(qVar, cp, str, function1, this.e);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"P", "S", "O", "", "iKey", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "iSideEffect", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
        static final class c extends kotlin.jvm.internal.l implements Function2<String, Function1<? super Continuation<? super Unit>, ? extends Object>, Unit> {
            final t.b<P, S, O> d;
            final Function2<String, Function1<? super Continuation<? super Unit>, ? extends Object>, Unit> e;

            c(t.b<P, S, O> bVar, Function2<? super String, ? super Function1<? super Continuation<? super Unit>, ? extends Object>, Unit> function2) {
                super(2);
                this.d = bVar;
                this.e = function2;
            }

            public final void a(@NotNull String str, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> function1) {
                Intrinsics.checkNotNullParameter(str, "iKey");
                Intrinsics.checkNotNullParameter(function1, "iSideEffect");
                this.d.c(str, function1, this.e);
            }

            public Object invoke(Object obj, Object obj2) {
                a((String) obj, (Function1) obj2);
                return Unit.a;
            }
        }

        e(t.b<P, S, O> bVar, t.b<P, S, O> bVar2) {
            this.b = bVar;
            this.c = bVar2;
            Intrinsics.d(bVar);
            this.outer = bVar;
        }

        @Override
        public void a(@NotNull r<? super P, S, ? extends O> action, @NotNull Function1<? super r<? super P, S, ? extends O>, Unit> proceed) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            this.outer.a(action, new a(this.c, proceed));
        }

        @Override
        public <CP, CO, CR> CR b(@NotNull q<? super CP, ? extends CO, ? extends CR> child, CP childProps, @NotNull String key, @NotNull Function1<? super CO, ? extends r<? super P, S, ? extends O>> handler, @NotNull o<? super q<? super CP, ? extends CO, ? extends CR>, ? super CP, ? super String, ? super Function1<? super CO, ? extends r<? super P, S, ? extends O>>, ? extends CR> proceed) {
            Intrinsics.checkNotNullParameter(child, "child");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            return (CR) this.outer.b(child, childProps, key, handler, new C0231b(this.c, proceed));
        }

        @Override
        public void c(@NotNull String key, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> sideEffect, @NotNull Function2<? super String, ? super Function1<? super Continuation<? super Unit>, ? extends Object>, Unit> proceed) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            this.outer.c(key, sideEffect, new c(this.c, proceed));
        }
    }

    public C0577b(@NotNull List<? extends t> list) {
        Intrinsics.checkNotNullParameter(list, "interceptors");
        this.interceptors = list;
    }

    public final <P, S, O> t.b<P, S, O> g(t.b<P, S, O> bVar, t.b<P, S, O> bVar2) {
        if (bVar == null && bVar2 == null) {
            return null;
        }
        return bVar == null ? bVar2 : bVar2 == null ? bVar : new e(bVar, bVar2);
    }

    @Override
    public void a(@NotNull L workflowScope, @NotNull t.c session) {
        Intrinsics.checkNotNullParameter(workflowScope, "workflowScope");
        Intrinsics.checkNotNullParameter(session, "session");
        Iterator<T> it = this.interceptors.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(workflowScope, session);
        }
    }

    @Override
    public <P, S, O, R> R b(P renderProps, S renderState, @NotNull InterfaceC0563a<? extends P, S, ? super O> context, @NotNull n<? super P, ? super S, ? super t.b<P, S, O>, ? extends R> proceed, @NotNull t.c session) {
        n<? super P, ? super S, ? super t.b<P, S, O>, ? extends R> nVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        Intrinsics.checkNotNullParameter(session, "session");
        List<t> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<t> listIterator = list.listIterator(list.size());
            while (true) {
                nVar = proceed;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                proceed = new c<>(listIterator.previous(), context, session, this, nVar);
            }
            proceed = nVar;
        }
        return (R) proceed.invoke(renderProps, renderState, (Object) null);
    }

    @Override
    public <P, S> S c(P props, Snapshot snapshot, @NotNull Function2<? super P, ? super Snapshot, ? extends S> proceed, @NotNull t.c session) {
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        Intrinsics.checkNotNullParameter(session, "session");
        List<t> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<t> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                proceed = new a(listIterator.previous(), proceed, session);
            }
        }
        return (S) proceed.invoke(props, snapshot);
    }

    @Override
    public <P, S> S d(P old, P p, S state, @NotNull n<? super P, ? super P, ? super S, ? extends S> proceed, @NotNull t.c session) {
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        Intrinsics.checkNotNullParameter(session, "session");
        List<t> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<t> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                proceed = new C0230b(listIterator.previous(), proceed, session);
            }
        }
        return (S) proceed.invoke(old, p, state);
    }

    @Override
    public <S> Snapshot e(S state, @NotNull Function1<? super S, Snapshot> proceed, @NotNull t.c session) {
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        Intrinsics.checkNotNullParameter(session, "session");
        List<t> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<t> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                proceed = new d(listIterator.previous(), proceed, session);
            }
        }
        return (Snapshot) proceed.invoke(state);
    }
}
