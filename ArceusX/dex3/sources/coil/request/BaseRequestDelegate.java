package coil.request;

import androidx.lifecycle.h;
import androidx.lifecycle.o;
import ha.InterfaceC0363n;
import ha.z0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcoil/request/BaseRequestDelegate;", "LJ1/n;", "Landroidx/lifecycle/h;", "lifecycle", "Lha/z0;", "job", "<init>", "(Landroidx/lifecycle/h;Lha/z0;)V", "", "start", "()V", "e", "a", "Landroidx/lifecycle/o;", "owner", "onDestroy", "(Landroidx/lifecycle/o;)V", "d", "Landroidx/lifecycle/h;", "Lha/z0;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BaseRequestDelegate implements InterfaceC0363n {

    @NotNull
    private final h lifecycle;

    @NotNull
    private final z0 job;

    public BaseRequestDelegate(@NotNull h hVar, @NotNull z0 z0Var) {
        this.lifecycle = hVar;
        this.job = z0Var;
    }

    public void a() {
        z0.a.a(this.job, (CancellationException) null, 1, (Object) null);
    }

    @Override
    public void e() {
        this.lifecycle.d(this);
    }

    public void onDestroy(@NotNull o owner) {
        a();
    }

    @Override
    public void start() {
        this.lifecycle.a(this);
    }
}
