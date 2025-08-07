package a4;

import com.google.android.gms.tasks.Task;

final class z implements Runnable {

    final Task f8344d;

    final C1562A f8345e;

    z(C1562A c1562a, Task task) {
        this.f8345e = c1562a;
        this.f8344d = task;
    }

    @Override
    public final void run() {
        synchronized (this.f8345e.f8285b) {
            try {
                C1562A c1562a = this.f8345e;
                if (c1562a.f8286c != null) {
                    c1562a.f8286c.onComplete(this.f8344d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
