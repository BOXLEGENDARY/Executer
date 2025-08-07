package a4;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class F implements Runnable {

    final Task f8297d;

    final G f8298e;

    F(G g7, Task task) {
        this.f8298e = g7;
        this.f8297d = task;
    }

    @Override
    public final void run() {
        try {
            Task taskA = this.f8298e.f8300b.a(this.f8297d.k());
            if (taskA == null) {
                this.f8298e.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            G g7 = this.f8298e;
            Executor executor = C1575l.f8318b;
            taskA.f(executor, g7);
            taskA.d(executor, this.f8298e);
            taskA.a(executor, this.f8298e);
        } catch (C1572i e7) {
            if (e7.getCause() instanceof Exception) {
                this.f8298e.onFailure((Exception) e7.getCause());
            } else {
                this.f8298e.onFailure(e7);
            }
        } catch (CancellationException unused) {
            this.f8298e.a();
        } catch (Exception e8) {
            this.f8298e.onFailure(e8);
        }
    }
}
