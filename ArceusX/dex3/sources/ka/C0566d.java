package ka;

import P9.p;
import aa.o;
import com.roblox.client.personasdk.R;
import ha.L;
import ha.M;
import ka.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u0005B;\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\u00020\r2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJq\u0010\u001a\u001a\u00028\u0005\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u0011\"\u0004\b\u0005\u0010\u00122\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00132\u0006\u0010\u0015\u001a\u00028\u00032\u0006\u0010\u0017\u001a\u00020\u00162$\u0010\u0019\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ>\u0010!\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010#R&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R,\u0010'\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lf8/d;", "P", "S", "O", "Lf8/a;", "Lf8/h;", "Lf8/r;", "baseRenderContext", "Lf8/t$b;", "interceptor", "<init>", "(Lf8/a;Lf8/t$b;)V", "value", "", "f", "(Lf8/r;)V", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Lf8/q;", "child", "props", "", "key", "Lkotlin/Function1;", "handler", "c", "(Lf8/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lha/L;", "Lkotlin/coroutines/Continuation;", "", "sideEffect", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lf8/a;", "b", "Lf8/t$b;", "()Lf8/h;", "actionSink", "wf1-workflow-runtime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
final class C0566d<P, S, O> implements InterfaceC0563a<P, S, O>, InterfaceC0570h<r<? super P, S, ? extends O>> {

    @NotNull
    private final InterfaceC0563a<P, S, O> baseRenderContext;

    @NotNull
    private final t.b<P, S, O> interceptor;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000e\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0004\"\u0004\b\u0005\u0010\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00062\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2$\u0010\r\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f0\u000bH\n¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"ChildPropsT", "ChildOutputT", "ChildRenderingT", "P", "S", "O", "Lf8/q;", "iChild", "iProps", "", "iKey", "Lkotlin/Function1;", "Lf8/r;", "iHandler", "a", "(Lf8/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class a<ChildOutputT, ChildPropsT, ChildRenderingT> extends l implements o<q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT>, ChildPropsT, String, Function1<? super ChildOutputT, ? extends r<? super P, S, ? extends O>>, ChildRenderingT> {
        final C0566d<P, S, O> d;

        a(C0566d<P, S, O> c0566d) {
            super(4);
            this.d = c0566d;
        }

        public final ChildRenderingT h(@NotNull q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> qVar, ChildPropsT childpropst, @NotNull String str, @NotNull Function1<? super ChildOutputT, ? extends r<? super P, S, ? extends O>> function1) {
            Intrinsics.checkNotNullParameter(qVar, "iChild");
            Intrinsics.checkNotNullParameter(str, "iKey");
            Intrinsics.checkNotNullParameter(function1, "iHandler");
            return (ChildRenderingT) ((C0566d) this.d).baseRenderContext.c(qVar, childpropst, str, function1);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"P", "S", "O", "", "iKey", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "iSideEffect", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class b extends l implements Function2<String, Function1<? super Continuation<? super Unit>, ? extends Object>, Unit> {
        final C0566d<P, S, O> d;

        @f(c = "com.squareup.workflow1.InterceptedRenderContext$runningSideEffect$1$1", f = "WorkflowInterceptor.kt", l = {306}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"P", "S", "O", "Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
        static final class a extends k implements Function2<L, Continuation<? super Unit>, Object> {
            int d;
            final Function1<Continuation<? super Unit>, Object> e;

            a(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.e = function1;
            }

            @NotNull
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.e, continuation);
            }

            public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
                return create(l, continuation).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                Object objC = S9.b.c();
                int i = this.d;
                if (i == 0) {
                    p.b(obj);
                    Function1<Continuation<? super Unit>, Object> function1 = this.e;
                    this.d = 1;
                    if (function1.invoke(this) == objC) {
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

        b(C0566d<P, S, O> c0566d) {
            super(2);
            this.d = c0566d;
        }

        public final void a(@NotNull String str, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> function1) {
            Intrinsics.checkNotNullParameter(str, "iKey");
            Intrinsics.checkNotNullParameter(function1, "iSideEffect");
            ((C0566d) this.d).baseRenderContext.a(str, new a(function1, null));
        }

        public Object invoke(Object obj, Object obj2) {
            a((String) obj, (Function1) obj2);
            return Unit.a;
        }
    }

    @f(c = "com.squareup.workflow1.InterceptedRenderContext$runningSideEffect$withScopeReceiver$1", f = "WorkflowInterceptor.kt", l = {301}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004H\u008a@"}, d2 = {"<anonymous>", "", "P", "S", "O"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    static final class c extends k implements Function1<Continuation<? super Unit>, Object> {
        int d;
        final Function2<L, Continuation<? super Unit>, Object> e;
        final C0566d<P, S, O> i;

        c(Function2<? super L, ? super Continuation<? super Unit>, ? extends Object> function2, C0566d<P, S, O> c0566d, Continuation<? super c> continuation) {
            super(1, continuation);
            this.e = function2;
            this.i = c0566d;
        }

        public final Object invoke(Continuation<? super Unit> continuation) {
            return create(continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new c(this.e, this.i, continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                Function2<L, Continuation<? super Unit>, Object> function2 = this.e;
                L lA = M.a(getContext());
                this.d = 1;
                if (function2.invoke(lA, this) == objC) {
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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"P", "S", "O", "Lf8/r;", "interceptedAction", "", "a", "(Lf8/r;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class C0225d extends l implements Function1<r<? super P, S, ? extends O>, Unit> {
        final C0566d<P, S, O> d;

        C0225d(C0566d<P, S, O> c0566d) {
            super(1);
            this.d = c0566d;
        }

        public final void a(@NotNull r<? super P, S, ? extends O> rVar) {
            Intrinsics.checkNotNullParameter(rVar, "interceptedAction");
            ((C0566d) this.d).baseRenderContext.b().d(rVar);
        }

        public Object invoke(Object obj) {
            a((r) obj);
            return Unit.a;
        }
    }

    public C0566d(@NotNull InterfaceC0563a<? extends P, S, ? super O> interfaceC0563a, @NotNull t.b<P, S, O> bVar) {
        Intrinsics.checkNotNullParameter(interfaceC0563a, "baseRenderContext");
        Intrinsics.checkNotNullParameter(bVar, "interceptor");
        this.baseRenderContext = interfaceC0563a;
        this.interceptor = bVar;
    }

    @Override
    public void a(@NotNull String key, @NotNull Function2<? super L, ? super Continuation<? super Unit>, ? extends Object> sideEffect) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        this.interceptor.c(key, new c(sideEffect, this, null), new b(this));
    }

    @Override
    @NotNull
    public InterfaceC0570h<r<? super P, S, ? extends O>> b() {
        return this;
    }

    @Override
    public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT c(@NotNull q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, @NotNull String key, @NotNull Function1<? super ChildOutputT, ? extends r<? super P, S, ? extends O>> handler) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        return (ChildRenderingT) this.interceptor.b(child, props, key, handler, new a(this));
    }

    @Override
    public void d(@NotNull r<? super P, S, ? extends O> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.interceptor.a(value, new C0225d(this));
    }
}
