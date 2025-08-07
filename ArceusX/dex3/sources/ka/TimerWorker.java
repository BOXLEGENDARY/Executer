package ka;

import P9.p;
import S9.b;
import com.roblox.client.personasdk.R;
import ha.W;
import ka.g;
import ka.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lf8/l;", "Lf8/o;", "", "", "delayMs", "", "key", "<init>", "(JLjava/lang/String;)V", "Lka/g;", "run", "()Lka/g;", "otherWorker", "", "a", "(Lf8/o;)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "J", "c", "Ljava/lang/String;", "wf1-workflow-core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
final class TimerWorker implements o<Unit> {

    private final long delayMs;

    @NotNull
    private final String key;

    @f(c = "com.squareup.workflow1.TimerWorker$run$1", f = "Worker.kt", l = {339, 340}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lka/h;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class h extends k implements Function2<ka.h<? super Unit>, Continuation<? super Unit>, Object> {
        int d;
        private Object e;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull ka.h<? super Unit> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            h hVar = TimerWorker.this.new h(continuation);
            hVar.e = obj;
            return hVar;
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            ka.h hVar;
            Object objC = b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                hVar = (ka.h) this.e;
                long j = TimerWorker.this.delayMs;
                this.e = hVar;
                this.d = 1;
                if (W.a(j, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                    return Unit.a;
                }
                hVar = (ka.h) this.e;
                p.b(obj);
            }
            Unit unit = Unit.a;
            this.e = null;
            this.d = 2;
            if (hVar.c(unit, this) == objC) {
                return objC;
            }
            return Unit.a;
        }
    }

    public TimerWorker(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.delayMs = j;
        this.key = str;
    }

    @Override
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof TimerWorker) && Intrinsics.b(((TimerWorker) otherWorker).key, this.key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerWorker)) {
            return false;
        }
        TimerWorker timerWorker = (TimerWorker) other;
        return this.delayMs == timerWorker.delayMs && Intrinsics.b(this.key, timerWorker.key);
    }

    public int hashCode() {
        return (Long.hashCode(this.delayMs) * 31) + this.key.hashCode();
    }

    @Override
    @NotNull
    public g<Unit> run() {
        return i.v(new h(null));
    }

    @NotNull
    public String toString() {
        return "TimerWorker(delayMs=" + this.delayMs + ", key=" + this.key + ')';
    }
}
