package android.view;

import P9.p;
import S9.b;
import android.view.AbstractC1694h;
import com.github.luben.zstd.BuildConfig;
import ha.D0;
import ha.L;
import ha.N;
import ha.c0;
import ha.g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/i;", "Landroidx/lifecycle/l;", "Landroidx/lifecycle/h;", "lifecycle", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroidx/lifecycle/h;Lkotlin/coroutines/CoroutineContext;)V", BuildConfig.FLAVOR, "b", "()V", "Landroidx/lifecycle/o;", "source", "Landroidx/lifecycle/h$a;", "event", "j", "(Landroidx/lifecycle/o;Landroidx/lifecycle/h$a;)V", "d", "Landroidx/lifecycle/h;", "a", "()Landroidx/lifecycle/h;", "e", "Lkotlin/coroutines/CoroutineContext;", "H0", "()Lkotlin/coroutines/CoroutineContext;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LifecycleCoroutineScopeImpl extends AbstractC1695i implements InterfaceC1698l {

    private final AbstractC1694h lifecycle;

    private final CoroutineContext coroutineContext;

    @f(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", BuildConfig.FLAVOR, "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends k implements Function2<L, Continuation<? super Unit>, Object> {

        int f11300d;

        private Object f11301e;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = LifecycleCoroutineScopeImpl.this.new a(continuation);
            aVar.f11301e = obj;
            return aVar;
        }

        public final Object invoke(L l7, Continuation<? super Unit> continuation) {
            return create(l7, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            b.c();
            if (this.f11300d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            L l7 = (L) this.f11301e;
            if (LifecycleCoroutineScopeImpl.this.getLifecycle().getState().compareTo(AbstractC1694h.b.INITIALIZED) >= 0) {
                LifecycleCoroutineScopeImpl.this.getLifecycle().a(LifecycleCoroutineScopeImpl.this);
            } else {
                D0.d(l7.H0(), (CancellationException) null, 1, (Object) null);
            }
            return Unit.a;
        }
    }

    public LifecycleCoroutineScopeImpl(AbstractC1694h abstractC1694h, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(abstractC1694h, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.lifecycle = abstractC1694h;
        this.coroutineContext = coroutineContext;
        if (getLifecycle().getState() == AbstractC1694h.b.DESTROYED) {
            D0.d(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }

    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public AbstractC1694h getLifecycle() {
        return this.lifecycle;
    }

    public final void b() {
        g.d(this, c0.c().B1(), (N) null, new a(null), 2, (Object) null);
    }

    @Override
    public void j(InterfaceC1701o source, AbstractC1694h.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (getLifecycle().getState().compareTo(AbstractC1694h.b.DESTROYED) <= 0) {
            getLifecycle().d(this);
            D0.d(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }
}
