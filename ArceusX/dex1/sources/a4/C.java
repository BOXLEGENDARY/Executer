package a4;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

final class C implements H {

    private final Executor f8289a;

    private final Object f8290b = new Object();

    private InterfaceC1569f f8291c;

    public C(Executor executor, InterfaceC1569f interfaceC1569f) {
        this.f8289a = executor;
        this.f8291c = interfaceC1569f;
    }

    @Override
    public final void b(Task task) {
        if (task.o() || task.m()) {
            return;
        }
        synchronized (this.f8290b) {
            try {
                if (this.f8291c == null) {
                    return;
                }
                this.f8289a.execute(new RunnableC1563B(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
