package ka;

import com.roblox.client.personasdk.R;
import g8.C0578c;
import g8.m;
import ha.L;
import ha.N;
import ha.g;
import ha.n0;
import java.util.List;
import java.util.concurrent.CancellationException;
import ka.K;
import ka.M;
import ka.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009e\u0001\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00130\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"PropsT", "OutputT", "RenderingT", "Lf8/q;", "workflow", "Lha/L;", "scope", "Lka/K;", "props", "Lf8/m;", "initialSnapshot", "", "Lf8/t;", "interceptors", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "onOutput", "Lf8/g;", "a", "(Lf8/q;Lha/L;Lka/K;Lf8/m;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Lka/K;", "wf1-workflow-runtime"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class C0568f {

    @f(c = "com.squareup.workflow1.RenderWorkflowKt$renderWorkflowIn$1", f = "RenderWorkflow.kt", l = {136, 145}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"PropsT", "OutputT", "RenderingT", "Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class a extends k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        private Object e;
        final m<PropsT, OutputT, RenderingT> i;
        final y<C0569g<RenderingT>> v;
        final Function2<OutputT, Continuation<? super Unit>, Object> w;

        a(m<PropsT, OutputT, RenderingT> mVar, y<C0569g<RenderingT>> yVar, Function2<? super OutputT, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.i = mVar;
            this.v = yVar;
            this.w = function2;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.i, this.v, this.w, continuation);
            aVar.e = obj;
            return aVar;
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            throw new UnsupportedOperationException("Method not decompiled: ka.C0568f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @NotNull
    public static final <PropsT, OutputT, RenderingT> K<C0569g<RenderingT>> a(@NotNull q<? super PropsT, ? extends OutputT, ? extends RenderingT> qVar, @NotNull L l, @NotNull K<? extends PropsT> k, C0573m c0573m, @NotNull List<? extends t> list, @NotNull Function2<? super OutputT, ? super Continuation<? super Unit>, ? extends Object> function2) {
        Intrinsics.checkNotNullParameter(qVar, "workflow");
        Intrinsics.checkNotNullParameter(l, "scope");
        Intrinsics.checkNotNullParameter(k, "props");
        Intrinsics.checkNotNullParameter(list, "interceptors");
        Intrinsics.checkNotNullParameter(function2, "onOutput");
        m mVar = new m(l, qVar, k, c0573m, C0578c.a(list));
        try {
            y yVarA = M.a(mVar.g());
            g.d(l, (CoroutineContext) null, (N) null, new a(mVar, yVarA, function2, null), 3, (Object) null);
            return yVarA;
        } catch (Throwable th) {
            CancellationException cancellationExceptionA = th instanceof CancellationException ? th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = n0.a("Workflow runtime failed", th);
            }
            mVar.e(cancellationExceptionA);
            throw th;
        }
    }
}
