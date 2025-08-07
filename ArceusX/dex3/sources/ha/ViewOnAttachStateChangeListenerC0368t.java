package ha;

import P9.p;
import S9.b;
import android.view.View;
import coil.request.ViewTargetRequestDelegate;
import ha.N;
import ha.T;
import ha.c0;
import ha.g;
import ha.r0;
import ha.z0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import okio.C0412j;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"LJ1/t;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lha/T;", "LJ1/h;", "job", "LJ1/s;", "b", "(Lha/T;)LJ1/s;", "", "a", "()V", "Lcoil/request/ViewTargetRequestDelegate;", "request", "c", "(Lcoil/request/ViewTargetRequestDelegate;)V", "v", "onViewAttachedToWindow", "onViewDetachedFromWindow", "d", "Landroid/view/View;", "e", "LJ1/s;", "currentDisposable", "Lha/z0;", "i", "Lha/z0;", "pendingClear", "Lcoil/request/ViewTargetRequestDelegate;", "currentRequest", "", "w", "Z", "isRestart", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewOnAttachStateChangeListenerC0368t implements View.OnAttachStateChangeListener {

    @NotNull
    private final View view;

    private s currentDisposable;

    private z0 pendingClear;

    private ViewTargetRequestDelegate currentRequest;

    private boolean isRestart;

    @f(c = "coil.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {2, 0, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;

        L(Continuation<? super L> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ViewOnAttachStateChangeListenerC0368t.this.new L(continuation);
        }

        public final Object invoke(ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            ViewOnAttachStateChangeListenerC0368t.this.c(null);
            return Unit.a;
        }
    }

    public ViewOnAttachStateChangeListenerC0368t(@NotNull View view) {
        this.view = view;
    }

    public final synchronized void a() {
        try {
            z0 z0Var = this.pendingClear;
            if (z0Var != null) {
                z0.a.a(z0Var, (CancellationException) null, 1, (Object) null);
            }
            this.pendingClear = g.d(r0.d, c0.c().B1(), (N) null, new L(null), 2, (Object) null);
            this.currentDisposable = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @NotNull
    public final synchronized s b(@NotNull T<? extends AbstractC0357h> job) {
        s sVar = this.currentDisposable;
        if (sVar != null && C0412j.r() && this.isRestart) {
            this.isRestart = false;
            sVar.a(job);
            return sVar;
        }
        z0 z0Var = this.pendingClear;
        if (z0Var != null) {
            z0.a.a(z0Var, (CancellationException) null, 1, (Object) null);
        }
        this.pendingClear = null;
        s sVar2 = new s(this.view, job);
        this.currentDisposable = sVar2;
        return sVar2;
    }

    public final void c(ViewTargetRequestDelegate request) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.currentRequest;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.a();
        }
        this.currentRequest = request;
    }

    @Override
    public void onViewAttachedToWindow(@NotNull View v) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.currentRequest;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.isRestart = true;
        viewTargetRequestDelegate.b();
    }

    @Override
    public void onViewDetachedFromWindow(@NotNull View v) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.currentRequest;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.a();
        }
    }
}
