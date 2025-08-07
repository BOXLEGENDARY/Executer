package android.view;

import android.os.Handler;
import android.view.AbstractC1694h;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/K;", BuildConfig.FLAVOR, "Landroidx/lifecycle/o;", "provider", "<init>", "(Landroidx/lifecycle/o;)V", "Landroidx/lifecycle/h$a;", "event", BuildConfig.FLAVOR, "f", "(Landroidx/lifecycle/h$a;)V", "c", "()V", "b", "e", "d", "Landroidx/lifecycle/q;", "a", "Landroidx/lifecycle/q;", "registry", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/K$a;", "Landroidx/lifecycle/K$a;", "lastDispatchRunnable", "Landroidx/lifecycle/h;", "()Landroidx/lifecycle/h;", "lifecycle", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class C1677K {

    private final C1703q registry;

    private final Handler handler;

    private a lastDispatchRunnable;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/K$a;", "Ljava/lang/Runnable;", "Landroidx/lifecycle/q;", "registry", "Landroidx/lifecycle/h$a;", "event", "<init>", "(Landroidx/lifecycle/q;Landroidx/lifecycle/h$a;)V", BuildConfig.FLAVOR, "run", "()V", "d", "Landroidx/lifecycle/q;", "e", "Landroidx/lifecycle/h$a;", "getEvent", "()Landroidx/lifecycle/h$a;", BuildConfig.FLAVOR, "i", "Z", "wasExecuted", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Runnable {

        private final C1703q registry;

        private final AbstractC1694h.a event;

        private boolean wasExecuted;

        public a(C1703q c1703q, AbstractC1694h.a aVar) {
            Intrinsics.checkNotNullParameter(c1703q, "registry");
            Intrinsics.checkNotNullParameter(aVar, "event");
            this.registry = c1703q;
            this.event = aVar;
        }

        @Override
        public void run() {
            if (this.wasExecuted) {
                return;
            }
            this.registry.j(this.event);
            this.wasExecuted = true;
        }
    }

    public C1677K(InterfaceC1701o interfaceC1701o) {
        Intrinsics.checkNotNullParameter(interfaceC1701o, "provider");
        this.registry = new C1703q(interfaceC1701o);
        this.handler = new Handler();
    }

    private final void f(AbstractC1694h.a event) {
        a aVar = this.lastDispatchRunnable;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.registry, event);
        this.lastDispatchRunnable = aVar2;
        Handler handler = this.handler;
        Intrinsics.d(aVar2);
        handler.postAtFrontOfQueue(aVar2);
    }

    public AbstractC1694h a() {
        return this.registry;
    }

    public void b() {
        f(AbstractC1694h.a.ON_START);
    }

    public void c() {
        f(AbstractC1694h.a.ON_CREATE);
    }

    public void d() {
        f(AbstractC1694h.a.ON_STOP);
        f(AbstractC1694h.a.ON_DESTROY);
    }

    public void e() {
        f(AbstractC1694h.a.ON_START);
    }
}
