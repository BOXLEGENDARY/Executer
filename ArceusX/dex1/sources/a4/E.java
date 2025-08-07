package a4;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

final class E implements H {

    private final Executor f8294a;

    private final Object f8295b = new Object();

    private InterfaceC1570g f8296c;

    public E(Executor executor, InterfaceC1570g interfaceC1570g) {
        this.f8294a = executor;
        this.f8296c = interfaceC1570g;
    }

    @Override
    public final void b(Task task) {
        if (task.o()) {
            synchronized (this.f8295b) {
                try {
                    if (this.f8296c == null) {
                        return;
                    }
                    this.f8294a.execute(new D(this, task));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
