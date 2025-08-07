package ka;

import S9.b;
import com.roblox.client.personasdk.R;
import fa.m;
import ha.L;
import ka.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00022\u00020\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0017\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JO\u0010\u001d\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u00042(\u0010\u001c\u001a$0\u001bR \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u001a\u0010*\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)¨\u0006+"}, d2 = {"Lf8/p;", "OutputT", "Lf8/k;", "Lf8/o;", "", "", "Lf8/c;", "Lfa/m;", "workerType", "", "key", "<init>", "(Lfa/m;Ljava/lang/String;)V", "b", "()Ljava/lang/String;", "props", "Lf8/i;", "snapshot", "i", "(Lf8/o;Lf8/i;)Ljava/lang/Integer;", "old", "new", "state", "j", "(Lf8/o;Lf8/o;I)Ljava/lang/Integer;", "renderProps", "renderState", "Lf8/k$a;", "context", "k", "(Lf8/o;ILf8/k$a;)V", "l", "(I)Lf8/i;", "a", "Lfa/m;", "getWorkerType", "()Lfa/m;", "Ljava/lang/String;", "Lf8/s;", "c", "Lf8/s;", "()Lf8/s;", "realIdentifier", "wf1-workflow-core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class p<OutputT> extends k<o<? extends OutputT>, Integer, OutputT, Unit> implements InterfaceC0565c {

    @NotNull
    private final m workerType;

    @NotNull
    private final String key;

    @NotNull
    private final s realIdentifier;

    @f(c = "com.squareup.workflow1.WorkerWorkflow$render$1", f = "WorkerWorkflow.kt", l = {57}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"OutputT", "Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class a extends k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final o<OutputT> e;
        final p<OutputT> i;
        final k<o<? extends OutputT>, Integer, OutputT, Unit>.a v;

        a(o<? extends OutputT> oVar, p<OutputT> pVar, k<? super o<? extends OutputT>, Integer, ? extends OutputT, Unit>.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.e = oVar;
            this.i = pVar;
            this.v = aVar;
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
                P9.p.b(obj);
                o<OutputT> oVar = this.e;
                String str = ((p) this.i).key;
                InterfaceC0570h<r<? super o<? extends OutputT>, Integer, ? extends OutputT>> interfaceC0570hB = this.v.b();
                this.d = 1;
                if (w.k(oVar, str, interfaceC0570hB, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P9.p.b(obj);
            }
            return Unit.a;
        }
    }

    public p(@NotNull m mVar, @NotNull String str) {
        Intrinsics.checkNotNullParameter(mVar, "workerType");
        Intrinsics.checkNotNullParameter(str, "key");
        this.workerType = mVar;
        this.key = str;
        this.realIdentifier = w.n(mVar);
    }

    @Override
    @NotNull
    public String b() {
        return Intrinsics.m("worker ", this.workerType);
    }

    @Override
    @NotNull
    public s getRealIdentifier() {
        return this.realIdentifier;
    }

    @Override
    public Integer e(Object obj, Object obj2, Integer num) {
        return j((o) obj, (o) obj2, num.intValue());
    }

    @Override
    public Unit f(Object obj, Integer num, k.a aVar) {
        k((o) obj, num.intValue(), aVar);
        return Unit.a;
    }

    @Override
    public Snapshot g(Integer num) {
        return l(num.intValue());
    }

    @Override
    @NotNull
    public Integer d(@NotNull o<? extends OutputT> props, Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        return 0;
    }

    @NotNull
    public Integer j(@NotNull o<? extends OutputT> old, @NotNull o<? extends OutputT> oVar, int state) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(oVar, "new");
        if (!old.a(oVar)) {
            state++;
        }
        return Integer.valueOf(state);
    }

    public void k(@NotNull o<? extends OutputT> renderProps, int renderState, @NotNull k<? super o<? extends OutputT>, Integer, ? extends OutputT, Unit>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(context, "context");
        context.a(String.valueOf(renderState), new a(renderProps, this, context, null));
    }

    public Snapshot l(int state) {
        return null;
    }
}
