package ka;

import P9.o;
import S9.b;
import com.roblox.client.personasdk.R;
import ha.m;
import ha.n;
import ka.g;
import ka.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a{\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00060\u00052$\u0010\t\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00060\bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a[\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u00052\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"T", "PropsT", "StateT", "OutputT", "Lka/g;", "Lf8/h;", "Lf8/r;", "actionSink", "Lkotlin/Function1;", "handler", "", "a", "(Lka/g;Lf8/h;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "action", "b", "(Lf8/h;Lf8/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wf1-workflow-core"}, k = 5, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48, xs = "com/squareup/workflow1/Workflows")
final class y {

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"f8/y$a", "Lka/h;", "value", "", "c", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class a<T> implements h<T> {
        final InterfaceC0570h d;
        final Function1 e;

        public a(InterfaceC0570h interfaceC0570h, Function1 function1) {
            this.d = interfaceC0570h;
            this.e = function1;
        }

        public Object c(T t, @NotNull Continuation<? super Unit> continuation) {
            Object objM = w.m(this.d, (r) this.e.invoke(t), continuation);
            return objM == b.c() ? objM : Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u0007\u001a\u00020\u0006*\u00180\u0005R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"f8/y$b", "Lf8/r;", "", "toString", "()Ljava/lang/String;", "Lf8/r$c;", "", "a", "(Lf8/r$c;)V", "wf1-workflow-core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class sendAndAwaitApplication<OutputT, PropsT, StateT> extends r<PropsT, StateT, OutputT> {
        final r<PropsT, StateT, OutputT> c;
        final m<Unit> d;

        sendAndAwaitApplication(r<? super PropsT, StateT, ? extends OutputT> rVar, m<? super Unit> mVar) {
            this.c = rVar;
            this.d = mVar;
        }

        @Override
        public void a(@NotNull r<? super PropsT, StateT, ? extends OutputT>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            if (this.d.b()) {
                this.c.a(cVar);
                m<Unit> mVar = this.d;
                o.a aVar = o.e;
                mVar.resumeWith(o.b(Unit.a));
            }
        }

        @NotNull
        public String toString() {
            return "sendAndAwaitApplication(" + this.c + ')';
        }
    }

    public static final <T, PropsT, StateT, OutputT> Object a(@NotNull g<? extends T> gVar, @NotNull InterfaceC0570h<? super r<? super PropsT, StateT, ? extends OutputT>> interfaceC0570h, @NotNull Function1<? super T, ? extends r<? super PropsT, StateT, ? extends OutputT>> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objA = gVar.a(new a(interfaceC0570h, function1), continuation);
        return objA == b.c() ? objA : Unit.a;
    }

    public static final <PropsT, StateT, OutputT> Object b(@NotNull InterfaceC0570h<? super r<? super PropsT, StateT, ? extends OutputT>> interfaceC0570h, @NotNull r<? super PropsT, StateT, ? extends OutputT> rVar, @NotNull Continuation<? super Unit> continuation) {
        n nVar = new n(b.b(continuation), 1);
        nVar.C();
        interfaceC0570h.d(new sendAndAwaitApplication(rVar, nVar));
        Object objZ = nVar.z();
        if (objZ == b.c()) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return objZ == b.c() ? objZ : Unit.a;
    }
}
