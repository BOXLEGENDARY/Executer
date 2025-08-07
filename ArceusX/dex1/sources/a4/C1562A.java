package a4;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

final class C1562A implements H {

    private final Executor f8284a;

    private final Object f8285b = new Object();

    private OnCompleteListener f8286c;

    public C1562A(Executor executor, OnCompleteListener onCompleteListener) {
        this.f8284a = executor;
        this.f8286c = onCompleteListener;
    }

    @Override
    public final void b(Task task) {
        synchronized (this.f8285b) {
            try {
                if (this.f8286c == null) {
                    return;
                }
                this.f8284a.execute(new z(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
