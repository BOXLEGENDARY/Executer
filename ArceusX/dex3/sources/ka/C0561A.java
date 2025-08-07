package ka;

import P9.p;
import S9.b;
import com.roblox.client.personasdk.R;
import ha.K;
import ha.L;
import ka.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.l;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aU\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u00032$\u0010\b\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00060\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0011\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"OutputT", "Lf8/o;", "worker", "", "renderKey", "Lf8/h;", "Lf8/r;", "", "actionSink", "", "d", "(Lf8/o;Ljava/lang/String;Lf8/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Lka/g;", "c", "(Lf8/o;)Lka/g;", "key", "b", "(Lf8/o;Ljava/lang/String;)Ljava/lang/String;", "wf1-workflow-core"}, k = 5, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48, xs = "com/squareup/workflow1/Workflows")
final class C0561A {

    @f(c = "com.squareup.workflow1.Workflows__WorkerWorkflowKt$runWorker$2", f = "WorkerWorkflow.kt", l = {78}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"OutputT", "Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class a extends k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final o<OutputT> e;
        final InterfaceC0570h<r<? super o<? extends OutputT>, Integer, ? extends OutputT>> i;
        final String v;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"OutputT", "output", "Lf8/r;", "Lf8/o;", "", "a", "(Ljava/lang/Object;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
        static final class C0223a<OutputT> extends l implements Function1<OutputT, r<? super o<? extends OutputT>, Integer, ? extends OutputT>> {
            final o<OutputT> d;
            final String e;

            C0223a(o<? extends OutputT> oVar, String str) {
                super(1);
                this.d = oVar;
                this.e = str;
            }

            @NotNull
            public final r<o<? extends OutputT>, Integer, OutputT> invoke(OutputT outputt) {
                return new C0564b(this.d, this.e, outputt);
            }
        }

        a(o<? extends OutputT> oVar, InterfaceC0570h<? super r<? super o<? extends OutputT>, Integer, ? extends OutputT>> interfaceC0570h, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.e = oVar;
            this.i = interfaceC0570h;
            this.v = str;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.e, this.i, this.v, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                g gVarC = C0561A.c(this.e);
                InterfaceC0570h<r<? super o<? extends OutputT>, Integer, ? extends OutputT>> interfaceC0570h = this.i;
                C0223a c0223a = new C0223a(this.e, this.v);
                this.d = 1;
                if (w.i(gVarC, interfaceC0570h, c0223a, this) == objC) {
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

    private static final String b(o<?> oVar, String str) {
        String string = oVar.toString();
        if (StringsKt.Y(str)) {
            return string;
        }
        return string + ':' + str;
    }

    public static final <T> g<T> c(o<? extends T> oVar) {
        g<? extends T> gVarRun = oVar.run();
        if (gVarRun != null) {
            return gVarRun;
        }
        throw new NullPointerException("Worker " + oVar + " returned a null Flow. If this is a test mock, make sure you mock the run() method!");
    }

    public static final <OutputT> Object d(@NotNull o<? extends OutputT> oVar, @NotNull String str, @NotNull InterfaceC0570h<? super r<? super o<? extends OutputT>, Integer, ? extends OutputT>> interfaceC0570h, @NotNull Continuation<? super Unit> continuation) {
        Object objG = ha.g.g(new K(b(oVar, str)), new a(oVar, interfaceC0570h, str, null), continuation);
        return objG == b.c() ? objG : Unit.a;
    }
}
