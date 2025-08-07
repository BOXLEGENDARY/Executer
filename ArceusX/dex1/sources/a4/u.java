package a4;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

final class u implements H {

    private final Executor f8332a;

    private final InterfaceC1566c f8333b;

    private final M f8334c;

    public u(Executor executor, InterfaceC1566c interfaceC1566c, M m7) {
        this.f8332a = executor;
        this.f8333b = interfaceC1566c;
        this.f8334c = m7;
    }

    @Override
    public final void b(Task task) {
        this.f8332a.execute(new t(this, task));
    }
}
