package a4;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

final class v implements Runnable {

    final Task f8335d;

    final w f8336e;

    v(w wVar, Task task) {
        this.f8336e = wVar;
        this.f8335d = task;
    }

    @Override
    public final void run() {
        try {
            Task task = (Task) this.f8336e.f8338b.a(this.f8335d);
            if (task == null) {
                this.f8336e.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            w wVar = this.f8336e;
            Executor executor = C1575l.f8318b;
            task.f(executor, wVar);
            task.d(executor, this.f8336e);
            task.a(executor, this.f8336e);
        } catch (C1572i e7) {
            if (e7.getCause() instanceof Exception) {
                this.f8336e.f8339c.r((Exception) e7.getCause());
            } else {
                this.f8336e.f8339c.r(e7);
            }
        } catch (Exception e8) {
            this.f8336e.f8339c.r(e8);
        }
    }
}
