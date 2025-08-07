package coil.request;

import L1.b;
import androidx.lifecycle.h;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import ha.C0356g;
import ha.InterfaceC0363n;
import ha.InterfaceC0883h;
import ha.z0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import okio.C0412j;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcoil/request/ViewTargetRequestDelegate;", "LJ1/n;", "Lz1/h;", "imageLoader", "LJ1/g;", "initialRequest", "LL1/b;", "target", "Landroidx/lifecycle/h;", "lifecycle", "Lha/z0;", "job", "<init>", "(Lz1/h;LJ1/g;LL1/b;Landroidx/lifecycle/h;Lha/z0;)V", "", "b", "()V", "m", "start", "a", "Landroidx/lifecycle/o;", "owner", "onDestroy", "(Landroidx/lifecycle/o;)V", "d", "Lz1/h;", "e", "LJ1/g;", "i", "LL1/b;", "v", "Landroidx/lifecycle/h;", "w", "Lha/z0;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewTargetRequestDelegate implements InterfaceC0363n {

    @NotNull
    private final InterfaceC0883h imageLoader;

    @NotNull
    private final C0356g initialRequest;

    @NotNull
    private final b<?> target;

    @NotNull
    private final h lifecycle;

    @NotNull
    private final z0 job;

    public ViewTargetRequestDelegate(@NotNull InterfaceC0883h interfaceC0883h, @NotNull C0356g c0356g, @NotNull b<?> bVar, @NotNull h hVar, @NotNull z0 z0Var) {
        this.imageLoader = interfaceC0883h;
        this.initialRequest = c0356g;
        this.target = bVar;
        this.lifecycle = hVar;
        this.job = z0Var;
    }

    public void a() {
        z0.a.a(this.job, (CancellationException) null, 1, (Object) null);
        n nVar = this.target;
        if (nVar instanceof n) {
            this.lifecycle.d(nVar);
        }
        this.lifecycle.d(this);
    }

    public final void b() {
        this.imageLoader.a(this.initialRequest);
    }

    @Override
    public void m() {
        if (this.target.getView().isAttachedToWindow()) {
            return;
        }
        C0412j.l(this.target.getView()).c(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    public void onDestroy(@NotNull o owner) {
        C0412j.l(this.target.getView()).a();
    }

    @Override
    public void start() {
        this.lifecycle.a(this);
        n nVar = this.target;
        if (nVar instanceof n) {
            coil.lifecycle.h.b(this.lifecycle, nVar);
        }
        C0412j.l(this.target.getView()).c(this);
    }
}
