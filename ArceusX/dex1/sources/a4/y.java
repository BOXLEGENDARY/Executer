package a4;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

final class y implements H {

    private final Executor f8341a;

    private final Object f8342b = new Object();

    private InterfaceC1568e f8343c;

    public y(Executor executor, InterfaceC1568e interfaceC1568e) {
        this.f8341a = executor;
        this.f8343c = interfaceC1568e;
    }

    @Override
    public final void b(Task task) {
        if (task.m()) {
            synchronized (this.f8342b) {
                try {
                    if (this.f8343c == null) {
                        return;
                    }
                    this.f8341a.execute(new x(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
