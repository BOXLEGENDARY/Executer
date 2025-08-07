package Y0;

import P9.o;
import android.os.CancellationSignal;
import com.github.luben.zstd.BuildConfig;
import ha.L;
import ha.N;
import ha.r0;
import ha.z0;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y0.xyyu.hkVlaTTCDY;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LY0/f;", BuildConfig.FLAVOR, "a", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"LY0/f$a;", BuildConfig.FLAVOR, "<init>", "()V", "R", "LY0/s;", "db", BuildConfig.FLAVOR, "inTransaction", "Ljava/util/concurrent/Callable;", "callable", "b", "(LY0/s;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "a", "(LY0/s;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lha/L;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C0060a<R> extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super R>, Object> {

            int f8052d;

            final Callable<R> f8053e;

            C0060a(Callable<R> callable, Continuation<? super C0060a> continuation) {
                super(2, continuation);
                this.f8053e = callable;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0060a(this.f8053e, continuation);
            }

            public final Object invoke(L l7, Continuation<? super R> continuation) {
                return create(l7, continuation).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object obj) {
                S9.b.c();
                if (this.f8052d != 0) {
                    throw new IllegalStateException(hkVlaTTCDY.oOvMCEUahOjM);
                }
                P9.p.b(obj);
                return this.f8053e.call();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", BuildConfig.FLAVOR, "it", BuildConfig.FLAVOR, "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<Throwable, Unit> {

            final CancellationSignal f8054d;

            final z0 f8055e;

            b(CancellationSignal cancellationSignal, z0 z0Var) {
                super(1);
                this.f8054d = cancellationSignal;
                this.f8055e = z0Var;
            }

            public final void a(Throwable th) {
                CancellationSignal cancellationSignal = this.f8054d;
                if (cancellationSignal != null) {
                    c1.b.a(cancellationSignal);
                }
                z0.a.a(this.f8055e, (CancellationException) null, 1, (Object) null);
            }

            public Object invoke(Object obj) {
                a((Throwable) obj);
                return Unit.a;
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lha/L;", BuildConfig.FLAVOR, "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {

            int f8056d;

            final Callable<R> f8057e;

            final ha.m<R> f8058i;

            c(Callable<R> callable, ha.m<? super R> mVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f8057e = callable;
                this.f8058i = mVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f8057e, this.f8058i, continuation);
            }

            public final Object invoke(L l7, Continuation<? super Unit> continuation) {
                return create(l7, continuation).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object obj) {
                S9.b.c();
                if (this.f8056d != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P9.p.b(obj);
                try {
                    this.f8058i.resumeWith(P9.o.b(this.f8057e.call()));
                } catch (Throwable th) {
                    ha.m<R> mVar = this.f8058i;
                    o.a aVar = P9.o.e;
                    mVar.resumeWith(P9.o.b(P9.p.a(th)));
                }
                return Unit.a;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <R> Object a(s sVar, boolean z7, CancellationSignal cancellationSignal, Callable<R> callable, Continuation<? super R> continuation) {
            kotlin.coroutines.d dVarB;
            if (sVar.y() && sVar.s()) {
                return callable.call();
            }
            z zVar = (z) continuation.getContext().e(z.INSTANCE);
            if (zVar == null || (dVarB = zVar.getTransactionDispatcher()) == null) {
                dVarB = z7 ? g.b(sVar) : g.a(sVar);
            }
            kotlin.coroutines.d dVar = dVarB;
            ha.n nVar = new ha.n(S9.b.b(continuation), 1);
            nVar.C();
            nVar.g(new b(cancellationSignal, ha.g.d(r0.d, dVar, (N) null, new c(callable, nVar, null), 2, (Object) null)));
            Object objZ = nVar.z();
            if (objZ == S9.b.c()) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            return objZ;
        }

        public final <R> Object b(s sVar, boolean z7, Callable<R> callable, Continuation<? super R> continuation) {
            kotlin.coroutines.d dVarB;
            if (sVar.y() && sVar.s()) {
                return callable.call();
            }
            z zVar = (z) continuation.getContext().e(z.INSTANCE);
            if (zVar == null || (dVarB = zVar.getTransactionDispatcher()) == null) {
                dVarB = z7 ? g.b(sVar) : g.a(sVar);
            }
            return ha.g.g(dVarB, new C0060a(callable, null), continuation);
        }

        private Companion() {
        }
    }

    public static final <R> Object a(s sVar, boolean z7, CancellationSignal cancellationSignal, Callable<R> callable, Continuation<? super R> continuation) {
        return INSTANCE.a(sVar, z7, cancellationSignal, callable, continuation);
    }

    public static final <R> Object b(s sVar, boolean z7, Callable<R> callable, Continuation<? super R> continuation) {
        return INSTANCE.b(sVar, z7, callable, continuation);
    }
}
