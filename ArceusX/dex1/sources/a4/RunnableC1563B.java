package a4;

import com.google.android.gms.tasks.Task;
import n3.C2651i;

final class RunnableC1563B implements Runnable {

    final Task f8287d;

    final C f8288e;

    RunnableC1563B(C c2, Task task) {
        this.f8288e = c2;
        this.f8287d = task;
    }

    @Override
    public final void run() {
        synchronized (this.f8288e.f8290b) {
            try {
                C c2 = this.f8288e;
                if (c2.f8291c != null) {
                    c2.f8291c.onFailure((Exception) C2651i.l(this.f8287d.j()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
